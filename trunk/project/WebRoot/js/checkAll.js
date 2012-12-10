function checkAll(checked){
	var objs=document.getElementsByName("ids");
	if(objs!=null && objs.length>0){
		for(var i=0;i<objs.length;i++){
			objs[i].checked=checked;
		}
	}
}
function getCheckValue(){
	var checkValue="";
	var objs=document.getElementsByName("ids");
	if(objs!=null && objs.length>0){
		for(var i=0;i<objs.length;i++){
			if(objs[i].checked){
				checkValue+=objs[i].value+";";
			}
		}
	}
	return checkValue;
}
function getCheckValueArr(){
	return getCheckValue().split(";");
}
function isCheckOne(){
	var value=getCheckValue();
	if(value!=null && value!=""){
		var valueArr=value.split(";");
		if(valueArr!=null && valueArr.length==2){
			return true;
		}else{
			return false;
		}
	}
	return false;
}
function getCheckOneValue(){
	var objs=document.getElementsByName("ids");
	if(objs!=null && objs.length>0){
		for(var i=0;i<objs.length;i++){
			if(objs[i].checked){
				return objs[i].value;
			}
		}
	}
	return "";
}
function isCheck(){
	var objs=document.getElementsByName("ids");
	if(objs!=null && objs.length>0){
		for(var i=0;i<objs.length;i++){
			if(objs[i].checked){
				if(objs[i].checked){
					return true;
				}
			}
		}
	}
	return false;
}