
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Login</title>
        </head>
        <body>
            <form method="post" action="registerPage" modelAttribute="authuser">
                <table align="center">
                     <tr>
                        <td><div class="sign-up-htm">
			
					<label for="user" class="label">First Name</label>
					<input id="user" type="text" name="firstName" class="input" required=" ">
                       <br>
                     
					<label for="user" class="label">Last Name</label>
					<input id="user" type="text" name="lastName" class="input" required=" ">
			  <br>
					<label for="user" class="label">Phone Number</label>
					<input id="user" type="number" name="phoneNumber" class="input"  required=" ">
				  <br>
					<label for="pass" class="label">Email Address</label>
					<input id="pass" type="Email" name="userEmail" class="input" required=" ">
				  <br>
					<label for="user" class="label">Gender</label>
				
					<input  type="radio" name="Gender" value="male" >Male
					<input  type="radio" name="Gender" value="female" >Female
				    <input  type="radio" name="Gender" value="others" >Others
			  <br>
					<label for="password" class="label">Password</label>
					<input id="password" type="password" name="password" class="label" data-type="password" required>
				  <br>
					<label for="password" class="label">Confirm Password</label>
					<input id="password" type="password" name="password" class="label" data-type="password" required>
				  <br>
					<input type="submit" class="button" value="Sign Up">
				</div>
	
                        </td>
                    </tr>
                </table>
            </form>
            <table align="center">
                <tr>
                    <td style="font-style: italic; color: red;">${message}</td>
                </tr>
            </table>
        </body>
        </html>