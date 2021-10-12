
package it.itismeucci.serverthread;


public class App {

    
    public static void main (String[] args){
            MultiServer tcpServer = new ServerThread.MultiServer();
            tcpServer.start();
        }
    
}
