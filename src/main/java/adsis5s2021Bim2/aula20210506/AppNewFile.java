package adsis5s2021Bim2.aula20210506;

import java.io.File;

public class AppNewFile {
	
	public static void main(String[] args) throws Exception  {
		File novoDiret�rio = new File("c:/novoDiret�rio");
		novoDiret�rio.mkdir();
		
		File novoArquivo = new File(novoDiret�rio.getCanonicalPath() + "/" + "novo.txt");
		novoArquivo.createNewFile();
	}

}
