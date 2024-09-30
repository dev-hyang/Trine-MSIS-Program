# Discussions
## Initial

Recent studies indicate that the choice of software development models and tools can significantly impact business success, directly influencing product quality and customer satisfaction. Some experts claim that nearly 60% of product and project errors or setbacks stem from unclear requirement definitions and inefficient analysis activities. Among the popular software development models, the Agile approach is highly recommended due to its ability to quickly adapt to new requirements and features. Agile also enables fast deployment of patch fixes with minimal or no downtime. 

Compared to traditional models like Waterfall, Agile breaks down system development tasks into smaller phases or microservices with well-defined boundaries. Each component can be decoupled, developed, tested, and deployed independently without relying on prerequisite steps or external systems. This modular approach has made Agile the top choice for software development and business product analysis. However, to deliver high-quality products, it’s crucial to follow Agile best practices, such as short releases, sprints/iterations, on-site customer collaboration, and pair programming. User stories should be simple, valuable, and independent of other stories, and each sprint should yield a potentially deliverable product.

No-code platforms like Figma and work management systems like Jira complement Agile development by enhancing prototyping capabilities. Prototyping allows system analysts to create an initial outline of the product for testing and evaluation, helping users visualize the design and ensuring alignment with business objectives. While prototyping focuses on a product’s design and development process, a Data Flow Diagram (DFD) provides an internal view of the system’s data transitions. A DFD visually represents the flow of data within an information system, illustrating relationships between systems and subsystems. For example, the click of a button may trigger the submission of form data, which then undergoes backend validation, processing, and storage. DFDs are valuable tools for system analysts to understand logical data flows and to explain system designs to users.

Remember, process and quality improvement in the information system development is a long-term run. Don’t aim for perfection all at once. Instead, experiment with new approaches, evaluate the results, and refine your methods across multiple projects.

References
Grupe, R. (2014, October 26). Developing product requirements: Tools and agile process. Paper presented at PMI® Global Congress 2014—North America, Phoenix, AZ. Newtown Square, PA: Project Management Institute. https://www.pmi.org/learning/library/developing-product-requirements-tools-agile-process-9327


## Replies
* by Gowtham Muppasani - Wednesday, September 11, 2024, 9:23 AM
This is a concise introduction to the agile modeling and DFDs. To highlight the agile modeling method, even the DFDs can be implemented in an agile approach. Usually the system analyst can build the prototype based on the customer and user requirement collection, as well as collaboration design with different stakeholders. To show the logical data transition flow from the outlook design of the information system, usually system analysts would use the context diagram, as well as its sub level digrams. In reality, there is never a "final" version of a diagram design. Agile methodology can be applied to every phase of system design and development. By leveraging core Agile practices, we can quickly create an initial version of the diagrams, continuously refining and updating them as new requirements emerge or definitions become clearer. For larger system projects, sub-layered diagrams can even be assigned to different team members, each based on distinct user stories. These layers can remain independent of one another, allowing for parallel development. Clearly defining the boundaries of each sub-layer is crucial, as it helps streamline the diagramming process and defines the application programming interfaces (APIs) and communication protocols with external entities.

* by Sathwik Manne - Wednesday, September 11, 2024, 10:03 AM
First, many thanks for summarizing the technique of information systems and data flow diagrams (DFDs). It’s true that DFDs promote transparency in software development, fostering collaboration and communication rather than leaving the development team to work in isolation, which often leads to error-prone products. It’s also important to address the challenges small businesses face, particularly when it comes to budget constraints. How can they adopt Agile methodologies? In my opinion, Agile is especially beneficial for business system design under limited budget. As mentioned in the youtube video, Agile can save up to $30 million compared to the Waterfall model. It reduces planning time, minimizes downtime during patch releases, and quickly adapts to customer updates or new requirements. These are critical advantages for small businesses.
In short, Agile is an excellent way to save both time and money. For organizations with limited budgets, adopting Agile—or a refined version of it—is a smart choice. Further more, not all Agile practices need to be implemented in full. For example, not every sprint requires two-step planning or retrospective meetings. You can customize your sprint activities based on your resources and constraints, or explore Agile variants like Extreme Programming to suit your needs.


# Assignments
Food2Go - food delivering service Prototpye
## Assignment Description
Assignment: Our team has been assigned the task of creating a new mobile application for "Food2Go", an expanding food delivery service. Given its highly competitive market, your employer desires using Agile methodology for rapid prototyping.

