<%!

public int age = 25;
public String name = "Sadashiva";

public String getName() {
	return name;
}

public String getName(String abc) {
	return "Given name is "+abc;
}

public int getAge() {
	return age;
}

{
	System.out.println("My block");
	
}

%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>My Tags Example</title>
</head>
<body>
	<h1>
		<span style="color: blue">My Tags Example...</span>
	</h1>
	
	<h5>
	Name is : <%= name %> <BR>
	Name is : <%= getName() %> <BR>
	Name is : <%= getName("Mahadev") %> <BR>
	Name is : <%= age %> <BR>
	Name is : <%= getAge() %> <BR>
	</h5>
	
	
	<%!
	int i=0;
	%>
	<%
	for(; i < 5; i++) {
	%>
	
	Name <%= i %> : <%= name %>	<br>
	
	<%	
	}
	
	
	%>
</body>
</html>