import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mostrarParesAdyacentes(generarArreglo(10));
    }
   public static int[] generarArreglo(int n){
            int[] arrAdyacente = new int[n];
            for (int i = 0; i<arrAdyacente.length;i++){
                arrAdyacente[i]=genaradorRandom(-1000,1000);
            }
            return arrAdyacente;
    }

    public static int genaradorRandom(int max, int min){
        Random rand = new Random();
        int numRandom = (int)(Math.random()*(max-min+1)+min);
        return numRandom;
    }


    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");               //muestra las opciones posibles
        System.out.println("Ingrese una opción:");
        System.out.println("[1] Mostrar pares adyacentes.");
        System.out.println("[2] Mostrar el mayor valor de producto.");
        System.out.println("[0] Salir");
        System.out.println("--------------------------------------------------");
    }
    public static void opcionMenu() {
        Scanner tecla = new Scanner(System.in);
        int aux = 0;
        while (aux == 0) {
            mostrarMenu();                                                                      //llama a la opcion mostrarmenu
            String opcion = tecla.next();                                                       //se ingresa la opcion, se utiliza String, para asi evitar que se caiga el programa y poder manejar los errores.
            switch (opcion) {
                case "1":
                    break;
                case "2":
                    break;
                case "0":
                    aux = 1;
                    break;
                default:
                    System.err.println("opcion ingresada no valida");
            }
        }
    }

    public static void mostrarParesAdyacentes(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            System.out.print("["+ arr[i-1] +" , "+ (arr[i])+"]; ");
        }

    }

    public static int mayorProductoAdyacentes(int[] arr) {
        int mayorProducto = 0;
        for (int i = 1; i < arr.length; i++) {
            int producto = arr[i-1]*arr[i];
            if (producto>mayorProducto){
                mayorProducto = producto;
            }
        }

        return mayorProducto;
    }

}
