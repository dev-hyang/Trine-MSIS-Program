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

* Self-describing nature of a database system: The database system contains both the database and a complete definition or description of the database structure and constraints. The data definition of a traditional file-based system is part of the application programs.
* Insulation between program and data: In the database system, the data structure is stored in the system catalog and not in the programs. The structure of the data file is defined in the application programs.
* Support for multiple views of data: A database supports multiple views which are subsets of the database and dedicated for particular users of the system.
* Sharing of data and multiuser system: A database shares a pool of related and integrated data among all applications; A traditional file system use separate data file for each application.
* Control of data redundancy: Ideally, each data item is stored in only one place in the database. In some cases, data redundancy still exists to improve system performance. In the traditional file systems, independent data files could include a lot of duplicated data.

To conclude, Database approach overcomes the limitation of traditional file orientated system by supporting an integrated, centralized data structure which allows to sharing database by different applications.(Darshana, 2015)

## Discuss the differences between database systems and information retrieval(IR).
* The main difference is that databases focus on structured data while IR focuses mainly on unstructured data ("documents") such as web pages, emails, images etc. 
* Databases are concerned with data retrieval, not information retrieval.
* IR focuses on the human user, databases are designed to allow applications to be built on top of them which can then be used by human users.

## Reference
1. Watt, A. & Eng, N. (2014). *Database Design* (2nd ed.). BCcampus. https://openlibrary-repo.ecampusontario.ca/jspui/handle/123456789/247
2. Darshana (2015, August 28). Traditional Approach vs Database Approach. *Infotech Care*. http://infotechcare.blogspot.com/2015/08/traditional-approach-vs-database_28.html
