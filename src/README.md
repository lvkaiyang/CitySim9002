IS2545 - DELIVERABLE 2: Unit Testing


When I was writting a code, the first problem was the structure I need to design. I modified a lot to build a good structure of the project.
Then I got a problem about generating a random number with constant seed. The way to make it change is announce a global vartiable to implement random number while calling .nextInt() .


When I was testing, I got a problem about mocking a class with a constructor having some parameters. I don't know how to inject the variables into the constructor even I tried using withSettings().useConstructor().OuterInstance(SomeClass)


I have seven test cases for the project. All of them are testing public method which should return some values to other methods once it's called
Three class with seven test cases are in the Test folder.
