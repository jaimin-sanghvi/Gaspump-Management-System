/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaspumpsystem.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import gaspumpsystem.ip.*;

/**
 *
 * @author jaiminsanghvi
 */
public class Main {
//GasPump Objects created

    GasPump1 objGp1;
    GasPump2 objGP2;
    GasPump3 objGP3;

    int selectedPump = 0;

    private Main() {
        try {

            // Open input stream to read data from console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //Display program header
            System.out.println("CS-586 Final Project\nby Jaimin Sanghvi\nCWID: A20344798\nTerm : Spring 2015");
            System.out.println("\n");

            do {
                System.out.println("*** Select GasPump ***\n----------------------");
                System.out.println("1. GasPump-1\n2. GasPump-2\n3. GasPump-3\n");

                //Choose a GasPump
                System.out.println("Choose GasPump:");

                //Store user's selection
                selectedPump = Integer.parseInt(br.readLine());
                switch (selectedPump) {
                    case 1:
                        //  if GasPump-1 is selected, go to GasPump-1
                        System.out.println("GasPump-1 is selected");
                        objGp1 = new GasPump1();         //Create GasPump-1 object
                        objGp1.run();                 //Start working in GasPump-1
                        break;
                    case 2:
                        //  if GasPump-2 is selected, go to GasPump-2
                        System.out.println("GasPump-2 is selected");
                        objGP2 = new GasPump2();          //Create GasPump-2 object
                        objGP2.run();                 //Start working in GasPump-2
                        break;
                    case 3:
                        //if GasPump-3 is selected, go to GasPump-3
                        System.out.println("\tGasPump-3 is selected");
                        objGP3 = new GasPump3();         //Create GasPump-3 object
                        objGP3.run();                  //Start working in GasPump-3
                        break;

                    default:
                        System.out.println("Please choose correct GasPump");
                }
            } while (selectedPump < 1 || selectedPump > 4); // check wether user have select gaspump from 1,2,3
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("\n IO exception in Main Class : " + ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main objGas = new Main(); // 
    }
}
