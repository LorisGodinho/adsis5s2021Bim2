package adsis5s2021Bim2.aula20210506;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class AppC�piaDeDiret�rios {
	
	public static void main(String[] args) throws Exception {
		String origem = "c:/qualquer";
		String destino = "c:/qualquer-bkp";
		copiarDiret�rio(origem, destino);
		
	}

	private static void copiarDiret�rio(String origem, String destino) throws Exception {
		File diret�rioOrigem = new File(origem);
		File[] arquivosOrigem = diret�rioOrigem.listFiles();
		for (File arquivo : arquivosOrigem) {
			copiarArquivo(arquivo.getCanonicalPath(), destino + "/" + arquivo.getName());
		}		
	}
	
	private static void copiarArquivo(String origem, String destino) throws Exception {
		File arquivoOrigem = new File(origem);
		File arquivoDestino = new File(destino);
		
		//IO: Input/Output
		
		FileInputStream input = new FileInputStream(arquivoOrigem);
		FileOutputStream output = new FileOutputStream(arquivoDestino);
		int dado = input.read();
		while (dado != -1) {
			System.out.print("=");
			output.write(dado);
			dado = input.read();
		}
		input.close();
		output.close();
	}

}
