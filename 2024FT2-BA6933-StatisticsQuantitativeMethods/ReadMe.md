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
| $H_a: \mu_1 - \mu_2 < D_0$ | $H_a: \mu_1 - \mu_2 > D_0$ | $H_a: \mu_1 - \mu_2 \ne D_0$ |

The Test statistic for Hypothesis Tests about $\mu_1-\mu_2$ under $\sigma_1$ and $\sigma_2$ known case is: $z=\frac{(\bar x_1 - \bar x_2) - D_0}{\sqrt{\frac{\sigma_1^2}{n_1} + \frac{\sigma_2^2}{n_2} }}$

**Excel**: Excel’s z-Test: Two Sample for Means tool can be used to conduct the hypothesis test to determine whether there is a significant difference in population means when $\sigma_1$, $\sigma_2$ are assumed known.

## 10.2 Point Estimator of the difference between two population means: $\sigma_1$ and $\sigma_2$ unknown
In this case, we will use the sample standard deviations (STDEV.S), $s_1$ and $s_2$, to estimate the unknown population STDEV.P. When we use the sample STDEV.S, the interval estimation and hypothesis testing procedures will be based on the $t$ distribution rather than the standard normal distribution.

**Hypothesis Tests about $\mu_1 - \mu_2$: $\sigma_1$ and $\sigma_2$ unknown**
* Test statistic: $t=\frac{(\bar x_1 - \bar x_2) - D_0}{\sqrt{\frac{s_1^2}{n1} + \frac{s_2^2}{n_2}}}$. 
	
	where the degree of freedome for t are the same as above.
* Wrapup above, we conclude that interval estimate is $\bar x_1 - \bar x_2 \pm t_{\alpha/2}\sqrt{\frac{s_1^2}{n_1} + \frac{s_2^2}{n_2} }$, where $1-\alpha$ is the confidence coefficient.
* The Degrees of Freedom for t distribution is: $df = \frac{(\frac{s_1^2}{n_1}+\frac{s_2^2}{n_2})^2}{\frac{1}{n_1-1}(\frac{s_1^2}{n_1})^2 + \frac{1}{n_2-1}(\frac{s_2^2}{n_2})^2}$. We then will round down to the nearest whole number.

Then we will use the t distribution table to estimate the probability of $t_{\alpha/2}$.
* for example, $t.025$ = 2.012 with degree 47 or compute the probability of t value: T.INV.2T($\alpha$, df)

**Excel**: Excel’s t-Test: Two-Sample Assuming Unequal Variances tool can be used to conduct a hypothesis test to determine whether there is a significant difference in population means when the population standard deviations are unknown. 

## 10.3 Inferences about the Diff between two population Means: Matched Samples
In choosing the sampling procedure that will be used to collect production time data and test the hypothesis, there are two alternative designs:
1. *Independent sample design*: a random sample of workers is selected and each worker in the sample uses method 1.  A second independent random sample for method 2.
2. *Matched sample design*: one random sample is selected, each worker first uses one mehtod and then uses the other method. The order of the two methods is assigned randomly to the workers. Each worker provides a pair of data values.

In the matched sample design, it often leads to a smaller sampling error than the indenpendent sample design. The reason is that in a matched sample design, variation bet. workers is eliminated bcz the same workers are used for both production methods.

Let $\mu_d$ = the mean of the difference in values for the population of workers. The form of null/alternative hypotheses are:<br>
$H_0: \mu_d = 0$<br>
$H_a: \mu_d \ne 0$

The sample mean and sample STDEV is <br>
* $\bar d = \frac{\sum d_i}{n}$<br>
* $s_d = \sqrt\frac{\sum(d_i - \bar d)^2}{n-1}$

	Assumption: the population of differences has a normal distribution, then the following test statistic has a $t$ distribution with n-1 degrees of freedom.
* Test Statistic for hypothesis tests involving matched samples:
$t = \frac{\bar d - \mu_d}{s_d/\sqrt{n}}$

	Using excel to get the t.025 = T.INV(1-0.25, df)
* p-value: T.DIST(test statistic, degree of freedom, true)
* margin of error: $t_{.025}\frac{s_d}{\sqrt{n}}$
* interval estimate: $\bar d \pm t_{.025}\frac{s_d}{\sqrt{n}}$

Generally speaking, the matched sample approach provides better precision than the independent sample approach. However, in some cases, it's hard or costly to practice matching procedures.

**Excel**: Excel’s t-Test: Paired Two Sample for Means tool can be used to conduct a hypothesis test about the difference between the population means when a matched sample design is used.

## 10.4 Inferences population proportion $p_1 - p_2$
Letting $p_1$ denote the proportion for population 1 and $p_2$ denote the proportion for population 2.
* **Point Estimator**: $\bar p_1 - \bar p_2$
* **Standard Error**: $\sigma_{\bar p_1 - \bar p_2} = \sqrt{\frac{p_1(1-p_1)}{n_1} + \frac{p_2(1-p_2)}{n_2}}$

	If the sample sizes are large enough that $n_1p_1, n_1(1-p_1), n_2p_2, n_2(1-p_2)$ are all greater than or equal to 5, the sampling distribution of $\bar p_1 - \bar p_2$ can be similar to a normal distribution.
* **Margin of Error** = $z_{\alpha/2}\sqrt{\frac{p_1(1-p_1)}{n_1} + \frac{p_2(1-p_2)}{n_2}}$
* **Interval Estimate**: $\bar p_1 - \bar p_2 \pm z_{\alpha/2}\sqrt{\frac{p_1(1-p_1)}{n_1} + \frac{p_2(1-p_2)}{n_2}}$, where 1-$\alpha$ is the confidence coefficient.

**Hypothesis Tests about $p_1 - p_2$**
| lower tailed testing | upper tailed test | two tailed test |
| --- | --- | --- |
| $H_0: p_1 - p_2 \ge 0$ | $H_0: p_1 - p_2 \le 0$ | $H_0: p_1 - p_2 = 0$ |
| $H_a: p_1 - p_2 < 0$ | $H_a: p_1 - p_2 > 0$ | $H_a: p_1 - p_2 \ne 0$ |

Suppose $p_1 = p_2 = p$, $\sigma_{\bar p_1 - \bar p_2} = \sqrt{p(1-p)(\frac{1}{n_1} + \frac{1}{n_2})}$

