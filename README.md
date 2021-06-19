# Generics-Day13

## USECASES :
1. Given three integers find maximum,ensured test code has passed test case.
2. Given three floats find maximum,ensured test code has passed test case.
3. Given three strings find maximum,ensure test code has passed test case.
4. Extending max method to take more than three parameters and finding max.
5. Extending Usecase-4 by using generic method.

## REFACTORS :
1.Refactoring all three methods to one generic method,ensure test code has passed test case.
2. Refactor to create Generic Class to take in 3 variables of Generic Type
   - Ensure the Generic Type extends Comparable
   - Write parameter constructor
   - Write testMaximum method to internally call the static testMaximum method passing the 3
     instance variables
   - Define new test case to use the Generic Class
