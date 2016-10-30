/**
 * Created by HP on 30/10/2016.
 */
public class Employe {


        private String nom;
        private String job;
        private double salaire ;


        // constructure
        public Employe (String nom, String job){
            this.nom=nom;
            this.job=job;
        }

        public String getNom() {
            return nom;
        }

        public String getJob() {
            return job;
        }

        public double getSalaire() {
            return salaire;
        }

        public void setSalaire(double salaire) {
            this.salaire = salaire;
        }

        // les méthodes

        public void chequePaie(){
            System.out.print("payer a l'ordrede" + nom + "(" + job + ")" + "***" + salaire + "DA");
        }
        public double calculePaie(){
            return salaire;
        }
    }






