package boletin.pkg12b;

import javax.swing.JOptionPane;

public class Boletin12B {

    public static void main(String[] args) {
        // TODO code application logic here
        boolean a;
        
        Garaje garajeCastelao = new Garaje();

        do {

            if (a = garajeCastelao.comprobarPlazas()) {

                garajeCastelao.entradaVehiculo();
                garajeCastelao.salidaVehiculo();
                garajeCastelao.Factura();
            } else {
                JOptionPane.showMessageDialog(null, "ESPERA");
            }
            
        }while (a);
        
    }

}



