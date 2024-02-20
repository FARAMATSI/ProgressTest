package com.example.progresstest.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "AD_HIST", schema = "PUB")
public class ArrearsContributionApplication {
    @Id
    @Column(name = "EC_No")
    private String ecNumber;
    @Column(name = "AD_Code")
    private Integer AllowanceCode;
    @Column(name = "Amount")
    private BigDecimal Amount;
    @Column(name = "Payee_name")
    private String PayeeName;
}
