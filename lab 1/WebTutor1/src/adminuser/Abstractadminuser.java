package adminuser;

import java.sql.*;
import java.util.ArrayList;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import com.opensymphony.xwork2.ActionSupport;

import adminuser.Tool;

@SuppressWarnings("serial")
public class Abstractadminuser extends ActionSupport{
	public String username;
	public String secretkey;
	public String email;
	public String phonenum;
	ArrayList<String> Userlist = new ArrayList<String>(); 
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getsecretkey() {
		return secretkey;
	}
	public void setsecretkey(String secretkey) {
		this.secretkey = secretkey;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getphone() {
		return phonenum;
	}
	public void setphone(String phonenum) {
		this.phonenum = phonenum;
	}
	public String execute() throws UnsupportedEncodingException, SQLException{ 
		
		Statement stmt = Tool.initSQL("webtutor","root","123z123x123c");
		System.out.print("!!!!!!!!!");
		ResultSet rs = stmt.executeQuery("select * from adminuser where username=\""+username+"\""); 
		if(!rs.next()){
      	  return ERROR;
        }
        //String secretkey = rs.getString("secretkey");
        rs = stmt.executeQuery("select * from adminuser"); 
        while (rs.next()) {
	      	if(rs.getString("secretkey").equals(secretkey)){
	      		Userlist.add(rs.getString("username"));
	      		return SUCCESS;
	      	}
	      	break;
        }
        return ERROR;	
	}
	public String addadminuser() throws UnsupportedEncodingException, SQLException{
		Statement stmt = Tool.initSQL("webtutor", "root","123z123x123c");
		stmt.executeUpdate("insert into adminuser values (\""+username+"\",\""+secretkey+"\",\""+email+"\",\""+phonenum+"\")"); 
		return SUCCESS;
	}
	public String delete() throws UnsupportedEncodingException, SQLException{
		System.out.println(username);
		Statement stmt = Tool.initSQL("webtutor", "root","123z123x123c");
		stmt.executeUpdate("delete from adminuser where username=\""+username+"\"");
		return SUCCESS;
	}
}
