package com.sda.company.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CompanyCreateDTO {
    @NotBlank(message = "Name is mandatory!" )
    private String name;

    @NotNull(message = "Registration number is required!")
    private Long registrationNumber;

    @Email(message = "Invalid email!")
    @NotBlank(message = "Email is required!")
    private String email;


    private String address;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public Long getRegistrationNumber() {
        return registrationNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegistrationNumber(Long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}



