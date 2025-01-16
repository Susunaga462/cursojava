public class Ifanidado{
    public static void main(String args []){
        int ope = 5;
        int num1 = 8;
        int num2 = 4;
        int resu = 0;
        
        if (ope == 1){
            resu = num1 + num2 ;
            System.out.println("El resultado de la suma es: " + resu);
        }else{
            if (ope == 2){
                resu = num1 - num2;
                System.out.println("El resultado de la resta es: " + resu);
            }else {
                if (ope == 3){
                    resu = num1 * num2;
                    System.out.println("El restulado de la multiplicacion es: " + resu);
                }else {
                    if (ope == 4){
                        resu = num1 / num2;
                        System.out.println("El resultado de la division es: " + resu);
                    }else{
                        System.out.println("La opcion escogida, no es valida");
                    }
                } 
            }

        }
    }
}