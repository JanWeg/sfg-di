# Dependency Injection Examples

This repository is for an example application built in my [Spring Framework 5 - Beginner to Guru](https://www.udemy.com/testing-spring-boot-beginner-to-guru/?couponCode=GITHUB_REPO) online course

I took the course and (while in lection thirty-something. I can recommend it without limmitation)


## What is it ...

In this section I learned about some different modes of injecting a dependeny. 

* Property-based: You have a public property where you _inject_ your service
* Setter-based: the property now has "private" visibility and one uses a "setter" Method to assign a service to it
* Constructor-based: the property is passed to the controller as an argument.

While the first two (Porperty- and Setter-based) bear some shortcommings. I like the C'tor based injection. As far as it
does not take to many arguments, I prefer it over the setter based approach. 


## Next Step
 
I considder marking the classes with appropriate Spring-stereotypes. 