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
public class StoreData1 extends StoreData {

    @Override
    public void StoreData() {
        int priceA = ds.getTempA(); // get temporary price
        ds.setPriceA(priceA);       // set temporary price
    }

}