With p unknown, we pool the point estimators from the two samples ($\bar p_1, \bar p_2$), 
* **pooled estimator of p**: $\bar p = \frac{n_1\bar p_1 + n_2\bar p_2}{n_1 + n_2}$

* **Test Statistic** for $p_1 - p_2$: $z = \frac{\bar p_1 - \bar p_2}{\sqrt{\bar p(1-\bar p)(1/n_1 + 1/n_2)}}$


# Chap 11 Inferences about population variances
Learning Objectives

1.	Understand the importance of variance in a decision-making situation.

2. Understand the role of statistical inference in developing conclusions about the variance of a single population.

3.	Know that the sampling distribution of $(n-1)s^2/\sigma^2$ has a chi-square distribution and be able to use this result to develop a confidence interval estimate of $\sigma^2$.

4.	Be able to compute p-values using the chi-square distribution.

5.	Know how to test hypotheses involving $\sigma^2$.

6.	Understand the role of statistical inference in developing conclusions about two population variances.

7.	Know that the sampling distribution of $s_1^2/s_2^2$ has an $F$ distribution and be able to use this result to test hypotheses involving two population variances.

8.	Be able to compute $p$-values using the $F$ distribution.

## 11.1 Inferences about a population variance
To predict the population variance $\sigma^2$, we have
* Sample variance a s Point Estimator: $s^2 = \frac{\sum(x_i - \bar x)^2}{n-1}$

Whenever a random sample of size $n$ is selected from a normal population, the sampling distribution of the quantity $\frac{(n-1)s^2}{\sigma^2}$ has chi-square distribution with $n-1$ degrees of freedom.

* $X_\alpha^2$: the value for the chi-square distribution that provides an area or probability of $\alpha$ to the right of the $X_\alpha^2$ value.
	* $X_{.025}^2 = 32.852$ indicates that 2.5% of the chi-square distribution with 19 degrees of freedom values are to the right of 32.852
	* $X_{.975}^2 = 8.907$ indicates that 97.5% of the chi-square distribution with 19 degrees of freedom values are to the right of 8.907.
	* There is a .95 probability of obtaining a $X^2$ value such that <br> $X_{.975}^2 \le X^2 \le X_{.025}^2$. That is <br><br> $X_{.975}^2 \le \frac{(n-1)s^2}{\sigma^2} \le X_{.025}^2$. That is <br><br> $\frac{(n-1)s^2}{X_{.025}^2} \le \sigma^2 \le \frac{(n-1)s^2}{X_{.975}^2}$

The general form of interval estimate of a population variance:<br>
$\frac{(n-1)s^2}{X_{\alpha/2}^2} \le \sigma^2 \le \frac{(n-1)s^2}{X_{1-\alpha/2}^2}$
<br>, where $X^2$ are based on a chi-square distribution with $n$-1 degrees of freedom, 1-$\alpha$ is the confidence coefficient.

**Hypothesis Test**
* $\sigma_0^2$: the hypothesized value for the population variance, three forms:

| lower tailed testing | upper tailed test | two tailed test |
| --- | --- | --- |
| $H_0: \sigma^2 \ge \sigma_0^2$ | $H_0: \sigma^2 \le \sigma_0^2$ | $H_0: \sigma^2 = \sigma_0^2$ |
| $H_a: \sigma^2 < \sigma_0^2$ | $H_a: \sigma^2 > \sigma_0^2$ | $H_a: \sigma^2 \ne \sigma_0^2$ |

* Test statistic for hypothesis test is:<br>
$X^2 = \frac{(n-1)s^2}{\sigma_0^2}$, <br>
where $X^2$ has a chi-square distribution with $n-1$ degrees of freedom.

Either p-value or critical value approach could be used to determine rejection.

## 11.2 Inferences about two population variances
The $F$ distribution is based on sampling from two normal populations.

**Sampling Distribution of $s_1^2/s_2^2$ when $\sigma_1^2 = \sigma_2^2$**

Whenever independent random samples of sizes $n_1$ and $n_2$ are selected from two normal populations with equal variances, the sampling distribution of <br> $s_1^2/s_2^2$
<br>
has an $F$ distribution with $n_1-1$ degrees of freedom for the numerator and $n_2-1$ degrees of freedom for the denominator; $s_1^2$ is the sample variance for the random sample of $n_1$ items from population 1 and $s_2^2$ is the sample variance for the random sample of $n_2$ items from population 2.

The Hypotheses are:<br>
$H_0: \sigma_1^2 = \sigma_2^2$<br>
$H_a: \sigma_1^2 \ne \sigma_2^2$<br>
We make the tentative assumption that the population variances are equal and assume **the population providing the larger sample variance as population 1.**

the $F$ distribution is not symmetric, and the $F$ values can never be negative. The shape of any particular $F$ distribution depends on its **numerator** and **denominator** degrees of freedom.

Excel can compute the probability $p(F)=2$*F.DIST.RT(2.4, nominator, denominator).

If we use critical values with an area of $\alpha/2$ in each tail of the distribution, because the value of the test statistic computed using $s_1^2/s_2^2$ will always be in the upper tail, we only need to determine the upper tail critical value. Even though we use a two-tailed test, the rejection rule is stated as follows: Reject $H_0$ if $F \ge F_{\alpha/2}$

A one-tailed hypothesis test about two population variances will always be formulated as an upper tail test:<br>
$H_0: \sigma_1^2 \le \sigma_2^2$<br>
$H_a: \sigma_1^2 > \sigma_2^2$<br>

# Chap12 Tests of Goodness of Fit, Independence, and Multiple Proportions
**Learning Objectives**

1.	Know how to conduct a goodness of fit test.

2.	Know how to use sample data to test for independence of two variables.

3.	Understand the role of the chi-square distribution in conducting tests of goodness of fit and independence.

4.	Be able to conduct a goodness of fit test for cases where the population is hypothesized to have a multinomial distribution.

5.	For a test of independence, be able to set up a contingency table, determine the observed and expected frequencies, and determine if the two variables are independent.

6.	Be able to use p-values based on the chi-square distribution.

