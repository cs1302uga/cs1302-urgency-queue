# CSCI 1302 - Urgency Queue v2023.sp

![Approved for: Spring 2023](https://img.shields.io/badge/Approved%20for-Spring%202023-magenta)

![Unrelated image from page 177 of "Punch" (1841)](https://i.imgur.com/7TdqL1v.jpg)

This document contains the description for Urgency Queue
project assigned to the students in the Spring 2023 CSCI 1302 classes
at the University of Georgia.

## Deadline Options

There are different deadline options for this project. Students who
perform their final submission via the `submit` command before the date/times listed
below automatically receive the associated Submission-Based (SB) extra credit. The
late penalty does not start applying until after the final date listed.

* **MON 2023-03-27 (Mar 27) @ 11:55 PM EST (`+10` SB Extra Credit)**
* **TUE 2023-03-28 (Mar 28) @ 11:55 PM EST (`+5` SB Extra Credit)**
* **WED 2023-03-29 (Mar 29) @ 11:55 PM EST (`+0` SB Extra Credit)**

**Read the entirety of this file before beginning your project.**

**Seriously. Read this entire file *before* starting.**

## Table of Contents

* [Course-Specific Learning Outcomes](#course-specific-learning-outcomes)
* [Academic Honesty](#academic-honesty)
* [Updates](#updates)
* [Project Description](#project-description)
* [Project Requirements & Grading](#project-requirements--grading)
  * [Functional Requirements](#functional-requirements)
  * [Non-Functional Requirements](#non-functional-requirements)
  * [Absolute Requirements](#absolute-requirements)
* [How to Download the Project](#how-to-download-the-project)
* [Submission Instructions](#submission-instructions)
* [Appendix - Suggested Checklist](#appendix---suggested-checklist)
* [Appendix - FAQ](#appendix---faq)

## Course-Specific Learning Outcomes

* **LO1.c:** Create and modify text files and source code using a powerful terminal-based text editor such as Emacs or Vi.
* **LO1.d:** Use shell commands to compile new and existing software solutions that are organized into multi-level
  packages and have external dependencies.
* **LO2.a:** (Partial) Identify redundancy in a set of classes and interfaces, then refactor using inheritance and polymorphism
  to emphasize code reuse.
* **LO2.b:** Define, throw, and propagate exceptions appropriately in a software solution.
* **LO2.d:** Implement new generic methods, interfaces, and classes in a software solution.
* **LO2.e:** Utilize existing generic methods, interfaces, and classes in a software solution.
* **LO3.a:** Create and update source code that adheres to established style guidelines.
* **LO3.b:** Create class, interface, method, and inline documentation that satisfies a set of requirements.
* **LO4.a:** Design, create and use interfaces in a software solution.
* **LO4.b:** Utilize interface-based polymorphism in a software solution.
* **LO4.c:** (Partial) Design, create and use inheritance relationships in a software solution.
* **LO7.c:** Use common abstract data types and structures, including lists, queues, arrays, and stacks in solving
  typical problems.

## Academic Honesty

**You agree to the Academic Honesty policy as outlined in the course syllabus.**
In accordance with this notice, I must caution you **not** to
fork this repository on GitHub if you have an account. Doing so will more than
likely make your copy of the project publicly visible. Please follow the instructions contained
in the [How to Download the Project](#how-to-download-the-project)
section below in order to do your development on odin. Furthermore, you must adhere
to the copyright notice and licensing information at the bottom of this document.

## Updates

If there has been an update and you have already cloned the project to Odin,
then you can update your copy of the project using the <code>$ git pull</code>
command while inside of your project directory.

## Project Description

In this project, you will be providing two different implementations of
an `UrgencyQueue` interface, which defines different operations that one
should be able to do with a queue of items ordered by their urgency. 

## UPDATE Paragraph - Make consistent with the Javadoc

A list is simply an object that represents
an ordered collection of elements. The list implementation can decide how the
elements are stored internally so long as users are able to interact with
those elements via the methods defined in the interface. In this way, a list
is an example of an *abstract data type* (ADT). To put it another way: while
the implementor needs to understand the specific details of the implementation
(in order to write the code to make it happen), the user of a list does not.
The users simply interact with objects of the list implementation through
the methods defined in the interface.

Each implementation of the `UrgencyQueue` interface will be a concrete class with specific functional
and non-functional requirements. These classes need to implement `UrgencyQueue` via a common abstract
parent class.

For this project, you will *NOT* have access to the `.java` files for the
interface. Instead, you will have access to the generated API documentation
for the [`UrgencyQueue` interface](https://webwork.cs.uga.edu/~mepcott/cs1302-urgency-queue/)(may require VPN connection to view).
Implementors should make sure that each method functions or behaves as described
by the interface's API documentation.

Implementors are always free to implement additional methods in addition
to the ones defined by the interface. However, they should not assume that
users (e.g., graders) will use these additional methods (even if declared with
`public` visibility), since they are not defined in the interface. These additional
methods may help avoid redundancy and promote code reuse within an implementation.

Based on discussions with past students, we have prepared a
[Suggested Checklist](#appendix---suggested-checklist) section in the Appendices which
contains some suggestions on how to work through the project from start to finish.

### Required Prerequisite Reading

* [1302 Generic Methods Reading](https://github.com/cs1302uga/cs1302-tutorials/blob/alsi/generics/generic-methods/generic-methods.md)
* [1302 Lambda Expressions Reading](https://github.com/cs1302uga/cs1302-tutorials/blob/alsi/lambda/lambda.rst)
* [`java.util.function.Predicate` Interface Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/function/Predicate.html)
* [`java.util.function.Consumer` Interface Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/function/Consumer.html)

## Project Requirements & Grading

This assignment is worth 100 points. The lowest possible grade is 0, and the
highest possible grade is 110 (due to extra credit).

### Functional Requirements

## UPDATE - include that they shouldn't modify the parts of the code that were given (class declarations/constructor signatures)
## They have to implement: GenNode, BaseLinkedUrgencyList, LinkedUrgencyList, CustomLinkedUrgencyList

A functional requirement is *added* to your point total if satisfied.
There will be no partial credit given for visual inspection of your code.
Points are assigned for each test case that executes properly.

For this project, you are required to create two different classes that
implement the same interface via a common abstract parent. While the specific
details are listed later in this document, the following diagram illustrates the
general relationship between your classes and the interface. The package `cs1302.adt`
is provided for you in the `cs1302-str-list.jar` file which is included in the download for the
project (details later). You do not have access to the source
code for classes in `cs1302.adt`. However, you do have access to the _byte code_ and the API
documentation website. You will need to use both `StringList` and `Node` in your code since `BaseStringList`
depends on `StringList` (it implements it) and `LinkedStringList` depends on `Node`.

<img alt="UML Diagram" src="ProjectDiagram.svg" align="center">

The specific requirements for each class are presented below (See the [Suggested Checklist](#appendix---suggested-checklist)
for the suggested order of implementation).

* **`BaseStringList`:** Create the abstract `cs1302.p2.BaseStringList` class such that it properly
  implements a subset of the abstract methods of `StringList`. Since `BaseStringList` is abstract, it is
  not mandatory to implement all methods of `StringList` within this class. The exact list of methods this class
  must implement are listed in the method section for `BaseStringList` in the provided UML diagram above.
  Remember, since `BaseStringList` is an abstract parent to both `ArrayStringList` and `LinkedStringList`,
  its methods must be implemented without reference to the underlying data structure. In other words,
  **within `BaseStringList`, you cannot use arrays or nodes**. The code contained in this class must be
  general enough to work with both.

  * **Note:** The methods that are listed in the UML diagram in `BaseStringList` must be implemented
    in that class. You are not allowed to move any of them into `ArrayStringList` or `LinkedStringList`.
    You may, however, find that you can more one or more methods from `ArrayStringList` and `LinkedStringList`
    up into `BaseStringList`. Moving methods up is allowed. In fact, it is encouraged. Any method that you can
    move up only has to be written once! However, accomplishing this will require some thought. We hope that
    all of you spend some time trying to ensure that `ArrayStringList` and `LinkedStringList` only contain the
    methods that absolutely need to be implemented in the child classes!

* **`ArrayStringList`:** Create the `cs1302.p2.ArrayStringList` class such
  that it properly extends `cs1302.p2.BaseStringList` and fully implements
  the `cs1302.adt.StringList` interface with additional requirements listed below.

  * You must explicitly define and document a default constructor for this class.
    The initial size of an `ArrayStringList` is `0` regardless of the list's
    underlying storage--remember, the list's internal storage and the list
    itself are two different things. Here is the signature:

    ```java
    public ArrayStringList();
    ```

<!--  * You must explicitly define and document a copy constructor for this class.
    It should make the new list a deep copy of the other list. Therefore, the initial
    size and element values of the new list should be the other list. The other
    list can be any implementation of the `StringList` interface. Here is
    the signature:

    ```java
    public ArrayStringList(StringList other);
    ```
-->

  * Over the lifetime of an `ArrayStringList` object, its internal storage may
    change in order to accomodate more list elements. When your code increases
    the size of an `ArrayStringList` object's internal array storage,
    **you should actively avoid: i) increasing the array size by one; and ii)
    doubling the size of the array.** Increasing by one is wasteful as it requires making
    a new array and copying over all elements every time an item is added. Doubling the size
    of the array may be wasteful at large sizes as there may be many indeces that contain `null`.
    Somewhere in between is more reasonable (increasing by 50%? increasing by 25%? We'll leave
    the details up to you). Furthermore, **you should not set the initial array size to `0` or to the
    largest number that is allowed.**

  * There is a requirement related to this class's storage included
    in the [Absolute Requirements](#absolute-requirements) section.

* **`LinkedStringList`:** Create the `cs1302.p2.LinkedStringList` class such
  that it properly extends `cs1302.p2.BaseStringList` and fully implements
  the `cs1302.adt.StringList` interface with additional requirements listed below.

  * You must explicitly define and document a default constructor for this class.
    The initial size of a `LinkedStringList` is `0` regardless of the list's
    underlying storage--remember, the list's internal storage and the list
    itself are two different things. Here is the signature:

    ```java
    public LinkedStringList();
    ```
        
  * There is a requirement related to this class's storage included
    in the [Absolute Requirements](#absolute-requirements) section.

* **(100 points) Test Cases**: The bulk of this project will be graded
  based on 50 or more test cases, each worth the same amount of points.
  This is the same as someone using the classes you wrote based purely on
  the interface definitions. If you implement the interface correctly,
  then you should pass the associated test cases.

### Non-Functional Requirements

##UPDATE
A non-functional requirement is *subtracted* from your point total if
not satisfied. In order to emphasize the importance of these requirements,
non-compliance results in the full point amount being subtracted from your
point total. That is, they are all or nothing.

* **(0 points) [RECOMMENDED] No Static Variables:** Use of static variables
  is not appropriate for this assignment. However, static constants are
  perfectly fine.
  
  * **(20 points) Code Style Guidelines<a id="style"/>:** You should be consistent with the style
  aspect of your code in order to promote readability. Every `.java` file that
  you include as part of your submission for this project must be in valid style
  as defined in the [CS1302 Code Style Guide](https://github.com/cs1302uga/cs1302-styleguide).
  All of the individual code style guidelines listed in that document are part
  of this single non-functional requirement. If `check1302` on Odin reports any
  style volatons for your submission, then 5 points will be subtracted from your
  earned point total **for each violation**, up to a maximum deduction of 20 points.

  **NOTE:** The [CS1302 Code Style Guide](https://github.com/cs1302uga/cs1302-styleguide)
  includes instructions on how to use the `check1302` program to check
  your code for compliance on Odin.
  
  * **In-line Documentation (10 points):** Code blocks should be adequately documented
  using in-line comments. With in-line comments, you should explain tricky, large, complicated,
  or confusing blocks of code. This is especially necessary whenever a block of code
  is not immediately understood by a reader (e.g., yourself or the grader). You might also
  include information that someone reading your code would need to know but not someone using it
  (that is more appropriate for a Javadoc comment). A good heuristic for this: if you can imagine that,
  after six months, you might not be able to tell in under a few seconds what a code block is doing,
  then then you probably need to write some in-line comments.

### Absolute Requirements

##UPDATE

An absolute requirement is similar to a non-functional requirement, except that violating
it will result in an immediate zero for the assignment. In many cases, a violation
will prevent the graders from evaluating your functional requirements. No attempts will be
made to modify your submission to evaluate other requirements.

* **Project Directory Structure:** <a id="struct"/>The location of the default
  package for the source code should be a direct subdirectory of
  `cs1302-str-list` called `src`. When the project is compiled,
  the `-d` option should be used with `javac` to make the default package
  for compiled code a direct subdirectory of `cs1302-str-list`
  called `bin`.

  If you follow this structure, then you would type the following to compile
  `BaseStringList.java` to the `bin` directory, assuming you are in the top-level project
  directory `cs1302-str-list`:

  ```
  $ javac -d bin -cp cs1302-str-list.jar src/cs1302/p2/BaseStringList.java
  ```

  Remember, when you compile `.java` files individually, there might be
  dependencies between the files. In such cases, the order in which you
  compile the code matters. Also, if more than one default package is needed
  (e.g., `cs1302-str-list.jar` and some other directory like `bin`), then a colon `:`
  can be used to separate each path in a list of multiple paths supplied
  to `-cp` (e.g., `-cp cs1302-str-list.jar:bin`). Since `ArrayStringList` and `LinkedStringList`
  depend on files in `cs1302-str-list.jar` and `BaseStringList` (in `bin`), we need
  both to be on the classpath as follows:

  ```
  $ javac -cp bin:cs1302-str-list.jar -d bin src/cs1302/p2/ArrayStringList.java
  $ javac -cp bin:cs1302-str-list.jar -d bin src/cs1302/p2/LinkedStringList.java
  ```

* __Development Environment:__ This project must *must compile and run* 
  correctly on Odin using the specific version of Java enabled by the 
  CSCI 1302 shell profile.

  If you decide to introduce additional `.java` files into your project,
  then they are expected to fulfill all non-functional and absolute requirements,
  even if the main parts of the project do not use them. You may assume
  graders will compile your source code in an order that satisfies
  compilation dependencies. **You should remove any `.java` files that you
  do not need before submission.**

* **`cs1302.p2.ArrayStringList` Storage Requirement:**
  You must use a basic Java array for this class's storage. The initial
  size of the array does not have to be the same size as the initial size
  of the list. Whenever the size of the list is about to exceed the size
  of its array, the list should dynamically allocate a new array of a larger
  size and copy the contents over--please consider writing and documenting
  a private support method to do this. If you use Java's `java.util.ArrayList`
  class or something similar (e.g., a class that implements `java.util.Collection`), 
  then that will result in an immediate violation
  of this non-functional requirement, regardless of any use of a regular
  array elsewhere in the class. This requirement also prohibits any use of
  third-party implementations of list or list-like interfaces.

* **`cs1302.p2.LinkedStringList` Storage Requirement:**
  You must use a sequence of `cs1302.adt.StringList.Node` objects
  for this class's storage. Unlike the array-based implementation in
  `ArrayStringList`, this type of storage is not limited to the number
  of elements that can fit into an array (because there is no underlying array).
  Instead, it's limited only by the available memory for the Java program
  using the `LinkedStringList` object.
  If you use Java's `java.util.LinkedList` class or something similar 
  (e.g., a class that implements `java.util.Collection`), then that
  will result in an immediate violation of this non-functional requirement,
  regardless of any use of any `Node` objects elsewhere in the class.
  This requirement also prohibits any use of third-party implementations
  of list or list-like interfaces.

* **No Implementation Dependencies:** <a id="no-impl-deps"/>You are not permitted to use one
  implementation of the `StringList` interface in another implementation.
  For example, you cannot use the `ArrayStringList` class inside of your
  `LinkedStringList` class or vise versa. Additionally, `BaseStringList`
  cannot depend on either of the `StringList` implementations, however,
  it can (and should) depend on the `StringList` interface itself. If you have any
  questions about this, then please ask your instructor.

  You can check this using the `jdeps` tool. Inspect the output of
  the command below after everything is compiled. You don't want to see
  `ArrayStringList` pointing to `LinkedStringList` or vise-versa.

  ```
  $ jdeps -v -cp cs1302-str-list.jar bin
  ```

* **No `java.util.Arrays` Dependency:** <a id="no-java-util-arrays"/>You
  are also NOT allowed to use the `java.util.Arrays` class. For more
  information on why, please read [this FAQ item](#java-util-Arrays). You
  can also check for the presence of this dependency using `jdeps` as described
  in an earlier requirement -- you don't want to see `java.util.Arrays` anywhere
  in the output.

  **NOTE:** The `System.arraycopy` method is in the `System` class and not
  `java.util.Arrays`; however, its use is frowned upon for the same reasons
  that we provide [here](#java-util-Arrays) for the `java.util.Arrays` class.

### Grading

This project will be graded using unit tests, none of which will be made
available before the project deadline. You can test your implementations yourself
via interface polymorphism.

## How to Download the Project

##UPDATE

On Odin, execute the following terminal command in order to download the project
files into sub-directory within your present working directory:

```
$ git clone --depth 1 https://github.com/cs1302uga/cs1302-urgency-queue.git
```

This should create a directory called `cs1302-urgency-queue` in
your present working directory that contains a clone of the
project's respository. Take a look around.

If any updates to the project files are announced by your instructor, you can
merge those changes into your copy by changing into your project's directory
on Odin and issuing the following terminal command:

```
$ git pull
```

If you have any problems with these download procedures, then please contact
your instructor.

## ListADT Testing

##UPDATE

You are responsible for implementing test cases to test your `ArrayStringList` and `LinkedStringList` classes. There are
a few examples of test cases provided in the checklist and FAQ sections below.

Additionally, we have provided an oracle class (`cs1302.oracle.OracleStringList`) that you can instantiate and use
in your driver program. The oracle will allow you to run test cases that you write using a trusted implementation of
`StringList` so you can compare the oracle output to the output of your `StringList` implementations.

Here is an example `Driver` class that us set up to run the test cases with all three implementation. You would just need
to uncomment the implementation you wanted to use:

```java
package cs1302.p2;

import cs1302.adt.StringList;
import cs1302.oracle.OracleStringList;

public class Driver {
    public static void main(String[] args) {
        StringList sl;

        // To test what the output is for your code, you can use ArrayStringList or LinkedStringList:
	// sl = new OracleStringList(); // uncomment to run the test cases using the oracle.
	// sl = new ArrayStringList(); // uncomment to run the test cases using your array implementation
	// sl = new LinkedStringList(); // uncomment to run the test cases using your linked implementation.

        // Test isEmpty on an empty list
        if (sl.isEmpty()) {
            System.out.println("isEmpty: Test Passed");
        } else {
            System.out.println("isEmpty: Test Failed");
            System.exit(0);
        } // if

	// more calls to test methods down here...
    } // main

} // Driver
```

We have also provided images showing how various method calls on both `ArrayStringList` and `LinkedStringList`
objects from a driver program will impact the underlying instance variables of each. You can find those examples
in the [ADT and Links Reading](https://github.com/cs1302uga/cs1302-tutorials/blob/alsi/adt-and-links/adt-and-links.md#list-adt---examples-with-both-implementations).

## Submission Instructions

##UPDATE

You will be submitting your project via Odin before the deadline indicated
near the top of this document. Make sure your project files
are on `odin.cs.uga.edu`. Change into the parent directory of your
project directory. If you've followed the instructions provided in this document,
then the name of your project directory is likely `cs1302-str-list`.
While in your project's parent directory, execute the following command:

```
$ check1302 cs1302-urgency-queue/src
```

If there are style guide violations, then fix them and retest your code! Once
you have no style guide violations, you can submit using the following command:

```
$ submit cs1302-urgency-queue csci-1302
```

If you have any problems submitting your project then please send a private
post to your instructor via the course Piazza as soon as possible. However,
creating a post about something like this the day or night the project is due
is probably not the best idea.

# Appendix - Project Checklist

##UPDATE

To help you with planning out this project, here are some suggested steps you
can take that your instructors believe will help you complete the project more
easily. Some of the items in this checklist may not make sense until you have
read the entire project description, including the [FAQ](#appendix---faq).
These steps are suggesions and, therefore, do not constitute an exhaustive list
of steps that you may need to take to complete the project.

1. Preparation (Suggested Deadline: Tuesday, Mar 14th):

   - [ ] Read through the entire project description, including the appendices,
         and **write down questions as you go**.
   - [ ] Read through the entire API Documentation for the classes in the `cs1302.adt` package linked below:
   - [ ] [`cs1302.adt.Node`](https://webwork.cs.uga.edu/~mepcott/cs1302-str-list/cs1302/adt/Node.html)
   - [ ] [`cs1302.adt.StringList`](https://webwork.cs.uga.edu/~mepcott/cs1302-str-list/cs1302/adt/StringList.html)
	 * Be sure to read everything up to the "Method Details" section. That section is important but will make more
	   sense later - you will want to reference it when you are ready to start writing code.
	 * Carefully trace through any code examples that are given. These will help you understand how your
	   class will be used. In the examples, the object created is of type `OracleStringList`. When you are
	   testing your code, you will replace `OracleStringList` with `ArrayStringList` and `LinkedStringList`.
   - [ ] Read both of them again! This time, you may be able to answer some of your own questions.

1. Before you write any code (Suggested Deadline: Wednesday, Mar 15th):

   - [ ] For each method in the interface, make sure you understand how to call each method and what a user
         expects to happen when calling that method on an object of an implementing class. For example, what
	 would occur if the driver program executed the line `sl.contains(1, "end")` on a preexisting object of
	 a class that implements `StringList`? Use the code examples in the documentation to get you started.
   - [ ] For each method in the interface, try to write down what you
         think the basic steps need to be in order to produce the desired outcome.
	 * Try to keep it high level. If the steps that you write down sound like they
	   can be accomplished with another method, then replace those steps with
	   a note to refer to that method. If that other method does not yet exist,
	   then you might introduce that as a _private_ or _protected_ helper method.
	   Using existing methods can greatly cut down the amount of code you need
	   to write and will minimize the number of bugs in your code.
	 * Here is an example: If there are multiple methods that have a step that
	   gets an element from a specific index in the list, then you might have
	   that method call the list's [`get`](https://webwork.cs.uga.edu/~mepcott/cs1302-str-list/cs1302/adt/StringList.html#get(int))(may require VPN
	   connection to view) 
	   method instead of directly accessing the underlying data structure (array or linked list) which
	   might require writing the same loop multiple times.
	 * Consider drawing out diagrams similar to the diagrams to the provided
	 [Examples](https://github.com/cs1302uga/cs1302-tutorials/blob/alsi/adt-and-links/adt-and-links.md#list-adt---examples-with-both-implementations).
   - [ ] Based on the previous suggestion, draw out what the method dependencies
         are for each method (i.e., what method depends on what). If you notice
	 any circular dependencies, then those should be eliminated.
	 * The methods that don't depend on other methods are good candidates to
	   start with in the next phase of your development. We'll call these the
	   independent methods.

1. Prepare to implement the methods (Suggested Deadline: Friday, Mar 17th):

   - [ ] Create the `.java` files for each implementing class and the common parent (`BaseStringList`) and make sure all classes
         are in the correct package and all entities have the proper visibility. For each file:
	 * Write the class signature (top-level declaration) and all of the method signatures (member-level declarations). Remember, in the child
	   classes (`ArrayStringList` and `LinkedStringList`), you don't need to include method signatures for inherited methods that aren't overridden
	   in the child classes.
	 * In the body of each method, throw an `UnsupportedOperationException` as suggested
	   in [the FAQ](#faq-uoe). **Do not attempt to actually implement the method yet.**
	 * Run `checkstyle` to make sure that you're off to a good start, style-wise.
	   **Yes, this includes Javadoc comments;** read [this](https://github.com/cs1302uga/cs1302-styleguide/blob/master/README.md#missingjavadocmethod)
	   for a recommended way to handle the inherited documentation.
	 * Make sure the files compile, even though they're not really implemented yet. We recommend making a compile script to simplify
	   compilation in the future. This will make it easier to test/debug your code.
   - [ ] Create a class called `cs1302.test.ListTester` and add any code snippets found in the API documentation for the `cs1302.adt` package.
         Place each code snippet in its own method with an appropriate name. Then, create a `main` method in `ListTester` that calls
	 the methods you just created. If everything is set up properly, all of the tests should pass because `OracleStringList` is a working
	 implementation of the `StringList` interface. Now, you will have your testing environment set up and you will be able to 
	 seamlessly plug in your implementations of `StringList` to test the functionality.
	 
   - [ ] If you haven't already done so, make a script to compile all of the classes and run your `ListTester` class. At this point, you will
         likely see an `UnsupportedOperationException`. That's okay. Those will go away as we start implementing the method bodies.
   
   At this point, you should have the complete environment set up with templates for each class you will implement (`ArrayStringList` and
   `LinkedStringList`) along with a simple tester program. If you take the first three checkpoints seriously, then you will be able to:
      * write less code for each method and over all;
      * identify and fix bugs faster;
      * not have to go back and fix as many style errors and/or comments; and
      * have a better understanding of how your class works.

1. <a id="tests"/>Start by implementing a few methods in `BaseStringList` (Suggested Deadline: Monday, Mar 20).
   - [ ] Begin with `size` and `isEmpty`. Since these methods are inherited by the children, we won't need to write
     them in `ArrayStringList` or `LinkedStringList`! Now, go ahead and add methods called `testIsEmpty()` and `testSize()` to your
     `ListTester` class and call them from the `main` method. The code for these methods should look something like the code below:

     ```java
     public static void testIsEmpty() {
        StringList sl = new ArrayStringList();

        // Testing isEmpty on an empty list
        if (sl.isEmpty()) {
            System.out.println("isEmpty: Test Passed");
        } else {
            System.out.println("isEmpty: Test Failed");
            System.exit(0);
        } // if
     } // testIsEmpty

     public static void testSize() {
        StringList sl = new ArrayStringList();
        // Testing size on an empty list
        if (sl.size() == 0) {
            System.out.println("size: Test Passed");
        } else {
            System.out.println("size: Test Failed");
            System.exit(0);
        } // if
     } // testSize
     ```

     If you want to avoid rewriting the above methods for `LinkedStringList`, think about how you can modify the input parameters and
     use polymorphism to avoid duplicating this code.
     
     If you've done everything properly so far, this should run and print two "Test Passed" messages to the console. The code above contains two
     possible test cases that we could run when grading your program. Your `ListTester` class should already contain simple tests for some of the
     other methods in the `StringList` interface.

     At this point, you should have the basic foundation for your program done including skeleton code, a compile script, and a good understanding
     of what all of the methods do (and how they do them). As you move forward, we
     recommend completing the methods in the order described below. 
     
     **Make sure to do one method at a time, fully test it, run `check1302`, and do a proper `git commit` to save your modifications before moving to the next method.**

1. Implement the methods in the order they are listed below (Suggested Deadline: Wednesday, Mar 22nd)
   **check the method detail section for hints and more details about each method before implementing**
   
   * `BaseStringList`: constructor, `size`, and `isEmpty`
   * `ArrayStringList`: constructor, `add`, and `get`
   * `BaseStringList`: `makeString` and `toString`

   Now, you can improve your `ListTester` class by creating objects of type `ArrayStringList`, adding items to it, and printing the list to the console!
   
   When testing, you should rerun all previous tests and make sure they still work. 
   This iterative process of testing code is sometimes called _regression testing_. 
   You may need to go back and fix a bug in a method you have already written.
   
   * `BaseStringList`: `contains` and `add`
   * `ArrayStringList`: complete the remaining methods in the order they are presented in the UML diagram above. Be sure to compile and test one at a time.

1. Implement `LinkedStringList` (Suggested Deadline: Thursday, Mar 23rd):
   - [ ] Write the code for the default constructor. You will likely need to introduce
         instance variables into the class to keep track of object state. This
	 class stores its elements internally in a way that is different from the other class.
   - [ ] Complete the remaining methods in the order they are presented in the UML diagram above. 
         * When it comes time to write tests, if your test methods operate on a `StringList`, then
	   there is probably very little, if any, changes that you need to make
	   in order to test the methods in this class.
	 * Don't forget to `git commit` whenever you get something to work.
	 * Don't skip using `checkstyle`. If you've been using it as recommended,
	   you should start to notice how many fewer fixes you're having to make
	   to keep your code in valid style.

1. Implement `BaseStringList` (Suggested Deadline: Friday, Mar 24th):
   - [ ] Now that you have `ArrayStringList` and `LinkedStringList` working, it will likely be easier to understand how to
      write the remaining methods in `BaseStringList`. While writing each method, be sure to use the
      methods you implemented in the children where appropriate. The beauty of having the abstract parent is that we only have to write
      these methods once and they will work on objects of any child type! Remember, the parent class does not need to understand
      the underlying data structure (array) in this case. It just needs to call the appropriate methods to
      implement its actions.
   - [ ] Test, run `checkstyle`, and commit often while working on these methods.

1. Final Run-through (Suggested Deadline: Monday, Mar 27th):
   - [ ] Thoroughly test all of your methods on objects of both `ArrayStringList` and `LinkedStringList`.
   - [ ] Remember to run `check1302` often and commit changes as you fix bugs.
   - [ ] Your driver program does not need to be submitted. If you choose to submit it, you must make sure it compiles and passes
         the checkstyle audit.

**We very much appreciate any and all feedback you might have for this section.**
Please don't hesitate to send us a private piazza message with suggestions on
how to make it better after you complete your project.

# Appendix - FAQ

Below are some frequently asked questions related to this project.

1. **<a id="faq-uoe"/>Can I technically implement the methods first before I implement them correctly?**

   You may wish to write out the method signatures for the methods you are
   implementing from the interface with empty bodies in an attempt to get started.
   You will quickly discover that the methods that have a non-void return
   value actually need to return something. If you don't put a return statement,
   then this complicates trying to compile and test one method at a time.

   It is possible to _temporarily_ include a `throw` statement in the method
   until you commit to writing the return statement. I reccommend throwing
   an instance of [`UnsupportedOperationException`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/UnsupportedOperationException.html)
   if you choose to do this. For example, you might write something like this for the `get(int)`
   method:

   ```java
   public String get(int index) {
       throw new UnsupportedOperationException("not yet implemented");
   } // get
   ```

1. **<a id="test-exceptions"/>How can I test that my methods throw the exceptions?**

   In this project, you're not explicitly tasked with handling exceptions; instead, you're
   tasked with making sure that they happen when they're supposed to happen. When testing
   your methods, you will want to make sure that one of things you check is that your
   methods do, in fact, throw the exceptions when they're expected to per the API documentation.

   Here is an example of a test method you might write to test whether or not your `add(int, String)`
   method thows an `IndexOutOfBoundsException` when a negative value is supplied for the `index`
   parameter:

   ```java
   public static void testAddNegative(StringList list) {
       System.out.print("testAddNegative: ");
       try {
           list.add(-5, "hello");
           System.out.println("FAIL: expected IOOB; however, no exception was encountered");
       } catch (IndexOutOfBoundsException ioob) {
           System.out.println("PASS: expected IOOB; IOOB was encountered");
       } catch (Throwable e) {
           System.out.println("FAIL: expected IOOB, but got " + e);
       } // try
   } // testAddNegative
   ```

   In a driver class that you create for testing, you might write something similar to
   the following in a method somewhere:

   ```java
   System.out.println("ARRAY STRING LIST TESTS");
   StringList asl = new ArrayStringList();
   testAddNegative(asl);

   System.out.println("LINKED STRING LIST TESTS");
   StringList lsl = new LinkedStringList();
   testAddNegative(lsl);
   ```

   We reccommend that you further break up your test code into methods in order to
   reduce the redundancy you see in the example above. Your test code does not need
   to look like what we provided; it's just an illustrative example.

1. **What is `cs1302-str-list.jar`?**

   In Java, `.jar` files are Java™ Archive (JAR) files that bundle multiple files into a single
   compressed file. Typically a JAR file contains the package directories and `.class` files
   for a library. This is just like the `bin` directory that you are used to, except it's all
   bundled into a single file. For example, the `cs1302-str-list.jar` file contains the package directories
   and `.class` files for `cs1302.adt.StringList`. If you are in the same directory as
   `cs1302-str-list.jar`, then you can use the following command to take peek into the archive:

   ```
   $ jar -tf cs1302-str-list.jar
   ```

   You should notice that the top-level directory in the JAR file is `cs1302`, which means that
   the JAR file itself can serve as the default package for compiled code--this is why we
   use with `-cp` in examples given elsewhere in this project description.

1. **Why doesn't `{@inheritDoc}` seem to work (and other Javadoc-related questions)?**

   It doesn't work because the `javadoc` tool requires the source code in order to automatically
   pull the text of comments from supertypes when applicable. **We did not provide you with the
   source code for the interface,** so this is working as intended.

   <!--
   **However,** you can use the
   `javadoc1302` command (only available on Odin) along with the `--StringList.java` option
   instead of the usual `javadoc` command to give the Javadoc tool access to the source code
   it needs to inherit the documentation.

   An example of the `javadoc1302` command is provided below; see the note below the example if you
   have problems running the command. The `USUAL_JAVADOC_OPTIONS_HERE` part might be replaced with
   options like `-d doc`, `-sourcepath src`, `-subpackages cs1302`, etc., as usual. Here is the
   example:

   ```
   $ javadoc1302 --StringList.java \
     USUAL_JAVADOC_OPTIONS_HERE \
     -classpath cs1302-str-list.jar \
     -link https://docs.oracle.com/en/java/javase/17/docs/api/
   ```

   **NOTE:** The command presented above is a mult-line command since it's so long. There is a single
   space before the `\` at the end of the first two lines. When typing this out, you should type a
   single space followed by `\`, then immediately press your `RET` key to continue to the next line.
   If typed correctly, you will see a `>` on the next line and you can continue typing the command.
   The `\` and `>` characters will NOT be part of the command when you do your final press of the
   `RET` key.

   //-->

   **SUGGESTION:** <a id="javadoc-comments"> **Do NOT manually copy the entire comment and parameter details from the API website.**
   Instead, include a summary sentence and `{@inheritDoc}` to make it clear to readers of the source
   code that your intent is to inherit the documentation. An example of this can be found in the
   style guide, [here](https://github.com/cs1302uga/cs1302-styleguide#missingjavadocmethod).

1. **<a id="java-util-Arrays"/>Is the `java.util.Arrays` class allowed?**

   **No**, this violates [a requirement](#no-java-util-arrays); instead, you should write your
   own version of the method you want to use. Most of the methods that you think you might need
   from that class can be written in 6 lines of code or less (often much less), and writing your
   own version will serve as some much needed practice.

Have a question? Please post it on the course Piazza.

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>

