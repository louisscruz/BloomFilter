package BloomFilter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloomFilterTest {
    @Nested
    class whenTrue {
        @Test
        @DisplayName("returns true")
        void trueTest() {
            BloomFilter filter = new BloomFilter(100);
            filter.set(1);
            filter.set(2);
            filter.set(3);

            assertTrue(filter.get(1));
            assertTrue(filter.get(2));
            assertTrue(filter.get(3));
        }
    }

    @Nested
    class whenFalse {
        @Test
        @DisplayName("returns false")
        void falseTest() {
            BloomFilter filter = new BloomFilter(100);
            filter.set(1);
            filter.set(2);
            filter.set(3);

            assertFalse(filter.get(4));
            assertFalse(filter.get(5));
            assertFalse(filter.get(6));
        }
    }

}