package com.atuluttam.M2_Ecom.dto;

import com.atuluttam.M2_Ecom.model.Address;
import lombok.Data;



//CLASS To send the data for persisting the USER
@Data
public class UserRequest  {
    private String id;
    private String fname;
    private String lname;
    private String email;
    private String phone;
    private Address address;
}
