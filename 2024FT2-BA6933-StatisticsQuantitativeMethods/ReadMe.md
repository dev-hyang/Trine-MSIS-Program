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

	Using excel to get the $t_{.025}$ = T.INV(1-0.25, df)
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

# 15 Multiple Regression
1. Understand how multiple regression analysis can be used to develop relationships involving one dependent variable and several independent variables.

2.	Be able to interpret the coefficients in a multiple regression analysis.

3.	Know the assumptions necessary to conduct statistical tests involving the hypothesized regression model.

4.	Understand the role of Excel in performing multiple regression analysis.

5.	Be able to interpret and use Excel’s Regression tool output to develop the estimated regression equation.

6.	Be able to determine how good a fit is provided by the estimated regression equation.

7.	Be able to test for the significance of the regression equation.

8.	Understand how multicollinearity affects multiple regression analysis.


## 15.1 Introduction
Multiple regression is to study how a dependent variable $y$ is related to (>= 2) independent variables (factors).
* $p$ = the # of independent variables
* Multiple Regression Model: $y = \beta_0 + \beta_1x_1 + \beta_2x_2 + ... + \beta_px_p + \epsilon$
	* assumption 1: the mean or expected value of $\epsilon$ is 0, which leads to the mean/expected value of $y$, denoted by $E(y) = \beta_0 + \beta_1x_1 + \beta_2x_2 + ... + \beta_px_p$
* Estimated Multiple Regression Equation: $\hat y = b_0 + b_1x_1 + b_2x_2 + ... + b_px_p$
	* where $b_0, b_1, ..., b_p$ are the estimates of $\beta_0, \beta_1, ..., \beta_p$
	* $\hat y$ = predicted value of the dependent variable

## 15.2 Least Square method, Multiple Coefficient of Determination, Model Assumptions
* The Least Squares Criterion: min$\sum(y_i - \hat y_i)^2$ 
	* where $y_i$ = observed value, $\hat y_i$ = predicted value
For simple linear regression, we are okay to use formulas to compute the slop and y-intercept. However, in multiple regression, the parameters involve the use of matrix algebra and is beyond the scope of this text.

* **Relationship among SST, SSR, and SSE**
	* SST = SSR + SSE
		* where SST = total sum of squares = $\sum(y_i - \bar y)^2$
		* SSR = sum of squares due to regression = $\sum(\hat y_i - \bar y)^2$
		* SSE = sum of squares due to error = $\sum(y_i - \hat y_i)^2$
* Multiple Coefficient of Determination $R^2 = SSR / SST$
	* $R$-sq: when multiply 100, it can be interpreted as the percentage of the variability in $y$.
	* In general, $R^2$ always increases as independent variables are added to the model.
	* The larger $R^2$ is close to 1, the estimated Multiple Regression Equation provides a better fit.
* Adjusted multiple coefficient of determination: $R_a^2= 1 - (1 - R^2)\frac{n-1}{n - p -1}$
	* where $n$ = the # of observatoins
	* $p$ = the # of independent variables.
	* it's to avoid overestimating the impact of adding an independent varialbe on the # of variability.

* **Model Assumptions**
	* $E(\epsilon) = 0$
	* The variance of $\epsilon$ is denoted by $\sigma^2$ and is the same for all values of the independent variables.
	* The values of $\epsilon$ are independent.
	* The error term $\epsilon$ is a normally distributed random variable reflecting the deviation bet. the y value and the predicted value.

## 15.5 Testing for Significance, Prediction
Contrast to simple linear regression, the $t$ test and $F$ test have different purposes:
* **overall significance**: The $F$ test is used to determine whether a significant relationship exists bet. the dependent variable and the set of all the independent variables; we will refer to the $F$ test as the test for overall significance.
The $F$ Test for Overall Significance:
	* $H_0: \beta_0 = \beta_1 = ... = \beta_p = 0$
	* $H_a$: One ore more of the parameters is not equal to zero
		* if $H_0$ is rejected, the test gives us sufficient proof to conclude that at least 1 parameters is not zero and that the overall relationship between $y$ and the independent variables is significant. 
		* the total sum of squares SST has $n-1$ df
		* the **mean square due to regression** MSR = $SSR / p$, where $p$ is the # of independent variables.
		* the **mean square due to error** MSE = $SSE /(n - p - 1)$, where $n$ is the # of sample data points, the $p$ is same as above;
			* MSE provides an unbiased estimate of $\sigma^2$, the variance of the error term $\epsilon$: $\sigma^2$ = MSE 
			* If $H_0$ is true, MSR also provides an unbiased estimate of $\sigma^2$, thus, the MSR/MSE is close to 1.
			* if $H_0$ is false, MSR overestimates $\sigma^2$, the ratio becomes larger,
			* To determine how large the ratio MSR/MSE is so that we can reject $H_0$, we will use
				* the model assupmtions are valid,
				* the sampling distrubtion of the ratio follows $F$ distribution with $p$ in numerator df, and $n-p-1$ in denominator df.
			
	* Test Statistic: $F = \frac{MSR}{MSE}$
	* Rejection rules
		* p-value approach: Reject $H_0$ if p-value $\le \alpha$, where p-value = F.DIST.RT(test statistic, p, n-p-1)
		* critical-value approach: Reject $H_0$ if $F \ge F_{\alpha}$, where $F_{\alpha}$ = F.INV.RT($\alpha$, p, n-p-1)

* **individual significance**: The $t$ test is to determine if each of the individual independent variable is significant. A separate $t$ test is conducted for each of the independent variables in the model.
$t$ Test for Individual Significance, for any parameter $\beta_i$:
	* $H_0: \beta_i = 0$
	* $H_a: \beta_i \ne 0$
	* **Test Statisitc**: $t = b_i / s_{b_i}$, where
		* $s_{b_i}$ is the estimate of the standard deviation of $b_i$. The value can be computed by Excel.
	* **Rejection Rule**: 
		* p-value approach: Reject $H_0$ if p-value $\le \alpha$, where p-value = T.DIST.2T(test statistic, n-p-1)
		* critical value approach: Reject $H_0$ if $t \le t_{\alpha/2}$ or if $t \ge t_{\alpha/2}$, where $t_{\alpha/2}$ = T.INV(1-$\alpha$/2, n-p-1)

Use the Excel Tool - Linear Regression Analysis, you can find the individual signifiance just in the Summary Output for each row of independent variables and their corresponding t-statistics and p-values.

* **Multicollinearity**
The Term "independent variables" does not mean themselves are independent and instead they could be correlated. 
* The sample correlation coefficient $r_{x_ix_j}$ is used to determine the extent to which the independent variables $x_i,\, x_j$ are related.
	* A sample correlation coefficient $\ge 0.7$ or $\le -0.7$ for two independent variables could mean potential problems with multicollinearity. The multicollinearity could cause none of 
	the individual parameters are significantly different from zero when an $F$ test on the overall regression indicates a significant relationship. It further can cause the estimated 
	slope coefficients to be misleading.

