package bai5;

import java.time.LocalTime;

public class Patient implements Comparable<Patient> {
    private String name;
    private int severity;
    private LocalTime arrivalTime;

    public Patient() {
    }

    public Patient(String name, int severity, LocalTime arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        String level = "";
        switch (severity) {
            case 1: level = "Nguy kịch"; break;
            case 2: level = "Nặng"; break;
            case 3: level = "Nhẹ"; break;
        }
        return name + " (Mức " + severity + " - " + level + ", đến lúc " + arrivalTime + ")";
    }

    @Override
    public int compareTo(Patient o) {
        return this.severity - o.severity;
    }
}