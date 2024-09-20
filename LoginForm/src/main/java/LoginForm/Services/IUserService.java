package LoginForm.Services;

import LoginForm.Models.UserModel;

public interface IUserService {
	UserModel login(String username, String password);
	
	UserModel FindByUserName(String username);
}
