package rocks.zipcode.assessment2.collections;

/**
 * Use a map to solve
 */
public class MonthConversion {
    private String monthName;
    private Integer monthNumber;

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        this.monthNumber = monthNumber;
        this.monthName = monthName;
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) throws NullPointerException{
        String result = "";
        if (monthNumber == 1) result = "January";
        if (monthNumber == 2) result = "February";
        if (monthNumber == 3) result = "March";
        if (monthNumber == 4) result = "April";
        if (monthNumber == 5) result = "May";
        if (monthNumber == 6) result = "June";
        if (monthNumber == 7) result = "July";
        if (monthNumber == 8) result = "August";
        if (monthNumber == 9) result = "September";
        if (monthNumber == 10) result = "October";
        if (monthNumber == 11) result = "November";
        if (monthNumber == 12) result = "December";
        return result;
  //      throw new NullPointerException();
    }



    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {

        return (Integer)null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {

        return null;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {

        return null;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {

        return -1;
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {

    }


}
