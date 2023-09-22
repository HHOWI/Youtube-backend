package com.kh.youtube.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class Category {

    @Id
    @Column(name="category_code")
    @GeneratedValue(strategy= GenerationType.IDENTITY, generator = "categorySequence") // Generator name과 맞추기
    @SequenceGenerator(name = "categorySequence", sequenceName = "SEQ_CATEGORY", allocationSize = 1)
    private int categoryCode;
    @Column(name="category_name")
    private String categoryName;
}
