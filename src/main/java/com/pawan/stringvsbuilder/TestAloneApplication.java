package com.pawan.stringvsbuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestAloneApplication {

	public static void main(String[] args) {
		TestAloneApplication a = new TestAloneApplication();

		a.withStringBuilder();

//		 a.withString();
	}

	private void withStringBuilder() {
		StringBuilder fileBuff = new StringBuilder();
		long before = getUsedMem();
		File file = new File("C:\\Users\\pawan\\Desktop\\Hr1m.csv");
		try (BufferedReader lnr = new BufferedReader(new FileReader(file))) {
			String currLine = null;

			while ((currLine = lnr.readLine()) != null) {
				fileBuff.append("\r\n").append(currLine);
			}
		} catch (Exception e) {
			System.out.println("The resource threw an Exception: " + e.getMessage());
		}

		System.out.println("Memory used with StringBuilder  " + (getUsedMem() - before));
	}

	private void withString() {
		StringBuilder fileBuff = new StringBuilder();
		long before = getUsedMem();
		File file = new File("C:\\Users\\pawan\\Desktop\\Hr1m.csv");
		try (BufferedReader lnr = new BufferedReader(new FileReader(file))) {
			String currLine = null;

			while ((currLine = lnr.readLine()) != null) {
				fileBuff.append("\r\n" + currLine);
			}
		} catch (Exception e) {
			System.out.println("The resource threw an Exception:  " + e.getMessage());
		}
		System.out.println("Memory used with String  " + (getUsedMem() - before));
	}

	private long getUsedMem() {
		long mem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("getUsedMem " + mem);
		return mem;
	}

}
