package com.example.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Create by Kush on 31-03-2021
 */
@Service
public class JokeServiceImpl implements JokeService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
