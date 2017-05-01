package amm.progettoAmm.classi;

public class Utenti_registrati{

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the dataDiNascita
     */
    public String getDataDiNascita() {
        return dataDiNascita;
    }

    /**
     * @param dataDiNascita the dataDiNascita to set
     */
    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    /**
     * @return the frasePres
     */
    public String getFrasePres() {
        return frasePres;
    }

    /**
     * @param frasePres the frasePres to set
     */
    public void setFrasePres(String frasePres) {
        this.frasePres = frasePres;
    }

    /**
     * @return the urlFotoProfilo
     */
    public String getUrlFotoProfilo() {
        return urlFotoProfilo;
    }

    /**
     * @param urlFotoProfilo the urlFotoProfilo to set
     */
    public void setUrlFotoProfilo(String urlFotoProfilo) {
        this.urlFotoProfilo = urlFotoProfilo;
    }
    
    private int id;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private String dataDiNascita;
    private String frasePres;
    private String urlFotoProfilo;
    
    
        
}