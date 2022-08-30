
/* Code not being used at the moment
//Function to make submit button disappear and display message on Signup.html page
function displayAndDisappear(){
    //retrieve element & store -> change text value and make not visible 
    var x = document.getElementById("submitButton"); 
    x.style.display = 'none'; 

    //Window message pops up with text
    window.alert("*Data Saved*")

    //Window changes current page to url parameter location
    window.location.replace("http://localhost:8080"); 
}
*/

function fetchSignupFormData(){
    //Fetch each of the user inputted data field values from Signup.html page
    var formFirstName = document.getElementById("fName").value;
    var formLastName = document.getElementById("lName").value;
    var formEmail = document.getElementById("emailAdd").value;
    var studentCheck = document.getElementById("studentCheck").value;
    var accountUsername = document.getElementById("accountUsername").value;
    var accountPassword = document.getElementById("accountPassword").value;

    //Display each value 
    document.write("Account Information: <br> <br>"); 
    document.write("First Name: " + formFirstName + "<br>"); 
    document.write("Last Name: " + formLastName + "<br>"); 
    document.write(" Email: " + formEmail + "<br>"); 
    document.write("Student: " + studentCheck + "<br>"); 
    document.write("Account Username: " + accountUsername + "<br>"); 
    document.write("Account Password: " + accountPassword); 

}