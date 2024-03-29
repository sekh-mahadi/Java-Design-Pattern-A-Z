package io.mtech.ocp.model;

import java.util.List;
import java.util.stream.Stream;

import io.mtech.ocp.service.Color;
import io.mtech.ocp.service.Product;
import io.mtech.ocp.service.Size;

public class ProductFilter {

	public Stream<Product> filterByColor(List<Product> products, Color color) {
		return products.stream().filter(p -> p.color == color);
	}

	public Stream<Product> filterBySize(List<Product> products, Size size) {
		return products.stream().filter(p -> p.size == size);
	}

	public Stream<Product> filterBySizeAndColor(List<Product> products, Size size, Color color) {
		return products.stream().filter(p -> p.size == size && p.color == color);
	}
	// state space explosion
	// 3 criteria = 7 methods
}
