<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" lang="en">

<head>
    <meta charset="UTF-8">
    <title>Список новин</title>
    <link rel="stylesheet" href="/static/style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <script src="https://www.google.com/recaptcha/api.js" async defer></script>

</head>
<body style="background-image: url(/static/adminImg.jpg); width: 100%; background-attachment: fixed;">
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>


<a href="/admin" style="color: black;
    font-size: 18px;
    padding: 5px;
    background-color: ghostwhite;
    margin-left: 5px;
    margin-top: 10px;
    display: block;
    width: 100px;">← Назад</a>

<div style="border: 1px aliceblue outset;
    border-radius: 30px;padding-top: 10px;margin-top: 5%; padding-bottom: 10px;  width: 40%;margin-left: 30%; background-color: #fdffe5">
    <p style="font-size: 25px; text-align: center;">Список новин</p>

        <#list news as new>
        <div style="width: 90%;margin-left: 5%;margin-right: 5%; text-align: center; padding: 10px">
            <p >Заголовок: ${new.title_news}</p>
            <p >Новина: ${new.body_news}</p>
            <p >Зображення: ${new.img_news}</p>
            <p ><a href="/newsAdmin/${new.id_news}">Редагувати</a></p>
        </div>
        <hr style="width: 90%; align: center; color: black">
    </#list>










    <a href="#zatemnenie" style="text-align: center; display: block; margin-top: -22px;">Додати новину</a>
    <style>
        #zatemnenie {
            background: rgba(102, 102, 102, 0.5);
            width: 100%;
            height: 100%;
            position: absolute;
            top: 0;
            left: 0;
            display: none;
        }
        #okno {
            width: 40%;
            height: 30%;
            text-align: center;
            padding: 15px;
            border: 3px solid rgba(161, 153, 245, 0.85);
            border-radius: 10px;
            color: rgba(161, 153, 245, 0.85);
            position: absolute;
            top: 0;
            right: 0;
            bottom: 0;
            left: 0;
            margin: auto;
            background: #fffefa;
        }
        #zatemnenie:target {display: block;}
    </style>

    <div id="zatemnenie">
        <div id="okno">
            <form action="/new_new" method="post">
                <div>
                    <label style="padding-left: 19px;font-weight: bold; font-size: 23px; margin-right: 15px;">Заголовок:</label>
                    <input style="margin-bottom: 15px; width: 50%; height: 30px;" type="text" name="title_news" placeholder="Заголовок" />
                </div>
                <div>
                    <label style="padding-left: 22px;font-weight: bold; font-size: 23px; margin-right: 15px;" >Новина:</label>
                    <input style="margin-left: 50px; margin-bottom: 15px; width: 50%; height: 30px;" type="text" name="body_news" placeholder="Новина" />
                </div>
                <div>
                    <label style="padding-left: 22px;font-weight: bold; font-size: 23px; margin-right: 15px;" >Забраження:</label>
                    <input style="margin-left: 50px; margin-bottom: 15px; width: 50%; height: 30px;" type="text" name="img_news" placeholder="URL" />
                </div>
                <div>
                    <button style="background-color: rgba(192,166,251,0.91);
    width: 40%;
    margin-left: 13%; height: 40px; font-size: 23px" type="submit">Додати новину</button>
                </div>
            </form>
        </div>
    </div>










</div>
</body>
</html>
