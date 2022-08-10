package com.nicepeopleproject.simpleProjects.repository;

import com.nicepeopleproject.simpleProjects.model.AAuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AAuserRepository extends JpaRepository<AAuser, Integer> {
}
