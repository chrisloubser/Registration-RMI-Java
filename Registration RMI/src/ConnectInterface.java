
import java.rmi.Remote;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christo
 */
//create interface class and extends Remote
public interface ConnectInterface extends Remote{
    //Create insert arguments
    public void insert(String ID,String name, String surname,
            String age, String cellnumber, String degree) throws Exception;
}
