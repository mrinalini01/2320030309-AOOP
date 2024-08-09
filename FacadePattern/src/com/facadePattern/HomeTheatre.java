package com.facadePattern;

class HomeTheatre {
	private DVDPlayer dvdPlayer;
    private Projector projector;
    private Amplifier amplifier;
    private Lights lights;
    private Screen screen;
    
    public HomeTheatre(DVDPlayer dvdPlayer, Projector projector, Amplifier amplifier, Lights lights, Screen screen) {
    	this.dvdPlayer = dvdPlayer;
    	this.projector = projector;
        this.amplifier = amplifier;
        this.lights = lights;
        this.screen = screen;
    }
    
    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.setInput("DVD");
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play();
    }
    
    public void endMovie() {
        System.out.println("Shutting down the home theatre...");
        dvdPlayer.stop();
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        screen.up();
        lights.dim(100);
    }
}
