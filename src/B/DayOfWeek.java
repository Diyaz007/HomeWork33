package B;

public enum DayOfWeek {
    Monday("Понедельник"),
    Tuesday("Вторник"),
    Wednesday("Среда"),
    Thursday("Четверг"),
    Friday("Пятница"),
    Saturday("Суббота"),
    Sunday("Воскресенье");

    DayOfWeek(String s){
        this.dayInRussian = s;
    }

    private String dayInRussian;

    public String getDayInRussian() {
        return dayInRussian;
    }
}