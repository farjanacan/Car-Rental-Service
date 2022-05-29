package carrentalservice;
/*
@author Parvez
*/
public class Admin {
        public String adminid;	
	public String password;
	public String name;
	
	public Admin(String adminid, String password, String name){
		this.adminid=adminid;
		this.password=password;
		this.name=name;
	}
        @Override
        public String toString(){
            
            return "\n adminid: " + adminid + "\n password: " + password + "\n name: " + name;
        }
}
