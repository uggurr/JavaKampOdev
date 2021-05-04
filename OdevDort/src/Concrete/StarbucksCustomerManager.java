package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckService.CheckPerson(customer)) {
			System.out.println("Starbucks Manager : validation successfull.");
			super.save(customer);
		}else {
			System.out.println("Starbucks Manager : Error -- The person not a valid.");
		}
	}
}
