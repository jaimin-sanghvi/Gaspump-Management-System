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
public class StoreCash2 extends StoreCash {

    @Override
    public void StoreCash() {
        if (ds != null) {
            float cash = ds.getCashTF();
            ds.setCashF(cash);
            System.out.println("cash stored==" + cash);
        }
    }

}
