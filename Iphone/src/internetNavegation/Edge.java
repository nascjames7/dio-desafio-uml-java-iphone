package internetNavegation;

public class Edge implements InternetNavegation {
    @Override
    public void exibirPagina(String url) { System.out.println("Exibindo uma página pelo edge.");

    }

    @Override
    public void adicionarNovaAba() { System.out.println("Adicionando nova aba pelo edge.");

    }

    @Override
    public void atualizarPagina() { System.out.println("Atualizando uma determinada página pelo edge.");
    }
}


