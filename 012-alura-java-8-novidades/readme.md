- default methods
  - permite incluir um método com implementação em uma interface.
  ```java
    default void sort(Comparator<? super E> c) {
        Collections.sort(this, c);
    }
   ```
  
- lambda
  - pode ser usado em casos que exige uma implementacao de um unico metodo (interface funcional)