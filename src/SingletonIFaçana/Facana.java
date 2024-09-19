package SingletonIFaçana;

public class Facana {
    private Botiga botiga = new Botiga();

    public void consulta(){
        System.out.println("El producte "+botiga.NomDeProductes()+" val " +
                ""+botiga.preuDeProducte("Boloncho")+" euros");
    }
}
