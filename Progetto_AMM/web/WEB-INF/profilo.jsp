<%-- 
    Document   : profilo
    Created on : 2-mag-2017, 9.04.24
    Author     : Federico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Profilo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="SocialMedia, social, media, amici, utenti, bacheca, profilo">
        <meta name="Bacheca" content="Profilo dell'utente">
        <meta name="author" content="Federico">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen"> 
        
    </head>
    <body>
        
        <jsp:include page="header.jsp"/>
        
        <jsp:include page="nav.jsp"/>
        
        <div class="colonna">
            
            <h2>Persone:</h2>
            <c:forEach var="user" items="${Utente}">
                <ul>
                    <li class="utenti"><p>${user.nome}</p></li>
                </ul>
            </c:forEach>

            <h2>Gruppi:</h2>
            <c:forEach var="group" items="${Gruppi}">
                <ul>
                    <li><p>${group.nome}</p></li>
                </ul>
            </c:forEach>          
                        
        </div> <!-- DIV COLONNA -->
        
        <div id="Registrazione">
            <form method="post" action="profilo.html">
                
                <div id="imgprofilo">
                    <img title="Img" alt="Immagine del profilo" src="${post.getUtente().getUrlFotoProfilo()}" width="200" height="200"/>
                </div>
                <ul id="lista">
                    <li id="nome1">
                        <label for="nome">Nome:</label>
                        <input type="text" name="nome" id="nome" value="Nome Utente"/>
                    </li>


                    <li id="cognome1">
                        <label for="cognome">Cognome:</label>
                        <input type="text" name="cognome" id="cognome" value="Cognome Utente"/>
                    </li>

                    <li id="data1">
                        <label for="data">Data di nascita: </label>
                        <input type="date" name="data" id="data"/>
                    </li>

                    <li id="propic">
                        <label for="foto">Immagine del profilo:</label>
                        <input type="text" name="foto" id="foto" value="URL dell'immagine"/>
                    </li>

                    <li id="frase">
                        <label for="lungo">Frase di Presentazione:</label>
                        <textarea rows="3" cols="22" name="lungo" id="lungo">Inserisci una frase che ti rappresenti</textarea>
                    </li>

                    <li id="pass1">
                        <label for="psw">Password:</label>
                        <input type="password" name="psw" id="psw" value=""/>
                    </li>

                    <li id="pass2">
                        <label for="cpsw">Conferma password:</label>
                        <input type="password" name="cpsw" id="cpsw" value=""/>
                    </li>

                    <li>
                    <button type="submit">Conferma</button>
                    </li>
                
                </ul>
            </form>
        </div>
    </body>
</html>


