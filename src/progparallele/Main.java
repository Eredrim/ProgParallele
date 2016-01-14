/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progparallele;

import org.apache.commons.net.ftp.FTP;

import java.io.IOException;
import java.net.SocketException;

/**
 *
 * @author Gilles
 */
public class Main {

    public static final String hostname = "speedtest.tele2.net";
    public static final int port = 21;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testFTPChunks();
    }

    public static void testFTPChunks() {
        FTP ftp = new FTP();
        try {
            ftp.connect(hostname, port);
            int reply = ftp.getReplyCode();
            if(reply != 220) {
                ftp.disconnect();
                return;
            }

            ftp.user("anonymous");
            ftp.pass("");

            ftp.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
