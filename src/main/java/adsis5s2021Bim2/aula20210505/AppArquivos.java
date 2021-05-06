package adsis5s2021Bim2.aula20210505;

import java.io.File;
import java.io.IOException;

public class AppArquivos {
	
	public static void main(String[] args) throws IOException {
		File diret�rio = new File("/qualquer");
		
		listarArquivosDoDiret�rio(diret�rio);
		long tamanhoEmBytesDiret�rio = calcularTamanhoEmBytesDoDiret�rio(diret�rio);
		System.out.println("Tamanho do diret�rio=" + tamanhoEmBytesDiret�rio);
	}
	
	private static long calcularTamanhoEmBytesDoDiret�rio(File diret�rio) {
		long tamanho = 0;
		File[] arquivosDoDiret�rio = diret�rio.listFiles();
		for (File arquivo : arquivosDoDiret�rio) {
			tamanho += arquivo.length();
		}		
		return tamanho;
	}

	public static void listarArquivosDoDiret�rio(File diret�rio) {
		File[] arquivosDoDiret�rio = diret�rio.listFiles();
		for (File arquivo : arquivosDoDiret�rio) {
			System.out.println(arquivo.getName() + " #tamanho=" + arquivo.length() + "bytes");
		}		
	}

}
