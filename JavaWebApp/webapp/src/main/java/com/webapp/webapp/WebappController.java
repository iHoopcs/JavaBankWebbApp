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
