L’écriture du programme est basée sur la gestion d'une école

# STRUCTURE DES CLASSES:

1. Personne _class abstract_:
   -nom: String
   -prenom: String
   -annee: int
   +printInfo(): _abstract method_

2. Poste _interface_
   +infoPost() _abstract method_

3. Etudiant _herite de Personne_
   -matricule: int
   -filiere: String

4. Employer _herite de personne_, _implemente l'interface Poste_
   -id: int
   -salaire: double

# LA CLASS MAIN (class principal)

    -On crée un tableau des employees et un tableau des étudiants
    -On insert les employees et les étudiants dans les indices de tableaux à partir de ce constructeurs
    -On affichages les etudiants, les employees avec leur postes.
