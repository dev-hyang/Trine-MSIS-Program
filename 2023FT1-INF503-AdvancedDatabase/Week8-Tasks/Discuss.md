# Discuss each term: database authorization, access control, data encryption, privileged (system) account, database audits, and audit trail.
* **Data Authorization**: the data could include many confidential information or certain categories that could only be accessed by certain users or user groups. Based on requirements, the database system should have capability to control the access of the data by categorizing security levels of the data and user groups
* **Access Control**: it is one of the control measures to protect the DBMS security, and it means that users should apply for user accounts and passwords to login per DBMS to access its desired data
* **Data Encryption**: it is one of the control measures to protect the DBMS security, and it means to use some encryption algorithms to hide or pretect sensitive information like bank accounts, SSN etc
* **Privileged (system) account**: the accounts used by the database adminstrators which have full capability to control the whole database system. It's commonly used to grant and revoke privileges for other individual users or user groups
* **Database audits**: it's an audit process during which related stakeholders (could be DBA) would review the system logs created to record all the operations done by certain users in a given time interval
* **Audit Trail**: it specially refers to the system logs that serves for security/auditting purpose

# Discuss the types of privilege. What is meant by revoking a privilege?
The privileges are for a relation in the database.
* **SELECT**: it means certain users have retrieval/read privilege on a relation
* **Modification**: it mainly refers to certain users have inserting, deleting, updating privileges on a relation
* **References**: it means certain users have reference privilege on a relation when it specifies some contraints, like foreign keys etc

Revoking a privilege means preventing certain users from selecting(reading), modifying(inserting, deleting, or updating), or referencing a relation originally granted to them. It is implemented by REVOKE command, and it's commonly used for temporary visitors of the database system, like third party auditing staff.

Elisa, B., Sushil J., & Pierangela S.(1999). A flexible authorization mechanism for relational data management systems. ACM Transctions on information Systems. 17(2), 101–140. https://doi.org/10.1145/306686.306687
