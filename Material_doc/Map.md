## Map Interface and Implementation

The `Map` interface in Java represents a collection that maps keys to values. A `Map` cannot contain duplicate keys, and each key can map to at most one value. The primary implementations of the `Map` interface include `Hashtable`, `LinkedHashMap`, and `HashMap`.

### Hashtable

`Map<String, Integer> hashTable = new Hashtable<>();`

- **Description**: A synchronized, thread-safe map implementation. Does not allow null keys or null values. It is a legacy class.
- **Performance**: Synchronized methods have performance overhead.
- **Key Methods**:
  - `put(K key, V value)`: Inserts a key-value pair into the map.
  - `get(Object key)`: Retrieves the value associated with the specified key.
  - `remove(Object key)`: Removes the key-value pair associated with the specified key.
  - `containsKey(Object key)`: Checks if the map contains the specified key.
  - `keySet()`: Returns a set of the keys contained in the map.
  - `values()`: Returns a collection of the values contained in the map.
  - `entrySet()`: Returns a set of the key-value mappings contained in the map.

### LinkedHashMap

`Map<String, Integer> linkedHashMap = new LinkedHashMap<>();`

- **Description**: Maintains insertion order using a doubly-linked list running through its entries. Allows null keys and values.
- **Performance**: Slightly slower iteration than `HashMap` due to maintaining element order.
- **Key Methods**: Same as `Hashtable` and `HashMap`.

### HashMap

`Map<String, Integer> hashMap = new HashMap<>();`

- **Description**: Based on a hash table. Allows one null key and multiple null values. Does not maintain order of entries.
- **Performance**: Provides constant-time performance for basic operations, assuming good hash function.
- **Key Methods**: Same as `Hashtable`.

## SortedMap Interface and Implementation

### TreeMap

`SortedMap<String, Integer> treeMap = new TreeMap<>();`

- **Description**: Based on a red-black tree. Sorts keys based on their natural ordering or a specified comparator.
- **Performance**: Provides O(log n) time performance for basic operations.
- **Key Features**:
  - `firstKey()`: Returns the first (lowest) key in the map.
  - `lastKey()`: Returns the last (highest) key in the map.
  - `subMap(K fromKey, K toKey)`: Returns a view of the portion of the map from `fromKey` (inclusive) to `toKey` (exclusive).
  - `headMap(K toKey)`: Returns a view of the portion of the map whose keys are less than `toKey`.
  - `tailMap(K fromKey)`: Returns a view of the portion of the map whose keys are greater than or equal to `fromKey`.
  - `comparator()`: Returns the comparator used for ordering the keys in the map, or null if using natural ordering.
- **Key Methods**: Similar to `Hashtable` and `HashMap`, with additional methods specific to sorted maps.

Each implementation of the `Map` interface has its specific use cases. `Hashtable` is a legacy class and is generally replaced by `ConcurrentHashMap` for thread-safe implementations. `LinkedHashMap` is useful for maintaining insertion order. `HashMap` is commonly used due to its performance. `TreeMap` is used when a sorted order of keys is required.
