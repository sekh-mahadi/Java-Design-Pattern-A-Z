package io.mtech.ocp.serviceImpl;

import java.util.List;
import java.util.stream.Stream;

import io.mtech.ocp.service.Filter;
import io.mtech.ocp.service.Product;
import io.mtech.ocp.service.Specification;

public class BetterFilter implements Filter<Product> {

	@Override
	public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
		return items.stream().filter(p -> spec.isSatisfied(p));
	}

}
