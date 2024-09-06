package Bai_32_MyDate;

public class MyDate {

    private int Day;
    private int Month;
    private int Year;

    public MyDate(int Day, int Month, int Year) {
        if (Day >= 1 && Day <= 31) {
            this.Day = Day;
        } else {
            this.Day = 1;

        }
        if (Month >= 1 && Month <= 12) {
            this.Month = Month;

        } else {
            this.Month = 1;
        }
        if (Year >= 0) {
            this.Year = Year;
        }

    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        if(Month >= 1 && Month <= 31)
        this.Month = Month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        if(Year >= 1){
            this.Year = Year;
        }
    }

    public int getDay() {
        return this.Day;
    }

    public void setDay(int d) {
        if (d >= 1 && d <= 31) {
            this.Day = d;
        }
    }

    @Override
    public String toString() {
        return this.Day +"/" + this.Month + "/" + this.Year; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
