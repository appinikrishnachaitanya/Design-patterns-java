package com.behaviourals.observer;

public interface Subject {
	
	void register(Observer o);
	void deregister(Observer o);
	void notifyAllObservers();
}
