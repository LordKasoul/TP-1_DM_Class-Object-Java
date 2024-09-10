package personnages;

public class Mirmillon extends Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeur & Initialisation">
    public Mirmillon() {
        super();
    }

    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="M�canique de jeu">
    // Redefinir la fonction setNewInitiative random (De 0 a 30)
    @Override
    public void setNewInitiativeRandom() {
        // TODO : Modifier de fa�on al�atoire la valeur INI du personnage jusqu'a 30.
        setInitiative((int) (Math.random() * 30));
    }

    // Redefinri la fonction frapper personnage (boucle for de 2)
    // \-> Si la cible est mort alors afficher message de decapitation
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : R�cup�rer la valeur d'attaque pour ce tour, calculer les d�gats,
        super.frapperPersonnage(personnageCible);
        System.out.println();
        if (personnageCible.pointsDeVie > 0) {
            System.out.println(this.nom + " attaque de nouveau.");
            super.frapperPersonnage(personnageCible);
        } else {
            System.out.println(this.nom + " a decapit� " + personnageCible.nom);
        }

    }
    // </editor-fold>
}
