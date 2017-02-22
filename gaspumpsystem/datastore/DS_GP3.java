/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaspumpsystem.datastore;

/**
 *
 * @author jaiminsanghvi
 */
public class DS_GP3 extends Data_Store {

    private static float priceTFA;
    private static float priceTFB;
    private static float priceF;
    private static float cashF;
    private static float cashTF;
    private static int w;
    private static int quantity;
    private static float total;

    @Override
    public void setPriceA(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPriceA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCash(int c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCash() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCashF(float c) {     // set cash value for pump-3
        this.cashF = c;
    }

    @Override
    public float getCashF() {           // get cash value for pump-3
        return cashF;
    }

    @Override
    public void setTempA(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTempA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTempCash(int c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTempCash() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setW(int w) {           // set value of w for different payment method
        this.w = w;
    }

    @Override
    public int getW() {                 // get value of w for different payment method
        return w;
    }

    @Override
    public void setQuantity(int q) {    // set quantity of filled gas
        this.quantity = q;
    }

    @Override
    public int getQuantity() {          // get quantity of filled gas
        return quantity;
    }

    @Override
    public void setTotal(float total) { // set total amount of filled gas
        DS_GP3.total = total;
    }

    @Override
    public float getTotal() {           // get total amount of filled gas
        return total;
    }

    @Override
    public void setPriceTFA(float a) {      // set temp price of regular gas
        this.priceTFA = a;
    }

    @Override
    public float getPriceTFA() {        // get temp price of regular gas
        return priceTFA;
    }

    @Override
    public void setPriceTFB(float b) {  // set temp price of premium gas
        this.priceTFB = b;
    }

    @Override
    public float getPriceTFB() {        // get temp price of premium gas
        return priceTFB;
    }

    @Override
    public void setPriceF(float a) {        // set final price of gas
        this.priceF = a;
    }

    @Override
    public float getPriceF() {              // get final price of gas 
        return priceF;
    }

    @Override
    public void setCashTF(float c) {        // set temporary cash value 
        this.cashTF = c;
    }

    @Override
    public float getCashTF() {              // get temporary cash value
        return cashTF;
    }

}
