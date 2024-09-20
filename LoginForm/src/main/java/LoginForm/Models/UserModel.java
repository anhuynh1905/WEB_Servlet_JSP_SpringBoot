package LoginForm.Models;

public class UserModel {
	int ID, Phone_number, Role_id;
	String First_name, Last_name, Email, Avatar, my_Date, Username, Password;
	
	public UserModel() {
	}

	public UserModel(String username, String password, String avatar, int iD, String first_name, String last_name,
						String email, int phone_number, int role_id, String my_Date) {
		super();
		ID = iD;
		Phone_number = phone_number;
		Role_id = role_id;
		First_name = first_name;
		Last_name = last_name;
		Email = email;
		Avatar = avatar;
		this.my_Date = my_Date;
		Username = username;
		Password = password;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getPhone_number() {
		return Phone_number;
	}

	public void setPhone_number(int phone_number) {
		Phone_number = phone_number;
	}

	public int getRole_id() {
		return Role_id;
	}

	public void setRole_id(int role_id) {
		Role_id = role_id;
	}

	public String getFirst_name() {
		return First_name;
	}

	public void setFirst_name(String first_name) {
		First_name = first_name;
	}

	public String getLast_name() {
		return Last_name;
	}

	public void setLast_name(String last_name) {
		Last_name = last_name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAvatar() {
		return Avatar;
	}

	public void setAvatar(String avatar) {
		Avatar = avatar;
	}

	public String getMy_Date() {
		return my_Date;
	}

	public void setMy_Date(String my_Date) {
		this.my_Date = my_Date;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "UserModel [ID=" + ID + ", Phone_number=" + Phone_number + ", Role_id=" + Role_id + ", First_name="
				+ First_name + ", Last_name=" + Last_name + ", Email=" + Email + ", Avatar=" + Avatar + ", my_Date="
				+ my_Date + ", Username=" + Username + ", Password=" + Password + "]";
	}
	
	

}
