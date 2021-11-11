package kata5p2.view;

import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;

public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> mails)
    {
        Histogram<String> histo = new Histogram<>();
        
        for(Mail m : mails)
            histo.increment(m.getDomain());
        
        return histo;
    }
    
}
