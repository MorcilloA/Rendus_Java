import java.util.*;

public class Bataille{

    public static void main(String[] args){
         
        ArrayList<Carte> fullPaquet = new ArrayList<Carte>();
        ArrayList<Carte> paquet1 = new ArrayList<Carte>();
        ArrayList<Carte> paquet2 = new ArrayList<Carte>();
        
        int tour = 1;

        // public void print(String string){
        //     System.out.println(string);
        // }

        int cpt=0;
        for(int i=0; i<4; i++){
            for(int j=0; j<13; j++){
                fullPaquet.add(new Carte(j,i));
                // System.out.println(fullPaquet.get(cpt).getAll());
                cpt++;
            }
        }

        Collections.shuffle(fullPaquet);
        // System.out.println("------------------------------------------------------");
        // for(int i=0; i<fullPaquet.size(); i++){
            // System.out.println(fullPaquet.get(i).getAll());
        // }

        for(int i=0; i<=51; i++){
            if( i <=25){
                paquet1.add(fullPaquet.get(i));
            }else{
                paquet2.add(fullPaquet.get(i));
            }
        }

        Joueur P1 = new Joueur(paquet1);
        Joueur P2 = new Joueur(paquet2);

        System.out.println(P1.getPoint());
        System.out.println(P2.getPoint());

        // for(int i=0; i<P1.getPaquet().size(); i++){
        //     System.out.println("paquet joueur 1 "+P1.getPaquet().get(i).getAll());
        // }
        //     System.out.println("-----------------------------------------");

        // for(int i=0; i<P2.getPaquet().size(); i++){
        //     // System.out.println("-----------------------------------------");
        //     // System.out.println(P2.getPaquet().get(i).getValeur());
        //     System.out.println("paquet joueur 2 "+P2.getPaquet().get(i).getAll());
        //     // System.out.println(P2.getPaquet().get(i).getIndexValue());
        // }

        while(P1.getPoint() > 0 && P2.getPoint() > 0){
            ArrayList<Carte> table = new ArrayList<Carte>();
            System.out.println("---------------------------------");
            System.out.println("Tour "+tour);
            Carte Carte1 = P1.TirerCarte();
            Carte Carte2 = P2.TirerCarte();
            table.add(Carte1);
            table.add(Carte2);
            // System.out.println(P1.getPoint());
            // System.out.println(P2.getPoint());

            System.out.println("Les joueurs tirent leurs cartes :");

            System.out.println("Le Joueur 1 a tiré un "+Carte1.getAll());
            System.out.println("Le Joueur 2 a tiré un "+Carte2.getAll());

            if(Carte1.getIndexValue() > Carte2.getIndexValue()){
                System.out.println("Le Joueur 1 remporte le tour.");
                P1.RetakeCard(table);
            }else if(Carte1.getIndexValue() < Carte2.getIndexValue()){
                System.out.println("Le Joueur 2 remporte le tour.");
                P2.RetakeCard(table);
            }else{
                System.out.println("!!! BATAILLE !!!");
                System.out.println("            ---------");
                int BTour = 0;
                while(Carte1.getIndexValue() == Carte2.getIndexValue()){


                    // for(int i=0; i<table.size(); i++){
                    //     System.out.println("En jeu il y a "+table.get(i).getAll());
                    // }
                    if(P1.getPoint() < 2){
                        System.out.println("Le joueur 2 remporte la partie !");
                    }
                    if(P2.getPoint() < 2){
                        System.out.println("Le joueur 1 remporte la partie !");
                    }


                    System.out.println("________tour de bataille "+BTour+"_______");
                    Carte hidden1 = P1.TirerCarte();
                    Carte hidden2 = P2.TirerCarte();
                    // System.out.println("Joueur 1 face cachée "+hidden1.getAll());
                    // System.out.println("Joueur 2 face cachée "+hidden2.getAll());
                    System.out.println("Joueur 1 tire une carte face cachée");
                    System.out.println("Joueur 2 tire une carte face cachée ");
                    table.add(hidden1);
                    table.add(hidden2);

                    Carte1 = P1.TirerCarte();
                    Carte2 = P2.TirerCarte();
                    System.out.println("Pour la bataille le Joueur 1 tire un "+Carte1.getAll());
                    System.out.println("Pour la bataille le Joueur 2 tire un "+Carte2.getAll());
                    
                    table.add(Carte1);
                    table.add(Carte2);
                    BTour++;
                }
                if(Carte1.getIndexValue() > Carte2.getIndexValue()){
                    System.out.println("Le Joueur 1 remporte le tour.");
                    P1.RetakeCard(table);
                }else{
                    System.out.println("Le Joueur 2 remporte le tour.");
                    P2.RetakeCard(table);
                }

            }

            System.out.println("Il reste "+P1.getPoint()+" cartes au joueur 1");
            System.out.println("Il reste "+P2.getPoint()+" cartes au joueur 2");
            tour++;
        }

        if(P1.getPoint() == 0){
            System.out.println("Le joueur 2 remporte la partie !");
        }else{
            System.out.println("Le joueur 1 remporte la partie !");
        }


    }

}