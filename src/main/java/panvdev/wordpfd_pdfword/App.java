package panvdev.wordpfd_pdfword;

public class App 
{
    public static void main(String[] args) {

        String archivo = "C:/directorio/nuevo_prueba.txt";
        String carpeta = "C:/directorio/";
        Metodos met = new Metodos();
        main txt_pdf = new main();
        
        met.crearArchivos(archivo);
        met.escribirArchivo(archivo, "xd");
        met.escribirArchivo(archivo, "cambiando datos");
        met.escribirArchivo(archivo, "hola");
        met.leerArchivo(archivo);
        met.ArchivoCarpeta(carpeta);
        met.BuscarArchivo(archivo);
        txt_pdf.convertir(archivo, "guardartodo.pdf");
        System.out.println("Convirtiendo a pdf");


    }
}
