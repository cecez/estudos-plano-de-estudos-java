# Array
- an object
```java
// init an array of ints with 5 positions, each one with 0
int[] ages = new int[5];
int[] agesToo = {0, 0, 0, 0, 0}; // equivalent

// array of references
String[] names = new String[10];
Object[] references = new Object[10];

references[0] = "Teste";
references[1] = 22;
```

## Casting
### Implicit casting
```java
int number = 3;
double floatingNumber = number; // implicit cast
double floatingNumber2 = (double) number; // explicit cast
```

# java.util.ArrayList
- array with steroids
```java
import java.util.ArrayList;

// array of objects
ArrayList list = new ArrayList();
list.add("Test");
list.add(22);
list.size(); // 2

// array of type T, using generics
ArrayList<T> listOfT = new ArrayList<T>();
```