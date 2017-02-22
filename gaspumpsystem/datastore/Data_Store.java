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
public abstract class Data_Store {

    // defination of setter and getter methods for datastore class
    // setter and getter methods of gasPrice and cash for GasPump-1
    public abstract void setPriceA(int a);

    public abstract int getPriceA();

    public abstract void setTempA(int a);

    public abstract int getTempA();

    public abstract void setTempCash(int c);

    public abstract int getTempCash();

    public abstract void setCash(int c);

    public abstract int getCash();

    //set prices of gas and cash mehods for GasPump-2 and GasPump-3
    public abstract void setPriceTFA(float a);

    public abstract float getPriceTFA();

    public abstract void setPriceTFB(float b);

    public abstract float getPriceTFB();

    public abstract void setPriceF(float a);

    public abstract float getPriceF();

    public abstract void setCashF(float c);

    public abstract float getCashF();

    public abstract void setCashTF(float c);

    public abstract float getCashTF();

    //setter and getter methods defination of W, Quantity and Total of Filled Gas
    public abstract void setW(int w);

    public abstract int getW();

    public abstract void setQuantity(int q);

    public abstract int getQuantity();

    public abstract void setTotal(float total);

    public abstract float getTotal();
}
