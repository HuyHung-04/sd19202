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
<form action="/buoi11/san-pham/tim-kiem"method="get">
    Ten: <input type="text" name="ten"><br>
    <button type="submit">Tim</button>
</form>
<h2>Them san pham</h2>
<form action="/buoi11/san-pham/add" method="post">
    Ten: <input type="text" name="ten"> <br>
    Gia: <input type="text" name="gia"> <br>
    NgayTao: <input type="date" name="ngayTao"> <br>
    DanhMuc: <select name="danhMuc">
    <c:forEach items="${listDanhMuc}" var="dm">
        <option value="${dm.id}" label="${dm.ten}"></option>
    </c:forEach>
</select> <br>
    <button type="submit" onclick="return confirm('Ban co muon them khong')">Them</button>
</form>

<h2>Danh sach</h2>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Ten</th>
        <th>Gia</th>
        <th>Ngay tao</th>
        <th>Danh muc</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${page.content}" var="sp">
        <tr>
            <td>${sp.id}</td>
            <td>${sp.ten}</td>
            <td>${sp.gia}</td>
            <td>${sp.ngayTao}</td>
            <td>${sp.danhMuc.ten}</td>
            <td>
                <a href="/buoi11/san-pham/update/${sp.id}">Sua</a>
                <a href="/buoi11/san-pham/delete?id=${sp.id}">Xoa</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/buoi11/san-pham/hien-thi">First</a>
<a href="/buoi11/san-pham/hien-thi?p=${page.first ? 0: page.number - 1}">Prev</a>
<a href="/buoi11/san-pham/hien-thi?p=${page.last ? page.totalPages - 1: page.number + 1}">Next</a>
<a href="/buoi11/san-pham/hien-thi?p=${page.totalPages - 1}">Last</a>
</body>
</html>