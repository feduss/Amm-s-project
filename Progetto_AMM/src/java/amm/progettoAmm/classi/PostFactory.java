package amm.progettoAmm.classi;

import java.util.List;
import java.util.ArrayList;

public class PostFactory{

       //definizione del pattern design
    private static PostFactory singleton;

    public static PostFactory getInstance() {
        if (singleton == null) {
            singleton = new PostFactory();
        }
        return singleton;
    }
    ArrayList<Post> listaPost= new ArrayList<Post>();
    public PostFactory(){
        
        Utenti_registratiFactory utente=Utenti_registratiFactory.getInstance();
        
        Post post1= new Post();
        
        post1.setId(0);
        post1.setUtente(utente.getUtentebyId(0));
        post1.setTesto("Sto creando post in html :D");
        post1.setTesto2("");
        post1.setTipoPost(Post.Tipo.TESTO);
        
        Post post2= new Post();
        
        post2.setId(1);
        post2.setUtente(utente.getUtentebyId(1));
        post2.setTesto("Venite al mio evento di CyberSicurezza informatica ;)");
        post2.setTesto2("img/RosaDigitale.jpg");
        post2.setTipoPost(Post.Tipo.IMG);
        
        Post post3= new Post();
        
        post3.setId(0);
        post3.setUtente(utente.getUtentebyId(2));
        post3.setTesto("Zelda sul pc O.O :");
        post3.setTesto2("https://www.tomshw.it/zelda-breath-of-the-wild-pc-ecco-com-stato-emulato-83931");
        post3.setTipoPost(Post.Tipo.LINK);
        
        
        listaPost.add(post1);
        listaPost.add(post2);
        listaPost.add(post3);
        
    }
        public Post getPostbyId(int id){
            for(Post post: listaPost ){
                if(post.getId()==id) return post;            
            }
            
            return null;
        }
        
        //Da rivedere        
        public ArrayList<Post> getPostbyUser(String nome){
            ArrayList<Post> listaPostTemp= new ArrayList<Post>();
           
            for(Post post: listaPost ){
                if(post.getUtente().getNome().compareTo(nome)==0) listaPostTemp.add(post);             
            }                     
            
            return listaPostTemp;
        }
       
        
        
        
}