
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

    <form action="/logout" method="post" enctype="application/x-www-form-urlencoded">
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button class="sign_out" type="submit">ВИХІД</button>
    </form>

</nav>

<div>
    <img src="/1387.jpg" class="home_img">
</div>
<div style="width: 70%; margin-left: 15%;">
<#--<div style="background-color: #fff491; height: 100px">
    #${messages}

</div>-->

    <div style="background-color: navajowhite; height: 100px">

    <#list messages as m>
        #${m}
    </#list>
        
    </div>

    <div style="border: 1px outset deepskyblue; margin-top: 20px">
        <p style="text-align: center; width: 100%">
            Офіційний сайт приймальної комісії
        </p>
        <a href="" style="text-align: center;  width: 100%;display: block">link</a>
    </div>



    <div style="border: 1px outset deepskyblue; margin-top: 20px">
        <p style="text-align: center; width: 100%">
            Перелік предметів для вступу
        </p>
        <p style="text-align: center; width: 100%">list</p>
    </div>
    <div style="border: 1px outset deepskyblue; margin-top: 20px">
        <p style="text-align: center; width: 100%">
            Курси підготовки до ЗНО
        </p>
        <p style="text-align: center; width: 100%">info</p>
    </div>
    <div style="border: 1px outset deepskyblue; margin-top: 20px">
        <p style="text-align: center; width: 100%">
            Дні відкритих дверей
        </p>
        <p style="text-align: center; width: 100%">info</p>
    </div>

</div>


<footer class="footer">
    <p style="padding-top: 10px; margin: 0">© Лятанская Валерия</p>
</footer>
</body>
</html>