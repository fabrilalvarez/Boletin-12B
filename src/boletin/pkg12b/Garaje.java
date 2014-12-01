package boletin.pkg12b;

import javax.swing.JOptionPane;

public class Garaje {

    static int plaza = 0;
    private String matricula;
    private double precioT, tiempo_T;

    public Garaje() {

    }

    public boolean comprobarPlazas() {

        if (plaza < 3) {
            JOptionPane.showMessageDialog(null, "LIBRE");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "LLENO");
            return false;
        }
        
    }

    public double entradaVehiculo() {

        this.matricula = JOptionPane.showInputDialog("Matricula Vehiculo");
        plaza++;
        long entrada = System.currentTimeMillis();

        return entrada;

    }

    public double salidaVehiculo() {
        plaza--;
        long salida = System.currentTimeMillis();

        return salida;
    }

    public double estacionamientoVehiculo() {

        double eVehiculo = entradaVehiculo(),
                sVehiculo = salidaVehiculo();

        tiempo_T = (sVehiculo - eVehiculo) / 1000;

        //segundos
        return tiempo_T;
    }

    public double calculoFactura() {

        // primeros tres segundos. 0.40€
        // resto del tiempo. 0.20€
        precioT = (((estacionamientoVehiculo()) / 3) - 1) * 0.20f + 0.40f;

        return precioT;
    }

    public void Factura() {
        //minutos + tiempo_T / 60 + " minutos
        JOptionPane.showMessageDialog(null, "Su vehiculo: " + matricula + " ha permanecido "
                + tiempo_T + " segundos \n El precio a pagar es de: " + calculoFactura());

        JOptionPane.showMessageDialog(null, "GRACIAS POR USAR O NOSO APARCADOIRO");

    }

}
