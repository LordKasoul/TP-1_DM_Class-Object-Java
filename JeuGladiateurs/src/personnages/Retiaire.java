package personnages;

public class Retiaire extends Personnage{
    boolean filet=true;
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeur & Initialisation">
    public Retiaire() {
        super();
         this.filet = true;
    }
     public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
         this.filet = true;
    }

   
    // </editor-fold>
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    @Override
    public void frapperPersonnage(Personnage personnageCible){
        if (this.filet == true){
          if (((int)(Math.random()*100))<=10){
              personnageCible.setPointsDeVie(0);
              System.out.println("\nLe filet de "+this.nom+" attrape "+personnageCible.nom+" et il l'empale sauvagement avec sa lance.");
          }
          else {
              this.filet = false;
              System.out.println("\nLe filet n'atteint pas sa cible");
          }
        }
        else{
            System.out.println("\n" +this.nom + " ramasse son filet et en profite pour attaquer");
            super.frapperPersonnage(personnageCible);
            }
    }
    // </editor-fold>
    
}
