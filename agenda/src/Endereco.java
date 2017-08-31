public class Endereco{
	private String rua, bairro;
	private int numero;

	public Endereco(String rua, String bairro, int numero){
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
	}

	public String toString(){
		return "\nEndereço: Rua " + rua + ", " + numero + ", bairro " + bairro;
	}
}