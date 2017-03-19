# Base Converter

Base converter is a program used to read in a number from a user and convert it to a different base. 

This program supports bases between 2 and 35. And error will be thrown if a desired base is provided outside of that range.


## Sample Output:


**Base 10 to 16.**
```
Please enter your number: 
76531
Please enter the base of that number: 
10
Please enter the base that you'd like to convert to: 
16
This number is "12af3" in the other base.
```

**Base 16 to 10**
```
Please enter your number: 
12af3
Please enter the base of that number: 
16
Please enter the base that you'd like to convert to: 
10
This number is "76531" in the other base.
```

**Base 10 to 2.**
```
Please enter your number: 
1148473874
Please enter the base of that number: 
10
Please enter the base that you'd like to convert to: 
2
This number is "1000100011101000101001000010010" in the other base.
```

**Base 10 to 60 (Illegal base)**
```
Please enter your number: 
8373627949
Please enter the base of that number: 
10
Please enter the base that you'd like to convert to: 
60
One of your bases is either too large or too small! Please try again.
```

