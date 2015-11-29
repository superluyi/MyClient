package Character;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {
	
	public void clientSocket(String dip, int dport, String sip, int sport) {
		try {
			Socket aSocket = new Socket(dip, dport, InetAddress.getByName(sip), sport);
			
			OutputStream oStream = aSocket.getOutputStream();
			PrintWriter pWriter = new PrintWriter(oStream);
			
			InputStream iStream = aSocket.getInputStream();
			BufferedReader bReader = new BufferedReader(new InputStreamReader(iStream));
			
			pWriter.write("hello");
			pWriter.flush();
			aSocket.shutdownOutput();
			bReader.close();
			iStream.close();
			pWriter.close();
			oStream.close();
			aSocket.close();
		} catch (UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
