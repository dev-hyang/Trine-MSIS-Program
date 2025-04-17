# Init
By using the attached excel file, I have analyzed the case problem "Rating Wines from the Piedmont Region of Italy". Below are the summarization for each questions.

Q1: Table and Plots are also attached in the excel file. 

Rating	Not recommended	mediocre	good	very good	outstanding	classic
Number of ratings	0	1	7	45	40	7
AVG Price	0	21	16.71428571	30.35555556	73	269.5714

From the scatter plot, we could find the rating of wine increases slowly as average price of the wine increases. Most of the data points focus on the middle rating range, like "very good" and "outstanding". Also, the "classic" and "outstanding" rating of wine has the largest price gap between rating range.

Q2: The scatter plot between price and score does not show a strong linear relationship.

Q3: The estimated linear regression equation is: y_score^ = 87.763 + 0.028*Price. And as its adjusted coefficient of determination (0.4) is less than 0.45, it does not seem to be a good fit.

Q4: The estimated second-order model regression equation is: y_score^ = 86.166 + 0.0713*Price -0.0001*PriceSq. And as its adjusted coefficient of determination (0.5) is above 0.45, it can claim to be a good fit.

Q5: Compared Q3 and Q4, the adjusted coefficient of determination given by linear regression model is less than that of second-order model. We conclude that second-order model is a better fit.

Q6: The estimated linear regression model equation is: y_score^ = 77.73 + 3.16*LnPrice
Compared to the second-order regression equation, the nature logarithm transformation of price offers a better fit with adjusted coefficient of determination to be 0.57 > 0.5

Q7: Based on the analysis of Q5 and Q6, we could say that spending more will get a better wine under a certain upper peak price. After that peak point, the price change might have little impact on the rating of the wine.

Q8: Suppose we use the Q5's estimated regression equation model, the answer is yes when we spending more closer to $30, we would get a better rating wine because it is still in the left part (x_upper = 356.5). 

References:
Lee, S.W. (2022, Feb 19). Regression analysis for continuous independent variables in medical research: statistical standard and guideline of Life Cycle Committee. LifeCycle. https://doi.org/10.54724/lc.2022.e3

# Replies
* by Ashish Pravin Patil - Thursday, November 28, 2024, 3:10 PM
This is a clear and organized summary to the rating wine problem analysis. With scatter plots we could get basic understanding of the trend between dependent and independent variables. Sometimes the relationship could be intuitive, but sometimes it might need further analysis or transformation of the variables to make the relationship more visible. On the other hand, adjusted coefficient of determination could be used to compare how well the different regression models would fit the sample data. To conclude, it's challenging to find the best fit of regression model, but through step by step analysis, we could find a better estimated regression model by using regression analysis approaches like variable transformation, stepwise regression, etc.

* by Cheuk Wing Ng - Thursday, November 28, 2024, 10:51 PM
The explanation of the wine rating and score analysis problem is really interesting and excellent. I would like to shout out to the building procedure of the estimated regression model. Generally speaking, we claim an estimated regression model/equation to be a good fit if its adjusted coefficient of determination is over 45%. That means the current second-order regression model and adding a new variable of square of price (which might be inspired from potential curvilinear relationship between the price and rating). This step by step question is really helpful to lead us in future regression analysis on how to select good independent variables.