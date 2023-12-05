package Package;

public class Main {

    public static void main(String[] args) {
        // Tests avec la classe Personne
        Personne p1 = new Personne("Burcu", 30);
        Personne p2 = new Personne("Hande", 25);

        System.out.println("Informations de p1 :");
        System.out.println(p1);

        int comparaison = p1.compareTo(p2);
        if (comparaison > 0) {
            System.out.println("p1 est après p2 dans l'ordre alphabétique.");
        } else if (comparaison < 0) {
            System.out.println("p1 est avant p2 dans l'ordre alphabétique.");
        } else {
            System.out.println("p1 et p2 ont le même nom.");
        }

        Personne cloneP1 = p1.clone();
        System.out.println("Clone de p1 : " + cloneP1);

        // Tests avec la classe Employe
        Employe employe1 = new Employe("John", 35, 75000);
        Employe employe2 = new Employe("Jane", 28, 60000);

        System.out.println("\nInformations de l'employé 1 :");
        System.out.println(employe1);

        boolean memePersonne = employe1.equals(employe2);
        if (memePersonne) {
            System.out.println("Les employés 1 et 2 sont la même personne.");
        } else {
            System.out.println("Les employés 1 et 2 sont des personnes différentes.");
        }

        Employe cloneEmploye = employe1.clone();
        System.out.println("Clone de l'employé 1 : " + cloneEmploye);

        // Tests avec la classe ListePersonnes
        ListePersonnes liste = new ListePersonnes();

        Personne personne1 = new Personne("Alice", 30);
        Personne personne2 = new Personne("Bob", 25);
        Personne personne3 = new Personne("Charlie", 35);

        liste.ajouterPersonne(personne1);
        liste.ajouterPersonne(personne2);
        liste.ajouterPersonne(personne3);

        System.out.println("\nListe initiale :");
        liste.afficherListe();

        liste.trierListe();
        System.out.println("\nListe après tri :");
        liste.afficherListe();

        Personne recuperee = liste.recupererElement(1);
        System.out.println("\nPersonne récupérée à l'index 1 : " + recuperee);

        liste.supprimerElement(personne2);
        System.out.println("\nListe après suppression de Bob :");
        liste.afficherListe();

        boolean vide = liste.estVide();
        if (vide) {
            System.out.println("\nLa liste est vide.");
        } else {
            System.out.println("\nLa liste n'est pas vide.");
        }

        // Tests avec la classe TabPersonnes
        Personne[] personnes = {personne1, personne2, personne3};
        TabPersonnes tabPersonnes = new TabPersonnes(5);

        tabPersonnes.remplirTableau(personnes);

        System.out.println("\nTableau initial :");
        tabPersonnes.afficherElements();

        tabPersonnes.trierTableau();
        System.out.println("\nTableau après tri :");
        tabPersonnes.afficherElements();

        Personne nouvellePersonne = new Personne("David", 40);
        tabPersonnes.ajouterPersonne(nouvellePersonne);
        System.out.println("\nTableau après ajout de David :");
        tabPersonnes.afficherElements();

        tabPersonnes.supprimerPersonne(1);
        System.out.println("\nTableau après suppression de la personne à l'index 1 :");
        tabPersonnes.afficherElements();

        int nombreElements = tabPersonnes.compterElements();
        System.out.println("\nNombre d'éléments non nuls dans le tableau : " + nombreElements);

        Personne plusGrand = tabPersonnes.obtenirPlusGrand();
        System.out.println("\nPersonne avec le nom le plus grand : " + plusGrand);

        Personne[] autreTab = {personne1, personne2, personne3};
        boolean egalite = tabPersonnes.testerEgalite(autreTab);
        System.out.println("\nLes deux tableaux sont-ils égaux ? " + egalite);
    }
}
