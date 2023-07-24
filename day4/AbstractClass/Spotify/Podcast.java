package com.day4.AbstractClass.Spotify;

import java.util.Scanner;

//Podcast (subclass of MusicTrack):
//Properties: host (String), episodeNumber (int)
//Methods: displayTrackDetails() (overrides parent method)
	
public class Podcast {
	String host;
	int episodeNumber;
	
	void getAudioBooks(){
		Scanner sc = new Scanner(System.in)
	}
	
	void displayTrackDetails(){
		System.out.println("Host Name: " + this.host);
		System.out.println("Episode Number: " + this.episodeNumber);
	}
}
