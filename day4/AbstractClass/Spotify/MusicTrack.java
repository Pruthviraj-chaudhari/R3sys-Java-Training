package com.day4.AbstractClass.Spotify;

//	MusicTrack (abstract class):
//	Properties: title (String), duration (int)
//	Methods: displayTrackDetails() (abstract method)

public abstract class MusicTrack {
	String title;
	int duration;
	
	abstract void displayTrackDetails();
}
