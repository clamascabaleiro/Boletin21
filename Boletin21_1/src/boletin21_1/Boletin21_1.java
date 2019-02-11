package boletin21_1;

import Clases.*;
import java.util.ArrayList;
import Utilidad.PedirDatos;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin21_1 {

    public static void main(String[] args) {
        Libreria obx = new Libreria();
        ArrayList<Libro> l = new ArrayList<>();
        int opcion = 0;
        do {
            opcion = PedirDatos.entero(("Menú:\n1. Crear libro"
                    + "\n2. Engadir libros\n3. Vender libros\n4. Amosar libros"
                    + "\n5. Dar libros de baixa\n6. Consultar libro\n7. Saír"));
            switch (opcion) {
                case 1:
                    obx.crearLibro(l);
                    break;
                case 2:
                    obx.engadirLibros(l);
                    break;
                case 3:
                    obx.venderLibros(l);
                    break;
                case 4:
                    obx.ver(l);
                    break;
                case 5:
                    obx.baixa(l);
                    break;
                case 6:
                    obx.consultar(l);
                    break;
                case 7:
                    System.exit(0);
            }
        } while (opcion != 7);
    }
}
