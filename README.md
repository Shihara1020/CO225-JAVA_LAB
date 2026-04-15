# CO225 Software Construction 🛠️

![Course](https://img.shields.io/badge/Course-CO225%20Software%20Construction-blue)
![Language](https://img.shields.io/badge/Language-Java-red)
![Build](https://img.shields.io/badge/Tools-JDK%20%2F%20VS%20Code-informational)

## Overview
This repository contains lab exercises and practice code for **CO225 – Software Construction**. The work focuses on core Java programming concepts and software construction practices through incremental lab tasks.

## What you’ll find
- Java basics (I/O, control flow, arrays)
- Classes and objects
- Inheritance, polymorphism, abstraction
- Collections
- Exception handling
- Mini lab tasks / practice programs

## Repository structure (high level)
Common folders in this workspace:
- `Java_cod/` – assorted Java practice code
- `Lab1/` … `Lab11/` – weekly lab exercises
- `Lab13/` – Maven-based Java project (`pom.xml`)

## How to run a lab (example)
1. Open the specific lab folder.
2. Compile the required `.java` file(s).
3. Run the class that contains `public static void main(String[] args)`.

Example (PowerShell):

```powershell
cd .\Lab2
javac .\Mainapp.java
java Mainapp
```

## Notes
- Some folders may contain multiple independent programs.
- If VS Code shows “non-project file”, you can still compile/run using `javac` and `java` from the folder.
