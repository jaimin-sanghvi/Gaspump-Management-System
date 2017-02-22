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
public class PumpGasUnit1 extends PumpGasUnit{

    @Override
    public void PumpGasUnit() {
       int w= ds.getW();
       int cash ;
       int price ;
       int unit= ds.getQuantity()+1;
       
       if(w==1){
            ds.setQuantity(unit);   // set filled gas quanity
            System.out.println("Filled Gas Quntity : " +unit);
       } else if(w==0) {
           cash= ds.getCash();      // get temporary cash value
           price=ds.getPriceA();    // get price value
           if(cash>(price*unit)) {
               ds.setQuantity(unit);    // set quantity value
               System.out.println("Filled Gas Quntity : " +unit);
            }else { 
               System.out.println("In sufficient amount to fill more gas");
            }
       }
    }
    
}
