# What's an ODBC and how is related to SQL/CLI
An ODBC is short for Open Database Connectivity. It is a dynamic database programming approach and a standardization of popular library of functions to interact with databases. Compared with Embedded SQL approach, it provides function calls to make dynamic database programming.
SQL/CLI is short for SQL Call Level Interface, and part of SQL standard. Usually we see SQL/CLI as the standardized version of ODBC.

# Three main approaches of database programming
1. Embedded SQL
   * database statements/raw sql command statements are written explicitly in the hosting programming language by a special prefix.
   * is known as static database programming, it's syntax is checked and validated at compile-time which makes it faster to be executed in run-time. However, it has less flexibity to change the sql statements at runtime. Its maintenance cost could be high and make code style hybrid/kind of messy.
   * Applications: mostly early legacy systems before ODBC or PL/SQL
2. API/Function Calls:
   * known as Application Programming Interface(API) to interact with the databases through different API calls with related query parameters
   * It's convenient to make dynamic database programming and able to interact with multiple databases under different database prvovider. However, the developers need to take responsibilities for providing syntax-correct sql statements as they are passed in the parameters and could only be validated at runtime. Potential runtime errors are expected and usually are along with Try-Catch logic.
   * Applications: ODBC, SQL/CLI, JDBC
3. Database programming language:
   * A database specific programming language to bridge the gaps between database models and query language models
   * Both approaches 1) & 2) maybe programmed to adapt to specific hosting programming language models with database models, thus they could have impedance mismatch. However, they are usually vendor-specific, so that the learning-curve could be high.
   * Applications: Oracle PL/SQL
  
   # APA References
   1. Ramez, E.& Shamkant, B.N.(2014). Fundamentals of Database Systems (6th ed.). Pearson. https://archive.org/details/fundamentalsofda0000elma_z1y1
