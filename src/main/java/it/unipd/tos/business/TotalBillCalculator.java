package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;

public class TotalBillCalculator implements RestaurantBill{
	
	public double getOrderPrice(List<MenuItem> itemsOrdered) throws RestaurantBillException {
		
		double totalBill = 0.0;
		
		if(itemsOrdered.size() > 20)
			throw new RestaurantBillException("ERRORE: Non possono esserci più di 20 elementi.");
		else
		{
			for(MenuItem x : itemsOrdered)
			{
				totalBill += x.getPrice();
			}
		}
		
		return totalBill;
		
	}
	
}
