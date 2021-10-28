package kata4.main;

import kata4.model.Mail;
import java.util.List;
import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {

    public static void main(String[] args) {
        
        String filename = "email.txt";
        List<Mail> mailList = MailListReader.read(filename);
        Histogram <String> histogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }   
}
