package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
class JunitTest {

	@Test
	void test1() {
		System.out.println("test 1");
	}

	@Test
	void test2() {
		System.out.println("test 2");
	}

	@Test
	void PasUnTest() {
		System.out.println("Pas un test");
	}

	@BeforeEach
	void BeforeEach() {
		System.out.println("\nBefore Each");
	}
	@AfterEach
	void AfterEach() {
		System.out.println("After Each");
	}
	@BeforeAll
	static void BeforeAll() {
		System.out.println("Before All");
	}
	@AfterAll
	static void AfterAll() {
		System.out.println("After All");
	}
}
