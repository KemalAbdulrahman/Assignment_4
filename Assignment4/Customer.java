
public class Customer {
	{
		boolean web_user;
		 String id;
		 String address,phone, email;	
		 Account account;
		public Customer(Account account,boolean web_user) {
			super();
			this.web_user=web_user;
			if(this.web_user) {// check for the web user  is equal to logic id
				Web_User wuser = new Web_User();
				this.id = wuser.login_id;
			}
			else
				this.id = account.id;check for the web user  is equal to amount id
			this.address = account.billing_address;
			this.account = account;
			
			//ask about phone and email; prompt user
}
