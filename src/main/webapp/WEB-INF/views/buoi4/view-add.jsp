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
<h2>Add</h2>
<form action="/buoi4/add" method="post">
    ID: <input type="text" name="id"><br>
    Ten: <input type="text" name="ten"><br>
    Tuoi: <input type="text" name="tuoi"><br>
    Dia Chi: <input type="text" name="diaChi"><br>
    Gioi tinh: <input type="radio" name="gioiTinh" value="true" checked>Nam
     <input type="radio" name="gioiTinh" value="false">Nu <br>
    <button type="submit">Them</button>
</form>
</body>
</html>