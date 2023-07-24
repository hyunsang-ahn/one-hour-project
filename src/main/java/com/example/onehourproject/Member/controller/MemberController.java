package com.example.onehourproject.Member.controller;


import com.example.onehourproject.Member.controller.dto.JoinRequest;
import com.example.onehourproject.Member.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    private final MemberService memberService = null;
    @GetMapping("/hello")
    public String getHello(){
        return "hello hyunsangddd";
    }


    @PostMapping("/join")
    public String join(@RequestBody JoinRequest joinRequest){
        String id = joinRequest.getId();
        String name = joinRequest.getName();
        String phoneNumber = joinRequest.getPhoneNumber();



        String result = memberService.join(id, name, phoneNumber);

        if(result.equalsIgnoreCase("success")){
            return "success";
        }else{
            return "fail";

        }
    }

}
