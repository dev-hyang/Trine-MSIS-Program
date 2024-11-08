# chap4 - Probability

* Probablity is numerical measure of the likelihood that an event will occur.
	* a measure of the degree of uncertainty
	* value range [0, 1]
	* 
* Experiment is a process that generates well-defined outcomes
	* Toss a coin: outcomes will be either Head or tail
	* Roll a die: 1, 2, 3, 4, 5, 6

* Sample Space: is thte set of all experimental outcomes/points. An experiment outcome is also called a sample point.
	* S = {Head, Tail}
	* S = {Defective, Nondefective}

* Counting rule for multiple-step experiement: if an experiment can be described as a sequence of k steps with n1 possible outcomes on the first step, n2 on the second step, and so on. The total number of experiment outcomes is given by (n1)(n2)...(nk).

* **Combinations**: allows one to count the number of experiment outcomes when the experiment involves selecting n objects from a set of N objects.
	* ! means factorial: 5! = 5*4*3*2*1 = 120
	* CN, n = (N, n) = N! / n!(N-n)!
	* By def: 0! = 1

* **Permutations**: allows one to compute the # of experiment outcomes when n objects are to be selected from a set of N objects where the order of selection is important.
	* denoted by PN, n = n!(N, n) = N!/(N-n)!

* Assigning probabilities
	* methods: classical, relative frequency, and subjective methods
	* 2 basic rules: 
		* 1, each experiment outcome's probability must between 0 and 1; 
		* 2, sum of all experiment outcomes are 1;
	* classical method: when all experiments have same probability: 1/n
	* relative frequency method: when data are available to estimate the proportion of the time the experimental outcome will occur if the experiement is repeated a large # of times.
	* subjective method: one cannot realistically assume that the experimental outcomes are equally likely and when little relevant data are avaiable. It's case by case.

* random experiments: the experiments of statistics;
* when drawing a random sample without replacement from a population of size N, the counting rule for combinations is used to find the # of different samples of size n that can be selected;

## Events and Their probabilities
* Event

	* def: An event is a collection of sample points.
	* prob: the prob of any event is equal to the sum of the probabilities of the sample points in the event
	* P(S)=1: the sample space S is an event that contains all the experimental outcomes.

* Basic Relationships of Probabilities
	* Complement of an Event, denoted by Ac
		* Venn diagram
		* P(A) + P(Ac) = 1
	* **Addition Law**
		* union of two events: the event containing all sample points belonging to A or B or both, denoted by A U B;
		* intersection of two events: the event containing the sample points belonging to both A and B, denoted by A X B
		* P (A U B) = P(A) + P(B) - P(A X B)
		* Two events are said to mutually exclusive if the events have no sample points in common;
			* P (A U B) = P(A) + P(B)
* **Conditional Probability**
	* denoted by P (A|B), reads "the probablity of A given B"
	* joint probabilities (gives the probability of the intersection of two events) and joint probability table
	* marginal probabilities are the probabilities located in the margins of the joint probability table
	* P(A|B) = P(A intersects B)/P(B): we will observe event A given that event B has already occurred
	* if P(A|B) = P(A) or P(B|A) = P(B), we would say that A and B are indenpendent event
	* **Multiplication Law**: P(A X B) = P(B) * P(A|B) = P(A) * P(B|A)
	* for independent events A and B, P(AXB) = P(A) * P(B)

* **Bayes' Theorem**
	* Two event case: P(A1|B) = P(A1) * P(B|A1) / (P(A1) * P(B|A1) + P(A2) * P(B|A2))
	* P(A2|B) = P(A2) * P(B|A2) / (P(A1) * P(B|A1) + P(A2) * P(B|A2))
	* N event case: P(Ai|B) = P(Ai) * P(B|Ai) / sum[P(Ai) * P(B|Ai)]

