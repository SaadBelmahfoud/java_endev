public class Etudiant extends Personne {
    private int cne;

    public int getCne() {
        return cne;
    }

    public void setCne(int cne) {
        this.cne = cne;
    }



    public Etudiant (String nom,String prenom, int age, int cne){
        super(nom,prenom,age);
        this.cne = cne;
    }


    public int getAge() {
        return super.getAge();
    }
    @Override
    public String toString(){
        return super.toString() +"Cne: "+this.cne;
    }
}
