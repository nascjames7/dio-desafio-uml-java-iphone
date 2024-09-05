package telephoneMachine;

public class Motorolla implements TelephoneMachine {

    @Override
    public void ligar(String numero) { System.out.println("Ligando para um determinado numero pela motorolla.");

    }

    @Override
    public void atender() { System.out.println("Atendendo uma determinada ligação pala motorolla.");

    }

    @Override
    public void iniciarCorreioVoz() { System.out.println("Iniciando correio de voz pala motorolla.");

    }
}

