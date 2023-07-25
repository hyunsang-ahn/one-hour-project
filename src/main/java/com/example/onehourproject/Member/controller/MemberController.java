package com.example.onehourproject.Member.controller;


import com.example.onehourproject.Member.controller.dto.JoinRequest;
import com.example.onehourproject.Member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;
    @GetMapping("/hello")
    public String getHello(){
        return "hello hyunsangddd";
    }


    @PostMapping("/join")
    public String join(@RequestBody JoinRequest joinRequest){
//        String id = joinRequest.getId();
//        String name = joinRequest.getName();
//        String phoneNumber = joinRequest.getPhoneNumber();

        String result = memberService.join(joinRequest);

//
//        if(result.equalsIgnoreCase("success")){
        if("success".equalsIgnoreCase(result)){
            return "success1";
        }else{
            return "fail1";

        }
    }

}
