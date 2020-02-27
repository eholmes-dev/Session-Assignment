<%-- 
    Document   : login
    Created on : Feb 24, 2020, 6:48:27 PM
    Author     : ethan holmes
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    String currentPageMessage 
            = (String) session.getAttribute("currentPageMessage");
    if(null == currentPageMessage){
        currentPageMessage = "Please enter your user name and password.";
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="css/standard.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            <nav>
                <a href="index.jsp">Home</a>
            </nav>
            <h1>Login</h1>
        </header>
        <section>
            
            <form action="LoginHandler" method="POST">
                <label for="userName">User Name</label><br />
                <input type="text" name="userName" /><br />
                <label for="password">Password</label><br />
                <input type="password" name="password" /><br />
                <input type="submit" value="Login" />
            </form>
        </section>
    </body>
</html>
