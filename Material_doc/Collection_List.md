# List Interface and Implementations

### ArrayList 

    `ArrayList<Type> arrayList = new ArrayList<>(); `

1. `add(E element)`: Adds an element to the end of the list.
2. `add(int index, E element)`: Inserts an element at the specified position.
3. `remove(Object o)`: Removes the specified element.
4. `remove(int index)`: Removes the element at the specified position.
5. `get(int index)`: Retrieves the element at the specified position.
6. `set(int index, E element)`: Replaces the element at the specified position.
7. `size()`: Returns the number of elements in the list.
8. `clear()`: Clears the list.
9. `contains(Object o)`: Checks if the list contains the specified element.
10. `isEmpty()`: Checks if the list is empty.

### LinkedList 

`LinkedList<Type> linkedList = new LinkedList<>();`

LinkedList provides all the methods of ArrayList, plus some additional methods to take advantage of its linked list nature:

1. `addFirst(E e)`: Adds an element to the beginning of the list.
2. `addLast(E e)`: Adds an element to the end of the list.
3. `removeFirst()`: Removes the first element of the list.
4. `removeLast()`: Removes the last element of the list.
5. `getFirst()`: Retrieves the first element of the list.
6. `getLast()`: Retrieves the last element of the list.

**The `LinkedList` class in Java can use the methods of the `Queue` interface because it implements the `Queue` interface. More specifically, `LinkedList` actually implements the `Deque` interface, which is an extension of the `Queue` interface.**

**Because the `Deque` interface extends the `Queue` interface, `LinkedList` inherits all the methods of the `Queue` interface, such as `offer`, `poll`, `peek`, etc.as well as the methods specific to the `Deque` interface, including `offerFirst`, `offerLast`, `pollFirst`, `pollLast`, `push`, `pop`, and more.**

**This means that `LinkedList` can not only be used as a standard queue (following the first-in-first-out principle) but also as a double-ended queue (allowing operations at both the head and the tail), and even as a stack (following the last-in-first-out principle).**
### Vector 

`Vector<Type> vector = new Vector<>();`

Vector provides methods similar to ArrayList. Being thread-safe, its methods are synchronized in a multi-threaded environment:

1. `add(E element)`: Adds an element to the end of the vector.
2. `add(int index, E element)`: Inserts an element at the specified position.
3. `remove(Object o)`: Removes the specified element.
4. `remove(int index)`: Removes the element at the specified position.
5. `get(int index)`: Retrieves the element at the specified position.
6. `set(int index, E element)`: Replaces the element at the specified position.
7. `size()`: Returns the number of elements in the vector.
8. `clear()`: Clears the vector.
9. `contains(Object o)`: Checks if the vector contains the specified element.
10. `isEmpty()`: Checks if the vector is empty.

### Stack 

`Stack<Type> stack = new Stack<>();`

Stack inherits from Vector and provides Last-In-First-Out (LIFO) stack operations:

1. `push(E item)`: Pushes an element onto the top of the stack.
2. `pop()`: Removes and returns the top element of the stack.
3. `peek()`: Looks at the top element of the stack without removing it.
4. `empty()`: Checks if the stack is empty.
5. `search(Object o)`: Returns the position of the object in the stack.

The Stack class in Java can use some methods that are related to the Queue interface, but this is not because the Stack class implements the Queue interface. In fact, the Stack class does not directly implement the Queue interface. The reason why the Stack class can use certain queue-like methods is because it inherits from the Vector class, and the Vector class provides a range of methods that can be used for queue operations.
---

### Similarities

1. **Dynamic Collections**: All of them are dynamic collections, allowing elements to be added and removed at runtime.
2. **Generic Support**: These classes support generics, allowing them to store objects of any type.
3. **Ordered Storage**: They provide ordered storage of elements, meaning the order in which elements are added determines their storage order.
4. **List Interface Implementation**: `ArrayList`, `LinkedList`, and `Vector` all implement the `List` interface, providing a range of standard list operation methods.

### Differences

1. **Internal Implementation**:
   
   - **ArrayList**: Based on a dynamic array.
   - **LinkedList**: Based on a doubly-linked list.
   - **Vector**: Similar to `ArrayList` but is thread-safe.
   - **Stack**: Based on `Vector`, provides a Last-In-First-Out (LIFO) stack structure.

2. **Performance Characteristics**:
   
   - **ArrayList** and **Vector**: More efficient in random access of elements but less efficient in inserting and removing elements in the middle of the list.
   - **LinkedList**: More efficient in adding or removing elements at the head and tail but less efficient in random access.
   - **Stack**: Focused on stack operations like `push`, `pop`, and `peek`, and less on list's random access and insertion/deletion efficiency.

3. **Thread Safety**:
   
   - **ArrayList** and **LinkedList**: Not thread-safe.
   - **Vector** and **Stack**: Thread-safe, providing synchronized methods for safety in a multi-threaded environment.

4. **Specific Use-Cases**:
   
   - **LinkedList**: Can be used as a queue (double-ended queue) in addition to being a list.
   - **Stack**: Specific to stack operations such as `push`, `pop`, and `peek`.

When choosing which collection class to use, it typically depends on the specific needs of the application scenario, including performance requirements for accessing, adding, and removing elements, as well as the need for thread safety.

---

### Unique Methods of LinkedList

1. `addFirst(E e)`: Adds an element to the beginning of the list.
2. `addLast(E e)`: Adds an element to the end of the list.
3. `removeFirst()`: Removes the first element from the list.
4. `removeLast()`: Removes the last element from the list.
5. `getFirst()`: Retrieves the first element of the list.
6. `getLast()`: Retrieves the last element of the list.

### Unique Methods of Stack

1. `push(E item)`: Pushes an element onto the top of the stack.
2. `pop()`: Removes and returns the top element of the stack.
3. `peek()`: Looks at the top element of the stack without removing it.
4. `empty()`: Checks if the stack is empty.
5. `search(Object o)`: Returns the position of the object in the stack.
