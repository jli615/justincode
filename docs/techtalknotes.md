## Unit 2 Key Learnings, Tech Talk 2 Notes</h1>
- In coding languages, Reverse Polish Notation is used to calculate math expressions by using Stacks and the Shunting-yard algorithm to parse through the inputed data</p>
   - Ex: 6 * 15 becomes 6 15 
- Operators are stored in a hash map based off of order of operations - which ones come first and thus take precedence</p>

    {
        // Map<"token", precedence>
        OPERATORS.put("*", 3);
        OPERATORS.put("/", 3);
        OPERATORS.put("%", 3);
        OPERATORS.put("+", 4);
        OPERATORS.put("-", 4);
    }</code>
				<p></p>
		</div><!-- /.blurb -->	
		
		<div class="blurb">
## Unit 1 Key Learnings, Tech Talk 1 Notes</h1>
- Queues are a type of data structure in which elements are inserted at the end of a queue and removed from the beginning - first in first out</p>
- Stacks are a type of data structure in which elements are inserted at the beginning of a queue and removed from the beginning - first in last out</p>
				<p>Queue.add(1)</p>
				<p>Queue.add(2)</p>
				<p>Queue.delete()</p>
				<p>Result: {2}</p>
				<p>Stack.add(1)</p>
				<p>Stack.add(2)</p>
				<p>Stack.delete()</p>
				<p>Result: {1}</p>
		
 ## Tech Talk 0 Notes
- Data Structures are a method of organizing data - variables, sequences, and databases are all data structures. Data structures and algorithms work well together to create otpimized and efficient code.</p>
- Impaerative paradigms use statements to change a program's state. Object Oriented Paradigms use objects and classes.</p>