Your task is to use agile modeling and prototyping techniques to develop a working prototype for the app, which should demonstrate key features like **browsing restaurants, placing orders, tracking orders, providing customer feedback, etc.**

Instructions: Start by identifying and documenting all the features your prototype should cover, using Agile modeling techniques to model these features, then create a functional prototype which demonstrates them all.

Write a comprehensive outline of your methodology. Provide details as to why and how certain techniques were chosen during development process. Submit both your prototype and written explanation for evaluation.

## Designs

==> Step1, Depict user profiles
==> Step2, Write out user stories
==> Step3, Draw the Prototype in some platform like Figma?
* Agile Activities
	* Coding (not really implemented now)
		* we will choose pair programming to avoid any bias understanding of the user story/requirement. Thus we can quickly adapt to fix problems, close new features, add up weak/unenough considerations
	* Designing (use Figma)
		* more about system design, goals: simplity, flexibility, extensibility
		* Invovled: system end-users, developer, system analyst, UI/UX designer
	* Testing
		* unit/functional test handled by developer
		* automated integration test handled by cross-developer or QA (if set up in scrum)
		* user acceptance test (handled by end-users/customers)
	* Listening
		* agile means more on listening adaptive change instead of redundant written documentation
* Agile Resources
	* project management 
		* tool - Jira and kanban as timely and quality deliverables will always make the customer happy and satisfied
		* Delievering On time should be prioritized first above adding extra features but due to not sufficient testing led to low quality 
		* Cost :adding the headcounts does not mean more efficient in agile due to the increasing cost of communication and knowledge transfering/synchronization; overtime is not a good option either, it might increase the cost, but not the productivity, prone to mistakes. 
			* Instead, investing cost into more efficient software, hardware devices, Devops infrastructure: 
				* design tools, like figma, microsoft vision, CASE tool, 
				* development tools like postman, IDEs, automation test framework, etc can help facilitate finishing a project
			* more scaled strategies, or higher performance GPUs computing power
		* Quality: it's debatable because actually sometimes external quality might be sacrificed in agile modeling compared to deliver the feature on time. Those should be negotiated or inform in advance.
		* Scope: writing user stories is a good way to determine the sprint scope to satisfy the customers. For example:
			- Display restaurants nearby: prepare a list of restaurants based on the input address/ZipCode
			- Display menus of the selected restaurants: prepare a list of meal options
			- Put the selected meals in the cart
			- Checkout the cart and select the delivery time period
			- Pay the order
			- Trace the order
			- Provide customer feedback/comments for delivering and restaurants
==> Step4, Agile - Feedback & Refine & Iterate
* Brave to embrace changes introduced anytime in development
* Collect Feedbacks from end users
	* Keep humble attitude
	* Open to different ideas and opposite opinions
* Based on feedback
	We can find implementation and expectation difference earlier quickly make fixes or adjustments
	* collecting new feature requirements
		- Cancel the order within a time (30 mins)
		- Add meals in the order 
		- Food deliver notification (start preparing, cooked completed, deliver on the way, arrived and signature)
	* or improving existing features 
	* or fixing bugs found in above prototype

==> Step5, Final submission of a agile prototype

Business Domain 1: Food Supply Chain?
1. Available Trucks
2. Available Drivers
3. Food to be delivered

