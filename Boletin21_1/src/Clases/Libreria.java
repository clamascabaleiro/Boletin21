package Clases;

import java.util.ArrayList;
import Utilidad.PedirDatos;
import java.util.Collections;

/**
 *
 * @author clamascabaleiro
 */
public class Libreria {

    public void crearLibro(ArrayList<Libro> lista) {
        String titulo = PedirDatos.palabra("Titulo : ");
        String autor = PedirDatos.palabra("Autor : ");
        String ISBN = PedirDatos.palabra("ISBN : ");
        double prezo = PedirDatos.decimal("Precio : ");
        int numeroUnd = PedirDatos.entero("Numero de Unidades : ");
        Libro libro1 = new Libro(titulo, autor, ISBN, prezo, numeroUnd);
        lista.add(libro1);
    }

    public void engadirLibros(ArrayList<Libro> lista) {
        String isbn = PedirDatos.palabra("Introduzca el ISBN : ");
        for (Libro libro1 : lista) {
            if (isbn.equalsIgnoreCase(libro1.getISBN()));
            libro1.setNumeroUnd(libro1.getNumeroUnd() + PedirDatos.entero("Introduzca el numero de unidades que quiere añadir "));
        }
    }

    public void venderLibros(ArrayList<Libro> lista) {
        String isbn = PedirDatos.palabra("Introduzca el ISBN : ");
        for (Libro libro1 : lista) {
            if (isbn.equalsIgnoreCase(libro1.getISBN()));
            int num = PedirDatos.entero("Introduzca el numero de unidades que va a vender : ");
            if (num > libro1.getNumeroUnd()) {
                libro1.setNumeroUnd(0);
            } else {
                libro1.setNumeroUnd(libro1.getNumeroUnd() - num);
            }
        }
    }
    public void ver(ArrayList<Libro> lista){
        for (Libro libro1 : lista){
            libro1.toString();
            
        }
    }
}
