# SquareTrade Code
We have several product categories for Square Trade in which we sell insurance. Categories include Furniture, Electronics, and Home Appliances. Categories have hierarchies. So Home appliances have subcategories like Major Appliances, Minor Appliances, and Lawn & Garden. And Major Appliances have subcategories of Kitchen Appliances and General Appliances.
For each category, there are zero or more keywords associated with it. This is used by our search engine to go to a specific category. If a certain category is missing keywords, it needs to inherit it from the parent. For example, the Kitchen Appliances category will inherit the keywords "Home, Appliances".
## Task
> 1. Create an appropriate data structure and populate it with the above data. You may use the raw data provided to you for convenience and convert it to the appropriate data structure of your choice.
> 2. Write code that gets keywords for a given category.
> 3. Write code that gets the "level" of the category starting from the Root. So categories whose parent is the Root are at level 1, their children are at level 2, etc.
> 4. kage the results into the solution() method that takes in categoryID as a parameter and returns results. The first element of
the array is the level converted to a string. The rest of the elements are the keywords for the category. Eg; solution(3) returns {"1", "Electronics", "Gadgets"}
