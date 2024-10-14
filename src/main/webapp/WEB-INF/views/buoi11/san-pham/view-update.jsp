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
<form action="/buoi11/san-pham/update" method="post">
        ID: <input type="text" name="id" value="${sp.id}" readonly> <br>
        Ten: <input type="text" name="ten" value="${sp.ten}"> <br>
        Gia: <input type="text" name="gia" value="${sp.gia}"> <br>
        NgayTao: <input type="date" name="ngayTao" value="${sp.ngayTao}"> <br>
        DanhMuc: <select name="danhMuc">
        <c:forEach items="${listDanhMuc}" var="dm">
            <option value="${dm.id}" label="${dm.ten}" ${sp.danhMuc.id==dm.id?"selected":""}></option>
        </c:forEach>
    </select> <br>
        <button type="submit">Sua</button>
</form>
</body>
</html>