package com.tools20022.core.metamodel;

import java.util.function.Supplier;

/**
 * Holds a reference what evaluated at the first call of {@link #get()}.
 * 
 * @param <T>
 *            type of the referenced object
 */
public class LazyReference<T> implements Supplier<T> {

	private T objectRef;
	private Supplier<T> initProc;

	public LazyReference(Supplier<T> initProc) {
		this.initProc = initProc;
	}

	@Override
	public T get() {
		synchronized (this) {
			if (initProc != null) {
				objectRef = initProc.get();
				initProc = null;
			}
		}
		return objectRef;
	}

}
