/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores;

import java.util.LinkedList;
import java.util.List;
import analizadores.Nodo;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Queue;
import java.util.Random;
import java.util.Vector;

public class arbol {

    Random numAleatorio = new Random();
    int contadorDocumentos = 0;
    String stringHtml = "";
    int contador = 1;
    int contadorID = 0;
    int contadorEstados = 1;
    boolean estadoUno = true;
    Nodo nodo = new Nodo();
    Lista listaa = new Lista();
    listaAutomata listaAutomata = new listaAutomata();
    String cabecera = "";
    ArrayList<Integer> arr = new ArrayList();

    public void contar(List hola) {

        System.out.println(hola);
        List<Nodo> lista = new LinkedList<Nodo>();
        lista = hola;
        for (Nodo f : lista) {
            cabecera = "";
            listaa.perderLista();
            listaAutomata.perderLista();
            stringHtml = "";
            contadorID = 0;
            contador = 1;
            System.out.println("Empezando a imporir arbol afuera de CUP");
            llenarARbol(f);
//            //System.out.println(" padre" +f.getPadre() + " hijo iz " +f.getIzquierda().getPadre() + " derecha: " + f.getDerecha().getPadre());
            primeros(f);
            ultimos(f);
            System.out.println("....................................................");
            imprimirArbol(f);
            cabecera(f);

            follow(f);
            dibujarGraphvyz(f);
            estados(f);
//            listaa.listar();
//          
        }

    }

    public void follow(Nodo f) {
        if (f.getIzquierda() != null) {
            follow(f.getIzquierda());
        }
        if (f.getDerecha() != null) {
            follow(f.getDerecha());
        }

        if (f.getDerecha() == null && f.getIzquierda() == null) {
            listaa.agregarAlFinal(f.getNumeroNodo(), f.getPadre());

        }
        if (f.getPadre().equalsIgnoreCase(".")) {
            String[] parts = f.getIzquierda().getUltimos().split(",");
            //System.out.println(Arrays.asList(parts));
            for (int i = 0; i < parts.length; i++) {

                listaa.editarPorPosicion(Integer.parseInt(parts[i]) - 1, f.getDerecha().getPrimeros());
                System.out.println(parts[i]);
                // aqui se puede referir al objeto con arreglo[i];
            }

            System.out.println("***************");

        } else if (f.getPadre().equalsIgnoreCase("*")) {
            String[] parts = f.getIzquierda().getUltimos().split(",");
            int[] hola = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                //arr.add(Integer.parseInt(parts[i]));
                hola[i] = Integer.parseInt(parts[i]);
                // aqui se puede referir al objeto con arreglo[i];
            }
            Arrays.sort(hola);
            int length = hola.length;
            length = remove_Duplicate_Elements(hola, length);
            //System.out.println(Arrays.asList(parts));
            for (int i = 0; i < hola.length; i++) {

                listaa.editarPorPosicion(Integer.parseInt(parts[i]) - 1, f.getIzquierda().getPrimeros());
                System.out.println(parts[i] + " se le ingresa " + f.getIzquierda().getPrimeros());
                // aqui se puede referir al objeto con arreglo[i];
            }

            System.out.println("***************");

        } else if (f.getPadre().equalsIgnoreCase("+")) {
            String[] parts = f.getIzquierda().getUltimos().split(",");
            int[] hola = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                //arr.add(Integer.parseInt(parts[i]));
                hola[i] = Integer.parseInt(parts[i]);
                // aqui se puede referir al objeto con arreglo[i];
            }
            Arrays.sort(hola);
            int length = hola.length;
            length = remove_Duplicate_Elements(hola, length);
            //System.out.println(Arrays.asList(parts));
            for (int i = 0; i < hola.length; i++) {

                listaa.editarPorPosicion(Integer.parseInt(parts[i]) - 1, f.getIzquierda().getPrimeros());
                System.out.println(parts[i] + " se le ingresa " + f.getIzquierda().getPrimeros());
                // aqui se puede referir al objeto con arreglo[i];
            }

