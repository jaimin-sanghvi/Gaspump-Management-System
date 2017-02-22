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
public class StoreData2 extends StoreData {

    @Override
    public void StoreData() {
        float priceA = ds.getPriceTFA();    // get temporary value of parameter A
        float priceB = ds.getPriceTFB();    // get temporary value of paraemeter B
        ds.setPriceF(priceA);               // set final price of parameter A
        ds.setPriceF(priceB);               // set final price of parameter B

    }

}
