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

---
# Description of the sorting characteristics 
1. **Sorted**:
  
  - This refers to collections where the elements are arranged according to a specific order. This order is typically either the natural ordering of the elements (e.g., numeric or alphabetical order) or an order defined by a custom `Comparator`.
  - Examples in Java include `TreeSet` and `TreeMap`, which implement the `SortedSet` and `SortedMap` interfaces, respectively.
  - In a sorted collection, the elements are iterated in the defined sorted order.
2. **Ordered**:
  
  - This term describes collections where the elements maintain a specific consistent order, usually the order in which they were added to the collection.
  - This is about the retention of the order of insertion or some logical sequence, rather than sorting the elements.
  - For instance, `LinkedList` and `LinkedHashMap` maintain the order of insertion, even though they are not sorted.
3. **Unordered**:
  
  - An unordered collection is one where the elements do not follow any specific order. The storage and retrieval order of elements is not fixed and does not guarantee any order.
  - `HashSet` and `HashMap` are typical examples of unordered collections in Java. They do not guarantee any particular iteration order, and the order can vary with each iteration.

In summary, "Sorted" emphasizes that elements are arranged according to certain rules or criteria, "Ordered" means that elements are stored in the sequence they were added or in a logical sequence, and "Unordered" indicates the absence of any order guarantee.
