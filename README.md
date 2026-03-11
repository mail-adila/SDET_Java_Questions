# ☕ SDET Java Interview Questions

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Interview Prep](https://img.shields.io/badge/Interview-Ready-4CAF50?style=flat-square)
![Topics](https://img.shields.io/badge/Topics-14-0A66C2?style=flat-square)

A curated collection of **Java coding solutions** for the most commonly asked technical interview questions in **SDET / Test Automation Engineer** roles. All solutions are implemented from scratch — no built-in shortcuts — to demonstrate strong fundamentals.

---

## 📋 Topics Covered

| # | Problem | Concepts |
|---|---------|----------|
| 1 | [Array Sort](./ArraySort.java) | Sorting without built-ins |
| 2 | [Sorting Algorithms](./SortingAlgorithms.java) | Bubble, Selection, Insertion sort |
| 3 | [Character Occurrences](./CharacterOccurences.java) | HashMap, frequency counting |
| 4 | [String Reverse](./StringReverse.java) | String manipulation |
| 5 | [Factorial](./Factorial.java) | Iteration |
| 6 | [Palindrome Check](./PalindromeCheck.java) | Two-pointer / string comparison |
| 7 | [Largest & Smallest in Array](./LargestSmallestArray.java) | Array traversal |
| 8 | [Binary Search](./BinarySearch.java) | Divide and conquer, O(log n) |
| 9 | [Prime Check](./PrimeCheck.java) | Number theory |
| 10 | [Fibonacci Series](./Fibonacci.java) | Iteration & recursion |
| 11 | [Sum of Digits](./SumOfDigits.java) | Modulo arithmetic |
| 12 | [Sum of Alphanumeric String](./SumOfAlphanumericString.java) | Character parsing |
| 13 | [Array Intersection](./ArrayIntersection.java) | HashSet, arrays |
| 14 | [Stack Implementation](./Stack.java) | Data structures from scratch |

---

## 💡 Why This Repo Exists

SDET interviews frequently test **core Java programming skills** alongside automation knowledge. This repo focuses on the patterns that come up most often — array manipulation, string problems, searching, sorting, and basic data structures — all written with clarity and efficiency in mind.

---

## 🧠 Sample Solution

**Binary Search** — O(log n) search on a sorted array:

```java
public static int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == target)      return mid;
        else if (arr[mid] < target)  left = mid + 1;
        else                         right = mid - 1;
    }
    return -1; // not found
}
```

---

## 🚀 How to Run

### Prerequisites
- Java JDK 11+
- Any IDE (IntelliJ IDEA, Eclipse, VS Code)

### Steps

```bash
# Clone the repo
git clone https://github.com/mail-adila/SDET_Java_Questions.git
cd SDET_Java_Questions

# Compile a file
javac BinarySearch.java

# Run it
java BinarySearch
```

Or simply open the project in **IntelliJ IDEA** or **Eclipse** and run any class directly.

---

## 🎯 Key Concepts Demonstrated

- Arrays & String manipulation
- HashMap & HashSet usage
- Recursion vs. Iteration tradeoffs
- Classic sorting algorithms (Bubble, Selection, Insertion)
- Stack data structure implemented from scratch
- Time & space complexity awareness

---

## 🔗 Related

- [Blind 75 LeetCode (Python)](https://github.com/mail-adila/Blind_75_Leetcode) — Advanced DSA practice
- [Selenium Automation Framework](https://github.com/mail-adila/SeleniumFramework) — End-to-end test automation

---

## 👩‍💻 Author

**Adila Karim** — [LinkedIn](https://www.linkedin.com/in/adila-karim) · [GitHub](https://github.com/mail-adila)
