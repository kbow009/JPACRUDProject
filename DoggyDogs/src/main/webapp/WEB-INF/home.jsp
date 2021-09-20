<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="bootstrapHead.jsp"></jsp:include>
<title>Doggy Dogs</title>
</head>
<body>
<div class="container-fluid">
<h1>Dog CRUD Project</h1>
<p>Check out a few awesome dogs from the list below.</p>
    <form class="form" action="getDogs.do" method="GET">
		Dog ID: <input type="text" name="fid" />
		<input class="btn btn-primary" type="submit" value="Show Dog" />
	</form>
	<br>
<a href="/dog/add.jsp"><p>Add a dog to the list.</p></a>
    <!-- <form class="form" action="add.jsp" method="GET"> -->
		<input class="btn btn-primary" type="submit" value="Add Dog" />
	</form> 
	<br>
<p>Update dog info.</p>
    <form class="form" action="update.jsp" method="GET">
		Dog ID: <input type="text" name="id, dog" />
		<input class="btn btn-primary" type="submit" value="Update Dog" />
	</form>
	<br>
<p>Delete dog from list.</p>
    <form class="form" action="delete.jsp" method="GET">
		Dog ID: <input type="text" name="id" />
		<input class="btn btn-primary" type="submit" value="Delete Dog" />
	</form>

<table class="table thead-dark table-striped table-hover">
		<thead>
			<tr>
				<th>Id</th>
				<th>Title</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="d" items="${dogs}">
				<tr>
					<td>${d.id }</td>
					<td><a href="getDogs.do?fid=${d.id}"> ${d.breed} </a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<jsp:include page="bootstrapFoot.jsp"></jsp:include>
</body>
</html>