/*var Email=document.forms['form2']['email'];
var Password=document.forms['form2']['password'];

var email_error=document.getElementById('email_error');
var password_error=document.getElementById('password_error');

function validate(){
    /*
    if(Email.value.length<8&&Password.value.length<8){
        alert("Retry");
        /*Email.focus();
        return false;

    }
}*/
function validate(){
    let Email=document.getElementById('email').value;
    let Password=document.getElementById('password').value;
    if(Email.value.length<8 && Password.value.length<8){
        alert("Retry");
    }

}
    