# Storytime recaps
- why incident response drive Dr. Mclver mad? What he feels upset is that he thought that people are not really aware of the correct mindset of cybersecurity and incident response.
	- their team is not ready, no mindset on incident response, from planning to reporting. All focus on how to make things right, rarely someone to think how to process if something goes abnormal
	- Rehearsal might be a good approach to test your incident response team effectiveness
	- Strength and preparedness play tegother to make the cyber security work as expected

	- another side is to respond (too slow, or too fast). 
		- Documentation helps to track what you have done to respond to an incident, which helps to retro next time
		- Design a incident response policy ahead to make your verbose legal and concise
		- Effective internal communication across the teams, including sales, business. Dr. Mclver still emphasis that the I.T or cyber security people should not only focus on programming tricks, they should also be a part, or at least a good understanding/master of the business. Which could help to draft and respond in case of incidents
	Sometimes digital forenscis is a law enforcement, that we should keep everything legal

# Cybersecurity Arch: Detection
Prof. Jeff: 
What: To achieve the goal of CIA Triad
How: S = Prevention + Detection + Response

Detection is the steps of monitor + analyze + report + hunt. We use the data collected from all our components previously mentioned in the Prevention part. 

## SIEM
* Collect (data feeding from different domains (services))
* Collerate : related issues/alerts/alarms would be seen as single one, which would not trigger all resource to work on the same issue
* Analyze: 
	* defined analyze rules in the engine to identify the root cause. a good SIEM may provide default well-known rules/policies, and allow you to build your customized complex rules
	* Anomalies: where Artificial intelligence, and machine learning comes into effect; could generate huge benefit
	* Trends: we would like to generate reports based on the trend
## XDR
* 

## SIEM VS XDR
Data flow: Bottom-up approach | Top-down approach
Cross boundaries: Could feed EDR to SIEM | could feed SIEM to XDR
 | federated search : search your local system to check if certain scenario happens. This could happen in real time. You don't need to have something precollected and stored in a huge central database. If something happens, you could report it up to me. It's kind of more efficient.

 But professor highlighted we would better to have both of them. Because every minute our systems could generate tons of alarms, logs and we don't want to be flooded by those information. SIEM could help to filter and correlate, detect and report the things we just need to care about. But that also means SIEM cost much to collect, analyze, transfer. While XDR cares only what you want the system to check. To make the whole process more efficient and accurate, we could pass the alert from the SIEM to XDR to trigger an initial check in the individual domains.

 Investigation means that we react to some of the information we already collected. And threat Hunting means that we proact on the given information. A security professional may draft some hypothesis on their experience and instinct even before some bad things really happen. Then they would use tools like XDR, SIEM to trace any future cases to identify the attack earlier.

# Cybersecurity Arch: Response
the response methodology and the comparison of traditional IR and modern SOAR.
What is process of response
Traditional IR v.s. Modern SOAR
The biggest takeaway I learn from the course is that keep up-to-date methodology in the cybersecurity is very important because it could not only avoid big loss, but also provide higher security to the systems . Based on Prof. Jeff’s introduction, the SOAR means Security, Orchestration, Automation and Response. 
* Case management to make the incidents visible and trackable
* Dynamic playbooks make SOAR more flexible and extensible

The goal of SOAR is automation as much as possible. In case of any first-time unexpected accidents, we could orchestra to use manual process. As the video explained, the traditional approach highly rely on manual process. Especially the triage step, security professionals need to figure out what are positive alerts and what are not, which alerts should have higher priorities and which should not, etc. The idea behind SOAR is automation, which help to accelerate our response. Dynamic playbooks make the SOAR more extensible and flexible. Remember the goal of mitigating the gap time between the time attack happens and the awareness of the attack.



# Reflection
The videos by Prof. Jeff from IBM introduces two key methodologies in cybersecurity architecture: Detection and Response. The course provides a foundational understanding of both detection and response concepts. The detection step is an important component of cybersecurity together with prevention and response. It describes the process security professionals collect, analyze, identity and report the security incident. The introduction of detection tools place emphasis on SIEM (Security Information and Event Management) and XDR. SIEM excel in correlating and aggregating data to identify anomalies and similar alerts from the bottom up. On the other hand, XDR (Extended Detection and Response) introduces a contrary approach, initiating security feedback requests from the top down to individual domains. When individual domains receives the request from XDR, they would check and send results back if there are any specific security concern from the request. While each tool has its merits, they need not be mutually exclusive. Combining their strengths, if budget permits, can enhance the accuracy of security alert detection. In terms of response, it's worth mentioning that many initial attacks are difficult to control and prevent. However, the key is to detect of attacks as early as possible. Compared to traditional manual incident response methods, modern SOAR (Security Orchestration, Automation, and Response) tools offer automation that significantly reduces the gap between the start of an attack and awareness of it.

This week's Coursera course explains the crucial concepts of penetration testing, incident response, and forensics. Penetration testing acts as a valuable approach to assess the strength of a system's security defense. It's typically conducted during non-business critical hours, with careful planning involving stakeholders, and sometimes even the local security department. Forensics, a new concept to me, involves the meticulous process of identifying, collecting, examining, and analyzing data while ensuring data consistency and integrity. What surprises me most was the use of Python as a scripting language in this process. Data collection can be repetitive and laborious, making automation essential. Scripting languages, particularly Python, have become main approches to implement automation. Mastering Python can significantly enhance your capabilities in this domain. Overall, the course content is well-organized and coherent, providing a comprehensive understanding of incident response concepts and practical processes, including the utilization of specific tools.