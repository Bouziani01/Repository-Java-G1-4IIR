package Package;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListePersonnes {
    private List<Personne> listePersonnes;

    // Constructeur initialisant la liste
    public ListePersonnes() {
        listePersonnes = new ArrayList<>();
    }

    // Fonction pour ajouter des personnes à la liste
    public void ajouterPersonne(Personne personne) {
        listePersonnes.add(personne);
    }

    // Fonction pour afficher la liste (ligne par ligne)
    public void afficherListe() {
        for (Personne personne : listePersonnes) {
            System.out.println(personne.toString());
        }
    }

    // Fonction pour parcourir la liste avec un itérateur
    public void parcourirListeAvecIterateur() {
        Iterator<Personne> iterateur = listePersonnes.iterator();
        while (iterateur.hasNext()) {
            Personne personne = iterateur.next();
            System.out.println(personne.toString());
        }
    }

    // Fonction pour insérer un élément dans la liste à une position donnée
    public void insererElement(int index, Personne personne) {
        listePersonnes.add(index, personne);
    }

    // Fonction pour récupérer un élément de la liste à une position donnée
    public Personne recupererElement(int index) {
        if (index >= 0 && index < listePersonnes.size()) {
            return listePersonnes.get(index);
        } else {
            System.out.println("Index invalide.");
            return null;
        }
    }

    // Fonction pour supprimer un élément de la liste
    public void supprimerElement(Personne personne) {
        listePersonnes.remove(personne);
    }

    // Fonction pour rechercher un élément dans la liste
    public boolean rechercherElement(Personne personne) {
        return listePersonnes.contains(personne);
    }

    // Fonction pour trier la liste
    public void trierListe() {
        Collections.sort(listePersonnes);
    }

    // Fonction pour copier la liste dans un nouveau tableau
    public List<Personne> copierListeDansTableau() {
        return new ArrayList<>(listePersonnes);
    }


    // Fonction pour mélanger les éléments de la liste
    public void melangerListe() {
        Collections.shuffle(listePersonnes);
    }

    // Fonction pour inverser les éléments de la liste
    public void inverserListe() {
        Collections.reverse(listePersonnes);
    }

    // Fonction pour extraire une partie de la liste
    public List<Personne> extrairePartieListe(int debut, int fin) {
        return listePersonnes.subList(debut, fin);
    }

    // Fonction pour comparer deux listes
    public boolean comparerListes(List<Personne> autreListe) {
        return listePersonnes.equals(autreListe);
    }

    // Fonction pour échanger deux éléments dans la liste
    public void echangerElements(int index1, int index2) {
        Collections.swap(listePersonnes, index1, index2);
    }

    // Fonction pour vider la liste
    public void viderListe() {
        listePersonnes.clear();
    }

    // Fonction pour tester si la liste est vide
    public boolean estVide() {
        return listePersonnes.isEmpty();
    }

}

