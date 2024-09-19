package SingletonIFaçana;

public class Main {
    public static void main(String[] args) {
        Inspector Gadget = Inspector.getInstance("Gadget");
        Inspector Kurokochi = Inspector.getInstance("Kurokochi");

        Facana facana = new Facana();
        facana.consulta();
    }
}
