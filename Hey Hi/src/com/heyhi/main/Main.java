package com.heyhi.main;

import com.heyhi.tts.TextToSpeech;

public interface Main {
	public static void main(String[] args){
		TextToSpeech tts = new TextToSpeech();
		//Voice.getAvailableVoices().stream().forEach(System.out::println);
		tts.setVoice("istc-lucia-hsmm");
		 
		tts.setAudioEffect("Rate(durScale:2.0)");
		tts.speak("Sento nell'aria c'� gi�, la nostra canzone", 2.0f, false, true);
		
		
	}
}