Also, the change in $b_1$: the coefficient of $x_1$ if we drop $x_2$, means that the multicollinearity can explain the $x_1$ and $x_2$ are related.
And the change in $x_1$ will cause change in $x_2$.

* **Confidence Interval**
A confidence interval of the mean travel time for all trucks that travel 100 miles and make two deliveries.
$y = \hat y \pm t_{\alpha/2}s^*$, where $s^*$ is around 1.02 times standard deviation of regression 

* **Prediction Interval**
A prediction interval of the travel time for one specific truck that travels 100 miles and makes two deliveries.
$y = \hat y \pm t_{\alpha/2}\hat s$, , where $\hat s$  is around 1.05 times standard deviation of regression 

## 15.7 Categorical Independent Variables, Residual Analysis, Hypotheis on big data
The independent variables may be categorical or quantative. Categorical independent variables such as gender(male, female) and method of payments
(cash, credit card, check).
To incorporate the type of repair into the regression model, we define the following variable. 
$x_2 = 
\begin{cases}
	0 \; if\, the\, type\, of\, repair\, is\, mechanical\\
	1 \; if\, the\, type\, of\, repair\, is\, electrical
\end{cases}$
In regression analysis $x_2$ is called a **dummy or indicator variable**. Using this dummy variable, we can 
write the multiple regression model as <br>
$y = \beta_0 + \beta_1x_1 + \beta_2x_2 + \epsilon$
### Intepreting the Parameters
* $E(y) = \beta_0 + \beta_1x_1 + \beta_2x_2$
	* When a categorical variable is present, consider the case when  $x_2 = 0$ (mechanical repair).
	Using E(y|mechanical) to denote the mean or expected value of repair time given a mechanical repair.
	We have E(y|mechanical) = $\beta_0 + \beta_1x_1$
	* and for an electrical repair ($x_2 = 1$), we have
	E(y|electrical) = $\beta_0 + \beta_1x_1 + \beta_2$
	* $\beta_1$ is the change in $E(y)$ for a 1 unit change in $x_1$ holding $x_2$ constant.
	* $\beta_2 = E(y|electrical) - E(y|mechanical)$

* A categorical variable with $k$ levels must be modeled using $k-1$ dummy variables. Care must be  taken 
in defining and intepreting the dummy variables.
	* with each dummy variable being coded as 0 or 1

### Residule Analysis
* **Residual Plot against $y$**

We know that a residual plot against the independent variable $x$ can be used to validate the assumptions for 
a simple linear regression model. In multiple regression analysis, it's more common to develop a residual plot
against the predicted value $\hat y$. 
* the dependent variable $\hat y$ on the horizontal axis
* the residual values $y_i - \hat y_i$  on the vertical axis
* it's used to determine if the model's assumptions are satisified.

* **Standardized Residual Plot against $y$**

We know how to construct a standardized residual plot against $x$ and discussed how the standardized 
residual plot could be used to identify outliers and provide insight about the assumption that the error 
term $\epsilon$ has a normal distribution.
* we recommend any observation with a standardized residual of $\le -2$ or $\ge +2$ an outlier.

In multiple regression analysis, instead of developing a standardized residual plot against each of the 
independent variables, we will construct one standardized residual plot against the predicted values $\hat y$.

### Big Data and Hypothesis Testing in MLR
We know that p-value for the test of the hypothesis $H_0: \beta_1=0$ decreases as the sample size increases.
Likewise, for a given level of confidence, 
* the confidence interval for $\beta_1$, 
* the confidence interval for the mean value of $y$,
* the prediction interval for an in individual value $y$
narrows as the sample size increases. And same works for MLR.

Thus, we are more likely to reject the hypothesis that a relationship does not exist bet. the dependent variable
 and all independent variables as the sample size increases.


# 16 Regression Analysis: Model Building
**Learning Objectives**

1.	Learn how the general linear model can be used to model problems involving curvilinear relationships.

2.	Understand the concept of interaction and how it can be accounted for in the general linear model.

3.	Understand how an F test can be used to determine when to add or delete one or more variables.

4.	Develop an appreciation for the complexities involved in solving larger regression analysis problems.

5.	Understand how variable selection procedures can be used to choose a set of independent variables for an estimated regression equation.

6.	Know how the Durbin–Watson test can be used to test for autocorrelation.

7.	Learn how experimental design problems can be analyzed using a regression model.

## 16.1 General Linear Model (GLM)
Model buiding is the process of developing an estimated regression equation that describes the relationship bet. a dependent 
variable and one or more independent variables. The major issues are:
* finding the proper functional relationship 
* selecting the independent variables

Suppose we have collected data for one dependent variable $y$ and $k$ independent variables, our objective is to use
these data to develop an estimated regression equation that provides the best relationship bet. $y$ and all $x_i$.
* **General Linear Model**
$y = \beta_0 + \beta_1z_1 + \beta_2z_2 + ... + \beta_pz_p + \epsilon$
	* where $z_j$ is a function of $x_1, x_2, ..., x_k$
	* the simplest case is when we have collected data for just one variable is called Simple Linear Regression in Chap14.
		It's also called *simple first-order model with one predictor variable*
* **Modeling Curvilinear Relationships**
Example: Reynolds, Inc<br>
Sales = 111.2279 + 2.3768 Months<br>

	A linear relationship explains a high percentage of the variability in sales ($R^2=.7812). The standardized residule plot
suggests that a curvilinear relationship is present.
* To account for the curvilinear relationship, we set $z_1 = x_1$ and $z_2 = x_1^2$, then we have:<br>
Sales = 45.3476 + 6.3448 Months - 0.0345 MonthsSq
	* where MonthsSq = the square of the # of months the salesperson has been employeed
	* Note that the overall model is significant (p-value for $F$ test is 8.75E-07)
	* Note that p-value for MonthsSq = 0.0023 $\le$ 0.05 and we conclude that adding MonthsSq
		to the model involving Months is significant.
	* With the Adjusted $R^2$ value of .8859, we should be happy with the fit of new regression model.

* **Interaction**
If the original data set consits of observations for $y$ and two independent variables $x_1,\, x_2$, we 
can develop a **second-order** model with two predictor variables by substituting $z_1 = x_1, z_2 = x_2, 
z_3 = x_1^2, z_4 = x_2^2, z_5 = x_1x_2$ into the general linear model, which is:<br>
$y = \beta_0 + \beta_1x_1 + \beta_2x_2 + \beta_3x_1^2 + \beta_4x_2^2 + \beta_5x_1x_2 + \epsilon$
	* In above model, the variable $z_5 = x_1x_2$ is added to account for the potential effects, 
		called **interaction** of the two variables.

