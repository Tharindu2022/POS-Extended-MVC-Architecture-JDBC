package com.tharindutech.pos.bo.custom;

import com.tharindutech.pos.dto.CustomerDto;

import java.util.ArrayList;

public interface CustomerBo {

  public boolean saveCustomer(CustomerDto dto);
  public boolean updateCustomer(String id);
  public boolean deleteCustomer(String id);
  public ArrayList<CustomerDto> searchCustomer(String  searchText);





}
