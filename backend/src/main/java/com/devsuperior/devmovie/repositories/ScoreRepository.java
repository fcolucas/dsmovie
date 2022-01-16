package com.devsuperior.devmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.devmovie.entities.Score;
import com.devsuperior.devmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {}
