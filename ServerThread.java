
package it.itismeucci.serverthread;


import java.net.*;
import java.io.*;

public class ServerThread  extends Thread{
    
    ServerSocket server = null;
    Socket client = null; 
    String stringaRicevuta = null;
    String stringaModificata = null;
    BufferedReader inDalClient;
    DataOutputStream outVersoClient;
    
        public ServerThread(Socket socket){
            this.client = socket;
        }
        
        public void run(){
            try{
                comunica();
            }catch (Exception e){
                e.printStackTrace(System.out);
            }
        }

        public void comunica(){
            
            for(;;)
            {
                try{
                System.out.println("4 ... utente, inserisci la stringa da trasmettere al server:");
                stringaUtente = tastiera .readLine();
                //la spedisco al server
                System.out.println("5 ... invio la stringa al server e attendo ...");
                outVersoServer.writeByts( stringaUtente+'\n');
                //leggo la risposta dal server
                stringaRicevutaDalServer=inDalServer.readLine();
                System.out.println("7 ... risposta dal server " +'\n' +stringaRicevutaDalServer);
                if(stringaUtente.equals("FINE"))
                {
                    System.out.println("8 CLIENT: termina elaborazione e chiude connessione");
                    miosocket.close();
                    break;
                }
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                    System.out.println("Errore durante la connessione col server!");
                    System.exit(1);
                }
            }
            
            
            
        }
}
