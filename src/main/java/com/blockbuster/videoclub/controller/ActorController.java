package com.blockbuster.videoclub.controller;

import com.blockbuster.videoclub.dao.Actor;
import com.blockbuster.videoclub.service.ActorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actors") // todos los endpoints de este controlador van a empezar con esto, usar así en Postman
public class ActorController {

    private final ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping("/searchall")
    public List<Actor> searchAllActor(){
        return actorService.searchAllActors();
    }

}
