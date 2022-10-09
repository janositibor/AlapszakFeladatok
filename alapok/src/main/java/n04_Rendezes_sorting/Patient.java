package n04_Rendezes_sorting;

import java.time.LocalDateTime;

public class Patient {
    private String name;
    private String TAJ;
    private LocalDateTime appointment;

    public Patient(String name, String TAJ, LocalDateTime appointment) {
        this.name = name;
        this.TAJ = TAJ;
        this.appointment = appointment;
    }

    public String getName() {
        return name;
    }

    public String getTAJ() {
        return TAJ;
    }

    public LocalDateTime getAppointment() {
        return appointment;
    }
}
