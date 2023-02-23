package package1;

import java.util.ArrayList;
import java.util.List;

public class DataBaseList {

	private static List<Company> listCompanyNames  = new ArrayList<>();
	
	public void addCompany(Company company) {
		listCompanyNames.add(company);
		
	}
	
	public List<Company> getCompanies(){
		
		return DataBaseList.listCompanyNames;
		
	}


}
