package BloomFilter;

public class SecondHash implements Hashable {
    public long hash(long state) {
        state += (state << 12);
        state ^= (state >> 3);
        state += (state << 4);
        state ^= (state >> 5);
        state += (state << 10);
        state ^= (state >> 2);
        state += (state << 12);
        state ^= (state >> 2);
        return state;
    }
}
