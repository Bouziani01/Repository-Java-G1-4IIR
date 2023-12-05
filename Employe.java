package Package;

public class Employe extends Personne {
    private double salaire;

    // Constructeur avec paramètres
    public Employe(String nom, int age, double salaire) {
		super(nom, age);
		this.salaire = salaire;
	}
   
	// Redéfinition de la méthode toString
    @Override
    public String toString() {
        return super.toString() + ", Salaire : " + salaire;
    }


	// Redéfinition de la méthode equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Employe employe = (Employe) obj;
        return Double.compare(employe.salaire, salaire) == 0;
    }

    // Redéfinition de la méthode clone
    @Override
    public Employe clone() {
        return new Employe(this.getNom(), this.getAge(), this.salaire);
    }

	
}
