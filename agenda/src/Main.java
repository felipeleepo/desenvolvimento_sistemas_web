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
        PessoaFisica pf = new PessoaFisica("Felipe", "Barbosa", 23, e, "09951242480");
        System.out.println(pf.verificarCPF());
    }
}
