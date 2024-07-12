public class MedicalProfile {
    private int medicalProfileId;
    private String healthCondition;

    // Constructors, getters, setters, and other methods
    public MedicalProfile(int medicalProfileId, String healthCondition) {
        this.medicalProfileId = medicalProfileId;
        this.healthCondition = healthCondition;
    }

    public int getMedicalProfileId() {
        return medicalProfileId;
    }

    public void setMedicalProfileId(int medicalProfileId) {
        this.medicalProfileId = medicalProfileId;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }
}
