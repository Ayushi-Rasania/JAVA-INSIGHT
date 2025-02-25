package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;
import model.Person;

public class PersonDao {

	public static int insertPerson(Person p) {
		int status = 0;
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "insert into person(name, email, mobile, address, password, course, language, gender) values(?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, p.getName());
			pst.setString(2, p.getEmail());
			pst.setString(3, p.getMobile());
			pst.setString(4, p.getAddress());
			pst.setString(5, p.getPassword());
			pst.setString(6, p.getCourse());
			pst.setString(7, p.getLanguage());
			pst.setString(8, p.getGender());
			status=pst.executeUpdate();
			System.out.println("User data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}return status;
	}
}
