package com.example.demo.controllers;


import com.example.demo.models.Request;
import com.example.demo.models.Team;
import com.example.demo.service.PDService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.Map;

@Slf4j
@RestController
public class PDController {

    @Autowired
    private PDService pdService;

    @RequestMapping(value = "/team", consumes="application/json", produces ="application/json", method = RequestMethod.POST)
    public ResponseEntity<Team> create(@RequestBody Request request) throws ServerException {

        Team team = pdService.create(request);
        if(team == null){
            throw new ServerException("Unable to create the team");
        }else {
            return new ResponseEntity<>(team, HttpStatus.CREATED);
        }
    }
}
