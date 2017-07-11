package BloomFilter;

import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class BloomFilter {
    private BitSet store;

    private static final Hashable[] hashes = {new FirstHash(), new SecondHash(), new ThirdHash()};

    private static long[] hashValues(long val) {
        long[] answer = new long[hashes.length];

        for (byte i = 0; i < hashes.length; i++) {
            answer[i] = hashes[i].hash(val);
        }

        return answer;
    }

    public BloomFilter(int size) {
        store = new BitSet(size);
    }

    public void set(long val) {
        final long[] hashValues = hashValues(val);

        for (byte i = 0; i < hashValues.length; i++) {
            int value = (int)(hashValues[i] % store.size());
            store.set(value, true);
        }
    }

    public boolean get(int val) {
        final long[] hashValues = hashValues(val);

        for (byte i = 0; i < hashValues.length; i++) {
            int value = (int)(hashValues[i] % store.size());

            if (store.get(value) == false) return false;
        }

        return true;
    }
}
