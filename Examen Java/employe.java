public  class  Employe  implémente  IEmploye {

 int int privé ;
  chaîne privée nomComplet;
protégé  LocalDate dateEmbauche;
private  static  int nombreEmploye;

     Employé public () {
        nombreEmploye ++ ;
        id = nombreEmploye;
    }
     Employé public ( String  nomComplet , LocalDate  dateEmbauche ) {
        ça . nomComplet = nomComplet;
        ça . dateEmbauche = dateEmbauche;
    }
    public  int  getId () {
    
        id de retour ;
    }
    public  String  getNomComplet () {
    
        return nomComplet;
    }
    public  String  getDateEmbauche () {
    
        date de retourEmbauche;
    }
    public  void  setId ( int  id ) {
    
        ça . id = id;
    }
    public  void  setNomComplet ( String  nomComplet ) {
    
        ça . nomComplet = nomComplet;
    }
    public  void  setDateEmbauche ( LocalDate  dateEmbauche ) {
    
        ça . dateEmbauche = dateEmbauche;
    }
     @Passer outre
        public  String  affiche () {
            return  " ID: " + id + " NOM Complet: " + nomComplet + " Date d'embauche: " + dateEmbauche;
                
            }
        public  Integer  compareTo ( Object  compareTo ) {

        Employe compareToEmp = ( Employe ) compareTo;

        if (id == compareToEmp . id) renvoie  0 ;

        if (id > compareToEmp . id) renvoie  1 ;

        retour  - 1 ;        

        }
        public  int  Anciennete ()
        {
            int  Anc ;
            Anc  =  DateTime . Maintenant . Année  -  dateembauche . Année ;
            if ( dateEmbauche . AddYears ( Anc ) >  DateTime . Now . Date )
                Anc - ;
            retourner  Anc ;
 
        }




}
