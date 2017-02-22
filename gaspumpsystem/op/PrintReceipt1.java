/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaspumpsystem.op;

import gaspumpsystem.factory.AbstractFactory;

/**
 *
 * @author jaiminsanghvi
 */
public class PrintReceipt1 extends PrintReceipt {

    @Override
    public void PrintReceipt() {

        float total = ds.getTotal();    // get total gas value
        if (AbstractFactory.flag == 1 || AbstractFactory.flag == 2) {
            System.out.println("\n\t****** RECEIPT ********");
            System.out.println("\tTotal Filled Gas Amount = " + total);
            System.out.println("\tGood Bye. Have a nice day !!!");
        } else if (AbstractFactory.flag == 3) {
            int quant = ds.getQuantity();
            System.out.println("\n\t****** RECEIPT ********");
            System.out.println("\tFilled Gas Quantity = " + quant);
            System.out.println("\tTotal Filled Gas Amount = " + total);
            System.out.println("\tGood Bye. Have a nice day !!!");
        }

    }

}
