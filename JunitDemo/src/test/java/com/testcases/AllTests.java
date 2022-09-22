package com.testcases;





import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
@RunWith(JUnitPlatform.class)
@SelectPackages({"com.testcases.demo"})
@ExcludePackages({"com.testcases.demo.check"})
class AllTests {

	

}
