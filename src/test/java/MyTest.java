import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Enclosed.class)
public class MyTest {
    @RunWith(Parameterized.class)
    public static class MyNestedTestClass1 {
        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(
                new Object[] {1,2},
                new Object[] {3,4}
            );
        }

        public MyNestedTestClass1(
            final int a, final int b
        ) {
        }

        @Test
        public void test() {
        }
    }

    @RunWith(Parameterized.class)
    public static class MyNestedTestClass2 {
        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(
                new Object[] {1,2},
                new Object[] {3,4}
            );
        }

        public MyNestedTestClass2(
            final int a, final int b
        ) {
        }

        @Test
        public void test() {
        }
    }
}
