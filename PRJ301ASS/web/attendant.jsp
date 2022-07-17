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
        <link href="style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h2>Check Attended</h2>
        <h3>Lecture : Sonnt</h3>
        <table class="zigzag">
            <thead >
                <tr>
                    <!--                        <th>Index</th>-->
                    <th class="header">Member</th>
                    <th class="header">Code</th>
                    <th class="header">StudentCode</th>
                    <th class="header">Surname</th>
                    <th class="header">Middle name</th>
                    <th class="header" >Given name</th>
                    <th class="header">Email</th>
                    <th class="header">Status</th>
                    <!--                        <th>Comment</th>-->
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${s1}" var="s">
                    <tr>
                        <td>SE1626</td>
                        <td>${s.studentcode}</td>
                        <td>${s.studentid}</td>
                        <td>${s.studentsurname}</td>
                        <td>${s.studentmiddlename}</td>
                        <td>${s.studentgivenname}</td>
                        <td>${s.studentmail}</td>
                        <td style="color: green">Present</td>
                        <!--                            <td></td>-->
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>