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
public class PayMsg1 extends PayMsg{

    
    @Override
    public void PayMsg() {
        if (AbstractFactory.flag == 1) {
            System.out.println("Payment Option : ");
            System.out.println("1. PayByCash");
            System.out.println("2. PayByCredit");
        } else if(AbstractFactory.flag==2) {
            System.out.println("Payment Option : ");
            System.out.println("1. PayByCredit");
        } else if(AbstractFactory.flag==3) {
            System.out.println("Payment Option : ");
            System.out.println("1. PayByCash");
        }
    }
    
}
