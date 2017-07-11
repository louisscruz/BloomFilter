package BloomFilter;

public class ThirdHash implements Hashable {
    public long hash(long state) {
        state += (state << 1);
        state ^= (state >> 2);
        state += (state << 14);
        state ^= (state >> 7);
        state += (state << 3);
        state ^= (state >> 6);
        state += (state << 7);
        state ^= (state >> 3);
        return state;
    }
}
