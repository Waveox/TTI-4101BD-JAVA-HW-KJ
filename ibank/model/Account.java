package model;

public class Account {
		private String id;
		private long balance;
		private String currency;
		
		public void setId(String idef){
			id = idef;
		}
		
		public String getId(){
			return id;
		}
		
		public void setCurrency(String curr){
			currency = curr;
		}
		
		public String getCurrency(){
			return currency;
		}
		
		public long getBalance(){
			return balance;
		}
}
