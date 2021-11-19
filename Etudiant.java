
public class Etudiant extends Personne{
 private int matricule;
 private String filiere;
 public Etudiant(String nom,String prenom,int annee,int mat,String fil){
    super(nom,prenom,annee);
    matricule=mat;
    this.filiere=fil;
 }
  public int getMat(){
      return matricule;
  }
  public String getFil(){
      return filiere;
  }
   public void setMat(int a){
       matricule=a;
  }
   public void setFil(String b){
       this.filiere=b;
  }
  //method abstraite implementée
  public String printInfo(){
      return "Categorie: Etudiant\nNom: "+super.getNom()+"\nPrenom: "+super.getPrenom()+"\nAnnee de naisance: "+super.getAnnee()+"\nMatricule: "+matricule+"\nFiliere: "+filiere;
  }
}
