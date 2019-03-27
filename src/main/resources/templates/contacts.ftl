<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sweater</title>
    <link rel="stylesheet" href="/static/style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>

<nav class="navbar">
    <a class="a_navbar" href="/home">ГОЛОВНА</a><p>|</p><a class="a_navbar" href="/committee1">ПРИЙМАЛЬНА КОМІСІЯ</a><p>|</p>
    <a class="a_navbar" href="">КВЕСТ</a><p>|</p><a class="a_navbar" href="/contacts">КОНТАКТИ</a>
    <p>|</p><a class="a_navbar" href="">FAQ</a><p>|</p>

    <form action="/logout" method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button class="sign_out" type="submit">ВИХІД</button>
    </form>

</nav>

<div>
    <img src="../static/contImg.jpg" class="home_img">
</div>
<div class="div_home_top">
    <p class="home_desc">Тут можна знайти усю контактну інформацію, яка допоможе тобі зв'язатися з нами</p>
</div>

<div  class="div_home_top2" style="height: 90px;">
    <p class="p_home">Назва відділу</p>
    <p class="home_desc2">Адреса, телефон, години роботи, поштова скринька</p>
</div>

<div  class="div_home_top2" style="height: 90px;">
    <p class="p_home">Назва відділу</p>
    <p class="home_desc2">Адреса, телефон, години роботи, поштова скринька</p>
</div>

<div  class="div_home_top2" style="height: 90px;">
    <p class="p_home">Назва відділу</p>
    <p class="home_desc2">Адреса, телефон, години роботи, поштова скринька</p>
</div>
<div  class="div_home_top2" style="height: 90px;">
    <p class="p_home">Назва відділу</p>
    <p class="home_desc2">Адреса, телефон, години роботи, поштова скринька</p>
</div>

<footer class="footer">
    <p style="padding-top: 10px; margin: 0">© Лятанская Валерия</p>
</footer>
</body>
</html>