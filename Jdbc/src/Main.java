import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main (String args[]){
        try{

            Connection conn = DbConnexion.getCnx();
            Statement st = conn.createStatement();

            //st.executeUpdate("INSERT INTO personne (nom,prenom,age) VALUES ('test','test',20)");
            st.executeUpdate("UPDATE personne SET nom = 'Belmahfoud' WHERE id = 1");
            st.executeUpdate("UPDATE personne SET nom = 'TOTO' WHERE id = 2");
            st.executeUpdate("UPDATE personne SET prenom = 'TOTO' WHERE id = 2");
            st.executeUpdate("UPDATE personne SET nom = 'Jacko' WHERE id = 3");
            st.executeUpdate("UPDATE personne SET prenom = 'Jacko' WHERE id = 3");
            ResultSet rs = st.executeQuery("SELECT * FROM personne");
            while(rs.next()){
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                int age = rs.getInt("age");

                System.out.println(nom + " " + prenom + " " + age);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
