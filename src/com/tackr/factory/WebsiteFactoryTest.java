package com.tackr.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class WebsiteFactoryTest {

	@Test
	void shouldCreateDifferentPagesAccordingWithTheSiteType() {
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		
		Website anotherSite = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		
		Assertions.assertNotEquals(site, anotherSite);
	}

}