In this chapter, we introduce three hypothesis testing procedures that extend our ability to make statistical inferences about populations. Specifically, we consider a test statistic based on the chi-square ($X^2$) distribution. These tests are all based on comparing observed sample results with those that are expected when the null hypothesis is true. How "close" the sample results are to the expected results?

All three hypothesis tests are designed for use with categorical data. In cases in which data are not naturally categorical, we define categories and consider the observation count in each category.
* The goodness of fit test is to test whether a frequency distribution developed from categorical data is a good fit to a hypothesized probability distribution for the population.
* The chi-square test of independence is to test if two categorical variables sampled from one population are independent.
* The chi-square test for determining if the population proportion are equal across multiple populations.

## 12.1 Goodness of Fit Test
The chi-square goodness of fit test can verify if a random variable has a specific probability distribution.
* A multinomial probability distribution is an extension of the binomial probability distribution to the case where there are three or more categories of outcomes per trial.

**Test Statistic for Goodness of Fit**:<br>
$X^2 = \sum_{i=1}^k\frac{(f_i - e_i)^2}{e_i}$
<br> where $f_i$ = observed frequency for category $i$, $e_i$ = expected frequency for category $i$, $k$ = the number of categories.
<br> the test statistic has a chi-square distribution with $k-1$ degrees of freedom provided that the expected freq are 5 or more for all categories

We will reject the null hypothesis if the diff bet. the observed and expected freq are large. Thus the test of goodness of fit will always be an upper tail test.

**Multinomial Probability Distribution Goodness of Fit test**
1. State the null and alternative hypotheses
	* $H_0$: The population follows a multinomial probability distribution with specified probabilities for each of the $k$ categories
	* $H_a$: The population does not follow a multinomial probability distribution with the specified probabilities for each of the $k$ categories
2. Select a random sample and record the observed freq $f_i$ for each category
3. if the expected freq $e_i$ is at least 5 for each category, compute the value of the test statistic: $X^2 = \sum_{i=1}^k\frac{(f_i - e_i)^2}{e_i}$
4. Rejection rule:
<br> p-value approach: Reject $H_0$ if p-value $\le \alpha$
<br> Critical value approach: Reject $H_0$ if $X^2 \ge X_\alpha^2$
<br> where $\alpha$ is the significance confidence and k-1 degree of freedom

## 12.2 Test of Independence
The test is also based on comparing observed and expected frequencies. For this test we take one sample from a single population and record the values for two categorical variables. We then summarize the data by counting the number of responses for each combination of a category for variable 1 and a category for variable 2. The null hypothesis for this test is that the two categorical variables are independent.

The two-way table used to summarize the data is also referred to as a contingency table. Let us generalize the approach to compute expected freq by letting $e_{ij}$ denote the expected freq in row $i$ and column $j$ of the table of expected freq.

Generalizing this expression shows that the following formula can be used to compute the expected freq under the assumption that $H_0$ is true.
<br>$e_{ij} = \frac{(Row i Total)(Column j Total)}{Sample Size}$

**Test Statistic for Goodness of Fit**
<br>$X^2 = \sum_i\sum_j\frac{(f_{ij}-e_{ij})^2}{e_{ij}}$
<br> with $r$ rows and $c$ columns in the table, the chi-square distribution will have $(r-1)(c-1)$ degrees of freedom provided the expected freq is at least 5 for each cell.

### Chi-Square Test for independence of Two Categorical Variables
1. State the null and alternative hypothesis
	* $H_0$: the two categorical variables are independent
	* $H_a$: the two categorical variables are not independent
2. Select a random sample from the population and collect data for both variables for every element in the sample. Record the observed freq $f_{ij}$, in a table with $r$ rows and $c$ columns.
3. Assume the null hypothesis is true and compute the expected freq, $e_{ij}$
4. If the expected freq $e_{ij}$ is 5 or more for each cell, compute the test statistic:<br>
$X^2 = \sum_i\sum_j\frac{(f_{ij} - e_{ij})^2}{e_{ij}}$
5. Rejection rule:
<br> p-value approach: Reject $H_0$ if p-value $\le \alpha$
<br> critical value approach: Reject $H_0$ if $X^2 \ge X_\alpha^2$
<br> where the chi-square distribution has (r-1)(c-1) degrees of freedom and $\alpha$ is the significance confidence.

Tip:
* If there is dependence (association) bet. the two or more variables, the expected freq is calc by this form: **Column percentage = Col value / Column Total.**

## 12.3 Testing for Equality of Three or More population proportions
Using Chi-Square test statistic $X^2$ to make inference about the quality of population proportions for three or more populations. Denotes are:
<br> $p_1$ = population proportion for population 1
<br> $p_2$ = population proportion for population 2
<br> $p_3$ = population proportion for population 3
<br>...
<br> $p_k$ = population proportion for population k

The Hypothesis for the equality of the population proportions for $k \ge 3$ populations are as follows:
<br> $H_0: p_1 = p_2 = ... = p_k$
<br> $H_a$: Not all population proportions are equal

Expected Freq under the assumption $H_0$ is True
<br> $e_{ij} = \frac{(\sum_i)(\sum_j)}{\sum_{all}}$

Test Statistic (Chi-Square)
<br> $X^2 = \sum_i\sum_j\frac{(f_{ij} - e_{ij})^2}{e_{ij}}$
<br> where $f_{ij}$ = observed freq for the cell in row $i$ and column $j$
<br> $e_{ij}$ = expected freq for the cell in row $i$ and column $j$ under the assumption $H_0$ is true
<br> degree of freedom is $k-1$, $k$ is the # of population types, and $k \ge 3$
<br> provided the expected freq is 5 or more for each cell

Rejection Rule:
<br> p-value approach: Reject $H_0$ if p-value $\le \alpha$
<br> critical value approach: Reject $H_0$ if $X^2 \ge X_\alpha^2$

If we conclude the not all population proportions are equal, we need another step to find where differences exist. **Marascuilo procedure** is a multiple comparison procedure to implement this.
1. Compute the absolute value of the pairwise diff bet. sample proportions for each pair of populations
2. Select a level of significance $\alpha$ and compute the corresponding critical value for each pairwise comparison for $k$ population using below form:
<br> $CV_{ij} = \sqrt{X_\alpha^2}\sqrt{\frac{\bar p_i(1 - \bar p_i)}{n_i} + \frac{\bar p_j(1 - \bar p_j)}{n_j}}$
<br> where $X_\alpha^2$ = chi-square with a level of significance $\alpha$ and $k-1$ degrees of freedom
<br> $\bar p_i, \bar p_j$ = sample proportions for populations $i$, $j$
<br> $n_i, n_j$ = sample sizes for populations $i$, $j$

