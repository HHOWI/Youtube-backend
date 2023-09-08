package com.kh.youtube.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@DynamicInsert
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    private String id;
    @Column
    private String password;
    @Column
    private String name;
    @Column
    private String authority;

}
