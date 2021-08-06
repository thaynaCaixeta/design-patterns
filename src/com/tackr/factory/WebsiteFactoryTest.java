package com.tackr.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class WebsiteFactoryTest {

	@Test
	void shouldCreateDifferentPagesAccordingWithTheSiteType() {
		String siteType = "blog";
		Website site = WebsiteFactory.getWebsite(siteType);
		
		siteType = "shop";
		Website anotherSite = WebsiteFactory.getWebsite(siteType);
		
		Assertions.assertNotEquals(site, anotherSite);
	}

}
