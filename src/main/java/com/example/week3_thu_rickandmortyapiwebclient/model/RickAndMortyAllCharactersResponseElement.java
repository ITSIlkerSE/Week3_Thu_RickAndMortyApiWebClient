package com.example.week3_thu_rickandmortyapiwebclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RickAndMortyAllCharactersResponseElement {

    List<RickAndMortyAllCharactersElement> results;

}
