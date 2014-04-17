package org.w3.ldp.testsuite;

import nl.javadude.assumeng.Assumes;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * A Generic Test, just to play around TestNG
 */
public class GenericTests {

    private static String server = null;

    @BeforeClass
    @Parameters({"server"})
    public void beforeClass(String server) throws Exception {
        System.out.println("BEFORE CLASS: " + server);
        this.server = server;
        Assumes.assumeThat("server is required", server != null);
        //TODO: REST-assure initialization
        //TODO: move this to an abstract test case implementation
    }

    @Test
    public void testParameter() {
        System.out.println("Test: " + server);
    }

}
