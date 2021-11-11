package kata5p2.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata5p2.model.Mail;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class MailListReaderBD {
    public static List<Mail> read(String filename)
    {
        ArrayList<Mail> mails = new ArrayList<>();
        String url = "jdbc:sqlite:KATA5.db";
        String sql = """
                     SELECT * FROM EMAIL;
                     """;
        
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){
            
            while(rs.next()){
                String candidate = rs.getString("direccion");
                
                if(candidate.contains("@")){
                    mails.add(new Mail(candidate));
                }
                
            }
            
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return mails; 
    }
}
