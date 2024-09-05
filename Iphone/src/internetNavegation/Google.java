package internetNavegation;

public class Google implements InternetNavegation {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo uma página pelo google.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba pelo google.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando uma determinada página pelo google.");
    }
}
