# Set Interface and Implementations

The `Set` interface in Java is a collection that cannot contain duplicate elements. It is an interface that extends the `Collection` interface, and its primary implementations are `HashSet`, `LinkedHashSet`, and `TreeSet`.

### HashSet

`Set<String> hashSet = new HashSet<>();`

- **Description**: Implements a set using a hash table. It does not maintain the order of elements.
- **Performance**: Offers constant time performance for basic operations (add, remove, contains, and size), assuming the hash function disperses elements properly.
- **Key Methods**:
  - `add(E e)`: Adds an element to the set.
  - `remove(Object o)`: Removes the specified element from the set.
  - `contains(Object o)`: Checks if the set contains the specified element.
  - `size()`: Returns the number of elements in the set.
  - `isEmpty()`: Checks if the set is empty.
  - `iterator()`: Returns an iterator over the elements in the set.

### LinkedHashSet

`Set<String> linkedHashSet = new LinkedHashSet<>();`

- **Description**: A hash table and linked list implementation of the `Set` interface. Maintains a doubly-linked list running through all its entries to preserve insertion order.
- **Performance**: Slightly lower performance than `HashSet` due to the added expense of maintaining the linked list.
- **Key Methods**: Same as `HashSet`.

# SortedSet Interface and Implementation

### TreeSet

`SortedSet<String> treeSet = new TreeSet<>();`

- **Description**: Implements a sorted set using a red-black tree. Elements are ordered using their natural ordering or by a `Comparator` provided at set creation time.
- **Performance**: Offers O(log n) time cost for the basic operations (add, remove, and contains).
- **Key Methods**:
  - `add(E e)`: Adds an element to the set.
  - `remove(Object o)`: Removes the specified element from the set.
  - `contains(Object o)`: Checks if the set contains the specified element.
  - `first()`: Returns the first (lowest) element currently in the set.
  - `last()`: Returns the last (highest) element currently in the set.
  - `subSet(E fromElement, E toElement)`: Returns a view of the portion of the set whose elements range from `fromElement`, inclusive, to `toElement`, exclusive.
  - `headSet(E toElement)`: Returns a view of the portion of the set whose elements are strictly less than `toElement`.
  - `tailSet(E fromElement)`: Returns a view of the portion of the set whose elements are greater than or equal to `fromElement`.
  - `comparator()`: Returns the comparator used to order the elements in the set, or `null` if the set uses the natural ordering of its elements.

Each of these implementations of the `Set` interface has its own specific use cases and characteristics. `HashSet` is generally the best-performing implementation; `LinkedHashSet` is useful when iteration order matters; and `TreeSet` is essential when sorted order is required.
