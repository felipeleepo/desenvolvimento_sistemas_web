import java.util.*;

/**
 *
 * @author Felipe
 */
public class Main {

    public static void main(String[] args) {
        List<Contato> agenda = new ArrayList<Contato>();
        Endereco e = new Endereco("Pico", "Potengi", 1073);
        Contato c =  new Contato("Felipe", "Barbosa", 23, e);
        Contato d =  new Contato("Fernando", "Barbosa", 26, e);

        Scanner s = new Scanner(System.in);
        System.out.println("Digite um CPF para validação:");
        String cpf = s.next();
        PessoaFisica pf = new PessoaFisica("Felipe", "Barbosa", 14, e, cpf);
        System.out.println(pf.verificarCPF());
    }
}
