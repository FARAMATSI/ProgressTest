package com.example.progresstest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "\"Adv_arr\"", schema = "PUB")
public class Advance {

    @Id
    @Basic
    @Column(name = "EC_No", nullable = false, length = 16)
    private String ecNo;

    @Basic
    @Column(name ="Pay_pr")
    private Integer payPr;

    @Basic
    @Column(name = "Amount")
    private BigDecimal ammount;

}
