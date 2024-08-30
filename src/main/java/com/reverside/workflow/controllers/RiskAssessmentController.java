package com.reverside.workflow.controllers;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reverside.workflow.models.CreditAssessment;
import com.reverside.workflow.models.RiskProfile;

@RestController
public class RiskAssessmentController {
    @GetMapping("/assessment")
    public CreditAssessment riskProfileAssessment(
            @RequestParam("directorId") String directorId,
            @RequestParam("businessName") String businessName) {

        CreditAssessment creditAssessment = new CreditAssessment();

        creditAssessment.setBusinessName(businessName);
        creditAssessment.setDirectorId(directorId);
        creditAssessment.setRiskProfile(randomEnum(RiskProfile.class));

        return creditAssessment;
    }

    public static <T extends Enum<?>> T randomEnum(Class<T> values) {
        int i = new Random().nextInt(3);
        return values.getEnumConstants()[i];
    }

}
