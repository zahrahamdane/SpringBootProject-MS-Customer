package com.ensa.mscustomer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequestDto {

    private String firstName;
    private String lastName;
    private String email;
    private String adress;
    private String city;
}
