
package analizadores;


public class Nodo {
    private Nodo izquierda;
    private Nodo derecha;
    private int padre;
    
    public void insertarNodo(Nodo hijo){
        if(getIzquierda() == null){
            setIzquierda(hijo);
            System.out.println("se inserto: "+hijo.getPadre());
        }else{
            getIzquierda().insertarNodo(hijo);
            System.out.println("se inserto: "+hijo.getPadre());
        }
        
            
    }
    public void imprimir(){ 
        if(getIzquierda() != null){ 
            getIzquierda().imprimir();
            System.out.println(getPadre());
        }else{
            System.out.println("*********");
            System.out.println(getPadre());
            
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
    public int getPadre() {
        return padre;
    }

    /**
     * @param padre the padre to set
     */
    public void setPadre(int padre) {
        this.padre = padre;
    }
    
    
}
    
    