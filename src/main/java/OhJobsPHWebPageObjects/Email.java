package OhJobsPHWebPageObjects;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.SubjectTerm;

import com.sun.mail.util.MailSSLSocketFactory;

public class Email {
	
	public static boolean verifyMail(String userName, String password, String message) throws GeneralSecurityException {
		Folder folder = null;
		Store store = null;
		System.out.println("***READING MAILBOX...");
		try {
		
			Properties props = new Properties();
			MailSSLSocketFactory socketFactory= new MailSSLSocketFactory();
			socketFactory.setTrustAllHosts(true);
			props.put("mail.imap.ssl.socketFactory", socketFactory);
			//props.put("mail.store.protocol", "imaps");
			Session session = Session.getInstance(props);
			store = session.getStore("imaps");
			store.connect("imap.gmail.com", userName, password);
			folder = store.getFolder("INBOX");
			folder.open(Folder.READ_ONLY);
			Message[] messages = folder.getMessages();
			System.out.println("No of Messages : " + folder.getMessageCount());
			System.out.println("No of Unread Messages : " + folder.getUnreadMessageCount());
			for (int i = 0; i < messages.length; i++) {
				System.out.println("Reading MESSAGE # " + (i + 1) + "...");
				Message msg = messages[i];
				String strMailSubject = "", strMailBody = "";
				// Getting mail subject
				Object subject = msg.getSubject();
				// Getting mail body
				Object content = msg.getContent();
				// Casting objects of mail subject and body into String
				strMailSubject = (String) subject;
				//---- This is what you want to do------
				if (strMailSubject.contains(message)) {
					System.out.println(strMailSubject);
					break;
				}
			}
			return true;
		} catch (MessagingException messagingException) {
			messagingException.printStackTrace();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		} finally {
			if (folder != null) {
				try {
					folder.close(true);
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (store != null) {
				try {
					store.close();
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws GeneralSecurityException {
		verifyMail("sampleklaythompson@gmail.com", "Wog12345", "New Message Received from Oh! Jobs");
		
		
		
	}

	
}
