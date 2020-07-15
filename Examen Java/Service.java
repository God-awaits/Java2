public class  service {
 int int privé ;
  libellé de chaîne privée ;
private  static  int nmbrService;
     service public () {
        nmbrService ++ ;
        id = nmbrService;
    }
     Employé public ( String  libelle ) {this.libelle = libelle;}
    public int  getId () {id de retour ;}
    public String getLibelle () {retourner la libelle;}
    public void setId ( int  id ) {this.id = id;}
    public void setLibelle ( String  libelle ) { ça . libelle = libelle;}
    public  void  listerEmployeService () {
        pour (Employe final  e : tabEmploye) {
            si (e ! = null ) {
                if (employeIsExist (e)) {
                    Système . dehors . println ( " id: "  + e . getId () +  " nomComplet: "  + e . getNomComplet () +  " date d'embauche: "
                            + e . getDateEmbauche ());  }
}        }
     @Passer outre
        public  String affiche () {
            retourner  " ID: " + id + " Libelle: " + libelle
            }
        public  Integer compareTo ( Object compareTo) {

        Service compareToS = ( Service ) compareTo;

        if (id == compareToS . id) renvoie  0 ;

        if (id > compareToS . id) renvoie  1 ;

        retour  - 1 ;        

        }
}