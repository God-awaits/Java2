public class  service {
 int int priv� ;
  libell� de cha�ne priv�e ;
private  static  int nmbrService;
     service public () {
        nmbrService ++ ;
        id = nmbrService;
    }
     Employ� public ( String  libelle ) {this.libelle = libelle;}
    public int  getId () {id de retour ;}
    public String getLibelle () {retourner la libelle;}
    public void setId ( int  id ) {this.id = id;}
    public void setLibelle ( String  libelle ) { �a . libelle = libelle;}
    public  void  listerEmployeService () {
        pour (Employe final  e : tabEmploye) {
            si (e ! = null ) {
                if (employeIsExist (e)) {
                    Syst�me . dehors . println ( " id: "  + e . getId () +  " nomComplet: "  + e . getNomComplet () +  " date d'embauche: "
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