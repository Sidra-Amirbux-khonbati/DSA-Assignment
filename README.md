# DSA-Assignment
# 💻 Data Structures & Algorithms

[![Java](https://img.shields.io/badge/Java-17-blue?logo=java&logoColor=white)](https://www.java.com/)  
[![GitHub Repo Size](https://img.shields.io/github/repo-size/YourUsername/YourRepoName)]()


## 👩‍💻 Developer
**Sidra Amirbux Khonbati** 

**Course:** Data Structure & Algorithm  
**Program:** BS Software Engineering  
**Instructor:** Hamza Jawed  


## 📚 Project Overview
This repository contains **Java implementations of core Data Structures & Algorithms**:  
- **Doubly Linked List (DLL)**  
- **Queue (Array & Linked List)**  
- **Searching Algorithms**  
- **Recursion Problems**  
- **Sorting Algorithms (Merge Sort & Quick Sort)**  
- **Binary Search Tree (BST)**  

✅ Implemented **from scratch** (no Java built-in collections used).  
✅ Handles **edge cases** and **includes time/space complexities**.  


## 🏷 Features & Complexity

### 1️⃣ Doubly Linked List

**Features Implemented:**  
- Insert at beginning and end  
- Forward and backward traversal  
- Delete first, last, or specific value  
- Delete before or after a given value  
- Find minimum and maximum values    

**Time Complexity:**  
| Operation        | Complexity |
|-----------------|------------|
| Insert (first/last) | O(1) |
| Delete (first/last) | O(1) |
| Delete by value     | O(n) |
| Delete before/after | O(n) |
| Find Min/Max        | O(n) |

**Memory Complexity:** O(n) (each node stores `data + prev + next`)

### 2️⃣ Queue

### A. Array-based Queue  
- Dynamic resizing implemented  
- Operations: Enqueue, Dequeue, Peek, Display, Find Min/Max  

**Time Complexity:**  
| Operation | Complexity |
|-----------|------------|
| Enqueue   | O(1) avg, O(n) if resize |
| Dequeue   | O(1) |
| Peek      | O(1) |
| Find Min/Max | O(n) |

### B. Linked List-based Queue  
- Operations: Enqueue, Dequeue, Peek, Find Min/Max  

**Time Complexity:**  
| Operation | Complexity |
|-----------|------------|
| Enqueue   | O(1) |
| Dequeue   | O(1) |
| Peek      | O(1) |
| Find Min/Max | O(n) |

**Memory Complexity:** O(n) (1 node = data + pointer)  

**Comparison:**  
- Array Queue may require resizing → extra memory  
- Linked List Queue → dynamic memory allocation, no resizing required  


### 3️⃣ Searching Algorithms
**Implemented:**  
- Iterative Binary Search  
- Recursive Binary Search  
- Recursive Linear Search  
- Recursive Min/Max  

**Why Binary Search Requires Sorted Data:**  
Binary search works by comparing the middle element and choosing left or right half. If the array is not sorted, it may choose the wrong half → search will fail.  

**Time & Space Complexity (Recursive Approaches):**  
| Algorithm | Time Complexity | Space Complexity |
|-----------|----------------|----------------|
| Recursive Binary Search | O(log n) | O(log n) |
| Recursive Linear Search | O(n) | O(n) |
| Recursive Min/Max | O(n) | O(n) |

### 4️⃣ Recursion Problems
**Implemented:**  
- Factorial of a number  
- Fibonacci sequence  
- Sum of array elements  
- Check if array is sorted  
- Find Min/Max in array  

**Key Concepts:**  
- Base Case and Recursive Case clearly defined  
- Eliminates iterative loops → cleaner code  

### 5️⃣ Sorting Algorithms
-**Implemented:**  
- Merge Sort  
- Quick Sort  

**Time & Space Complexity:**  

| Algorithm | Time Complexity | Space Complexity | Stable |
|-----------|----------------|----------------|--------|
| Merge Sort | O(n log n) all cases | O(n) | Yes |
| Quick Sort | O(n log n) avg, O(n²) worst | O(log n) recursion stack | No |

**Notes:**  
- Merge Sort uses extra array during merging → stable  
- Quick Sort is in-place → faster but not stable  

### 6️⃣ Binary Search Tree (BST)
**Implemented Features:**  
- Insert nodes into BST  
- Inorder, Preorder, Postorder traversal  
- Search a node  
- Delete a node  
- Find Min and Max  
- Count total nodes and leaf nodes  
- Calculate tree height  

**Time Complexity:**  
| Operation | Average Case | Worst Case |
|-----------|--------------|------------|
| Search / Insert / Delete | O(log n) | O(n) |
| Find Min/Max | O(log n) | O(n) |
| Count Nodes / Height | O(n) | O(n) |

**Memory Complexity:** O(n) (each node = data + 2 pointers)  

## ⚡ General Notes

- All implementations are **exam-friendly** and clearly show recursion, iteration, and OOP concepts  
- Proper **edge-case handling** for empty structures, head/tail nodes, and value not found  
- Code is **modular**, with reusable methods for each data structure
- 
## 🚀 How to Use
1. Clone the repo:  
```bash
git clone <https://github.com/Sidra-Amirbux-khonbati/DSA-Assignment.git>
