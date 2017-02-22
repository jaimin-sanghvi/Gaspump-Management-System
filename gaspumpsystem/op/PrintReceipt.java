/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaspumpsystem.op;

import gaspumpsystem.datastore.DS_GP1;
import gaspumpsystem.datastore.Data_Store;

/**
 *
 * @author jaiminsanghvi
 */
public abstract class PrintReceipt {

    protected static Data_Store ds;

    // abstract method defination for PrintReceipt action classes
    public abstract void PrintReceipt();

    public void setDataObject(Data_Store ds) {
        this.ds = ds;
    }
}
