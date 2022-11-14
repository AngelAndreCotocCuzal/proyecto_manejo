package panvdev.wordpfd_pdfword;
import  java.io.File;

public class tamanio {
    public static long obtieneTamanioArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);

        if (!archivo.exists() || !archivo.isFile())
        {
            System.out.println("Archivo no existe");
            return  -1;
        }
        return archivo.length();
    }
    public static void main(String[] args){
        long tamanio = obtieneTamanioArchivo("C:\\Users\\HP\\eclipse-workspace\\wordpfd_pdfword\\guardartodo.pdf");
        System.out.println("EL Tamaño en bytes es : " + tamanio);
    }
}
