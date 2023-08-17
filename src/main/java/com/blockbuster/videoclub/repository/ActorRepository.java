package com.blockbuster.videoclub.repository;

import com.blockbuster.videoclub.dao.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ActorRepository extends JpaRepository<Actor,Integer>{
}
