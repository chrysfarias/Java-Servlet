package package1;

import java.util.ArrayList;
import java.util.List;

public class DataBaseList {

	private static List<Company> listCompanyNames  = new ArrayList<>();
	
	static {
		
		Company company1 = new Company();	
		company1.setName("Empresa Persistencia Estatica 1");
				
		Company company2 = new Company();	
		company2.setName("Empresa Persistencia Estatica 2");
				
		Company company3 = new Company();	
		company3.setName("Empresa Persistencia Estatica 3");
		
		listCompanyNames.add(company1);
		listCompanyNames.add(company2);
		listCompanyNames.add(company3);
	}
	
	public void addCompany(Company company) {
		listCompanyNames.add(company);
		
	}
	
	public List<Company> getCompanies(){
		
		return DataBaseList.listCompanyNames;
		
	}


}
