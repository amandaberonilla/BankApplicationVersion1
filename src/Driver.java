
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class Driver extends Thread{

    /**
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*******************************************************************************************************************************************
         * TODO : implement all the operations of main class   																					*
         ******************************************************************************************************************************************/

        Network objNetwork = new Network("network");            /* Activate the network */
        Thread thNetwork = new Thread(objNetwork);
        thNetwork.start();
        Server objServer = new Server();
        Thread thServer = new Thread(objServer);
        /* Complete here the code for the main method ...*/
        thServer.start();
        Client objClient1 = new Client("sending");
        Thread thClient1 = new Thread(objClient1);
        thClient1.start();
        Client objClient2 = new Client("receiving");
        Thread thClient2 = new Thread(objClient2);
        thClient2.start();


    }
}
