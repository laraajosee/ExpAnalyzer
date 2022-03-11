package analizadores;

/**
 *
 * @author che
 */
public class listaAutomata {

    // Puntero que indica el inicio de la lista o conocida tambien
    // como cabeza de la lista.
    private NodoAutomata inicio;
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
    public void agregarAlFinal(String valor, String estado) {
        // Define un nuevo nodo.
        NodoAutomata nuevo = new NodoAutomata();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        nuevo.setEstado(estado);
        //nuevo.setTerminal(padre);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
            // Caso contrario recorre la lista hasta llegar al ultimo nodo
            //y agrega el nuevo.
        } else {
            // Crea ua copia de la lista.
            NodoAutomata aux = inicio;
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

    public void perderLista() {
        inicio = null;

    }

    public void listar() {
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            NodoAutomata aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while (aux != null) {
                // Imprime en pantalla el valor del nodo.
                System.out.print(i + ".[ " + aux.getEstado() + "-->" + aux.getValor() + " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
    }

    public String siguientesHTML() {
        // Verifica si la lista contiene elementoa.
        String conca = "<tr>\n";
        if (!esVacia()) {
            // Crea una copia de la lista.
            NodoAutomata aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while (aux != null) {
                // Imprime en pantalla el valor del nodo.
                //System.out.print(i + ".[ " + aux.getValor() +","+aux.getTerminal() +"Siguientes: "+aux.getSiguientes()+" ]" + " ->  ");
                conca += "  <td>" + aux.getValor() + "</td>\n"
                        //+ "  <td>"+aux.getTerminal()+"</td>\n"
                        + "  <td>" + aux.getSiguientes() + "</td>\n"
                        + "  </tr>";
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }

        return conca;
    }

    public boolean buscar(String referencia) {
        // Crea una copia de la lista.
        NodoAutomata aux = inicio;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while (aux != null && encontrado != true) {
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia.equals(aux.getValor())) {
                // Canbia el valor de la bandera.
                encontrado = true;
            } else {
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el resultado de la bandera.
        return encontrado;

    }
    public String buscarEstado(String y) {
        // Verifica si la lista contiene elementoa.
        String estado = "";
        if (!esVacia()) {
            // Crea una copia de la lista.
            NodoAutomata aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while (aux != null) {
                // Imprime en pantalla el valor del nodo.
               // System.out.print(i + ".[ " + aux.getEstado() + "-->" + aux.getValor() + " ]" + " ->  ");
                if(aux.getValor().equals(y)){
                    estado = aux.getEstado();
                    break;
                }
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
        return estado;
    }

    public String buscarSiguietnes(String y) {
        String estado = "";
        if (!esVacia()) {
            // Crea una copia de la lista.
            NodoAutomata aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while (aux != null) {
                // Imprime en pantalla el valor del nodo.
                //System.out.print(i + ".[ " + aux.getEstado() + "-->" + aux.getValor() + " ]" + " ->  ");
                //System.out.println("estado " + aux.getEstado());
                //System.out.println("valor " + aux.getValor());
                String[] parts2 = aux.getValor().split(",");
                int[] hola2 = new int[parts2.length];
                for (int a = 0; a < hola2.length; a++) {
                    //System.out.println(parts2[a]);
                    if (parts2[a].equals(y)) {
                        //System.out.println("valor a buscar: " + y);
                        //System.out.println("valor encontrado en:" + aux.getEstado());
                        estado = aux.getEstado();
                        break;
                    }

                }
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
        return estado;
    }

   

public NodoAutomata buscarNodo(String referencia) {
        // Crea una copia de la lista.
        NodoAutomata aux = inicio;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while (aux != null && encontrado != true) {
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia.equals(aux.getValor())) {
                // Canbia el valor de la bandera.
                encontrado = true;
            } else {
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el resultado de la bandera.
        return aux;

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
                NodoAutomata aux = inicio;
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