For example, Typler's belife that the # of units sold dependes linearly on selling price and advertising
expenditure (accounted for by the $\beta_1x_1$ and $\beta_2x_2$ terms), and that there is interaction bet.
the two variables (accounted for by the $\beta_3x_1x_2$).<br>
To account for the **interaction** effect, we will use below regression model:<br>
$y = \beta_0 + \beta_1x_1 + \beta_2x_2 + \beta_3x_1x_2 + \epsilon$
a.k.a $y = \beta_0 + \beta_1z_1 + \beta_2z_2 + \beta_3z_3 + \epsilon$	
* where $y$ = unit sales
	* $x_1$ = price 
	* $x_2$ = advertising expenditure

* **Transformation on the dependent variable**
If a linear regression shows a good fit for the estimated regression equation with p-value for $F$ test 
much smaller than $\le 0.05$. However, the variablity in the residules seem to increase as the value of 
$\hat y$ increases. That's to say, we have the wedge-shaped pattern indicative of a nonconstant variance.

**Logarithm Transformation**<br>
Often the problem of nonconstant variance can be corrected by transforming the dependent 
variable $y$ to a different scale.
	* for example, using logarithm (either $log_{10}$ or $ln$) of the dependent variable instead of original value would compress the
		values and thus diminish the effects of nonconstant variance.

**Reciprocal Transformation**<br>
Or an alternative approach to nonconstant variance is to use $1/y$ as the dependent variable instead of $y$.

It's hard to determine which transformation works better until we try both.

With transformation, nonlinear models that are intrinsically linear. For example:<br>
$E(y) = \beta_0\beta_1^x$<br>
---><br>
$ln{E(y)} = ln\beta_0 + x*ln{\beta_1}$<br>
---><br>
$y' = {\beta_0}' + {\beta_1}'x$ 

## 16.2 Determining when to add or delete variables
We will show how an $F$ test can be used to determine if it is advantageous to add one or more independent 
variables to a multiple regression model. This test is based on a determination of the amount of reduction
in the **error sum of squares (SSE)** resulting from adding one or more independent variables.

