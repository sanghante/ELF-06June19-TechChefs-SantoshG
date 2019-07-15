function validateForm(){
    let myemail = document.forms[0].email.value;
    let mypassword = document.forms[0].password.value;
    let myconfirmpass = document.forms[0].confirmpassword.value;

    let emaillength = myemail.length;
    let passwordength = mypassword.length;
    let confirmpasswordlen = myconfirmpass.length;
    
    if( emaillength > 6 && passwordength > 6 && confirmpasswordlen>6 && (mypassword===myconfirmpass) ){
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