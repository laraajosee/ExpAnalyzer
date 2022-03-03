package analizadores;

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
    private Nodo izquierda;
    private Nodo derecha;
    private String padre;

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
    public void imprimir() {
        if (getIzquierda()!= null) {
            getIzquierda().imprimir();
        }
        System.out.println(getPadre());
        if (getDerecha() != null) {
            getDerecha().imprimir();
        }
    }
}
/**
 * @return the izquierda
 */
