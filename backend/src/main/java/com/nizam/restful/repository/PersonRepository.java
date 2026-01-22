package com.nizam.restful.repository;

import com.nizam.restful.entity.PersonData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonData, Long> {
}
