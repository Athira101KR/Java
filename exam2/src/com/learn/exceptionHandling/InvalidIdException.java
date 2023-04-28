package com.learn.exceptionHandling;

public class InvalidIdException extends Exception {
	InvalidIdException(String message)
	{
		super(message);
	}
}
