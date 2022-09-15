package com.example.week3_thu_rickandmortyapiwebclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RickAndMortyAllCharactersElement {

    private int id;
    private String name;
    private String status;

}
