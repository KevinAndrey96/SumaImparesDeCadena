/*
Escriba un programa en lenguaje java partiendo de su algoritmo, en donde un usuario ingresa un entero N mayor o igual a 4, seguido una cifra C entera de la misma cantidad de dígitos de N. Por ejemplo, si N es igual a 4, una cifra C puede ser 5674 (asuma que la cantidad de dígitos de la cifra C es igual a N como una precondición del problema).

El programa debe identificar solo con el uso de funciones y condicionales la suma de los valores de los dígitos impares. 

 */
package sumaimpares;

import javax.swing.JOptionPane;

public class SumaImpares {

    private static String Solicita(String m) {
        return JOptionPane.showInputDialog(m);
    }

    private static void Muestra(String m) {
        JOptionPane.showMessageDialog(null, m);
    }

    public static void main(String[] args) {
        Muestra("Bienvenido");
        int N = 0;//Número de digitos en cifra
        String C = "";//Cifra
        int Sumatoria = 0;
        do {
            N = Integer.parseInt(Solicita("Digite el número de digitos en la cifra"));
            if (N <= 4) {
                Muestra("Error. Por favor ingrese un valor valido");
            }
        } while (N <= 4);
        do {
            C = Solicita("Digite la cifra");

            if (C.length() != N) {
                Muestra("Error. Por favor ingrese un valor valido");
            }

        } while (C.length() != N);
        for (int i = 0; i < N; i++) {
            //Suma digitos impares
            if (C.charAt(i) % 2 != 0) {
                Sumatoria += Integer.parseInt("" + C.charAt(i));
                Muestra(C.charAt(i) + " Es impar la suma es: " + Sumatoria);
            }
        }
        Muestra("La sumatoria final es: " + Sumatoria);

    }

}
