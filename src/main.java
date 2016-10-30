/**
 * Created by HP on 30/10/2016.
 */ import java.util.ArrayList;
public class main {

    public static void main(String[] args) {
        ArrayList<Employe> listeEmploye = new ArrayList<>();


        Employe E1 = new Employe("salim", "PDG");
        EmployeTempsParciel E2 = new EmployeTempsParciel("ibtissem", "secrétaire ");
        EmployePleainTemps E3 = new EmployePleainTemps("Abdelhalim", "agent");

        listeEmploye.add(E1);
        listeEmploye.add(E2);
        listeEmploye.add(E3);


        E1.calculePaie();
        E1.chequePaie();
       System.out.print( "\n");

        E2.calculePaie3(1500);
        E2.chequePaie();
        System.out.print( "\n");

        E3.calculePaie2(200,2000);
        E3.chequePaie();

    }
}