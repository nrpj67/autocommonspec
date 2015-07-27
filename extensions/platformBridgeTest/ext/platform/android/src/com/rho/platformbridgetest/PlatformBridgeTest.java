package com.rho.platformbridgetest;

import java.util.Map;

import com.rhomobile.rhodes.api.IMethodResult;
import com.rhomobile.rhodes.api.MethodResult;

public class PlatformBridgeTest extends PlatformBridgeTestBase implements IPlatformBridgeTest {
    
    public PlatformBridgeTest(String id) {
        super(id);
    }


    @Override
    public void getPlatformName(IMethodResult result) {
          result.set("Android");	
    }


    @Override
    public void calcSumm(int a, int b, IMethodResult result) {
          result.set(a+b);
    }

    @Override
    public void joinStrings(String a, String b, IMethodResult result) {
          result.set(a+b);
    }


}