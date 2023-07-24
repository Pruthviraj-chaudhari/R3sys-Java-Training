package com.day4.AbstractClass.Spotify;

import java.util.Scanner;

//Audiobook (subclass of MusicTrack):
//Properties: author (String), narrator (String)
//Methods: displayTrackDetails() (overrides parent method)

public class AudioBooks {
	String author;
	String narrator;
	
	void getAudioBooks(){
		Scanner sc = new Scanner(System.in)
	}
	
	void displayTrackDetails(){
		System.out.println("Host Name: " + this.author);
		System.out.println("Episode Number: " + this.narrator);
	}
}
