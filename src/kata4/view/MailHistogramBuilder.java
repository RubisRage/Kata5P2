package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> mails)
    {
        Histogram<String> histo = new Histogram<>();
        
        for(Mail m : mails)
            histo.increment(m.getDomain());
        
        return histo;
    }
    
}
