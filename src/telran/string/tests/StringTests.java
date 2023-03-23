package telran.string.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	void testCharAt() {
		String str = "Hello world!";
		assertEquals("H","" + str.charAt(0));
		assertEquals("w","" + str.charAt(6));
	}
	
	@Test
	void testCompareTo() {
		String str1 = "12Ddsa";
		String str2 = "12Ddsa";
		String str3 = "12DdsA";
		assertTrue(0 == str1.compareTo(str2));
		assertFalse(0 != str1.compareTo(str2));
		assertTrue(0 != str1.compareTo(str3));
		assertFalse(0 == str2.compareTo(str3));
	}
	
	@Test
	void testCompareToIgnoreCase() {
		String str1 = "12DdsA";
		String str2 = "12Ddsa";
		assertTrue(0 == str1.compareToIgnoreCase(str2));
		assertFalse(0 != str1.compareToIgnoreCase(str2));
	}
	@Test
	void testConcat() {
		String str1 = "Hello ";
		String str2 = "world!";
		assertEquals("Hello world!", str1.concat(str2));
		assertEquals("world!Hello ", str2.concat(str1));
		
	}
	@Test
	void testStarstWith() {
		String str = "Hello world! My name is Daria.";
		assertTrue(str.startsWith("Hello world!"));
		assertFalse(str.startsWith("HelloW"));
		assertFalse(str.startsWith("Daria."));
		
	}
	@Test
	void testEndstWith() {
		String str = "Hello world! My name is Daria.";
		assertTrue(str.endsWith("is Daria."));
		assertFalse(str.endsWith("Hello"));
		assertFalse(str.endsWith("Daria"));
	}
	@Test
	void testContains() {
		String str = "Hello world! My name is Daria.";
		assertTrue(str.contains("Daria."));
		assertTrue(str.contains("ello"));
		assertFalse(str.contains("hello"));
		assertFalse(str.contains("Daria!"));
		
	}
	@Test
	void testIndexOf() {
		String str = "Hello!";
		assertEquals(0, str.indexOf("H"));
		assertEquals(2, str.indexOf("l"));
		assertEquals(5, str.indexOf("!"));
		assertEquals(-1, str.indexOf("h"));
		
	}
	@Test
	void testlastIndexOf() {
		String str = "Hello world!";
		assertEquals(7, str.lastIndexOf("o"));
		assertEquals(9, str.lastIndexOf("l"));
		assertEquals(-1, str.lastIndexOf("z"));
		
	}
}
