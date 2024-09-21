import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        return LocalDateTime.parse(appointmentDateDescription, DateTimeFormatter.ofPattern("MM/dd/yyyy H:m:s"));
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int H = appointmentDate.getHour();
        return H >= 12 && H < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return "You have an appointment on " + appointmentDate.format(DateTimeFormatter.ofPattern("eeee, MMMM d, yyyy,")) + " at " + appointmentDate.format(DateTimeFormatter.ofPattern("h:mm a."));
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
