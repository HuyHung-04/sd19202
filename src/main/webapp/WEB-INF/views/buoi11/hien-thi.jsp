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
<h2>Them</h2>
<form action="/buoi11/add" method="post">
    Ten: <input type="text" name="ten"> <br>
    <button type="submit">Them</button>
</form>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Ten</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${danhSach}" var="dm">
        <tr>
            <td>${dm.id}</td>
            <td>${dm.ten}</td>
            <td>
                <a href="/buoi11/delete?id=${dm.id}">Xoa</a>
                <a href="/buoi11/view-update/${dm.id}">Sua</a>
                <a href="/buoi11/detail/${dm.id}">Chi tiet</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>