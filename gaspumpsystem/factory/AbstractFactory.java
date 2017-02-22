/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaspumpsystem.factory;

import gaspumpsystem.datastore.Data_Store;
import gaspumpsystem.op.*;

/**
 *
 * @author jaiminsanghvi
 */
public abstract class AbstractFactory {

    // data store and action class methods defination for all concrete classes
    public static int flag;

    public abstract Data_Store getDataStore();

    public abstract StoreData getStoreData();

    public abstract PayMsg getPayMsg();

    public abstract StoreCash getStoreCash();

    public abstract DispMenu getDisplayMenu();

    public abstract RejectMsg getRejectMsg();

    public abstract SetW getSetW();

    public abstract SetPrice getSetPrice();

    public abstract ReadyMsg getReadyMsg();

    public abstract SetInitValues getSetInitValues();

    public abstract PumpGasUnit getPumpGasUnit();

    public abstract GasPumpedMsg getGasPumpedMsg();

    public abstract StopMsg getStopMsg();

    public abstract PrintReceipt getPrintReceipt();

    public abstract CancelMsg getCancelMsg();
}
