package io.mtech.ocp.serviceImpl;

import io.mtech.ocp.service.Product;
import io.mtech.ocp.service.Size;
import io.mtech.ocp.service.Specification;

public class SizeSpecification implements Specification<Product> {

	private Size size;

	public SizeSpecification(Size size) {
		this.size = size;
	}

	@Override
	public boolean isSatisfied(Product p) {
		return p.size == size;
	}

}
