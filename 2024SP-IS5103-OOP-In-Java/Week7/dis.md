# thread scheduler
thread scheduler and its schedule strategies
* round-robin schedule

## creating a thread
One of the most common way to define a task or a thread is by using Runnable interface. 
```
FunctionalInterface public interface Runnable {
	void run();
}

new Thread(() -> System.out.println("hello")).start();
System.out.println("world");
```
The above code could print helloworld or worldhello. It depends on the thread priority/scheduler.
Remember that the order of thread execution is often not guaranteed.

Each thread created is executed as an asynchronous task. By asynchronous, we mean the thread executing the main() method does not wait for the results of each newly created thread before continuing.

## thread-safety
Thread-safety is the property of an object that guarantees safe execution by multiple threads at the same time. Since threads run in a shared environment, how do we prevent two threads from interfering with each other?
* atomic classes
* synchronized blocks
* Lock framework
* cyclic barries

++ increment operator is not thread-safe. the unexpected result of two tasks executing at the same time is referred to as a race condition.


# Class now that we know how to create a Java program lets focus on some of the behind the scenes or unseen areas.  Discuss two types of storage devices, categorize how data is stored on those devices, and finally discuss absolute and relative paths.

Various categories of data storage devices serve distinct purposes, each with its unique characteristics. In this context, let's explore cache and hard disk drives (HDDs).

Cache:
Cache is a type of high-speed, small-volume, and volatile memory. Typically employed for temporary storage, cache utilizes key-value pairs to efficiently organize data. This key-based approach facilitates swift access to information, making cache an ideal solution for storing frequently accessed or critical data during program execution.

Hard Disk Drive (HDD):
HDDs represent a traditional form of persistent storage that relies on magnetic disks to store data. Operating with a mechanical arm equipped with a read/write head, HDDs access information stored in concentric circles on spinning disks. While HDDs excel at accommodating large volumes of data, the trade-off is a sacrifice in access speed due to the mechanical nature of the reading process.

A relative path denotes the location of a file in relation to the present working directory. It is expressed in a way that indicates the file's position relative to the directory from which the program is currently executing. Conversely, an absolute path signifies the complete location of a file starting from the root directory. It provides the full directory hierarchy, specifying the file's position from the root of the file system (Perry, 2022).

## references
Sheldon, R., & Kranz, G.(2021, November). storage medium (storage media). TechTarget Network. https://www.techtarget.com/searchstorage/definition/storage-medium
Perry, K.(2022, January). Understanding Relative File Paths. Coding Room. https://www.codingrooms.com/blog/file-paths#:~:text=A%20relative%20path%20describes%20the,regularly%20use%20relative%20file%20paths.


## Replies to
* by Yamini Paruchuri - Wednesday, February 21, 2024, 3:00 AM

Thank you for the concise introduction to data storage devices and the distinction between absolute and relative paths; it was immensely helpful. Hard Disk Drives (HDDs) have historically been a more cost-effective storage option compared to Solid State Drives (SSDs), holding a significant market share in earlier times. However, with advancements in semiconductor technology, the emergence of more SSD products, and subsequent price reductions, SSDs have become increasingly popular. The decreasing costs of SSDs, coupled with advancements in technology, have contributed to their growing adoption. This shift is also influenced by the rise of cloud computing, where individuals and businesses opt for online storage solutions rather than relying solely on personal computers. As a result, the landscape of data storage is evolving, with SSDs gaining prominence due to their speed and reliability, complemented by the convenience and accessibility offered by cloud computing storage solutions.

* by Yan Zhang - Wednesday, February 21, 2024, 11:07 PM
Hi, Yan

This explanation, enriched with clear examples, is truly impressive. Solid State Drives (SSDs) are gaining increasing popularity, thanks to advancements in semiconductor technology and the prevalence of cloud computing. SSDs offer remarkable advantages over HDD storage, particularly in terms of data access speed and computing power. SSDs, being devoid of moving parts, offer increased reliability and durability compared to HDDs. The absence of mechanical components reduces the likelihood of mechanical failures, making SSDs more resilient to shocks, vibrations, and wear over time. In summary, the growing popularity of SSDs is driven by their superior performance, reliability, and adaptability to the demands of modern computing. These advantages position SSDs as a preferred choice for individuals and businesses seeking efficient and responsive storage solutions in the dynamic world of technology.
