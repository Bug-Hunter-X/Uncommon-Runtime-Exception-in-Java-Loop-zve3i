# Uncommon Java Runtime Exception

This repository demonstrates a Java program that exhibits an uncommon runtime exception. The exception is triggered only under a specific condition within a loop, making it difficult to reproduce and debug.

## Bug Description

A `RuntimeException` is thrown inside a `while` loop, but only when the loop counter `i` reaches 5.  This makes the error intermittent and challenging to pinpoint without careful testing or logging.

## How to Reproduce

1. Clone the repository.
2. Compile and run the `bug.java` file.
3. Observe the output and the exception message.

## Solution

The solution addresses the intermittent nature of the exception by using exception handling.