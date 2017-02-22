/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaspumpsystem.state;

import gaspumpsystem.op.Output;

/**
 *
 * @author jaiminsanghvi
 */
public abstract class State {

    private int id;
    protected static Output op;

    public abstract void Active();

    public abstract void Start();

    public abstract void PayCredit();

    public abstract void PayCash();

    public abstract void Approved();

    public abstract void Reject();

    public abstract void SelectGas(int g);

    public abstract void Cancel();

    public abstract void StartPump();

    public abstract void Pump();

    public abstract void StopPump();

    public abstract void Receipt();

    public abstract void NoReceipt();

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public static void setOutput(Output op) {
        State.op = op;
    }
}
