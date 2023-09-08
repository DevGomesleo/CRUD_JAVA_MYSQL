package entities.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import entities.Contacts;
import entities.conn.ConnectionSQL;

public class ContactsDao {

	public void save(Contacts contato) {
		
		String sql = "insert into contacts(name, dateRegistration) values (?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionSQL.createConnectionToMySQL();
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, Contacts.getName());
			pstm.setDate(2, new Date(Contacts.getDateRegistration().getTime()));
			pstm.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
