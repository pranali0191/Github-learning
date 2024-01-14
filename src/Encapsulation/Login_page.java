package Encapsulation;

class Login_page 
{


	//Data
	private String uname;
	private String pw;
	
	
	//Public method
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
		//Business Logic
		
		public void login(String un, String psw)
		{
			System.out.println("User login completed successfully ");
			System.out.println("user logged in with name "+un);
		}
		
	
}

		



