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
   For understanding the First Solution ( yeah we have provided 2 solutions ) you need to be very carefull i mean attentive to the project          structure as it may feel bit complex but trust me it simple take your time to understand it.
   we have 3 packages for this builder pattern to make it future proof and flow the software principles.
   
      - Builder package it contains 4 files

           a. HttpExecutor -> it's job is just to execute the Http Request i mean if in future you want to change how to execute the http                      request you don't need to change the complex code just need to touch it.

           b. HttpReqWithBuilder -> This is the actual obj of http req which contains feilds of default access specifies 

           c. HttpReqBuilder -> This is the builder class which build the HttpReqWithBuilder Class obj as no other than him can access But                   here is the catch if we make the constructor or field as private no one could access yet no obj will be created. ( This issue                  will be solved by the another solution ).

           d. ValidateHttp -> Which contains the logic for validating the http req like does it have require fields we can do more validation                like does it follows the following format or not.

      - ExceptoinBundle package. it contains 1 file

           a. RequestValidationError -> This is custom error which have the list<String> of errors which can log multiple errors if occured                  so user can get full info in one go. along with it has a timestamp for convinience.

      - execution package. it contians the main file to run the code and catch the custom error if occured. 
         
        
