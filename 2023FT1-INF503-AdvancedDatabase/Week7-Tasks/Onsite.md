# Present Topic - Query Optimization 
## Subtopic: How to write an efficient sql query statement?
**Goals**:
1. prune to bugless
2. time complexity efficient
3. space complexity efficient
4. accurate resultsets without anomolies

**Implementation or Validate Steps**:

**Best Practices**
* Settle on Indexes if possible based on the SELECT condition
* Settle on Foreign Keys if possible based on the JOIN condition
* SELECT FROM smaller size tables first
* Settle on the attr whose SL (selectivity Level) is smaller (Selectivity is the ratio of the tuples satisfying condition over all the tuples)
* Considering avoid >= 7 multiple joins

