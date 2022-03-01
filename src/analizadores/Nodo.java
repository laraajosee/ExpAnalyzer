
package analizadores;


public class Nodo {
    private Nodo izquierda;
    private Nodo derecha;
    private String valor;
    
    public void insertarNodo(Nodo hijo){
        if(izquierda == null){
            izquierda = hijo;
            System.out.println("se inserto: "+hijo.valor);
        }else{
            izquierda.insertarNodo(hijo);
            System.out.println("se inserto: "+hijo.valor);
        }
        
            
    }
    public void imprimir(){ 
        if(izquierda != null){ 
            izquierda.imprimir();
            System.out.println(valor);
        }else{
            System.out.println("*********");
            System.out.println(valor);
            
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
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }
    
}
