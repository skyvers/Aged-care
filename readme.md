# agedCare Application Tutorial

Before starting of this tutorial it is important to go through few questions below:

### Contents

- [1. Is This Tutorial Right For Me ?](https://github.com/seema-source/Aged-care/blob/master/readme.md#1-is-this-tutorial-right-for-me-)
- [2. AgedCare App Overview](https://github.com/seema-source/Aged-care/blob/master/readme.md#2-agedcare-app-overview)
  - [Functionality overview](https://github.com/seema-source/Aged-care/blob/master/readme.md#functionality-overview)
  - [Low code App](https://github.com/seema-source/Aged-care/blob/master/readme.md#low-code-app-using-skyve-foundry) using Skyve Foundry
  - [Low-code Extensions](https://github.com/seema-source/Aged-care/blob/master/readme.md#low-code-extensions)
- [3. No-code Development](https://github.com/seema-source/Aged-care/blob/master/readme.md#3-no-code-development)
    * [1. Getting Started](https://github.com/seema-source/Aged-care/blob/master/readme.md#1-getting-started)
    * [2. Create](https://github.com/seema-source/Aged-care/blob/master/readme.md#2-create)
    * [3. Collaboration](https://github.com/seema-source/Aged-care/blob/master/readme.md#3-collaboration)
- [4. Low-code Extensions]()
   
   * [Import Project in Eclipse](https://github.com/seema-source/Aged-care/blob/master/readme.md#4-import-project-in-eclipse)
     * [4.1 Install Eclipse](https://github.com/seema-source/Aged-care/blob/master/readme.md#41--install-eclipse)
     * [4.2 Install and Configue Wildfly Server](https://github.com/seema-source/Aged-care/blob/master/readme.md#42--install-and-configue-wildfly-server)
     * [4.3 Add Repository in Eclipse](https://github.com/seema-source/Aged-care/blob/master/readme.md#43--add-repository-in-eclipse)
     * [4.4 Import Project](https://github.com/seema-source/Aged-care/blob/master/readme.md#44--import-project)
      * [4.5 Set the server](https://github.com/seema-source/Aged-care/blob/master/readme.md#45--set-the-server)
  * [ Deploy and Configure Skyve Project](https://github.com/seema-source/Aged-care/blob/master/readme.md#5-deploy-and-configure-skyve-project)
  * [List Views](https://github.com/seema-source/Aged-care/blob/master/readme.md#6-list-views)
      * [Patient List](https://github.com/seema-source/Aged-care/blob/master/readme.md#61--patient-list)
      * [Facility List](https://github.com/seema-source/Aged-care/blob/master/readme.md#62--facility-list)
      * [Assessments List](https://github.com/seema-source/Aged-care/blob/master/readme.md#63--assessments-list)
  * [Edit Views, Layout, and Components](https://github.com/seema-source/Aged-care/blob/master/readme.md#7-edit-views-layout-and-components)
     * [Patient Edit view](https://github.com/seema-source/Aged-care/blob/master/readme.md#71--patient-edit-view)
     * [Facility Edit view](https://github.com/seema-source/Aged-care/blob/master/readme.md#72--facility-edit-view)
     * [Assessment Edit view](https://github.com/seema-source/Aged-care/blob/master/readme.md#73--assessment-edit-view)
  * [Roles](https://github.com/seema-source/Aged-care#8-roles)

- [5. Java Extensions]()

  * [Conditions](https://github.com/seema-source/Aged-care#9-conditions)
  * [Bizlets](https://github.com/seema-source/Aged-care#10-bizlets)
  * [Actions](https://github.com/seema-source/Aged-care#11-actions)


# 1. Is This Tutorial Right For Me ?


# 2. AgedCare App Overview
  * ### Functionality overview
  * ### Low code App using Skyve Foundry
  * ### Low-code Extensions

# 3. No-code Development

   ###  1. Getting Started

Before continuing with our tutorial, there are some pages you may want to visit:

- [What is Skyve?](https://skyve.org/what-is-skyve) - Will answer what [Skyve](https://skyve.org) is, and how it will be useful in your Enterprise Application Development.

- [Getting Started](https://skyve.org/getting-started) - Will help give you some ideas on how to start with our [Skyve](https://skyve.org) Framework.

- [Dev Guide](https://skyvers.github.io/skyve-dev-guide/) - Will help you learn and understand about our development. It also covers most [Skyve Framework](https://skyve.org) elements and concepts. There are many real examples for you to refer to also.
- [Skyve foundry](https://foundry.skyve.org/)-Will help you to learn about skyve foundry.

Now, lets move to the next step how to create application with [Skyve foundry](https://foundry.skyve.org/)

## 2. Create

To create a new [Skyve](https://skyve.org) Project, you can go to the [Skyve foundry](https://foundry.skyve.org/) and [Get started](https://foundry.skyve.org/foundry/register.xhtml)

and if you are already register Sign in with your register email and password.

To create a new skyve project through foundry go to the [How to get started](https://youtu.be/G3OQu5PeUn8) on the top right-hand side of skyve foundry page and watch the video to create new application.

Now, I will take you step by step creation of application:

- Click on Add button
  ![Add Button](doc_src_img/chapter1/1.png "Add Button")
- Enter the name of App and email address
  ![Name and Email](doc_src_img/chapter1/2.png "Name and Email")
- Click on save
  After that start build Data Design
- Click on Data Design to add the Documents
  ![Data Design](doc_src_img/chapter1/3.jpg "Data Design")
- Add all information as shown below and click on Zoom out
  ![New Document](doc_src_img/chapter1/4.jpg "New Document")
- You can see your document on screen.
- Next, create documents for Facility and Assessments same as patient and click on arrow to add attributes for each document
  ![Documents and attributes](doc_src_img/chapter1/5.jpg "Documents and attributes")
- Click on Add button to add attributes to patient document
  ![Add attribute](doc_src_img/chapter1/6.jpg "Add attribute")
- Add all the attributes for Patient, Facility, and Assessments as below
  ![Patient attributes](doc_src_img/chapter1/7.jpg "Patient attributes")
  ![Facility attributes](doc_src_img/chapter1/8.jpg "Facility attributes")
  ![Assessment attributes](doc_src_img/chapter1/9.jpg "Assessment attributes")

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

## 4. Import Project in Eclipse

Before import your project in Eclipse, you need to download and install Eclipse in your system.

### 4.1 Download and Install Eclipse and JDK
 #### 4.1.1 Download and Install Eclipse
* Click here to [Download Eclipse](https://www.eclipse.org/downloads/packages/)

* Next, Click on [Eclipse IDE for Enterprise Java Developers](https://www.eclipse.org/downloads/packages/release/2020-09/r/eclipse-ide-enterprise-java-developers)
![Download Eclipse](doc_src_img/chapter3/1.jpg "Download Eclipse")
* Click on download
* Then, Install Eclipse in your system
 #### 4.1.2 Download and Install JDK

* Click here to [download and install JDK 8](https://adoptopenjdk.net/installation.html)
* Install an OpenJDK 8 version from [AdoptOpenJDK](https://adoptopenjdk.net/installation.html?variant=openjdk8&jvmVariant=hotspot#x86-32_win-jdk) (or an alternative open JDK of your choice)

### 4.2 Install and Configue Wildfly Server

To run our agedCare application, we will need to install and configure for WildFly Server. Skyve works well on WildFly version 13+.

 #### 4.2.1 Install Wildfly Server
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

 3. Click Next again

![select Next](doc_src_img/chapter3/8.JPG "select Next")

 4. Once more, click the Next button

![install runtime](doc_src_img/chapter3/9.JPG "install runtime")

 5. Click on the Download and install runtime link

![select runtime](doc_src_img/chapter3/10.JPG "select runtime")

Select the latest version of WildFly, then click Next

![accept agreement](doc_src_img/chapter3/11.JPG "accept agreement")

 7. Once you have read the terms of the licence agreement, check the box to accept the terms, and click Next

![select path](doc_src_img/chapter3/12.JPG "select path")

 8. Finally, select the path for where you wish your download and install locations to be found, then click Finish to complete the installation
![path](doc_src_img/chapter3/13.JPG "path")

 9. Wait for Eclipse to complete the download and installation process before moving on to the next step

![Downloading](doc_src_img/chapter3/14.JPG "Downloading")


#### 4.3 Add Repository in Eclipse

#### 4.4 Import Project

#### 4.5 Set the server

## 5. Deploy and Configure Skyve Project

## 6. List Views

#### 6.1 Patient List

#### 6.2 Facility List

#### 6.3 Assessments List

## 7. Edit Views, Layout, and Components

#### 7.1 Patient Edit view

#### 7.2 Facility Edit view

#### 7.3 Assessment Edit view

## 8. Roles

## 9. Conditions

## 10. Bizlets

## 11. Actions
