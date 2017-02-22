/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaspumpsystem.ip;

import gaspumpsystem.datastore.Data_Store;
import gaspumpsystem.factory.*;
import gaspumpsystem.mdaefsm.MDA_EFSM;
import gaspumpsystem.op.Output;
import gaspumpsystem.state.State;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jaiminsanghvi
 */
public class GasPump1 {

    public static AbstractFactory af = new GPFactory1();    // create GasFactory-1 object 
    int userChoice = 0;
    int paymentOption = 0;
    int price = 0, cash = 0;

    public void run() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        MDA_EFSM mda = new MDA_EFSM();                      // create MDA_EFSM object
        Data_Store ds = af.getDataStore();                  // create Data_Store object 
        State.setOutput(new Output(af, ds));

        //  Print GasPump-1 menu
        System.out.println("GasPump-1 : Menu Of Operations");
        System.out.println("1. Active(int a)");
        System.out.println("2. Start()");
        System.out.println("3. PayCredit()");
        System.out.println("4. Reject()");
        System.out.println("5. Cancel()");
        System.out.println("6. Approved()");
        System.out.println("7. PayCash(int c)");
        System.out.println("8. StartPump()");
        System.out.println("9. PumpGallon()");
        System.out.println("10. StopPump()");
        System.out.println("0. Quit from the system");

        System.out.println("\n\n");

        System.out.println("Please select an operation");

        do {
            try {
                //  display list of operations
                System.out.println();
                System.out.println("GasPump-1 Execution");
                System.out.println("Select an Operation:");
                System.out.println("1-Activate,2-Start,3-PayCredit,4-Reject,5-Cancel,6-Approved,7-PayCash,8-StartPump,9-PumpGallon,10-StopPump, 0-Quit");

                //Get user's choice
                String selectedChoice = br.readLine();
                userChoice = Integer.parseInt(selectedChoice);

                switch (userChoice) {
                    case 1:
                        //  Activate option selected
                        System.out.println("Operation: Active(int a)");
                        System.out.println("Enter value of parameter a : ");
                        price = Integer.parseInt(br.readLine());    // read price input from user
                        if (price > 0) {
                            ds.setTempA(price);         // store temp value to data store 
                            mda.active();
                        } else {
                            System.out.println("Invalid value. Values should be greater than 0.");
                        }
                        break;
                    case 2:
                        // Start option is selected
                        System.out.println("Operation: Start()");
                        mda.start();
                        break;
                    case 3:
                        // PayCredit option is selected 
                        System.out.println("Operation : PayCredit()");
                        mda.payCredit();
                        break;
                    case 4:
                        // Reject option is selected
                        System.out.println("Operation : Reject()");
                        mda.Reject();
                        break;
                    case 5:
                        // Cancel option is selected
                        System.out.println("Operation : Cancel()");
                        mda.Cancel();
                        break;
                    case 6:
                        // Approved option is selected
                        System.out.println("Operation : Approved()");
                        mda.Approved();
                        break;
                    case 7:
                        // PayCash option is selected
                        System.out.println("Operation : PayCash(int c)");
                        System.out.println("Enter value of parameter c :");
                        cash = Integer.parseInt(br.readLine());
                        ds.setTempCash(cash);
                        mda.payCash();
                        break;
                    case 8:
                        // StartPump is selected
                        System.out.println("Operation : StartPump()");
                        mda.selectGas(1);
                        mda.StartPump();
                        break;
                    case 9:
                        // PumpGallon is selected 
                        System.out.println("Operation : PumpGallon()");
                        mda.Pump();
                        break;
                    case 10:
                        // Stop Pump is selected
                        System.out.println("Operation : StopPump()");
                        mda.StopPump();
                        mda.Reciept();
                        break;

                }
            } catch (IOException ie) {
                Logger.getLogger(GasPump1.class.getName()).log(Level.SEVERE, null, ie);
            }
        } while (userChoice != 0);

    }

}
