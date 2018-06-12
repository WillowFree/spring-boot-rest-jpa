package com.noel.olen.repository;

import com.noel.olen.entity.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "addresses", collectionResourceRel = "addresses")
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {

  Page<Address> findByCodePostale(@Param("postCode") int postCode, Pageable pageable);
}
