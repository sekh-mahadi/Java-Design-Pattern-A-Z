package io.mtech.ocp.serviceImpl;

import io.mtech.ocp.service.Color;
import io.mtech.ocp.service.Product;
import io.mtech.ocp.service.Specification;

public class ColorSpecification implements Specification<Product> {
	private Color color;

	public ColorSpecification(Color color) {
		this.color = color;
	}

	@Override
	public boolean isSatisfied(Product p) {
		return p.color == color;
	}

}
