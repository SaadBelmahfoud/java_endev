import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DbMethods {

    public void createPersonne (Personne pers) {
        Connection conn = DbConnexion.getCnx();
        try {
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO personne (id,nom,prenom,age) VALUES ("+pers.getId() +
                    ",'" + pers.getNom() +"','" + pers.getPrenom() + "'," + pers.getAge()+")");


        } catch (Exception e){}
        finally {
            try{
                conn.close();
            } catch (Exception e){}
        }
    }

    public ArrayList<Personne> selectAll () {
        ArrayList<Personne> personneListe = new ArrayList<>();
        Connection conn = DbConnexion.getCnx();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM personne");

            while(rs.next()){
                Personne p = new Personne(rs.getInt("id"), rs.getString("nom"),rs.getString("prenom"),rs.getInt("age"));
                personneListe.add(p);
            }

        } catch (Exception e){}
        finally {
            try{
                conn.close();
            } catch (Exception e){}
        }
        return personneListe;
    }

    public Personne selectById(int id){
        Personne p = null;
        Connection conn = DbConnexion.getCnx();
        try {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM personne where id ="+id+"");
            if(rs.next()){
                p = new Personne(rs.getInt("id"), rs.getString("nom"),rs.getString("prenom"),rs.getInt("age"));
            }
        } catch (Exception e){}
        finally {
            try{
                conn.close();
            } catch (Exception e){}
        }

        return p;
    }

    public void deleteById(int id){
        Connection conn = DbConnexion.getCnx();
        try {

            Statement st = conn.createStatement();
            st.executeUpdate("DELETE FROM personne where id ="+id+"");

        } catch (Exception e){}
        finally {
            try{
                conn.close();
            } catch (Exception e){}
        }
    }
}
