package combat;

import personnages.Personnage;

public class AffichageEcran {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Méthodes d'affichage">
    public void afficherDebutCombat() {
        // TODO : Afficher le message du début du combat, tel que montré dans l'énoncé
        System.out.println("\n<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>> Que le combat commence! <<<<<<");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n");
    }
    
    public void afficherSeparateurDeTour() {
        // TODO : Afficher un retour à la ligne, suivi d'une ligne d'astérisques, tel que montré dans l'énoncé
        System.out.println("\n**************************************");
    }

    public void afficherSeparateurInfosPerso() {
        // TODO : Afficher un retour à la ligne, suivi du séparateur "infos personnages", tel que montré dans l'énoncé
        System.out.println("\n-----------------");
        System.out.println("INFOS PERSONNAGE");
        System.out.println("-----------------");
    }

    public void afficheVictoire(Personnage personnage1, Personnage personnage2) {
        // TODO : Afficher le gagnant du combat, tel que montré dans l'énoncé
        if (personnage1.getPointsDeVie()<=0){
            System.out.println(personnage2.getNom() + " gagne le combat !!!");
        }
        else if(personnage2.getPointsDeVie()<=0){
            System.out.println(personnage1.getNom() + " gagne le combat !!!"); 
        }
    }
    // </editor-fold>
}
