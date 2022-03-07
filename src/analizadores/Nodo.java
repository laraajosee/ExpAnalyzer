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
     * @return the primeros
     */
    public String getPrimeros() {
        return primeros;
    }

    /**
     * @param primeros the primeros to set
     */
    public void setPrimeros(String primeros) {
        this.primeros = primeros;
    }

    /**
     * @return the ultimos
     */
    public String getUltimos() {
        return ultimos;
    }

    /**
     * @param ultimos the ultimos to set
     */
    public void setUltimos(String ultimos) {
        this.ultimos = ultimos;
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

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    private Nodo izquierda;
    private Nodo derecha;
    private String padre;
    private int NumeroNodo;
    private String primeros;
    private String ultimos;
    private boolean anulable;
    private int id;
    private String tipo;

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
           // System.out.println("entro a primer if"+getPadre());
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
}

    