If the absolute value of any pairwise sample proportion diff $|\bar p_i - \bar p_j|$ exceeds its corresponding critical value $CV_{ij}$, the pairwise diff is significant at the .05 level of significance.

Tips:
* if the population has a multinomial distribution, the chi-square calc for the expected freq, $e_{ij}$ and the test statistic $X^2$ are same as two outcomes. The only diff is that degree freedom is $(r-1)(k-1)$ where r is the # of outcomes, k is the # of population types


# Chap 13. Experimental Design and Analysis of Variance
**Learning Objectives**

1.	Understand the basic principles of an experimental study.

2.	Understand the difference between a completely randomized design, a randomized block design, and a factorial experiment.

3.	Know the assumptions necessary to use the analysis of variance procedure.

4.	Understand the use of the F distribution in performing the analysis of variance procedure.

5.	Know how to set up an ANOVA table and interpret the entries in the table.

6.	Know how to use the analysis of variance procedure to determine if the means of more than two populations are equal for a completely randomized design, a randomized block design, and a factorial experiment.

7.	Know how to use the analysis of variance procedure to determine if the means of more than two populations are equal for an observational study.

8.	Be able to use output from Excel to solve experimental design problems.

9.	Know how to use Fisher’s least significant difference (LSD) procedure and Fisher’s LSD with the Bonferroni adjustment to conduct statistical comparisons between pairs of population means.

## 13.1 intro to Experimental Design and Analysis of Variance
Cause and effect relationships can be difficult to establish in observational studies, such relationships are easier to establish in experimental studies.
* Factor/Independent variable: can be **categorical, or quantitative**
* Treatment: an experiment with each factor
* Single-factor experiment: the experiment contains only one factor
* Multi-factor experiment: 
* Response variable: the outcomes of an experiment

**Randomization**:
* the first important principle of all experimental designs
* the process of assigning the treatments to the experimental units at random.

**Replication**
* the 2nd important principle of all experimental designs
* to repeat the experiment until we get desired outcome number

**Hypothesis Test**: we use the sample means to test the following hypotheses.
<br>$H_0: \mu_1 = \mu_2 = ... = \mu_k$
<br>$H_a:$ Not all population means are equal
* where $\mu_j$ = mean of the j-th population

**Assumptions for Analysis of Variance**

if the sample sizes are equal, analysis of variance is not sensitive to departures from the assumption of normally distributed populations.
1. For each population, the response variable is normally distributed.
2. The variance of the response variable, dentoed $\sigma^2$, is the same for all of the populations.
3. The observations must be independent.

If the variability among the sample means is small, it supports $H_0$; if the variability is large, it supports $H_a$.

If the null hypothesis is true, we can use the variability among the sample means to develop an estimate of $\sigma^2$. 

Suppose each sample will have come from the same normal distribution with mean $\mu$ and variance $\sigma^2$. The sampling distribution of $\bar x$ for a simple random sample of size $n$ from a normal population will be normally distributed with mean $\mu$ and variance $\sigma^2/n$. 

Actually, The best estimate of the mean of the sampling distribution of $\bar x$ is the mean or average of the sample means.
* Estimate of the mean of sampling distribution $\bar x = \frac{x_1 + x_2 + x_3 + ... + x_k}{k}$
* Variance of the $\bar x$: $s_{\bar x}^2=\frac{\sum_i(x_i - \bar x)}{k-1}$
* **Between-treatments Estimate** of $\sigma^2$ = $n$ * (Estimate of $\sigma_{\bar x}^2$) = $n*s_{\bar x}^2$
	* where $n$ is the size of random sample
	* $k$ is the # of categories
* **Within-treatments Estimate** of $\sigma^2$ = $\frac{\sigma_1^2 + \sigma_2^2 + ... + \sigma_k^2}{k}$
	* if the $H_0$ is false

In summary, the ANOVA is based on the two independent estimates of the common population variance $\sigma^2$. One is based on the variability among the sample means themselves, another is from the variability of the data within each sample. By comparing these two estimates of $\sigma^2$, we will be able to determine if the population means are equal.

## 13.2 Analysis of Variance and the completely randomized design
**Hypothesis Test**: we use the sample means to test the following hypotheses.
<br>$H_0: \mu_1 = \mu_2 = ... = \mu_k$
<br>$H_a:$ Not all population means are equal

* where $\mu_j$ = mean of the j-th population, we assume that a random sample of size $n_j$ has been selected from teach of the $k$ populations or treatments.
* $x_{ij}$ = value of observation $i$ for treatment $j$
* $n_j$ = # of observations for treatment $j$
* $\bar x_j$ = sample mean for treatment $j$
* $s_j^2$ = sample variance for treatment $j$
* $s_j$ = sample standard deviation for treatment $j$

### sample mean and sample variance for treatment $j$ 
* $\bar x_j = \frac{\sum_{i=1}^{n_j}x_{ij}}{n_j}$

* $s_j^2 = \frac{\sum_{i=1}^{n_j}(x_{ij} - \bar x_j)^2}{n_j - 1}$

* overall sample mean, denoted $\bar{\bar x} = \frac{\sum_{j=1}^k\sum_{i=1}^{n_j}x_{ij}}{n_T}$

	* where $n_T = n_1 + n_2 + ... + n_k$, if the size of each sample is n, $n_T = k*n$, then above formula can be converted to below <br>
$\bar{\bar x} = \frac{\sum_{j=1}^k\bar x_j}{k}$
	* a.k.a, the overall sample mean is just the average of the $k$ sample means.

### Between-Treatments Estimate of Population Variance
* sum of square due to treatments: SSTR = $\sum_{j=1}^kn_j(\bar x_j - \bar{\bar x})^2$

* mean square due to treatments: MSTR = SSTR/(k-1) = $\frac{\sum_{j=1}^kn_j(\bar x_j - \bar{\bar x})^2}{k-1}$

