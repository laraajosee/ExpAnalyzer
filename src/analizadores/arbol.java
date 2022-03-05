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
import java.util.Vector;

public class arbol {

    int contador = 1;
    Nodo nodo = new Nodo();
    String siguientes;

    public void contar(List hola) {
        System.out.println(hola);
        List<Nodo> lista = new LinkedList<Nodo>();
        lista = hola;
        for (Nodo f : lista) {
            System.out.println("Empezando a imporir arbol afuera de CUP");
            llenarARbol(f);
            //System.out.println(" padre" +f.getPadre() + " hijo iz " +f.getIzquierda().getPadre() + " derecha: " + f.getDerecha().getPadre());
            imprimirArbol(f);
        }

    }

    public void llenarARbol(Nodo f) {

        if (f.getIzquierda() != null) {
            llenarARbol(f.getIzquierda());
        }
        if (f.getIzquierda() == null && f.getDerecha() == null) {
            f.setNumeroNodo(contador);
            String hola = Integer.toString(contador);
            f.setAnteriores(hola);
            f.setSiguientes(Integer.toString(contador));
            f.setAnulable(false);
            contador++;
        }
        //System.out.println(f.getPadre());
        if (f.getPadre().equalsIgnoreCase(".")) {
            System.out.println("esteeee nodo es un punto");
            if (f.getIzquierda().isAnulable() == false && f.getDerecha().isAnulable() == false) {
                f.setAnulable(false);
            } else if (f.getIzquierda().isAnulable() == true && f.getDerecha().isAnulable() == true) {
                f.setAnulable(true);
            } else if (f.getIzquierda().isAnulable() == false && f.getDerecha().isAnulable() == true) {
                f.setAnulable(true);
            } else if (f.getIzquierda().isAnulable() == true && f.getDerecha().isAnulable() == false) {
                f.setAnulable(true);
            }

        }else if(f.getPadre().equalsIgnoreCase("*")){
            f.setAnulable(true);
        }else if(f.getPadre().equalsIgnoreCase("+")){
            if(f.getIzquierda().isAnulable() == false){
                f.setAnulable(false);
            }else{
                f.setAnulable(true);
            }
        }else if(f.getPadre().equalsIgnoreCase("?")){   
            f.setAnulable(true);
        }else if(f.getPadre().equalsIgnoreCase("|")){
            if (f.getIzquierda().isAnulable() == false && f.getDerecha().isAnulable() == false) {
                f.setAnulable(false);
            } else if (f.getIzquierda().isAnulable() == true && f.getDerecha().isAnulable() == true) {
                f.setAnulable(true);
            } else if (f.getIzquierda().isAnulable() == false && f.getDerecha().isAnulable() == true) {
                f.setAnulable(false);
            } else if (f.getIzquierda().isAnulable() == true && f.getDerecha().isAnulable() == false) {
                f.setAnulable(false);
            }
            
        }
        
        if (f.getDerecha() != null) {
            llenarARbol(f.getDerecha());
        }

    }

    public void imprimirArbol(Nodo f) {
        if (f.getIzquierda() != null) {
            imprimirArbol(f.getIzquierda());
        }
        System.out.println("************************");
        System.out.println("nodo: " + f.getPadre());
        System.out.println("Numero de nodo: " + f.getNumeroNodo());
        System.out.println("Sus anteriores son: :" + f.getAnteriores());
        System.out.println("Sus siguientes es: " + f.getSiguientes());
        System.out.println("Anulable? " + f.isAnulable());

//         for(int i=0; i<f.getAnteriores().size(); i++){
//            System.out.print(f.getAnteriores().elementAt(i)+"\t");
//        }
        if (f.getDerecha() != null) {
            imprimirArbol(f.getDerecha());
        }
    }
}
