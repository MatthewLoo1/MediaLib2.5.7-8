import java.util.Calendar;

public class MediaLibTime {
    private String currentDateTime;

    public String getCurrentDateTime() {
        Calendar cal = Calendar.getInstance();
        currentDateTime = cal.getTime().toString();
        return currentDateTime;
    }

    public void setDateTime(String dateTime) {
        this.currentDateTime = dateTime;
    }

    public String getFormattedDateTime() {
        return currentDateTime;
    }

    public void updateDateTime() {
        Calendar cal = Calendar.getInstance();
        currentDateTime = cal.getTime().toString();
    }
    
}
