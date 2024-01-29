# Description of the data structure

### Collection

1. **List**
   
   - **ArrayList**: Ordered (maintains insertion order), allows duplicates.
   - **LinkedList**: Ordered (maintains insertion order), allows duplicates.
   - **Vector**: Ordered (maintains insertion order), allows duplicates.
   - **Stack**: Ordered (maintains insertion order), allows duplicates.

2. **Set**
   
   - **HashSet**: Unordered, does not allow duplicates.
   - **LinkedHashSet**: Ordered (maintains insertion order), does not allow duplicates.
   - **TreeSet**: Sorted (natural or custom ordering), does not allow duplicates.

3. **Queue**
   
   - **PriorityQueue**: Sorted (natural or custom ordering), allows duplicates.
   - **LinkedList**: Ordered (maintains insertion order), allows duplicates. (as a `Deque` implementation)
   - **ArrayDeque**: Ordered (maintains insertion order), allows duplicates.

### Map

1. **HashMap**: Unordered, keys do not allow duplicates, values allow duplicates.
2. **Hashtable**: Unordered, keys do not allow duplicates, values allow duplicates. (thread-safe)
3. **LinkedHashMap**: Ordered (maintains insertion order), keys do not allow duplicates, values allow duplicates.
4. **TreeMap**: Sorted (natural or custom ordering), keys do not allow duplicates, values allow duplicates.

Each of these categories has its specific use case, and the choice of which type to use depends on the specific application scenario, such as whether maintaining the insertion order of elements is needed, the need for fast access, etc.
