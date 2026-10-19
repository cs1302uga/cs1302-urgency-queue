#!/bin/bash

JAVAC_OPTIONS="--release 25 -g -d bin -cp cs1302-urgency-queue.jar:bin -Xlint:rawtypes -Xlint:unchecked -Werror"

JAVADOC_OPTIONS="-d doc -cp cs1302-urgency-queue.jar:bin -sourcepath src -subpackages cs1302 -link https://cs1302uga.github.io/cs1302-urgency-queue/"

set -e # exit on error
set -x # echo commands

rm -rf bin && mkdir bin
rm -rf doc && mkdir doc

javac ${JAVAC_OPTIONS} src/cs1302/p3/BaseLinkedUrgencyQueue.java
check1302 src/cs1302/p3/BaseLinkedUrgencyQueue.java

javac ${JAVAC_OPTIONS} src/cs1302/p3/LinkedUrgencyQueue.java
check1302 src/cs1302/p3/LinkedUrgencyQueue.java

javac ${JAVAC_OPTIONS} src/cs1302/p3/CustomLinkedUrgencyQueue.java
check1302 src/cs1302/p3/CustomLinkedUrgencyQueue.java

javac ${JAVAC_OPTIONS} src/cs1302/test/QueueTester.java
check1302 src/cs1302/test/QueueTester.java

javadoc ${JAVADOC_OPTIONS}
