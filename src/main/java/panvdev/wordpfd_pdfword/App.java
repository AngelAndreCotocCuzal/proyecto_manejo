package panvdev.wordpfd_pdfword;

import java.io.IOException;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws IOException {

        Scanner op = new Scanner(System.in);
        Scanner nuevo_archivo = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        Scanner carp = new Scanner(System.in);
        Scanner txt = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        //String datos;
        String text;
        String dir = "";


        String archivo = "C:/directorio/nuevo_prueba.txt";

        String carpeta = "";
        String borrar = "C:/proyecto/proyecto.pdf";
        Metodos met = new Metodos();
        main txt_pdf = new main();
        // Escribir en pdf
        // Crear archivo
        // Leer datos de un archivo
        // Ver archivos en una carpeta
        // Buscar un archivo
        // Borrar archivo
        // Buscar Palabra
        // Convertir a pdf

        while(!salir){
            System.out.println("Programa de proyecto de manejo de archivos");
            System.out.println("1. Crear un archivo");
            System.out.println("2. Lectura de archivo");
            System.out.println("3. Lectura de una carpeta");
            System.out.println("4. Escribir en archivo");
            System.out.println("5. Buscar palabra en un archivo");
            System.out.println("6. Salir");
            System.out.println("Introduce un numero: ");
            opcion = op.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del archivo: ");
                    String nombre = leer.nextLine();
                    dir ="C:/proyecto/"+nombre+".pdf";

                    System.out.println("Creando archivo");
                    met.crearArchivos(archivo);

                    txt_pdf.convertir(archivo, dir);
                    System.out.println("Archivo Creado");
                    break;

                case 2:
                    met.leerArchivo(archivo);
                    break;

                case 3:
                    System.out.println("??Que carpeta desea ver?: ");
                    String nomb = carp.nextLine();
                    carpeta = "C:/"+nomb;

                    met.ArchivoCarpeta(carpeta);
                    break;

                case 4:
                    System.out.println("Ingrese el texto que desea escribir: ");
                    text = txt.nextLine();
                    met.escribirArchivo(archivo, text);
                    met.borrarArchivo(borrar);
                    txt_pdf.convertir(archivo, dir);
                    System.out.println("Guardando cambios....");
                    break;
                case 5:
                    met.BuscarPalabra(archivo);
                    break;
                case 6:
                    System.out.println("??Que Tenga un Buen D??a :)!");
                    salir = true;
                    break;


            }
        }

        //met.crearArchivos(archivo);
        //met.escribirArchivo(archivo, "hola estamos escribiendo");
        //met.escribirArchivo(archivo, "linea");
        //met.escribirArchivo(archivo, "a");


        //met.BuscarArchivo(archivo);
        //met.BuscarPalabra(archivo);
        //txt_pdf.convertir(archivo, "C:/directorio/a.pdf");


    }
}
