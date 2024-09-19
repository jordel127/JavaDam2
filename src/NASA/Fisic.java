package NASA;

public class Fisic extends Usuari{
    public int anysExperiència;
    public int edat;
    public String sexe;
    public String adreça;
    public double salari;
    public String titulacioAcademica;
    public String ciutatOnTreballa;


    public Fisic(String nom, String contrasenya, int anysExperiència, int edat, String sexe, String adreça, double salari, String titulacioAcademica, String ciutatOnTreballa) {
        super(nom, contrasenya);
        this.anysExperiència = anysExperiència;
        this.edat = edat;
        this.sexe = sexe;
        this.adreça = adreça;
        this.salari = salari;
        this.titulacioAcademica = titulacioAcademica;
        this.ciutatOnTreballa = ciutatOnTreballa;
    }
}
