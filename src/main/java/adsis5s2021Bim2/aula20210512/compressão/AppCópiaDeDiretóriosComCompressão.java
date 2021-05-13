package adsis5s2021Bim2.aula20210512.compress�o;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class AppC�piaDeDiret�riosComCompress�o {
	
	public static void main(String[] args) throws Exception {
		String origem = "c:/qualquer";
		String destino = "c:/qualquer-bkp";
		copiarDiret�rio(origem, destino);
		
	}

	private static void copiarDiret�rio(String origem, String destino) throws Exception {
		File diret�rioOrigem = new File(origem);
		File[] arquivosOrigem = diret�rioOrigem.listFiles();
		for (File arquivo : arquivosOrigem) {
			copiarArquivo(arquivo.getCanonicalPath(), destino + "/" + arquivo.getName() + ".gz");
		}		
	}
	
	private static void copiarArquivo(String origem, String destino) throws Exception {
		File arquivoOrigem = new File(origem);
		File arquivoDestino = new File(destino);
		
		//IO: Input/Output
		
		InputStream input = new FileInputStream(arquivoOrigem);
		//FileOutputStream output = new FileOutputStream(arquivoDestino);
		OutputStream output = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream(arquivoDestino)));
		
		byte[] buffer = new byte[10000];
		int controle = input.read(buffer);
		while (controle != -1) {
			output.write(buffer);
			controle = input.read(buffer);
		}
		input.close();
		output.close();
	}

}
