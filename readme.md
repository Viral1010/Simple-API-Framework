This is the simple API Framework for the Test Purpose


This framework contains the Folder at src/test/java/org/demo
- **Core** : Which contains core framework features methods like Utlity, Response helper and Logger
- **Object Repository** : Which contains pojo files for the every api response which helps us to validate each fileds of response
- **RequestBuilder** : Which contains the one class for the every api, each class contains the api call ing and response validation methods
- **Schema Validator** : SchemaValidator class contains the common methods that will help us to validate response
- **Test** : which contains various test for the API, each file can contains single or multiple test

## How to Run

 This framework is using the TestNG as the Test Framework and OkHTTP for the HTTP Request.
 
- Open this framework into the Any Editor like Intellij or Eclipse
- Go to src/test/java/org/demo/Test
- Open Health.java file
- Run as TestNG Test

Result will generate the inside the test-output folder.