package Package;

//Classe Personne
public class Personne implements Comparable<Personne> {
 private String nom;
 private int age;

 // Constructeur avec paramètres

 public Personne(String nom, int age) {
	super();
	this.nom = nom;
	this.age = age;
}

// Redéfinition de la méthode toString
 @Override
 public String toString() {
		return "Personne [nom=" + nom + ", age=" + age + "]";
	}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

// Redéfinition de la méthode equals
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     Personne personne = (Personne) obj;
     return age == personne.age && nom.equals(personne.nom);
 }

 // Redéfinition de la méthode clone
 @Override
 public Personne clone() {
     return new Personne(this.nom, this.age);
 }

 // Implémentation de l'interface Comparable
 @Override
 public int compareTo(Personne other) {
     return this.nom.compareTo(other.nom);
 }
}

