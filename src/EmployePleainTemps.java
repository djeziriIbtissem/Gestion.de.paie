/**
 * Created by HP on 30/10/2016.
 */
public class EmployePleainTemps extends Employe {

    private double montont;
    private double prime;

    // constructeur
   public EmployePleainTemps(String nom, String job){
       super (nom,job);

   }
   // méthode
   public double calculePaie2 (double montont, double prime){
       setSalaire(montont*4+prime);
       return getSalaire();
   }


    }


