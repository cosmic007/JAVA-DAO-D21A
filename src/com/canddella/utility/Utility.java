package com.canddella.utility;

import java.util.Scanner;

import com.canddella.entity.Customer;
import com.canddella.service.CustomerServiceImpl;

public class Utility {

	public static void main(String[] args) {
		CustomerServiceImpl customerServiceImpl=new CustomerServiceImpl();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Search Customer");
		int choice=scanner.nextInt();
		if(choice==1)
		{
			System.out.println("Enter customer id to search:");
			scanner.nextLine();
			String customerCode=scanner.nextLine();
			Customer customer=customerServiceImpl.searchCustomer(customerCode);
			if(customer!=null)
			{
				System.out.println(customer.getCustomerCode()+"  "+customer.getCustomerName());
			}
		}
		else
		{
			System.out.println("Wrong choice");
		}
		
		

	}

}
