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
public class Lista {

    // Puntero que indica el inicio de la lista o conocida tambien
    // como cabeza de la lista.
    private NodoS inicio;
    // Variable para registrar el tamaño de la lista.
    private int tamanio;

    /**
     * Constructor por defecto.
     */
    public void Lista() {
        inicio = null;
        tamanio = 0;
    }

    /**
     * Consulta si la lista esta vacia.
     *
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean esVacia() {
        return inicio == null;
    }

    /**
     * Consulta cuantos elementos (nodos) tiene la lista.
     *
     * @return numero entero entre [0,n] donde n es el numero de elementos que
     * contenga la lista.
     */
    public int getTamanio() {
        return tamanio;
    }

    /**
     * Agrega un nuevo nodo al final de la lista.
     *
     * @param valor a agregar.
     */
    public void agregarAlFinal(int valor, String padre) {
        // Define un nuevo nodo.
        NodoS nuevo = new NodoS();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        nuevo.setTerminal(padre);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
            // Caso contrario recorre la lista hasta llegar al ultimo nodo
            //y agrega el nuevo.
        } else {
            // Crea ua copia de la lista.
            NodoS aux = inicio;
            // Recorre la lista hasta llegar al ultimo nodo.
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setSiguiente(nuevo);
        }
        // Incrementa el contador de tamaño de la lista
        tamanio++;

    }
    public void perderLista(){
        inicio = null;
        
    }        
    public void listar() {
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            NodoS aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while (aux != null) {
                // Imprime en pantalla el valor del nodo.
                System.out.print(i + ".[ " + aux.getValor() + "," + aux.getTerminal() + "Siguientes: " + aux.getSiguientes() + " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
    }
     
    public String buscarSiguietnes(int a) {
        // Verifica si la lista contiene elementoa.
        String siguientes = "";
        if (!esVacia()) {
            // Crea una copia de la lista.
            NodoS aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while (aux != null) {
                // Imprime en pantalla el valor del nodo.
               // System.out.print(i + ".[ " + aux.getValor() + "," + aux.getTerminal() + "Siguientes: " + aux.getSiguientes() + " ]" + " ->  ");
                if(aux.getValor() == a){
                    //System.out.println("estado siguiente encontrado en:"+aux.getSiguientes()+"con tansicion"+aux.getTerminal());
                    siguientes = aux.getSiguientes();
                    break;
                }
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
        return siguientes;
    }
     public String buscarTerminal(int a) {
        // Verifica si la lista contiene elementoa.
        String siguientes = "";
        if (!esVacia()) {
            // Crea una copia de la lista.
            NodoS aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while (aux != null) {
                // Imprime en pantalla el valor del nodo.
               // System.out.print(i + ".[ " + aux.getValor() + "," + aux.getTerminal() + "Siguientes: " + aux.getSiguientes() + " ]" + " ->  ");
                if(aux.getValor() == a){
                    //System.out.println("estado siguiente encontrado en:"+aux.getSiguientes()+"con tansicion"+aux.getTerminal());
                    siguientes = aux.getTerminal();
                    break;
                }
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
        return siguientes;
    }
     public int aceptacion() {
        // Verifica si la lista contiene elementoa.
        int siguientes = 0;
        if (!esVacia()) {
            // Crea una copia de la lista.
            NodoS aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while (aux != null) {
                // Imprime en pantalla el valor del nodo.
               // System.out.print(i + ".[ " + aux.getValor() + "," + aux.getTerminal() + "Siguientes: " + aux.getSiguientes() + " ]" + " ->  ");
                if(aux.getTerminal().equals("#")){
                    //System.out.println("estado siguiente encontrado en:"+aux.getSiguientes()+"con tansicion"+aux.getTerminal());
                    siguientes += aux.getValor();
                    
                }
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
        return siguientes;
    }

    public String siguientesHTML() {
        // Verifica si la lista contiene elementoa.
        String conca = "<tr>\n";
        if (!esVacia()) {
            // Crea una copia de la lista.
            NodoS aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while (aux != null) {
                // Imprime en pantalla el valor del nodo.
                //System.out.print(i + ".[ " + aux.getValor() +","+aux.getTerminal() +"Siguientes: "+aux.getSiguientes()+" ]" + " ->  ");
                conca += "  <td>"+aux.getValor()+"</td>\n"
                + "  <td>"+aux.getTerminal()+"</td>\n"
                + "  <td>"+aux.getSiguientes()+"</td>\n"
                + "  </tr>";
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
     
        return conca;
    }
    public NodoS buscar(int referencia){
        // Crea una copia de la lista.
        NodoS aux = inicio;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == aux.getValor()){
                // Canbia el valor de la bandera.
                encontrado = true;
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el resultado de la bandera.
        return aux;
    }
     public String mandarSiguientes(int referencia){
        // Crea una copia de la lista.
        String siguientes = "";
        NodoS aux = inicio;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == aux.getValor()){
                // Canbia el valor de la bandera.
                siguientes = "";
                siguientes = aux.getSiguientes();
                encontrado = true;
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el resultado de la bandera.
        return siguientes;
    }
    
    

    public void editarPorPosicion(int posicion, String valor) {
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if (posicion >= 0 && posicion < tamanio) {
            // Consulta si el nodo a eliminar es el primero.
            if (posicion == 0) {
                // Alctualiza el valor delprimer nodo.
                if (inicio.getSiguientes() != null) {
                    inicio.setSiguientes(inicio.getSiguientes() + "," + valor);

                } else {

                    inicio.setSiguientes(valor);
                }
            } else {
                // En caso que el nodo a eliminar este por el medio 
                // o sea el ultimo
                NodoS aux = inicio;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                // Alctualiza el valor del nodo.
                if (aux.getSiguientes() != null) {
                    aux.setSiguientes(aux.getSiguientes() + "," + valor);

                } else {

                    aux.setSiguientes(valor);
                }
            }
        }
    }

}
