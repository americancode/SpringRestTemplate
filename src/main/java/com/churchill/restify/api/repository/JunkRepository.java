package com.churchill.restify.api.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.churchill.restify.api.entity.Junk;

@RepositoryRestResource(path = "junk")
public interface JunkRepository extends PagingAndSortingRepository<Junk, Long> {

	List<Junk> findByLastName(@Param("name") String name);

}