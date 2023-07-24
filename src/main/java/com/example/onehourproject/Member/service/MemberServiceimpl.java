package com.example.onehourproject.Member.service;

import com.example.onehourproject.Member.repository.MemberRepository;
import com.example.onehourproject.Member.repository.entity.Member;

public class MemberServiceimpl implements MemberService{
    private final MemberRepository memberRepository = null;

 

    @Override
    public String join(String id, String name, String phoneNumber){
        Member member = Member.builder()
                .id(id)
                .name(name)
                .phoneNumber(phoneNumber)
                .build();

        memberRepository.save(member);


        String success = "success";
        return success;
    }

}
