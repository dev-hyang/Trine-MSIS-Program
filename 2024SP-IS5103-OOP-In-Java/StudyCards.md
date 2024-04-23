What's the data type of z? short x = 20; short y = 30; var z = x + y;
- int

True or false? Java is case sensitive.
- True

True or false? In a text block, incidental whitespace is included in the value. 
- False

What does \s mean in a text block?
- Treat it as a whitespace character and preserve leading space on the line

What primitive goes with the Character wrapper class?
- char

What symbols does a text block start and end with?
- ""

What is wrong with the following statement? int x, long y;
- variables declared together in a single statement must have the same type.

Which of the following are valid literals? double d1 = 1_1234; double d2 = 5_.6; double d3 = 7_8.9_0; double d4 = 1.0_;
- Only 1_2345 and 7_8.9_0 are valid literals. The other two have an underscore(_) next to a decimal or at the end of the value.

When executing a jar command, -c is used to specify that the JAR should be created, while -C is used to specify the directory used to create the JAR.

What is the name of the option available to set an output directory in a javac command?
- -d

What characters can a variable name begin with?
- A letter, currency symbol, or underscore (_)

Which of the following variables can null be assigned to ? String s; Object o; int num; boolean b;
- String s and Object o because they are objects.

True or false? At runtime, it is possible to change the type of a var after it is declared.
- False, a var is initialized with a specific type.

True or false? String is primitive type.
- False, String is an object type, although Java has built-in support for String literals.

True or false? Instance initializer blocks run before any constructors are initialized.
- True. Fields and instance initializer blocks run first, in the order, in which they appear, followed by any constructor calls.

What order do the class declarations, and package declaration go, in a file?
- package first, followed by imports, followed by the class declaration

Which command is used to run the program contained in Wolf.class in the default package?
- java Wolf

Which wrapper class goes with int?
- Integer

which character is used in a text block to avoid a line break?
- \

