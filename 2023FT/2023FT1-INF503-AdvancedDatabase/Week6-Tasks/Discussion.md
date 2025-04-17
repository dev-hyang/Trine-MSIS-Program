Week 6 Discussion Forum (LO1) (LO3) - 10 points
1. Discuss the different types of parameters that are used in cost functions. Where is this information kept?
   A cost function is mainly used for the compiled queries. The information for the cost functions is stored in the DBMS catelog. The parameters are:
   * Cardinality of the relation: a.k.a, the number of tuples in the relation
   * The number of attributes of the relation
   * The number of blocks that the relation used
   * The blocking factor bfr, a.k.a, the number of tuples for each block
   * NDV(A, R) of an attribute: the size the attribute domain, a.k.a the distinct values of the attribute in the relation
   * the attribute selectivity (sl): the ratio of tuples satisfying WHERE condition over all the tuples belong to the relation
   Usually the optimizer choose the query plan that would take lowest estimated cost (not absolute lowest cost) from the cost function. Among all of above parameters, the cardinality of a relation plays an non-substituted role.
2. Discuss the cost components for a function used to estimate query execution cost. Which cost components are used most often as the basis for cost functions?
   * Disk I/O cost: it refers to the space and time measurement of mainpulating data blocks between main memory buffers and secondary disk storage.
   * Disk Storage cost: it refers to the space and time measurement of saving temporary files generated via the execution plan
   * Computation/CPU cost: it refers to the space and time measurement of doing any in-memory actions like searching, sorting, merging or computation.
   * Memory usage cost: it refers to the space and time measurement of the count of main memory buffers usage
   * Communication cost: it refers to the space and time measurement of delivering query and its result between database(invokee) and client applications(invoker).
   The cost component selection may vary upon different scenarios, like scale of the database, distributed database, etc. Among all of the above cost compoenents, the Disk I/O cost is used most often as the basis for large database. 

APA
1. Han, L., Zhi, F.B., & Yu, W.P. (2021). A Survey on Advancing the DBMS Query Optimizer: Cardinality Estimation, Cost Model, and Plan Enumeration. Data Science and Engineering. 6, 86–101. https://doi.org/10.1007/s41019-020-00149-7.
