package io.mtech.ocp.serviceImpl;

import io.mtech.ocp.service.Specification;

public class AndSpecification<T> implements Specification<T> {

	private Specification<T> first, second;

	public AndSpecification(Specification<T> first, Specification<T> second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public boolean isSatisfied(T item) {
		return first.isSatisfied(item) && second.isSatisfied(item);
	}

}
