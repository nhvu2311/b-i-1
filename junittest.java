Java
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class junittest {

    @Test
    public void testRealRootsPositiveDiscriminant() {
        double a = 1.0;
        double b = -2.0;
        double c = 1.0;

        double expectedRoot1 = 1.0;
        double expectedRoot2 = -1.0;

        double[] actualRoots = QuadraticEquationSolver.solveQuadraticEquation(a, b, c);

        assertArrayEquals(new double[]{expectedRoot1, expectedRoot2}, actualRoots);
    }

    @Test
    public void testSingleRootZeroDiscriminant() {
        double a = 1.0;
        double b = -2.0;
        double c = 1.0;

        double expectedRoot = 1.0;

        double[] actualRoots = QuadraticEquationSolver.solveQuadraticEquation(a, b, c);

        assertArrayEquals(new double[]{expectedRoot}, actualRoots);
    }

    @Test
    public void testNoRealRootsNegativeDiscriminant() {
        double a = 1.0;
        double b = -3.0;
        double c = 2.0;

        double[] expectedRoots = new double[]{};

        double[] actualRoots = QuadraticEquationSolver.solveQuadraticEquation(a, b, c);

        assertArrayEquals(expectedRoots, actualRoots);
    }

    @Test
    public void testInvalidCoefficients() {
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        assertThrows(IllegalArgumentException.class, () -> QuadraticEquationSolver.solveQuadraticEquation(a, b, c));
    }
}