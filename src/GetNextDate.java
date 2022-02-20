public class GetNextDate {
    public static final String SLASH = "/";
    public static final int FIRSTMONTH, FIRSTDAYOFMONTH = FIRSTMONTH=1;
    public static final int LASTMONTHOFYEAR=12;

    public String getNextDate(int day, int month, int year){
        int newDay=0,newMonth=0,newYear=0;
        int lastDayOfMonth=getLastDayOfMonth(month, year);
        if(day<lastDayOfMonth) {
            newDay = ++day;
            newMonth = month;
            newYear = year;
        }
        else {
            if (month < LASTMONTHOFYEAR) {
                newDay = FIRSTDAYOFMONTH;
                newMonth = ++month;
                newYear = year;
            } else {
                newDay = FIRSTDAYOFMONTH;
                newMonth = FIRSTMONTH;
                newYear = ++year;
            }
        }
        String result = newDay +SLASH+newMonth+SLASH+newYear;
        return result;
    }
    private int getLastDayOfMonth(int month, int year) {
        int lastDayOfMonth=0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDayOfMonth=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastDayOfMonth=30;
            case 2:
                if(isLunarYear(year)){
                    lastDayOfMonth=29;
                }
                else lastDayOfMonth=28;
        }
        return lastDayOfMonth;
    }

    private boolean isLunarYear(int year){
        if(year%4==0){
            if(year%100!=0){
                return true;
            }
            else {
                if (year % 400 == 0) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        return false;
    }
}
