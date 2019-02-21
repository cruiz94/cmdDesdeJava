/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmddesdejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class CmdDesdeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String usuario="whoami";
        Process p = Runtime.getRuntime().exec(usuario);
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String resultado=stdInput.readLine();
        if(resultado.equals("root")){
            JOptionPane.showMessageDialog(null,"Usuario root puedes continuar");
            Usuario opciones= new Usuario();
            opciones.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"lo sentimos cambia de sesión a usuario root para continuar");
            System.exit(0);
        }
    }
        // TODO code application logic here
}
    

