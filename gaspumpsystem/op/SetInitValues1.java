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
public class SetInitValues1 extends SetInitValues {

    @Override
    public void SetInitValues() {
        ds.setQuantity(0);
        ds.setTotal(0);
        System.out.println("Init Values : " + ds.getQuantity() + " " + ds.getTotal());
    }

}
