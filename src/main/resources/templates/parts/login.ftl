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
<div style="margin-left: 33%;
    width: 35%;
    height: 35%;
    margin-top: 17%;
    background-color: #aedbfae3;
    position: absolute;">
<div class="login_content">
    <form action="${path}" method="post">
        <div class="form-group row">
            <label style="font-weight: bold; font-size: 17px;" class="col-form-label">Ім'я користувача:</label>
            <div class="col-sm-6">
                <input type="text" name="username" class="form-control" placeholder="Ім'я користувача" />
            </div>
        </div>
        <div class="form-group row">
            <label style="margin-right: 78px; font-weight: bold; font-size: 17px;" class="col-form-label">Пароль:</label>
            <div class="col-sm-6">
                <input type="password" name="password" class="form-control" placeholder="Пароль" />
            </div>
        </div>
        <#if isRegisterForm>
            <div class="form-group row">
                <label  style="margin-right: 88px; font-weight: bold; font-size: 17px;" class="col-form-label">Пошта:</label>
                <div class="col-sm-6">
                    <input type="email" name="email" class="form-control" placeholder="some@some.com" />
                </div>
            </div>
        </#if>
        <div style="margin-left: -14px;">
<#--
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
-->
            <#if !isRegisterForm>
                <a style="margin-top: 30px; text-align:left; color: black;width: 180px; height: 40px; background-color: #faaeae; display: inline-block;
         font-size: 17px;border: 2px #D3D3D3 solid; padding-left: 7px; margin-right: 155px; padding-top: 6px" href="/registration">Новий користувач</a>
            </#if>
            <button style="background-color: #faaeae; width: 120px; height: 40px;" type="submit">
                <#if isRegisterForm>Створити<#else>Вхід</#if></button>
        </div>
    </form>
    </#macro>

    <#macro logout>
        <form action="/logout" method="post">
<#--
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
-->
            <button class="btn btn-primary" type="submit">Вийти</button>
        </form>
    </#macro>
</div>
</div>
</body>
</html>