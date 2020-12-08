# Aged care Application Tutorial

### Contents

- [1. Is This Tutorial Right For Me ?](https://github.com/seema-source/Aged-care/blob/master/readme.md#1-is-this-tutorial-right-for-me-)
- [2. Aged care App Overview](https://github.com/seema-source/Aged-care#2-aged-care-app-overview)
  - [Functionality overview](https://github.com/seema-source/Aged-care/blob/master/readme.md#functionality-overview)
  - [Low code App using Skyve Foundry](https://github.com/seema-source/Aged-care/blob/master/readme.md#low-code-app-using-skyve-foundry)
  - [Low-code Extensions](https://github.com/seema-source/Aged-care/blob/master/readme.md#low-code-extensions)
- [3. No-code Development](https://github.com/seema-source/Aged-care/blob/master/readme.md#3-no-code-development)
  - [1. Getting Started](https://github.com/seema-source/Aged-care/blob/master/readme.md#1-getting-started)
  - [2. Create](https://github.com/seema-source/Aged-care/blob/master/readme.md#2-create)
  - [3. Collaboration](https://github.com/seema-source/Aged-care/blob/master/readme.md#3-collaboration)
- [4. Low-code Extensions](https://github.com/seema-source/Aged-care#4-low-code-extension)

  - [4.1 Configure local environment](https://github.com/seema-source/Aged-care#41-configure-your-local-environment)

    - [Download and Install Eclipse and JDK](https://github.com/seema-source/Aged-care#download-and-install-eclipse-and-jdk)

      - [Download and Install Eclipse](https://github.com/seema-source/Aged-care#download-and-install-eclipse)

      - [Download and Install JDK](https://github.com/seema-source/Aged-care#download-and-install-jdk)

  - [4.2 Install and Configue Wildfly Server](https://github.com/seema-source/Aged-care#42-install-and-configue-wildfly-server)

    - [Install Wildfly Server](https://github.com/seema-source/Aged-care#install-wildfly-server)

  - [4.3 Add Repository in Eclipse](https://github.com/seema-source/Aged-care#43-add-repository-in-eclipse)
  - [4.4 Import Project](https://github.com/seema-source/Aged-care#44-import-project)

  - [4.5 Set the server](https://github.com/seema-source/Aged-care#45-set-the-server)
  - [4.6 Deploy and Configure Skyve Project](https://github.com/seema-source/Aged-care#46-deploy-and-configure-skyve-project)
  - [4.7 List Views](https://github.com/seema-source/Aged-care#47-list-views)
    - [Patient List](https://github.com/seema-source/Aged-care#patient-list)
    - [Facility List](https://github.com/seema-source/Aged-care#facility-list)
    - [Assessments List](https://github.com/seema-source/Aged-care#assessments-list)
  - [4.8 Edit Views, Layout, and Components](https://github.com/seema-source/Aged-care#48-edit-views-layout-and-components)
    - [Patient Edit view](https://github.com/seema-source/Aged-care#patient-edit-view)
    - [Facility Edit view](https://github.com/seema-source/Aged-care#facility-edit-view)
    - [Assessment Edit view](https://github.com/seema-source/Aged-care#assessment-edit-view)
  - [4.9 Roles](https://github.com/seema-source/Aged-care#49-roles)

- [5. Java Extensions](https://github.com/seema-source/Aged-care#5-java-extension)

  - [Conditions](https://github.com/seema-source/Aged-care#conditions)
  - [Bizlets](https://github.com/seema-source/Aged-care#bizlets)
  - [Actions](https://github.com/seema-source/Aged-care#actions)

# 1. Is This Tutorial Right For Me ?

- Tutorial Purpose
- What We'll Cover
- What You'll Get Out Of It
- Skills You'll Need
- Skills You'll Develop

# 2. Aged care App Overview

This tutorial will talk about how to create an advanced application through the Enterprise Application Framework - [Skyve foundry](https://foundry.skyve.org/).

In this tutorial, we will build a simple application to manage aged care facilities, their patients, and care assessments. We will also configure collaboration so that both non-coders and Java developers can collaborate and work together on the project.

This project will cover the Skyve development process and its concepts as much as possible.

### 2.1. Aged Care Functionality overview

In Aged Care, Patients are regularly assessed to ensure that they are well and safe, and the care is being provided to them matches their needs. Therefore, Care providers record details of different Care Assessments for each Patient daily. These records are maintained both to prompt regular care activities and also for care management to be audited and checked.

In this tutorial, you will create a simple app to maintain details of Aged Care facilities, Patients, and Care Assessments.

### 2.2. No-code Development

In the first part of our tutorial, we will cover the no-code development - a no-code application can be created using only the point-and-click actions in Skyve foundry.

In this tutorial, we will build the Aged Care application step by step using Skyve Foundry covering the three main components of the application: Patient records, their daily Care Assessments, and the details of the Facility at which they reside.

If your goal is limited to developing no-code applications using Foundry, you may wish to leave the tutorial at this point. Otherwise, we encourage you to proceed to the Low-code Extensions.

### 2.3. Low-code Extension

The second part of the tutorial will focus on Low code extension. In Low code extension, we can do some changes in XML files created by Skyve to extend the application functionality beyond point-and-click actions in Skyve foundry.

In the next part of the tutorial, we will load our Aged care application created through Skyve foundry into an IDE- Integrated Development Environment (set of programming tools for writing an application). To extend its functionality using Skyve's Low code XML language.

In this part of the tutorial, we will edit and change the layout to the Patient, Assessment, and Facility documents.

If you believe that you already achieved what you want from this tutorial and you do not have java programming skills, you can leave the tutorial at this point. Otherwise, we encourage you to proceed to the Java Extensions.

### 2.4. Java Extension

In the third part of our tutorial, we will cover the Java extension-add custom built java code into the Skyve application to make your application more powerful.

In this part, we will extend the functionality of the Aged care application using java code. We will add a few conditions and actions using java in our application so that only particular users can access particular Assessments related to each Patient.

# 3. No-code Development

In this section, we will go through the development of the Aged care application and will cover information about the Skyve framework and Skyve foundry in detail.

This section also covers how to create and add different documents: Patient, Assessments, and Facility in the Aged care application and how to deploy an application in foundry.

### 1. Getting Started

Before continuing with our tutorial, there are some pages you may want to visit:

- [What is Skyve?](https://skyve.org/what-is-skyve) - Skyve is a framework used to build attractive, secure, and scalable application with rich features and mobility. For more detail what [Skyve](https://skyve.org) is, and how it will be useful in your Enterprise Application Development visit our [Skyve](https://skyve.org/) page.

- [Getting Started](https://skyve.org/getting-started) - Will help give you some ideas on how to start with our [Skyve](https://skyve.org) Framework.

- [Skyve foundry](https://foundry.skyve.org/)-Will help you to start developing your application and also give [Demo](https://youtu.be/7oynha0tFmw) about how to use skyve foundry.

Now, lets move to the next step how to create application with [Skyve foundry](https://foundry.skyve.org/)

## 2. Create your app in Foundry

To create a new [Skyve](https://skyve.org) Project, you can go to the [Skyve foundry](https://foundry.skyve.org/) and [Get started](https://foundry.skyve.org/foundry/register.xhtml) to register your account and if you are already register Sign in with your register email and password.

To create a new skyve project through foundry go to the [How to get started](https://youtu.be/G3OQu5PeUn8) on the top right-hand side of skyve foundry page and watch the video for more information about how to create new application.

Now, I will take you step by step creation of application:

- Click on the Add button
  ![Add Button](doc_src_img/chapter1/1.png "Add Button")
- Enter the name of App and email address
  ![Name and Email](doc_src_img/chapter1/2.png "Name and Email")
- Click on save, after that start build Data Design

#### About Data design:

_*Documents:*_ In data design, documents are related to the real business documents (e.g.patient, facility, assessment). For more details about documents click on this link https://skyvers.github.io/skyve-dev-guide/concepts/

_*Attributes:*_ Attributes contain information about each document (e.g. Patient's document attributes : name, id, photo, bio etc.). Attributes can have different data types and different view.

In this tutorial we have three documents:

#### 1. Define Patient Document and it's attributes:

The patient document will contain the personal information about the patients and the information about the facility they admitted.

Patient document contain attributes below:

| Attribute name | Data Type  |
| -------------- | ---------- |
| PatientID      | Text       |
| Patient Name   | Text       |
| Photo          | Image      |
| DOB            | Date       |
| Room Number    | Integer    |
| BIO            | Memo       |
| Admission Date | Date       |
| Facility Name  | Associtate |

Now, we will create a Patient document and add attributes in Patient document in next few steps.

- Click on Data Design to add the Documents

  ![Data Design](doc_src_img/chapter1/3.jpg "Data Design")

- Add all information as shown below and click on Zoom out

  ![New Document](doc_src_img/chapter1/4.jpg "New Document")

- You can see your document on screen.

- Next, create documents for Facility and Assessments same as patient and click on arrow to add attributes for each document

  ![Documents and attributes](doc_src_img/chapter1/5.jpg "Documents and attributes")

- Click on Add button to add attributes to patient document

  ![Add attribute](doc_src_img/chapter1/6.jpg "Add attribute")

- Add all the attributes for Patient document as below
  ![Patient attributes](doc_src_img/chapter1/7.jpg "Patient attributes")

#### 2. Define Facility Document and it's attributes:

The Facility document will contain information about the facility(e.g.facility name, facility manager), facility full address and location.

The attributes for Facility document as below:

| Attribute name   | Data Type |
| ---------------- | --------- |
| Facility Name    | Text      |
| Building Number  | Integer   |
| Street Name      | Text      |
| Suburb           | Text      |
| State            | Text      |
| Facility manager | Associate |

This document will follow the same steps we followed for Patient document. It will look like as below:

![Facility attributes](doc_src_img/chapter1/8.jpg "Facility attributes")

#### 3. Define Assessments Document and it's attributes:

The Assessment document will contain information about all the care assessments related to each patient.

The attributes for Assessments document as below:

| Attribute name        | Data Type |
| --------------------- | --------- |
| Hygiene Assessment    | Memo      |
| Pain Assessment       | Memo      |
| Continence Assessment | Memo      |
| Sleep Assessment      | Memo      |
| Behaviour Assessment  | Memo      |
| Staff                 | Associate |

Follow the same steps like Patient and Assessment documents. Assessment document look like as below.

![Assessment attributes](doc_src_img/chapter1/9.jpg "Assessment attributes")

### Deploying your Aged care app

Our Aged care application is almost ready, now the next step is to deploying our application to check how it look like. (Note: If you are using a free trail version, you can only deploy your application for an hours. To use the free version for another hour you need to redeploy it).

There are following steps to deploy Aged care application as we created in foundry:

1. Go to foundry and click on Aged care application
   ![Deploy](doc_src_img/chapter4/1.jpg "Deploy")

2. Click on Deloy tab and then click on Deploy, usually it take 2 minutes to deploy your application

3. Next step is copy the deploy link and paste into a new brower tab

   ![Deploy link](doc_src_img/chapter4/2.jpg "Deploy link")

4. Log in with user "setup" and password "setup

![SignIn](doc_src_img/chapter4/3.jpg "SignIn")

#### Using your Aged care app

Your application is ready to go. See below how it look like...

Click on Aged care

![app](doc_src_img/chapter4/4.jpg "app")

Click on Facility and then add button

![Facility](doc_src_img/chapter4/5.jpg "Facility")

Enter the detail of facility in the fields

![Facility field](doc_src_img/chapter4/6.jpg "Facility field")

Next, click on Assessments

![Assessments](doc_src_img/chapter4/7.jpg "Assessments")

Add data in Assessments

![Assessments](doc_src_img/chapter4/8.jpg "Assessments")

#### Making Changes and Re-Deploying

Not completed yet!!!!!!

The Skyve free trial server will automatically undeploy your project after one hour - but you can redeploy your application as many times as you need during your testing and your data is saved while the project is offline.

## 3. Collaboration

Next, we need to Collaborate our application with github.
To find the more detail how to collaborate Go to [Help button](https://foundry.skyve.org/foundry/loggedIn.jsp?a=e&m=foundry&d=Help) top right of the screen Foundry Help.
Then follow the steps for collaboration.
![Collaboration](doc_src_img/Chapter2/1.jpg "Collaboration")

#### Setup to Github

To enable the collaboration, first of all Sign up or log into [Github](https://github.com/) account.
To create a new repository follow the steps below:

- Click on the plus icon on the top right side to create the new repository
  ![Create repository](doc_src_img/Chapter2/2.jpg "Create reposistory")
- Next, enter the name of the repository, make it private, and click on create
  ![repository name](doc_src_img/Chapter2/3.jpg "repository name")
- After creating repository, you will see the link as shown below, copy the link
  ![Link](doc_src_img/Chapter2/4.jpg "Link")
- Next, go to foundry, open the collaborate tab and paste the link in Remote Endpoint
- Click on apply
- Click on Save
  ![remote endpoint](doc_src_img/Chapter2/5.jpg "remote endpoint")
- Then, Go to collaborate tab of your application and describe changes with comment, click on commit and push button
  ![commit and push](doc_src_img/Chapter2/6.jpg "commit and push")
- Next, check your project in Github
- Go to Github, open repository to see all the files
  ![Repository file](doc_src_img/Chapter2/7.jpg "Repository file")

This is the End of create and collaboration of the application...!

# 4. Low Code Extension

[Dev Guide](https://skyvers.github.io/skyve-dev-guide/) - Will help you learn and understand about our development. It also covers most [Skyve Framework](https://skyve.org) elements and concepts. There are many real examples for you to refer to also.

## 4.1 Configure your local environment

Before import your project in Eclipse, you need to download and install Eclipse in your system.

### Download and Install Eclipse and JDK

- #### Download and Install Eclipse

  - Click here to [Download Eclipse](https://www.eclipse.org/downloads/packages/)
  - Next, Click on [Eclipse IDE for Enterprise Java Developers](https://www.eclipse.org/downloads/packages/release/2020-09/r/eclipse-ide-enterprise-java-developers)

  ![Download Eclipse](doc_src_img/chapter3/1.jpg "Download Eclipse")

  - Click on download
  - Then, Install Eclipse in your system

- #### Download and Install JDK
  - Click here to [download and install JDK 8](https://adoptopenjdk.net/installation.html)
  - Install an OpenJDK 8 version from [AdoptOpenJDK](https://adoptopenjdk.net/installation.html?variant=openjdk8&jvmVariant=hotspot#x86-32_win-jdk) (or an alternative open JDK of your choice)

## 4.2 Install and Configue Wildfly Server

To run our Aged care application, we will need to install and configure for WildFly Server. Skyve works well on WildFly version 13+.

- ### Install Wildfly Server
  You can skip this step if WildFly Server is already installed on your system.

Before installing WildFly Server, make sure JBoss Tools is installed on your system.

To install JBoss Tools, click on Help, then click Eclipse Marketplace.

![Jboss tool](doc_src_img/chapter3/2.JPG "Jboss tool")

In the searchbar, enter 'jboss' then search.

Select the JBoss Tools version that the search returns, and click Install.

![Jboss install](doc_src_img/chapter3/3.JPG "Jboss install")

Select list as below

![Jboss install selection](doc_src_img/chapter3/15.jpg "Jboss install selection")

To check if JBoss Tools is installed properly, click on Help, then click Eclipse Marketplace.

![Jboss tool install](doc_src_img/chapter3/4.JPG "Jboss tool install")

Click Installed.

If the JBoss Tools plugin is present, you are ready to continue.

![Jboss tool plugin](doc_src_img/chapter3/5.JPG "Jboss tool plugin")

After JBoss Tools was installed properly, follow these steps to install WildFly Server.

1. Once Eclipse is opened, right-click under the Package Explorer tab and highlight New, then from the pop-out, click on Server
   ![server](doc_src_img/chapter3/6.JPG "server")

2. Select the WildFly version you wish to work with and click Next

![select server](doc_src_img/chapter3/7.JPG "select server")

3.  Click Next again

![select Next](doc_src_img/chapter3/8.JPG "select Next")

4.  Once more, click the Next button

![install runtime](doc_src_img/chapter3/9.JPG "install runtime")

5.  Click on the Download and install runtime link

![select runtime](doc_src_img/chapter3/10.JPG "select runtime")

Select the latest version of WildFly, then click Next

![accept agreement](doc_src_img/chapter3/11.JPG "accept agreement")

7.  Once you have read the terms of the licence agreement, check the box to accept the terms, and click Next

![select path](doc_src_img/chapter3/12.JPG "select path")

8.  Finally, select the path for where you wish your download and install locations to be found, then click Finish to complete the installation
    ![path](doc_src_img/chapter3/13.JPG "path")

9.  Wait for Eclipse to complete the download and installation process before moving on to the next step

![Downloading](doc_src_img/chapter3/14.JPG "Downloading")

## 4.3 Add Repository in Eclipse

After downloading and installation of eclipse and server, the next step is add our repository in the eclipse.

1. Open the Eclipse in your system
2. Click on window tab and click on show View, then other

   ![Window](doc_src_img/chapter5/1.jpg "Window")

3. Select Git Repositoies and click on open

   ![Git](doc_src_img/chapter5/2.jpg "Git")

4. Click on Git Repositories in bottom area of eclipse, right click and select clone a Git Repostory...

![Git clone](doc_src_img/chapter5/3.jpg "Git clone")

5. Get URL from Github, go to Github and click on Code button.

![Git URL](doc_src_img/chapter5/4.jpg "Git URL")

6. Copy that link and paste in Clone window and click on Next

   ![Clone Window](doc_src_img/chapter5/5.jpg "Clone Window")

7. Click on Next again

   ![Clone Next](doc_src_img/chapter5/6.jpg "Clone Next")

8. Click on Finish

   ![Clone Finish](doc_src_img/chapter5/7.jpg "Clone Finish")

In Git Repositories, we can see our repository is added now!

## 4.4 Import Project

As we already created a project in Skyve foundry, now it is time to import that project in Eclipse to do changes in the Aged care app. To import project in Eclipse follow the steps below:

1. Click on File tab in Eclipse and Select import

   ![import](doc_src_img/chapter5/8.jpg "import")

2. Select Exiting Maven Project form list and click on Next

   ![Maven](doc_src_img/chapter5/9.jpg "Maven")

3. Set your root directory (Folder where you want to save your application in your System) and click on Finish

   ![Root](doc_src_img/chapter5/10.jpg "Root")

You can see your project in Project Explorer area in Eclipse.

## 4.5 Set the server

To run our project in server we need to set Server in Eclipse first.

1. Click on Server tab in Eclipse and right click

![Server tab](doc_src_img/chapter5/11.jpg "Server tab")

2. Click on Add and Remove and then Finish

![Server set](doc_src_img/chapter5/12.jpg "Server set")

## 4.6 Deploy and Configure Skyve Project

#### Deploy your Skyve project

Its easy to deploy your Skyve project to your WildFly Server.

1. Open WildFly deployments folder Right-click on the server and click on Show In, then click on File Browser

   ![Deploy](doc_src_img/chapter6/1.jpg "Deploy")

2. Copy the agedCare.json and agedCare-ds.xml and paste in the deployments folder to the WildFly deployments folder that you opened in the previous step.

   ![Copy file](doc_src_img/chapter6/2.jpg "Copy file")

3. Open the File window and content folder which is in your root folder and create new folder with agedCare name

   ![Content](doc_src_img/chapter6/3.jpg "Content")

4. Open the agedCare.json file in the text editor

   Go to Content section and directory to paste in the Content folder address which we created in previous step in json file.

   ![json1](doc_src_img/chapter6/4.jpg "json1")

   Go to the bottom of the file to change the identifier.

   ![json2](doc_src_img/chapter6/5.jpg "json2")

   If you want to change the username and password, you can change in bootstrap in this app it is not changed.

   Lastly, save and close the file.

5. Open agedCare-ds.xml file in the text editor

   ![agedCare-ds](doc_src_img/chapter6/7.jpg "agedCare-ds")

   Go to connection-url and replace ~ sign with content folder address and save the file.

   ![agedCare-ds](doc_src_img/chapter6/8.jpg "agedCare-ds")

#### Run your Aged care application

Before running your project, we will need to generate the domain class first.

![Generate domain](doc_src_img/chapter6/6.jpg "Generate domain")

Right click on server and go to start button to start the server.

![start server](doc_src_img/chapter6/9.jpg "start server")

When you see the below info in your Console Window, agedCare was deployed and is running on your localhost server.

![Console](doc_src_img/chapter6/10.JPG "Console server")

If not, you may try to debug by yourself to find the source of the problem, or [Join Us On Slack](https://join.slack.com/t/skyveframework/shared_invite/enQtNDMwNTcyNzE0NzI2LWNjMTBlMTMzNTA4YzBlMzFhYzE0ZmRhOWIzMWViODY4ZTE1N2QzYWM1MTdlMTliNDIyYTBkOWZhZDAxOGQyYjQ) and ask any questions there. You will get support from the [Skyve](https://skyve.org) team or a community team member.

Access Aged care app from Web Browser at http://localhost:8080/agedCare. Sign in with by default username "setup" and password "setup".

![Aged care app](doc_src_img/chapter6/11.jpg "Aged care app")

## 4.7 List Views

In most of application data is represented in list and detail views. Skyve also capable to provide each type of view.

Skyve will provide generic/default list and edit views. Skyve supports rapid prototyping of the domain model and gives the developer an ability to begin interacting with the application at an early stage.

List views are basically depend on queries which include only key document attributes for searching and review. Each row of the list corresponds to a document instance however the list may represent data from related documents within the document’s object hierarchy.

- #### Patient List

Lets see our `Patient` list, it shows all the information we define in our document's attributes section.

Hide attributes `admission date` and `patient Id` in the `Patient` documents

Open agedCare.xml

Right after the Menu declaration in agedCare.xml, we will declare Queries like below:

```xml
<queries>
    <query documentName="Patient" name="qPatient">
    <description>All Patient</description>
    <columns>
   		<content display="thumbnail" binding="photo" pixelHeight="45" pixelWidth="45" />
    	<column binding="patientID" sortOrder="ascending" hidden="true" />
    	<column binding="patientName" sortOrder="ascending" />
    	<column binding="DOB" sortOrder="ascending" />
    	<column binding="roomNo" sortOrder="ascending" />
    	<column binding="BIO" sortOrder="ascending" />
    	<column binding="admissionDate" sortOrder="ascending" hidden="true" />
    	<column binding="facilityName.facilityName" sortOrder="ascending" />
    </columns>
    </query>
    </queries>

```

Then you will need to provide `defaultQueryName` attribute to your patient document in `agedCare.xml` like below:

```xml
<documents>
        <document ref="Patient" defaultQueryName="qPatient"/>
        <document ref="Facility"/>
        <document ref="Assessment"/>
        <document ref="Contact" moduleRef="admin"/>
        <document ref="DataGroup" moduleRef="admin"/>
        <document ref="User" moduleRef="admin"/>
    </documents>


```

To apply the change, stop the `WildFly` server and run the `Generate Domain` command, then start the `WildFly` Server again.

## Image for patient.

- #### Facility List

Next, Lets see our `Facility` list now, it shows all the information we define in our document's attributes section.

Hide attributes `Location` and `Facility Manager` in the `Facility` documents

Open agedCare.xml

Right after the Menu declaration in agedCare.xml, we will declare Queries like below:

```xml
<query documentName="Facility" name="qFacility">
			<description>All Facilities</description>
			<columns>
				<column binding="facilityName" sortOrder="ascending" />
				<column binding="buildingNumber" sortOrder="ascending" />
				<column binding="streetName" sortOrder="ascending" />
				<column binding="suburb" sortOrder="ascending" />
				<column binding="state" sortOrder="ascending" />
				<column binding="facilityManager" sortOrder="ascending"
					hidden="true" />
				<column binding="location" sortOrder="ascending"
					hidden="true" />
			</columns>
		</query>
```

Then you will need to provide `defaultQueryName` attribute to your facility document in `agedCare.xml` like below:

```xml
<documents>
		<document ref="Patient" defaultQueryName="qPatient" />
		<document ref="Facility" defaultQueryName="qFacility" />
		<document ref="Assessment" />
		<document ref="Contact" moduleRef="admin" />
		<document ref="DataGroup" moduleRef="admin" />
		<document ref="User" moduleRef="admin" />
	</documents>
```

To apply the change, stop the `WildFly` server and run the `Generate Domain` command, then start the `WildFly` Server again.

![Facility list](doc_src_img/chapter7/1.jpg "Facility list")

- #### Assessments List

As in `Assessment` document, you can see different assessments related to each patient.
Let's hide `Pain assessement` and `Review date` from the document and add patient name and image.

Let's try it:
Add query in your `agedCare.xml`

```xml
<query documentName="Assessment" name="qAssessment">
    <description>All Assessments</description>
    <columns>
    	<content display="thumbnail" binding="parent.photo" pixelHeight="60" pixelWidth="60" />
    	<column binding="parent.patientName" sortOrder="ascending" />
    	<column binding="hygieneAssessment" sortOrder="ascending" />
    	<column binding="painAssessment" sortOrder="ascending"   hidden="true"/>
    	<column binding="continenceAssessment" sortOrder="ascending" />
    	<column binding="sleepAssessment" sortOrder="ascending" />
    	<column binding="behaviourAssessment" sortOrder="ascending" hidden="true" />
    	<column binding="staff" sortOrder="ascending" />
    	<column binding="assessmentReview" sortOrder="ascending" hidden="true" />
    </columns>
    </query>
```

Then you will need to provide `defaultQueryName` attribute to your Assessment document in `agedCare.xml`, like below:

```xml
<documents>
        <document ref="Patient" defaultQueryName="qPatient"/>
        <document ref="Facility"  defaultQueryName="qFacility"/>
        <document ref="Assessment"  defaultQueryName="qAssessment"/>
        <document ref="Contact" moduleRef="admin"/>
        <document ref="DataGroup" moduleRef="admin"/>
        <document ref="User" moduleRef="admin"/>
    </documents>
```

Again, to apply the change, stop the WildFly server and run the Generate Domain command, then start the WildFly Server.

![Assessment list](doc_src_img/chapter7/2.jpg "Assessment list")

### 4.8 Edit Views, Layout, and Components

In this section we will override the default detail view which is generated by Skyve.

- #### Patient Edit view

Skyve provides us with a very useful function to create default `edit view` based on our document attributes and attributes type, the default widget will be applied for each attribute type.

So to create our Patient `edit view`, we will go through the following steps:

#### Create edit view

1. Click on `Generate edit view` in the right side of the eclipse window and write the module and document name in the Console window.

### !image for patient document.

2. If you go to the agedCare module left side of eclipse and open the patient module. You can see view module and in view module there is a document with `generatedit.xml`. Rename the document, `edit.xml`

### image for how to edit.xml

#### Enhance the edit view

In the previous step we generated an edit view by using the Generate Edit View function. Now we will enhance our edit view to make it more visually appealing.

As of now, Patient attributes show one by one, from top to bottom. We will enhance the view by:

Showing all the personal information in the one side and the photo and BIO in other side.

We will plan to split our view into 2 sections: left and right. We will show Patient information on the left side and the Patient Image and BIO will be shown on the right part.

To do that, we will need to understand about Skyve Containers - https://skyvers.github.io/skyve-dev-guide/views/#containers

After reading through the Skyve Containers document, you may have already guessed how to split our view into 2 parts.

Yes, hbox container will help us on this.

Open patient `edit.xml` and add the code given below;

```xml
<?xml version="1.0" encoding="UTF-8"?>
<view xmlns="http://www.skyve.org/xml/view" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" name="edit" title="Patient" xsi:schemaLocation="http://www.skyve.org/xml/view ../../../../schemas/view.xsd">
    <tabPane>
        <tab title="General">
        <hbox border="true">
		<!-- left side -->
		<vbox responsiveWidth="8" percentageWidth="60">
 			<form>
		        <column percentageWidth="30" responsiveWidth="4"/>
		        <column/>

               <row>
                    <item>
                        <default binding="patientID"/>
                    </item>
                </row>
                <row>
                    <item>
                        <default binding="patientName"/>
                    </item>
                </row>
                 <row>
                    <item>
                        <default binding="DOB"/>
                    </item>
                </row>
                <row>
                    <item>
                        <default binding="roomNo"/>
                    </item>
                </row>
                <row>
                    <item>
                        <default binding="admissionDate"/>
                    </item>
                </row>
                <row>
                    <item>
                        <default binding="facilityName"/>
                    </item>
                </row>

          </form>
		</vbox>
          <!-- right side -->
		<vbox responsiveWidth="4" percentageWidth="40">
			<form>
		        <column percentageWidth="20" responsiveWidth="1" />
				<column />
			<row>
                    <item showLabel="false">
                        <contentImage binding="photo"/>
                    </item>
                </row>

                <row>
                    <item>
                        <default binding="BIO"/>
                    </item>
                </row>

            </form>
            </vbox>
            </hbox>
        </tab>
        <tab title="Assessments">
            <dataGrid binding="assessments">
                <boundColumn binding="hygieneAssessment"/>
                <boundColumn binding="painAssessment"/>
                <boundColumn binding="continenceAssessment"/>
                <boundColumn binding="sleepAssessment"/>
                <boundColumn binding="behaviourAssessment"/>
                <boundColumn binding="staff"/>
                <boundColumn binding="assessmentReview"/>
                <onAddedHandlers/>
                <onEditedHandlers/>
                <onRemovedHandlers/>
                <onSelectedHandlers/>
            </dataGrid>
        </tab>
    </tabPane>
    <actions>
        <defaults/>
    </actions>
    <newParameters/>
</view>
```

To see the changes re-deployed the application.

#### ///image for patient document

Next, we will group related information together to make it easier to manage.
The easiest way is to use the `border` and `borderTitle` attributes of the Form container.
So, in this case, I will have 2 forms, one for `Patient Info`, one for `Faciltiy Info`.
Let's add `border` and `borderTitle` in the `<form>` tag.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<view xmlns="http://www.skyve.org/xml/view" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" name="edit" title="Patient" xsi:schemaLocation="http://www.skyve.org/xml/view ../../../../schemas/view.xsd">
    <tabPane>
        <tab title="General">
        <hbox border="true">
		<!-- left side -->
		<vbox responsiveWidth="8" percentageWidth="60">
 			<form border="true" borderTitle="Patient Info">
		        <column percentageWidth="30" responsiveWidth="4"/>
		        <column/>

               <row>
                    <item>
                        <default binding="patientID"/>
                    </item>
                </row>
                <row>
                    <item>
                        <default binding="patientName"/>
                    </item>
                </row>
                 <row>
                    <item>
                        <default binding="DOB"/>
                    </item>
                </row>
                </form>
               <form border="true" borderTitle="Facility Info">
                <column percentageWidth="30" responsiveWidth="4"/>
		        <column/>
                <row>
                    <item>
                        <default binding="roomNo"/>
                    </item>
                </row>
                <row>
                    <item>
                        <default binding="admissionDate"/>
                    </item>
                </row>
                <row>
                    <item>
                        <default binding="facilityName"/>
                    </item>
                </row>

          </form>
		</vbox>
          <!-- right side -->
		<vbox responsiveWidth="4" percentageWidth="40">
			<form>
		        <column percentageWidth="20" responsiveWidth="1" />
				<column />
			<row>
                    <item showLabel="false">
                        <contentImage binding="photo"/>
                    </item>
                </row>

                <row>
                    <item>
                        <default binding="BIO"/>
                    </item>
                </row>

            </form>
            </vbox>
            </hbox>
        </tab>
        <tab title="Assessments">
            <dataGrid binding="assessments">
                <boundColumn binding="hygieneAssessment"/>
                <boundColumn binding="painAssessment"/>
                <boundColumn binding="continenceAssessment"/>
                <boundColumn binding="sleepAssessment"/>
                <boundColumn binding="behaviourAssessment"/>
                <boundColumn binding="staff"/>
                <boundColumn binding="assessmentReview"/>
                <onAddedHandlers/>
                <onEditedHandlers/>
                <onRemovedHandlers/>
                <onSelectedHandlers/>
            </dataGrid>
        </tab>
    </tabPane>
    <actions>
        <defaults/>
    </actions>
    <newParameters/>
</view>
```

#### image for patient with seprate forms

As, we have already made a nice view for Patient. However, I also want to introduce View Components to you.

So, what is View Components?

Let's imagine that our view is very complex, lots of sections and these sections can be reused in different views. Skyve allows for reuse of view sections via the component widget.

To demonstrate how to re-use components, we will split our view into three components:

1. Patient Info
2. Facility Info
3. Photo and Bio

The view component must be declared according to the convention, with the file name matching the declared name.

##### Patient Info component

In the Patient > views package, create new `_patientInfo.xml` file with below content:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<view xmlns="http://www.skyve.org/xml/view" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" name="_patientInfo" title="Patient Info" xsi:schemaLocation="http://www.skyve.org/xml/view ../../../../schemas/view.xsd">

		<form border="true" borderTitle="Patient Info">
		        <column percentageWidth="30" responsiveWidth="4"/>
		        <column/>

               <row>
                    <item>
                        <default binding="patientID"/>
                    </item>
                </row>
                <row>
                    <item>
                        <default binding="patientName"/>
                    </item>
                </row>
                 <row>
                    <item>
                        <default binding="DOB"/>
                    </item>
                </row>
                </form>
                </view>
```

##### Facility Info component

In the Patient > views package, create new `_facilityInfo.xml` file with below content:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<view xmlns="http://www.skyve.org/xml/view" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" name="_facilityInfo" title="Facility Info" xsi:schemaLocation="http://www.skyve.org/xml/view ../../../../schemas/view.xsd">

         <form border="true" borderTitle="Facility Info">
                <column percentageWidth="30" responsiveWidth="4"/>
		        <column/>
                <row>
                    <item>
                        <default binding="roomNo"/>
                    </item>
                </row>
                <row>
                    <item>
                        <default binding="admissionDate"/>
                    </item>
                </row>
                <row>
                    <item>
                        <default binding="facilityName"/>
                    </item>
                </row>

          </form>
          </view>
```

##### Photo and Bio component

In the Patient > views package, create new `_photoBio.xml` file with below content:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<view xmlns="http://www.skyve.org/xml/view" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" name="_photoBio" title="Patient Photo and Bio" xsi:schemaLocation="http://www.skyve.org/xml/view ../../../../schemas/view.xsd">
<form>
		        <column percentageWidth="20" responsiveWidth="1" />
				<column />
			<row>
                    <item showLabel="false">
                        <contentImage binding="photo"/>
                    </item>
                </row>
 </form>
            <form border="true" borderTitle="BIO">
 		  <column/>
			   <row>
			       <item showLabel="false">
			           <textArea binding="BIO"/>
			      </item>
			   </row>
			</form>
  </view>
```

#### Combine together

After done with component creation, we will go to use it on our `edit view`.
Change `edit.xml` view like below:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<view xmlns="http://www.skyve.org/xml/view" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" name="edit" title="Patient" xsi:schemaLocation="http://www.skyve.org/xml/view ../../../../schemas/view.xsd">
    <tabPane>
        <tab title="General">
	<hbox border="true">
		<!-- left side -->
		<vbox responsiveWidth="8" percentageWidth="60">
 			<component name="_patientInfo" />
 			<component name="_facilityInfo" />

		</vbox>

		<!-- right side -->
		<vbox responsiveWidth="4" percentageWidth="40">
			<component name="_photoBio"/>
		</vbox>
	</hbox>

        </tab>
        <tab title="Assessments">
            <dataGrid binding="assessments">
                <boundColumn binding="hygieneAssessment"/>
                <boundColumn binding="painAssessment"/>
                <boundColumn binding="continenceAssessment"/>
                <boundColumn binding="sleepAssessment"/>
                <boundColumn binding="behaviourAssessment"/>
                <boundColumn binding="staff"/>
                <boundColumn binding="assessmentReview"/>
                <onAddedHandlers/>
                <onEditedHandlers/>
                <onRemovedHandlers/>
                <onSelectedHandlers/>
            </dataGrid>
        </tab>
    </tabPane>
    <actions>
        <defaults/>
    </actions>
    <newParameters/>
</view>
```

We will re-deploy our application to see affect. After re-deployment and re-login to the system. We will have the same view as our original before:

#### image here for patient document

- #### Facility Edit view

In the previous section we explore and practice how to create an edit view and customize it to meet our requirements. Now it should be easier for us to create an edit view for your
Facility document right?

Lets demonstrate our Facility edit view below:
It contains three components:

1. Facility Info
2. Facility address
3. Facility location

Let's start with Facility Info component.

1. Generate the edit view for Facility document

   ![Edit Facility](doc_src_img/chapter7/4.jpg "Edit view facility")

2. Add facility component same as patient component

##### Facility Info component

In the Facility > views package, create new `_facilityInfo.xml`
as below content:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<view xmlns="http://www.skyve.org/xml/view" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" name="_facilityInfo" title="Facility Info" xsi:schemaLocation="http://www.skyve.org/xml/view ../../../../schemas/view.xsd">
    <form border="true" borderTitle="Facility Info">
        <column percentageWidth="30" responsiveWidth="4"/>
        <column/>
        <row>
            <item>
                <default binding="facilityName"/>
            </item>
        </row>
        <row>
            <item>
                <default binding="facilityManager"/>
            </item>
        </row>
        </form>
        </view>

```

##### Facility address component

In the Facility > views package, create new `_facilityAddress.xml` as below content:

```xml

<?xml version="1.0" encoding="UTF-8"?>
<view xmlns="http://www.skyve.org/xml/view" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" name="_facilityAddress" title="Facility Address" xsi:schemaLocation="http://www.skyve.org/xml/view ../../../../schemas/view.xsd">
    <form borderTitle="Facility Address" border="true">
        <column percentageWidth="30" responsiveWidth="4"/>
        <column/>

        <row>
            <item>
                <default binding="buildingNumber"/>
            </item>
        </row>
        <row>
            <item>
                <default binding="streetName"/>
            </item>
        </row>
        <row>
            <item>
                <default binding="suburb"/>
            </item>
        </row>
        <row>
            <item>
                <default binding="state"/>
            </item>
        </row>
		</form>
		</view>
```

##### Facility location Component

In the Facility > views package, create new `_facilityLocation.xml` as below content:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<view xmlns="http://www.skyve.org/xml/view" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" name="_facilityLocation" title="Facility Location" xsi:schemaLocation="http://www.skyve.org/xml/view ../../../../schemas/view.xsd">
    <form border="true" borderTitle="Facility Location">
        <column />

        <row>
            <item showLabel="false">
                <geometryMap binding="location">
                    <onChangedHandlers/>
                </geometryMap>
            </item>
        </row>
    </form>
    </view>
```

##### Combine together

After done with component creation, we will go to use it on our `edit` view.
Change `edit.xml` view like below:

```xml

<?xml version="1.0" encoding="UTF-8"?>
<view xmlns="http://www.skyve.org/xml/view" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" name="edit" title="Facility" xsi:schemaLocation="http://www.skyve.org/xml/view ../../../../schemas/view.xsd">

        <hbox border="true">
		<!-- left side -->
		<vbox responsiveWidth="8" percentageWidth="60">
 			<component name="_facilityInfo" />
 			<component name="_facilityAddress" />

		</vbox>

		<!-- right side -->
		<vbox responsiveWidth="4" percentageWidth="40">
			<component name="_facilityLocation"/>
		</vbox>
	</hbox>

            <actions>
        <defaults/>
    </actions>
    <newParameters/>
</view>

```

Again re-deploy the application to see the changes in your Facility document.

![Facility document](doc_src_img/chapter7/5.jpg "Facilty document editview")

- #### Assessment Edit view

As we finish our edit view for patient and facility document. Now, in this step we will do edit view for our Assessment document.
Assessment document will show sections below:

1. Patient Info
2. Assessment Detail
3. Review Detail

Let's start with Patient Info

Generate edit view for the assessment document first.

![Edit assessment](doc_src_img/chapter7/6.jpg "Edit assessment")

##### Patient info component

In the Assessment > views package, create new `_patientInfo.xml` as below content:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<view xmlns="http://www.skyve.org/xml/view" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" name="_patientInfo" title="Patient Info" xsi:schemaLocation="http://www.skyve.org/xml/view ../../../../schemas/view.xsd">
    <form border="true" borderTitle="Patient Info">
                <column percentageWidth="30" responsiveWidth="4"/>
		        <column/>
                <row>
                <item>
                        <default binding="parent.patientName"/>
                    </item>
                </row>
                </form>
               <form border="true" borderTitle="Patient Photo">
                <column percentageWidth="30" responsiveWidth="4"/>
		        <column/>
                <row>
                    <item showLabel="false">
                        <contentImage binding="parent.photo"/>
                    </item>
                </row>
      </form>
      </view>
```

##### Assessment Detail component

In the Assessment > views package, create new `_assessmentDetail.xml` as below content:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<view xmlns="http://www.skyve.org/xml/view" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" name="_assessmentDetail" title="Assessment Detail" xsi:schemaLocation="http://www.skyve.org/xml/view ../../../../schemas/view.xsd">
    <form border="true" borderTitle="Assessment Detail">
                <column percentageWidth="30" responsiveWidth="4"/>
		        <column/>
		        <row>
            <item>
                <default binding="hygieneAssessment"/>
            </item>
        </row>
        <row>
            <item>
                <default binding="painAssessment"/>
            </item>
        </row>
        <row>
            <item>
                <default binding="continenceAssessment"/>
            </item>
        </row>
        <row>
            <item>
                <default binding="sleepAssessment"/>
            </item>
        </row>
        <row>
            <item>
                <default binding="behaviourAssessment"/>
            </item>
        </row>
        </form>
        </view>
```

##### Review Detail component

In the Assessment > views package, create new `_reviewDetail.xml` as below content:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<view xmlns="http://www.skyve.org/xml/view" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" name="_reviewDetail" title="Review Detail" xsi:schemaLocation="http://www.skyve.org/xml/view ../../../../schemas/view.xsd">
    <form border="true" borderTitle="Review Detail">
                <column percentageWidth="30" responsiveWidth="4"/>
		        <column/>
		        <row>
            <item>
                <default binding="staff"/>
            </item>
        </row>
        <row>
            <item>
                <default binding="assessmentReview"/>
            </item>
        </row>
        </form>
        </view>
```

##### Combine together:

After done with component creation, we will go to use it on our edit view.
Change `edit.xml` view like below:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<view xmlns="http://www.skyve.org/xml/view" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" name="edit" title="Assessment" xsi:schemaLocation="http://www.skyve.org/xml/view ../../../../schemas/view.xsd">

  <hbox border="true">
		<!-- left side -->
		<vbox responsiveWidth="8" percentageWidth="60">
 			<component name="_patientInfo" />
 			<component name="_reviewDetail" />

		</vbox>

		<!-- right side -->
		<vbox responsiveWidth="4" percentageWidth="40">
			<component name="_assessmentDetail"/>
		</vbox>
	</hbox>
    <actions>
        <defaults/>
    </actions>
    <newParameters/>
</view>
```

Let's re-deploy the application to see the changes we made in this step.

![Assessment editview](doc_src_img/chapter7/7.jpg "Assessment editview")

### 4.9 Roles

Each role specifies the privilege levels for documents that the role will access (and associated actions). The role name is the name displayed when assigning roles to user security groups in the admin.

For each document, the privilege level is specified in terms of C (Create) R (Read) U (Update) D (Delete) and the document scope access level, either G (Global), C (Customer), D (Data Group) or U (User). The underscore character (\_) means no permission is granted.

In our Aged care App, we will define below roles:

1. Nurse: Nurse can have all permissions in the patient and assessment documents. But, in the facility document nurses can only have update and scope permission.

2. Carer: Carer can have _RU_C permissions in Patient document, \_R_ \_C permissions in the facility document, and in Assessment carer can CRU_C permissions.

3. Manager: Manager have all the permissions in all three documents.

Note: Before creating a new role just careful about the roles which is already created by the foundry: Viewer and Maintainer. if you want to delete any of this role please, we careful that these roles are not assigned to any user before. Otherwise it will not work. For this tutorial, we are not doing anything with Viewer and Maintainer role.

Open `agedCare.xml` to create new roles and change menu.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<module xmlns="http://www.skyve.org/xml/module" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" title="Aged care" prototype="true" name="agedCare" xsi:schemaLocation="http://www.skyve.org/xml/module ../../schemas/module.xsd">
    <homeRef>list</homeRef>
    <homeDocument>Patient</homeDocument>
    <documents>
        <document ref="Patient" defaultQueryName="qPatient"/>
        <document ref="Facility"  defaultQueryName="qFacility"/>
        <document ref="Assessment"  defaultQueryName="qAssessment"/>
        <document ref="Contact" moduleRef="admin"/>
        <document ref="DataGroup" moduleRef="admin"/>
        <document ref="User" moduleRef="admin"/>
    </documents>
    <roles>
        <role name="Viewer">
            <description><![CDATA[Enough privileges to view Aged care documents.]]></description>
            <privileges>
                <document name="Patient" permission="_R__C"/>
                <document name="Facility" permission="_R__C"/>
                <document name="Assessment" permission="_R__C"/>
            </privileges>
        </role>
        <role name="Maintainer">
            <description><![CDATA[Enough privileges to create and edit Aged care documents.]]></description>
            <privileges>
                <document name="Patient" permission="CRUDC"/>
                <document name="Facility" permission="CRUDC"/>
                <document name="Assessment" permission="CRUDC"/>
            </privileges>
        </role>

        <role name="Nurses">
	<description>Permission to see all Assessments</description>
	<privileges>
		<document name="Patient" permission="CRUDC" />
		<document name="Facility" permission="_R__C"/>
		<document name="Assessment" permission="CRUDC" />
	</privileges>

</role>
	<role name="Carers">
		<description>Permission to see only Carer Assessments</description>
		<privileges>
			<document name="Patient" permission="_RU_C"></document>
			<document name="Facility" permission="_R__C" />
			<document name="Assessment" permission="CRU_C" />
		</privileges>
	</role>

<role name="Manager">
		<description>Permission to manage Facility, Staff, and Assessments</description>
		<privileges>
			<document name="Patient" permission="CRUDC" />
			<document name="Facility" permission="CRUDC" />
			<document name="Assessment" permission="CRUDC" />
		</privileges>
</role>
    </roles>
    <menu>
        <list document="Patient" name="Patients">
            <role name="Nurses"/>
            <role name="Manager"/>
            <role name="Carers"/>
        </list>
        <list document="Facility" name="Facilities">
            <role name="Manager"/>

        </list>
        <list document="Assessment" name="Assessments">
            <role name="Nurses"/>
            <role name="Carers"/>
            <role name="Manager"/>
        </list>
    </menu>
<module>
```

In the next section, we will use these permissions by applying some conditions in our documents.

End of section 4!!!

## 5. Java Extension

Before start conditions section, let's create Groups and Users in the application.
For more detail click on link for adding users and groups: https://skyvers.github.io/skyve-user-guide/users/

Go to the application and create group for carer, nurse, manager as below:
Open Admin>Security Admin>Groups

1. Create group for the Carer as below:

![Carer Groups](doc_src_img/chapter8/1.jpg "Carer Groups")

2. Create group for the Manager as below:

   ![Manager Groups](doc_src_img/chapter8/2.jpg "Manager Groups")

3. Create group for the Nurse as below:

   ![Nurse Groups](doc_src_img/chapter8/3.jpg "Nurse Groups")

Next, create Users for Carer, Manager, and Nurse.
Go to the application, Open Admin>Security Admin>Users

1. Create Users for Carer by adding Full name and Email

2. Click on New contact

   ![Carer User](doc_src_img/chapter8/4.jpg "Carer User")

3. Set user name and password

![Set Username](doc_src_img/chapter8/5.jpg "Set username")

4. Click on Existing group, select carer and add in Assigned Group

![Assigned group](doc_src_img/chapter8/6.jpg "Assigned group")

5. Click on save

Now, create Users for Manager and Nurse same as we created for Carer in the previous steps.

After completing creation of Groups and Users. Let's check it is working or not?
Logout your application and login with the user we created in preview steps.

First login with carer.

![Carer login](doc_src_img/chapter8/7.jpg "Carer login")

You can see, the carer can access patient and assessment in Agedcare module. This is because in `agedCare.xml` in menu we gave permission to only Manager to see the facility module.

Carer login page shown below:

![Carer login page](doc_src_img/chapter8/8.jpg "Carer login page")

If you want to check Nurse and Manager, login as their user name and password.

- #### Conditions

In `Assessment` document, when we login as a carer, we can not see, we can not see few assessments such as `Pain assessment` and `Behaviour assessment`. This can be achieved through further usage of conditions. In particular, we can have a condition to determine the visibility of some specified attributes on the screen. To begin with, we define the condition in the `Assessment.xml`. We will define this condition as follows:

```xml
<conditions>
    <condition name="roleCarer">
    <expression><![CDATA[isUserInRole("agedCare", "Carers")]]></expression>
    </condition>
    </conditions>
```

To see the changes we also need to change the visibility of the assessments as below:

Open the `assessmentDetail.xml` and change the visibility of `Pain assessment` and `Behaviour assessment`

![Carer visibity](doc_src_img/chapter8/9.jpg "Carer visibility")

To see the changes, generate domain and re-deployed the server.

Login as a Carer

![Carer login](doc_src_img/chapter8/7.jpg "Carer login")

Open the Assessment module, you can see the pain assessment and the Behavious assessment are not available for the carer any more.

![Carer assessments](doc_src_img/chapter8/10.jpg "Carer assessments")

- #### Bizlets

The document package includes declarations of actions, reports, views and the associated Bizlet file. The Bizlet file contains document-specific behaviours including overrides of default action behaviours and document bean lifecycle events (e.g. newInstance, preSave, etc.).

More info on Bizlets can be found at the following Skyve Developer Guide link: https://skyvers.github.io/skyve-dev-guide/bizlets/

##### Bizlet PatientID

First of all, let's show you how to create `PatientBizlet` to customize the document as we want.
Right-click to the `Patient` package and select `New`, then select `Class` in the sub-menu.
The new Class window will appear like below:

![Class defination](doc_src_img/chapter9/1.jpg "Class defination")

The `PatientBizlet` class is created, It shows some errors, to remove these errors we will use "Eclipse Quick Fix suggestions" as below:

![Quickfix patient](doc_src_img/chapter9/2.jpg "Quickfix patient")

![Quickfix PatientBizlet](doc_src_img/chapter9/3.jpg "Quickfix PatientBizlet")

Alright, after fixing the above two issues, we will override the `newInstance` method to read patient information. Create the `newInstance` as follow:

![override](doc_src_img/chapter9/4.jpg "override")

Select newInstance from the list.

![newInstance](doc_src_img/chapter9/5.jpg "newInstance")

The override method is generated in the file

![code](doc_src_img/chapter9/6.jpg "code")

Add the below code in the method

```java
{
String patientId;

patientId=ModulesUtil.getNextDocumentNumber("P", Patient.MODULE_NAME, Patient.DOCUMENT_NAME, Patient.patientIDPropertyName, 4);
bean.setPatientID(patientId);

return super.newInstance(bean);

}
```

By using this code, we set the patientId for our new document.

- #### Actions

```

```
