# Bloom Filter

This is a very simple Bloom filter implemented in Java.

The general concept of a Bloom filter is that items can be added to the collection, and items can be looked up in the collection, such that a non-inclusive response is never wrong and an inclusive response is almost always right.

In building a Bloom filter, there is a tradeoff between the number of hash functions, the number of collisions, and the speed of the filter.

I didn't bother to optimize these relationships, but would enjoy the opportunity to do so.
