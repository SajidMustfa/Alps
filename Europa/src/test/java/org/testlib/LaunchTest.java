package org.testlib;

import org.testng.annotations.Test;


import org.lib.Launch;
import org.testng.Assert;


public class LaunchTest {
	Launch l1 =new Launch();
	
	
  @Test
  public void launchtest1() {
	  String expected=l1.Ukey();
	  String actual="S";
	  Assert.assertEquals(actual, expected);
  }


}

