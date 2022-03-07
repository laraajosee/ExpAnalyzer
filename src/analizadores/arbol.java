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
            primeros(f);
            ultimos(f);
            imprimirArbol(f);
            
            cabecera(f);
            //System.out.println("cabecera: "+cabecera);
            dibujarGraphvyz(f);
            r();
            
        }

    }
    public String obtenerCodigoGraphvyz(Nodo f) {
        String texto = "digraph G"
                + "{\n"
                +"bgcolor=\"turquoise\" "
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
    
    public void primeros(Nodo f){
        if (f.getIzquierda() != null) {
            primeros(f.getIzquierda());
        }
    
        if (f.getDerecha() != null) {
            primeros(f.getDerecha());
        }
        //System.out.println(f.getPadre());
        if (f.getPadre().equalsIgnoreCase(".")) {
            if(f.getIzquierda().isAnulable()== true){
                String primeros = f.getIzquierda().getPrimeros()+","+f.getDerecha().getPrimeros();
                f.setPrimeros(primeros);
            }else{
                f.setPrimeros(f.getIzquierda().getPrimeros());
            }
        } else if (f.getPadre().equalsIgnoreCase("*")) {
            f.setPrimeros(f.getIzquierda().getPrimeros());
           
        } else if (f.getPadre().equalsIgnoreCase("+")) {
             f.setPrimeros(f.getIzquierda().getPrimeros());
           
        } else if (f.getPadre().equalsIgnoreCase("?")) {
             f.setPrimeros(f.getIzquierda().getPrimeros());
        } else if (f.getPadre().equalsIgnoreCase("|")) {
            String primeros = f.getIzquierda().getPrimeros()+","+f.getDerecha().getPrimeros();
            f.setPrimeros(primeros);
          
        }
        
        
    }
    
    public void ultimos(Nodo f){
        if (f.getIzquierda() != null) {
            ultimos(f.getIzquierda());
        }
    
        if (f.getDerecha() != null) {
            ultimos(f.getDerecha());
        }
        //System.out.println(f.getPadre());
        if (f.getPadre().equalsIgnoreCase(".")) {
            if(f.getDerecha().isAnulable()== true){
                String anteriores = f.getIzquierda().getUltimos()+","+f.getDerecha().getUltimos();
                f.setUltimos(anteriores);
            }else{
                f.setUltimos(f.getIzquierda().getUltimos());
            }
        } else if (f.getPadre().equalsIgnoreCase("*")) {
            f.setUltimos(f.getIzquierda().getUltimos());
           
        } else if (f.getPadre().equalsIgnoreCase("+")) {
             f.setUltimos(f.getIzquierda().getUltimos());
           
        } else if (f.getPadre().equalsIgnoreCase("?")) {
              f.setUltimos(f.getIzquierda().getUltimos());
        } else if (f.getPadre().equalsIgnoreCase("|")) {
            String ultimos = f.getIzquierda().getUltimos()+","+f.getDerecha().getUltimos();
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
     
        if(f.getTipo() == "id"){
            if(f.getPadre().equals(("\" \""))){
                cabecera += "node"+(String.valueOf(f.getId()))+" [label=\"\\\""+" "+"\\\"\"];\n";
            }else{
                cabecera += "node"+(String.valueOf(f.getId()))+" [label="+f.getPadre()+"];\n";
            }
            
        }else{
            cabecera += "node"+(String.valueOf(f.getId()))+" [label=\""+f.getPadre()+"\"];\n";
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
    
    
    
}
