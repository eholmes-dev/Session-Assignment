<%-- 
    Document   : details
    Created on : Feb 24, 2020, 6:49:13 PM
    Author     : ethan holmes
--%>
<%@page import="ech.pkg.java.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  
    
    Person person = (Person) session.getAttribute("person");
    
    if(null == person){
        request.getRequestDispatcher("login.jsp")
                .forward(request, response);
    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Details for <%= person.getFirstName() %></title>
        <link href="css/standard.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            <nav>
                <a href="LogoutHandler" >Log out</a>
            </nav>
            <h1>Hello, <%= person.getFirstName() %></h1>
        </header>
        <section>
            <h2>Details about <%= person.getFirstName() %></h2>
            <p>
                <%= person.getUserFacts() %>
            </p>
        </section>
    </body>
</html>
