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
public class DispMenu1 extends DispMenu{
    @Override
    public void DisplayMenu() {
        if(AbstractFactory.flag==1) {
            System.out.println("Type of Gas Available : Regular");
        } else if(AbstractFactory.flag==2) {
            System.out.println("Type of Gas Available : \n1. Regular\n2. Super");
        } else if(AbstractFactory.flag==3) {
            System.out.println("Type of Gas Available : \n1. Regular\n2. Premium");
        }
    }
}
