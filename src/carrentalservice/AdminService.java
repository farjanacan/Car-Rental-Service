package carrentalservice;

import java.util.ArrayList;
/*
@author Parvez
*/
public class AdminService {
    public ArrayList<Admin> getAll(){
		ArrayList<Admin> AdminList = new ArrayList<Admin>();
		AdminList.add(new Admin("11", "snow", "John"));
		AdminList.add(new Admin("12", "ok", "Pablo"));
		AdminList.add(new Admin("13", "stark", "Sansa"));
                AdminList.add(new Admin("14", "mearya", "Arya"));
		AdminList.add(new Admin("15", "lan", "Tyrion"));
		
		return AdminList;
	}
	public Admin getById(String id){
		for(Admin a: this.getAll()){
                    
                    System.out.println(a);
                    System.out.println(id);
                    
			if(a.adminid.equals(id)){
				return a;
			}
		}
		return null;
        }
}
        

