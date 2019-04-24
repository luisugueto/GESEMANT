/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gesemant;

/**
 *
 * @author Luis Ugueto
 * ugueto.luis19@gmail.com
 */
public class GESEMANT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login login = new Login();
        login.show();
        //VentanaInicial ventana = new VentanaInicial();
        //ventana.show();
    }
    
    private void imprimirExcepcion(Exception e) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.out.println();
    }
    
}
