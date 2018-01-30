package org.sonar.samples.java.checks;
import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;

public class RulesTest {
@Test
public void test() {
	  JavaCheckVerifier.verify("src/test/RulesTest.java", new Rules());
}
}
