public class Contato{
	private String nome, sobrenome;
	private int idade;
	private Endereco end;

	public Contato (String nome, String sobrenome, int idade, Endereco end){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.end = end;
	}

	public String toString(){
		return "Nome: " + nome + " " + sobrenome + "\nIdade: " + idade +  end.toString();
	}
}