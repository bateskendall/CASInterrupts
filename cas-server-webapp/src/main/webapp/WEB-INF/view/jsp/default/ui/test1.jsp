<jsp:directive.include file="includes/top.jsp" />
<div class="Interrupt">
	<p><h2> This is Test1 Interrupt Screen<h2></p>
	<p>You must agree to the University's terms and agreements in order to continue</p>
	
	<FORM NAME="SubmitForm" METHOD="POST" >
        <INPUT TYPE="submit" NAME="submit" VALUE="I agree">
		<input type="button" onclick="https://localhost:8443/mywebapp" value="deny"/> 
    </FORM>
</div>
<jsp:directive.include file="includes/bottom.jsp" />