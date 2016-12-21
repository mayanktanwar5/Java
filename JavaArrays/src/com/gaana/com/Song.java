package com.gaana.com;

public class Song {

	private String songName;
	private String songSinger;
	private int songLength;
	private String songGenere;
	
	public String getSongGenere() {
		return songGenere;
	}
	public void setSongGenere(String songGenere) {
		this.songGenere = songGenere;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSongSinger() {
		return songSinger;
	}
	public void setSongSinger(String songSinger) {
		this.songSinger = songSinger;
	}
	public int getSongLength() {
		return songLength;
	}
	public void setSongLength(int songLength) {
		this.songLength = songLength;
	}
	
	public Song (String songName, String songSinger, int songLength, String songGenere)
	{
		this.songName = songName;
		this.songSinger = songSinger;
		this.songLength = songLength;
		this.songGenere =songGenere;
		
	}
	
	
	
}
