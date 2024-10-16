# Intials
**Discuss the challenges and considerations in designing effective input systems and databases for a business process. Share your thoughts and ask questions. (LO2, LO3, LO4, & LO5)**

Designing effective input systems and databases is crucial for interactive business processes. A well-designed input system improves user experience by considering both presentation and behavior. Elements like intuitive layout, clear fonts, and organized menus help users navigate the system easily. Poorly designed forms that require extensive typing can frustrate users, while well-placed hints and format guidance (e.g., phone numbers: (1) 000-000-0000) streamline data entry. Real-time validation prevents submission errors, and detailed error messages with corrective actions improve task completion efficiency. Alos, tools like user interaction heatmaps, provide insights into user behavior, allowing designers to optimize frequently used features and create shortcuts for better user experiences. Such tools offer invaluable feedback on improving input systems based on user habits.

On the database side, flexibility and scalability are critical, as business needs evolve over time. The initial design of a database often struggles to meet future requirements, especially after several years of business growth. MySQL, for instance, can face issues when schema changes are introduced if the original design wasn't forward-thinking. Effective database design minimizes the risk of data loss and system breakages during migrations or updates. Additionally, as businesses deal with more unstructured data, adopting adaptable database solutions becomes essential.

My No.1 consideration is how to balance simplicity, effectivity, safety, scalability in the input and database design. A well-thought-out approach to both input system design and database architecture helps businesses evolve without disrupting operations. And nowadays we have an abundance of input sources, especially with the rise of IoT generating vast amounts of data from across the globe. The challenge now is identifying the most valuable data and leveraging it effectively. Can AI play a significant role in this process? If so, what potential improvements could it bring to these areas?

*Reference*
Schuetz, S., & Venkatesh, V. (2020, August 25). The Rise of Human Machines: How Cognitive Computing Systems Challenge Assumptions of User-System Interaction. Journal of the Association for Information Systems, 21(2), 460-482. https://ssrn.com/abstract=3680306


# Replies
* by Lohith Vardhan Thalla - Tuesday, October 1, 2024, 1:32 AM

In the last week, we've learnt how to design effective output. I believe it can help inform a proactive approach to input design, which may involve various formats. User-friendliness is key, especially as more people rely on mobile devices. It’s important to create solutions that are convenient for mobile use without sacrificing practicality. Our goal isn’t to prioritize aesthetics over functionality or to deviate from business requirements. Instead, the design should be grounded in real-world business scenarios, focusing on a seamless user experience that enables task completion efficiently. While aesthetics and convenience are important, they must serve the purpose of meeting actual business needs, ensuring both functionality and usability.
* by Surendra Kumar Kanamarlapudi - Thursday, October 3, 2024, 12:05 PM

This is an excellent explanation of good database design. It's true that a well-designed database is often tied to better user experience (UX) design, as they are closely related. Key factors such as data validation, accountability, security, and adaptability are all critical to achieving an effective database framework. Among these, data management and security stand out as the most important. A poorly designed database makes it difficult to manage data efficiently, complicating future adjustments. In some cases, data migration to a more suitable system may be necessary to reduce management costs. For example, if the original design doesn't support unstructured data and your system now handles media or JSON files, a NoSQL database might be considered. However, NoSQL design can also be problematic if treated like a relational database with rigid columns. In NoSQL, relying on new collections to store varying data structures is inefficient. To mitigate this, it's essential to design schemas with flexibility and abstraction in mind, allowing for better adaptability to changing data requirements.


# Database Design Ideas
To complete the assignment, we've build four main entities: Student, Program, Course, Faculty.
Below are basic explanation of the ER diagram attached, please refine and enrich it.

    * StudentID can be the primary unique key attribute to identify a student from another.
    * Address can be a composite attribute, with (Street, City, State, ZipCode)
    * Each student must enroll in a program. So it's N to 1 relationship for Student entity and program entity. A program is uniquely identified by its Program_Number attribute.
    * Each student can register 0-multiple courses, and a course can be registered by 0-N students. The register relationship would include a Registration_Date attribute.
    * Each course would be uniquely identified by its courseID
    * Each course would only be taught by a designated faculty, but a faculty might be assigned to teach several courses. So it's 1-to-N relationship.
    * Especially, we have prerequisites for the courses designed to help student to taken some easy-level before they step into more depth. This is represented by a recursive relationship for course - prerequisites in the below graph.