# Chap 5 - Discrete Probability Distribution
* Random Variable: 
	* is a numerical description of the outcome of an experiment
	* **Discrete Random Variable**: a finite # of values or an infinite seq of values. Naturally, we could digitalize the experiment outcomes, like 0/1 for service shutdown or not.
		* Randome experiment: Flip a coin, face of coin showing, 1 if heads; 0 if tails;
		* Roll a die, # of dots showing on top of ide, random variables: 1,2,3,4,5,6
* Nomial Distribution
* Poisson Distribution

# Chap 6 - Continuous Probability Distribution
* Normal distribution
* Exponential distribution
* Uniform distribution

# Chap7 - Sampling and Sampling Distribution
## **Sec7.1**
* Definition

An *element* is the entity on which data are collected.

An *population* is the collection of all the elements of interest.

A *sample* is a asubset of the population.

The purpose of sampling is to collect data to make an inference and answer research questions about a population.

A sample mean provides an estimate of a population mean, and a sample proportion provides an estimate of a population proportion.

The sampled population is the population from which the sample is drawn, and a frame is a list of the elements from which the sample will be selected.

## Simple Random Sampling 简单随机抽样

Numerical characteristics of a population are called *parameters*.

### Sampling froma finite population
A simple random sample of size *n* from a finite population of size *N* is a sample selected such that each possible sample of size *n* has the same probability of being selected.

### Sampling from an infinite population
A random sample of size *n* from an infinite population is a sample selected such that the following conditions are satisfied:
1. each element selected comes from the same population
2. each element is selected independently to avoid selection bias
it's usually associated with a process that operates over time.
	* factory production line
	* lab experimental trials
	* transactions at a bank
	* helpdesk calls within a day

The # of different smiple random samples of size n over N is $N!/n!(N-n)!$

## Point Estimation 点估计/定值估计
**Definition** 

We call the sample statistics, like sample mean $\overline x$ , sample proportion $\overline p$, sample standard deviation $s$ as **point estimate** and use them to predict the population parameters/statistics, like population mean $\mu$, proportion $p$, and standard deviation $\sigma$.

**Highlights**

* Point estimation is a form of statistical inference.
* S.t. sampled population may not be same as target population. Thus, whenever a sample is used to make inferences about a population, we should make sure that the study is designed so that the sampled population and the target population are in close agreement.

## Introduction to Sampling Distributions
* Probability distribution of $\overline x$ is called the sampling distribution of $\overline x$.
* The sample mean $\overline x$ is a random variable. If we consider the process of selecting a simple random sample as an experiment, the sample mean $\overline x$ is the numerical description of the outcome of the experiment.
* When the expected value of a point estimator equals the population parameter, we say the point estimator is **unbiased**. For example, $E(\overline x)=\mu$ means $\overline x$ is an unbiased estimator of the population mean $\mu$.
* $\sigma\overline x$ has two formulas for the standard deviation of $\overline x$
	* finite population: $\sigma\overline x = \sqrt{N-n/N-1}(\sigma/\sqrt n)$
	* infinite population: $\sigma\overline x = \sigma/\sqrt n$
	* $\sqrt{(N-n)/(N-1)}$ is commonly referred to as the *finite population correction factor*. The value of factor equals to 1  means the population is infinite, or $n/N \le .05$
	* the term *standard error* is used throughout statistical inference to refer to the standard deviation of a point estimator.
	* **Central Limit Theorem** In selecting random samples of size $n$ from a population, the sampling distribution of the sample mean $\overline x$ can be approximately by a *normal distribution* as the sample size becomes large.
* Sampling distribution of $\overline p$
	* Expected value of $E(\overline p) = p$
	* Standard Deviation of $\overline p$, for finite population is $\sigma\overline p = \sqrt{N-n/N-1}\sqrt{p(1-p)/n}$, the correction factor is 1 if the sample size is less ($n/N \le .05$) enough or the population is infinite.
	* The sampling distribution of $\overline p$ can be approximately by a **normal distribution** whenver $np \ge 5$ and $n(1-p) \ge 5$


