package Clases;

import java.util.Objects;

/**
 *
 * @author clamascabaleiro
 */
public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private double prezo;
    private int numeroUnd;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, double prezo, int numeroUnd) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.numeroUnd = numeroUnd;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrezo() {
        return prezo;
    }

    public int getNumeroUnd() {
        return numeroUnd;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    public void setNumeroUnd(int numeroUnd) {
        this.numeroUnd = numeroUnd;
    }

    @Override
    public String toString() {
        return " titulo = " + titulo + " autor = " + autor + " ISBN = " + ISBN + " prezo = " + prezo + " numeroUnd = " + numeroUnd;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
    
    public int compareTo(Object o) {
        Libro l = (Libro)o;
        if(this.titulo.compareToIgnoreCase(l.titulo)>0){
            return 1;
        }
        else if(this.titulo.compareToIgnoreCase(l.titulo)<0){
            return -1;
        }
        else{
            return 0;
        }
    }
}
