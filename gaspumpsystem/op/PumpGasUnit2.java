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
public class PumpGasUnit2 extends PumpGasUnit {

    @Override
    public void PumpGasUnit() {
        int w = ds.getW();
        float cash;
        float price;
        int unit = ds.getQuantity() + 1;

        if (w == 0) {
            cash = ds.getCashF();
            price = ds.getPriceF();
            if (cash > (price * unit)) {
                ds.setQuantity(unit);
                System.out.println("Filled Gas Quntity : " + unit);
            } else {
                System.out.println("In sufficient amount to fill more gas");
            }
        }
    }

}
