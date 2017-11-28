package ordinaryuser0;

import java.sql.*;
import java.util.ArrayList;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import com.opensymphony.xwork2.ActionSupport;

import adminuser.Tool;

@SuppressWarnings("serial")
public class Abstractuser0 extends ActionSupport{
	public String username;
	public String IDcardnum;
	public String loadsecret;
	public String subject;
	public String classgrade;
	public String email;
	public String phonenum;
	public String QQnumber;
	ArrayList<String> Userlist = new ArrayList<String>(); 
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getIDcardnum() {
		return IDcardnum;
	}
	public void setIDcardnum(String IDcardnum) {
		this.IDcardnum = IDcardnum;
	}
	public String getloadsecret() {
		return loadsecret;
	}
	public void setloadsecret(String loadsecret) {
		this.loadsecret = loadsecret;
	}
	public String getsubject() {
		return subject;
	}
	public void setsubject(String subject) {
		this.subject = subject;
	}
	public String getclassgrade() {
		return classgrade;
	}
	public void setclassgrade(String classgrade) {
		this.classgrade = classgrade;
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
	public String getQQnumber() {
		return QQnumber;
	}
	public void setQQnumber(String QQnumber) {
		this.QQnumber = QQnumber;
	}
	public String execute() throws UnsupportedEncodingException, SQLException{ 
		
		Statement stmt = Tool.initSQL("webtutor","root","123z123x123c");
		System.out.print("!!!!!!!!!");
		ResultSet rs = stmt.executeQuery("select * from ordinaryuser0 where username=\""+username+"\""); 
		if(!rs.next()){
      	  return ERROR;
        }
        //String secretkey = rs.getString("secretkey");
        rs = stmt.executeQuery("select * from ordinaryuser0"); 
        while (rs.next()) {
	      	if(rs.getString("loadsecret").equals(loadsecret)){
	      		Userlist.add(rs.getString("username"));
	      		return SUCCESS;
	      	}
	      	break;
        }
        return ERROR;	
	}
}
