package com.example.week3_thu_rickandmortyapiwebclient.controller;

import com.example.week3_thu_rickandmortyapiwebclient.model.RickAndMortyAllCharactersResponseElement;
import com.example.week3_thu_rickandmortyapiwebclient.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/character")

public class RickAndMortyController {

    private final CharacterService service;

    @Autowired
    public RickAndMortyController(CharacterService service) {
        this.service = service;
    }

    @GetMapping
    public RickAndMortyAllCharactersResponseElement getAllCharacters(){

        return service.getAllCharacters();

    }



}
