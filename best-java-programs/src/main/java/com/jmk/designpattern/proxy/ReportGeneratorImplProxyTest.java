package com.jmk.designpattern.proxy;

public class ReportGeneratorImplProxyTest {

	public static void main(String args[]) {
		Role accessRole = new Role();
		accessRole.setRole("Manager");
		ReportGenerator proxy = new ReportGeneratorImplProxy(accessRole);
		proxy.displayReportTemplate("Pdf", 150);
		proxy.generateComplexReport("Pdf", 150);
		proxy.generateSensitiveReport();
	}
}

