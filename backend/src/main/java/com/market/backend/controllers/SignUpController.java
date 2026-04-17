package com.market.backend.controllers;

import com.market.backend.dtos.ClientBasicSignUpRequest;
import com.market.backend.models.VendorRequest;
import com.market.backend.services.SignUpService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/SignUp")
public class SignUpController {

    private final SignUpService service;

    public SignUpController(SignUpService service) {
        this.service = service;
    }

    @GetMapping("/Google/Client")
    public String googleOauthClient(@AuthenticationPrincipal OAuth2User principal){
        return service.insertClientByGoogleAccount(principal.getAttributes().get("email").toString());
    }

    @GetMapping("/Google/Vendor/{org}/{tax}")
    public String googleOauthVendor(@AuthenticationPrincipal OAuth2User request, @PathVariable String org, @PathVariable long tax){
        return service.registerVendorRequest(request.getAttributes().get("email").toString(), org, tax);
    }

    @PostMapping("/ClientBasicSignUp")
    public String clientBasicSignUp(@RequestBody ClientBasicSignUpRequest request) {
        return service.insertBasicClient(request.getUsername(), request.getPassword());
    }

    @PostMapping("/VendorBasicSignUp")
    public String vendorBasicSignUp(@RequestBody VendorRequest vendor) {
        return service.insertBasicVendor(vendor);
    }


}
