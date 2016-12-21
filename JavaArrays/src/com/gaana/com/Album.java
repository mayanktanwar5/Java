package com.gaana.com;

import java.util.Scanner;

public class Album {

	private String albumName;
	private int albumSongCount;
	Scanner scan = new Scanner(System.in);
	
	public Album(String albumName,int songCount )
	{
		this.albumSongCount =songCount;
		this.albumName=albumName;
		enterSong(songCount);
	}
	
	public void enterSong(int song)
	{
		
		Song[] songlist = new Song[song];
		
		for(int i=0;i<song;i++)
		{
			System.out.println("Please Enter details of song you want to add");
			System.out.println("Song Name ");
			String songName = scan.next();
			System.out.println("Song Singer name ");
			String songSingerName = scan.next();
			System.out.println("Song Length ");
			int songLength = scan.nextInt();
			System.out.println("Song Genere ");
			String songGenere = scan.next();
			songlist[i]=new Song(songName,songSingerName,songLength,songGenere);
			
	   	}
		
		System.out.println("Your play List is created");
		showAlbum(songlist);
		
	}
	
	public void showAlbum(Song[] songlist)
	{System.out.println("======================");
		System.out.println("Album name :"+albumName);
		System.out.println("Your Album  have  :"+albumSongCount+" songs");
		System.out.println("======================");
		for(int i =0;i<songlist.length;i++)
		{
			
			System.out.println("====Song"+i+"=========");
			System.out.println("Song Name : "+songlist[i].getSongName());
			System.out.println("Song Singer : "+songlist[i].getSongSinger());
			System.out.println("Song Genere : "+songlist[i].getSongGenere());
			System.out.println("Song Length : "+songlist[i].getSongLength()+" mins");
		}
		
	}
	
	
	
}
