import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {


    @Test
    public void testMayorProducto(){
        int[] arreglo = {1};
        int resultado = Main.mayorProductoAdyacentes(arreglo);
        assertEquals(0,resultado);
    }

    @Test
    public void testMayorProducto2(){
        String arreglo = "a";

    }
    @Test
    public void testMayorProducto4(){
        int[] arreglo = {3, 6, -2, -5, 7, 3};
        int resultado = Main.mayorProductoAdyacentes(arreglo);
        assertEquals(21, resultado);
    }
    @Test
    public void testMayorProducto5(){
        int[] arreglo = {-1, -2};
        int resultado = Main.mayorProductoAdyacentes(arreglo);
        assertEquals(2, resultado);

    }
    @Test
    public void testMayorProducto6(){
        int[] arreglo = {1, 0, 1, 0, 1000};
        int resultado = Main.mayorProductoAdyacentes(arreglo);
        assertEquals(0, resultado);
    }

}