Agenda for Today:
=================
  -09.00 - 09:40 - TestNG Introduction
  -09:40 - 10:10 - converting Java Code into TestNG(Breakout)
  -10:10 - 11:00 - Sequential & Parallel Execution
  -11:00 - 11:30 - Breakout+Break
  -11:30 - 12:10 - TestNG Annotations
  -12:10 - 12:35 - Breakout
  -12:35 - 01:10 - TestNG Attributes
  -01:10 - 01:20 - Recap


Limitation:
1.one by one (1000)
-timing consuming
-manually someone have to present
-same data

-Run in Sequential and parallely


2.hardcoded data in testcase

-different data we can pass in testcase

3.there is no reporting 
-will get basic report and it show status

4.there is no way to fliter the testcase to run
-grouping 

5.there is no way to re-run the testcase on failure
-automated re-try(re run testcase )



Steps to run as TestNG:
 ======================
    1)Convert the main method to a normal method
	   -remove static
	   -remove arguments
	2)Give a meaningful name to your method
	
	3)Add @Test at the top of the method and import it
	
	4)Run as TestNG      


Steps to run the testcases sequentially and parellely:
================================
  1.Select the converted testcases 
  2.Right click -> TestNg -> Convert to TestNG
  3.testng.xml will be generated under the project
  4.Open the testng.xml file and click source tab
  5.From the xml file -> Right Click-> Run as testng suite
  6.Add attribute verbose to get the failure logs in the console


  To run the testcase parallely
  -Select the converted testcases 
  -Right click -> TestNg -> Convert to TestNG
  -In the xml file add parallel attribute
  -Give thread-count to set the max limit for the number of threads to be executed parallely.











 Annotations:
 ==============

  @BeforeSuite- start report ()
    @BeforeTest- data intergataion(connected db,excle file)
      @BeforeClass -commom data like tc name,desc,author name
        @BeforeMethod -pre condition(login ,username,password)

          @Test

        @AfterMethod    -post condition(closes)
      @AfterClass  -
    @AfterTest -
  @AfterSuite   -        


step1
create Baseclass in same package
-@BeforeMethod
create method-inside common code
chromedriver- globaly
remove chromedriver from method
@AfterMethod
create method -pass driverclos#End Region


step2-
remove commom code from testcase

step3-
convert into xml and run it



















































  Selenium April 2023 - Week5 feedback form
https://forms.office.com/r/yqXW8ZnGqJ 