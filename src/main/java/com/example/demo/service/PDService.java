package com.example.demo.service;

import com.example.demo.models.Developer;
import com.example.demo.models.Request;
import com.example.demo.models.Team;
import com.example.demo.repository.DeveloperRepository;
import com.example.demo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PDService {
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private DeveloperRepository developerRepository;

    public Team create(Request request){
        Team team = request.getTeam();
        Team teamFromDB = this.teamRepository.findById(team.getId());
        if(teamFromDB != null){
            team.setId(teamFromDB.getId());
            this.teamRepository.delete(teamFromDB);
        }else {
            team.setId(Team.counter++);
        }
        List<Developer> developerList = request.getDevelopers();
        for(Developer developer : developerList){
            Developer developerFromDB = this.developerRepository.findById(developer.getId());
            if(developerFromDB != null){
                developer.setId(developerFromDB.getId());
                this.developerRepository.delete(developerFromDB);
            }else {
                developer.setId(Developer.counter++);
            }
            developerRepository.save(developer);
        }
        return teamRepository.save(team);
    }
}
