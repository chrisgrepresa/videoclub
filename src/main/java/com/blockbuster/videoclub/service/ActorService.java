package com.blockbuster.videoclub.service;

import com.blockbuster.videoclub.dao.Actor;
import com.blockbuster.videoclub.repository.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> searchAllActors(){
        return actorRepository.findAll();
    }
}
