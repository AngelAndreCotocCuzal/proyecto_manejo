package panvdev.wordpfd_pdfword;

public class App 
{
    public static void main(String[] args) {

        String archivo = "C:/directorio/nuevo_prueba.txt";
        String carpeta = "C:/directorio/";
        String borrar = "C:/directorio/a.pdf";
        Metodos met = new Metodos();
        main txt_pdf = new main();
        
        //met.crearArchivos(archivo);
        //met.escribirArchivo(archivo, "hola estamos escribiendo");
        //met.escribirArchivo(archivo, "linea");
        met.escribirArchivo(archivo, "a");
        met.leerArchivo(archivo);
        met.ArchivoCarpeta(carpeta);
        met.BuscarArchivo(archivo);
        met.borrarArchivo(borrar);
        met.BuscarPalabra(archivo);
        txt_pdf.convertir(archivo, "C:/directorio/a.pdf");
        System.out.println("Convirtiendo a pdf");


    }
}
