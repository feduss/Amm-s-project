package amm.progettoAmm.classi;

import java.util.ArrayList;

public class GruppiFactory{

    //definizione del pattern design
    private static GruppiFactory singleton;

    public static GruppiFactory getInstance() {
        if (singleton == null) {
            singleton = new GruppiFactory();
        }
        return singleton;
    }
    
    private ArrayList<Gruppi> listaGruppi= new ArrayList<Gruppi>();
    
    public GruppiFactory(){
        
        Gruppi Slash=new Gruppi();
        
        Slash.setId(0);
        Slash.setNome("Slash");
        
        Gruppi AcDc=new Gruppi();
        
        AcDc.setId(1);
        AcDc.setNome("Ac/Dc");
        
        
        listaGruppi.add(Slash);
        listaGruppi.add(AcDc);
        
    }
    
    public Gruppi getGruppobyId(int id){
        for(Gruppi gruppo: listaGruppi ){
                if(gruppo.getId()==id) return gruppo;            
            }
            
            return null;
    }
    
}
