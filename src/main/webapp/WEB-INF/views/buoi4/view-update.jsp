<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h2>Update</h2>
<form action="/buoi4/update" method="post">
    ID: <input type="text" name="id" value="${sv.id}" readonly><br>
    Ten: <input type="text" name="ten" value="${sv.ten}"><br>
    Tuoi: <input type="text" name="tuoi" value="${sv.tuoi}"><br>
    Dia Chi: <input type="text" name="diaChi" value="${sv.diaChi}"><br>
    Gioi tinh: <input type="radio" name="gioiTinh" value="true" ${sv.gioiTinh ?"checked":""}>Nam
    <input type="radio" name="gioiTinh" value="false" ${!sv.gioiTinh ?"checked":""}>Nu <br>
    <button type="submit">Sua</button>
</form>
</body>
</html>