This project was created by Nino Ozbetelashvili as the Final Project of the Test Automation course. Used: Java programming language, Selenium framework, TestNG. Ten test cases were automated, one of which one is negative , one – positive.

Positive Cases: Log In With Correct Data.

Negative Cases: Log In With Incorrect Data.

To run this project on your local computer, you need:
Intellij IDEA Community Edition - JDK version 21.0.1; Dependencies: testng - 7.8.0, webdrivermanager - 5.6.2, selenide - 7.0.2, selenium-java - 4.16.1, javafaker - 1.0.2, aspectjweaver – 1.9.2, allure-testng – 2.22.2.


pom.xml-ში რომ ალურის რეპორტებისთვის ჩავამატეთ maven-compiler-plugin, ეგ წითლად წერია,Intellij IDEA-ში  თითქმის ყველა ახლიდან შესვლაზე ითხოვს დარეფრეშებას, მერე სწორდება და Intellij IDEA-ს დახურვის შემდეგ ისევ წითლადაა. რაღაც პრობლემა აქვს, რაც ვერ გავასწორე.
allure-რეპორტებში მესამე ტესტად მოდის დაფეილებული ტესტი "აქ ხდება Chrome ბრაუზერის დახურვა" რომელიც არც ცალკე მაქვს გატანილი ტესტად და არც სრული ტესტის სახე არ აქვს ბოლომდე ვერ გავიგე რატომ მოდის ასე.
