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