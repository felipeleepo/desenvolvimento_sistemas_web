public class PessoaFisica extends Contato{
	private String cpf;
	public PessoaFisica(String nome, String sobrenome, int idade, Endereco e, String cpf){
		super(nome, sobrenome, idade, e);
		this.cpf = cpf;
	}

	public String verificarCPF(){
		int[] aux = new int[11]; 

		// SOMA DOS BITS XXX.XXX.XXX-00
		for(int i = 0; i < 11;i++){
			aux[i] = Character.getNumericValue(cpf.charAt(i));
		}
		int d1 = 0;
		int d_aux = 10;

		for(int i = 0; i < 9;i++){
			d1 += aux[i] * d_aux;
			d_aux--;
		}

		// CALCULO E COMPARACAO DO BIT VERIFICADOR 000.000.000-X0
		int bit1 = 11 - (d1 % 11);
		if(bit1 == 10 || bit1 == 11){
			bit1 = 0;
		}
		if(bit1 == aux[9]){
			d_aux = 11;
			d1 = 0;
			for(int i = 0; i < 10;i++){
				d1 += aux[i] * d_aux;
				d_aux--;
			}

			// CALCULO E COMPARACAO DO BIT VERIFICADOR 000.000.000-0X
			int bit2 = 11 - (d1 % 11);
			if(bit2 == 10 || bit2 == 11){
				bit2 = 0;
			}
			if(bit2 == aux[10]){
				return "Válido";
			}else{
				return "Inválido";
			}
		}else{
			return "Inválido";
		}
	}
}