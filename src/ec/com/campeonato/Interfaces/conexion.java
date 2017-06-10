/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.campeonato.Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Juank
 */
public class conexion {
    Connection connect;
    public Connection conectar(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
           connect= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","campeonato","campeonato123");
//           JOptionPane.showMessageDialog(null,"Conexcion Correcta");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            JOptionPane.showMessageDialog(null,"Fallo la conexion");
        }
        return connect;
    }
      
}
