



public class Fabrica {


    public static void main(String[] args) {

        //Instanciamento.
        Google go = new Google();
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Edge ed = new Edge();


        //Polimorfismo
        Impressora impres = em;
        Digitalizadora digit = em;
        Copiadora copy = em;

        //Chamada dos métodos.
        impres.imprimir();
        digit.digitalizar();
        copy.copiar();
    }
}