package com.noel.olen.dao;

import com.noel.olen.entity.Address;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "addresses", collectionResourceRel = "addresses")
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {

}
