# new4java8
Minimal project to implement static factories from java9 in java8

## Intro

Some of us can work with the latest version of java.

Some of us are ruled by corporate overlords that refuse to update anything. Unlucky people are still living
in a world without lambda expressions, ( and I've been told about some people living in a world without generics).

For people stuck with Java8 the world is not that bad, but we do envy some minor details from java9: The static 
factories for immutable implementations: 

    List.of(...)
    Set.of(...)
    Map.of(...)
    Map.ofEntries(...)

One popular alternative is google guava, but is sometimes too heavy and also has some tendency to break compatibility.

This is a simple project with just one class you can use to create list, set and maps 100% compatible with the ones for
Java9. Most of us basically copy-paste this code time and time again from project to project. This is slightly better.

No new classes are used, so List.of redirects to Collections.unmodifiableList and so on. There are checks in place
to make avid null elements, avoid duplicated elements for sets, etc.

The general idea is if somehow you manage to upgrade your project to Java9 or more, it will work exactly the same.


## Usage

To create an immutable list of n not null elements

    New.listOf(e1, e2 .... en)

To create an immutable set of n not null elements

    New.setOf(e1, e2 .... en)

To create an immutable map of n not null keys and n not null values

    New.mapOf(k1, v1, k2, v2 .... kn, vn)

To create an immutable entry of not null keys and not null value

    New.entry(k, v)

To create an immutable map of not null entries

    New.mapOfEntries(entry1, entry2, ... , entryn)


In every case the collection of 0, 1, 2, 3 elements are implemented exactly, for 4 or more I'm using varargs.
This is different from Java9, that has 10 exact implementations + varargs. That's because I'm lazy.

Implementations are probably less efficient that the ones in Java9, in both speed and memory. 



