<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page isELIgnored="false" %>
<%@ include file="navbar.jsp"%>
<!DOCTYPE jsp:useBean PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<div class="container-wrapper">
    <div class="container">
        <section>
            <div class="jumbotron">
                <div class="container" style="padding-left:220px">
                    <h1>Thank you for your business!</h1>
                </div>
            </div>
        </section>
        <section class="container" style="margin-bottom: 30px;">
            <p style="text-align: center;">
                <a href="<spring:url value="/" />" class="btn btn-primary">OK</a>
            </p>
        </section>
    </div>
</div>
<div id="footer">
			<jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>