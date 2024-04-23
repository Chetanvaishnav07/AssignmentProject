Project Setup:          
    Created a Maven project for API creation.
Data Model (JavaBean - Doctors.java):    
    Defined a JavaBean named Doctors.
    Declared attributes along with getter and setter methods.
API Controller (MyController.java):
    Created an API controller class named MyController.
    Defined a URL mapping (/doctorss) to fetch data.
    Mapped the URL to a getDoctors() method.
Service Layer (DoctorService):
    Introduced a service layer, likely named DoctorService.
    Designed to handle the business logic for fetching doctor data.
Service Implementation (DoctorServiceImpl):
    Implemented the DoctorService interface.
    Provided the actual logic for fetching doctor data.
    Used to achieve loose coupling in the API program.
Data Handling:
    Inside DoctorServiceImpl, instantiated a Java list to store doctor data.
    Implemented logic to populate the list with desired data.
Testing with Postman:
    Utilized Postman to test the API.
    Sent requests to the specified URL (/doctorss) to fetch data.
Assignment Requirements:
    Focused on fetching specific details of doctors via API.
    Considered options such as providing data via client-server or fetching data from databases.
