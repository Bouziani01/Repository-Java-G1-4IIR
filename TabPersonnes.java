package Package;

import java.util.Arrays;

public class TabPersonnes {
    private Personne[] tableauPersonnes;

    // Constructeur pour initialiser le tableau
    public TabPersonnes(int taille) {
        tableauPersonnes = new Personne[taille];
    }

    // Méthode pour remplir le tableau avec des personnes
    public void remplirTableau(Personne[] personnes) {
    	tableauPersonnes = new Personne[personnes.length];

        for (int i = 0; i < personnes.length; i++) {
            tableauPersonnes[i] = personnes[i];
        }
    }

    // Méthode pour trier les éléments du tableau
    public void trierTableau() {
        Arrays.sort(tableauPersonnes);
    }

    // Méthode pour ajouter une personne au tableau
    public void ajouterPersonne(Personne nouvellePersonne) {
        for (int i = 0; i < tableauPersonnes.length; i++) {
            if (tableauPersonnes[i] == null) {
                tableauPersonnes[i] = nouvellePersonne;
                return; // Sortie de la boucle une fois que la personne est ajoutée
            }
        }
        System.out.println("Le tableau est plein. Impossible d'ajouter une nouvelle personne.");
    }

    public void supprimerPersonne(int index) {
        if (index >= 0 && index < tableauPersonnes.length) {
            tableauPersonnes[index] = null;
            // Déplacer les éléments suivants vers la gauche pour combler le trou
            for (int i = index; i < tableauPersonnes.length - 1; i++) {
                tableauPersonnes[i] = tableauPersonnes[i + 1];
            }
            tableauPersonnes[tableauPersonnes.length - 1] = null; // Dernier élément à null
        } else {
            System.out.println("Index invalide. Impossible de supprimer la personne.");
        }
    }

    // Méthode pour compter le nombre d'éléments non nuls dans le tableau
    public int compterElements() {
        int count = 0;
        for (Personne personne : tableauPersonnes) {
            if (personne != null) {
                count++;
            }
        }
        return count;
    }

    // Méthode pour inverser l'ordre du tableau
    public void inverserOrdreTableau() {
        Collections.reverse(Arrays.asList(tableauPersonnes));
    }

    // Méthode pour afficher les éléments du tableau
    public void afficherElements() {
        for (Personne personne : tableauPersonnes) {
            if (personne != null) {
                System.out.println(personne.toString());
            }
        }
    }

    // Méthode pour obtenir l'élément le plus grand (en fonction de la comparaison des noms)
    public Personne obtenirPlusGrand() {
        if (tableauPersonnes.length > 0) {
            Personne plusGrand = tableauPersonnes[0];
            for (Personne personne : tableauPersonnes) {
                if (personne != null && personne.compareTo(plusGrand) > 0) {
                    plusGrand = personne;
                }
            }
            return plusGrand;
        }
        return null;
    }

    // Méthode pour tester l'égalité de deux tableaux
    public boolean testerEgalite(Personne[] othertab) {
        return Arrays.equals(tableauPersonnes, othertab);
    }

}

