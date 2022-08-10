package com.nicepeopleproject.simpleProjects.service;

import com.nicepeopleproject.simpleProjects.model.AAuser;
import com.nicepeopleproject.simpleProjects.repository.AAuserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AAuserServiceImpl implements AAuserService{
  @Autowired
  AAuserRepository aAuserRepository;

  @Override
  public List<AAuser> getAll() {
    return aAuserRepository.findAll();
  }
}
