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
    <img  class="home_img"  src="/static/homeImg.jpg">
</div>
</p>
<div class="div_home_top3">
    <p style="position: absolute; margin-top: 8px; color: white;width: 40%; width: 100%; font-size: 30px;title-shadow: 0.8px 0.8px #694040; ">Ласкаво просимо на наш сайт!
    <p style="margin-top: 45px;">Тут Ви зможете знайти багато інформації стосовно ВНЗ, приймальної комісії, а також ознайомитись із захоплюючим квестом, завдяки якому Ви зможете ближче ознайомитись з нашим навчальним закладом.</p>
</div>
<div class="pImg">
    <p style="width: 50%; margin-left: 20%; padding-top: 10px;">У цьому розділі Ви зможете отримати більш детальну інформацію про навігацію та підрозділи сайту</p>
</div>

<div>
    <img class="home_imgs" src="/static/13871.jpg">
    <p style="margin-top: -150px; margin-left: 40%">Приймальна комісія</p>
    <p style="margin-top: 30px; margin-left: 40%; font-size: 14px; font-style: italic; width: 50%;">Тут міститься інформація про приймальну комісію, години роботи, адреса, необхідні документи, перелік предметів, тощо.
    </p>
</div>
<div style="margin-top: 80px;">
    <img class="home_imgs" src="/static/homeQuestImg.jpg">
    <p style="margin-top: -150px; margin-left: 40%">Інформація про квест</p>
    <p style="margin-top: 30px; margin-left: 40%; font-size: 14px; font-style: italic; width: 50%;">Тут міститься інформація про квест, який розроблено студентами для полегшення процесу ознайомлення абітурієнта із навчальним закладом.
    </p>
</div>
<div style="margin-top: 80px; margin-bottom: 100px;">
    <img class="home_imgs" src="/static/contactsImg.jpg" >
    <p style="margin-top: -150px; margin-left: 40%">Контактна інформація</p>
    <p style="margin-top: 30px; margin-left: 40%; font-size: 14px; font-style: italic; width: 50%;">Тут міститься інформація про те, як зв'язатися із представниками приймальної комісії, адреса, часи роботи, тощо.
    </p>
</div>


<footer>
    <p style="padding-top: 10px;     margin-bottom: 0px;">© Лятанская Валерия</p>
</footer>
</body>
</html>