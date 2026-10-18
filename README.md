# CSCI 1302 — Urgency Queue

The [Urgency Queue project description in the CSCI 1302 book](https://github.com/cs1302uga/cs1302-book/blob/main/source/_projects/cs1302-urgency/cs1302-urgency-index.rst)
is the authoritative description of the requirements, milestones, testing
workflow, and submission instructions. That page is currently an unreleased
draft; follow your instructor's announcement about when the project is assigned.

This repository contains the student starter files and
[`cs1302-urgency-queue.jar`](cs1302-urgency-queue.jar). The supplied API is described
on the [API documentation website](https://cs1302uga.github.io/cs1302-urgency-queue/).
Do not recreate the provided `cs1302.gen` or `cs1302.oracle` types.

After completing the Part 1 declarations, documentation, and stubs described in
the book, run these commands from the project directory:

```sh
./compile.sh
./test.sh
```

`compile.sh` removes old `bin/` and `doc/` outputs, compiles every Java source
under `src/` with strict raw-type and unchecked-warning checks, checks code style
with `check1302`, and regenerates API documentation. It targets Java 25 and
requires the CSCI 1302 shell profile on Odin. The initial class skeletons require the Part 1 additions
before they can compile.

`test.sh` runs that same verification, then runs `cs1302.test.QueueTester` against
the natural-order oracle by default. Use one of these modes to select a different
implementation without duplicating the shared test scenarios:

```sh
./test.sh oracle
./test.sh custom-oracle
./test.sh linked
./test.sh custom
```

The tester initially checks only that a new queue has size zero. Add the
substantive scenarios required by the book. Calls to unimplemented student
constructors or methods throw `UnsupportedOperationException`; that is expected
while those stubs remain and still counts as a failing test run.

Both scripts also support `--help` and `--version`. Create `SUBMISSION.md`
following the book's instructions.
