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
public class GasPumpedMsg1 extends GasPumpedMsg {

    @Override
    public void GasPumpedMsg() {
        int unit = ds.getQuantity();
        int price = ds.getPriceA();
        int cash = ds.getCash();
        int total;
        int w = ds.getW();

        if (w == 1) {
            total = unit * price;
            ds.setTotal(total);
            System.out.println("Total filled gas amount : " + total);
        } else if (w == 0) {
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
