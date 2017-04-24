package amm.progettoAmm.classi;
        
public class Post{

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the Utente
     */
    public Utenti_registrati getUtente() {
        return Utente;
    }

    /**
     * @param Utente the Utente to set
     */
    public void setUtente(Utenti_registrati Utente) {
        this.Utente = Utente;
    }

    /**
     * @return the testo
     */
    public String getTesto() {
        return testo;
    }

    /**
     * @param testo the testo to set
     */
    public void setTesto(String testo) {
        this.testo = testo;
    }

    /**
     * @return the TipoPost
     */
    public Tipo getTipoPost() {
        return TipoPost;
    }

    /**
     * @param TipoPost the TipoPost to set
     */
    public void setTipoPost(Tipo TipoPost) {
        this.TipoPost = TipoPost;
    }

    public enum Tipo{TESTO, IMG, LINK};
    
    private int id;
    private Utenti_registrati Utente;
    private String testo;
    private Tipo TipoPost;
    
    
    
    

}