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
public class RejectMsg1 extends RejectMsg{
    @Override
    public void RejectMsg() {
        System.out.println("Credit card not approved.");    // print rejection message
    }
}
