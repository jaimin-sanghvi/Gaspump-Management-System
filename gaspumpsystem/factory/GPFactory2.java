/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaspumpsystem.factory;

import gaspumpsystem.datastore.DS_GP2;
import gaspumpsystem.datastore.Data_Store;
import gaspumpsystem.op.CancelMsg;
import gaspumpsystem.op.CancelMsg1;
import gaspumpsystem.op.DispMenu;
import gaspumpsystem.op.DispMenu1;

import gaspumpsystem.op.GasPumpedMsg;

import gaspumpsystem.op.GasPumpedMsg2;
import gaspumpsystem.op.PayMsg;
import gaspumpsystem.op.PayMsg1;
import gaspumpsystem.op.PrintReceipt;
import gaspumpsystem.op.PrintReceipt1;
import gaspumpsystem.op.PumpGasUnit;
import gaspumpsystem.op.PumpGasUnit1;
import gaspumpsystem.op.ReadyMsg;
import gaspumpsystem.op.ReadyMsg1;
import gaspumpsystem.op.RejectMsg;
import gaspumpsystem.op.RejectMsg1;
import gaspumpsystem.op.SetInitValues;
import gaspumpsystem.op.SetInitValues1;
import gaspumpsystem.op.SetPrice;
import gaspumpsystem.op.SetPrice2;
import gaspumpsystem.op.SetW;
import gaspumpsystem.op.SetW1;
import gaspumpsystem.op.StopMsg;
import gaspumpsystem.op.StopMsg1;
import gaspumpsystem.op.StoreCash;
import gaspumpsystem.op.StoreData;
import gaspumpsystem.op.StoreData2;

/**
 *
 * @author jaiminsanghvi
 */
public class GPFactory2 extends AbstractFactory {

    // action methods implementation which provide objects to GasPump-2
    @Override
    public StoreData getStoreData() {
        StoreData sd = new StoreData2();
        sd.setDataObject(new DS_GP2());
        return sd;
    }

    @Override
    public PayMsg getPayMsg() {
        flag = 2;
        PayMsg pm = new PayMsg1();
        return pm;
    }

    @Override
    public StoreCash getStoreCash() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        setW.setDataObject(new DS_GP2());
        return setW;
    }

    @Override
    public SetPrice getSetPrice() {
        SetPrice sp = new SetPrice2();
        sp.setDataObject(new DS_GP2());
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
        init.setDataObject(new DS_GP2());
        return init;
    }

    @Override
    public PumpGasUnit getPumpGasUnit() {
        PumpGasUnit unit = new PumpGasUnit1();
        unit.setDataObject(new DS_GP2());
        return unit;
    }

    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        GasPumpedMsg pumpMsg = new GasPumpedMsg2();
        pumpMsg.setDataObject(new DS_GP2());
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
        printM.setDataObject(new DS_GP2());
        return printM;
    }

    @Override
    public CancelMsg getCancelMsg() {
        CancelMsg cancelM = new CancelMsg1();
        return cancelM;
    }

    @Override
    public Data_Store getDataStore() {
        return new DS_GP2();
    }

}
