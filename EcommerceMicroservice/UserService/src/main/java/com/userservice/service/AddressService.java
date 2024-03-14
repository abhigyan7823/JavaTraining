package com.userservice.service;

import java.util.List;

import com.userservice.dto.AddressDTO;
import com.userservice.entity.Address;

public interface AddressService {

	AddressDTO createAddress(AddressDTO addressDTO);

	List<AddressDTO> getAddresses();

	AddressDTO getAddress(Long addressId);

	AddressDTO updateAddress(Long addressId, Address address);

	String deleteAddress(Long addressId);

}