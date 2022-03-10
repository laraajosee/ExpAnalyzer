package analizadores;


public class NodoAutomata {

    /**
     * @return the siguiente
     */
    public NodoAutomata getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoAutomata siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoAutomata getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoAutomata anterior) {
        this.anterior = anterior;
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
    
    private NodoAutomata siguiente;
    private NodoAutomata anterior;
    private String siguientes;
    private String valor;
    private String estado;
    private String transiciones;

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the transiciones
     */
    public String getTransiciones() {
        return transiciones;
    }

    /**
     * @param transiciones the transiciones to set
     */
    public void setTransiciones(String transiciones) {
        this.transiciones = transiciones;
    }
    
    
}
