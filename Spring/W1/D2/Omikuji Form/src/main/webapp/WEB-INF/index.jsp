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
    <h1>Send an Omikuji!</h1>
    <form action='/omikuji/process' method='POST'>
    <fieldset>
        <label>Pick any number from 5 to 25:</label>
        <input type="number" id="number" name="number" min="1" max="25"><br/><br/>
        <label>Enter the name of any city:</label>
        <input type="text" name='city'><br/><br/>
        <label>Enter the name of any real person:</label>
        <input type="text" name='name'><br/><br/>
        <label>Enter professional endeavor or hobby:</label>
        <input type="text" name="endeavorOrHobby"><br/><br/>
        <label>Enter any type of living thing:</label>
        <input type="text" name="livingThing"><br/><br/>
        <label>Say Something nice to someone:</label><br/><br/>
        <textarea></textarea><br/><br/>
        <input type='submit'value='Send'>
        </fieldset>
    </form>
    </div>
</html>
