package com.webapp.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebappController {

    @GetMapping("/")
    public String getLoginSignup(){
        return "/LoginSignup/LoginOrSignup.html";
    }

    @GetMapping("/Home")
    public String getHomepage(){
        return "Homepage.html";
    }

    @GetMapping("/AccountBalance")
    public String getAccountBalancePage(){
        return "/BankFunctionality/AccountBalance.html";
    }

    @GetMapping("/DepositFunds")
    public String getDepositFundsPage(){
        return "/BankFunctionality/DepositFunds.html";
    }

    @GetMapping("/WithdrawalFunds")
    public String getWithdrawalFundsPage(){
        return "/BankFunctionality/WithdrawalFunds.html";
    }

    @GetMapping("/TransferFunds")
    public String getTransferFundsPage(){
        return "/BankFunctionality/TransferFunds.html";
    }

    @GetMapping("/Login")
    public String getLoginPage(){
        return "/LoginSignup/Login.html";
    }

    @GetMapping("/Signup")
    public String getSignupPage(){
        return "/LoginSignup/Signup.html";
    }


    


    
}
