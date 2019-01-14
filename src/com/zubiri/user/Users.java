package com.zubiri.user;

import java.util.ArrayList;

public class Users {
	private ArrayList<User> users = new ArrayList<User>();

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public ArrayList<User> getUsers() {
		return this.users;
	}

	/**
	 * @author Koldo
	 * @param index in the ArrayList of the user you want to get
	 * @return User class object
	 *         <p>
	 *         Note: You can use the findUser method to get the index of the user
	 *         you want
	 *         </p>
	 */
	public User getUser(int index) {
		return users.get(index);
	}

	/**
	 * @author Koldo
	 * @param User class object which you want to add to users ArrayList
	 */
	public void addUser(User user) {
		users.add(user);
	}

	/**
	 * @author Koldo
	 * @param username you want to find in the ArrayList of created users
	 * @return index of the User object that has that name, if there's no user with
	 *         that name it returns -1
	 */
	public int findUser(String username) {
		int position = -1;
		for (int i = 0; i < users.size(); i++) {
			if (username.equals(users.get(i).getName())) {
				position = i;
				break;
			}
		}
		return position;
	}

	/**
	 * @author Koldo
	 * @return true if there's any User already added to the ArrayList, else, it
	 *         returns false
	 */
	public boolean hasUser() {
		boolean hasUser = false;
		if (users.size() > 0)
			hasUser = true;
		return hasUser;
	}
}
