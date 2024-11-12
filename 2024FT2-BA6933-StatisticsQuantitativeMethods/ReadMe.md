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

Two-step procedures:
1. Assign a random number to each element of the population
2. Select the $n$ elements corresponding to the $n$ smallest random numbers

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
### 7.5 Sampling distribution of $\bar x$
The sample mean $\overline x$ is a random variable. If we consider the process of selecting a simple random sample as an experiment, the sample mean $\overline x$ is the numerical description of the outcome of the experiment.

The sampling distribution of $\bar x$ is the probability distribution of all possible values of the sample mean $\bar x$.
* Expected value $E(\bar x)=\mu$, where $E(\bar x)$ = the expected value of $\bar x$, $\mu$ is the population mean.

* When the expected value of a point estimator equals the population parameter, we say the point estimator is **unbiased**. For example, $E(\overline x)=\mu$ means $\overline x$ is an unbiased estimator of the population mean $\mu$.
### Standard Error/Standard Deviation $\sigma \bar x$
* $\sigma\overline x$ has two formulas for the standard deviation of $\overline x$
	* finite population: $\sigma\overline x = \sqrt{N-n/N-1}(\sigma/\sqrt n)$
	* infinite population: $\sigma\overline x = \sigma/\sqrt n$
	* $\sqrt{(N-n)/(N-1)}$ is commonly referred to as the *finite population correction factor*. The value of factor equals to 1  means the population is infinite, or $n/N \le .05$
	* the term *standard error* is used throughout statistical inference to refer to the standard deviation of a point estimator.
	* **Central Limit Theorem** In selecting random samples of size $n$ from a population, the sampling distribution of the sample mean $\overline x$ can be approximately by a *normal distribution* as the sample size becomes large.
* Sampling distribution of sample proportion $\overline p$
	* Expected value of $E(\overline p) = p$ (population proportion)
	* Standard Deviation/Error of $\overline p$, for finite population is $\sigma\overline p = \sqrt{N-n/N-1}\sqrt{p(1-p)/n}$, the correction factor is 1 if the sample size is less ($n/N \le .05$) enough or the population is infinite.
	* Because a binomial distribution can be approximated by a normal distribution whenever the sample size is large enough to satisfy the following two conditions. Thus, the sampling distribution of $\overline p$ can be approximately by a **normal distribution** whenver $np \ge 5$ and $n(1-p) \ge 5$

# Chap 8
**Learning Objectives**

1.	Know how to construct and interpret an interval estimate of a population mean and/or a population proportion.

2.	Understand and be able to compute the margin of error.

3.	Learn about the t distribution and its use in constructing an interval estimate for a population mean when is unknown.

4.	Be able to determine the size of a simple random sample necessary to estimate a population mean and/or a population proportion with a specified margin of error.

5.	Know the definition of the following terms:

	confidence interval	
	margin of error
	confidence coefficient	
	degrees of freedom
	confidence level
## 8.2 Population mean: $\sigma$ unknown
**t distribution**
If population $\sigma$ is unknown, we must use the same sample to estimate both $\mu$ and $\sigma$, this is called $\sigma$ unknown case.

When $s$ is used to estimate $\sigma$, the margin of error and the interval estimate of the population mean are based on a probability distribution known as the $t$ distribution. 

The $t$ distribution is a family of similar probability distributions, with a specific $t$ distribution depending on a parameter known as the degree of freedom.

* the mean of the $t$ distribution is zero
* t distribution with more degrees of freedom shows less variability and more closely resembles the standard normal distribution.
* $t_{.025}$ gradually approaches to $z_{.025}$ as degree of freedom exceed 100 and increases to $\infty$
* interavl estimate of a population mean, $\sigma$ unknown is $\bar x \pm t_{\alpha/2}\frac{s}{\sqrt{n}}$, where $s$ is the sample standard deviation, $1-\alpha$ is the confidence efficient, and $t_{\alpha/2}$ is the t value providing an area of $\alpha/2$ in the upper tail of the $t$ distribution with $n-1$ degrees of freedom.


## 8.3 Determining the sample size
If a desired margin of error is selected prior to sampling, the procedures in this section can be used to determine the sample size necessary to satisfy the margin of error requirement.

* $\sigma$ known issue
	* the interval estimate is $\bar{x} \pm z_{\alpha/2} \frac{\sigma}{\sqrt{n}}$
	* margin error is $z_{\alpha/2} \frac{\sigma}{\sqrt{n}}$
	* once we selected a confidence coefficient $1-\alpha$, $z_{\alpha/2}$ can be determined.
	* Let $E$ be the margin of error, the formula to compute the sample size is $n=\frac{z_{\alpha/2}^2\sigma^2}{E^2}$
	* usually 95% confidence is the most frequently chosen value, then $z_{\alpha/2}$ is ($z_{.025}=1.96$)
