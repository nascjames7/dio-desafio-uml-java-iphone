package telephoneMachine;

public class sansung implements TelephoneMachine {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para um determinado numero pela sansung.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma determinada ligação pala sansung.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pala sansung.");
    }
}
