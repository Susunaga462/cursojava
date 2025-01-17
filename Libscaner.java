import java.util.Scanner;
public class Libscaner{
    public static void main(String args []){
        Scanner indata = new Scanner (System.in);
        String nombre = "";
        int num1 = 0, num2 = 0, res = 0;

        System.out.println("Escriba su nombre: ");
        nombre = indata.nextLine();

        System.out.println("Escriba el primer valor para la suma: ");
        num1 = indata.nextInt();

        System.out.println("Escriba el segundo valor para la suma: ");
        num2 = indata.nextInt();

        res = num1 + num2;

        System.out.println("Hola " + nombre + " el resultado de la suma es: " + res);
    }
}