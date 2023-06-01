<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>テスト結果一覧</title>
</head>
<body>
<a href = "inputDate.jsp">データの追加</a>
<table>
<tr>
	<th>削除</th><th>名前</th><th>点数</th>
</tr>
<c:forEach items = "${nameKey}" var = "name">
<c:forEach items = "${scoreKey}" var = "score">
<tr>
<td><c:out value = "${name}" /></td>
<td><c:out value = "${score}" /></td></tr>
</c:forEach>
</c:forEach>
</table>
</body>
</html>