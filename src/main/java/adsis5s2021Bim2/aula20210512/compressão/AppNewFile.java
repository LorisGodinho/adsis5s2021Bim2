package adsis5s2021Bim2.aula20210512.compress�o;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.time.Instant;
import java.util.zip.GZIPOutputStream;

public class AppNewFile {
	
	public static void main(String[] args) throws Exception  {
		File novoDiret�rio = new File("c:/novoDiret�rio");
		novoDiret�rio.mkdir();
		
		File novoArquivo = new File(novoDiret�rio.getCanonicalPath() + "/" + "novo.txt.gz");
		novoArquivo.createNewFile();
		
		long start = System.currentTimeMillis();
		
		OutputStream output = 
			new BufferedOutputStream(
				new GZIPOutputStream(
						new FileOutputStream(novoArquivo)));
		//OutputStream output = new FileOutputStream(novoArquivo);
		
		for (int i = 0; i < 5000000; i++) {
			output.write("Ol� queridos formandos 2021 de ADSIS UniCesumar!\n".getBytes());
		}
		output.close();
		System.out.println("Pronto. " + (System.currentTimeMillis() - start)/1000.0);
	}

}
