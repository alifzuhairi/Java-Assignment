/**
 *This is external javascript file 
 */
function testAlert(){
	alert('testing alert done');
}

function validateEmail(mail){
	if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(mail)){
		return(true)
	}
	return(false)
}