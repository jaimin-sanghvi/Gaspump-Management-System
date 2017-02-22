/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaspumpsystem.factory;

import gaspumpsystem.datastore.DS_GP1;
import gaspumpsystem.datastore.Data_Store;

import gaspumpsystem.op.*;

/**
 *
 * @author jaiminsanghvi
 */
public class GPFactory1 extends AbstractFactory {

    // action methods implementation which provide objects to GasPump-1
    @Override
    public StoreData getStoreData() {
        StoreData sd = new StoreData1();
        sd.setDataObject(new DS_GP1());
        return sd;
    }

    @Override
    public PayMsg getPayMsg() {
        flag = 1;
        PayMsg pm = new PayMsg1();
        return pm;
    }

    @Override
    public StoreCash getStoreCash() {
        StoreCash sc = new StoreCash1();
        sc.setDataObject(new DS_GP1());
        return sc;
    }

    @Override
    public DispMenu getDisplayMenu() {
        DispMenu dm = new DispMenu1();
        return dm;
    }

    @Override
    public RejectMsg getRejectMsg() {
        RejectMsg rm = new RejectMsg1();
        return rm;
    }

    @Override
    public SetW getSetW() {
        SetW setW = new SetW1();
        setW.setDataObject(new DS_GP1());
        return setW;
    }

    @Override
    public SetPrice getSetPrice() {
        SetPrice sp = new SetPrice1();
        sp.setDataObject(new DS_GP1());
        return sp;
    }

    @Override
    public ReadyMsg getReadyMsg() {
        ReadyMsg readyM = new ReadyMsg1();
        return readyM;
    }

    @Override
    public SetInitValues getSetInitValues() {
        SetInitValues init = new SetInitValues1();
        init.setDataObject(new DS_GP1());
        return init;
    }

    @Override
    public PumpGasUnit getPumpGasUnit() {
        PumpGasUnit unit = new PumpGasUnit1();
        unit.setDataObject(new DS_GP1());
        return unit;
    }

    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        GasPumpedMsg pumpMsg = new GasPumpedMsg1();
        pumpMsg.setDataObject(new DS_GP1());
        return pumpMsg;
    }

    @Override
    public StopMsg getStopMsg() {
        StopMsg stopM = new StopMsg1();
        return stopM;
    }

    @Override
    public PrintReceipt getPrintReceipt() {
        PrintReceipt printM = new PrintReceipt1();
        printM.setDataObject(new DS_GP1());
        return printM;
    }

    @Override
    public CancelMsg getCancelMsg() {
        CancelMsg cancelM = new CancelMsg1();
        return cancelM;
    }

    @Override
    public Data_Store getDataStore() {
        return new DS_GP1();
    }

}