* $\sigma$ unknown issue
	* if $\sigma$ is unknown, we can have a *preliminary/planning value* for $\sigma$. There methods are considered:
		* use the estimate of the population standard deviation computed from data of previous studies as the planning value of $\sigma$
		* use a pilot study
		* use judgement or a "best guess" $~= \frac{MAX-MIN}{4}$

Tips:
* The formula provides the min sample size needed to satisfy the desired margin of error. If the result is not an integer, rounding up to the next integer would provide a margin of error slightly smaller than required.

* Also, the formula above applies to sample size $n$ for infinite or a large finte population of size N, where $\frac{n}{N} \le .05$.
* However, if we have a finite population such that $\frac{n}{N} \gt .05$, a smaller sample size $n'$ can be used to obtain the desired margin of error by the computed $n$ and sample population $N$. use below formula $n' = \frac{n}{1+n/N}$

## Population Proportion
Interval estimate would be sample proportion $\bar p \pm E$ where E is the **margin of error**. The sampling distribution is key to compute the $E=z_{\alpha/2}\sigma\bar p$, we know that 100*(1-$\alpha$)%
	
* Earlier we know the sampling distribution of $\bar p$ can be approximated by a normal distribution whenever $np \ge 5$ and $n(1-p) \ge 5$. The mean of sampling distribution of $\bar p$ is population proportion $p$, and the **standard error** of $\bar p$ is $\sigma \bar p=\sqrt{\frac{p(1-p)}{n}}$

* **Margin of error** for an interval estimate of a population is given by $E = z_{\alpha/2}\sqrt{\frac{\bar p(1-\bar p)}{n}}$

* Inversely, given margin of error E, the sample size could be estimated by $n=\frac{z_{\alpha/2}^2\bar p (1-\bar p)}{E^2}$

Tips: if none of the preceding alternative applies, use a planning value of $p^*=.50$

Confidence Table

| Confidence Level | $\alpha$ | $\alpha/2$ | $z_{\alpha/2}$ |
| -------- | ------- | ------- | ------- |
| 90% | 0.10 | 0.05 | 1.645 |
| 95% | 0.05 | 0.025 | 1.960 |
| 99% | 0.01 | 0.005 | 2.576 |

# Chap9 Hypothesis Tests
## 9.1 
**null hypothesis**:
* In hypothesis testing we begin by making a tentative assumption about a population parameter. This tentative assumption is called the **null hypothesis**
* is denoted by $H_0$.
* the hypothesis tests can be conducted about a population mean and a population proportion

**alternative hypothesis**
* the opposite of null hypothesis
* denoted by $H_a$

## Steps to develop alternative hypothesis as a Research Hypothesis
Many applications of hypothesis testing involve an attempt to gather evidence in support of a research hypothesis. In these situations, it is often best to begin with the alternative hypothesis and make it the conclusion that the researcher hopes to support.

The sample mean miles per gallon for these automobiles will be computed and used in a hypothesis test to determine if it can be concluded that the new system provides more than 24 miles per gallon. In terms of the population mean miles per gallon $\mu$, the research hypothesis $\mu > 24$ becomes the alternative hypothesis. We will make the tentative assumption that the new system is not any better than the current system and choose $\mu \le 24$ as the null hypothesis.
		$H_0: \mu \le 24$<br>
		$H_a: \mu > 24$

The conclusion that the research hypothesis is true is made if the sample data provide sufficient evidence to show that the null hypothesis can be rejected.

## The Null Hypothesis as an assumption to be challenged
Not all hypothesis tests involve research hypotheses. In the following discussion we consider applications of hypothesis testing where we begin with a belief or an assumption that a statement about the value of a population parameter is true. it is helpful to develop the null hypothesis

We let $\mu_0$ denote the hypothesized value and we must choose one of the following three forms for the hypothesis test.
| 1 | 2 | 3 |
|---|---|---|
$H_0: \mu \ge \mu_0$<br> | $H_0: \mu \le \mu_0$ | $H_0: \mu = \mu_0$
$H_a: \mu < \mu_0$ | $H_a: \mu > \mu_0$ | $H_a: \mu \ne \mu_0$

The 1st two forms are called one-tailed tests. The third form is called a two-tailed test.

The equality part of the expression always appears in the null hypothesis. In selecting the proper form of $H_0$ and $H_a$, keep in mind that the alternative hypothesis is often what the test is attempting to establish. Hence, asking if the user is looking for evidence to support $\mu < \mu_0, \mu > \mu_0, or \mu \ne \mu_0$ will help determine $H_a$

