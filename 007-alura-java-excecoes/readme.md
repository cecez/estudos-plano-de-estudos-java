heap: objects allocation memory

# Exceptions
- **unchecked** exceptions: compiler can't detect (RuntimeException and its subclasses)
- **checked** exceptions: compiler can detect, must be declared in the function or handled (Exception and its subclasses)
- common exceptions:
  - **IOException**: input/output exception
  - **NullPointerException**: null pointer exception
  - **ArithmeticException**: arithmetic exception
  - **IllegalArgumentException**: illegal argument exception
  - **IllegalStateException**: illegal state exception
  - **IndexOutOfBoundsException**: index out of bounds exception
  - **NumberFormatException**: number format exception


Throwable (classe base)
- Exception
  - RuntimeException
    - NullPointerException
    - ArithmeticException
    - ...
  - IOException
  - SQLException
  - ...
- Error (unchecked)
  - OutOfMemoryError
  - StackOverflowError
  - ...