# Present Topic - Query Optimization 
## Subtopic: How to write an elegant sql query statement?
**Goals**:
1. prune to bugless
2. time complexity efficient
3. space complexity efficient
4. accurate resultsets without anomolies

**Implementation or Validate Steps**:

**Best Practices**
1, Settle on Indexes if possible based on the SELECT condition
2, Settle on Foreign Keys if possible based on the JOIN condition
3, SELECT FROM smaller size tables first
4, Settle on the attr whose SL (selectivity Level) is smaller (Selectivity is the ratio of the tuples satisfying condition over all the tuples)
5, Considering avoid >= 7 multiple joins

