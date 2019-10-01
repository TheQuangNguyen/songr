package com.code401.songr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SongrApplicationTests {

	// Testing if we can create an album by providing information to constructor
	// Also test that we can use getter to retrieve data of instance variables
	@Test
	public void testAlbumConstructorForInstantiation() {
		Album album = new Album("Something",
								"Someone",
								1,
								3,
								"http://www.somewhere.com");
		assertEquals("Something", album.getTitle());
		assertEquals("Someone", album.getArtist());
		assertEquals(1, album.getSongCount());
		assertEquals(3.0, album.getLength());
		assertEquals("http://www.somewhere.com", album.getImageURL());
	}

	// Test if we can change content of instance variables using setters
	@Test
	public void testAlbumSetters() {
		Album album = new Album("Something",
				"Someone",
				1,
				3,
				"http://www.somewhere.com");

		album.setTitle("Something else");
		album.setArtist("Someone else");
		album.setSongCount(2);
		album.setLength(6.5);
		album.setImageURL("http://www.somewhereelse.com");

		assertEquals("Something else", album.getTitle());
		assertEquals("Someone else", album.getArtist());
		assertEquals(2, album.getSongCount());
		assertEquals(6.5, album.getLength());
		assertEquals("http://www.somewhereelse.com", album.getImageURL());

	}

}
