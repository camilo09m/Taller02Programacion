import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 feature/MatíasPincheira
 feature/CamiloÑanco


        int n = genaradorRandom(10,2);
        opcionMenu(generarArreglo(n));
 master
    }
   public static int[] generarArreglo(int n){
            int[] arrAdyacente = new int[n];                            //creamos un arreglo el cual almacenará los valores a considerar
            for (int i = 0; i<arrAdyacente.length;i++){
                arrAdyacente[i]=genaradorRandom(-1000,1000);
            }
            return arrAdyacente;
    }

    public static int genaradorRandom(int max, int min){              // se crea este metodo con parametros para reutilizarlo, porque asi se podrá reutilizar cambiando los limites
        Random rand = new Random();
        int numRandom = (int)(Math.random()*(max-min+1)+min);
        return numRandom;
    }
    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");               //muestra las opciones posibles
        System.out.println("                Ingrese una opción                 ");
        System.out.println("[1] Mostrar pares adyacentes.");
        System.out.println("[2] Mostrar el mayor valor de producto.");
        System.out.println("[0] Salir");
        System.out.println("--------------------------------------------------");
    }
    public static void opcionMenu(int[] arr) {
        Scanner tecla = new Scanner(System.in);
        int aux = 0;
        while (aux == 0) {
            mostrarMenu();                                                                      //llama a la opcion mostrarmenu
            String opcion = tecla.next();                                                       //se ingresa la opcion, se utiliza String, para asi evitar que se caiga el programa y poder manejar los errores.
            switch (opcion) {
                case "1":
                    mostrarParesAdyacentes(arr);
                    break;
                case "2":
                    System.out.println("El producto de pares Adyacentes mayor es: "+mayorProductoAdyacentes(arr));
                    break;
                case "0":
                    aux = 1;
                    break;
                default:
                    System.err.println("opcion ingresada no valida");
            }
        }
    }
 feature/MatíasPincheira
 feature/CamiloÑanco
    public static void mostrarParesAdyacentes(int[] arr){                   //en este metodo se recorrerá por todo el largo del arreglo y se irá mostrando su par ordenado, de forma que el sucesor será su par
        for (int i = 1; i < arr.length; i++) {
            System.out.printf("["+ arr[i-1] +" , "+ (arr[i])+"]; ");
        }
        System.out.println("");
    }

    public static int mayorProductoAdyacentes(int[] arr) {                  //para buscar la multiplicacion mayor se recorre el arreglo, mientras se confirma si esa es mayor que un auxiliar
        int mayorProducto = 0;
        for (int i = 1; i < arr.length; i++) {
            int producto = arr[i-1]*arr[i];
            if (producto>mayorProducto){
                mayorProducto = producto;
            }
        }
        return mayorProducto;
    }
       
 feature/MatíasPincheira

    public static boolean validarInput(int[] arr){
        return arr.length > 1;
    }
 feature/MatíasPincheira
 master
}
