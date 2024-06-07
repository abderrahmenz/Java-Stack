<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Ninja Gold Game</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h1>Ninja Gold Game</h1>
    <p>Gold: <span>${gold}</span></p>

    <fieldset>
        <legend>Earn Gold</legend>
        <div class="game-buttons">
            <form action="/process" method="post" style="display: inline-block;">
                <input type="hidden" name="place" value="farm">
                <button class="btn btn-primary" type="submit">Farm (Earns 10-20 gold)<br/>Find Gold</button>
            </form>
            <form action="/process" method="post" style="display: inline-block;">
                <input type="hidden" name="place" value="cave">
                <button class="btn btn-primary" type="submit">Cave (Earns 5-10 gold)<br/>Find Gold</button>
            </form>
            <form action="/process" method="post" style="display: inline-block;">
                <input type="hidden" name="place" value="house">
                <button class="btn btn-primary" type="submit">House (Earns 2-5 gold)<br/>Find Gold</button>
            </form>
            <form action="/process" method="post" style="display: inline-block;">
                <input type="hidden" name="place" value="quest">
                <button class="btn btn-primary" type="submit">Quest (Earns/Takes 0-50 gold)<br/>Find Gold</button>
            </form>
        </div>
    </fieldset>

    <fieldset>
        <legend>Activities</legend>
        <ul>
            <c:forEach var="activity" items="${activities}">
                <li>${activity}</li>
            </c:forEach>
        </ul>
    </fieldset>
</div>
</body>
</html>
