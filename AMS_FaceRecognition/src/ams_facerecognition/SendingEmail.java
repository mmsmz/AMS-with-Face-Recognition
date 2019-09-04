
package ams_facerecognition;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendingEmail{

	public static void main(String[] args) {

		String to = "marafath07@gmail.com";
		String from = "my.codingstyl3@gmail.com";
		
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true"); // TLS
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		final String username = "my.codingstyl3@gmail.com";
		final String password = "*963.123zxc";

		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);// from
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO , new InternetAddress(to));
			message.setSubject("Absence");
			message.setText("To Team," + "\n\n name is absent was yesterday!");
			Transport.send(message);
			System.out.println("Done");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
