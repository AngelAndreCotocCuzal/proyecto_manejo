package panvdev.wordpfd_pdfword;

import com.spire.pdf.PdfDocument;
import com.spire.doc.Document;
import com.spire.doc.FileFormat;
import panvdev.wordpfd_pdfword.interfaces.ConversionDocumeto;


public class main implements ConversionDocumeto{
	
	@Override
	public void convertir(String ruta, String nombreDestino) {
		Document word = new Document(ruta);
		word.saveToFile(nombreDestino, FileFormat.PDF);
		
	}

}


