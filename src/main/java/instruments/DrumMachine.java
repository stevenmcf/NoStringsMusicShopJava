package instruments;

public class DrumMachine extends Instrument {
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


}
