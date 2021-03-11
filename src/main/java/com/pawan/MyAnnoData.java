package com.pawan;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyAnnoData {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Annotation[] ann = Company.class.getAnnotations();
		for (Annotation annotation : ann) {
			Class<? extends Annotation> type = annotation.annotationType();
			for (Method method : type.getDeclaredMethods()) {
				Object value = method.invoke(annotation, (Object[]) null);
				System.out.println(" " + method.getName() + ": " + value+" : ");
			}

		}
	}
}
