package com.reverside.workflow.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreditAssessment {
    private String directorId;
    private String businessName;
    private RiskProfile riskProfile;
}
