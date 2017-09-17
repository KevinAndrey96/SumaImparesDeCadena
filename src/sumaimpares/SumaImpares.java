/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaimpares;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class SumaImpares {

    /**
     * @param args the command line arguments
     */
    private static String Solicita(String m)
{
    return JOptionPane.showInputDialog(m);
}
private static void Muestra(String m)
{
    JOptionPane.showMessageDialog(null, m);
}
    public static void main(String[] args) {
        Muestra("Bienvenido");
        int N=0;//Número de digitos en cifra
        String C="";//Cifra
        int Sumatoria=0;
         do{
            N=Integer.parseInt(Solicita("Digite el número de digitos en la cifra"));
            if(N<=4)
                Muestra("Error. Por favor ingrese un valor valido");
        }while(N<=4);
          do{
              C=Solicita("Digite la cifra");
            
            if(C.length()!=N)
                Muestra("Error. Por favor ingrese un valor valido");
            
        }while(C.length()!=N);
          for(int i=0;i<N;i++)
          {              
              //Suma digitos impares
              if(C.charAt(i)%2!=0)
              {
                  Sumatoria+=Integer.parseInt(""+C.charAt(i));
                  Muestra(C.charAt(i)+" Es impar la suma es: "+Sumatoria);
              }
          }
          Muestra("La sumatoria final es: "+Sumatoria);
          
    }
    
}
