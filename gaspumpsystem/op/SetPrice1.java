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
public class SetPrice1 extends SetPrice {

    @Override
    public void SetPrice(int gasType) {
        ds.setPriceA(ds.getTempA());
    }

    @Override
    public void setW(int w) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
