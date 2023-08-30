<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Details</h1>
	<form action="insert" method="post" enctype="multipart/form-data">
		<fieldset>
			<table>
				<tr>
					<td><label id="a">Name</label></td>
					<td><input id="a" type="text" name="name"></td>
				</tr>
				<tr>
					<td><label id="b">Email</label></td>
					<td><input id="b" type="email" name="email"></td>
				</tr>
				<tr>
					<td><label id="c">Password</label></td>
					<td><input id="c" type="password" name="password"></td>
				</tr>
				<tr>
					<td><label id="d">Mobile Number</label></td>
					<td><input id="d" type="tel" name="mobile"></td>
				</tr>
				<tr>
					<td><label id="e">Date-Of-Birth</label></td>
					<td><input id="e" type="date" name="date"></td>
				</tr>
				<tr>
					<td><label id="f">Picture</label></td>
					<td><input id="f" type="file" name="pic"></td>
				</tr>
				<tr>
					<td><label id="g">Gender</label></td>
					<td>Male<input id="g" type="radio" name="gender" value="male">
						Female<input id="h" type="radio" name="gender" value="female"></td>
				</tr>
				<tr>
					<td><label id="">Language</label></td>
					<td>English<input id="i" type="checkbox" name="language"
						value="English"> Hindi<input id="j" type="checkbox"
						name="language" value="Hindi"> Bengali<input id="k"
						type="checkbox" name="language" value="Bengali"></td>
				</tr>
				<tr>
					<td><label id="p">Role</label></td>
					<td><input id="p" type="text" name="role"></td>
				</tr>
				<tr>
					<td><label id="q">CTC</label></td>
					<td><input id="q" type="number" name="ctc">LPA</td>
				</tr>
				<tr>
					<td><label id="l">Department</label></td>
					<td><select name="department"><option>Development</option>
							<option>Testing</option>
							<option>Operation</option></select></td>
				</tr>
				<tr>
					<td><label id="m">Country</label></td>
					<td><select name="country"><option>India</option>
							<option>Uganda</option>
							<option>Bangladesh</option></select></td>
				</tr>
			</table>
			<br>
			<button type="submit">Save</button>
			<button type="reset">Cancel</button>
		</fieldset>
	</form>
	<a href="/"><button>Back</button></a>
</body>
</html>