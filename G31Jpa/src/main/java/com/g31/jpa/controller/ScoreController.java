/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.g31.jpa.controller;

import com.g31.jpa.entity.Score;
import com.g31.jpa.entity.Game;
import com.g31.jpa.service.ScoreService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Camilo Torres C
 */

@RestController
@RequestMapping("/Score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;
    
    
    @GetMapping("/all")
    public List<Score> getScore(){
        return scoreService.getScore();
    }
    
    @GetMapping("/{id}")
    public Score getScoreById(@PathVariable("id") Long idScore){
        return scoreService.getScoreById(idScore);
    }
    @PostMapping("/save")
    public ResponseEntity saveScore(@RequestBody Score category){
        scoreService.saveScore(category);
        return ResponseEntity.status(201).build();
    }
}
