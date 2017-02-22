/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaspumpsystem.op;

import gaspumpsystem.datastore.Data_Store;

/**
 *
 * @author jaiminsanghvi
 */
public abstract class StoreCash {

    protected static Data_Store ds;

    // abstract method defination for StoreCash action classes
    public abstract void StoreCash();

    public void setDataObject(Data_Store x) {
        ds = x;
    }
}
