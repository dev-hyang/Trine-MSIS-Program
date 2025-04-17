# Week1_Discussion_HangYang
## What's a database?
A database is a shared collection of related data used to support the activities of a particular organization.
A database can be viewed as a repository of data that is defined once and then accessed by various users.
Some of the database properties are:
* A database is a representation of some aspect of the real world or a collection of data elements (facts) representing
real-world information.
* A database is logical, coherent and internally consistent.
* A database is designed, built and populated with data for a specific purpose.

## Main characteristics of the database approach

* **Self-describing nature of a database system**: The database system contains both the database and a complete definition or description of the database structure and constraints. The data definition of a traditional file-based system is part of the application programs.
* **Insulation between program and data**: In the database system, the data structure is stored in the system catalogue and not in the programs. One change of data structure is shared to all programs that access the data. In the file-based system, the structure of the data files is defined in the application programs which .
* **Support for multiple views of data**: A view is a concept specific to database and means a subset of the database. It outperforms file-based system in terms of data simplication and abstraction, data security and access control, data joining and simplifying query complexity.
* **Sharing of data and multiuser system**: A database shares a pool of related and integrated data among all applications and it promotes efficient collaboration, data integrity, and streamlined access to information for various users. A typical file-based system uses separate data files for each application and it has limited concurrency control.
* **Control of data redundancy**: It is an important factor of database design and management. Databases control data redundancy by using strategies like normalization, table structure, primary keys and indexes, and centralized data storage. This helps to ensure efficient data storage, data consistency and simplified data maintainance across applications and users. In the file-based systems, independent data files could include a lot of duplicated data as different users or applications might create their own copies of data.

To conclude, Database approach overcomes the limitation of file-based system by supporting an integrated, centralized data structure which allows to sharing database by different users and applications.(Darshana, 2015)

## Differences between database systems and information retrieval(IR).
### Database Systems
* mainly focuses on structured data storage and management
* used to support transactional operations, data manipulation and complex queries
* uses structured query language, including sets of commands like (DDL, DML, DQL, DCL and TCL) to perform data operations
* types of database systems are MySQL, NoSQL, Graph database, Cloud database, etc
* widely used all over the industries in the world, including finance, manufacturing, government, education institutions, medical system, etc 

### Information Retrieval(IR)
* focuses on unstructured data or semi-structured data, such as audios, videos, web pages, emails, images etc.
* used to retrieve the desired information from a large pool of unstructured data with rankings
* uses keyword-based searches, relevance ranking, inference and NLP etc to retrieve relevant documents
* widely used in search engines, document research and recommendation systems

## Reference
1. Watt, A. & Eng, N. (2014). *Database Design* (2nd ed.). BCcampus. https://openlibrary-repo.ecampusontario.ca/jspui/handle/123456789/247
2. Darshana (2015, August 28). Traditional Approach vs Database Approach. *Infotech Care*. http://infotechcare.blogspot.com/2015/08/traditional-approach-vs-database_28.html
