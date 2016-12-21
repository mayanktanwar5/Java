package com.gaana.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class SongTest {

	@Test
	public void testGetSongGenere() {
		Song song = new Song("Songname","",2,"TestGenere");
		assertEquals("TestGenere", song.getSongGenere());
		assertEquals("Songname", song.getSongName());
		assertEquals(2, song.getSongLength());
	}

}