## Type I and Type II errors
If $H_0$ is true, we make a **Type I error**; that is, we reject $H_0$ when it is true.

If $H_a$ is true, we make a **Type II error**; that is, we accept $H_0$ when it is false.

**Level of Significance**: the probability of making a **Type I error** when the null hypothesis is true as an equality.
* denoted by $\alpha$
* common choices for $\alpha$ is .05 and .01

Applications of hypothesis testing that only control for the Type I error are called *significance tests*. Many applications of hypothesis testing are of this type.

## Population Mean: $\sigma$ known
### One-Tailed Test
One-tailed test about a Population mean usually in two forms:
| Lower Tail Test | Upper Tail Test |
| --- | --- |
|$H_0: \mu \ge \mu_0$ | $H_0: \mu \le \mu_0$ |
|$H_a: \mu < \mu_0$ | $H_a: \mu > \mu_0$ |
For hypothesis tests about a population mean in the $\sigma$ known case, we use the standard normal random variable $z$ as a **test statistic** to determine if $\bar x$ deviates from the hypothesized value of $\mu$. That is $z=\frac{\bar x - \mu_0}{\sigma / \sqrt{n}}$
* test statistic $z$ follows standard normal distribution. For example, the probability of p-value approach in the lower tailed testing is $p(z \le z_\alpha)=$ NORM.S.DIST($z_\alpha$, true).

**lower tail test**

How small must the test statistic Z be before we reject $H_0$ for lower tail test?
* p-value approach
	* a p-value is a probablity that provides a measure of the evidence against the $H_0$ provided by the sample.
	* smaller p-values indicate more evidence against $H_0$
	* rejection rule using p-value: reject $H_0$ if p-value $\le \alpha$
	* p-value is also called *observed level of significance*

* critical value approach
	* rejection rule: reject $H_0$ if $z \le -z_\alpha$, where -$z_\alpha$ is the ciritical value;

**upper tail test**

For upper tail test, using the standard normal distribution, compute the probability that z is greater than or equal to the value of the test statistic (area in the upper tail), that is reject $H_0$ if $z \ge z_\alpha$

### Two-Tailed Test about a population mean 
The form is:

$H_0: \mu = \mu_0$<br>
$H_a: \mu \ne \mu_0$

If the sample mean $\bar x$ is significantly less than 295 years or significantly greater than 295 yeards, we will reject $H_0$.

Question: Suppose $\bar x$ is 297.6, it's larger than 295 yards. Is this value enough larger to cause us to reject $H_0$?
* p-value approach
	* 1, compute the value of test statistic $z$
	* 2, if the value of $z_\alpha$ is in the upper tail, compute the probability $P(z \ge z_\alpha)$. If the value of $z_\alpha$ is in the lower tail. compute $P(z \le z_\alpha)$
	* 3, double the probability in step 2 to obtain the p-value
* critical value approach
	* Same as above, we will use the significance \alpha with the standard normal probability table to compute the test statistic $z$, for example, if $\alpha=.05$, test statistics are $-z_\alpha = -1.96$ and $z_\alpha = 1.96$. Reject $H_0$ if $z \le -z_{\alpha/2}$ or if $z \ge z_{\alpha/2}$

## A confidence interval approach to testing a hypothesis f the form
$H_0: \mu = \mu_0$<br>
$H_0: \mu \ne \mu_0$
1. select a simple random sample from the population and use the value of the sample mean $\bar x$ to develop the confidence interval for the population mean $\mu$. $\bar x \pm z_\alpha/2\frac{\sigma}{\sqrt{n}}$
2. If the confidence interval contains the hypothesized value $\mu_0$, do not reject $H_0$. Otherwise, reject $H_0$.
## Population Mean: $\sigma$ unknown
For the $\sigma$ unknown case, the test statistic has a $t$ distribution with n-1 degrees of freedom. that is $t=\frac{\bar x - \mu_0}{s/sqrt{n}}$

It's also similar for two-tailed test for $\sigma$ unknown case.

Using Excel T.DIST(test statistic, degrees of freedom, cumulative) function to compute a lower tail p-value.

Tip: remember when testing a hypothesis of the population mean with a sample size $n/N \ge .05$, the finite correction factor should be applied. i.e. $s_{\bar x} = \sqrt\frac{N-n}{N-1}(\frac{s}{\sqrt{n}})$

## Population Proportion Test Statistic
0. Given $np \ge 5$ and $n(1-p) \ge 5$, the sampling dist of $\bar p$ can be normal dist.
1. compute standard error $\sigma_{\bar p}=\sqrt\frac{p_0(1-p_0)}{n}$
2. compute test statistic $z=\frac{{\bar p} - p_0}{\sigma_{\bar p}}$
3. test statistic $z$ follows standard normal distribution.
4. upper tail test p-value = P($z \ge z_\alpha$)


