package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");
		Seller seller = new Seller(9, "Nelio Pink","nelio@gmail.com", new Date(), 2000.0, obj);
		
		System.out.println(obj);
		System.out.println(seller);
	}

}