True or false? If a text block ends with gerbil """, a new line is added
- False

What are the names of the options available to set a classpath in a java or javac command?
- -cp, --classpath, and -class-path

What is a redundant package import?
- A package import that is unnecessary. Removing the import does not prevent the code from compiling.

Name the eight Java primitive types and indicate which are integer types, which are floating-point types, and which are neither, in increasing order of size.
- In increasing order of size for each group: byte, short, char, int, and long are integer types; float and double are floating-point types; and boolean is neither.

What is the syntax for creating an instance initializer?
- {} with zero or more statements inside the block

True or false? Garbage collection is guaranteed to run at a fixed schedule and when the JVM is low on memory.
- False. the JVM controls when garbage collection is run, and when it occurs is not guaranteed.

Besides letters and numbers, what symbols are permitted to be used in identifiers?
- _ and currency symbols

var can be used as the type for which of the following: instance variable, static variable, local variable, constructor parameter, method parameter?
- var can be used only as a local variable.

What does JAR stand for?
- Java archive

What are the three valid formats for comments?
- /, /* */ and /** */

Which command is used to compile the Java class Wolf.java in the default package, and what file does it generate?
- Run: javac Wolf.java (and it generates Wolf.class)

Fill in the blank: A runtime instance of a class is called an object

What is the most common signature of the main() method?
- public static void main(String[] args)

The bytecode for a class named hello in the a.b.c package must appear in what directory structure?
- The file Hello.class must be in the subdirectory a/b/c

What characters may a variable name end with?
- A letter, number, currency symbol($), or underscore(_)

What are the default values for these instance variables: String s; int num; boolean b; double d;?
- s=null; num=0; b=false; d=0.0;

What is the value of x instanceof Object if x is null?
- false

What is the value of z? var z = (int)(2.5 > 11)
- the code does not compile

What symbols can be used to change the order of operation in Java?
- Parentheses()

Which operator decrements a value and returns the new value?
- The pre-decrement operator: --variable

What is the value of z? var z = (int)3.1<=3;
- true

True or false? The following compiles: short x = (short)50000;
- True

What is the output of (true ? false? 10: 20 : 30)?
- 20

What is the value of k? var k = 10 instanceof String;
- The code does not compile

Beside itself, which primitive types can be implicitly cast to int?
- byte, short

Rank these operators from highest operator precedence to lowest: ==!||/
- !/==||

What is the value of m? var m="" instanceof String;
- true

Name the six types of unary operators in Java
- !, +, -, ++, -- and the cast operator

What is the syntax for the ternary operator?
- It is of the form booleanExpression? express1 : express2

List the short-circuit operators
- || and &&

True or false? In Java, = and == can both be used to test equality
- false

True or false? The following compiles: byte x = 1000;
- false

What is the diff between the & and && operators when applied to boolean expressions?
- The logic operator & evaluates both sides, while the short-circuit operator && only evaluates the right side if the left side is true.

Given p || q, where both p and q are true, which side will not be evaluated at runtime?
- q

Which operator increments a value and returns the original value?
- The post-increment operator: variable++

Without using any variable, what could you write to negate the value -5?
- -(-5)

What is operator precendence?
- It refers to which operator are evaluated in what order.

What is an unperformed side effect?
- An expression that could modify a variable but is never executed because of a short-circuit expression.

True or false? Unary operators have the highest order of precedence.
- True

How many operators in Java take three values?
- Just one, the ternary operator

True or false? All operators are evaluated from left to right
- False. The assignment operator is evaluated from right to left

What is the value of 10 % 3 and 10 / 3?
- 1 and 3

What is the output of (true ? false : 4 ? 5 : 6)
- The code does not compile

Beside itself, which primitive type can be implicitly cast to double?
- byte, short, int, float, long

Which complementary operator can be used to test if x is greater than or equal to y?
- >>= or <<

What is the data type of z? short x = 20; var z = x + 10;
- int

Which of the following requires an explicit cast to be assigned to a short value? int, byte, float, bit
- int and float require an explicit cast, while byte does not. Note that bit is not a primitve type in Java.

Which operator can be used to avoid cast exceptions at runtime?
- instanceof

True of false? The logical complement operator, -, flips the value of a boolean expression?
- false

Rank the operators from highest operator precendence to lowest: +*!==++||
- ++!*+==||


Which data types are supported as the target of an else statement's conditional clause?
- None. An else statement does not have a conditional clause.

True or false? A traditional switch statement is always required to have a default statement when assigning the result to an int value.
- False. Traditional switch statement do not return a value.

True of false? A pattern variable can be a part of a short-circuit expression within the pattern matching statement where it is declared.
- True.

How many loop variables can a traditional for loop have?
- There is no specific limit.

True or false? When writing an if and else statement, indentation changes how the code is interpreted.
- False

Write a for loop that iterates over int[] data in reverse.
- One common implem

True or false? A pattern variable can be used outside the if statement, inside which it was declared.
- True, provided the flow scoping is valid

Which type of loop can never be used inside another loop?
- All loops types can be used inside each other

True or false? If a switch expression is assigned to a variable, each branch must return a value.
- False. They can also throw an exception

Which two statements can be used to exit the current loop execution?
- break and return

What is the advantage of using a for-each loop in place of a traditional for loop?
- Reduces boilerplate code

True or false? A switch expression is always required to have a default statement when used with an enum value.
- False

What is pattern matching?
- A tech of controlling program flow that only executes a section of code that meets certain criteria.

Why is it not recommended to modify a loop variable in the body of the loop?
- It produces side effects or unexpected results if the loop counter or condition is modified directly

True or false? All of the parts of a traditional for loop are optional.
- True, e.g. the statement for(;;){} is a valid (infinite) loop

Which statement can be used to return a value in a switch expression?
- yield

Which statement can be commonly used to replace a set of if and else statements that operates on the same variable?
- switch

True or false? Pattern matching allows you to avoid performing a separate cast operator.
- True

Write a for-each loop that iterates over int[] data in reverse.
- For-each loops cannot be used to iterate over a data structure in reverse order.

What is a compile-time constant variable.
- A variable that is marked final and initialized with a literal value when it is declared.

Which operator or statement can be used to combine case values within a switch statement.
- A comma (,)

True or false? A switch expression is always required to have a default statement when assigning the result to an int value.
- True. since handling every possible int value would be untenable.

When performing pattern matching, which operator is primarily used?
- instanceof

What is unreachable code?
- Any lines of code that the compiler determines it is not possible to reach at runtime.

What is the difference between a switch statement and a switch expression?
- A switch expression is a compact form of a switch statement that uses the arrow operator (->) and is capable of returning a value.

What is Flow scoping?
- Flow scoping means the variable is only in scope when the compiler can definitely determine its type

What is the purpose of a label statement?
- It allows the program to break or continue for a specific loop within a group of nested loops.

True or false? Nested loops can only be used with for loops
- False. Other types of loops, such as while and do while, can be used as nested loops.

Which statement can be used to stop the current loop execution and immediately evaluate the loop condition?
- continue

What are acceptable data types on the right-hand side of a for-each loop?
- A built-in array or class that implements java.lang.Iterable

Which looping statement guarantee that the body is executed at least once?
- Do{} while()

True or false? A case statement can use effectively final variables.
- False. The variables must be compile-time constants. Unlike effectively final variables, a compile-time constant must be explicitly marked final and be initialized in the line where it is declared.

Which data types are supported as the target of an if statement's conditional clause?
- only boolean

Name the data types supported by a switch statement
- int and Integer, byte and Byte, short and Short, char and Character, String, enum, and var

True or false? An if statement can have one or more associated else statements.
- False. An if statement can have at most one associated else statement.

Which sorts first, uppercase or lowercase?
- Uppercase

True or false? stripIndent() can get rid of the extra space characters in "happy \nbirthday"
- False. The whitespace here is at the end of the line, not the beginning.

True or false? stripIndent() can get rid of the extra space characters in "happy\n birthday"
- True. The whitespaces in the beginning of each line is removed.

What methods can remove whitespace from the beginning of a String?
- trim(), strip(), stripLeading(), stripIndent()

What are the four classes in java.time representing dates/times?
- LocalData, LocalTime, LocalDateTime, ZonedDateTime

True or false? Math.ceil() takes and returns a double.
- True

True or false? indent(0) will not make any changes to a String.
- False. It will normalize line breaks.

Which method can remove incidental whitespace?
- stripIndent()

Which method removes a character within a StringBuilder object?
- deleteCharAt()

What does immutable mean?
- That an object cannot be modified after it is created, such as a String object

Which String method returns true if a value is present within a String?
- contains()

Write a line of code to print both the first and last index of this array: boolean[] b and { true, false };
- System.out.println(b[0] + " " + b[b.length - 1]); or System.out.println(b[0] + " " + b[1]);

Write a line of code to print the number of elements in this array: int abc[] = new int[9];
- System.out.println(abc.length);

What is the output of code: System.out.println(new StringBuilder("surprise").insert(3, "!!").replace(1, 3, "-"));
- s-!!prise

Which of the following StringBuilder methods can be chained? append(), delete(), insert(), reverse(), substring(), toString()
- append(), delete(), insert() and reverse(), can be chained because they return a StringBuilder. The other two return a String.

What does this code print? String s = "hmm", s.substring(1); System.out.println(s);
- hmm, The result of substring() is not stored anywhere, and strings are immutable, so s itself is not modified.

When calling a String.format() method, what is the meaning of the symbols %n and %d?
- The %n symbol is used to indicate a new line, while the %d symbol is for integer values.

Which sorts first: letters or numbers?
- Numbers

True or false? stripIndent() can get rid of the extra space characters in "happy birthday".
- False. strip() only gets rid of whitespace from the ends of the string.

Which methods can remove whitespace from the end of a String?
- trim(), strip(), stirpTrailing()

Which represents a specific moment in time in GMT?
- Instant

Duration is stored in hours, minutes, and seconds

True or false? Math.round() returns the same primitive type it is passed.
- False. It returns int/long when passed float/double

True or false? indent(x) can take positive or negative integers as a parameter
- True. Negative will remove leading spaces

What string method converts \\n to the new line escape character?
- translateEscapes()

Write a statement to create a two-dimensional primitive integer array initialized with the values [1 2][3 4]
- int[][] array = {1, 2}, {3, 4};

What does the following expression return? new StringBuilder("Hello").equals("Hello");
- False, as they are not the same object type.

Which string method returns the position of a value in a String?
- indexOf()

What does the following output? int[] x = {7, 8, 9}; int[] y = {7, 7, 7}; System.out.println(Arrays.compare(x, y) + "" + Arrays.mismatch(x, y));
- 1 1

How many objects are created in String[] s = new String[5];
- Just one, The references are all set to null by default.

Equals() are used to check if two String values are the same.

What does the code print? String s = "hmm"; System.out.println(s.substring(1, 2));
- m. 

When calling String.format() method, what is the meaning of the symbols %05.2f?
- They will display a floating-point number as five digits, with leading 0s, rounding to two digits after the decimal.

What is the least restrictive access modifier?
- public

True or false? Calling add() on an effectively final ArrayList causes a compiler error?
- False, Calling a method does not reassign the variable and does not affect whether it is effectively final.

Which specifier applied to a variable means there will only be one copy created at runtime?
- static

Which components of a method declaration are required for non-abstract methods?
- Return type, method name, (possibly empty) parameter list, and body

True or false? An effectively final variable must be assigned a value on the line where it is declared.
- False, it can only be assigned a value once, but it does not need to be on the line where it is declared.

How many return values can a method have?
- At most one

True or false? Creating an instance variable with package access allows a subclass to access it under certain circumstances.
- True, if the subclass is in the same package.

If two variables with the same name are imported using a static import, which one will Java use?
- Neither, the code does not compile.

Which single object type can be passed to a method with a vararg parameter of type int...?
- int[]

In an encapsulated class, instance variables are typically of private scope and getters/setters are of public scope.

What part of a method declaration is always listed before the body(if provided)?
- The exception list

LIst the seven parts of a method declaration in order (not including the exception clause)
- Access modifiers, optional specifiers, return type, method name, parameter list, exception list, method body

What is the wrapper class for bool?
- Java use boolean, not bool. in which case the wrapper class is Boolean.

Which of the following may be different in an overloaded method: method name, return type, access modifier, or exception list.
- return type, access modifier, and exception list may vary.

A static initializer can access static variables declared in the class.

What part of a method declaration is always listed first, the access modifier or optional specifiers?
- can be in either order

True or false? If a method has an int return type and does not throw an exception, it must return a value.
- True

True or false? A vararg that takes a list of int values can be written within a method declaration using int... or int[].
- False. Only ... can be used to declare a vararg.

An instance initializer can access static and instance variables declared in the class.

What is a final static variable commonly referred to as ?
- A constant

What must be the same for two methods to be considered overloaded?
- The method name

WHen passing an object to a method, how can the method be written to change the obj that the caller refer?
- It cannot, A method cannot directly change the reference the caller passes so that the caller sees the change.

True or false? A static method is allowed to reference an instance variable.
- False (except through a ref to a class instance)

Which modifier can be used to prevent a method parameter from being reassigned?
- final

What is wrong with public void method(String... s, int... b)?
- A vararg parameter must be the last parameter in a parameter list, and only one is allowed per method.

When is a return statement is not required in a method?
- return type is void

List all the access modifiers.
- public, private, protected, package. The first three are keywords. The last is specified with the lack of a keyword.

Which order does Java use when looking for matches in overloaded methods of: autoboxing, exact match, widening primitives, varargs?
- exact match, widening primitives, autoboxing, varargs

True or false? Overloaded methods have same method signatures.
- False. The paramter list must be different.

Write a static import to import the static LENGTH variable of a.b.c
- import static a.b.C.LENGTH; or import static a.b.C.*

True or false? An instance method is allowed to ref a static variable.
- True

What is the most restrictive access modifier?
- private

True or false? An overriden method may declare a new exception.
- True, provided it is unchecked

A variable can be hidden by a subclass, while a private method can be redeclared in a subclass.

How can writer of an immutable class constructor prevent an object parameter passed into the class from later being modified by the caller?
- by performing a defensive copy of the object and discarding the ref to the obj that is passed in

An overridden method must have the same signature as the method it inherits

How many abstract variables can be included in an abstract class?
- There is no such thing as an abstract variable.

super() is used to call a constructor within the parent class.

What is an overloaded constructor?
- Declaring more than one constructor within a method, each with a unique list of parameter types.

In which situation does relying on the compiler to insert a default no-argument constructor result in a compiler error?
- if the parent class does not include a no-argument constructor, the compiler inserting one in a subclass will result in a compiler error.

// ended in 1/24/2024