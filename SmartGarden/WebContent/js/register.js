
function checkname(){ 
	var div = document.getElementById("div1"); 
	div.innerHTML = ""; 
	var txt1=document.getElementById("text1");
	var name1 = txt1.value; 
	if (name1 == "") { 
		div.innerHTML = "姓名不能为空！"; 
		txt1.focus(); 
		return false; 
	} 
	if (name1.length < 4 || name1.length > 16) { 
		div.innerHTML = "姓名输入的长度4-16个字符！"; 
		txt1.select(); 
		return false; 
	} 
	var charname1 = name1.toLowerCase(); 
	for (var i = 0; i < name1.length; i++) { 
		var charname = charname1.charAt(i); 
		if (!(charname >= 0 && charname <= 9) && (!(charname >= 'a' && charname <= 'z')) && (charname != '_')) { 
			div.innerHTML = "姓名包含非法字母，只能包含字母，数字，和下划线"; 
			txt1.select(); 
			return false; 
		} 
	} 
	return true;
}

function checkpassword(){ 
	var div = document.getElementById("div2"); 
	div.innerHTML = ""; 
	var txt2=document.getElementById("text2");
	var password = txt2.value; 
	if (password == "") { 
		div.innerHTML = "密码不位空！"; 
		txt2.focus(); 
		return false; 
	} 
	if (password.length < 4 || password.length > 12) { 
		div.innerHTML = "密码长度4-12位"; 
		txt2.select(); 
		return false; 
	} 
	return true; 
}

function checkrepassword(){ 
	var div = document.getElementById("div3"); 
	div.innerHTML = ""; 
	var txt2=document.getElementById("text2");
	var txt3=document.getElementById("text3");
	var password = txt2.value; 
	var repass = txt3.value; 
	if (repass == "") { 
		div.innerHTML = "密码不位空！"; 
		txt3.focus(); 
		return false; 
	} 
	if (password != repass) { 
		div.innerHTML = "输入密码和确认密码不一致"; 
		txt3.select(); 
		return false; 
	} 
	return true; 
}

function checkEmail(){ 
	var div = document.getElementById("div4"); 
	div.innerHTML = ""; 
	var txt4=document.getElementById("text4");
	var email = txt4.value; 
	var sw = email.indexOf("@", 0); 
	var sw1 = email.indexOf(".", 0); 
	var tt = sw1 - sw; 
	if (email.length == 0) { 
		div.innerHTML = "电子邮件不能位空"; 
		txt4.focus(); 
		return false; 
	} 
	if (email.indexOf("@", 0) == -1) { 
		div.innerHTML = "电子邮件格式不正确，必须包含@符号！"; 
		txt4.select(); 
		return false; 
	} 
	if (email.indexOf(".", 0) == -1) { 
		div.innerHTML = "电子邮件格式不正确，必须包含.符号!"; 
		txt4.select(); 
		return false; 
	} 
	if (tt == 1) { 
		div.innerHTML = "邮件格式不对。@和.不可以挨着！"; 
		txt4.select(); 
		return false; 
	} 
	if (sw > sw1) { 
		div.innerHTML = "电子邮件格式不正确，@符号必须在.之前"; 
		txt4.select(); 
		return false; 
	} 
	else { 
		return true; 
	}
	return ture; 
}

function check(){ 
	if (checkname() && checkpassword() && checkrepassword() && checkEmail()) { 
		return true; 
	} 
	else { 
		return false; 
	} 
}