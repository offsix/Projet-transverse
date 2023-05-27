package Modele;

public class ModeleVocal extends ModeleTchat {

	private String audio_quality;
	private static int membre_maximum;
	
	
	public final String getAudio_quality() {
		return audio_quality;
	}
	public final void setAudio_quality(String audio_quality) {
		this.audio_quality = audio_quality;
	}
	public static final int getMembre_maximum() {
		return membre_maximum;
	}
	public static final void setMembre_maximum(int membre_maximum) {
		ModeleVocal.membre_maximum = membre_maximum;
	}

}