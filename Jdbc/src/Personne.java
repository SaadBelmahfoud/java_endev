public class Personne {


    private int id;
    private String nom;
    private String prenom;
    private int age;

    public static int getCount() {
        return count;
    }

    static private int count;

    public Personne(int id,String nom, String prenom, int age){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        count++;
    }

    public Personne(){};

    @Override
    public String toString(){
        return "Id:" + this.id + " Nom: "+ this.nom + " Prenom: "+ this.prenom +" Age: "+ this.age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
