
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christo
 */
//implements Interface
public class Server implements ConnectInterface{
    
    public static void main(String[] args) throws Exception{
        try {
            //Create object of class
            ConnectionImplement connImpl = new ConnectionImplement();
            //Create interface stub
            ConnectInterface stub = (ConnectInterface) UnicastRemoteObject.exportObject((Remote) connImpl, 0);
            //Registry for port, client can connect on
            Registry reg = LocateRegistry.createRegistry(1099);
            //bind the registry
            reg.bind("ConnectInterface", (Remote) stub);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void insert(String ID, String name, String surname, String age, String cellnumber, String degree) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