### Within-Treatments Estimate of Population Variance
* sum of squares due to error: SSE = $\sum_{j=1}^k(n_j - 1)s_j^2$

* mean square due to error: MSE = SSE/($n_T - k$) = $\frac{\sum_{j=1}^k(n_j - 1)s_j^2}{n_T - k}$

Comparing the Variance Estimates: The $F$ Test
<br> if the null hypothesis is true, MSTR and MSE provide two independent, unbiased estimates of $\sigma^2$, and from chap11 we know that for normal populations, the sampling distribution of the ratio of two independent estimates of $\sigma^2$ follows an $F$ distribution.
<br> Hence, if the null hypothesis is true and the ANOVA assumptions are valid, the sampling distribution of MSTR/MSE is an $F$ distribution, with numerator df=$k-1$, denominator df = $n_T - k$

### Test statistic for the equality of $k$ population Means: $F = \frac{MSTR}{MSE}$
Because we will only reject the null hypothesis for large values of the test statistic, the p-value is the *upper tail area of the $F$ distribution to the right of the test statistic*.

Rejection Rule:
* p-value approach: Reject $H_0$ if p-value $\le \alpha$
* critical value approach: Reject $H_0$ if $F \ge F_\alpha$
	* where using Excel function to compute it: $F_\alpha$ = F.INV.RT($\alpha$, df1, df2), with numerator df1 = $k-1$, denominator df2 = $n_T - k$

### ANOVA Table for a Completely Randomized Design
| Source of Variation | Sum of Squares | Degrees of Freedom|Mean Square|F| p-Value|
| --- | --- | --- | --- | --- | --- |
| Treatments | SSTR | k - 1| MSTR = $\frac{SSTR}{k-1}$ | $\frac{MSTR}{MSE}$ | |
| Error | SSE | $n_T - k$ | MSE = $\frac{SSE}{n_T - k}$ | | |
| Total | SST | $n_T - 1$ | | | |

* where SST = $\sum_{j=1}^k\sum_{i=1}^{n_j}(x_{ij} - \bar {\bar x})^2$, 

* SST = SSTR + SSE

That is to say SST can be partitioned into two sums of squares: the sum of squares due to the treatments and the sum of squares due to error. The process is called **partitioning**.

### Excel steps
1. Click Data tab
2. In the Analyze group, click Data Analysis
3. Anova: Single Factor from the list of Analysis Tools
4. Include label and data into `input range`
5. Select `Columns` in the group by: area
6. [Optional]Select Labels in First Row

Tips:
1. The overall sample mean as a weighted average of the $k$ sample means:
<br> $\bar {\bar x} = \frac{\sum_{i=1}^kn_i\bar x_i}{n_T}$ 
<br> MSTR = $ns_{\bar x}^2$
<br> MSE = $\frac{\sum_{j=1}^ks_j^2}{k}$

## 13.3 Multiple Comparison Procedures
How multiple comparison procedures can be used to conduct statistical comparisons between pairs of population means.

### Fisher's Least Significant Difference (LSD)
**Fisher's LSD Procedure**
<br>$H_0: \mu_i = \mu_j$
<br>$H_a: \mu_i \ne \mu_j$

**Test Statistic**: t = $\frac{\bar x_i - \bar x_j}{\sqrt{MSE(1/n_i + 1/n_j)}}$

**Rejection Rule**
* p-value approach: Reject $H_0$ if p-value $\le \alpha$
* critical value approach: Reject $H_0$ if $t \le -t_{\alpha/2}$ or $t \ge t_{\alpha/2}$
	* where the value of $t_{\alpha/2}$ is based on a $t$ distribution with $n_T - k$ degrees of freedom

### Fisher's LSD Procedure based on the Test Statistic $\bar x_i - \bar x_j$
$H_0: \mu_i = \mu_j$<br>
$H_a: \mu_i \ne \mu_j$

**Test Statistic**: $\bar x_i - \bar x_j$

**Rejection Rule at a level of significance $\alpha$**: Reject $H_0$ if $|\bar x_i - \bar x_j| \ge LSD$
* where LSD = $t_{\alpha/2}\sqrt{MSE(1/n_i + 1/n_j)}$

### Confidence Interval Estimate of the Diff between two population Means using Fisher's LSD procedure
The confidence Interval Estimate: $\bar x_i - \bar x_j \pm LSD$
* where LSD = $t_{\alpha/2}\sqrt{MSE(1/n_i + 1/n_j)}$, and $t_{\alpha/2}$ is based on a $t$ distribution with $n_T - k$ degrees of freedom.
* where $t_{\alpha/2} = T.INV(1-\alpha/2, df)$

If the confidence interval includes the value zero, we cannot reject the hypothesis that the two population means are equal.

**Type 1 Error Rates**

Fisher's LSD procedure is also called Protected or restricted LSD because it is employed only if we first find a significant $F$ value by using analysis of variance. 
* **comparisonwise Type I error rate**: indicate the level of significance associated with a single pairwise comparison.
* **experimentwise Type I error rate**: denoted as $\alpha_{EW}$, when using Fisher's LSD procedure to make all the pairwise comparisons

If $\alpha_{EW}$ is too large, we could control it by using Bonferroni adjustment, involves using a smaller comparisonwise error rate for each test.
	* if we want to test $C$ pairwise comparison and want the max probability of making a Type I error for the overall experiment to be $\alpha_{EW}$, we simply use a comparisonwise error rate equal to $\alpha_{EW}/C$. 

## 13.4 Randomized Block Design
A completely randomized design is useful when the experimental units are homogeneous. If the experimental units are heterogeneous, **blocking** is often used to form homogeneous groups.

A problem can arise whenever differences due to extraneous factors cause the MSE term in this ratio to become large. the $F$ thus can become small. We present an experimental design known as a **randomized block design** to control some of the extraneous sources of variation by removing such variation from the MSE term.

**ANOVA Procedure**
* **SST = SSTR + SSBL + SSE**
	* where SST is the sum of squares total, <br>
	* SSTR is the sum of squares due to treatments <br>
	* SSBL is the sum of squares due to blocks <br>
	* SSE is the sum of squares due to error
		* k = the # of treatments
		* b = the number of blocks
		* $n_T$ = the total sample size ($n_T = kb$)