            System.out.println("***************");

        }

        stringHtml = "<html>\n"
                + "<head><title>Tabla de siguientes</title></head>\n"
                + "<body>\n"
                + "<h1>Tabla de Siguientes</h1>"
                + "<table cellpadding=\"10\">"
                + listaa.siguientesHTML()
                + "</table>\n"
                + "\n"
                + "</body>\n"
                + "</html>\n";

    }

    public void estados(Nodo f) {
        Queue queue = new LinkedList<String>();
        String[] parts = f.getPrimeros().split(",");
        int[] hola = new int[parts.length];
        for (int i = 0; i < hola.length; i++) {
            queue.add(parts[i]);
        }
        listaAutomata.agregarAlFinal(f.getPrimeros(), "S0");
        NodoS aux = new NodoS();
        NodoAutomata estadoSiguiente = new NodoAutomata();
        NodoAutomata estadoActual = new NodoAutomata();
        boolean auxEstados = false;

        while (queue != null) {
            String head = (String) queue.peek(); //1
            aux = listaa.buscar((Integer.parseInt(head)));
            if(aux.getTerminal() == "#"){
                break;
            }
            auxEstados = listaAutomata.buscar(aux.getSiguientes()); //busca si ya existe el estado 
            if(auxEstados == false){ //crea nuevo nodo
                //estadoActual = listaAutomata.buscarNodo("S"+contadorEstados);
                listaAutomata.agregarAlFinal(aux.getSiguientes(), "S"+contadorEstados);
                estadoSiguiente = listaAutomata.buscarNodo(aux.getSiguientes()); //posicionandome en el estado de la pila buscandolo por sus siguientes
                
                //estadoSiguiente.setTransiciones("");
                contadorEstados++;
            }else{
                //System.out.println("el mismo nodo");
                int o = 0;
                o = contadorEstados-1;
                listaAutomata.agregarAlFinal(aux.getSiguientes(), "S"+o);
            } 
           //System.out.println("siguientes de pila:" + aux.getSiguientes());
            String[] parts2 = aux.getSiguientes().split(",");
            int[] hola2 = new int[parts2.length];
            for (int i = 0; i < hola2.length; i++) {
                //System.out.println(parts2[i]);
                queue.add(parts2[i]);
            }
            queue.remove();

            //System.out.println("hola");
            

        }

        listaa.listar();;
        //System.out.println("\n" + queue);
        listaAutomata.listar();

    }

    public static int remove_Duplicate_Elements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] tempA = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                tempA[j++] = arr[i];
            }
        }
        tempA[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
            arr[i] = tempA[i];
        }
        return j;
    }

    public String obtenerCodigoGraphvyz(Nodo f) {
        String texto = "digraph G"
                + "{\n"
                + "bgcolor=\"turquoise\" "
                + cabecera;
        System.out.println("obteniendo graphvbyz");
        if (f.getPadre() != null) {
            texto += f.textoGraphvyz();
        }
        texto += "\n}";
        return texto;

    }

    private void escribirFichero(String ruta, String contenido) {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter(ruta);
            pw = new PrintWriter(fichero);
            pw.write(contenido);
            pw.close();
            fichero.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    public void dibujarGraphvyz(Nodo f) {
        try {
            //numAleatorio.nextInt();
            String v = String.valueOf(numAleatorio.nextInt());
            String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
            escribirFichero("D:\\CLases\\Compi 1\\ExpAnalyzer\\arbol_#20134470\\archivo" + v + ".txt", obtenerCodigoGraphvyz(f));

            ProcessBuilder proceso;
            proceso = new ProcessBuilder("dot", "-Tpng", "D:\\CLases\\Compi 1\\ExpAnalyzer\\arbol_#20134470\\archivo" + v + ".txt", "-o", "D:\\CLases\\Compi 1\\ExpAnalyzer\\arbol_#20134470\\archivo" + v + ".png");
            proceso.redirectErrorStream();

            proceso.start();
            escribirFichero(("D:\\CLases\\Compi 1\\ExpAnalyzer\\Siguientes_#201344708\\archivo" + v + ".html"), stringHtml);

        } catch (Exception e) {
            e.printStackTrace();
        }
        //abrirarchivo("archivo.png");

    }

    public void raaa() {
        System.out.println("hola");
        try {

            String dotPath = "C:\\Program Files\\Graphviz\\bin\\dot.exe";

            String fileInputPath = "archivo.txt";
            String fileOutputPath = "grafo1.jpg";

            String tParam = "-Tjpg";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();

            rt.exec(cmd);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
    }

    public void llenarARbol(Nodo f) {

        if (f.getIzquierda() != null) {
            llenarARbol(f.getIzquierda());
        }
        if (f.getIzquierda() == null && f.getDerecha() == null) {
            f.setNumeroNodo(contador);
            String hola = Integer.toString(contador);
            f.setPrimeros(hola);
            f.setUltimos(hola);
            f.setAnulable(false);
            contador++;
        }
        //System.out.println(f.getPadre());
        if (f.getDerecha() != null) {
            llenarARbol(f.getDerecha());
        }
        if (f.getPadre().equalsIgnoreCase(".")) {

            if (f.getIzquierda().isAnulable() == false && f.getDerecha().isAnulable() == false) {
                f.setAnulable(false);
            } else if (f.getIzquierda().isAnulable() == true && f.getDerecha().isAnulable() == true) {
                f.setAnulable(true);
            } else if (f.getIzquierda().isAnulable() == false && f.getDerecha().isAnulable() == true) {
                f.setAnulable(false);
            } else if (f.getIzquierda().isAnulable() == true && f.getDerecha().isAnulable() == false) {
                f.setAnulable(false);
            }

        } else if (f.getPadre().equalsIgnoreCase("*")) {
            f.setAnulable(true);
        } else if (f.getPadre().equalsIgnoreCase("+")) {
            if (f.getIzquierda().isAnulable() == false) {
                f.setAnulable(false);
            } else {
                f.setAnulable(true);
            }
        } else if (f.getPadre().equalsIgnoreCase("?")) {
            f.setAnulable(true);
        } else if (f.getPadre().equalsIgnoreCase("|")) {
            if (f.getIzquierda().isAnulable() == false && f.getDerecha().isAnulable() == false) {
                f.setAnulable(false);
            } else if (f.getIzquierda().isAnulable() == true && f.getDerecha().isAnulable() == true) {
                f.setAnulable(true);
            } else if (f.getIzquierda().isAnulable() == false && f.getDerecha().isAnulable() == true) {
                f.setAnulable(true);
            } else if (f.getIzquierda().isAnulable() == true && f.getDerecha().isAnulable() == false) {
                f.setAnulable(true);
            }

        }
        f.setId(contadorID);
        contadorID++;

    }

    public void primeros(Nodo f) {
        if (f.getIzquierda() != null) {
            primeros(f.getIzquierda());
        }

        if (f.getDerecha() != null) {
            primeros(f.getDerecha());
        }
        //System.out.println(f.getPadre());
        if (f.getPadre().equalsIgnoreCase(".")) {
            if (f.getIzquierda().isAnulable() == true) {
                String primeros = f.getIzquierda().getPrimeros() + "," + f.getDerecha().getPrimeros();
                f.setPrimeros(primeros);
            } else {
                f.setPrimeros(f.getIzquierda().getPrimeros());
            }
        } else if (f.getPadre().equalsIgnoreCase("*")) {
            f.setPrimeros(f.getIzquierda().getPrimeros());

        } else if (f.getPadre().equalsIgnoreCase("+")) {
            f.setPrimeros(f.getIzquierda().getPrimeros());

        } else if (f.getPadre().equalsIgnoreCase("?")) {
            f.setPrimeros(f.getIzquierda().getPrimeros());
        } else if (f.getPadre().equalsIgnoreCase("|")) {
            String primeros = f.getIzquierda().getPrimeros() + "," + f.getDerecha().getPrimeros();
            f.setPrimeros(primeros);

        }

    }

    public void ultimos(Nodo f) {
        if (f.getIzquierda() != null) {
            ultimos(f.getIzquierda());
        }

        if (f.getDerecha() != null) {
            ultimos(f.getDerecha());
        }
        //System.out.println(f.getPadre());
        if (f.getPadre().equalsIgnoreCase(".")) {
            if (f.getDerecha().isAnulable() == true) {
                String anteriores = f.getIzquierda().getUltimos() + "," + f.getDerecha().getUltimos();
                f.setUltimos(anteriores);
            } else {
                f.setUltimos(f.getDerecha().getUltimos());
            }
        } else if (f.getPadre().equalsIgnoreCase("*")) {
            f.setUltimos(f.getIzquierda().getUltimos());

        } else if (f.getPadre().equalsIgnoreCase("+")) {
            f.setUltimos(f.getIzquierda().getUltimos());

        } else if (f.getPadre().equalsIgnoreCase("?")) {
            f.setUltimos(f.getIzquierda().getUltimos());
        } else if (f.getPadre().equalsIgnoreCase("|")) {
            String ultimos = f.getIzquierda().getUltimos() + "," + f.getDerecha().getUltimos();
            f.setUltimos(ultimos);

        }

    }

    public void cabecera(Nodo f) {
        if (f.getIzquierda() != null) {
            cabecera(f.getIzquierda());
        }

        if (f.getDerecha() != null) {
            cabecera(f.getDerecha());
        }
        //System.out.println(f.getPadre());

        if (f.getTipo() == "id") {
            if (f.getPadre().equals(("\" \""))) {
                //cabecera += "node" + (String.valueOf(f.getId())) + " [label=\"\\\"" + " " + "\\\"\"];\n";
                cabecera += "node" + (String.valueOf(f.getId())) + "[\n"
                        + "   color=blue      // The color of the border of the table\n"
                        + "   label=<\n"
                        + "    <table border='0' cellpadding=\"1\" cellspacing=\"1\" cellborder='0'>\n"
                        + "       <tr><td ></td><td bgcolor=\"yellow\">" + f.isAnulable() + "</td><td></td></tr>\n"
                        + "       <tr><td bgcolor = \"chartreuse1\">" + f.getPrimeros() + "</td ><td bgcolor=\"blueviolet\">" + ("\"\\\"" + " " + "\\\"\"") + "</td><td bgcolor =\"gainsboro\">" + f.getUltimos() + "</td></tr>\n"
                        + "       <tr><td></td><td bgcolor =\"lightsalmon\">" + f.getNumeroNodo() + "</td><td></td></tr>\n"
                        + "     </table>\n"
                        + "  >];";
            } else {
                cabecera += "node" + (String.valueOf(f.getId())) + "[\n"
                        + "   color=blue      // The color of the border of the table\n"
                        + "   label=<\n"
                        + "    <table border='0' cellpadding=\"1\" cellspacing=\"1\" cellborder='0'>\n"
                        + "       <tr><td ></td><td bgcolor=\"yellow\">" + f.isAnulable() + "</td><td></td></tr>\n"
                        + "       <tr><td bgcolor = \"chartreuse1\">" + f.getPrimeros() + "</td ><td bgcolor=\"blueviolet\">" + f.getPadre() + "</td><td bgcolor =\"gainsboro\">" + f.getUltimos() + "</td></tr>\n"
                        + "       <tr><td></td><td bgcolor =\"lightsalmon\">" + f.getNumeroNodo() + "</td><td></td></tr>\n"
                        + "     </table>\n"
                        + "  >];";
            }

        } else {
            cabecera += "node" + (String.valueOf(f.getId())) + "[\n"
                    + "   color=blue      // The color of the border of the table\n"
                    + "   label=<\n"
                    + "    <table border='0' cellpadding=\"1\" cellspacing=\"1\" cellborder='0'>\n"
                    + "       <tr><td ></td><td bgcolor=\"yellow\">" + f.isAnulable() + "</td><td></td></tr>\n"
                    + "       <tr><td bgcolor = \"chartreuse1\">" + f.getPrimeros() + "</td ><td bgcolor=\"blueviolet\">" + f.getPadre() + "</td><td bgcolor =\"gainsboro\">" + f.getUltimos() + "</td></tr>\n"
                    + "       <tr><td></td><td bgcolor =\"lightsalmon\">" + f.getNumeroNodo() + "</td><td></td></tr>\n"
                    + "     </table>\n"
                    + "  >];";
        }

    }

    public void imprimirArbol(Nodo f) {
        if (f.getIzquierda() != null) {
            imprimirArbol(f.getIzquierda());
        }
        System.out.println("************************");
        System.out.println("nodo: " + f.getPadre());
        System.out.println("Numero de nodo: " + f.getNumeroNodo());
        System.out.println("Sus primeros son: :" + f.getPrimeros());
        System.out.println("Sus ultimos es: " + f.getUltimos());
        System.out.println("Anulable? " + f.isAnulable());
        System.out.println("id***: " + f.getId());
        System.out.println("tipo***: " + f.getTipo());
        System.out.println("*******************");
//         for(int i=0; i<f.getAnteriores().size(); i++){
//            System.out.print(f.getAnteriores().elementAt(i)+"\t");
//        }
        if (f.getDerecha() != null) {
            imprimirArbol(f.getDerecha());
        }
    }

    public void abrirarchivo(String archivo) {

        try {

            File objetofile = new File(archivo);
            Desktop.getDesktop().open(objetofile);

        } catch (IOException ex) {

            System.out.println(ex);

        }

    }

}
