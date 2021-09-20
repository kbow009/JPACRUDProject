<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <jsp:include page="../bootstrapHead.jsp"></jsp:include>
<title>Add a Dog</title>
</head>
<body>
<form action="addDogs.do" method="get">
      <label for="breed">Breed:</label>
      <input type="text" name="breed" value="">
      <br>
      <label for="breedGroup">Breed Group:</label>
      <input type="text" name="breedGroup" value="">
      <br>
      <label for="height">Height:</label>
      <input type="text" name="height" value="">
      <br>
      <label for="weight">Weight:</label>
      <input type="text" name="weight" value="">
      <br>
      <label for="avgLifeSpan">Average Life Span:</label>
      <input type="text" name="avgLifeSpan" value="">
      <br>
      <label for="friendlyScale">Friendliness Rating:</label>
      <input type="text" name="friendlyScale" value="">
      <br>
      <label for="healthAndGrooming">Health and Grooming Rating:</label>
      <input type="text" name="healthAndGrooming" value="">
      <br>
      <label for="trainabilityScale">Trainability Rating:</label>
      <input type="text" name="trainabilityScale" value="">
      <br>
      <label for="exerciseNeedsScale">Exercise Needs Rating:</label>
      <input type="text" name="exerciseNeedsScale" value="">
      <br>
      <label for="moreInfo">More Info:</label>
      <input type="text" name="moreInfo" value="">
      <br>
      <input type="submit" value="Add Dog">
    </form>




<jsp:include page="../bootstrapFoot.jsp"></jsp:include>
</body>
</html>