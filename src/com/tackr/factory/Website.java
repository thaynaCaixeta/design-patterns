package com.tackr.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

	protected List<Page> pages = new ArrayList<>();

	public List<Page> getPages() {
		return this.pages;
	}

	public Website() {
		this.createWebsite();
	}

	public abstract void createWebsite();
}
