<%-- 
    Document   : bacheca
    Created on : 24-apr-2017, 21.49.36
    Author     : Federico
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <title>Bacheca</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="SocialMedia, social, media, amici, utenti, bacheca">
        <meta name="Bacheca" content="Bacheca del social network">
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
        
        <div id="stato">
            <ul id="stato1">
                <li><img alt="Immagine del profilo utente" src="${post.getUtente().getUrlFotoProfilo()}" width="75" height="75"/></li>
                <li><p>${post.getUtente().getFrasePres()}<p></li>
            </ul>
            </div>
        <div id="center"> 
            <c:forEach var="posts" items="${post}">
                <div class="post">
                    <img alt="Immagine del profilo utente" src="${post.getUtente().getUrlFotoProfilo()}" width="75" height="75"/>
                    <c:if test="${post.TipoPost=='TEXT'}"> <h2 id="Post1">${post.getUtente().getNome()}</h2> <p>${post.testo}</p></c:if>
                    <c:if test="${post.TipoPost=='IMG'}">  <h2 id="Post2">${post.getUtente().getNome()}</h2> <p>${post.testo}</p><p class="imgpost"><img alt="Immagine del post" src="${post.testo2}"></p></c:if>
                    <c:if test="${post.TipoPost=='LINK'}"> <h2 id="Post3">${post.getUtente().getNome()}</h2> <p>${post.testo}</p><a href="${post.testo2}">LINK</a></c:if>                    
                </div>

            </c:forEach>
        </div>

    </body>
</html>

