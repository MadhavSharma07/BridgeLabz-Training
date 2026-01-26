package com.lambda_function;




interface LightAction {
    void activate();
}

public class SmartHomeLightingAutomation {
	    public static void main(String[] args) {

	        // Motion sensor trigger
	        LightAction motionTrigger = () ->
	                System.out.println("Motion detected → Turning ON hallway lights");

	        // Time-based trigger
	        LightAction nightTimeTrigger = () ->
	                System.out.println("It's night → Turning ON warm lights");

	        // Voice command trigger
	        LightAction voiceCommandTrigger = () ->
	                System.out.println("Voice command received → Dimming lights to 50%");

	        // Execute actions
	        motionTrigger.activate();
	        nightTimeTrigger.activate();
	        voiceCommandTrigger.activate();
	    }
	}

