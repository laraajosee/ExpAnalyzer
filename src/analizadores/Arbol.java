/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores;

/**
 *
 * @author che
 */
public class Arbol {

    private Nodo raiz;

    public void agregar(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setPadre(valor);

        if (raiz == null) {
            raiz = nuevo;
            System.out.println("se inserto: "+nuevo.getPadre());
        } else {
            raiz.insertarNodo(nuevo);
        }

    }
    
    public void imprimir(){
        raiz.imprimir();
    }
}
