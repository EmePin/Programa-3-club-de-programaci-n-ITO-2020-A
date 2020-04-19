
/**
 * Description of class aimee here.
 * Realice el método que te permita obtener la diferencia entre 2 números introducidos 
 * por la misma línea y separados únicamente por un espacio. 
 * Restricciones: Usar solo el método length() y charAt() de String. 
 * Entrada: 100 200 Salida: 100 Entrada: 16 12 Salida: 4
 * 
 * @author (Aimée Jahdaí Pineda Nivón 19161382:) 
 * @version (18/04/2020)
 */
public class NSResta
{
    public String Diferencia(String numero)
    {// se ejecuta el método
        // se inicializan las variables globales
        String num1 = "";// variable que guarda el valor del primer numero ingresado
        String num2 = "";// variable que guarda el valor del segundo numero ingresado
        int dif = 0;// variable que se ocupa para guardar el valor de la resta
        boolean espacio = false;// variable tipo booleano que guarda si hay un espacio o no; esto con el fin de ver si ya es el otro número o sigue siendo el mismo
        
        for(int i = 0; i < numero.length(); i++)
        {// inicio del for 
            if(numero.charAt(i) == ' ')// inicio del primer if que busca el espacio que diferencía los números
                espacio = true;// fin del primer if
            //
            if(numero.charAt(i) != ' '){// inicio del segundo if que evita que se mezcle el espacio, porque no tiene valor y no se pasa a int.( Genera errores)
                if(espacio == false)// inicio del tercer if que concatena todos los dígitos del primer número, y el else los del segundo
                    num1 += numero.charAt(i);// fin del tercer if
                else// inicio del else
                    num2 += numero.charAt(i);// fin dle else
            }// fin del segundo if 
       
        }// fin del for
        
        dif = (Integer.parseInt(num1)) - (Integer.parseInt(num2));//se realiza la resta para obtener la diferencia (recordad xd que lo pedimos en String y df está en int así que debemos realizar el cambio
        
        String diferencia = Math.abs(dif) + "";// se aplica  el valor absoluto con el métdodo .abs() de la clase Math que tiene como argumento nuestra variable dif
        return diferencia;// devolvemos el resultado de la diferencia en tipo String sto como tal no lo dice el enunciado pero weno xd
    }// fin del método
}// fin de la clase