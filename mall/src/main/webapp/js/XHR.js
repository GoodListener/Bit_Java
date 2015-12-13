var XHR = null;
function getXHR() { //XHR 가져오기
	if(window.ActiveXObject){ //익스플로러 유효성검사
		return new ActiveXObject("Msxml2.XMLHTTP");
	}else if(window.XMLHttpRequest){ //다른브라우저 유효성검사
		return new XMLHttpRequest();
	}else{
		return null;
	}
}

function sendRequest(url,param,callback,method){
	XHR = getXHR();
	var httpMethod=method?method:'GET';
	if(httpMethod!='GET'&&httpMethod!='POST'){
		httpMethod='GET';
	}
	var httpParam=(param==null||param=='')?null:param;
	if(httpMethod=='GET'&&httpParam!=null){
		url=url+"?"+httpParam;
	}
	XHR.onreadystatechange=callback;
	XHR.open(httpMethod,url,true);
	XHR.setRequestHeader('Content-Type','application/x-www-form-urlencoded');
	XHR.send(httpMethod=='POST'?httpParam:null);
}