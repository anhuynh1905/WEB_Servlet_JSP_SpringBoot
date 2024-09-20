package LoginForm.DAO;

import LoginForm.Models.UserModel;
import java.util.List;

public interface IUserModel {
	List<UserModel> findAll();
	
	UserModel findByID(int ID);
	UserModel findByUsername(String username);
	
	void insert(UserModel user);
}
