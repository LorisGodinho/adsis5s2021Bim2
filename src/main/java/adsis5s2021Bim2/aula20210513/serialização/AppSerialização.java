package adsis5s2021Bim2.aula20210513.serializa��o;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class AppSerializa��o {
	
	public static void main(String[] args) throws IOException {
		
		Cachorro fiel = new Cachorro("Fiel",  new PastorAlem�o());
		
		ObjectOutputStream output = new ObjectOutputStream(System.out);
		output.writeObject(fiel);
	}

}
