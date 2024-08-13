import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
class date {
    private int day;
    private int month;
    private int year;
    public date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String getFormatDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,day);
        return dateFormat.format(calendar.getTime());
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
}
public class TransactionChecking {
    private date transactionDate;
    private Time transactionTime;
    private boolean isComplete;

    public TransactionChecking() {
        this.transactionTime = transactionTime;

        this.transactionDate = transactionDate;
        this.isComplete = false;
    }
    public void completeTransaction(){
        isComplete = true;
    }
    public boolean isComplete(){
        return isComplete;
    }
    public String toString(){
        return "Transaction Date: "+transactionDate.getFormatDate();
    }
}


