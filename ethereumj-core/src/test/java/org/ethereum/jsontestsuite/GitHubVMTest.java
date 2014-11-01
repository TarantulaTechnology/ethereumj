package org.ethereum.jsontestsuite;

import org.json.simple.parser.ParseException;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GitHubVMTest {

    @Test // testing full suite
    @Ignore
    public void testArithmeticFromGitHub() throws ParseException {

    	String json = JSONReader.loadJSON("vmtests/vmArithmeticTest.json");
    	GitHubJSONTestSuite.runGitHubJsonTest(json);
    }
    
    @Test // testing full suite
    @Ignore
    public void testBitwiseLogicOperationFromGitHub() throws ParseException {

    	String json = JSONReader.loadJSON("vmtests/vmBitwiseLogicOperationTest.json");
    	GitHubJSONTestSuite.runGitHubJsonTest(json);
    }
    
    @Test // testing full suite
    @Ignore
    public void testBlockInfoFromGitHub() throws ParseException {

    	String json = JSONReader.loadJSON("vmtests/vmBlockInfoTest.json");
    	GitHubJSONTestSuite.runGitHubJsonTest(json);
    }
    
    @Test // testing full suite
    @Ignore
    public void testEnvironmentalInfoFromGitHub() throws ParseException {

    	String json = JSONReader.loadJSON("vmtests/vmEnvironmentalInfoTest.json");
    	GitHubJSONTestSuite.runGitHubJsonTest(json);
    }
    
    @Test // testing full suite
    @Ignore
    public void testIOandFlowOperationsFromGitHub() throws ParseException {

    	String json = JSONReader.loadJSON("vmtests/vmIOandFlowOperationsTest.json");
    	GitHubJSONTestSuite.runGitHubJsonTest(json);
    }
    
    @Test // testing full suite
    @Ignore
    public void testPushDupSwapFromGitHub() throws ParseException {

        String json = JSONReader.loadJSON("vmtests/vmPushDupSwapTest.json");
        GitHubJSONTestSuite.runGitHubJsonTest(json);
    }
    
    @Test // testing full suite
    @Ignore
    public void testShaFromGitHub() throws ParseException {

    	String json = JSONReader.loadJSON("vmtests/vmSha3Test.json");
    	GitHubJSONTestSuite.runGitHubJsonTest(json);
    }
    
    @Test // testing full suite
    @Ignore
    public void testSystemOperationsFromGitHub() throws ParseException {

        String json = JSONReader.loadJSON("vmtests/vmSystemOperationsTest.json");
        GitHubJSONTestSuite.runGitHubJsonTest(json);
    }
}
