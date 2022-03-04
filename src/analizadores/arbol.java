/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores;
import java.util.LinkedList;
import java.util.List;
import analizadores.Nodo;
import java.util.ArrayList;

public class arbol {
    int contador = 1;
    Nodo nodo = new Nodo();

    
    public void contar(List hola){
        System.out.println(hola);
        List<Nodo> lista = new LinkedList<Nodo>();
        lista = hola;
        for(Nodo f : lista ){
            System.out.println("Empezando a imporir arbol afuera de CUP");
            llenarARbol(f);
           //System.out.println(" padre" +f.getPadre() + " hijo iz " +f.getIzquierda().getPadre() + " derecha: " + f.getDerecha().getPadre());
           
        }
        
    }
    public void llenarARbol(Nodo f){
        if (f.getIzquierda()!= null) {
            llenarARbol(f.getIzquierda());
        }
        System.out.println(f.getPadre());
        if(f.getIzquierda() == null && f.getDerecha() == null){
            System.out.println("esta es una hoja: "+contador);
            contador++;
             
        }
        if (f.getDerecha() != null) {
            llenarARbol(f.getDerecha());
        }
    }
}
