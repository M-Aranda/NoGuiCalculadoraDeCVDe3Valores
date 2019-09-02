/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoradecoeficientedevariacion;

import java.util.ArrayList;

/**
 *
 * @author Cheloz
 */
public class CalculadoraDeCoeficienteDeVariacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        
        

        int cantidad = lista.size();
        int suma = 0;
        int valorDeSumaDeCuadrados = 0;

        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i);

        }

        int promedio = suma / cantidad;

        for (int i = 0; i < lista.size(); i++) {

            valorDeSumaDeCuadrados = (int) Math.pow((lista.get(i) - promedio), 2);
        }

        double desviacionEstandard = Math.sqrt(valorDeSumaDeCuadrados);
        double coeficienteDeVariacion = (desviacionEstandard / promedio) * 100;

        System.out.println("El resultado es " + coeficienteDeVariacion + " %");
    }

}
