package kata5p2.main;

import kata5p2.model.Mail;
import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.MailListReaderBD;

public class Kata5P2 {

    private String filename;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;
    
    public Kata5P2(String filename)
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
        mailList = MailListReaderBD.read(filename);
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
        Kata5P2 control = new Kata5P2("email.txt");
        control.execute();
    }    
}
