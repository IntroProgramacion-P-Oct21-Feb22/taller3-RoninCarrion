/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author ronni
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Resolver el siguiente ejercicio
        int var1 = 25;
        int var2 = 10;
        int var3 = 100;
        int var4 = 5;
        int var5 = 2;
        boolean var6 = true;
        boolean var7 = false;

        boolean resultado = (((Math.sqrt(var1)) * var2)>= var3) && (var6) || 
                (var7) || ((var2 / var4) >= var5);
        System.out.println(resultado);

    }

}
