package com.heyhi.tts;

import marytts.modules.synthesis.Voice;

public interface Main {
public static void main(String[] args){
	TextToSpeech tts = new TextToSpeech();
	//Voice.getAvailableVoices().stream().forEach(System.out::println);
	tts.setVoice("istc-lucia-hsmm");
	tts.setAudioEffect("Rate(durScale:2.0)");
	tts.speak("Ciao Angelo Marini", 2.0f, false, true);
}
}
