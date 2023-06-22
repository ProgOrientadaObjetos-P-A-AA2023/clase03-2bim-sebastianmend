/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String micodigo, ArrayList<Docente> mislista) {
        super(micodigo);

        lista = mislista;
    }

    public void calcularPromedioSueldos() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getSueldo();
        }
        promedioSueldos = suma / lista.size();

    }

    public void establecerLista(ArrayList<Docente> lista) {
        this.lista = lista;
    }

    public ArrayList<Docente> obtenerLista() {
        return lista;
    }

    public double obtenerPromedioSueldos() {

        return promedioSueldos;
    }

    @Override
    public String toString() {
        String cadena = "Reporte Docente\n";
        cadena = String.format("%sCODIGO:%s\n", cadena, codigo);
        cadena = String.format("%sLista de Docentes\n", cadena);

        for (int i = 0; i < obtenerLista().size(); i++) {
            Docente d = obtenerLista().get(i);
            cadena = String.format("%sNombre: %s - Sueldo: %.1f\n",
                    cadena, d.getNombre(), d.getSueldo());
        }

        cadena = String.format("%sEl promedio de sueldos es: %.3f\n",
                cadena, obtenerPromedioSueldos());

        return cadena;

    }

}
