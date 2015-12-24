package org.gaurav.restws.database;

import java.util.HashMap;
import java.util.Map;

import org.gaurav.restws.vo.Customers;
import org.gaurav.restws.vo.Items;

public class Database {
		private static Map<Long, Items> items = new HashMap<>();
		private static Map<Long, Customers> customers = new HashMap<>();

		public static Map<Long, Customers> getCustomers() {
			return customers;
		}


		public static Map<Long, Items> getItems() {
			return items;
		}


		
	}
		
