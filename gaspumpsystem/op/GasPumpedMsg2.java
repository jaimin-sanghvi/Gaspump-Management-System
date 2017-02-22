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
public class GasPumpedMsg2 extends GasPumpedMsg {

    @Override
    public void GasPumpedMsg() {

        int unit = ds.getQuantity();
        float price = ds.getPriceF();
        float cash = 0;
        float total;
        int w = ds.getW();
        if (w == 1) {
            total = unit * price;
            ds.setTotal(total);
            System.out.println("Total filled gas amount : " + total);
        } else if (w == 0) {
            cash = ds.getCashF();
            if (cash > (price * unit)) {
                total = unit * price;
                ds.setTotal(total);
                System.out.println("Total filled gas amount : " + total);
            } else {
                System.out.println("In sufficient amount");
            }
        }
    }

}
