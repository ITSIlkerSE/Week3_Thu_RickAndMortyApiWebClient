package com.example.week3_thu_rickandmortyapiwebclient.service;


import com.example.week3_thu_rickandmortyapiwebclient.model.RickAndMortyAllCharactersElement;
import com.example.week3_thu_rickandmortyapiwebclient.model.RickAndMortyAllCharactersResponseElement;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service

public class CharacterService {

    private WebClient client = WebClient.create("https://rickandmortyapi.com/api");

            public RickAndMortyAllCharactersResponseElement getAllCharacters(){

                RickAndMortyAllCharactersResponseElement allCharacters =
                        client.get()
                                .uri("/character")
                                .retrieve()
                                .toEntity(RickAndMortyAllCharactersResponseElement.class)
                                .block()
                                .getBody();
                return allCharacters;

            }


}
