package analizadores;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Vector;

public class Nodo {

    /**
     * @return the izquierda
     */
    public Nodo getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * @return the derecha
     */
    public Nodo getDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    /**
     * @return the padre
     */
    public String getPadre() {
        return padre;
    }

    /**
     * @param padre the padre to set
     */
    public void setPadre(String padre) {
        this.padre = padre;
    }

    /**
     * @return the NumeroNodo
     */
    public int getNumeroNodo() {
        return NumeroNodo;
    }

    /**
     * @param NumeroNodo the NumeroNodo to set
     */
    public void setNumeroNodo(int NumeroNodo) {
        this.NumeroNodo = NumeroNodo;
    }

    /**
     * @return the anteriores
     */
    public String getAnteriores() {
        return anteriores;
    }

    /**
     * @param anteriores the anteriores to set
     */
    public void setAnteriores(String anteriores) {
        this.anteriores = anteriores;
    }

    private Nodo izquierda;
    private Nodo derecha;
    private String padre;
    private int NumeroNodo;
    private String anteriores;
    private String siguientes;
    private boolean anulable;
    private int id;

//    public void insertarNodo(Nodo hijo){
//        if(getIzquierda() == null){
//            setIzquierda(hijo);
//            System.out.println("se inserto: "+hijo.getPadre());
//        }else{
//            getIzquierda().insertarNodo(hijo);
//            System.out.println("se inserto: "+hijo.getPadre());
//        }
//        
//            
//    }
    void hola(Nodo imprimir) {
        imprimir.imprimir();

    }

    public void imprimir() {

        if (getIzquierda() != null) {
            getIzquierda().imprimir();
        }
        System.out.println(getPadre());
        if (getIzquierda() == null) {
            System.out.println("esta es una hoja: ");

        }
        if (getDerecha() != null) {
            getDerecha().imprimir();
        }
    }
    

    public String textoGraphvyz(){
        if(getIzquierda() == null && getDerecha() == null){
            System.out.println("entro a primer if"+getPadre());
            return String.valueOf("node"+getId());
            
        }else{
            String texto =  "";
            if(getIzquierda() != null){
                texto += "node"+getId()+ "->"+getIzquierda().textoGraphvyz()+"\n";
                        
            }  
            if(getDerecha()!= null){
                texto += "node"+getId()+ "->"+getDerecha().textoGraphvyz()+"\n";
            }
            return texto;
        }
    }

    /**
     * @return the siguientes
     */
    public String getSiguientes() {
        return siguientes;
    }

    /**
     * @param siguientes the siguientes to set
     */
    public void setSiguientes(String siguientes) {
        this.siguientes = siguientes;
    }

    /**
     * @return the anulable
     */
    public boolean isAnulable() {
        return anulable;
    }

    /**
     * @param anulable the anulable to set
     */
    public void setAnulable(boolean anulable) {
        this.anulable = anulable;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
