package B;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDayOfWeek(DayOfWeek.Monday));
        System.out.println(getDayOfWeek(DayOfWeek.Sunday));
    }

    public static String getDayOfWeek(DayOfWeek dayOfWeek){
        switch (dayOfWeek){
            case Monday :
            case Wednesday:
            case Friday:
                return "Учёба в "+ dayOfWeek.getDayInRussian();
            default:
                return "В "+dayOfWeek.getDayInRussian()+" учёбы нету";
        }
    }
}
