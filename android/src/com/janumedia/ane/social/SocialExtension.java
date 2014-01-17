package com.janumedia.ane.social;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class SocialExtension implements FREExtension {

	SocialContext context;
	
	@Override
	public FREContext createContext(String arg0) {
		return context = new SocialContext();
	}

	@Override
	public void dispose() {
		context.dispose();
		context = null;
	}

	@Override
	public void initialize() {}
		
}
