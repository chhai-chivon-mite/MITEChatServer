import java.net.Socket;

/*
 * @author: Chhai Chivon on Jan 19, 2020
 * Senior Application Developer
 */

public interface AppCallback {

	void onClientLoggedIn(String username, Socket connection);
	
	void onClientLoggedOut(String username);
	
	void onFriendListRequest(String username);
	
	void onChatRequest(String me, String friend, String message);
	
}
