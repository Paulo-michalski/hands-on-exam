package project;

public class RestControler {

	public void list_all_users(User users[]) {
		
		for (User user : users) {
			System.out.println("User: " + user.getName + "\n");
			System.out.println("Role: " + user.GetRole + "\n");
		}
		
	}

	public void list_user_by_id(User users[]) {
		
		for (User user : users) {
			System.out.println("User id: " + user.getId + "\n");
		}
		
	}
	
	
	public void save_user(User user, String name, String role, long user_id) {
		user.setName(name);
		user.setRole(role);
		user.setId(user_id);
	}
	
	
	public void update_user(User users[], long user_id, String name, String role) {
		
		users[user_id].setName(name);
		users[user_id].setRole(role);
	}
	
	public void delete_user(User users[], long user_id) {
		users[user_id].remove;
	}
	
	
}
