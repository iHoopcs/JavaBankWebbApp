package com.webapp.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebappController {

    @GetMapping("/")
    public String getLoginSignup(){
        return "/LoginSignup/LoginOrSignup.html";
    }

    //take in user data - user model object to store data and use in display in SuccessfulSignup.html
    @GetMapping("/Signup")
    public String showSignUpForm(Model model){
        User user = new User(); 
        model.addAttribute("user", user);

        return "/LoginSignup/SignupForm.html";
    }

    //upon submission of form --> show the inputted user data
    @PostMapping("/Signup")
    public String submitForm(@ModelAttribute("user") User user){
    System.out.println(user); 
    return "/LoginSignup/SuccessfulSignup.html";
    }

    @GetMapping("/Home")
    public String getHomepage(){
        return "Homepage.html";
    }

    @GetMapping("/AccountBalance")
    public String getAccountBalancePage(){
        return "/Web App Functionality/AccountBalance.html";
    }

    @GetMapping("/DepositFunds")
    public String getDepositFundsPage(){
        return "/Web App Functionality/DepositFunds.html";
    }

    @GetMapping("/WithdrawalFunds")
    public String getWithdrawalFundsPage(){
        return "/Web App Functionality/WithdrawalFunds.html";
    }

    @GetMapping("/TransferFunds")
    public String getTransferFundsPage(){
        return "/Web App Functionality/TransferFunds.html";
    }
    


    
}
