package panvdev.wordpfd_pdfword;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Metodos {
    public Metodos() {
    }

    public void crearArchivos(String archivo) {
        File fl = new File(archivo);

        try {
            PrintWriter pw = new PrintWriter(fl);
            pw.close();
        } catch (FileNotFoundException var5) {
            var5.printStackTrace();
        }

    }

    public void escribirArchivo(String archivo, String texto) {
        File fl = new File(archivo);

        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fl, true));
            pw.println(texto);
            pw.close();
            System.out.println("Se agrego contido al archivo");
        } catch (FileNotFoundException var5) {
            var5.printStackTrace(System.out);
        } catch (IOException var6) {
            var6.printStackTrace(System.out);
        }

    }

    public void leerArchivo(String archivo) {
        new File(archivo);

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));

            for(String leer = br.readLine(); leer != null; leer = br.readLine()) {
                System.out.println(leer);
            }

            br.close();
        } catch (FileNotFoundException var5) {
            var5.printStackTrace();
        } catch (IOException var6) {
            var6.printStackTrace(System.out);
        }

    }

    public void ArchivoCarpeta(String carpeta) {
        File fl = new File(carpeta);
        String[] archivo = fl.list();

        for(int i = 0; i < archivo.length; ++i) {
            System.out.println(archivo[i]);
        }

    }

    public void BuscarArchivo(String archivo) {
        File fl = new File(archivo);
        if (fl.exists()) {
            System.out.println("El archivo si existe");
        } else {
            System.out.println("El arhivos no existe");
        }

    }

    public void borrarArchivo(String path){
        File file = new File(path);
        if(file.exists()){
            if(file.delete()){
                System.out.println("");
            }
        }else{
            System.out.println("");
        }
    }

    public void BuscarPalabra(String archivo) throws IOException{
        Scanner nombre = new Scanner (System.in);
        System.out.println("Ingrese una cadena: ");
        String palabra=nombre.nextLine();
        try{
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String leer="";
            int i=0;
            while ((leer=br.readLine())!=null){
                i++;
                if(leer.contains(palabra)){
                    System.out.println("La palabra "+palabra+" fue encontrada en la linea: "+i);
                }
            }
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }

}
