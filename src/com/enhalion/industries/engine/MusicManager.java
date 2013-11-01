package com.enhalion.industries.engine;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class MusicManager implements Runnable{
	
	private static Sequencer midiplayer = null;
	@Override
	public void run(){
		init();
	}
	public static void init(){
		try {
			midiplayer = MidiSystem.getSequencer();
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		}
	}
	
	public static void playmus(int request){
		if (request==1001){
			int track = Random.random(0, 1000);
			String trackname = GameRegistry.Music[track];
			while(trackname ==""){
				track = Random.random(0, 1000);
				trackname = GameRegistry.Music[track];
			}
			midiplay(trackname);
		}else if(request>1002){
			midiplay("BadThings.mid");
		}else if(request<-1){
			midiplay("BadThings.mid");
		}else{
			String trackname = GameRegistry.Music[request];
			if (trackname.indexOf(".png",1) != 0){
				midiplay(trackname);	
			}
		}
		
	}
	public static void stopmidi(){
		System.out.println("Stopping Music");
		midiplayer.stop();
		midiplayer.close();
	}
	public static void stopmus(){
		stopmidi();
	}
	public static void midiplay(String track){
		for (int i=0;i<1001;i++){
			if(i==1000){
				track="BadThings.mid";
				System.out.println("TRAP 0 - Bad Music Track. Playing BadThings.mid");
				break;
			}
			if(GameRegistry.Music[i]==track){
				System.out.println("Playing " + track);
				break;
			}
		}
		
		try{
			Sequence midisequence = MidiSystem.getSequence(MusicManager.class.getResourceAsStream("/com/enhalion/industries/ghostsword/res/midi/" + track));
			midiplayer.open();
			midiplayer.setSequence(midisequence);
			midiplayer.start();
		} catch (IOException e){
			System.out.println("File can't be found or is busy");
			//.collapse();
			e.printStackTrace();
		} catch (InvalidMidiDataException e) {
			System.out.println("File is corrupt");
			//Player.collapse();
			e.printStackTrace();
		} catch (MidiUnavailableException e) {
			System.out.println("Some error...");
			//Player.collapse();
			e.printStackTrace();
		}
		
		}
	}
	
