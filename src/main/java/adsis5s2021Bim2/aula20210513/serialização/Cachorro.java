package adsis5s2021Bim2.aula20210513.serializa��o;

import java.io.Serializable;

public class Cachorro implements Serializable {
	private static final long serialVersionUID = 4621016558952724932L;
	private String nome;
	private Ra�a ra�a;

	public Cachorro(String nome, Ra�a ra�a) {
		this.nome = nome;
		this.ra�a = ra�a;
	}

}
