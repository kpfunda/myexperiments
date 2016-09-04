package org.kpfunda.myexperiments.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyJunitExperiment {

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(MyJUnit1.class);

		for (Failure failure : result.getFailures()) {
			System.out.println("Description ClassName: " + failure.getDescription().getClassName());
			System.out.println("Description DisplayName: " + failure.getDescription().getDisplayName());
			System.out.println("Description MethodName: " + failure.getDescription().getMethodName());
			System.out.println("Message: " + failure.getMessage());
			System.out.println("TestHeader: " + failure.getTestHeader());
			System.out.println("Exception: " + failure.getException().toString());
			
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());

	}

}
