package com.day4.AbstractClass.Spotify;

import java.util.Scanner;

//Song (subclass of MusicTrack):
//
//Properties: artist (String), album (String)
//Methods: displayTrackDetails() (overrides parent method)

public class Song {
	String artist;
	String movie;
	
	void getAudioBooks(){
		Scanner sc = new Scanner(System.in);
	}
	
	void displayTrackDetails(){
		System.out.println("Artist Name: " + this.artist);
		System.out.println("Movie Name: " + this.movie);
	}
}
