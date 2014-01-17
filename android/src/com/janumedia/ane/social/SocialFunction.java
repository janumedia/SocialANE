package com.janumedia.ane.social;

import android.content.Intent;

import com.adobe.fre.*;

public class SocialFunction implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] args) {
		
		try {
			
			String subject = args[0].getAsString();
			String message = args[1].getAsString();
			
			Intent shareIntent = new Intent (android.content.Intent.ACTION_SEND);
			
			shareIntent.setType("text/plain");
			shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, subject);
			shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
			
			context.getActivity().startActivity(Intent.createChooser(shareIntent, "Share via"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}

