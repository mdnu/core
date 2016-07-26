# core

working through various codeservlets tutorials.

<b>current</b>: core-java se8.

core-java se8 - table of contents:

  1. basic syntax (basicsyntax)
    * FlipCoins1 - program that flips a coin 10 times, saying "heads" or "tails" each time.
    * FlipCoins2 - program that flips a coin N times, where N is specified by the user.
    * FourNums - creates an array of four random numbers from the unit interval. uses one-step array allocation.
    * HundredNums - creates an array of a hundred random numbers from the unit interval. uses two-step array allocation.
    * NumArgs - command-line program which outputs the # of arguments provided by the user.
    * ReverseArgs - command-line program which outputs the arguments provided by the user in reverse order.
    
  2. oop basics (oopbasics)
    * Circle - a circle model class.
    * CircleTest - a test class for Circle model class.
    * HundredCircles - a program which initializes a hundred Circle objects of random specifications and outputs the largest area, smallest area and sum of all areas.
    * Rectangle - a rectangle model class.
    * RectangleTest - a test class for Rectangle model class.
    * Square - a square model class
    * SquareTest - a test class for Square model class.
    
  3. oop capabilities (oopmore)
    * Circle - updates the circle model class with getters/setters and public methods.
    * CircleTest - a test class for the new Circle model class.
    * Rectangle - updates the rectangle model class with getters/setters and public methods.
    * RectangleTest - a test class for the new Rectangle model class.
    * Square - updates the square model class with getters/setters and public methods.
    * SquareTest - a test class for the new Square model class.
    
  4. oop advanced (oopadv)
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
      
  5. simple java graphics - covers basic <b>AWT</b> and <b>Swing</b>. (simplegraphics)
    * CircleFrame - <b>extends</b> JFrame. creates a black window that draws five hundred small white circles at random locations.
    * CirclePanel - extends JPanel. creates a black window that draws five hundred small white circles at random locations.
    * LainFrame - extends JFrame. imports an image in project folder and creates a popup window which draws the image.
    * LainPanel - extends JPanel. imports an image in project folder and creates a popup window which draws the image.
    * TiocTacToeFrame1 - extends JFrame. draws an empty tic tac toe board.
    * TicTacToePanel1 - extends JPanel. draws an empty tic tac toe board.
    * TicTacToeFrame2 - extends JFrame. draws an empty tic tac toe board. drawing code should not know the panel size ahead of time, instead uses getWidth and getHeight methods to compute size.
    * TicTacToePanel2 - extends JPanel. draws an empty tic tac toe board. drawing code should not know the panel size ahead of time, instead uses getWidth and getHeight methods to compute size.
    
  6. lists, maps and sets (collections)
    * shapes - used for CircleListTest below
      * Shape - a public interface representing any given Shape object.
      * Circle - a Circle model class which implements the Shape interface.
    * CircleListTest - makes a <b>List</b> of Circle objects then loops through it, printing out each area.
    * EmployeeTest - makes a <b>Map</b> which associates employee IDs with names.
    * NumbersMap - makes a Map which associates numbers with words in some language.
    * NumbersMapTest - tests the NumbersMap model class using french and english words.
    * ListPerformanceTest - a timing test which compares <b>ArrayList</b> and <b>LinkedList</b>.
    
  7. generic types, printf and misc (generics)
	* EntryUtils - <b>generic type</b> exercise. has two static methods called "lastEntry" which takes in a List (Array) of arbitary objects and retrieves the last entry.
	* EntryUtilsTest - a test class for the EntryUtils class.
	* CircleListTestTwo - <b>printf</b> exercise. modify the CircleListTest class from earlier to have formatted outputs.
	* NumbersMapTwo - <b>varargs</b> exercise. modify the NumbersMap class from earlier to include a 'wordsForNumbers' method that takes in any # of ints and returns a String[] of matching associated words.
	* NumbersMapTwoTest - a test class for NumbersMapTwo. follows NumersMapTest template, but also tests the wordsForNumbers method.
	* CharUtils - copy of CharUtils class from lecture. has two methods 'padChars' 1 and 2, which takes some string and pads an initially empty string n-many times, where n is chosen by the user.
	* padCharPerformanceTest - a timing test to compare padChars1, which pads via String concatenation (O(n^2)) and padChars2, which pads via StringBuilder (O(n)).
	
  8. unit testing with <b>JUnit</b> (junit)
	* Utils	- has two static methods; 'calmString' which takes a String and outputs a new String with all instances of '!' removed, and 'calmAttendees' (read details in the class).
	* UtilsTest - performs JUnit testing for both methods in Utils.
	
  9. asynchronous event handling (eventhandling)
  	* Colour1Frame
		* Uses a separate class as mouse listener. 
		* Makes a popup window (JFrame) whose content pane (JPanel) toggles back and forth between black and white each time the window is clicked.
  	* Colour1Panel
		* Provides panel content for Colour1Frame.
		* Provides 'swapColours' functionality, used by Colour1Listener
  	* Colour1Listener
		* Separate class as mouse listener.
		* Provides 'mousePressed' functionality.
  	* Colour2Frame
		* Same as above, but this time puts the 'mousePressed' method directly into this JPanel subclass.
  	* Colour2Panel
		* Same as above, but puts mousePressed in subclass. Must override all mouse methods (inelegant solution).
  	* Colour3Frame
		* Same as above, but this time uses a <b>named inner class</b>.
  	* Colour3Panel
		* Same as above, but uses a named inner class, 'Colour3Changer' which extends MouseAdapter.
  	* Colour4Frame
		* Same as above, but this time uses an <b>anonymous inner class</b>.
  	* Colour4Panel
		* Same as above.
  	* ColourKey1Frame
		* Makes a popup window that turns into the colours "R-O-Y-G-B-V" when the corresponding key is pressed.
		* Uses a KeyListener or KeyAdapter and the keyTyped method.
  	* ColourKey1Panel
		* Panel for ColourKey1Frame.
		* Uses a named inner class 'ColourKeyChanger' which extends KeyAdapter.
  	* ColourMouse1Frame
		* Makes a popup window which is black when the mouse is on the left side of the window and white when it is on the right side.
		* Uses a MouseMotionListener or MouseMotionAdapter and the mouseMoved method.
  	* ColourMouse1Panel
		* Panel for ColourMouse1Frame.
		* Uses a named inner class 'ColourMouseChanger' which extends MouseMotionAdapter.
  	* circle
		* Circle
			* Circle model class.
			* Contains new methods 'draw', 'containsPoint' and 'distance.'
		* CirclePanel
			* Panel extended by AddRemoveCirclePanel below.
		* AddRemoveCircleFrame
			* Use Circle and CirclePanel so that 'mousePressed' method adds a circle when you left-click anywhere and removes a circle if you right-click above an existing circle.
		* AddRemoveCirclePanel
			* Panel for AddRemoveCircleFrame.
			* Uses a named inner class 'AddRemoveCircleListener' which extends MouseAdapter.
			
  10. concurrent programming with Java threads (multithreaded)
	* CoinFlipper (used only by FlipCoins1 below)
		* Following the 'separate classes implement Runnable' pattern.
		* Overriden 'run' method flips 1000 coins and prints out whenever it sees three or more consecutive heads.
	* FlipCoins1
		* Model: five people flip a coin one thousand times - all at the same time. If any of them flip three heads in a row, we make a note of it in the output.
		* Specifies a poolSize of 10, and uses 5 threads.
	* FlipCoins2
		* Same model as FlipCoins1.
		* What's different here is that the main class implements Runnable (so we only have one class working instead of two).
	* flipcoinsthree - FlipCoins exercise with AWT and Swing.
		* FlipCoins3
			* This time, we put five JLabel objects (components that display strings) in a JFrame, and use JLabel to count the # of flips that are heads.
			* Each thread flips a coin 1000 times and prints the # of heads that show up in the label, updating the count as each head is found.
		* CoinFlipperLabeled
			* Implements Runnable.
			* Overriden 'run' method like the ones in the exercises above, with modifications.
			
  11. parallel programming (parallel)
	* PrimeFinderUtils
		* Primes
		* ParallelPrimeMarker
	* PrimeFinderUtilsTest
		* Interface: Op
		* TimingUtils
		
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

javaserverfaces (JSF) - table of contents:

spring MVC - table of contents:

hibernate & JPA -  table of contents:

google web toolkit (GWT) - table of contents:
