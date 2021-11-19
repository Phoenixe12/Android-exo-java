    public abstract class Personne{ //class abstraite
    private String nom;
    private String prenom;
    private int annee;
    public abstract String printInfo(); //declaration de la method abstraite
    public Personne(String nom,String prenom,int annee){
        this.nom=nom;
        this.prenom=prenom;
        this.annee=annee;
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public int getAnnee(){
        return this.annee;
    }
}
