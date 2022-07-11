<%-- 
    Document   : newjsp
    Created on : Jun 29, 2022, 3:05:30 PM
    Author     : vu
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!DOCTYPE html>
<html lang="en" >
    <head>
        <meta charset="UTF-8">
        <title>CHECK</title>
        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0/css/bootstrap.css'><link rel="stylesheet" href="./style.css">

    </head>
    <body>
        <!-- partial:index.partial.html -->
        <div class="container">

            <h2>Check Attended</h2>
            <h3>Lecture : Sonnt</h3>
            <table class="table table-bordered table-striped table-responsive-stack"  id="tableOne">
                <thead class="thead-dark">
                    <tr>
                        <th>StudentId</th>
                        <th>StudentName</th>
                        <th>Gender</th>
                        

                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${s1}" var="s">
                        <tr>
                            <td>{s.studentid}</td>
                            <td>{s.studentname}</td><!-- comment -->
                            <td>{s.gender}</td>
                        </tr>
                    </c:forEach>

                </tbody>
            </table>
        </div>
        <!-- /.container -->
        <!-- partial -->
        <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
        <script  src="./script.js"></script>

    </body>
</html>