**ANOVA Table for the Randomized Block Design with k Treatments and b Blocks**
| Source of Variation | Sum of Squares | Degrees of Freedom|Mean Square|F| p-Value|
| --- | --- | --- | --- | --- | --- |
| Treatments | SSTR | k - 1| MSTR = $\frac{SSTR}{k-1}$ | $\frac{MSTR}{MSE}$ | |
| Blocks | SSBL | b - 1| MSBL = $\frac{SSBL}{b-1}$ | | |
| Error | SSE | $(k-1)(b-1)$ | MSE = $\frac{SSE}{(k-1)(b-1)}$ | | |
| Total | SST | $n_T - 1$ | | | |

* Step1: Compute the total sum of squares (SST): SST = $\sum_{i=1}^b\sum_{j=1}^k(x_{ij}-\bar {\bar x})^2$
* Step2: Compute the sum of squares due to treatments (SSTR): SSTR = $b\sum_{j=1}^k(\bar x_{.j} - \bar {\bar x})^2$
* Step3: Compute the sum of squares due to blocks (SSBL): SSBL = $k\sum_{i=1}^b(\bar x_{i.} - \bar {\bar x})^2$
* Step4: Compute the sum of squares due to error (SSE): SSE = SST - SSTR - SSBL
	* where $x_{ij}$ = value of the observation corresponding to treatment $j$ in block $i$
	* $\bar x_{.j}$ = sample mean of the jth treatment
	* $\bar x_{i.}$ = sample mean of the ith block
	* $\bar {\bar x}$ = overall sample mean

Excel: use Anova: two factor without replication

## 13.5 Factorial Experiment
A factorial experiment is an experimental design that allows simultaneous conclusions about two or more factors. The term *factorial* is used because the experimental conclusions about two or more factors.

* interaction refers to a new effect that we can now study because we used a factorial experiment.

**Hypothesis Test**
<br>$H_0$: factor $x_i$ has no significant effect on the result
<br>$H_a$: factor $x_i$ has significant effect on the result

**ANOVA Procedure**
* SST = SSA + SSB + SSAB + SSE
	* where SST is the sum of sqaures total
	* SSA is the sum of squares for factor A
	* SSB is the sum of squares for factor B
	* SSAB is the sum of squares for interaction
	* SSE is the sum of squares due to error
		* $a$ = # of levels of factor A
		* $b$ = # of levels of factor B
		* $r$ = # of replications
		* $n_T$ = total # of observations taken in the experiment; $n_T = abr$

**ANOVA Table - Two Factor with $r$ Replicaitons**
| Source of Variation | Sum of Squares | Degrees of Freedom|Mean Square|F| p-Value|
| --- | --- | --- | --- | --- | --- |
| Factor A | SSA | a - 1| MSA = $\frac{SSA}{a-1}$ | $\frac{MSA}{MSE}$ | |
| Factor B | SSB | b - 1| MSB = $\frac{SSB}{b-1}$ | $\frac{MSB}{MSE}$ | |
| Interaction | SSAB | (a-1)(b-1)| MSAB = $\frac{SSAB}{(a-1)(b-1)}$ | $\frac{MSAB}{MSE}$ | |
| Error | SSE | $ab(r-1)$ | MSE = $\frac{SSE}{ab(r-1)}$ | | |
| Total | SST | $n_T - 1$ | | | |

**Computations and Conclusions**
* $x_{ijk}$ = observation corresponding to the kth replicate taken from treatment i of factor A and treatment j of factor B
* $\bar x_{i.}$ = sample mean for observations in treatment i (factor A)
* $\bar x_{.j}$ = sample mean for observations in treatment j (factor B)
* $\bar x_{ij}$ = sample mean for observations corresponding to the combination of treatment i and j
* $\bar {\bar x}$ = overall sample mean of all $n_T$ observations

* Step1: Compute the total sum of squares SST = $\sum_{i=1}^a\sum_{j=1}^b\sum_{k=1}^r(x_{ijk} - \bar {\bar x})^2$
* Step2: Compute the sum of squares for factor A: SSA = $br\sum_{i=1}^a(\bar x_{i.} - \bar {\bar x})^2$
* Step3: Compute the sum of squares for factor B: SSB = $ar\sum_{j=1}^b(\bar x_{.j} - \bar {\bar x})^2$
* Step4: Compute the sum of squares for interaction: SSAB = $r\sum_{i=1}^a\sum_{j=1}^b(\bar x_{ij} - \bar x_{i.} - \bar x_{.j} + \bar {\bar x})^2$
* Step5: Compute the sum of squares due to error: SSE = SST - SSA - SSB - SSAB

# 14 Simple Linear Regression Model
## 14.1 Simple Linear Regression Model
For every restaurant in the population, there is a value of $x$ (student population) and a corresponding value of $y$ (quarterly sales). The equation that describes how $y$ is related to $x$ and an error term is called **regression model**.
* Simple Linear Regression Model: $y = \beta_0 + \beta_1x + \epsilon$
	* the equation that describes how the expected value of $y$, denoted by $E(y)$ is related to $x$ is called the **regression equation**.
	* Regression Equation: $E(y) = \beta_0 + \beta_1x$
	* Sample statistics (denoted by $b_0$, $b_1$) are computed as estimates of the population params $\beta_0$ and $\beta_1$. Substituting the values of the sample statistics $b_0$ and $b_1$ for $\beta_0$ and $\beta_1$ in the regression equation, we obtain the estimated regression equation: $\hat y = b_0 + b_1x$ or $E(y|x) = b_0 + b_1x$

## 14.2 Least Squares Method
Scatter diagram for regression analysis are constructed with the independent variable x on horizontal axis and the dependent variable y on the vertical axis.

The least squares method uses the sample data to provide the values of $b_0$ and $b_1$ that miminize the sum of the squares of the deviations between the observed values of the dependent variable $y_i$ and the predicted values of the dependent variable $\hat y_i$. 
* $min\sum(y_i - \hat y_i)^2$
	* $y_i$ = observed value of the dependent variable for the i-th observation
	* $\hat y_i$ = predicted value of the dependent variable for the i-th observation
* $b_1 = \frac{\sum(x_i - \bar x)(y_i - \bar y)}{\sum(x_i - \bar x)^2}$
* $b_0 = \bar y - b_1\bar x$

