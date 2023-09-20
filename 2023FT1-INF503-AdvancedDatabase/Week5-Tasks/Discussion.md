1. # What is the difference between primary and secondary storage?
   * Definition: Primary storage refers to storage mediums that could be directly operated by CPU, like RAM, ROM and cache memory. Secondary storage is not directly operated by CPU, the data on it need to be retrieved first to the main memory, like magnetic disks/tapes, Optical Medium, Flash memory etc.
   * Characteristics: Primary storage is for temporary storage and faster access, with limited storage capacity; Secondary storage provide permanent, large storage capacity and backup strategies, usually slow access speed
   * Cost: Primary storage usually are much more expensive compared to secondary storage.
   * Data recovery: In case of unexpected scenarios, like system failure, data in the primary storage would be lost and could not be recovered. Whereas, the data have already been written into the secondary storage are permanently stored and could be retrieved back after system resumes.
2. # Discuss the mechanism used to read data from or write data to the disk.
   Simply speaking, the mechanism could be summarized as below:
   * When read/write request instructions are issued, the operation system(OS) will read the machine code and get the logical block address(LBA);
   * The LBA is mapped to a physical disk block address(cyclinder# + track# + block#) by the disk driver
   * for read command, the specific disk block is copied into the buffer, an area which is used by main storage to interactive data with the secondary/disk storage
   * whereas, the buffer is copied into the specific disk block for write command
   In terms of the hardware mechanism to read/write data on the disk, it is called disk read/write head, which is assembled with electronic component with a mechanical arm. When there are coming read/write request, the read/write heads would move accordingly based on the disk block addresses among the disk pack by the disk driver. It then could retrieve or write information onto the specific disk blocks.
4. # What is the difference between static and dynamic files?
   * In terms of static and dynamic files, they are distinguished by the operations applied to them regarding the file access methods and file orgnizations. If a file is read-only with little update operations, then we say it is static. On the contrary, if a file is updated frequently, then we say it's dynamic. Most of the popular DMBS use both static and dynamic files to provide better performance on both retrieval and update operations, while data warehouse use static/read-only files a lot mainly due to their retrieval-design purpose.

1.  Maohua, L., David, C., Joseph, G., & Cornel, C. (2012). Insights for data reduction in primary storage: a practical analysis. Association for Computing Machinery, USA, Article 17, 1–7. https://doi.org/10.1145/2367589.2367606
