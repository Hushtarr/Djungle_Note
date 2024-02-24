# Queue Interface and Implementations

### PriorityQueue

`Queue<String> priorityQueue = new PriorityQueue<>();`

- Elements are ordered based on priority, either natural ordering or through a `Comparator`.

- Does not guarantee constant-time performance for basic operations.

- **Methods**:
  
  - `add`, `offer`: Insert elements into the queue according to their priority.
  - `remove`, `poll`: Remove and return the head of the queue.
  - `element`, `peek`: Retrieve, but do not remove, the head of the queue.


# Deque Interface and Implementations

### ArrayDeque

`Deque<String> arrayDeque = new ArrayDeque<>();`

- Faster than `LinkedList` for queue and stack operations.

- Can be used as both stack and queue (implements `Deque`).

- Based on a resizable array, provides faster array-based operations.

- Does not allow null elements.

- **Methods**:
  
  - `addFirst`, `offerFirst`: Add elements at the start of the deque.
  - `addLast`, `offerLast`: Add elements at the end of the deque.
  - `removeFirst`, `pollFirst`: Remove and return the first element of the deque.
  - `removeLast`, `pollLast`: Remove and return the last element of the deque.
  - `getFirst`, `peekFirst`: Retrieve, but do not remove, the first element of the deque.
  - `getLast`, `peekLast`: Retrieve, but do not remove, the last element of the deque.

### LinkedList

`Deque<String> linkedListAsDeque = new LinkedList<>();`

- Based on a linked list structure, ideal for frequent insertions and deletions.

- Implements both `List` and `Deque` interfaces, providing methods of both.

- Allows null elements.

- **Methods**:
  
  - `addFirst`, `offerFirst`: Add elements at the start of the deque.
  - `add`, `offer`: Add elements to the queue.
  - `addLast`, `offerLast`: Add elements at the end of the deque.
  - `removeFirst`, `pollFirst`: Remove and return the first element of the deque.
  - `removeLast`, `pollLast`: Remove and return the last element of the deque.
  - `getFirst`, `peekFirst`: Retrieve, but do not remove, the first element of the deque.
  - `getLast`, `peekLast`: Retrieve, but do not remove, the last element of the deque.
  - `remove`, `poll`: Remove and return the head of the queue.
  - `element`, `peek`: Retrieve, but do not remove, the head of the queue.
  - Plus all methods from the `List` interface such as `get`, `set`, `indexOf`, etc.
