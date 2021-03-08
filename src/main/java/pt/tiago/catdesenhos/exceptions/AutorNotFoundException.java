package pt.tiago.catdesenhos.exceptions;

public class AutorNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 8802373677615340914L;

	public AutorNotFoundException(long id) {
		super("Nao foi possivel encontrar o autor de id " + id);
	}

}
