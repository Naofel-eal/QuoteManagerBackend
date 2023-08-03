package com.quotemanager.api.domain.model.enumeration;

public enum CompanyStatus {
    EI("EI"),
    EURL("EURL"),
    SARL("SARL"),
    SA("SA"),
    SAS("SAS"),
    SASU("SASU"),
    SNC("SNC"),
    SCOP("SCOP"),
    SCA("SCA"),
    SCS("SCS");

    private final String companyStatus;

    CompanyStatus(String companyStatus) {
        this.companyStatus = companyStatus;
    }

    public String getCompanyStatus() {
        return this.companyStatus;
    }

}

