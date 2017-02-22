/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaspumpsystem.ip;

import gaspumpsystem.datastore.Data_Store;
import gaspumpsystem.factory.AbstractFactory;
import gaspumpsystem.factory.GPFactory2;
import gaspumpsystem.factory.GPFactory3;
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
public class GasPump3 {

    public static AbstractFactory af = new GPFactory3();
    int userChoice = 0;
    int paymentOption = 0;
    float priceA = 0, priceB = 0;
    float cash = 0;

    public void run() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        MDA_EFSM mda = new MDA_EFSM();
        Data_Store ds = af.getDataStore();
        State.setOutput(new Output(af, ds));

        //  Print GasPump-3 menu
        System.out.println("GasPump-3 : Menu Of Operations");
        System.out.println("1. Active(float a, float b)");
        System.out.println("2. Start()");
        System.out.println("3. PayCash(float c)");
        System.out.println("4. Cancel()");
        System.out.println("5. Premium()");
        System.out.println("6. Regular()");
        System.out.println("7. StartPump()");
        System.out.println("8. PumpLiter()");
        System.out.println("9. StartPump()");
        System.out.println("10. Reciept()");
        System.out.println("11. NoReceipt()");
        System.out.println("0. Quit from the system");

        System.out.println("\n\n");

        System.out.println("Please select an operation");

        do {
            try {
                //  display list of operations
                System.out.println();
                System.out.println("GasPump-3 Execution");
                System.out.println("Select an Operation:");
                System.out.println("1-Activate,2-Start,3-PayCash(float c),4-Cancel,5-Premium,6-Regular,7-StartPump,8-PumpLiter,9-StopPump,10-Receipt,11-NoReciept, 0-Quit");

                //Get user's choice
                userChoice = Integer.parseInt(br.readLine());

                switch (userChoice) {
                    case 1:
                        //  Activate option selected
                        System.out.println("Operation: Active(float a, float b)");
                        System.out.println("Enter value of parameter a : ");
                        priceA = Float.parseFloat(br.readLine());
                        System.out.println("Enter value of parameter b : ");
                        priceB = Float.parseFloat(br.readLine());
                        if (priceA > 0 && priceB > 0) {
                            ds.setPriceTFA(priceA);
                            ds.setPriceTFB(priceB);
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
                        // PayCash option is selected
                        System.out.println("Operation : PayCash(float c)");
                        System.out.println("Enter value of parameter c :");
                        cash = Float.parseFloat(br.readLine());
                        ds.setCashTF(cash);
                        mda.payCash();
                        break;
                    case 4:
                        // Cancel option is selected 
                        System.out.println("Operation : Cancel()");
                        mda.Cancel();
                        break;
                    case 5:
                        // Premium option is selected 
                        System.out.println("Operation : Premium()");
                        mda.selectGas(2);
                        break;
                    case 6:
                        // Regular option is selected 
                        System.out.println("Operation : Regular()");
                        mda.selectGas(1);
                        break;
                    case 7:
                        // Start pump
                        System.out.println("Operation : StartPump()");
                        mda.StartPump();
                        break;
                    case 8:
                        // Fill gas in liter unit 
                        System.out.println("Operation : PumpLiter()");
                        mda.Pump();
                        break;
                    case 9:
                        // StopPump
                        System.out.println("Operation : StopPump()");
                        mda.StopPump();
                        break;
                    case 10:
                        // Print receipt with number of liiter gas and total price
                        System.out.println("Operation : Receipt()");
                        mda.Reciept();
                        break;
                    case 11:
                        // Not print a receipt
                        System.out.println("Operation : NoReceipt()");
                        break;

                }
            } catch (IOException ie) {
                Logger.getLogger(GasPump1.class.getName()).log(Level.SEVERE, null, ie);
            }
        } while (userChoice != 0);
    }

}
