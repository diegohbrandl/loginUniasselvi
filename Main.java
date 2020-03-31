
public class Main {

	public static void main(String[] args) {
		PessoaFisica pessoa1 = new PessoaFisica();
		PessoaFisica pessoa2 = new PessoaFisica();
		pessoa1.setNome("Diego hartwig brandl");
		pessoa1.setCpf("09834567844");
		System.out.printf("%s%s\n ", "Nome = ", pessoa1.getNome() );
		System.out.printf("%s%s\n\n","Cpf", pessoa1.getCpf());

		pessoa2.setNome("Janaina Silva Brandl");
		pessoa2.setCpf("89745678324");
		System.out.printf("%s%s\n ", "Nome = ", pessoa2.getNome() );
		System.out.printf("%s%s\n\n","Cpf", pessoa2.getCpf());
		
	}

}
