package com.janumedia.ane.social;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class SocialExtension implements FREExtension {

	@Override
	public FREContext createContext(String arg0) {
		return new SocialContext();
	}

	@Override
	public void dispose() {}

	@Override
	public void initialize() {}
		
}
