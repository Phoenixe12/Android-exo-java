public class Main{
    public static void main(String arg[]){
        // Creation des tableaux employeurs et etudiants
        Etudiant [] etudiants = new Etudiant[2];
        Employer [] employees = new Employer[2];
        // Insertion des étudiants
        employees[0] = new Employer ("DAMALA","El Anewar",2020,1500000,1);
        employees[1] = new Employer ("GATA","Houdjath",2021,500000,2);
        // Insertion des employees
        etudiants[0] = new Etudiant ("AHOUANDJINOU","Prisca",2020,1,"IRT");
        etudiants[1] = new Etudiant ("AWO","Victor",2021,2,"IRT");
        etudiants[0].setFil("Gestion");
        // Affichage des employees et des etudiants
        System.out.println("Affiche des Etudiants");
        for(Etudiant a: etudiants){
            System.out.println(a.printInfo()+"\n");
        }
        System.out.println("Affiche des Employes");
        for(Employer a: employees){
            System.out.println(a.printInfo()+"\n");
        }
        // Afffichage des postes des employeurs
        System.out.println(employees[1].infoPost("Secretaire de finance",2012));
        System.out.println(employees[0].infoPost("Directeur de RRHH",2010)+"\n");
    } 
}