/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaspumpsystem.mdaefsm;

import gaspumpsystem.state.*;

/**
 *
 * @author jaiminsanghvi
 */
public class MDA_EFSM {
//array of states.

    private State[] LS = new State[]{
        new Start(), //id 0
        new S0(), //id 1
        new S1(), //id 2
        new S2(), //id 3 
        new S3(), //id 4
        new S4(), //id 5
        new S5(), //id 6
        new S6() //id 7
    };

    private State s = LS[0];

    public void active() {
        int curId = s.getID();      //get current state id

        if (curId == 0) {
            //  calls the state's active method
            s.Active();     //  call Active() method of the current start state
            switch (curId) {
                case 0:
                    s = LS[1];
                    s.setID(1);
                    System.out.println("Changed state from start to S0");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("\n Caution : You can't active pump from middle operation.");
        }
    }

    public void start() {
        int curId = s.getID();      //get current state id 
        if (curId == 1) {
            // calls the state's start method
            s.Start();      // call Start()
            switch (curId) {
                case 1:
                    s = LS[2];
                    s.setID(2);
                    System.out.println("Changed state from S0 to S1");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("\n Caution : You have to first activate the GasPump. \n");
        }
    }

    public void payCredit() {
        int curId = s.getID();  // get current state id

        if (curId == 2) {
            //  calls the state's payCredit method
            s.PayCredit();  // call payCredit()
            switch (curId) {
                case 2:
                    s = LS[3];
                    s.setID(3);
                    System.out.println("Changed state from S1 to S2");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("\n Caution : You can't PayByCredit unit you start a pump. \n");
        }
    }

    public void payCash() {
        int curId = s.getID();  // get current state id

        if (curId == 2) {
            //  calls the state's payCash method
            s.PayCash();    // call payCash()
            switch (curId) {
                case 2:
                    s = LS[4];
                    s.setID(4);
                    System.out.println("Changed state from S1 to S2");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("\n Caution : You can't PayByCash unit you start a pump. \n");
        }
    }

    public void Approved() {
        int curId = s.getID();  // get current state id

        if (curId == 3) {
            //  calls the state's approved method
            s.Approved();   // call Approved()
            switch (curId) {
                case 3:
                    s = LS[4];
                    s.setID(4);
                    System.out.println("Changed state from S2 to S4");
                    System.out.println("Credit card approved");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("\n Caution : You can't approve payment by Credit option unit you select PayCredit option. \n");
        }
    }

    public void Reject() {
        int curId = s.getID();      // get current state id

        if (curId == 3) {
            //  calls the state's reject method
            s.Reject();     // call Reject()
            switch (curId) {
                case 3:
                    s = LS[1];
                    s.setID(1);
                    System.out.println("Changed state from S2 to S0");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("\n Caution : You can't reject payment by Credit option unit you select PayCredit option. \n");
        }
    }

    public void Cancel() {
        int curId = s.getID();  // get current state id

        if (curId == 4) {
            //  calls the state's cancel method
            s.Cancel();     // call Cancel()
            switch (curId) {
                case 4:
                    s = LS[1];
                    s.setID(1);
                    System.out.println("Changed state from S3 to S0");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("\n Caution : You can't cancel the operation until you payment or card has been approved. \n");
        }
    }

    public void selectGas(int i) {
        int curId = s.getID();      // get current state id

        if (curId == 4) {
            //  calls the state's SelectGas method
            s.SelectGas(i); // call SelectGas
            switch (curId) {
                case 4:
                    s = LS[5];
                    s.setID(5);
                    System.out.println("Changed state from S3 to S4");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("\n Caution : You can't select the operation until you payment or card has been approved. \n");
        }
    }

    public void StartPump() {
        int curId = s.getID();  // get current state id

        if (curId == 5) {
            //  calls the state's start pump method
            s.StartPump();  // call StartPump()
            switch (curId) {
                case 5:
                    s = LS[6];
                    s.setID(6);
                    System.out.println("Changed state from S4 to S5");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Caution : you can't start pump without selecting a gas.");
        }
    }

    public void Pump() {
        int curId = s.getID();  // get current state id

        if (curId == 6) {
            //  calls the state's PumpGalllon method
            s.Pump();   // call Pump()
            switch (curId) {
                case 6:
                    s = LS[6];
                    s.setID(6);

                    System.out.println("Changed state from S5 to S5");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Caution : you can't pump gas without starting a pump.");
        }
    }

    public void StopPump() {
        int curId = s.getID();  // get current state id
        if (curId == 6) {
            //  calls the state's StopPump method
            s.StopPump();   // call StopPump()
            switch (curId) {
                case 6:
                    s = LS[7];
                    s.setID(7);
                    System.out.println("Changed state from S5 to S6");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Caution : you can't stop pump without stating pump.");
        }
    }

    public void Reciept() {
        int curId = s.getID();  // get current state id
        if (curId == 7) {
            //  calls the state's Receipt method
            s.Receipt();       // call Receipt
            switch (curId) {
                case 7:
                    s = LS[1];
                    s.setID(1);
                    System.out.println("Changed state from S6 to S0");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Caution : you can't print a receipt without pumping a gas.");
        }
    }

    public void NoReciept() {
        int curId = s.getID();      // get current state id
        if (curId == 7) {
            //  calls the state's NoReceipt method
            s.NoReceipt();      // call NoReceipt();
            switch (curId) {
                case 7:
                    s = LS[1];
                    s.setID(1);
                    System.out.println("Changed state from S6 to S0");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Caution : you can't print a receipt without pumping a gas.");
        }
    }

}
