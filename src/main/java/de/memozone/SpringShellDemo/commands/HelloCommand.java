package de.memozone.SpringShellDemo.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class HelloCommand {

    @ShellMethod(key="helloShell", value = "I will say Hello!!!")
    public String hello() {
        return "Hello World!";
    }

    @ShellMethod(key = "goodbyeShell",value = "I will say Goodbye!!!")
    public String goodbye() {
        return "Goodbye";
    }

    @ShellMethod(key = "shellOption",value = "Show options !!!")
    public String helloWithOption(@ShellOption(defaultValue = "World") String args) {
        return "Hello, "+args+ "!";
    }


}
