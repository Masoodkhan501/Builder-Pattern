This file drives u through the repo like How things where before using the BUILDER PATTERN and after using the BUILDER PATTERN
BUILDER PATTERN

1. First working with the http object which doesn't uses the BUILDER PATTERN and it has fields like URL, headers, body, qurey param, Method 
   and timeout variable

  possible Problems may arise
    - constructor overloading (telescoping)
    - mutable problem
    - inconsistent problem
    - scattered validation

  NOTE : for getting full insigt please refer the HttpReqWithoutBuilder.java file.

2. Later we create HTTPReqWithBuilder to overcome problems arised during not using builder pattern
   
