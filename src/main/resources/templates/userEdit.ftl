<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" lang="en">

<head>
    <meta charset="UTF-8">
    <title>Редагування FAQ</title>
    <link rel="stylesheet" href="/static/style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <script src="https://www.google.com/recaptcha/api.js" async defer></script>

</head>
<body style="background-image: url(/static/adminImg.jpg);     background-attachment: fixed;">
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>


<a href="/userAdmin" style="color: black;
    font-size: 18px;
    padding: 5px;
    background-color: ghostwhite;
    margin-left: 5px;
    margin-top: 10px;
    display: block;
    width: 100px;">← Назад</a>


<div style="border: 1px aliceblue outset;
    border-radius: 30px;padding-top: 10px;margin-top: 5%; padding-bottom: 10px;  width: 40%;margin-left: 30%; background-color: #fdffe5">
    <p style="font-size: 25px; text-align: center;">Редагування користувачів</p>

    <form style="margin-left: 60px; margin-bottom: 15px" action="/userAdmin" method="post">
        <input type="text" name="username" value="${user.username}">
        <#list roles as role>
            <div>
                <label><input type="checkbox" name="${role}" ${user.roles?seq_contains(role)?string("checked", "")}>${role}</label>
            </div>
        </#list>
        <input type="hidden" value="${user.id}" name="userId">
        <button style="margin-left: 10px" type="submit">Save</button>
    </form>



</div>
</body>
</html>








