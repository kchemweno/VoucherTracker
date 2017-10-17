package dats.model;


import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
    public static void send(String emailTo, String emailCc, String emailBcc, String emailSubject, String emailBody) {
        final String username = "vouchertracker@gmail.com";
        final String password = "universitas21";
       // final String username = "chemweno@gmail.com";
       // final String password = "Kimwetichcheserek21";        
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        //props.put("mail.smtp.host", "smtp.office365.com");
        props.put("mail.smtp.port", "587");
        //props.put("mail.smtp.port", "465");
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            //message.setFrom(new InternetAddress("so-logistics@fao.org"));
            message.setFrom(new InternetAddress("vouchertracker@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailTo));
            message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(emailBcc));
            if (!emailCc.isEmpty()) {
                message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(emailCc));
            }
            message.setSubject(emailSubject);
           // emailBody = String.format(emailBody, "\r\n");            
           // emailBody = emailBody.replaceAll("#END#", "\r\n"); 
       //     emailBody = "Your attention is drawn to an activity in the Voucher Tracker application. Please login and check"; 
            message.setText(emailBody);
            Transport.send(message);
      //      System.out.println("Done");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    } 
}
