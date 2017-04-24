package amm.progettoAmm.classi;

import java.util.ArrayList;

public class Utenti_registratiFactory{

    
    //definizione del pattern design
    private static Utenti_registratiFactory singleton;

    public static Utenti_registratiFactory getInstance() {
        if (singleton == null) {
            singleton = new Utenti_registratiFactory();
        }
        return singleton;
    }

    //Creo un nuovo arraylist di utenti registrati
    private ArrayList<Utenti_registrati> listaUtenti = new ArrayList<Utenti_registrati>();
    
    
    //creo degli utenti fittizi mediante il costruttore
    public Utenti_registratiFactory(){
    
        //Federico
        Utenti_registrati Federico=new Utenti_registrati();
        
        Federico.setId(0);
        Federico.setNome("Federico");
        Federico.setCognome("Saccà");
        Federico.setEmail("feduss@live.it");
        Federico.setPassword("ehvolevi");
        Federico.setDataDiNascita("16/10/1996");
        Federico.setFrasePres("Chi semina vento raccoglie tempesta");
        Federico.setUrlFotoProfilo("www.lol.com");
        
        //Matteo
        Utenti_registrati Matteo=new Utenti_registrati();
        
        Matteo.setId(1);
        Matteo.setNome("Matteo");
        Matteo.setCognome("Sesselego");
        Matteo.setEmail("zeb89@live.it");
        Matteo.setPassword("ehvolevimhanz");
        Matteo.setDataDiNascita("01/101/1901");
        Matteo.setFrasePres("Guarda che faccia! Non se l'aspettava!");
        Matteo.setUrlFotoProfilo("www.zeb89.com");
        
        
        //Simone
        Utenti_registrati Simone=new Utenti_registrati();
        
        Simone.setId(2);
        Simone.setNome("Simone");
        Simone.setCognome("Genovesi");
        Simone.setEmail("clash@live.it");
        Simone.setPassword("sonno94");
        Simone.setDataDiNascita("01/01/1901");
        Simone.setFrasePres("Ho sonno, vado via dalla lezione");
        Simone.setUrlFotoProfilo("www.lgv10.com");
                
        listaUtenti.add(Federico);
        listaUtenti.add(Matteo);
        listaUtenti.add(Simone);
        
    }
        /** 
         * @param id
         * @return 
         */
        public Utenti_registrati getUtentebyId(int id){
            for(Utenti_registrati utente: listaUtenti ){
                if(utente.getId()==id) return utente;            
            }
            
            return null;
        }
}