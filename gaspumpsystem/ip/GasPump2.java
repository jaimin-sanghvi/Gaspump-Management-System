/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaspumpsystem.ip;

import gaspumpsystem.datastore.Data_Store;
import gaspumpsystem.factory.AbstractFactory;
import gaspumpsystem.factory.GPFactory2;
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
public class GasPump2 {

    public static AbstractFactory af = new GPFactory2();
    int userChoice = 0;
    int paymentOption = 0;
    float priceA = 0, priceB = 0;

    public void run() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        MDA_EFSM mda = new MDA_EFSM();
        Data_Store ds = af.getDataStore();
        State.setOutput(new Output(af, ds));

        //  Print GasPump-3 menu
        System.out.println("GasPump-2 : Menu Of Operations");
        System.out.println("1. Active(float a, float b)");
        System.out.println("2. Start()");
        System.out.println("3. PayCredit()");
        System.out.println("4. Reject()");
        System.out.println("5. Cancel()");
        System.out.println("6. Approved()");
        System.out.println("7. Super()");
        System.out.println("8. Regular()");
        System.out.println("9. StartPump()");
        System.out.println("10. PumpGallon()");
        System.out.println("11. StopPump()");
        System.out.println("0. Quit from the system");

        System.out.println("\n\n");

        System.out.println("Please select an operation");

        do {
            try {
                //  display list of operations
                System.out.println();
                System.out.println("GasPump-2 Execution");
                System.out.println("Select an Operation:");
                System.out.println("1-Activate,2-Start,3-PayCredit,4-Reject,5-Cancel,6-Approved,7-Super,8-Regular,9-StartPump,10-PumpGallon,11-StopPump, 0-Quit");

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
                        System.out.println("Operation : Approved()");
                        mda.Approved();
                        break;
                    case 7:
                        // Super option is selected
                        System.out.println("Operation : Super()");
                        mda.selectGas(2);
                        break;
                    case 8:
                        // Regulare gas option is selected
                        System.out.println("Operation : Regular()");
                        mda.selectGas(1);
                        break;
                    case 9:
                        // StartPump option is selected
                        System.out.println("Operation : StartPump()");
                        mda.StartPump();
                        break;
                    case 10:
                        // PumpGallon option is selected
                        System.out.println("Operation : PumpGallon()");
                        mda.Pump();
                        break;
                    case 11:
                        // StopPump option is selected
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
