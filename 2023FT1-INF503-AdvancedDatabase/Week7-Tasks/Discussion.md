# Discuss the pros and cons of UNDO and REDO techniques of recovery
In terms of REDO and UNDO in recovery, they are both related with the system logs which we used to trace all the commands we've done to the data. The REDO approach means that we would redo/reapply the commands of committed transactions. The UNDO appraoch is to undo/revoke some of the partial updates in the database from a transaction. Both of them are to keep our data consistency in the database. Especially, in catastrophic failures, we mainly use REDO approaches. While in non-catastrophic failures, both REDO and UNDO approaches would be used based on the policy(deferred update, immediate update) we choose.
* Deferred update technique is also called NO-UNDO/REDO, which means the data usually would not be updated until it comes to a commit checkpoint. The updates would be saved persistently in the DBMS buffer/main memory before the commit and then be written to the database after the commit.
  * built to avoid UNDO/transaction rollback under several concurrency control policy settings
  * only redo the commands of committed transactions after certain checkpoint
  * space complexity/buffer usage is high as updates would not be written to disk until certain commit checkpoint
* Immediate update technique is also called UNDO/REDO, which means that each operation on the data would be immediately written to the database (also called partial update) before the transaction hits the commit checkpoint. As each operation is forced-written to the system log, those partial update operations of a transaction could be undone when the transaction failed.
  * need less buffer space but more Disk I/O cost as each operation in the transaction needs to be written into disk immediately
  * higher risk of data inconsistency if there is any partial log entry missing


# Discuss how disaster recovery from catastrophic failures is handled. 
The technique that we use to handle catastrophic failure recovery is called database backup. Basically, we will build a synchronization pipeline to recurringly backup the data onto another data storage or even a different data center(usually independent physical location). In case of any catastrophic cases, like flood, wildfire, earthquake, etc, the main data center is totally disrupted and losing all of its data. We could reload the backup data from the last latest backup image and then restart the system.

It's good to mention that we could even have a better management over the effects of committed transactions during the backup. Besides the full database is backuped, we could have a more frequent backup of the system logs as its smaller size compared to the whole database volumne. So the committed transactions which was saved in the system log could be redone after the database reload. Hence, it would have a more up-to-date database state compared to reload-only backup approach.

David, L. & Mark, T.(2003). A theory of redo recovery. In Proceedings of the 2003 ACM SIGMOD international conference on Management of data (SIGMOD '03). Association for Computing Machinery, New York, NY, USA, 397–406. https://doi.org/10.1145/872757.872806
