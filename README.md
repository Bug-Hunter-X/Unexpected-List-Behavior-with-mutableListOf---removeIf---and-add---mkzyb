# Kotlin MutableList removeIf() and add() Unexpected Behavior

This repository demonstrates an unexpected behavior observed when using `removeIf()` and `add()` methods on a `mutableListOf()` in Kotlin.  After removing elements with a condition using `removeIf()`, adding new elements can lead to unexpected results, particularly when combined with further removals using `removeIf()`.

The issue is subtle and might not be immediately apparent, especially in larger codebases.  This example illustrates the problem and provides a solution.

## How to reproduce
1. Clone the repository
2. Run the `bug.kt` file. Observe the output and how it differs from what might be intuitively expected.
3. Run the `bugSolution.kt` to see a fix that solves the problem