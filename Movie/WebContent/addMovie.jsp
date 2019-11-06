<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="margin-top:200px">
<center>
<form method="post" action="http://localhost:9090/Movie/AddMovieController">
Enter the movie ID: <input type="text" name="id" width="100px">
<br><br>

Enter the movie Name: <input type="text" name="movie_name" width="100px">
<br><br>

Enter the name of actor: <input type="text" name="actor" width="100px">
<br><br>

Enter the name of actress: <input type="text" name="actress" width="100px">
<br><br>

Enter the name of director: <input type="text" name="director" width="100px">
<br><br>

Enter collection: <input type="text" name="collection" width="100px">
<br><br>


Enter the date of release: <input type="text" name="date_of_release" width="100px">
<br><br>

<input type="submit" value ="Add Movie" width="100px">
<br><br>
</form>
</center>





</body>
</html>