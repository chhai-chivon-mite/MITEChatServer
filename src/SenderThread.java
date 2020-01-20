import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * @author: Chhai Chivon on Jan 19, 2020
 * Senior Application Developer
 */

public class SenderThread extends  Thread {
	
	private Socket connection;
	private String data;

	public SenderThread(Socket connection, String data) {
		super();
		this.connection = connection;
		this.data = data;
	}
	
	@Override
	public void run() {
		try {
			OutputStreamWriter streamWriter = new OutputStreamWriter(connection.getOutputStream());
			streamWriter.write(data + "\n");
			streamWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
