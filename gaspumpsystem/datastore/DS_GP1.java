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
public class DS_GP1 extends Data_Store {

    private static int priceA;
    private static int tempPrice, tempCash;
    private static int cash;
    private static int w;
    private static int quantity;
    private static float total;

    @Override
    public void setPriceA(int a) {  // set price of A 
        DS_GP1.priceA = a;
    }

    @Override
    public int getPriceA() {        // get price of A
        return priceA;
    }

    @Override
    public void setCash(int c) {    // set cash 
        DS_GP1.cash = c;
    }

    @Override
    public int getCash() {          // get cash
        return cash;
    }

    @Override
    public void setTempA(int tempPrice) {   // set temporary price value
        this.tempPrice = tempPrice;
    }

    @Override
    public int getTempA() {                 // get temporary price value
        return tempPrice;
    }

    @Override
    public void setCashF(float c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getCashF() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTempCash(int c) {    // set temp cash value
        DS_GP1.tempCash = c;
    }

    @Override
    public int getTempCash() {          // get temp cash value
        return tempCash;
    }

    @Override
    public void setW(int w) {           // set value of W
        DS_GP1.w = w;
    }

    @Override
    public int getW() {                 // get value of W
        return w;
    }

    @Override
    public void setQuantity(int q) {    // set filled gas quantity
        DS_GP1.quantity = q;
    }

    @Override
    public int getQuantity() {          // get fiiled gas quantity
        return quantity;
    }

    @Override
    public void setTotal(float total) { // set total amount of filled gas
        DS_GP1.total = total;
    }

    @Override
    public float getTotal() {           // get total amount of filled gas
        return total;
    }

    @Override
    public void setPriceTFA(float a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getPriceTFA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPriceTFB(float b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getPriceTFB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPriceF(float a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getPriceF() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCashTF(float c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getCashTF() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
