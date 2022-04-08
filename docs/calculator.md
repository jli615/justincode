{% include navigation.html %}

## Calculator
- Linked Lists are a type of data structure in which each piece of data contains a reference link to the next piece of data, meaning that the next node can be referenced through the cucrent node
- In our code, generic T was used because we did not know which data types would be inputed into the queue, and so it allows us to use the data without specifically defining a data type
- We used stacks in order to implement Reverse Polish Notation to create the calculator object.
		
		
### Highlights of Work

I thought our use of hashmaps (dictionaries) was interesting and a new way to think about the challenge
```
private final Map<String, Integer> OPERATORS = new HashMap<>();
    {
        // Map<"token", precedence>
        OPERATORS.put("sqrt", 2);
        OPERATORS.put("^", 2);
        OPERATORS.put("*", 3);
        OPERATORS.put("/", 3);
        OPERATORS.put("%", 3);
        OPERATORS.put("+", 4);
        OPERATORS.put("-", 4);
    }

    // Helper definition for supported operators
    private final Map<String, Integer> SEPARATORS = new HashMap<>();
    {
        // Map<"separator", not_used>
        SEPARATORS.put(" ", 0);
        SEPARATORS.put("(", 0);
        SEPARATORS.put(")", 0);
    }
```
  
If statement to determine what operation to do 
```
if (token == "+") {
                    result = x0 + x1;
                } else if (token == "-") {
                    result = x0 - x1;
                } else if (token == "*") {
                    result = x0 * x1;
                } else if (token == "/") {
                    result = x0 / x1;
                } else if (token == "%") {
                    result = x0 % x1;
                } else if (token == "^") {
                    result = Math.pow(x0, x1);
                } else if (token == "sqrt") {
                    result = Math.sqrt(x1);
                } else {
                    result = 0.0;
                }
```
    
