
public class Employer extends Personne implements Poste{
 private int id;
 private double salaire;
 public Employer(String nom,String prenom,int annee,double sal,int id){
    super(nom,prenom,annee);
    this.id=id;
    salaire=sal;
 }
  public int getId(){
      return id;
  }
  public double getSal(){
      return salaire;
  }
   public void setId(int a){
    this.id=a;
  }
   public void setSal(double b){
       this.salaire=b;
  }
  public String printInfo(){
      return "Categorie: Employee\nNom: "+super.getNom()+"\nPrenom: "+super.getPrenom()+"\nAnne de naisance: "+super.getAnnee()+"\nId: "+id+"\nSalaire: "+salaire;
  }
  public String infoPost(String poste,int debut){
      return super.getNom()+" "+super.getPrenom()+" occupe le poste de "+poste+" depuis l_annee "+debut;
  }
}
