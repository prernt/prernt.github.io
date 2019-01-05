function validateForm(){
    
    var name = document.forms["signup_form"]["name"].value;
    var email = document.forms["signup_form"]["email"].value;
    var password = document.forms["signup_form"]["password"].value;
    var contact = document.forms["signup_form"]["contact"].value;
    var city = document.forms["signup_form"]["city"].value;
    var address = document.forms["signup_form"]["address"].value;
    var phoneno = /^\d{10}$/;
    
    if(name == "" || city == "" || address == "" || password == "" || (!contact.value.match(phoneno)))
        {
            alert("Please fill all the required fields");
            return false;
        }

}
