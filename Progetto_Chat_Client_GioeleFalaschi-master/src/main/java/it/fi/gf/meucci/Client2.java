package it.fi.gf.meucci;
import java.net.Socket;
import java.io.*;
import java.net.*;

public class Client2 {
    String nomeServer = "Server Incredibile";
    int portaServer = 7777;
    DataInputStream in;
    DataOutputStream out;

    protected Socket connetti()throws IOException
    {
        Socket socket = new Socket (nomeServer, portaServer);
        out = new DataOutputStream(socket.getOutputStream());
        in = new DataInputStream(socket.getInputStream());
        return socket;
    }

}
    

