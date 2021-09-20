<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 	<jsp:include page="../bootstrapHead.jsp"></jsp:include>
	<title>Dog Information</title>
</head>
<body>
    
		<h2>${dogs.breed}</h2><h3>(${dogs.breedGroup})</h3>
		<h5>${dogs.height}</h5><h5>${dogs.weight}</h5><h5>${dogs.avgLifeSpan}</h5><h5>${dogs.friendlyScale}</h5><h5>${dogs.healthAndGrooming}</h5><h5>${dogs.trainabilityScale}</h5><h5>${dogs.exerciseNeedsScale}</h5>
		<p>${dogs.moreInfo}</p>


<jsp:include page="../bootstrapFoot.jsp"></jsp:include>

</body>
</html>