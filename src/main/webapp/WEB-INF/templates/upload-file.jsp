<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>Minh họa tải file</h1>
<form action="upload-file" method="post" enctype="multipart/form-data">
	<p><label>Tập tin:</label><input type="file" name="file"></p>
	<p><button type="submit">Upload</button>
</form>
<p>
<c:if test="${not empty tapTin }">
<img src="img/${tapTin }" width="100" height="100"/>
</c:if>
</p>