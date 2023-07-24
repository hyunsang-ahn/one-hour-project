package com.example.onehourproject.Member.repository.entity;


import lombok.*;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    private String phoneNumber;
}
