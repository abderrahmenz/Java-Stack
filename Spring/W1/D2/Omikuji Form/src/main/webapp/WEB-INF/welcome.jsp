<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Fruit Store</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>Here's Your Omikuji!</h1>
    <fieldset>
    <p>In <c:out value="${sessionScope.number}"></c:out></p>
    <p>City: <c:out value="${sessionScope.city}"></c:out></p>
    <p>Name: <c:out value="${sessionScope.name}"></c:out></p>
    <p>Endeavor or Hobby: <c:out value="${sessionScope.endeavorOrHobby}"></c:out></p>
    <p>Living Thing: <c:out value="${sessionScope.livingThing}"></c:out></p>
    </fieldset>
    <a href="/omikuji">Go Back</a>
    </div>
</body>
</html>