# Chap10 Inference about Means and Proportions with two populations
**Learning Objectives**

1.	Be able to develop interval estimates and conduct hypothesis tests about the difference between two population means when $\sigma_1$ and $\sigma_2$ are known.

2.	Know the properties of the sampling distribution of $\bar x_1 - \bar x_2$ .

3.	Be able to use the t distribution to conduct statistical inferences about the difference between two population means when $\sigma_1$ and $\sigma_2$ are unknown.

4.	Learn how to analyze the difference between two population means when the samples are independent and when the samples are matched.

5.	Be able to develop interval estimates and conduct hypothesis tests about the difference between two population proportions.

6.	Know the properties of the sampling distribution of $\bar p_1 - \bar p_2$ .

## 10.1 Point Estimator of the difference between two population means: $\sigma_1$ and $\sigma_2$ known
The point estimator of the diff between two population means is the diff between the two sample means. 
* Point Estimator form is $\bar x_1 - \bar x_2$.
* Standard Error of $\bar x_1 - \bar x_2$ is the standard deviation of the sampling distribution of $\bar x_1 - \bar x_2$. Its form is $\sigma_{\bar x_1 - \bar x_2}=\sqrt{\frac{\sigma_1^2}{n_1} + \frac{\sigma_2^2}{n_2} }$
* if both populations have a normal distribution, or if the sample size are large enough, the sampling distribution of $\bar x_1 - \bar x_2$ have a normal distribution with mean equal to $\mu_1 - \mu_2$
* Interval estimate form is $\bar x_1 - \bar x_2 \pm$ Margin of error
* Margin of error = $z_{\alpha/2}\sigma_{\bar x_1 - \bar x_2}$
* Wrapup above, we conclude that interval estimate is $\bar x_1 - \bar x_2 \pm z_{\alpha/2}\sqrt{\frac{\sigma_1^2}{n_1} + \frac{\sigma_2^2}{n_2} }$, where $1-\alpha$ is the confidence coefficient.

**Hyppothesis Tests about $\mu_1 - \mu_2$**

Let $D_0$ to denote the hypothesized diff between $\mu_1$ and $\mu_2$
| lower tailed testing | upper tailed test | two tailed test |
| --- | --- | --- |
| $H_0: \mu_1 - \mu_2 \ge D_0$ | $H_0: \mu_1 - \mu_2 \le D_0$ | $H_0: \mu_1 - \mu_2 = D_0$ |
| $H_a: \mu_1 - \mu_2 < D_0$ | $H_0: \mu_1 - \mu_2 > D_0$ | $H_0: \mu_1 - \mu_2 \ne D_0$ |

The Test statistic for Hypothesis Tests about $\mu_1-\mu_2$ under $\sigma_1$ and $\sigma_2$ known case is: $z=\frac{(\bar x_1 - \bar x_2) - D_0}{\sqrt{\frac{\sigma_1^2}{n_1} + \frac{\sigma_2^2}{n_2} }}$

## 10.2 Point Estimator of the difference between two population means: $\sigma_1$ and $\sigma_2$ unknown
In this case, we will use the sample standard deviations (STDEV.S), $s_1$ and $s_2$, to estimate the unknown population STDEV.P. When we use the sample STDEV.S, the interval estimation and hypothesis testing procedures will be based on the $t$ distribution rather than the standard normal distribution.
* Wrapup above, we conclude that interval estimate is $\bar x_1 - \bar x_2 \pm t_{\alpha/2}\sqrt{\frac{s_1^2}{n_1} + \frac{s_2^2}{n_2} }$, where $1-\alpha$ is the confidence coefficient.
* The Degrees of Freedom for t distribution is: $df = \frac{(\frac{s_1^2}{n_1}+\frac{s_2^2}{n_2})^2}{\frac{1}{n_1-1}(\frac{s_1^2}{n_1})^2 + \frac{1}{n_2-1}(\frac{s_2^2}{n_2})^2}$. Then we will use the t distribution table to estimate the probability of $t_{\alpha/2}$.
* for example, $t.025$ = 2.012 with degree 47

**Hypothesis Tests about $\mu_1 - \mu_2$: $\sigma_1$ and $\sigma_2$ unknown**
* Using the form to compute test statistic $t=\frac{(\bar x_1 - \bar x_2) - D_0}{\sqrt{\frac{s_1^2}{n1} + \frac{s_2^2}{n_2}}}$. The degree of freedome for t are the same as above.
* compute the probability of t value: T.
