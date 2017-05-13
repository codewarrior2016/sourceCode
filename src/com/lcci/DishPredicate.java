
package com.lcci;

@FunctionalInterface
public interface DishPredicate {
	public Boolean test(Dish d);
	default void doWork() { System.err.println("work"); }
	
}

