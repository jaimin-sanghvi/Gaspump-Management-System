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
public abstract class SetW {

    // abstract method defination for SetW action classes
    public abstract void setW(int w);

    protected Data_Store ds;

    public void setDataObject(Data_Store x) {
        ds = x;
    }
}
