# ☕ Java Programming — Core Concepts & Data Structures

> A structured collection of **88 Java programs** covering everything from basic syntax to advanced data structures and graph algorithms, organized as an Eclipse project under the `com.mit` package hierarchy.

---

## 📁 Repository Structure

```
src/
├── HotelCatalogue.java                    ← Standalone console app
└── com/mit/
    ├── first/                             → Java Basics & Operators
    ├── placement/conditional/             → Control Flow
    ├── loops/                             → Loops & Patterns
    ├── MethodDemo/                        → Methods & User Input
    ├── array/                             → Arrays (1D, 2D, Jagged)
    ├── searching/                         → Searching, Sorting & Backtracking
    ├── stack/                             → Stack Implementations
    ├── queue/                             → Queue Implementations
    ├── list/                              → Linked Lists
    ├── hashing/                           → Hashing & HashSets
    ├── tree/                              → Binary Trees & Traversals
    └── graph/                             → Graph Algorithms (BFS, DFS)
```

---

## 📚 Module Breakdown

### 🔰 1. Java Basics — `com.mit.first`
Foundational programs to get started with Java.

| File | Description |
|------|-------------|
| `ArithematicOperators.java` | Demonstrates all arithmetic operators |
| `UnaryOperatorDemo.java` | Increment, decrement, and unary operations |
| `swap.java` / `SWAPThirdVar.java` | Swapping two variables with and without a third variable |
| `WithoutThirdVar.java` | XOR / arithmetic swap trick |
| `MobileNumber.java` | Data type and variable declaration demo |

---

### 🔀 2. Control Flow — `com.mit.placement.conditional`
Conditional logic and decision-making structures.

| File | Description |
|------|-------------|
| `IFdemo.java` / `IFelseDemo.java` | Basic `if` and `if-else` blocks |
| `SwitchcaseDemo.java` | Switch-case control flow |
| `StudentGrades.java` | Grade calculator using conditionals |
| `IncomeTax.java` | Income tax slab calculator |
| `VotingDemo.java` / `EligibleforVote.java` | Age-based eligibility checker |

---

### 🔁 3. Loops & Patterns — `com.mit.loops`
Loop constructs and classic pattern programs.

| File | Description |
|------|-------------|
| `ForLoopDemo.java` | `for` loop basics |
| `WhileLoop.java` | `while` loop basics |
| `DoWhileLoop.java` | `do-while` loop basics |
| `StarPattern.java` | Star pattern using nested loops |
| `PrintPattern.java` / `pattern.java` | Number/character pattern printing |

---

### 🛠️ 4. Methods — `com.mit.MethodDemo`
Function definitions, return types, and user interaction.

| File | Description |
|------|-------------|
| `PrintName.java` | Void method to print a name |
| `ReturnMethodDemo.java` | Methods with return values |
| `UserInputName.java` | Reading user input with `Scanner` |
| `InterestDemo.java` | Simple/compound interest calculator |
| `TestMethod.java` | Method calling and parameter passing |

---

### 📦 5. Arrays — `com.mit.array`
1D, 2D, jagged arrays, and two-pointer technique.

| File | Description |
|------|-------------|
| `InitilizationDemo.java` / `NewKeyword.java` | Array declaration and initialization |
| `UserInputValue.java`, `UserInputValue2.java`, `UserInputValue3.java` | Reading arrays from user input |
| `ArraySum.java` | Sum of array elements |
| `ReverseArray.java` | Array reversal |
| `CountZeros.java` | Count zero elements in an array |
| `SuffixZero.java` | Count trailing zeros |
| `MaxWatcherCount.java` | Find maximum value in an array |
| `StudentRollNo.java` / `StudentMarks.java` | Student data stored in arrays |
| `TwoDimesionalArray.java` / `UserInput2Darray.java` | 2D array operations |
| `JagArrayStudentResponses.java` | Jagged (irregular) 2D arrays |
| `ShuffleDiagonal.java` | Diagonal traversal / shuffle |
| `TwoPointerArrayConcept.java` / `TwoPointerArrayConcept2.java` | Two-pointer technique |

---

### 🔍 6. Searching, Sorting & Backtracking — `com.mit.searching`
Classic algorithms and string utility programs.

| File | Description |
|------|-------------|
| `LinearSearch.java` | Linear search on an array |
| `BinarySearchDemo.java` | Binary search on a sorted array |
| `BubbleSort.java` | Bubble sort algorithm |
| `SelectionSort.java` | Selection sort algorithm |
| `backttackingSimpleString2Length.java` | Backtracking — generate all binary strings of length N |
| `ReverseString.java` / `ReverseSubstring.java` | String reversal |
| `Substring.java` | Substring extraction and operations |
| `VovelPosition.java` | Find vowel positions in a string |
| `EvenNoSum.java` | Sum of even numbers |
| `DigitPowerSum.java` | Sum of digits raised to their positional power |
| `Number.java` | Number manipulation utilities |

---

### 📚 7. Stack — `com.mit.stack`
Stack implementations from scratch and using Java's built-in `Stack`.

| File | Description |
|------|-------------|
| `StackDemo.java` | Array-based stack with push, pop, display (max size 5) |
| `StackDemo2.java` | Extended stack demo |
| `MergeStack.java` | Merge two stacks into one |
| `VectorImplmentation.java` | Stack backed by `Vector` |

---

### 📬 8. Queue — `com.mit.queue`
Queue implementations and problem-solving with queues.

