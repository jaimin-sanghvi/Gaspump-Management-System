/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaspumpsystem.op;

import gaspumpsystem.datastore.Data_Store;
import gaspumpsystem.factory.AbstractFactory;

/**
 *
 * @author jaiminsanghvi
 */
public class Output {

    // Object references for action classes
    AbstractFactory af;
    Data_Store ds;
    StoreData sd;
    PayMsg pm;
    StoreCash sc;
    SetW setW;
    RejectMsg rm;
    CancelMsg cancelM;
    SetPrice sp;
    SetInitValues init;
    DispMenu dm;
    PumpGasUnit unit;
    GasPumpedMsg pumpMsg;
    StopMsg stopM;
    PrintReceipt printR;
    ReadyMsg readyM;

    public Output(AbstractFactory af, Data_Store ds) {
        this.af = af;
        this.ds = ds;
    }

    public void StoreData() {
        sd = af.getStoreData();   //    get the StoreData object from AbstractFactory 
        sd.StoreData();           //     call StoreData method of action class
        System.out.println("Your data has been stored.");
    }

    public void PayMsg() {
        pm = af.getPayMsg();       // get the PayMsg object from AbstractFactory ;
        pm.PayMsg();               // call PayMsg method of action class
    }

    public void StoreCash() {
        sc = af.getStoreCash();     // get the StoreCash object from AbstractFactory ;
        sc.StoreCash();             // call StoreCash method of action class
    }

    public void SetW(int wFlag) {
        setW = af.getSetW();         // get the SetW object from AbstractFactory ;
        setW.setW(wFlag);           // call setW method of action class
    }

    public void RejectMsg() {       // get the RejectMsg object from AbstractFactory ;
        rm = af.getRejectMsg();     // call RejectMsg method of action class
        rm.RejectMsg();
    }

    public void CancelMsg() {
        cancelM = af.getCancelMsg();    // get the Cancel object from AbstractFactory ;
        cancelM.CancelMsg();            // call CancelMsg method of action class
    }

    public void SetPrice(int g) {
        sp = af.getSetPrice();          // get the StorePrice object from AbstractFactory ;
        sp.SetPrice(g);                 // call SetPrice method of action class
    }

    public void setInitValues() {
        init = af.getSetInitValues();   // get the SetInitValues object from AbstractFactory 
        init.SetInitValues();           // call SetInitValues method of action class
    }

    public void DisplayMenu() {
        dm = af.getDisplayMenu();       // get the DisplayMenu object from AbstractFactory ;
        dm.DisplayMenu();               // call DisplayMenu method of action class
    }

    public void PumpGasUnit() {
        unit = af.getPumpGasUnit();     // get the PumpGasUnit object from AbstractFactory ;
        unit.PumpGasUnit();             // call PumpGasUnit method of action class
    }

    public void GasPumpedMsg() {
        pumpMsg = af.getGasPumpedMsg(); // get the GasPumpedMsg object from AbstractFactory ;
        pumpMsg.GasPumpedMsg();         // call GasPumpedMsg method of action class
    }

    public void StopMsg() {
        stopM = af.getStopMsg();        // get the StopMsg object from AbstractFactory ;
        stopM.StopMsg();                // call StopMsg method of action class
    }

    public void PrintReceipt() {
        printR = af.getPrintReceipt();  // get the PrintReceipt object from AbstractFactory ;
        printR.PrintReceipt();          // call PrintReceipt method of action class
    }

    public void ReadyMsg() {
        readyM = af.getReadyMsg();      // get the ReadyMsg object from AbstractFactory ;
        readyM.ReadyMsg();              // call ReadyMsg method of action class
    }
}
