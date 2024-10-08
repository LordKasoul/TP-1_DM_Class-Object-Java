package personnages;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    String nom;
    int pointsDeVie;
    int valeurMaxAttaque;
    int valeurDefense;
    int initiative;
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.pointsDeVie = pvs;
        this.initiative = ini;
    }

    public Personnage() {
        this.nom = "";
        this.valeurMaxAttaque = 0;
        this.valeurDefense = 0;
        this.pointsDeVie = 0;
        this.initiative = 0;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Les getters
     public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }

    // TODO : Les setters
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setPointsDeVie(int pointsDeVie) {
        if (pointsDeVie >= 0){
        this.pointsDeVie = pointsDeVie;
        }
        else{
            this.pointsDeVie = 0;
        }
    }
    
    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }
    
    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }
     public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="M�canique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println("\n"+this.nom);
        System.out.println("\tAttaque : " + this.valeurMaxAttaque);
        System.out.println("\tDefense : " + this.valeurDefense);
        System.out.println("\tPoints de vie : " + this.pointsDeVie);
        System.out.println("\tInitiative : " + this.initiative);
        if (this.pointsDeVie <= 0 )
        {
            System.out.println("\tStatut : mort");
        }
        else{
            System.out.println("\tStatut : Vivant");        
        }
    }

    private int attaqueCalcul() {
        int valeurAttaque = (int)(Math.random()*this.valeurMaxAttaque);// Fonction qui renvoie une valeur double donc on convertie ce qu'elle sort en entier. 
        return valeurAttaque;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : R�cup�rer la valeur d'attaque pour ce tour, calculer les d�gats,
        int valeurAttaque = this.attaqueCalcul();
        int dommage = valeurAttaque - personnageCible.valeurDefense;
        if (dommage < 0){
            dommage = 0;
        }
        if(personnageCible.pointsDeVie > 0){
            personnageCible.setPointsDeVie(personnageCible.pointsDeVie - dommage);
            System.out.println("\n"+this.nom+" attaque avec une puissance de : "+ valeurAttaque);
            System.out.println(personnageCible.nom + " a une defense de : " + personnageCible.valeurDefense);
            System.out.println("Les dommages sont donc de : "+dommage);
        }
        
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de fa�on al�atoire la valeur INI du personnage.
        setInitiative((int)(Math.random()*100));
    }
    // </editor-fold>
}
