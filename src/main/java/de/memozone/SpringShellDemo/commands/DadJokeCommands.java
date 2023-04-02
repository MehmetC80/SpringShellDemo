package de.memozone.SpringShellDemo.commands;

import de.memozone.SpringShellDemo.client.DadJokeClient;
import de.memozone.SpringShellDemo.model.DadJokeResponse;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;


@ShellComponent
public class DadJokeCommands {

    private final DadJokeClient dadJokeClient;

    public DadJokeCommands(DadJokeClient dadJokeClient) {
        this.dadJokeClient = dadJokeClient;
    }


    @ShellMethod(key = "randomJoke", value = "I will return a random dad joke")
    public String getRandomDadJoke() {
        DadJokeResponse random = dadJokeClient.randomJoke();

        return random.joke();
    }


}