Excel: Insert Scatter (X, Y) or Bubble Chart

## 14.3 Coefficient of Determination
How to tell if our proposed regression model is a good fit for the actual dataset? We show that the **coefficient of determination** provides a measure of the goodness of fit for the estimated regression equation. It also means the percentage of the total sum of squares can be accounted for by the estimated regression equation.
* Sum of Squares due to Error: SSE = $\sum(y_i - \hat y_i)^2$
* Total sum of squares: SST = $\sum(y_i - \bar y)^2$
	* where $\bar y = \sum y_i/n$ 
* Sum of Squares due to Regression: SSR = $\sum(\hat y_i - \bar y)^2$
* $SST = SSR + SSE$
* Coefficient of Determination is denoted by $r^2 = SSR/SST$

The least squares method is the most widely used that provides an estimated regression equation that minimizes the sum of squared deviations bet. the observations and the predicted values. This is used to choose the best fit equation. Other alternative could be minimizing the sum of the absolute deviations bet. $y_i$ anad $\hat y_i$


The coefficient of determination provides a measure of the goodness of fit for the estimated regression equation. For the i-th observation:
* **Residual**: $y_i - \hat y_i$
* **Sum of Squares due to Error**: SSE = $\sum(y_i - \hat y_i)^2$
* **Total Sum of Squares**: SST = $\sum(y_i - \bar y)^2$
* **Sum of Squares due to Regression**: SSR = $\sum(\hat y_i - \bar y)^2$
* **Relationship**: SST = SSR + SSE
* **Coefficient of Determination**: $r^2 = \frac{SSR}{SST}$
* **Sample Correlation Coefficient**: $r_{xy}$ = (sign of $b_1)\sqrt{r^2}$
	* where $b_1$ is the slope of equation

Larger values of $r^2$ imply that the least sqaures line provides a better fit to the data; But using only $r^2$ cannot tell the relationship between x and y is statistically significant. It also involves the sample size and the properties of the appropriate sampling distributions of the least squares estimators.

**Corelation Coefficient**
* It shows how much the independent variable affects the dependent variable and if the correlation is positive or negative.
The Corelation Coefficient formula: $r = (n\sum{xy} - \sum{x}\sum{y})/\sqrt{(n\sum{x^2} - (\sum{x})^2)*(n\sum{y^2} - (\sum{y})^2)}$
	* $n$ = the # of data points

## 14.4 Model Assumption
The test of significance in regression analysis are based on the following assumptions about the error term $\epsilon$

Assumptions about the Error Term $\epsilon$ in the regression model: $y = \beta_0 + \beta_1x + \epsilon$
1. The error term $\epsilon$ is a random variable with a mean or expected value of zero; that is $E(\epsilon) = 0$
2. $E(\beta_0)=\beta_0$, $E(\beta_1)=\beta_1$, $E(y) = \beta_0 + \beta_1x$
3. The variance of $\epsilon$, denoted by $\sigma^2$, is the same for all values of x. The variance of y about the regression line equals $\sigma^2$ and is the same for all values x.
4. The values of $\epsilon$ are independent. The error term $\epsilon$ is a normally distributed random variable for all values of x.

## 14.5 Testing for Significance
The *mean square error(MSE)* provides the estimate of $\sigma^2$. It is SSE divided by its degrees of freedom.

* **Mean Square Error(Estimate of $\sigma^2$)**: $s^2 = MSE = \frac{SSE}{n - 2}$
* **Standard Error of the Estimate**: $s = \sqrt{MSE} = \sqrt{\frac{SSE}{n-2}}$

* **$t$ Test**
	* $H_0: \beta_1 = 0$
	* $H_a: \beta_1 \ne 0$
if $H_0$ is rejected, we will conclude that $\beta_1 \ne 0$ and that a statistically significant relationship exists bet. the two variabls.

* Expected value: $E(b_1) = \beta_1$
* Standard Deviation: $\sigma_{b_1} = \frac{\sigma}{\sqrt{\sum(x_i - \bar x)^2}}$
	* where $\sigma$ is normal distributed

Because we do not know the value of $\sigma$, we develop an estimate of $\sigma_{b_1}$ by $s_{b_1}$.
* Estimated Standard Deviation of $b_1$: $s_{b_1} = \frac{s}{\sqrt{\sum_(x_i - \bar x)^2}}$

### **Test Statistic**: $\frac{b_1 - \beta_1}{s_{b_1}}$
* it follows t distribution with n-2 degrees of freedom
	* if $H_0$ is true, and $t=b_1/s_{b_1}$

* **Rejection Rule**:
	* p-value approach: Reject $H_0$ if p-value $\le \alpha$
	* critical value approach: Reject $H_0$ if $t \le -t_{\alpha/2}$ or if $t \ge t_{\alpha/2}$
		* where $t_{\alpha/2}$ is based on a t distribution with n-2 degrees of freedom.

### Confidence Interval for $\beta_1 \pm t_{\alpha/2}s_{b_1}$
The point estimator is $b_1$ and the margin of error is $t_{\alpha/2}s_{b_1}$, $t_{\alpha/2}$ is the t value providing an area of $\alpha/2$ in the upper tail of a t distribution with n-2 degrees of freedom.

* If the hypothesized value of $\beta_1$ is contained in the confidence interval, do not reject $H_0$. Otherwise, reject $H_0$.

### F Test Statistics: F = MSR / MSE
* $H_0: \beta_1 = 0$
* $H_a: \beta_2 \ne 0$

* **Mean Square Due to regression**: MSR = SSR/Regression df
	* where regression df = # of independent variable = 1
* **Mean Square Error**: MSE = SSE / ($n_T - k$)
	* where regression $n_T$ = # of total sample size
	* k = # of variables = 2

**Rejection Rule**
* p-value approach: Reject $H_0$ if p-value $\le \alpha$
* critical value approach: Reject $H_0$ if $F \ge F_\alpha$
	* where $F_\alpha$ is based on an F distribution with 1 degree of freedom in the numerator and n-2 degrees of freedom

