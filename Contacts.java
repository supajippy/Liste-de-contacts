public class Contacts {

    private String Prenom="";
    private String Nom="";
    static int conts=0;

    public Contacts() {conts++;}

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {

        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    Adresse ad1=new Adresse();
    Occupation oc=new Occupation();
    Entreprise en=new Entreprise();
    Telephone tel[]=new Telephone[10];
}
