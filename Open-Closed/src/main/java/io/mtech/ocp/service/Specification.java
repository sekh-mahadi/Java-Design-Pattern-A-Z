package io.mtech.ocp.service;

public interface Specification<T> {
	boolean isSatisfied(T item);
}
