package lesson1.enums;

public enum DayOfWeek {
    Monday(8), Tuesday(8), Wednesday(8), Thursday(8), Friday(7), Saturday(0), Sunday(0);

    private int hours;

    DayOfWeek(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }
}
