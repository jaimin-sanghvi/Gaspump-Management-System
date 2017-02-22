/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaspumpsystem.op;

/**
 *
 * @author jaiminsanghvi
 */
public class ReadyMsg1 extends ReadyMsg {

    @Override
    public void ReadyMsg() {
        System.out.println("Pump is ready for pumping a gas."); // print ready message
    }
}
