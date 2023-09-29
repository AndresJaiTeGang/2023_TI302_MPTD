/*
 * 2023 IESS-TICS-302 MPTD
 * Periodo Agosto-Diciembre 2023
 * Unidad 1. Programación Lineal
 * Descripcion: TEST implementación del metodo simplex ( z max, r <= b )
 * By AM
 * email: andresm09872@gmail.com
 * 29/09/2023
 */
package tools;

/**
 *
 * @author Jai Te Gang
 */
public class SimplexMethodTest {
    public static void main(String... args) {
        SimplexMethod sm= new SimplexMethod(3, 4);
        
        float r0[] = {0, 1 , -3, -6, 9, 0, 1, -2, 0, 0};
        sm.add(0, r0);
        System.out.println("index: "+ sm.optimality());
        
    }
}
