package devops.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import devops.numbers.NumberWords;

public class NumberWordsTestCase {

	@Test
	public void numberWords() {
		NumberWords numberWords=new NumberWords();
		String expected=numberWords.toWords(99);
		assertEquals(expected, "NINETY NINE");
	}

}
