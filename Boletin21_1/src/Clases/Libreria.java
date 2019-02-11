package Clases;

import java.util.ArrayList;
import Utilidad.PedirDatos;
import java.util.Collections;
import javax.swing.JOptionPane;

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
        int comprobar = 0;
        String isbn = PedirDatos.palabra("Introduzca el ISBN del libro:");
        for (Libro la : lista) {
            if (isbn.equalsIgnoreCase(la.getISBN())) {
                la.setNumeroUnd(la.getNumeroUnd() + PedirDatos.entero(("Introduzca el número de unidades a añadir:")));
                comprobar = 1;
            }
        }
        if (comprobar == 0) {
            JOptionPane.showMessageDialog(null, "No se encontró un libro con ese ISBN");
        }
    }

    public void venderLibros(ArrayList<Libro> lista) {
        try {
            int comprobar = 0;
            String isbn = PedirDatos.palabra("Introduzca el ISBN del libro:");
            for (Libro la : lista) {
                if (isbn.equalsIgnoreCase(la.getISBN())) {
                    int num = PedirDatos.entero(("Introduzca el número de unidades a vender:"));
                    if (num > la.getNumeroUnd()) {
                        la.setNumeroUnd(0);
                    } else {
                        la.setNumeroUnd(la.getNumeroUnd() - num);
                    }
                    comprobar = 1;
                }
            }
            if (comprobar == 0) {
                JOptionPane.showMessageDialog(null, "No se encontró un libro con ese ISBN");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "El array indicado es nulo");
        }
    }

    public void ver(ArrayList<Libro> lista) {
        try {
            ArrayList<Libro> lista2 = lista;
            for (Libro la : lista2) {
                System.out.println(la.toString());
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "El array indicado es nulo");
        }
    }

    public void baixa(ArrayList<Libro> lista) {
        try {
            for (Libro l : lista) {
                if (0 == l.getNumeroUnd()) {
                    lista.remove(l);
                }
            }
        } catch (Exception e) {

        }
    }

    public void consultar(ArrayList<Libro> lista) {
        try {
            int comprobar = 0;
            String isbn = PedirDatos.palabra("Introduzca el ISBN del libro:");
            for (Libro l : lista) {
                if (l.getISBN().equalsIgnoreCase(isbn)) {
                    JOptionPane.showMessageDialog(null, l.toString());
                    comprobar = 1;
                }
            }
            if (comprobar == 0) {
                JOptionPane.showMessageDialog(null, "No se encontró un libro con ese ISBN");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "El array indicado es nulo");
        }
    }
}
