function validateForm(){

    let mypassword = document.forms[0].password1.value;
    let myconfirmpass = document.forms[0].password2.value;

    let passwordength = mypassword.length;
    let confirmpasswordlen = myconfirmpass.length;
    
    if( passwordength > 6 && (mypassword===myconfirmpass) ){
        document.forms[0].sbmt.disabled = false;
    }else{
        document.forms[0].sbmt.disabled = true;
    }
}

function ValidateEmail(inputText)
{
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    if(inputText.value.match(mailformat))
    {
        return true;
    }
    else
    {
    return false;
    }
}

function showPassword(){
    if(document.forms[0].showpassword.checked){
        document.forms[0].password.type = "text";
        document.forms[0].confirmpassword.type = "text";
    }else{
        document.forms[0].password.type = "password";
        document.forms[0].confirmpassword.type = "password";
    }
}