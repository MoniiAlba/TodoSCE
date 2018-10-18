NAME
weka.associations.Apriori

SYNOPSIS
Class implementing an Apriori-type algorithm. Iteratively reduces the minimum support until it finds the required number of rules with the given minimum confidence.
The algorithm has an option to mine class association rules. It is adapted as explained in the second reference.

For more information see:

R. Agrawal, R. Srikant: Fast Algorithms for Mining Association Rules in Large Databases. In: 20th International Conference on Very Large Data Bases, 478-499, 1994.

Bing Liu, Wynne Hsu, Yiming Ma: Integrating Classification and Association Rule Mining. In: Fourth International Conference on Knowledge Discovery and Data Mining, 80-86, 1998.

OPTIONS
minMetric -- Minimum metric score. Consider only rules with scores higher than this value.

verbose -- If enabled the algorithm will be run in verbose mode.

numRules -- Number of rules to find.

lowerBoundMinSupport -- Lower bound for minimum support.

classIndex -- Index of the class attribute. If set to -1, the last attribute is taken as class attribute.

outputItemSets -- If enabled the itemsets are output as well.

car -- If enabled class association rules are mined instead of (general) association rules.

doNotCheckCapabilities -- If set, associator capabilities are not checked before associator is built (Use with caution to reduce runtime).

removeAllMissingCols -- Remove columns with all missing values.

significanceLevel -- Significance level. Significance test (confidence metric only).

treatZeroAsMissing -- If enabled, zero (that is, the first value of a nominal) is treated in the same way as a missing value.

delta -- Iteratively decrease support by this factor. Reduces support until min support is reached or required number of rules has been generated.

metricType -- Set the type of metric by which to rank rules. 
Confidence is the proportion of the examples covered by the premise that are also covered by the consequence (Class association rules can only be mined using confidence). 
Lift is confidence divided by the proportion of all examples that are covered by the consequence. This is a measure of the importance of the association that is independent of support. Leverage is the proportion of additional examples covered by both the premise and consequence above those expected if the premise and consequence were independent of each other. The total number of examples that this represents is presented in brackets following the leverage. Conviction is another measure of departure from independence. Conviction is given by P(premise)P(!consequence) / P(premise, !consequence).

upperBoundMinSupport -- Upper bound for minimum support. Start iteratively decreasing minimum support from this value.

