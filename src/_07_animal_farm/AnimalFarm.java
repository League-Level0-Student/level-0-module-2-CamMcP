//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _07_animal_farm;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		/* 2. Make it so that the user can keep entering new animals. */
for (int i = 0; i < 5.0; i++) {
	

	String animal =	JOptionPane.showInputDialog("What animal do you want? Llama, cat, cow, duck, or dog? You have one chance for each animal, and there cannot be any capitals.");
			if (animal.equals("llama")) {
		playNoise(llamaFile);
		}
	
	else if (animal.equals("cat")) {
		playNoise(meowFile);
		}
	else if (animal.equals("cow")) {
		playNoise(mooFile);
	}
	if (animal.equals("duck")) {
		playNoise(quackFile);
		}
	if (animal.equals("dog")) {
		playNoise(woofFile);
		}
	}
	}
	

	
	


	
	
	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