Business Domain 2:
1. Restaurants (Food provider)
	* Name of restaurants
	* Address (Source of the food)
	* Food Package (Food itself) with receipts (Customer Nickname, Order #, Order Menu, Order Time, Contact phone, )
	* Place delivering task
		* From
		* To
		* ETA (Estimated Time to Arrival)
		* Fee (Pay to the driver)
2. Driver and their own car, or 3rd party contractor driver (Like Uber eats, etc) (Deliver - Bridge)
	* Registered Driver Name
	* Registered Driver Unique Number from 3rd party platform
	* Actions (user stories)
		* click to reject/accept the delivering task
		* show "On the way"
		* can click the phone call to let the customer know the food arrived
		* click "complete" after dropping the food package or the customer signed to receive the food
3. Customers (Food receiver)
	* Fullname
	* Contact Phone (to receive text)
	* Or Email (to receive text)
	* Address (Destination of the food delivering)

Choice of Prototype
* (x) Patched-Up Prototype
	* we don't choose this one because it's more of creating a patched-together, working model of an integrated circuit, workable but maybe not efficient enough
* (x) Nonoperational prototype
	* it's design a nonworking scale model which maybe not a workable product, of course not fully feature enabled, for testing specific feature purpose only
	* example: An automobile model for wind tunnel testing
* (x) First-of-a-series Prototype (Pilot)
	* it will create a first full-feature enabled model of a system, also called pilot, allowing users to experience realistic interaction with the new system, but minimizes the cost of overcoming any problems it presents.
	* example: airplane model, block chain implementation
* Selected-Features Prototype
	* build an operationable model but not full feature enabled model, most of enabled features are critical/main/essential features
	* example: retail shopping mall opens before all shops is complete; a user system would have menu, add/update/delete/search (CRUD) user record, get list, scan record; but in the prototype, maybe create, delete, and list a record is enabled;

## Future Enhancements
* Restaurants Managers/Cachiers/ReceptionDesk Roles
* Restaurants can reject
* Customers can cancel the order within XX minutes, if exceeds, no refund xxx


# DFD intro
* Name Conventions
	* When naming a high-level process, assign the process the name of the whole system. An example is INVENTORY CONTROL SYSTEM
	* When naming a major subsystem, use a name such as INVENTORY REPORTING SUBSYSTEM or INTERNET CUSTOMER FULFILLMENT SYSTEM
	* When naming detailed processes, use a verb–adjective–noun combination. The verb describes the type of activity, such as COMPUTE, VERIFY, PREPARE, PRINT, or ADD. The noun indicates what the major  outcome of the process is, such as a REPORT or a RECORD. The adjective illustrates which specific output, such as BACKORDERED or INVENTORY, is produced. Examples of complete process names are COMPUTE SALES TAX, VERIFY CUSTOMER ACCOUNT STATUS, PREPARE SHIPPING INVOICE, PRINT BACK-ORDERED REPORT, SEND CUSTOMER EMAIL CONFIRMATION, CONTACT CUSTOMER VIA SOCIAL MEDIA, VERIFY CREDIT CARD BALANCE, and ADD I NVENTORY RECORD.
	* A process must also be given a unique identifying number that indicates its level in the diagram.
	* The last basic symbol used in DFDs is an open-ended rectangle, which represents a data store . Data stores represent data at rest. The rectangle is drawn with two parallel lines that are closed by a short line on the left side and are open on the right side. 
	* Give each data store a unique
reference number, such as D1, D2, D3, and so on

* Rules
Here are a few basic rules to follow:
1. A DFD must have at least one process, and it must not have any freestanding
objects or objects connected to themselves.
2. A process must receive at least one data flow coming into the process and
create at least one data flow leaving from the process.
3. A data store should be connected to at least one process.
4. External entities should not be connected to each other. Although they
communicate independently, that communication is not part of the system we
design using DFDs


## Summary of Business Activities

#### Student Entity
#### Authentication Process
1, When a student login, input username and password, the system will validate its authenticity,
* validations
	* if the username and password is not matched, reject the login and return errors like "username and password is incorrect"
	* if the student is already graduated, reject the login and return warnings like "Congratulations, please go to the alumni website to check your transcripts and other activities from the xx University"
If the login succeeds, direct the student to registration system homepage.
#### Forget Password Process
If students forget password, students can click forget password in the login page to reset their password by student email;
* validations
	* check if student email is found in **Student Master**, if not, reject and return "reach out to schoold ITS helpdesk"
	* check if new password and confirm password is same, if not, reject and return "password is not same"
*Tips: if the school admin login, it will be same process to validate the username and password but only return "username and password is incorrect" if reject* or reset the password by admin email
#### Display Homepage Process
1, After login authenticated and authorized, the student can see information allowed for him: 
* the student full name and warm welcome from **Student Master**; 
* the number of course credits students have registered from **Student Registration Master**;
* the minimum requirements of course credits student should register from **Degree Program Master**;
* the remaining course credits students needed to get his degree certificate;
	* it will be the required course credits from **Degree Program Master** minus the registered qualified course credits from **Student Registration Master**
2, the student can see the billing balance from **Student Master** and **billing master** he owned to the school by clicking the billing menu

#### Select Course Process
2, The homepage of the registration system should shows serveral dropdown lists as filters and enable query on the filters:
* dropdown list of degree programs from **Degree Program Master**
	* query response from the distinct programs of all degree programs
* dropdown list of all course number and names within these semester from **Course Master**
	* query response from the distinct course number and names of all courses
* dropdown list of all teaching staffs within current semester and degree program from **Teaching Staff Master**
	* query response from the distinct teaching staff fullnames from **Course Master** and **Teaching Staff Master**
* dropdown list of open/full status of the course from **Course Master**
	* query response from the distinct statuses of all courses
3, The homepage will also have a submit button, when student put into the dropdown list filter, it will return fuzzy match of course listings with available registration counts ordered by course number, then by course name;

#### Enroll Course Process
4, When a student select courses and click enroll button:
* rule validations
	* Check if the selected course still open, get course status from **Course Master**; if course is closed within the transaction time, it will reject the enroll;
	* there will be a max course registrations limit set to each degree program students each semester from **Degree Program Master**, so the students would not register too much to crash the system or prevent other students from registering;
* master records to be updated:
	* a new record will be inserted into **Student Registration Master** 
	* **Course Master** will be updated for the availability
		* the open/full status will be updated based on the available registrations left, if a new course is set up with max 30 headcounts, if the registration students are 25, it will show `open`; if the registration are 30, then it will show `full`.
		* if only 1 registration left (29/30), if there are two students enrollment comes in the system, the system would take the 1st enrollment request and reject the 2nd request based on the transaction timestamp in UTC format;

### Billing System
#### Calculate Tutition Fee
1. All enrollment **Student Registration Master** will be sent to calculate tuition fee process, it will get the course credit unit fee from **Degree Program Course Credit Price**, it might differe program by program. It outputs the tution fee to **Billing Master**

#### Display Tuition Fee
2. Student click the billing menu can view balance owned from **Billing Master**
3. Student can download tuition details statement from **Billing Master** and **Student Master** and **Course Master**

#### Pay Tuition Fee Process
3. student enter credit card information and get receipt by the successful payment
	* the **Studnet Tuition Master** is updated
	* the **School Tuition Master** is updated

### School Admin Entity
#### Authentication Process
1. Same as student login, but replace  **Student Master** with **employee master** 

#### Forget Password Prcoess
1. Same as student forget password process, but replace  **Student Master** with **employee master** 

#### Display course process
After successfully login, by default, the admin can get the course listings with un-scheduled and un-assigned teaching staff, from **Course Master**, ordered with course number and then course name.
* the admin can also set up status "unscheduled", "unassigned" filters from **Course Master** to select courses

#### Add Course Process
1. the admin can add new course number, course name in the system with blank schedule time and blank assigned teaching staff;
2. if admin choose to schedule the course and assign teaching staff at the Add process, it will output the Course Master record into Assign Course Process


#### Edit Course Process
2. the school admin can get course information details from **Course Master** and edit it
	* the school admin can edit schedule time and assign teaching staff, send the **Course Master** with schedule time and teaching staff Id to assign teaching staff process

#### Assign teaching staff Process
3. school admin can get all teaching staff and their avaliable schedule time from **teaching staff schedule master** and **Teaching Staff Master**
	* admin can assign an available teaching staff to a proper scheduled course from **Course Master**
	* **teaching staff schedule master** will add a new record
	* **Course Master** will be updated with an teaching staff


Background: Abid
Objectives: Raheem
Planning: <Agile Term> Gowtham
Implementations: Hang
Conclusion: Abid


Detailed Process Representation: Each business activity (login, enrollment, course selection) is broken down into smaller, manageable sub-processes. This approach ensures that each process is thoroughly understood and handled effectively, especially for complex validations like course enrollment and capacity management.

Integration with Key Data Stores: The Physical DFD focuses on integrating the system with various master data stores (Student Master, Course Master, Degree Program Master, etc.), ensuring that data retrieval, updates, and calculations are performed accurately based on real-time records. This ensures smooth user interactions like retrieving course lists or validating maximum credit limits.

Error Handling and Validation: Each process includes comprehensive validation steps, such as password verification, ensuring course availability, and handling concurrent enrollment requests. This allows for robust system behavior, even under edge cases or error conditions.

Scalability and Modularity: By breaking down the system into discrete sub-processes, the design is both scalable and modular. New functionalities can be added or existing processes modified without affecting the entire system.