package com.sda.company.convertor;

import com.sda.company.dto.CompanyCreateDTO;
import com.sda.company.dto.CompanyInfoDTO;
import com.sda.company.model.CompanyEntity;

public class CompanyConvertor {

    public static CompanyEntity convertToCompanyEntity(CompanyCreateDTO companyCreateDTO){
        CompanyEntity company = new CompanyEntity();
        company.setName(companyCreateDTO.getName());
        company.setAddress(companyCreateDTO.getAddress());
        company.setEmail(companyCreateDTO.getEmail());
        company.setPhoneNumber(companyCreateDTO.getPhoneNumber());
        company.setRegistrationNumber(companyCreateDTO.getRegistrationNumber());

        return company;
    }

    public static CompanyInfoDTO convertToInfoDTO(CompanyEntity companyEntity){
        CompanyInfoDTO companyInfoDTO = new CompanyInfoDTO();
        companyInfoDTO.setId(companyEntity.getId());
        companyInfoDTO.setName(companyEntity.getName());
        companyInfoDTO.setAddress(companyEntity.getAddress());
        companyInfoDTO.setEmail(companyEntity.getEmail());
        companyInfoDTO.setPhoneNumber(companyEntity.getPhoneNumber());
        companyInfoDTO.setRegistrationNumber(companyEntity.getRegistrationNumber());

        return companyInfoDTO;
    }
}
