package LoginForm.DAO.impl;

import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.Message;

import java.sql.*;
import LoginForm.DAO.IUserModel;
import LoginForm.Models.UserModel;
import LoginForm.Configs.employeesDBConnect;
import java.text.MessageFormat;

public class UserModelImpl implements IUserModel {

	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub

		String sql = "SELECT * FROM login";
		List<UserModel> list = new ArrayList<UserModel>();

		try {
			conn = new employeesDBConnect().connect();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			UserModel Add = new UserModel();
			while (rs.next()) {
				Add = new UserModel(
						rs.getString("Username"),
						rs.getString("Password"),
						rs.getString("Avatar"),
						rs.getInt("ID"),
						rs.getString("First_name"),
						rs.getString("Last_name"),
						rs.getString("Email"),
						rs.getInt("Phone_number"),
						rs.getInt("Role_id"),
						rs.getString("my_date"));
				list.add(Add);
			}
			conn.close();
			return list;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserModel findByID(int ID) {
		String sql = "SELECT * FROM login WHERE ID = " + ID;
		UserModel find = null;

		try {
			conn = new employeesDBConnect().connect();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				find = new UserModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getString(10));
			}
			if (find == null)
				return null;
			else
				return find;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insert(UserModel user) {
		String sql = " insert into login (Username, Password, Avatar, ID, First_name, Last_name, Email, Phone_number, Role_id, my_date)"
			    + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			conn = new employeesDBConnect().connect();
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getAvatar());
			ps.setInt(4, user.getID());
			ps.setString(5, user.getFirst_name());
			ps.setString(6, user.getLast_name());
			ps.setString(7, user.getEmail());
			ps.setInt(8, user.getPhone_number());
			ps.setInt(9, user.getRole_id());
			ps.setString(10, user.getMy_Date());
			
			ps.execute();
			conn.close();
			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public UserModel findByUsername(String username) {
		String sql = "SELECT * FROM login WHERE Username = ?";
		try {
			conn = new employeesDBConnect().connect();
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();
			while(rs.next()) {
				UserModel user = new UserModel();
				user.setUsername(rs.getString("Username"));
				user.setPassword(rs.getString("Password"));
				user.setAvatar(rs.getString("Avatar"));
				user.setID(rs.getInt("ID"));
				user.setFirst_name(rs.getString("First_name"));
				user.setLast_name(rs.getString("Last_name"));
				user.setEmail(rs.getString("Email"));
				user.setPhone_number(rs.getInt("Phone_number"));
				user.setRole_id(rs.getInt("Role_id"));
				user.setMy_Date(rs.getString("my_date"));
				return user;
			}
			conn.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public static void main(String[] args) {
		UserModelImpl a = new UserModelImpl();
		UserModel b = a.findByUsername("Johnny23");
		System.out.print(b.toString());
		
	}

}
