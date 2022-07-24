package A;

public enum YearMonth {
    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май"),
    JUNE("Июнь"),
    JULY("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь"),
    DECEMBER("Декабрь");

    private String monthInRussia;

    YearMonth(String monthInRussia) {
        this.monthInRussia = monthInRussia;
    }

    public String getMonthInRussia() {
        return monthInRussia;
    }
}
//January February  March  April   May  June  July  August  September  October  November  December.
//Январь  Февраль	Март   Апрель  Май 	Июнь  Июль	Август	Сентябрь   Октябрь	Ноябрь	  Декабрь.