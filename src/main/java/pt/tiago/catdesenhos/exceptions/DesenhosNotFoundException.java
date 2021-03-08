package pt.tiago.catdesenhos.exceptions;

public class DesenhosNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 8802373677615340914L;
	
	public DesenhosNotFoundException(long id) {
		super("Não foi possivel encontrar o desenho de id "+ id);
	}
}