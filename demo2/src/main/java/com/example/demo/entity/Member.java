package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Entity  //บอกว่าเป็น class entity class ที่เก็บขอมูล
@Data  // lombox จะสร้าง method getter setter ให้เอง
@Table(name ="Member")
public class Member {
    //@Id  //  Annotations  @Id  บอกว่าเป็น  Primary  key
    @SequenceGenerator(name="Member_seq",sequenceName="Member_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Member_seq")
    @Column(name = "Member_ID")
    @Id private @NonNull Long Member_id;
    private String Member_name;


    public Long Member_id() {
        return Member_id;
    }

    public void Member_id(Long Member_id) {
        this.Member_id = Member_id;
    }

    public String getMember_name() {
        return Member_name;
    }

    public void setMember_name(String Member_name) {
        this.Member_name = Member_name;
    }







    public Member(){}
    public Member(String Member_name) {  //constructor
        this.Member_name = Member_name;

    }


}
