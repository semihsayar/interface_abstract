package interfaceAbstractDemo;

import java.time.LocalDateTime;

import Adapters.MernisSerivceAdapter;
import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Concrete.NeroCustomerManager;
import interfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
	
		Customer customer = new Customer(1, "Semih", "Sayar",LocalDateTime.of(2003, 1, 6, 0, 0),"22753938324");
		
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisSerivceAdapter());
		customerManager.save(customer);
		
	}

}
