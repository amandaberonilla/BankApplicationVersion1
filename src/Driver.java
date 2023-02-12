
// -----------------------------------------------------
// COMP 346 - Winter 2023
// Suha Abubakr [40120785 - Section NN]
// Amanda Beronilla [ 40228871- Section WW]
// Assignment # 1
// Due Date: February 13, 2023 at 11:59 PM
// -----------------------------------------------------


/**
 *
 * @author Kerly Titus
 */
public class Driver extends Thread{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    /**
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*******************************************************************************************************************************************
         * TODO : implement all the operations of main class   																					*
         ******************************************************************************************************************************************/
        displayMessage();
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

    public static void displayMessage(){
        System.out.println(ANSI_YELLOW + "----------------------------------------");
        System.out.println("         COMP 346 Assignment 1");
        System.out.println("     Suha Abubakr & Amanda Beronilla");
        System.out.println("----------------------------------------" + ANSI_RESET);
    }
}
