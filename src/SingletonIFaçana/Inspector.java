package SingletonIFaçana;

public class Inspector {
    public String nom;
    public  static Inspector objInspector;

    private Inspector(String nom){
        this.nom = nom;
        System.out.println("Nom del Inspector: " + this.nom);
    }

    public  static  Inspector getInstance(String nom){
        if(objInspector == null){
            objInspector = new Inspector(nom);
        }else{
            System.out.println("Un Inspector ja existeix (Es un objecte de " +
                    "clase "+Inspector.class.getSimpleName()+")");
        }
        return objInspector;
    }

}
