package de.memozone.SpringShellDemo.client;

import de.memozone.SpringShellDemo.model.DadJokeResponse;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

public interface DadJokeClient {

    //GET Request to https://icanhazdadjoke.com/
    @GetExchange("/")
    DadJokeResponse randomJoke();


}
