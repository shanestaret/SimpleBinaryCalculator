# SimpleBinaryCalculator
This is a simple Java based binary calculator based on software emulated gates. Our application will support up to 8 bit binary values supporting addition and subtraction of any value within 8 bits.

The project is split into three portions:

* The adder
* The complementor
* The registers

Each of these systems will be developed in a separate branch and merged when each branch has completed their work.

**Data Exchange between classes**

* Any data that will be exchanged between two or more parts of the program will be sent as an array of 8 boolean values. 
* True representing a 1 and false representing a 0 in bolean values. 
* The left most column of the array, position 0 in Java will represent the most significant digit of our binary number.

**Expectations of classes**

* The **adder** will blindly add any two numbers and return the result in an array
	* If the application is subtracting two numbers the adder will be passed a properly sighned value so that the resulltant is correct

* The **complementor** will perform any complemtning steps necesary as well as performing a twos complement operation if subtraction is to be carried out
* The **register** will support three different registers
	* The subtrahend or addend
	* The minuend or addend
	* The summand

