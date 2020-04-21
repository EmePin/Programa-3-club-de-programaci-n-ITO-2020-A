# Programa-3-clubProgramacion-ITO-2020-A
Realice el método que te permita obtener la diferencia entre 2 números introducidos por la misma línea y separados únicamente por un espacio. Restricciones: Usar solo el método length() y charAt() de String.  Entrada: 100 200 Salida: 100  Entrada: 16 12 Salida: 4
  
TÍTULO DEL PROYECTO: Problema3

PROPÓSITO DEL PROYECTO: Reforzar la lógica 

VERSIÓN o FECHA: 19/04/2020

CÓMO INICIAR ESTE PROYECTO: se crea un objeto, se usa el método String Diferencia(String numero) y posterior a eso se ndroduce entre paréntesis los números separados por un espacio.

AUTORES: PINEDA NIVÓN AIMÉE JAHDAÍ 19161382

Explicación de cómo hice el programa :

Primero al decir el enunciado 

              2 números introducidos por la misma línea y separados únicamente por un espacio

esto me dice que 
1)el numero que se va a ingresar debe ser tipo String (por el espacio)

                public String Diferencia(String numero){
                
                }

2) la manera en que vo a identificar que acaba un número y empieza otro es por el espacio eso lo haremos con un ciclo for para que vaya viendo uno por uno los caracteres y dentro del for se me ocurrió que debían haber tres if uno que identificara si habia un espacio o no, otro que no pasara el espacio a int para hacer la resta porque eso me generaría erroress y el tercero que fuera uniendo los digitos del primer número y en su else que concatenara los del segundo número logrando de esta manera separarlos.
3) para hacer la resta como me lo dan en String tengo que pasarlo a int 

                  (Integer.parseInt(num1)) - (Integer.parseInt(num2))
4) la diferencia debe estar en valores unicamente positivos

                         Math.abs(dif) 

