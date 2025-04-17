# Intial

For the the case problem-“Forecasting Food and Beverage Sales”, the time series analysis indicates a linear trend alongside seasonal effects. Sales peak in January, with the highest seasonal index showing that actual sales are 44.2% higher than the trend forecast for that month. Conversely, sales reach their lowest in September, where the seasonal index reflects a 37.3% drop below the trend forecast. These trends are intuitively linked to tourism patterns: winter months see a surge in visitors due to favorable weather, boosting sales, while the hot summer months, like September, see fewer tourists and lower sales. December also shows an encouraging rise, likely due to increased holiday-season tourism.

The deseasonalized time series highlights an upward linear trend, suggesting consistent long-term growth. When comparing forecast models, the Deseasonalized Regression Model outperforms the Dummy Regression Model. The latter demonstrates larger forecast errors because it fails to account adequately for both the seasonality and the upward trend in the data. By removing seasonal effects, the deseasonalized model provides a more accurate depiction of the underlying trend, enabling the regression equation to better capture the data’s inherent growth trajectory.

This analysis underscores the importance of accounting for seasonality when forecasting in industries heavily influenced by external factors, such as tourism. Utilizing deseasonalized data ensures more reliable and actionable insights, particularly for long-term strategic planning and decision-making.

Reference: 
Aman, D.(2023, Nov 24). Time Series Forecasting vs. Regression. Medium. https://medium.com/@danaytaman/time-series-forecasting-vs-regression-cf89d0d0f3bd

# Replies
* by Yuxin Qin - Thursday, December 5, 2024, 10:51 PM

I did agree most of the points you highlighted in the above dicussion as an addition to the textbook. It's really helpful to understand the importance of seasonal effect on the forecasting and regression analysis. Sometimes, the ignorance of seasonal effect might cause big loss for an corporation if they are planning budget or sales. Also, there are solutions that help us to reduce the seasonal fluntructions and keep the forecasting more accurate. It would be more interesting if there are more anlaysis around the case problem of "Forecasting Food and Beverage Sales". By the actual data plots and analysis, it might be more convincing on which forecasting approaches works better and why.

* by Ricardo Mejia Botero - Thursday, December 5, 2024, 10:58 PM

This is technically correct on the questions raised in the case problem. Your investigation and analysis are consolidate and focusing on the seasonal toursim effect to the sales of seafood restaurant. That is also my main guess to the sales fluntrucations and your reference link really a strong supporting evidence to these seasonal trend. One more thing I want to point out is that usually the deseasonalized regression model should work better than the dummy categorical regression model. But through the forecasting data in your above answers, it is just contradictive. The deseasonlized forecasted value for 4th year Jan is 253,199, and the dummy regression model provides 286,750 which is more close to the actual value. That could an interesting topic to follow up and see if there is any potential route cause or any alternative way to prove it because the economic sales are impacted by different kind of factors that might be out of our scope.