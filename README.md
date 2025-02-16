# Duplicate Elements Detection in Java

## Introduction
This Java program identifies duplicate elements in an array entered by the user. It prompts the user for the array size and elements, then checks for duplicate values using nested loops. The program serves as a fundamental example of array manipulation, user input handling, and conditional logic in Java.

## Features
- Takes user input for array size and elements.
- Iterates through the array to find duplicate elements.
- Displays duplicate elements to the console.
- Demonstrates the use of nested loops and conditional statements.

## Code Explanation
```java
package duplicateElemtOperations;

import java.util.Scanner;

public class DuplicateElements
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = s.nextInt();
        int [] arr = new int [size];
        System.out.println("Enter the Elements");
        for(int i=0; i<=arr.length-1; i++)
        {
            arr[i] = s.nextInt();
        }
        
        for(int i=0; i<=arr.length-1; i++)
        {
            for(int j=0; j<=i-1; j++)
            {
                if(arr[j] == arr[i])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
```

## Breakdown of Code

### 1. Importing Scanner Class
```java
import java.util.Scanner;
```
This imports the Scanner class, which is used to take user input.

### 2. Taking User Input
```java
Scanner s = new Scanner(System.in);
System.out.println("Enter the Size of array");
int size = s.nextInt();
int [] arr = new int [size];
System.out.println("Enter the Elements");
```
- `Scanner s = new Scanner(System.in);` initializes the Scanner object to take input from the user.
- `int size = s.nextInt();` stores the user-defined array size.
- `int [] arr = new int [size];` creates an array with the given size.

### 3. Populating the Array
```java
for(int i=0; i<=arr.length-1; i++)
{
    arr[i] = s.nextInt();
}
```
- A `for` loop iterates from `0` to `arr.length - 1` to store user input into the array.
- `arr[i] = s.nextInt();` assigns each user-entered value to the respective index in the array.

### 4. Finding Duplicate Elements
```java
for(int i=0; i<=arr.length-1; i++)
{
    for(int j=0; j<=i-1; j++)
    {
        if(arr[j] == arr[i])
        {
            System.out.println(arr[j]);
        }
    }
}
```
- The **outer loop** (`for(int i=0; i<=arr.length-1; i++)`) iterates over each element of the array.
- The **inner loop** (`for(int j=0; j<=i-1; j++)`) checks all previous elements to find duplicates.
- The **if condition** (`if(arr[j] == arr[i])`) compares the current element with previous elements.
- If a duplicate is found, it prints the duplicate element.

### Optimized Approach Using HashSet
Using a `HashSet` reduces time complexity to **O(n)**:
```java
import java.util.HashSet;
import java.util.Scanner;

public class OptimizedDuplicateElements
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = s.nextInt();
        int [] arr = new int [size];
        System.out.println("Enter the Elements");
        for(int i=0; i<size; i++)
        {
            arr[i] = s.nextInt();
        }
        
        HashSet<Integer> seen = new HashSet<>();
        System.out.println("Duplicate Elements:");
        for (int num : arr)
        {
            if (!seen.add(num))
            {
                System.out.println(num);
            }
        }
    }
}
```
### Benefits of HashSet:
- **Faster execution (O(n))**
- **Avoids redundant comparisons**
- **More readable and maintainable**

## How to Run the Program
1. Copy and paste the code into a Java IDE (e.g., Eclipse, IntelliJ) or a simple text editor.
2. Compile using `javac DuplicateElements.java`.
3. Run the program using `java DuplicateElements`.
4. Enter the array size and elements when prompted.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Array_Duplicate_Detection.git
```
