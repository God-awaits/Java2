public  class  Employe  impl�mente  IEmploye {

 int int priv� ;
  cha�ne priv�e nomComplet;
prot�g�  LocalDate dateEmbauche;
private  static  int nombreEmploye;

     Employ� public () {
        nombreEmploye ++ ;
        id = nombreEmploye;
    }
     Employ� public ( String  nomComplet , LocalDate  dateEmbauche ) {
        �a . nomComplet = nomComplet;
        �a . dateEmbauche = dateEmbauche;
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
    
        �a . id = id;
    }
    public  void  setNomComplet ( String  nomComplet ) {
    
        �a . nomComplet = nomComplet;
    }
    public  void  setDateEmbauche ( LocalDate  dateEmbauche ) {
    
        �a . dateEmbauche = dateEmbauche;
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
            Anc  =  DateTime . Maintenant . Ann�e  -  dateembauche . Ann�e ;
            if ( dateEmbauche . AddYears ( Anc ) >  DateTime . Now . Date )
                Anc - ;
            retourner  Anc ;
 
        }




}
