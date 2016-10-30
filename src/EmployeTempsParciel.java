/**
 * Created by HP on 30/10/2016.
 */
public class EmployeTempsParciel extends Employe {

    private double montontH ;
    private final int heures=35;

    public EmployeTempsParciel(String nom,String job){
        super(nom,job);


    }

    public void setMontontH(double montontH){
        this.montontH=montontH;
    }

    public double getMontont() {
        return montontH;
    }

     // les méthodes
    public double calculePaie3(double montontH ){
        setSalaire(montontH*heures);
        return getSalaire();
    }
}
