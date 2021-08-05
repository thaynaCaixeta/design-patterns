package com.tackr.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class DbSingletonTest {

	@Test
	void shouldHaveJustOneInstance() {
		DbSingleton instance = DbSingleton.getInstance();		
		DbSingleton anotherInstance = DbSingleton.getInstance();
		
		assertEquals(instance, anotherInstance);
	}

}
