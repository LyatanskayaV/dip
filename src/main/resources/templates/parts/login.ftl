<#macro login path isRegisterForm>

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
<body class="login">

<img class="login1" src="../static/loginImg.jpg">
<div class="login_content">
<form action="${path}" method="post">
    <div class="form-group row">
        <label style="font-size: 20px; color: #ffffff;
    text-shadow: 0 0 5px #ffffff, 0 0 10px #ffffff, 0 0 20px #ffffff,
    0 0 40px #000000, 0 0 90px #000000, 0 0 10px #000000,
    0 0 10px #000000, 0 0 150px #000000;" class="col-form-label">Ім'я користувача:</label>
        <div class="col-sm-6">
            <input type="text" name="username" class="form-control" placeholder="Ім'я користувача" />
        </div>
    </div>
    <div class="form-group row">
        <label style="font-size: 20px;  color: #ffffff;
    text-shadow: 0 0 5px #ffffff, 0 0 10px #ffffff, 0 0 20px #ffffff,
    0 0 40px #000000, 0 0 90px #000000, 0 0 10px #000000,
    0 0 10px #000000, 0 0 150px #000000;margin-right: 97px" class="col-form-label">Пароль:</label>
        <div class="col-sm-6">
            <input type="password" name="password" class="form-control" placeholder="Пароль" />
        </div>
    </div>
    <#if isRegisterForm>
    <div class="form-group row">
        <label  style="font-size: 20px;  color: #ffffff;
    text-shadow: 0 0 5px #ffffff, 0 0 10px #ffffff, 0 0 20px #ffffff,
    0 0 40px #000000, 0 0 90px #000000, 0 0 10px #000000,
    0 0 10px #000000, 0 0 150px #000000;margin-right: 99px" class="col-form-label">Пошта:</label>
        <div class="col-sm-6">
            <input type="email" name="email" class="form-control" placeholder="some@some.com" />
        </div>
    </div>
    </#if>
    <div style="margin-left: -14px;">
    <input type="hidden" name="_csrf" value="${_csrf.token}" />
    <#if !isRegisterForm>
           <a style="text-align:left; color: black;width: 180px; height: 40px; background-color: #faaeae; display: inline-block;
         font-size: 17px;border: 2px #D3D3D3 solid; padding-left: 7px; margin-right: 155px; padding-top: 6px" href="/registration">Новий користувач</a>
    </#if>
    <button style="background-color: #faaeae; width: 120px; height: 40px;" type="submit">
        <#if isRegisterForm>Створити<#else>Вхід</#if></button>
    </div>
</form>
</#macro>

<#macro logout>
<form action="/logout" method="post">
    <input type="hidden" name="_csrf" value="${_csrf.token}" />
    <button class="btn btn-primary" type="submit">Вийти</button>
</form>
</#macro>
</div>
</body>
</html>
