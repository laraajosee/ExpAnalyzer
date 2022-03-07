/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores;

import java.util.LinkedList;
import java.util.List;
import analizadores.Nodo;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Vector;

public class arbol {

    int contador = 1;
    int contadorID=0;
    Nodo nodo = new Nodo();
    String siguientes;
    String cabecera = "";
    int cabeceraINT = 0;

    public void contar(List hola) {
        System.out.println(hola);
        List<Nodo> lista = new LinkedList<Nodo>();
        lista = hola;
        for (Nodo f : lista) {
            System.out.println("Empezando a imporir arbol afuera de CUP");
            llenarARbol(f);
            //System.out.println(" padre" +f.getPadre() + " hijo iz " +f.getIzquierda().getPadre() + " derecha: " + f.getDerecha().getPadre());
            imprimirArbol(f);
            siguientes(f);
            cabecera(f);
            System.out.println("cabecera: "+cabecera);
            dibujarGraphvyz(f);
            r();
            
        }

    }
    public String obtenerCodigoGraphvyz(Nodo f) {
        String texto = "digraph G"
                + "{\n"
                +cabecera;
        System.out.println("obteniendo graphvbyz");
        if(f.getPadre()!= null){
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
            escribirFichero("archivo.txt", obtenerCodigoGraphvyz(f));
            
            ProcessBuilder proceso;
            proceso = new ProcessBuilder("dot", "-Tpng", "archivo.txt", "-o", "archivo.png");
            proceso.redirectErrorStream();
            proceso.start();
            //dot -Tpng sad.txt -o archivo.png

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void r() {
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
            f.setAnteriores(hola);
            f.setSiguientes(Integer.toString(contador));
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
                f.setAnulable(true);
            } else if (f.getIzquierda().isAnulable() == true && f.getDerecha().isAnulable() == false) {
                f.setAnulable(true);
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
                f.setAnulable(false);
            } else if (f.getIzquierda().isAnulable() == true && f.getDerecha().isAnulable() == false) {
                f.setAnulable(false);
            }

        }
        f.setId(contadorID);
        contadorID++;
        

    }
    
    public void siguientes(Nodo f){
        if (f.getIzquierda() != null) {
            siguientes(f.getIzquierda());
        }
    
        if (f.getDerecha() != null) {
            siguientes(f.getDerecha());
        }
        System.out.println(f.getPadre());
        
        
    }
    public void cabecera(Nodo f) {
        if (f.getIzquierda() != null) {
            cabecera(f.getIzquierda());
        }
      
        if (f.getDerecha() != null) {
            cabecera(f.getDerecha());
        }
        System.out.println(f.getPadre());
        //cabecera += f.getPadre();
        
        cabecera += "node"+(String.valueOf(f.getId()))+" [label=\""+f.getPadre()+"\"];\n";
       
         
    }
    
    
    public void imprimirArbol(Nodo f) {
        if (f.getIzquierda() != null) {
            imprimirArbol(f.getIzquierda());
        }
        System.out.println("************************");
        System.out.println("nodo: " + f.getPadre());
        System.out.println("Numero de nodo: " + f.getNumeroNodo());
        System.out.println("Sus anteriores son: :" + f.getAnteriores());
        System.out.println("Sus siguientes es: " + f.getSiguientes());
        System.out.println("Anulable? " + f.isAnulable());
        System.out.println("id***: " + f.getId());

//         for(int i=0; i<f.getAnteriores().size(); i++){
//            System.out.print(f.getAnteriores().elementAt(i)+"\t");
//        }
        if (f.getDerecha() != null) {
            imprimirArbol(f.getDerecha());
        }
    }
    
    
    
}
