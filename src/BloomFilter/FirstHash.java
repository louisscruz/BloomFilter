package BloomFilter;

public class FirstHash implements Hashable {
    public long hash(long state) {
        state += (state << 12);
        state ^= (state >> 22);
        state += (state << 4);
        state ^= (state >> 9);
        state += (state << 10);
        state ^= (state >> 2);
        state += (state << 7);
        state ^= (state >> 12);
        return state;
    }
}
