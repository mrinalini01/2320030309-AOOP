package com.facadePattern;

public class Client {

    public static void main(String[] args) {
        // Create the components
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Amplifier amplifier = new Amplifier();
        Lights lights = new Lights();
        Screen screen = new Screen();

        // Create the facade
        HomeTheatre theatre = new HomeTheatre(dvdPlayer, projector, amplifier, lights, screen);

        // Use the facade to watch a movie
        theatre.watchMovie();

        // After the movie ends
        theatre.endMovie();
    }
}


