// Form = Admin-login, field = Access code, funtion = filedCheck(), fieldClear()

function fieldCheck() {
	var inputKey = document.getElementById("txtAccess");
	if (inputKey.value === "") {
		alert("Access Code Is Required");
		return false;
	} else if (inputKey.value.trim().length < 6) {
		alert("Access Code Must Be 6 Digit");
		return false;
	} else {
		true;
	}
};

function fieldClear() {
	document.getElementById("adminLogin").reset();
	return false;
};