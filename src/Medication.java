public class Medication {
    private int medicationId;
    private String name;
    private String dosage;

    // Constructors, getters, setters, and other methods
    public Medication(int medicationId, String name, String dosage) {
        this.medicationId = medicationId;
        this.name = name;
        this.dosage = dosage;
    }

    public int getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(int medicationId) {
        this.medicationId = medicationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
