package com.qa.examplejunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.examplejunit.blackjack.*;

public class BlackjackTest {
	@Test
	public void fail_test() {
		int result = Blackjack.play(24, 25);
		assertEquals(0, result);
	}
	@Test
	public void play_test() {
		int result = Blackjack.play(21, 18);
		assertEquals(21, result);
	}
	
	@Test
	public void play_test2() {
		int result = Blackjack.play(7, 22);
		assertEquals(7, result);
	}
	
	@Test
	public void play_test3() {
		int result = Blackjack.play(22, 10);
		assertEquals(10, result);
	}
}
