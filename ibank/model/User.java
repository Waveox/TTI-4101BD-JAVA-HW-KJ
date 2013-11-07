package model;

public class User {
		private String login;
		private String password;
		
	
		public String getLogin() {
			return login;
		}
		
		
		public User(String lgn, String psswrd) {
            login = lgn;
            password = psswrd;
		} 
}
