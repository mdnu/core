# core

working through various codeservlets tutorials.

current: core-java se8.

core-java se8 table of contents:

  1. basic syntax
    * FlipCoins1 - program that flips a coin 10 times, saying "heads" or "tails" each time.
    * FlipCoins2 - program that flips a coin N times, where N is specified by the user.
    * FourNums - creates an array of four random numbers from the unit interval. uses one-step array allocation.
    * HundredNums - creates an array of a hundred random numbers from the unit interval. uses two-step array allocation.
    * NumArgs - command-line program which outputs the # of arguments provided by the user.
    * ReverseArgs - command-line program which outputs the arguments provided by the user in reverse order.
  2. oop basics
    * Circle - a circle model class.
    * CircleTest - a test class for Circle model class.
    * HundredCircles - a program which initializes a hundred Circle objects of random specifications and outputs the largest area, smallest area and sum of all areas.
    * Rectangle - a rectangle model class.
    * RectangleTest - a test class for Rectangle model class.
    * Square - a square model class
    * SquareTest - a test class for Square model class.
  3. oop capabilities
    * Circle - updates the circle model class with getters/setters and public methods.
    * CircleTest - a test class for the new Circle model class.
    * Rectangle - updates the rectangle model class with getters/setters and public methods.
    * RectangleTest - a test class for the new Rectangle model class.
    * Square - updates the square model class with getters/setters and public methods.
    * SquareTest - a test class for the new Square model class.
  4. oop advanced
    * enums
      * Coin - a coin <b>enum</b> with instances named HEADS and TAILS. contains a static 'flip' method that returns Coin.HEADS and Coin.TAILS with equal probability.
      * CoinTest - a test class for coin enum.
    * sales
      * Sellable - a public <b>interface</b> representing sellable items. defines getCost() method. contains static methods which calculates the total cost of, and the cheapest item in, an array of sellable objects.
      * CarSale - a model class to represent the sale of a car. implements Sellable interface.
      * CarSaleTest - a test class for CarSale model class.
      * PaperclipSale - a model class to represent the sale of paperclips. implements Sellable interface.
      * PaperclipSaleTest - a test class for PaperclipSale model class.
      * SalesTest - a test class for the 'Sellable' public interface.
  5. simple java graphics - covers basic <b>AWT</b> and <b>Swing</b>.
    * CircleFrame - <b>extends</b> JFrame. creates a black window that draws five hundred small white circles at random locations.
    * CirclePanel - extends JPanel. creates a black window that draws five hundred small white circles at random locations.
    * LainFrame - extends JFrame. imports an image in project folder and creates a popup window which draws the image.
    * LainPanel - extends JPanel. imports an image in project folder and creates a popup window which draws the image.
    * TiocTacToeFrame1 - extends JFrame. draws an empty tic tac toe board.
    * TicTacToePanel1 - extends JPanel. draws an empty tic tac toe board.
    * TicTacToeFrame2 - extends JFrame. draws an empty tic tac toe board. drawing code should not know the panel size ahead of time, instead uses getWidth and getHeight methods to compute size.
    * TicTacToePanel2 - extends JPanel. draws an empty tic tac toe board. drawing code should not know the panel size ahead of time, instead uses getWidth and getHeight methods to compute size.
  6. lists, maps and sets
    * shapes - used for CircleListTest below
      * Shape - a public interface representing any given Shape object.
      * Circle - a Circle model class which implements the Shape interface.
    * CircleListTest - makes a <b>List</b> of Circle objects then loops through it, printing out each area.
    * EmployeeTest - makes a <b>Map</b> which associates employee IDs with names.
    * NumbersMap - makes a Map which associates numbers with words in some language.
    * NumbersMapTest - tests the NumbersMap model class using french and english words.
    * ListPerformanceTest - a timing test which compares <b>ArrayList</b> and <b>LinkedList</b>.
  7. generic types, printf and misc
  8. unit testing with JUnit
  9. asynchronous event handling
  10. concurrent programming with Java threads
  11. parallel programming
  12. setting up Java 8
  13. lambdas I
  14. lambdas II
  15. lambdas III
  16. interfaces
  17. static and default methods
  18. lambdas IV
  19. streams I
  20. streams II
  21. streams III
  22. lambda methods for lists and maps
  23. file IO in Java 8
  24. network programming I - clients
  25. network programming II - servers
  26. network programming and object serialization
  27. graphics I - applets
  28. graphics II - AWT
  29. graphics III - layout managers
  30. graphics IV - 2D drawing
  31. graphics V - basic Swing
  32. graphics VI - advanced Swing and MVC
  33. graphics VII - multithreaded graphics and animation.
