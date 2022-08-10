package com.nicepeopleproject.simpleProjects.controller;

import com.nicepeopleproject.simpleProjects.model.AAuser;
import com.nicepeopleproject.simpleProjects.repository.AAuserRepository;
import com.nicepeopleproject.simpleProjects.service.AAuserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api/aauser")
public class AAuserRest {
  @Autowired
  private AAuserService aAuserService;

  @RequestMapping
  public ResponseEntity<String> status() {
    return new ResponseEntity<>("Working...", HttpStatus.OK);
  }

  @RequestMapping(value = "/getall", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<List<AAuser>> getAll() {
    return new ResponseEntity<>(aAuserService.getAll(), HttpStatus.OK);
  }
}
