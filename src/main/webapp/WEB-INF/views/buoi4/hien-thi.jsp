<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h2>Tim kiem</h2>
<form action="/buoi4/search"method="get">
    ID: <input type="text" name="id"><br>
    <button type="submit">Tim kiem</button>
</form>
<a href="/buoi4/view-add">Them sinh vien</a><br>
<h2>Danh sach sinh vien</h2>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Ten</th>
        <th>Tuoi</th>
        <th>Dia chi</th>
        <th>Gioi tinh</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${danhSach}" var="sv">
        <tr>
            <td>${sv.id}</td>
            <td>${sv.ten}</td>
            <td>${sv.tuoi}</td>
            <td>${sv.diaChi}</td>
            <td>${sv.gioiTinh?"Nam":"Nu"}</td>
            <td>
                <a href="/buoi4/delete?id=${sv.id}">Xoa</a>
                <a href="/buoi4/view-update/${sv.id}">Sua</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>