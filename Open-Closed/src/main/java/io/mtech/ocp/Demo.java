package io.mtech.ocp;

import java.util.List;

import io.mtech.ocp.model.ProductFilter;
import io.mtech.ocp.service.Color;
import io.mtech.ocp.service.Product;
import io.mtech.ocp.service.Size;
import io.mtech.ocp.serviceImpl.AndSpecification;
import io.mtech.ocp.serviceImpl.BetterFilter;
import io.mtech.ocp.serviceImpl.ColorSpecification;
import io.mtech.ocp.serviceImpl.SizeSpecification;

public class Demo {

	public static void main(String[] args) {
		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
		Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
		Product house = new Product("House", Color.BLUE, Size.LARGE);

		List<Product> products = List.of(apple, tree, house);

		ProductFilter pf = new ProductFilter();
		System.out.println("Green products (old):");
		pf.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(" - " + p.name + " is green"));

		// vv AFTER
		BetterFilter bf = new BetterFilter();
		System.out.println("Green products (new):");
		bf.filter(products, new ColorSpecification(Color.GREEN)).forEach(System.out::println);

		System.out.println("Large products:");
		bf.filter(products, new SizeSpecification(Size.LARGE))
				.forEach(p -> System.out.println(" - " + p.name + " is large"));

		System.out.println("Large blue items:");
		bf.filter(products,
				new AndSpecification<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.LARGE)))
				.forEach(p -> System.out.println(" - " + p.name + " is large and blue"));
	}

}