### General ANOVA Table for SLR
| Source of Variation | Sum of Squares | Degrees of Freedom|Mean Square|F| p-Value|
| --- | --- | --- | --- | --- | --- |
| Regression | SSR | 1| MSR = $\frac{SSR}{1}$ | $\frac{MSR}{MSE}$ | |
| Error | SSE | n-2 | MSE = $\frac{SSE}{n - 2}$ | | |
| Total | SST | n-1 | | | |
* where n is the # of key-pairs of $(x_i, y_i)$

## 14.6 Using the equation for estimation and prediction
The estimated equation is $y = b_0 + b_1x$
* $x^*$ = the given value of the independent variable x
* $y^*$ = the random variable denoting the possible values of the dependent variable y
* $E(y^*)$ = the mean or expected value of the dependent variable y when x = $x^*$
* ${\hat y}^*=b_0 + b_1x$ = the point estimator of $E(y^*)$ and the predictor of an individual value of $y^*$ when $x = x^*$

**Interval Estimation**
A **confidence interval** is an interval estimate of the mean value of y for a given value of x. A **prediction interval** is used whenever we want to predict an individual value of y for a new observation x.

* **Estimate Variance** of mean $\hat {y^*}$: <br>$s_{\hat y^*}^2 = s^2[\frac{1}{n} + \frac{(x^* - \bar x)^2}{\sum(x_i - \bar x)^2}]$
* **Estimate of standard deviation** of $\hat y^*$ is given below:
<br>$s_{\hat y^*} = s\sqrt{[\frac{1}{n} + \frac{(x^* - \bar x)^2}{\sum(x_i - \bar x)^2}]}$
* **Confidence Interval** $E(y^*)$ is: $\hat y^* \pm t_{\alpha/2}s_{\hat y^*}$
	* where the confidence is $1-\alpha$ and $t_{\alpha/2}$ is based on the $t$ distribution with $n-2$ degrees of freedom.
	* where n is the # of key-value $(x_i, y_i)$ pairs

Given above formulas, we noted that the estimated standard deviation of $\hat y^*$ is smallest when $x^* - \bar x = 0$. Thus, $s_{\hat y^*}=s\sqrt{1/n}$

* **Estimate of the Standard Deviation** of individual value of y: $s_{pred}=s\sqrt{1 + 1/n + \frac{(x^* - \bar x)^2}{\sum(x_i - \bar x)^2}}$
* **Margin of Error**: $t_{\alpha/2}s_{pred}$
* **Prediction Interval for $y^*$**: $\hat y^* \pm t_{\alpha/2}s_{pred}$
	* where confidence coeeficient is $1-\alpha$ and $t_{\alpha/2}$ is based on a $t$ distribution with $n-2$ degrees of freedom.

## 14.7 Excel tool - Analysis (Linear Regression)
* Step1. Choose X range
* Step2. Choose Y range
* Step3. Choose confidence 95, 99, etc
* Step4. Choose Output range

**Intepretation**
* First section is summary output, entitled regression statistics, contains **coefficient of determination ($r^2$)**
* Second section is titled ANOVA, contains the analysis of variable table.
* Last section contains the estimated regression coefficientes and related info.

## 14.8 Residual Analysis
Residual analysis is the primary tool for determining whether the assumed regression model is appropriate.
* Residual for Observation: $y_i - \hat y_i$
	* where $y_i$ is the observed value of the dependent variable
	* $\hat y_i$ is the predicted value of the dependent variable

If the assumption of $\epsilon$ assumptions are questionable, the hypothesis tests about the significance of the regression relationship and the interval estimation results may not be valid. The residuals provide the best information about $\epsilon$.
* A plot of the residuals against values of the independent variable x
* A plot of residuals against the predicted values of the dependent variable y
* A standardized residual plot
* A normal probability plot

**Conclusion**
* If the assumption that the variance of ϵ is the same for all values of x and the assumed regression model is an adequate representation of the relationship between the variables, the residual plot should give an overall impression of a horizontal band of points such as the one in Panel A of Figure 14.15. 

* However, if the variance of ϵ is not the same for all values of x—for example, if variability about the regression line is greater for larger values of x—a pattern such as the one in Panel B of Figure 14.15 could be observed. In this case, the assumption of a constant variance of ϵ is violated. 

* Another possible residual plot is shown in Panel C. In this case, we would conclude that the assumed regression model is not an adequate representation of the relationship between the variables. A curvilinear regression model or multiple regression model should be considered.

**Residual Plot Against x**

A residual plot against x is a graph in which the values of the independent variable are represented by the norizontal axis. $(x_i, y_i - \hat y_i)$

Panel A | Panel B | Panel C

**Residual Plot Against $\hat y$**
Another residual plot represents the predicted value of the dependent varible $\hat y$ on the horizontal axis and the residual values on the vertical axis. $(\hat y_i, y_i - \hat y_i)$

**Standardized Residuals**
As demonstrated in the preceding chapters, a random variable is standardized by substracting its mean and dividing the result by its standard deviation. With the least square method, the mean of the residuals is zero. Thus, simply dividing each residual by its standard deviation provides the **standardized residual**.

* **Standard Deviation of the i-th Residual**: $s_{y_i - \hat y_i} = s\sqrt{1 - h_i}$
	* where $s_{y_i - \hat y_i}$ = the standard deviation of residual $i$
	* $s$ = the standard error of the estimate
	* $h_i = 1/n + \frac{(x_i - \hat x)^2}{\sum{(x_i - \hat x)^2}}$
* **Standardized Residual for Observation $i$**: ${y_i - \hat y_i}/{s_{y_i - \hat y_i}}$

* **Outliers and influential Observations**
**Outlier** is a data point (observation) that does not fit the trend shown by the remaining data.

The standardized residuals can also be used to identify outliers. We recommend considering any observation with a standardized residual of $\le -2$ or $\ge +2$ as an outlier.

**Influential observation** is an observation that has a strong influence on the regression results. An influential observation may be an outlier, it may correspond to an x value far from its mean, or it may be caused by combination of a somewhat off-trend y value and a somewhat extreme x value.
* For simple linear regression, we consider observations as having high leverage if $h_i > 6/n$;

In simple linear regression, as the sample size increases:
* the p-value for the t-test used to determine whether a significant relationship exists between the dependent variable and the independent decreases;
* the confidence interval for the slope parameter associated with the independent variable narrows;
* the confidence interval for the mean value of y narrows;
* the prediction interval for an individual value of y narrows;