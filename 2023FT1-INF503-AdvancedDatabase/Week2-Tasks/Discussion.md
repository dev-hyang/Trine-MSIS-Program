1. Discuss the mechanism of attribute/relationship inheritance. Why is it useful? 
2. Discuss the two main types of constraints on specializations and generalizations. 
Requirement: 
* A minimum of 1 outside reference is required along with APA formatting. (LO1) (LO3)

Answer

Q1: Definition:
attribute/relationship inheritance means that the subclass of a superclass would inherits all the attributes & relationships from the superclass.
Benefits:
1. can remove data redundancy, therefore, avoid data inconsistency to some extent
2. can simplify human efforts on designing and maintaining complex participating relationships between some classes with the superclass to its subclasses.
3. can save database storage space
For example, if you have an employee entity type with attributes (employee_name, employee_age, employee_gender, employee_dob, employee_department, etc);
you have a new entity type called manager, with almost same attributes from the employee type. If we don't use inheritance, then we might define these repeated attributes in the manager entity type.
 e.g., (manager_name, manager_age, manager_gender, manager_dob, manager_education_level, manager_department, **manager_project**, etc). In that case, the HR department would need to
maintain two data tables to keep the data consistent for a manager, who is also supposed to be an employee.

Q2: Two main constraints on Generalization/specialization
Generalization/specialization specifies superclass and subclass relationship between entity types. In a generalization/specialization hierarchy, there are two constraints - disjoint and complete. (Il-Yeol, et al., 1995)
* Disjointness constraint: defines that the subtypes do not share any common entities, a.k.a, a entity of superclass can only be a member of one subclass. It contains a unique subset of the supertype entity set.
* Completeness constraint: It can be both partial or total. The total specialization defines that every entity in the superclass must be a member of at least one subset, while the partial specialization can allow an entity of the superclass does not belong to any subclass.
And these constraints could contribute to data integrity, as well as built-in rules/pipelines to populate efficient knowledge-driven information and data access architecture.

APA References:
1. Il-Yeol, S., Mary, E., & Eui, K. P.(1995) A Comparative Analysis of Entity-Relationship Diagrams, Journal of Computer and Software Engineering, Vol. 3, No.4 (1995), pp. 427-459. https://www.researchgate.net/publication/243781001_A_Comparative_Analysis_of_Entity-Relationship_Diagrams
2. Pablo, R. F., & C. M. K.; KnowID: An Architecture for Efficient Knowledge-Driven Information and Data Access. Data Intelligence 2020; 2 (4): 487–512. doi: https://doi.org/10.1162/dint_a_00060
