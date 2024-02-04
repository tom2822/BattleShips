/***
 * Server.java Created: 02/02/2024
 * JDK-11.0.12.7
 * By: https://github.com/tom2822
 ***/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server implements Runnable{

    private static final Logger logger = Logger.getLogger(Server.class.getName());

    @Override
    public void run() {
        try {
            ServerSocket serv = new ServerSocket(9999);
        } catch (IOException e) {
            logger.log(Level.SEVERE ,e.toString(), e);
        }
    }

    class ConnectionHandler implements Runnable {

        private Socket client;
        private BufferedReader reader;
        private PrintWriter printer;

        public ConnectionHandler(Socket client){
            this.client = client;
        }

        @Override
        public void run() {
            try {
                reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
                printer = new PrintWriter(client.getOutputStream(), true);
            } catch (IOException e) {
                logger.log(Level.SEVERE ,e.toString(), e);
                // connection lost?
            }
        }
    }
}