The following $F$ statistic provides the basis for testing if addition of $x_2$ is statistically significant:
<br> $F = \frac{(SSE(x_1) - SSE(x_1, x_2))/1}{SSE(x_1, x_2)/(n-p-1)}$
	* then Using Excel, p-value = F.DIST.RT(test statis, addition # of ind variables, n-p-1)
	* the above method is similar to be obtained by using the $t$ test for the significance of an individual
		parameter.
	* if the $t$ test shows that only one parameter is not significant, the corresponding variable can be
	dropped from the model.
	* however, if the $t$ test shows that two or more parameters are not significant, no more than one
		independent variable can ever be dropped from a model on the basis of a $t$ test;

### General case
Consider the following multiple regression model involving $q$ independent variables, where $q \lt p$.
<br> $y = \beta_0 + \beta_1x_1 + ... + \beta_qx_q + \epsilon$
<br> if we add variables x_{q+1}, ..., x_p,
<br> $y = \beta_0 + \beta_1x_1 + ... + \beta_qx_q +
	\beta_{q+1}x_{q+1} + ... + \beta_px_p + 
 \epsilon$

To test if the addition of $x_{q+1}, x_{q+2}, ..., x_p$ is statistically significant, the null and 
alternative hypothesis can be stated as follows:<br>
$H_0: \beta_{q+1} = \beta_{q+2} = ... = \beta_p = 0$<br>
$H_a:$ one or more of the paramters is not 0

The follow $F$ statistic provides the basic for testing:
$F = \frac{(SSE(x_1, x_2,..., x_q) - SSE(x_1, x_2,...,x_q,x_{q+1},...,x_p))/(p-q)}{SSE(x_1, x_2, ..., x_p)/(n-p-1)}$
* where p is the # of independent variables
* q = the addition # of independent variables
* p-value = F.DIST.RT(test statis, p-q, n-p-1)
* if p-value $\le \alpha$ or $F \gt F_{\alpha}$, we can reject $H_0$
	and conclude that the set of additional independent variables is statisticaly significant.

**Notes** Another format:
* SSE(reduced) = SST - SSR(reduced)
* SSE(Full) = SST - SSR(full)
<br>Hence
* SSE(reduced) - SSE(full) = [SST - SSR(reduced)] - [SST - SSR(full)] =
	SSR(full) - SSR(reduced)
* F = (SSR(full) - SSR(reduced)/# of extra terms)/MSE(full)

## 16.4 Variable Selection Procedures
* As a preliminary step: let us consider the sample correlation coefficients bet. each pair of variables.
* Remember if Multicollinearity can cause problems if the absolute value of the sample correlation coefficient exceeds 
.7 for any two of the independent variables.
* Recall that for the case of one independent variable, the square of this sample correlation coefficient is 
the coefficient of determination ($R^2$). 
* 1st we can build the regression equation based on the full list of all independent variables;
* then we can use the top 3-5 independent variables to build another regression equation, using the $F$ test if adding the extra terms could be significant or not.
	* Selecting either based on $t$ distribution ($p$-value)/ most significant independet variables 
	* or based on highest single correlation coefficients

**Four Variable Selection Procedures**
* Stepwise regression (Excel Tools can perform)
* forward Selection
* backward elimination
* best-subsets regression
The first three procedures are iterative, at each step of the procedure a single independent variable is added or deleted
and the new model is evaluated. The process continues until a stopping criterion indicates that the procedure cannot find
a better model.
	* ususally the selection criterion is based on $F$ statistic in ###16.2

The best-subsets procedure is not a one-variable-at-a time procedure; it evaluates regression models involving 
different subsets of the independent variables.

### Stepwise Regression
**Step1**: The stepwise regression procedure begins each step by determining if any of the variables already in the model should be removed.
It does so by first computing an $F$ statistic and corresponding p-value for each independent variable in the model.
* $\alpha$ is called **$p$ value to leave**
* if the $p$-value for any independent variable is greater than $p$ value to leave, the independent variable with largest $p$-value 
is removed from the model and the stepwise regression procedure begins a new step.

**Step2**: If no independent variable can be removed from the model, the procedure attempts to enter another independent variable into the model.
It does so by first computing an $F$ statistic and corresponding $p$-value for each independent variable that is not in the model.
* $\alpha$ is called **$p$ value to enter**
* THe independent variable with the smallest $p-value$ is entered into the model provided its $p-value$ is less than
	$p$ value to enter. The procedure continus in this manner until no independent variables can be deleted from or added to the model.

### Forward Selection
The forward selection procedure starts with no independent variables. It adds variablese one at a time using the same procedure as 
stepwise regression for determining if an independent variable should be entered into the model. 
* However, the forward selection procedure does not permit a variable to be removed from the model once it has been entered. 

The procedure stops when the $p-value$ for each of the
independet variaables not in the model is greater than $p$ value to Enter.

### Backward elimination
THe backward elimination procedure begins with a model that includes all the independent variables. It then deletes one independent 
variable at at time using the same procedure as stepwise regression.
* The backward elimination procedure does not permit an independent variable to be reentered once 
it has been removed.

The procedure stops when none of the independent variables in the model has a p-value greater than p Value to leave.

* Forward Selection and backward elimination may lead to different models.

### Best-Subsets Regression 
The above three approaches provide no guarantee that the best model for a given # of variables will be found.

Tools can be used to find the best fit given a specified # of independent variables. like 
* two best one-variable estimated regression equation
* two best two-variable regression equation 
* two best three-variable regression equation 

The criterion used in judging which is best are the value of coefficient of determination ($R^2$).

All above four methods can be implemented in Excel.

## 16.5 Multiple Regression to Experimental Design 
We will show how the use of dummy variables in a multiple regression equation can provide another 
approach to solving experimental design problems.

In general, if the factor involves $k$ distinct levels or treatments, we need to define $k-1$ dummy 
variables. For example:
* $E(y)$ = Expected value of the # of units produced per week
	<br> = $\beta_0 + \beta_1A + \beta_2B$
	* where $\beta_0$ is the expected value of the # of units assembled per week who uses C when A=0, B=0
	* For method A, when A=1, B=0, we have $E(y)=\beta_0 + \beta_1$
	* For method B, when A=0, B=1, we have $E(y)=\beta_0 + \beta_2$

After calculation, it's the same as we use Excel tools. We would conclude that the three methods 
do not differ if:
<br>$H_0: \beta_1 = \beta_2 = 0$
We will use the $F$ test for overall significance to determine if it can be rejected.

**Excercises:**
1. Write a multiple regression equation that can be used to analyze the data for a 
randomized block design involving three treatments and two blocks. Define all variables
	* The dummy variables are defined as follows:
		* Treatment1: $x_1=0, x_2=0$,
		* Treatment2: $x_1=1, x_2=0$,
		* Treatment3: $x_1=0, x_2=1$
		* $x_3=0$ if block is 1 and $x_3=1$ if block is 2.
		* $E(y) = \beta_0 + \beta_1x_1 + \beta_2x_2 + \beta_3x_3$

2. Write a multiple regression equation that can be used to analyze the data for a 
two-factorial design with two levels for factor A and three levels for factor B. Define all variables.
	* $Y = \beta_0 + \beta_1A + \beta_2B_1 + \beta_3B_2 + \beta_4(A*B_1) + \beta_5(A*B_2) + \epsilon$
		* For level A1: A = 0,
		* For level A2: A = 1,
		* For level B1: B1 = 1, B2 = 0
		* For level B2: B1 = 0, B2 = 1
		* For level B3: B1 = 0, B2 = 0, level B3 is the baseline and is not explicitly represented 
			to avoid multicollinearity
		* $A*B_1, A*B_2$: interaction terms for Factor A and two levels of Factor B.
			* $A*B_1$: interaction bet. A and B1
			* $A*B_2$: interaction bet. A and B2
		* $\beta_0$: intercept, representing the mean response at the baseline levels (A1, B3).
		* $\beta_1$: main effect of A 
		* $\beta_2, \beta_3$: main effect of B 

## 16.6 Autocorrelation and Durbin-Watson Test 
Often the data we used in statistic is not realtime. Therefore, the value of $y$ at time $t$, $y_t$, 
is related to previous time periods. We say **autocorrelatoin** or **serial correlation** exists in the data.
* if the value of $y$ in time is related to the value of $y$ in time period $t-1$, first-order autocorrelation
is present;
* if the value of $y$ in time is related to the value of $y$ in time period $t-2$, second-order autocorrelation
is present;

When autocorrelation exists, the error terms are not independent assumption is violated. In the case,
we denote $\epsilon_{t}$ as error at time $t$. In order to avoid this issue, precautions must be taken
to detect autocorrelation and adjusted.

**Durbin-Watson** statistic: $d$
Suppose the values of $\epsilon$ are not independent but are related as:<br>
$\epsilon_t = \rho\epsilon_{t-1} + z_t$
* where $\rho$ is a parameter with an absolute alue less than one,
	* if $\rho=0$, the error terms are not related, there is no autocorrelation
	* if $\rho>0$, we have positive autocorrelation
	* if $\rho<0$, we have negative autocorrelation
* $z_t$ is a normally and independently distributed random variable with a mean of zero and a variance of $\sigma^2$

Statistic $d = \frac{\sum_{t=2}^n(e_t - e_{t-1})^2}{\sum_{t=1}^n(e_t)^2}$
* where $e_i = y_i - \hat y_i$
* if successive values of the residules are close together(positive autocorrelation), the value of the Durbin-Watson
	test statistic will be small. If successive values of the residuals are far apart (negative), the value of the 
	Durbin-Watson statistic will be large.
* $d$ ranges [0, 4], if $d=2$, it means no autocorrelation.

**Hypothesis Test of Durbin-Watson statistic**
$H_0: \rho=0$
<br>$H_a: \rho>0$ is alternative hypothesis for positive autocorrelation
<br>$H_a: \rho<0$ is alternative hypothesis for negative autocorrelation
<br>$H_a: \rho \ne 0$ is two sided test

* for positive autocorrelation test 
if $d<d_L$, we conclude that positive autocorrelation is present;
<br> if $d_L \le d \le d_U$, we say the test is inconclusive;
<br> if $d \gt d_U$, we conclude that there is no evidence of positive autocorrelation;

* for negative autocorrelation test
if $d>4-d_L$, we conclude that negative autocorrelation is present;
<br> if $4-d_U \le d \le 4-d_L$, we say the test is inconclusive;
<br> if $d \lt 4-d_U$, we conclude that there is no evidence of positive autocorrelation;

* for two-sided test
If $d<d_L \;or\; d>4-d_L$, we reject $H_0$ and autocorrelation is present.
<br> If $d_L \le d \le d_U \; or \; 4-d_U \le d \le 4-d_L$, we say it's inconclusive;
<br> If $d_U < d < 4-d_U$, we say there is no evidence of autocorrelation.

Tips: The Durbin-Watson list the smallest sample size as 15. 50 is better.
<br> If significant autocorrelation is identified, we should look into if we omitted 
one or more key independent variables that have time-ordered effects on the dependent
variables. If no such variables found, including an independent variable that measures
time of the observation will sometimes eliminate or reduce the autocorrelation.

# 17 Time Series Analysis and Forecasting ebook
**Learning Objectives**

1.	Be able to construct a time series plot and identify the underlying pattern in the data.
2.	Understand how to measure forecast accuracy.
3.	Be able to use smoothing techniques such as moving averages and exponential smoothing to forecast a time series with a horizontal pattern.
4.	Know how simple linear regression can be used to forecast a time series with a linear trend.
5.	Be able to develop a quadratic trend equation and an exponential trend equation to forecast a time series with a curvilinear or nonlinear trend.
6.	Know how to develop forecasts for a time series that has a seasonal pattern.
7.	Know how time series decomposition can be used to separate or decompose a time series into season, trend, and irregular components.
8.	Be able to deseasonalize a time series.
9.	Know the definition of the following terms:

| 1 | 2 |
| --- | --- |
| time series | mean squared error |
| time series plot	| mean absolute percentage error |
| horizontal pattern |	moving average |
| stationary time series	| weighted moving average |
| trend pattern	| smoothing constant |
| seasonal pattern |	time series decomposition |
| cyclical pattern	| additive model |
| mean absolute error 	| multiplicative model |

The purpose of the chapter is to provide an introduction to time series analysis and forecasting. 
Forecasting methods can be classified as **qualitative or quantitative**.
* Qualitative methods invovle the use of expert judgement to develop forecasts when historical data on the variable being forecast are either not applicable or unavailable.
* Quantitative methods can be used when 
	* past info about the variable being forecast is available
	* the information can be quantifiled, and
	* it is reasonable to assume that the pattern of the past will continue into the future
* Time Series method is a forecasting procedure focusing on only past value of the variables or forecast errors. The historical data are referred as a time series.
* Casual methods are based on the assumption that the variable we are forecasting has a cause-effect relationship with one or more other variables.

**cross-sectional regression** vs **time series regression**
* time series regression refers to the use of regression analysis when the independent variable is time

## 17.1 Time Series Pattern
A **Time Series** is a sequence of observations on a variable measured at successive points in time or over successive periods of time

To identify the underlying pattern in the data, a useful first step is to construct a **time series plot**

**Horizontal pattern**
* A horizontal pattern exists when the data fluctuate around a constant mean.
* The term **stationary time series** is used to denote a time series whose statistical properties are independent of time. In particular this means that:
	* the process generating the data has a constant mean
	* the variability of the time series is constant over time

Tips: ***Changes in business conditions can often result in a time series that has a horizontal pattern shifting to a new level.***
* E.g., the number of gallons of gasoline sold by a gasoline distributor in Bennington, Vermont, over the past 12 weeks. 

**Trend Pattern**
A trend pattern exists if a time series may also show gradual shifts or movements to relatively higher or lower values over a longer period of time.
* E.g., the sales for a cholesterol drug since the company won FDA approval for it 10 years ago. The time series increases in a nonlinear fashion

**Seasonal Pattern**
Seasonal patterns are recognized by seeing the same repeating patterns over successive periods of time.
* E.g., a manufacturer of swimming pools expects low sales activity in the fall and winter months, with peak sales in the spring and summer months.
* E.g.2, the number of umbrellas sold at a clothing store over the past five years follows seasonal pattern instead of horizontal pattern.

**Combination Pattern**
Some time series include a combination of a trend and seasonal pattern.
* E.g. smartphone sales for a particular manufacturer over the past four years.

**Cyclical Pattern**
A cyclical pattern exists if the time series plot shows an alternating sequence of points below and above the trend line lasting more than one year. 
* E.g, periods of moderate inflation followed by periods of rapid inflation can lead to time series that alternate below and above a generally increasing trend line (e.g., a time series for housing costs). 

Using Excel's Scatter Plot can easily build your 1st time series plot.

## 17.2 Forecast Accuracy Measures

### Forecast Accuracy
The key concept associated with measuring forecast accuracy is forecast error, defined as: **Forcast Error = Actual - Forcast**
* It's similar to residuals in regression analysis

**Naive Forecasting method**: using the simplest of all the forecasting methods: an approach that uses the most recent week’s sales volume as the forecast for the next week. 

**Mean of the forecast errors** are not a very useful measure of forecast accuracy.

**Mean absolute error (MAE)** can be better then mean error to avoid the problem of positive and negative forecast errors offsetting one another.

**Mean Squared Error (MSE)**: the average of the sum of squared forecast errors.

**Mean absolute percentage error(MAPE)**: the average of the sum of **absolute percentage(forecast error/actual value)** errors.

When a shift to a new level like "new contract", it takes a long time for the forecasting method that uses the average of all the historical data to adjust to the new level of the time series. On the other hand, the simple naive method adjusts very rapidly to the change in level because it uses the most recent observation available as the forecast.

## 17.3 Horizontal Forcasting Methods
The common forecasting methods for Horizontal pattern are (smoothing methods):
* **moving averages**: uses the average of the most recent $k$ data values in the time series as the forecast for the next period.
* weighted moving averages
* exponential smoothing

Without modification, all of above methods are not accurate when significant trend, cyclical, or seansonal effects are present. They are easy to use and generally provide high accuracy for short-range forecasting.

### Moving Average Forecast of Order $k$
$F_{t+1} = \frac{\sum{most\; recent\; k \;data\; values}}{k}$ = $\frac{Y_t + Y_{t-1} + ... + Y_{t-k+1}}{k}$
* $F_{t+1}$ = forecast of the time series for period $t+1$
* $Y_t$ = actual value of the time series in period $t$

So managerial judgment based on an understanding of the behavior of a time series is helpful in choosing a good value for $k$. 

To determine if a moving average with a different order $k$ can provide more accurate forecasts, we recommend using trial and error to determine the value of $k$ that minimizes **MSE**.

### Weighted Moving Average
In the moving averages method, each observation in the moving average calculation receives the same weight. One variation, known as **weighted moving averages**, involves selecting a different weight for each data value and then computing a weighted average of the most recent k values as the forecast.
* In most cases, the most recent observation receives the most weight, and the weight decreases for older data values.
* The only requirement in selecting the weights is that their sum must equal 1
* To determine whether one particular combination of number of data values and weights provides a more accurate forecast than another combination, we recommend using **MSE** as the measure of forecast accuracy. 

### Exponential Smoothing
Exponential smoothing also uses a weighted average of past time series values as a forecast
<br> $F_{t+1} = \alpha Y_t + (1-\alpha)F_t$
* $F_{t+1}$ = forecast of the time series for period $t+1$
* $Y_t$ = actual value of the time series in period $t$
* $F_t$ = forecast of the time series for period $t$
* $\alpha$ = smoothing constant ($0 \le \alpha \le 1$)

Use Excel Regression Tool - Exponential Smoothing, you can easily build the table and compute the MSE.	

## 17.4 Trend Forecasting Method
We present two forecasting methods in this section that are appropriate for time series exhibiting a trend pattern. We will show how simple linear regression can be used to forecast a time series with a linear trend.

We then show how the curve-fitting capability of regression analysis can also be used to forecast time series with a curvilinear or nonlinear trend.

### Linear Trend Regression
$T_t = b_0 + b_1t$
* where $T_t$ = linear trend forecast in period $t$
* $b_0$ = intercept of the linear trend line
* $b_1$ = slope of the linear trend line
* $t$ = time period

$b_1 = \frac{\sum_{t=1}^n(t-\bar t)(Y_t - \bar Y)}{\sum_{t=1}^n(t - \bar t)^2}$

$b_0 = \bar Y - b_1t$
* where $Y_t$ = value of the time series in period $t$
* $n$ = number of time periods (# of observations)
* $\bar Y$ = average value of the time series
* $\bar t$ = average value of $t$

Using Excel’s Regression Tool to Compute a Linear Trend Equation
* Choose Regression from the list of Analysis Tools
* The MSE is the MSE in the regression summary

### Non-Linear Trend Regression
Quadratic Trend Equation
* $T_t = b_0 + b_1t + b_2t^2$

Using **Excel Regression Tool** to Compute a Quadratic Trend Equation.
* This time there will be two independent variables, $x, x^2$

Using **Excel's Chart Tools** for Trend Projection
* In the Charts Group, click insert Scatter(X, Y) or Bubble Chart button
* Can choose **Add Trendline**, in the **Format Trendline**, choose Polynomial from the **Trend/Regression Type** list. 
	* Exponential
	* Linear
	* Logarithmic
	* Polynomial (order)
	* Power
	* Moving Average (Period)

## 17.5 Seasonality and Trend
### Seasonality w/o trend

At first glance, you might conclude that the data follow a horizontal pattern and that single exponential smoothing could be used to forecast sales. But closer inspection of the time series plot reveals a pattern in the data. That is, the first and third quarters have moderate sales, the second quarter has the highest sales, and the fourth quarter tends to be the lowest quarter in terms of sales volume. Thus, we would conclude that a quarterly seasonal pattern is present.

We can use the same approach **Dummy variables** to model a time series with a seasonal pattern by treating the season as a categorical variable. 
* Recall that when a categorical variable has k levels, k − 1 dummy variables are required. E.g. if there are four seasons, we need three dummy variables. 
* When dealing with a time series that has both trend and seasonal effects, this simple averaging approach will not work.

### Seasonality and Trend
The general form of the estimated multiple regression equation for modeling both the quarterly seasonal effects and the linear trend in the smartphone time series is as follows:
<br>$Y_t = b_0 + b_1 Qtr1 + b_2 Qtr2 + b_3 Qtr3 + b_4 t$
* where $Y_t$ = estimate or forecast of sales in period t
* Qtr1 = 1 if time period $t$ corresponds to the 1st quarter of the year; 0 otherwise,
* Qtr2 = 1 if ... 2nd quarter, 0 otherwise,
* Qtr3 = 1 if ... 3rd quarter, 0 otherwise,
* $t$ = time period

The dummy variables in the estimated multiple regression equation actually provide four estimated multiple regression equations, one for each quarter. 

**Models based on Monthly Data**: Because there were 4 levels for the categorical variable season, 3 dummy variables were required. However, many businesses use monthly rather than quarterly forecasts. For monthly data, season is a categorical variable with 12 levels and thus 11 dummy variables are required.

## 17.6 Time Series Decomposition
**Time series decomposition** can be used to separate or decompose a time series into seasonal, trend, and irregular components. While this method can be used for forecasting, its primary applicability is to get a better understanding of the time series.

Many other time series, such as unemployment statistics, home sales, and retail sales, are subject to strong seasonal influences. It is important to deseasonalize such data before making a judgment about any long-term trend.

Time series decomposition methods assume that $Y_t$, the actual time series value at period t, is a function of three components: 
* a trend component; 
* a seasonal component; 
* and an irregular or error component. 

How these three components are combined to generate the observed values of the time series depends upon whether we assume the relationship is best described by an **additive or a multiplicative model**.

### Additive Decomposition Model 
$Y_t = Treand_t + Seasonal_t + Irregular_t$
* where $Trend_t$ = trend value at time period $t$
* $Seasonal_t$ = seasonal value at time period $t$
* $Irregular_t$ = irregular value at time period $t$
* irregular component corresponds to the error term $\epsilon$, the variability in the time series that cannot be explained by the trend and seasonal components.


### Multiplicative Decomposition Model
$Y_t = Trend_t \times Seasonal_t \times Irregular_t$
* where $Trend_t$ = trend value at time period $t$
* $Seasonal_t$ = seasonal index at time period $t$
* $Irregular_t$ = irregular index at time period $t$

Calculating the Seasonal Indexes
Note, however, that with four quarters in the moving average, there is no middle period. Like Quarter 2.5

**Centered moving average**: the average of the two consective moving averages.

The **seasonal-irregular** values are often referred to as the de-trended values of the time series.
$Seasonal_t \times Irregular_t$ = $Y_t / Trend_t$

The common **seasonal index** is average of all same # of quarter/month.
* Seasonal-irregular values greater than 1.00 indicate effects above the trend estimate and values below 1.00 indicate effects below the trend estimate. Thus, the three seasonal-irregular values for quarter 3 show an above-average effect in the third quarter.
* Interpretation of the seasonal indexes in Table 17.22 provides some insight about the seasonal component in smartphone sales. The best sales quarter is the fourth quarter, with sales averaging 14% above the trend estimate. The worst, or slowest, sales quarter is the second quarter; its seasonal index of .84 shows that the sales average is 16% below the trend estimate. The seasonal component corresponds clearly to the intuitive expectation that smartphone sales increase when a new school year begins (quarter 3) and for the holiday season (quarter 4).
* There are a number of different approaches to computing the seasonal indexes. In this section each seasonal index was computed by averaging the corresponding seasonal-irregular values. Another approach is to use the median of the seasonal-irregular values as the seasonal index.
* One final adjustment is sometimes necessary in obtaining the seasonal indexes. Because the multiplicative model requires that the average seasonal index equal 1.00, the sum of the four seasonal indexes in Table 17.22 must equal 4.00.
<br> Adjustment = season index * 4 / (sum of the unadjusted seasonal indexes)

**Deseasonalized time series**: Using a multiplicative decomposition model, we deseasonalize a time series by dividing each observation by its corresponding seasonal index. Then we can have regression tool to generate estimated regression equation

The final step in developing the forecast when both trend and seasonal components are present is to use the seasonal indexes to adjust the deseasonalized trend projections.

Now we must adjust the forecast for the seasonal effect. The seasonal index for the first quarter of year 5 (t = 17) is 0.93, so we obtain the quarterly forecast by multiplying the deseasonalized forecast based on trend 7616 by the seasonal index (0.93).

**Cyclical Component**: $Y_t = Trend_t \times Cyclical_t \times Seasonal_t \times Irregular_t$
* The cyclical component, like the seasonal component, is expressed as a percentage of trend.

# 18 Nonparametric Methods
Learning Objectives

1.	Learn the difference between parametric and nonparametric methods.

2.	Know the advantages of nonparametric methods and when they are applicable.

3.	Be able to use the sign test to conduct hypothesis tests about a median.

4.	Learn how to use the sign test to test a hypothesis with matched samples.

5.	Be able to use the Wilcoxon signed-rank test to test a hypothesis with matched samples and to test a hypothesis about the median of a symmetric population.

6.	Be able to use the Mann–Whitney–Wilcoxon test for the comparison of two populations when using independent random samples from each population.

7.	Be able to use the Kruskal–Wallis test for the comparison of k populations when using independent random samples from each population.

8.	Be able to compute the Spearman rank-correlation coefficient and test for a significant rank correlation for two variables that use ordinal or rank-ordered data.


**Parametric methods**: These methods begin with an assumption about the probability distribution of the population which is often that the population has a normal distribution. Based on this assumption,  statisticians are able to derive the sampling distribution that can be used to make inferences about one or more parameters of the population, such as the population mean μ or the population standard deviation σ. 

In this chapter we present **nonparametric methods** which can be used to make inferences about a population without requiring an assumption about the specific form of the population’s probability distribution. For this reason, these nonparametric methods are also called **distribution-free methods**.

Most of the statistical methods referred to as parametric methods require quantitative data, whereas nonparametric methods allow inferences based on either categorical or quantitative data. However, the computations used in the nonparametric methods are generally done with categorical data. Whenever the data are quantitative, we will transform the data into categorical data in order to conduct the nonparametric test. 

## 18.1 Sign Test
The sign test is a versatile nonparametric method for hypothesis testing that uses the binomial distribution with $p = 0.5$ as the sampling distribution.

### Hypothesis Test About a Population Median
If we consider a population where no data value is exactly equal to the median, the median is the measure of central tendency that divides the population so that 50% of the values are greater than the median and 50% of the values are less than the median.

Observations equal to the hypothesized value are discarded and the analysis proceeds with the observations having either a plus sign or a minus sign.

$H_0: Median = 450$<br>
$H_a: Median \ne 450$

can be converted to <br>
$H_0: p = .5$<br>
$H_a: p \ne .5$

The application we have just described used Excel’s BINOM.DIST function to compute the binomial probabilities required to obtain the p-value. With larger sample sizes, the normal distribution approximation of the binomial distribution can also be used to compute the p-value. A large sample application of the sign test is illustrated in the following example.

Since we are using a two-tailed hypothesis test, this upper tail probability is doubled to obtain the final probability. Using Excel’s BINOM.DIST to compute the binomial probabilitites wth $n$ and $p$.

### Normal Approximation of the Sampling Distribution of the Number of Plus Signs When $H_0: p = .5$
Mean: $\mu = .5n$
<br> Standard Deviation: $\sigma = \sqrt{.25n}$
<br> Distribution form: Approximation normal for $n > 20$

Let us now use the normal distribution to approximate the binomial probability of 22 or fewer plus signs. Before we proceed, remember that the binomial probability distribution is discrete and the normal probability distribution is continuous. To account for this, the binomial probability of 22 is computed by the normal probability interval 21.5 to 22.5. The .5 added to and subtracted from 22 is called the continuity correction factor.

Thus to compute the p-value for 22 or fewer plus signs we use the **normal distribution** wiht above $\mu$ and $\sigma$. <br>
p-value = $P(x \le 22.5) = P(z \le (22.5-30)/3.873) = P(z \le -1.94)$<br>
Using Exel's NORM.S.DIST function, the cumulative probability for z=1.94 is .02

E.g. Since the observed number of plus signs for the sample data, 7, is in the upper tail of the binomial distribution, we begin by computing the probability of obtaining 7 or more plus signs. 

In general, when the population is not symmetrical, the nonparametric sign test for the population median is the more appropriate statistical test.

### Hypothesis Test with Matched Samples
In Chapter 10, we introduced a matched-sample experimental design where each of n experimental units provided a pair of observations, one from population 1 and one from population 2. Using quantitative data and assuming that the differences between the pairs of matched observations were normally distributed, the t distribution was used to make an inference about the difference between the means of the two populations.

Step1:  If the individual selected Citrus Valley as the more preferred, a plus sign was recorded. If the individual selected Tropical Orange as the more preferred, a minus sign was recorded. If the individual was unable to express a difference in preference for the two products, no sign was recorded.

Step2: Deleting the two individuals who could not express a preference for either brand, the data have been converted to a sign test with 2 plus signs and 10 minus signs for the 

Step3: 

This type of matched-sample design occurs in market research when a sample of n potential customers is asked to compare two brands of a product such as coffee, soft drinks, or detergents. 

Letting $p$ indicate the proportion of the population of customers who prefer Citrus Valley orange juice, we want to test the hypotheses that there is no difference between the preferences for the two brands as follows:
<br>$H_0: p = .5$
<br>$H_a: p \ne .5$
<br>If $H_0$ cannot be rejected, we cannot conclude that there is a difference in preference for the two brands. 

Using Excel’s BINOM.DIST function, we obtain the binomial probabilities for the number of plus signs. 
E.g. Under the assumption $H_0$ is true, we would expect $.5n$ plus signs. With only two plus signs in the sample, the results are in the lower tail of the binomial distribution. To compute the p-value for this two-tailed test, we first compute the probability of 2 or fewer plus signs and then double this value. Using the binomial probabilities of 0, 1, and 2, the p-value is 2 times the p(x<=2)

Similar to other uses of the sign test, one-tailed tests may be used depending upon the application.

**continuity correction factor**
To account for this, the binomial probability of 22 is computed by the normal probability interval 21.5 to 22.5. The .5 added to and subtracted from 22 is called the continuity correction factor. 

Using this normal distribution, we compute the p-value as follows:<br>
p-value = P(x $\le$ 22.5) = P(z $\le \frac{(22.5-30)}{3.873}$) = P(z $\le$ -1.94)

**Lower Tail p-Values**
p-value = BINOM.DIST(plusSigns, Trials, .5, True)
* plusSigns = the # of plus signs in the sign test
* trials = the total # of plus and minus signs in the sign test

**Upper Tail p-values**
p-value = 1-BINOM.DIST(PlushSigns-1, Trials, .5, True)
* Since the binomial distribution is discrete, plusSigns - 1 is used in the uppertail probability.

**Two-Tailed p-values**
We have 7 plus signs and 3 minus signs for the sample of 10 stores. The number of plus signs is in the upper tail, so we compute: p-value(UpperTail) = 1 - BINOM.DIST(PlusSigns-1, Trials, .5, True) => p-value = 2*p-value(UpperTail)

## 18.2 Wilcoxon Signed-Rank Test
The Wilcoxon signed-rank test is a nonparametric procedure for analyzing data from a matched-sample experiment. It only requires the assumption that the differences between the paired observations have a symmetric distribution. This occurs whenever the shapes of the two populations are the same and the focus is on determining if there is a difference between the medians of the two populations

The hypotheses are as follows:
<br> $H_0$: Median for method A - Median for method B = 0
<br> $H_a$: Median for method A - Median for method B $\ne$ 0

Differences of 0 are discarded and the analysis continues with the smaller sample size involving the nonzero differences. Ties among absolute differences are assigned the average of their ranks.

Step1: Compute the difference and absolute difference between the pairs, Differences of 0 are discarded and the analysis continues with the smaller sample size involving the nonzero differences.

Step2: Rank the difference absolute values, Ties among absolute differences are assigned the average of their ranks.

Step3: Set up the Signed ranks, and get the sum of positive signed ranks as test statistics

Sampling Distribution of $T^+$ for the Wilcoxon Signed-Rank Test can be approximated by a **normal distribution** as follows:
<br>Mean: $\mu_{T^+} = \frac{n(n+1)}{4}$
<br>STD: $\sigma_{T^+} = \sqrt{\frac{n(n+1)(2n+1)}{24}}$
* Distribution form: approximately normal for $n \ge 10$

If the test statistics $T^+$ is in the upper tail of the sampling distribution, we begin by computing the upper tail probability $P(T^+ \ge 49.5)$.
* Since the sum of the potsitive ranks  $T^+$ is discrete and the **normal correction factor**=.5, thus the discrete probability $P(T^+ \ge 49.5)$ is approximately by the normal probability interal 49 to 50. $P(T^+ \ge 49.5)$ = $P(z \ge \frac{49 - \mu_{T^+}}{\sigma_{T^+}})$.

If the test statistics $T^+$ is in the lower tail of the sampling distribution, we begin by computing the upper tail probability $P(T^+ \le 49.5)$ = $P(T^+ \le 49.5)$ = $P(z \le \frac{50 - \mu_{T^+}}{\sigma_{T^+}})$

Using Excel's NOMR.S.DIST function, the cumulative probability for z = 2.19 is .9857; thus the p-value = 2(1-.9857) = .0286

## 18.3 Mann–Whitney–Wilcoxon Test
Advantages of this nonparametric procedure are that it can be used with either ordinal data or quantitative data and it does not require the assumption that the populations have a normal distribution. Versions of the test were developed jointly by Mann and Whitney and also by Wilcoxon. 

MWW Hypothesis Test is :<br>
$H_0$: The two populations are identical
$H_a$: The two populations are not identical


Step1: The Kruskal–Wallis test statistic uses the sum of the ranks for the three samples and is computed as follows.

Step2: The next step in the MWW procedure is to rank the combined samples from low to high. 

Step3: Next we sum the ranks for each sample as shown in Table 18.9. The MWW procedure may use the sum of the ranks for either sample. 


**Sampling Distribution of W with Identical Populations**
<br>Mean: $\mu_W = (1/2)n_1(n_1 + n_2 + 1)$
<br>STD: $\sigma_W = \sqrt{(1/12)n_1 n_2 (n_1 + n_2 + 1)}$
* Distribution form: approximately normal provided $n_1 \ge 7$ and $n_2 \ge 7$

Let us proceed with the MWW test and use a .05 level of significance to draw a conclusion. Since the test statistic W is discrete and the normal distribution is continuous, we will again use the continuity correction factor for the normal distribution approximation. With 
𝑊=169.5 in the upper tail of the sampling distribution, we have the following p-value calculation:<br>
$P(W \ge 169.5) = P(z \ge \frac{169 - 138}{15.1658}) = P(z \ge 2.04)$

As a final comment, some applications of the MWW test make it appropriate to assume that the two populations have identical shapes and if the populations differ, it is only by a shift in the location of the distributions.If the two populations have the same shape, the hypothesis test may be stated in terms of the difference between the two population medians.

## 18.4 Kruskal–Wallis Test
The nonparametric Kruskal–Wallis test is based on the analysis of independent random samples from each of k populations. This procedure can be used with either ordinal data or quantitative data and does not require the assumption that the populations have normal distributions. The general form of the null and alternative hypotheses is as follows:
<br>$H_0$: All populations are identical
<br>$H_a$: Not all populations are identical

Step1: The first step in the Kruskal–Wallis procedure is to rank the combined samples from lowest to highest values.
* the rank is from 1 to n, if encountering same value, then get the average

Step2: The Kruskal–Wallis test statistic uses the sum of the ranks for the three samples and is computed as follows.
<br> $H = [\frac{12}{n_T(n_T+1)}\sum_{i=1}^k{\frac{R_i^2}{n_i}}] - 3 (n_T + 1)$
* $k$ = the # of populations
* $n_i$ = the # of observations in sample $i$
* $n_T = \sum_{i=1}^k{n_i}$ = the total # of observations in all samples
* $R_i$ = the sum of the ranks for sample i

Kruskal and Wallis were able to show that, under the null hypothesis assumption of identical populations, the sampling distribution of H can be approximated by a **chi-square distribution with (k − 1) degrees of freedom**. This approximation is generally acceptable if the sample sizes for each of the k populations are all greater than or equal to five. As a result, the Kruskal–Wallis test is always expressed as an upper tail test.  

As it's a F chi-square distribution for mulitple population comparison, p(H) = CHISQ.DIST.RT(df, test statistic) = 0.0116
* df = k - 1 where k is the # of populations

If the k populations are assumed to have the same shape, the hypothesis test can be stated in terms of the population medians. In this case, the hypotheses for the Kruskal–Wallis test would be written as follows:<br>
$H_0$: Median1 = Median2 = ... = Mediank
$H_a$: Not all Medians are equal

## 18.5 Rank Correlation
 The Spearman rank-correlation coefficient, we provide a correlation measure of association between two variables when ordinal or rank-ordered data are available.
 
 **Spearman rank-correlation coefficient**: $r_s = 1 - \frac{6\sum_{t=1}^nd_i^2}{n(n^2-1)}$
 * where n = the # of observations in the sample
 * $x_i$ = the rank if observation i with respect to the first variable
 * $y_i$ = the rank of observation i with respect to the second variable
 * $d_i = x_i - y_i$

Step1: After the review, the director ranked the 10 individuals in terms of their potential for success at the time of employment and assigned the individual who had the most potential the rank of 1. 

Step2: On the basis of the actual sales records, a second ranking of the 10 individuals based on sales performance was obtained.

Step3: then We first compute the difference between the two ranks for each salesperson, $d_i$, as shown in column 4. The sum of $d_i^2$ in column 5 is 44.

Step4: compute the coefficient based on above formula

Step5: Conclusion

The Spearman rank-correlation coefficient ranges from −1.0 to +1.0 and its interpretation is similar to the Pearson product moment correlation coefficient for quantitative data.
* A rank-correlation coefficient near +1.0 indicates a strong positive association between the ranks for the two variables, 
* A rank-correlation coefficient near −1.0 indicates a strong negative association between the ranks for the two variables. 
* A rank-correlation coefficient of 0 indicates no association between the ranks for the two variables.

At this point, we may want to use the sample rank correlation $r_s$ to make an inference about the population rank correlation coefficient $\rho_s$:<br>
$H_0: \rho_s = 0$<br>
$H_a: \rho_s \ne 0$<br>

Sampling Distribution of $r_s$, <br>
Mean: $\mu_{r_s} = 0$<br>
STD: $\sigma_{r_s} = \sqrt{1/(n-1)}$

With the sampling distribution of $r_s$ approximated by a normal distribution, the standard normal random variable z becomes the test statistic with $z = \frac{r_s - \mu_{r_s}}{\sigma_{r_s}}$. Using Excel’s NORM.S.DIST function, the cumulative probability for $z$, the p-value for two-tail test is 2*p-value. If null hypothesis is rejected, it means there is strong positive rank correlation.

Using Excel: Data -> Data Analysis -> Correlation -> B1:C11