package instruments;

import behaviours.IPlay;

public class DrumMachine extends Instrument implements IPlay {
    private String recordingOption;
    public DrumMachine(String make, String model, double costPrice, double retailPrice, String recordingOption) {
        super(make, model, costPrice, retailPrice, InstrumentType.ELECTRONIC);
        this.recordingOption = recordingOption;
    }

    public String getRecordingOption() {
        return recordingOption;
    }

    public void setRecordingOption(String newRecordingOption) {
        this.recordingOption = newRecordingOption;
    }


    public String play() {
        return "kick, snare, low tom, mid tom, hi tom, clap, cowbell, open hi-hat, closed hi-hat, low conga, mid conga, hi conga, clave, rimshot, maracas and cymbal ";
    }
}
