package kata4.main;

import kata4.model.Mail;
import java.util.List;
import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {

    private String filename;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;
    
    public Kata4(String filename)
    {
        this.filename = filename;
    }
    
    public void execute()
    {
        input();
        process();
        output();
    }
    
    public void input()
    {
        mailList = MailListReader.read(filename);
    }
    
    public void process()
    {
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    public void output()
    {
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute(); 
    }
    
    public static void main(String[] args) {
        Kata4 control = new Kata4("email.txt");
        control.execute();
    }    
}