| File | Description |
|------|-------------|
| `SampleQueueDemo.java` | Basic queue operations |
| `QueueUsing2Stack.java` | Queue implemented using two stacks |
| `ReverseQueue.java` | Reverse a queue using a stack |
| `PrintJob.java` | Print job scheduling simulation |

---

### 🔗 9. Linked Lists — `com.mit.list`
Singly and doubly linked list implementations with real-world scenarios.

| File | Description |
|------|-------------|
| `SampleNodeDemo.java` / `Store2Node.java` / `ThreeNodeLinkLis.java` | Building simple linked list nodes manually |
| `SinglyLinkedListDemo.java` | Singly linked list with insert-at-beginning and traversal |
| `DynamicLinkedList.java` | Dynamic node creation in a singly linked list |
| `EmployeeLinkedList.java` | Employee records in a linked list |
| `PerformOperationsOnDoublyLL.java` | **Doubly linked list** with full CRUD — onboard, update, offboard, delete from end, and reverse display |
| `ChoiceUpdate.java` | Menu-driven linked list operations |

---

### 🗂️ 10. Hashing — `com.mit.hashing`
HashSet and Hashtable usage and duplicate detection.

| File | Description |
|------|-------------|
| `HashSetDemo.java` | Basic `HashSet` operations |
| `HashtableDemo.java` | `Hashtable` key-value storage |
| `FindDuplicateElements.java` | Detect duplicate elements in an array using `HashSet` |
| `StudentDetails.java` | Store and retrieve student records via hashing |

---

### 🌲 11. Binary Trees — `com.mit.tree`
Binary tree construction and traversal algorithms.

| File | Description |
|------|-------------|
| `FirstSampleTreeDemo.java` | Build a binary tree and perform **Preorder, Inorder, Postorder** traversals recursively |
| `BFSDemo.java` | **Level-order (BFS)** traversal using a queue |
| `EmployeeTree.java` | Employee hierarchy modelled as a binary tree with all three traversals |

---

### 🕸️ 12. Graphs — `com.mit.graph`
Graph representations and traversal algorithms.

| File | Description |
|------|-------------|
| `DirectedGraph.java` | Build a directed graph using adjacency lists |
| `UniDirectionalGraph.java` | Unidirectional graph representation |
| `Weightedgraph.java` | Weighted graph with `Edge` class (dest + weight) |
| `UnidirectionalWeightedDemo.java` | Weighted unidirectional graph demo |
| `HashMapGraphCreate.java` | Graph built using `HashMap<String, List<String>>` |
| `FriendCircleGraph.java` | Friend network modelled as a graph |
| `BFSSimpleExample.java` | **Breadth-First Search (BFS)** on an adjacency list |
| `DFSDemo.java` | **Depth-First Search (DFS)** using recursion |
| `PathExistsDemo.java` / `CheckpathExistDemo.java` | Check if a path exists between two nodes |

---

### 🏨 13. Standalone — `HotelCatalogue.java`
A simple console-based hotel menu display for Taj Hotel with items and prices.

---

## 🚀 Getting Started

### Prerequisites
- **Java JDK 8+** — [Download here](https://www.oracle.com/java/technologies/downloads/)
- **Eclipse IDE** *(recommended — project includes `.classpath` and `.project` files)*
- Or any IDE / terminal with `javac` and `java`

### Running in Eclipse
1. Clone the repository:
   ```bash
   git clone https://github.com/sanjyotdhamal/Java-Programming.git
   ```
2. Open Eclipse → **File → Import → Existing Projects into Workspace**
3. Select the cloned folder and click **Finish**
4. Navigate to any `.java` file, right-click → **Run As → Java Application**

### Running from Terminal
```bash
# Clone
git clone https://github.com/sanjyotdhamal/Java-Programming.git
cd Java-Programming

# Compile a file (example)
javac -d bin src/com/mit/tree/FirstSampleTreeDemo.java

# Run it
java -cp bin com.mit.tree.FirstSampleTreeDemo
```

---

## 🧠 Topics Covered

| Category | Topics |
|----------|--------|
| **Language Basics** | Operators, Variables, Data Types, Swap techniques |
| **Control Flow** | if-else, switch-case, nested conditions |
| **Loops** | for, while, do-while, nested loops, pattern printing |
| **Methods** | Parameters, return types, Scanner input |
| **Arrays** | 1D, 2D, Jagged, Two-pointer technique |
| **Searching** | Linear Search, Binary Search |
| **Sorting** | Bubble Sort, Selection Sort |
| **Backtracking** | Binary string generation |
| **Stack** | Array-based, Java Stack class, Merge |
| **Queue** | Linked list queue, Queue using 2 stacks, Reverse |
| **Linked List** | Singly LL, Doubly LL (full CRUD) |
| **Hashing** | HashSet, Hashtable, Duplicate detection |
| **Trees** | Binary Tree, Preorder/Inorder/Postorder, BFS |
| **Graphs** | Adjacency list, Directed, Weighted, BFS, DFS, Path check |

---

## 📌 Project Info

- **IDE:** Eclipse
- **Package base:** `com.mit`
- **Language:** Java
- **Total source files:** 88

---

## 👤 Author

**Sanjyot Dhamal**
- GitHub: [@sanjyotdhamal](https://github.com/sanjyotdhamal)

---

> ⭐ If you find this repository helpful, consider giving it a star!