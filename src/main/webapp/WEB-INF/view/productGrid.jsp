<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security"
           uri="http://www.springframework.org/security/tags" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet"
          href="<c:url value="/resource/bootstrap/css/bootstrap.min.css"/>">
    <script src="<c:url value="/resource/js/jquery.js"/>"></script>
    <script src="<c:url value="/resource/bootstrap/js/bootstrap.min.js"/>"></script>
    <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
    <style>
        body, h1, h2, h3, h4, h5 {
            font-family: "Raleway", sans-serif
        }

        .w3-sidenav a, .w3-sidenav h4 {
            font-weight: bold
        }
    </style>
</head>
<body>
<hr>
<div class="w3-row-padding" style="padding:0px 250px; margin-bottom: 20px">
    <div class="w3-third w3-container w3-margin-bottom">
        <img src="<c:url value="/resource/images/loa1.jpg"/>" alt="Norway" style="width: 100%"
             class="w3-hover-opacity">
        <div class="w3-container w3-white" style="padding:0px 30px;">
            <p>
                <b>Loa BIK</b>
            </p>
            <p>
            <ul>
                <li>Item weight - 6kg</li>
                <li>Rating - 4.6</li>
                <li>Price - 15.000.000d</li>
            </ul>
            </p>
        </div>
    </div>

    <div class="w3-third w3-container w3-margin-bottom">
        <img src="<c:url value="/resource/images/loa2.jpg"/>" alt="Norway" style="width: 100%"
             class="w3-hover-opacity">
        <div class="w3-container w3-white" style="padding:0px 50px;">
            <p>
                <b>Loa Mozard</b>
            </p>
            <p>
            <ul>
                <li>Item weight - 0.5kg</li>
                <li>Rating - 4.3</li>
                <li>Price - 3.500.000d</li>
            </ul>
            </p>
        </div>
    </div>
    <div class="w3-third w3-container w3-margin-bottom">
        <img src="<c:url value="/resource/images/loa3.jpg"/>" alt="Norway" style="width: 100%"
             class="w3-hover-opacity">
        <div class="w3-container w3-white" style="padding:20px 10px;">
            <p>
                <b>Loa Enkor</b>
            </p>
            <p>
            <ul>
                <li>Item weight - 3kg</li>
                <li>Rating - 4.6</li>
                <li>Price - 7.000.000d</li>
            </ul>
            </p>
        </div>
    </div>
</div>

<hr>
<div class="w3-row-padding" style="padding:0px 250px; margin-bottom: 20px">
    <div class="w3-third w3-container w3-margin-bottom">
        <img src="<c:url value="/resource/images/loa4.jpg"/>" alt="Norway" style="width: 100%"
             class="w3-hover-opacity">
        <div class="w3-container w3-white" style="padding:0px 50px;">
            <p>
                <b>Loa JBL</b>
            </p>
            <p>
            <ul>
                <li>Item weight - 1kg</li>
                <li>Rating - 4.5</li>
                <li>Price - 3.400.000d</li>
            </ul>
            </p>
        </div>
    </div>

    <div class="w3-third w3-container w3-margin-bottom" style="padding-top:100px">
        <img src="<c:url value="/resource/images/loa5.jpg"/>" alt="Norway" style="width: 100%"
             class="w3-hover-opacity">
        <div class="w3-container w3-white" style="padding:84px 50px;">
            <p>
                <b>Loa ABC</b>
            </p>
            <p>
            <ul>
                <li>Item weight - 10kg</li>
                <li>Rating - 4.3</li>
                <li>Price - 20.000.000d</li>
            </ul>
            </p>
        </div>
    </div>
    <div class="w3-third w3-container w3-margin-bottom">
        <img src="<c:url value="/resource/images/loa6.jpg"/>" alt="Norway" style="width: 100%"
             class="w3-hover-opacity">
        <div class="w3-container w3-white" style="padding:16px 60px;">
            <p>
                <b>Loa Paramax</b>
            </p>
            <p>
            <ul>
                <li>Item weight - 7kg</li>
                <li>Rating - 4.5</li>
                <li>Price - 14.000.000d</li>
            </ul>
            </p>
        </div>
    </div>
</div>
</body>
</html>