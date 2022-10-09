package i01_Date_defaultconstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SimpleDateFormatter {
    private CountryCode countryCode;
    public SimpleDateFormatter(){
        countryCode=CountryCode.HU;
    }
    public String formatDateString(SimpleDate simpleDate){
        return formatDateStringByCountryCode(this.countryCode, simpleDate);
    }
    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate){
        LocalDate date=simpleDate.getLocalDate();
        String formattedDate="";
        switch (countryCode) {
            case HU:
                formattedDate=date.format(DateTimeFormatter.ofPattern("yyyy-M-d"));
            break;
            case EN:
                formattedDate=date.format(DateTimeFormatter.ofPattern("d-M-yyyy"));
            break;
            case US:
                formattedDate=date.format(DateTimeFormatter.ofPattern("M-d-yyyy"));
            break;
        }
        return formattedDate;
    }
}
