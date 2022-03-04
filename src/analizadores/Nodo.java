package analizadores;

public class Nodo {
  
    private Nodo izquierda;
    private Nodo derecha;
    private String padre;
    private int NumeroNodo;
    
    

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
    void hola(Nodo imprimir){
       imprimir.imprimir();
        
    }
    public void imprimir() {
        
        if (getIzquierda()!= null) {
            getIzquierda().imprimir();
        }
        System.out.println(getPadre());
        if(getIzquierda() == null){
            System.out.println("esta es una hoja: ");
             
        }
        if (getDerecha() != null) {
            getDerecha().imprimir();
        }
    }
    
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
}
/**
 * @return the izquierda
 */
