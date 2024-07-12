import java.util.Date;

public class Appointment {
    private int appointmentId;
    private Date date;
    private String description;

    // Constructors, getters, setters, and other methods
    public Appointment(int appointmentId, Date date, String description) {
        this.appointmentId = appointmentId;
        this.date = date;
        this.description = description;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
