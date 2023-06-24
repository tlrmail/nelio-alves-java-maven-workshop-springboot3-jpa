package com.educandoweb.course.services.exceptions;

public class ResourcesNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourcesNotFoundException(Object id) {
		super("Resource not found. Id " + id + ".");
	}
}
