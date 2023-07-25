package com.example.onehourproject.Member.service;

import com.example.onehourproject.Member.controller.dto.JoinRequest;
import com.example.onehourproject.Member.repository.MemberRepository;
import com.example.onehourproject.Member.repository.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceimpl implements MemberService{
    private final MemberRepository memberRepository;
 

    @Override
    public String join(JoinRequest joinRequest){
        Member member = Member.builder()
                .id(joinRequest.getId())
                .name(joinRequest.getName())
                .phoneNumber(joinRequest.getPhoneNumber())
                .build();

        memberRepository.save(member);


        return "success";
    }

}
