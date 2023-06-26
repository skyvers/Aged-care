---
title: "Low Code Extensions"
permalink: /chapter3/
excerpt: "Low code development using the Skyve metadata"
toc: true
sidebar:
  title: "Index"
  nav: docs
---

In this section, we will work on setting the project up for collaboration, and configure the local environment. After this, we will edit some XML files, which will change the lists, views, and layout of our application. This step will enable us to test and deploy our application locally on our own (or another) machine.

For more information, visit our [Dev Guide](https://skyvers.github.io/skyve-dev-guide/) - which will help you learn and understand about our development. It also covers most [Skyve Framework](https://skyve.org) elements and concepts. In addition, there are many real examples for you to refer to.

## 3.1. Collaboration

Next, we need to set our application up for collaboration using GitHub.

Why do we need collaboration?

Collaboration will allow another user of your team to edit your application or between [Foundry](https://foundry.skyve.org/foundry/) users and developer. So, to enable collaboration, we need to provide our application with a remote endpoint of a new Git repository.

![Collaboration with Skyve Foundry](../assets/images/skyve-foundry-create-diagram.png "Collaboration with Skyve Foundry")

To find out more details on collaboration, go to the [Help button](https://Foundry.skyve.org/Foundry/loggedIn.jsp?a=e&m=Foundry&d=Help) in the top right of the Foundry page, and follow the steps for collaboration.

![Collaboration](../doc_src_img/Chapter2/1.jpg "Collaboration")

### Setup for GitHub

To enable collaboration, firstly sign up or log into a [GitHub](https://github.com/) account.
To create a new repository, follow the steps below:

- Click on the Add button on the top right side to create a new repository

  ![Create repository](../doc_src_img/Chapter2/2.jpg "Create repository")

- Next, enter the name of the repository, make it private, and click on create

  ![repository name](../doc_src_img/Chapter2/3.jpg "repository name")

- After the repository has been created, you will see the link as shown below. Copy this link.

  ![Link](../doc_src_img/Chapter2/4.jpg "Link")

- Next, go to [Foundry](https://foundry.skyve.org/foundry/), open the collaborate tab and paste the link in Remote Endpoint

- Click on Apply
- Click on Save

  ![remote endpoint](../doc_src_img/Chapter2/5.jpg "remote endpoint")

- Then, go to the collaborate tab of your application, describe the changes with a comment, and click on the "commit and push" button

  (Note: "Commit" will put your changes into your local repository and "Push" sends those changes to  the remote location)

  ![commit and push](../doc_src_img/Chapter2/6.jpg "commit and push")

- Next, check your project in GitHub

- Go to GitHub and open the repository to see all the files

  ![Repository files](../doc_src_img/Chapter2/7.jpg "Repository files")

You have now successfully created your application and configured it for collaboration!

## 3.2. Configure your Local Environment

For this section, we have chosen to show how to use Eclipse as the development environment, however, if you prefer, you can use other development environment tools such as IntelliJ, NetBeans, Visual Studio Code, etc. However, if you're not completely familiar with these, use Eclipse so that you can follow the steps below.

Before you can import the project into Eclipse, you need to download and install Eclipse in your system.

NOTE: do not use the Eclipse EE9 preview, you will need the Jakarta EE Full & Web Distribution

### Download and Install Eclipse and JDK

#### Download and Install Eclipse

NOTE: do not use the Eclipse EE9 preview, you will need the Jakarta EE Full & Web Distribution

  - Click here to [Download Eclipse](https://www.eclipse.org/downloads/packages/)
  - Next, Click on [Eclipse IDE for Enterprise Java Developers](https://www.eclipse.org/downloads/packages/release/2020-09/r/eclipse-ide-enterprise-java-developers)

  ![Download Eclipse](../doc_src_img/chapter3/1.jpg "Download Eclipse")

  - Click on download
  - Then, install Eclipse in your system

#### Download and Install JDK

  - Install an OpenJDK 11 version from [AdoptOpenJDK](https://adoptopenjdk.net/installation.html?variant=openjdk11&jvmVariant=hotspot#x86-32_win-jdk) (or an alternative OpenJDK of your choice)

## 3.3. Install and Configure Wildfly Server

We need an application server to be able to access the application through our browser. For this we will demonstrate using Red Hat's Wildfly application server plugin. Skyve apps can be deployed on recent versions of Wildfly (20+).

### Install Wildfly Server

You can skip this step if WildFly Server is already installed on your system.

Before installing WildFly Server, make sure JBoss Tools is installed on your system.

To install JBoss Tools, click on Help, then click Eclipse Marketplace.

![JBoss tools](../doc_src_img/chapter3/2.JPG "JBoss tools")

In the search bar, enter 'jboss', then search.

Select the JBoss Tools version that the search returns, and click Install.

![JBoss install](../doc_src_img/chapter3/3.JPG "JBoss install")

Select the list as shown below

![JBoss install selection](../doc_src_img/chapter3/15.jpg "JBoss install selection")

To check if JBoss Tools is installed properly, click on Help, then click Eclipse Marketplace.

![JBoss tool install](../doc_src_img/chapter3/4.JPG "JBoss tool install")

Change to the `Installed` tab.

If the JBoss Tools plugin is present, you are ready to continue.

![JBoss tool plugin](../doc_src_img/chapter3/5.JPG "JBoss tool plugin")

After JBoss Tools is installed properly, follow these steps to install WildFly Server.

1. Once Eclipse is opened, right-click under the Project Explorer tab and highlight New, then from the pop-out, click on Other

   ![new-other](../assets/images/project-new-other.PNG "new-other")
   
2. Enter text `server` in the `type filter text` field, select `Server` and click the Next button.

   ![server](../doc_src_img/chapter3/6_2.jpg "server")

2. Select the WildFly version you wish to work with and click Next (Skyve currently supports versions up to 26)

   ![select server](../assets/images/define-a-new-server-wildfly21.png "select server")

3. Click Next again

   ![select Next](../assets/images/define-a-new-server-wildfly21_2.png "select Next")

4. Click on the Download and install runtime link

   ![install runtime](../assets/images/define-a-new-server-wildfly21_3.png "install runtime")

5. Select the latest version of WildFly, then click Next

   ![select runtime](../assets/images/define-a-new-server-wildfly21_4.png "select runtime")

6. Once you have read the terms of the licence agreement, check the box to accept the terms, and click Next

   ![accept agreement](../assets/images/define-a-new-server-wildfly21_5.png "accept agreement")

7.  Finally, select the path for where you wish your download and install locations to be found, then click Finish to complete the installation

    ![select path](../assets/images/define-a-new-server-wildfly21_6.png "select path")

    ![path](../assets/images/define-a-new-server-wildfly21_7.png "path")

8.  Wait for Eclipse to complete the download and installation process before moving on to the next step

## 3.4. Add Repository in Eclipse

After download and installation of Eclipse and the server, the next step is to add our repository to Eclipse.

1. Open Eclipse in your system
2. Click on the Window tab and click on Show View, then Other

   ![Window](../doc_src_img/chapter5/1.jpg "Window")

3. Select Git Repositories and click on open

   ![Git](../doc_src_img/chapter5/2.jpg "Git")

4. Click on Git Repositories in the bottom area of eclipse, right click and select "Clone a Git Repository"...

   ![Git clone](../doc_src_img/chapter5/3.jpg "Git clone")

5. Get URL from GitHub by going to GitHub and click on Code button.

   ![Git URL](../doc_src_img/chapter5/4.jpg "Git URL")

6. Copy that link, paste in the Clone window, and click on Next

   ![Clone Window](../doc_src_img/chapter5/5.jpg "Clone Window")

7. Click on Next again

   ![Clone Next](../doc_src_img/chapter5/6.jpg "Clone Next")

8. Choose the directory where you want to put your project and Click on Finish

   ![Clone Finish](../doc_src_img/chapter5/7.jpg "Clone Finish")

In Git Repositories, we can see our repository is added now!

## 3.5. Import Project

As we have already created a project in Skyve [Foundry](https://foundry.skyve.org/foundry/), now it is time to import that project into Eclipse to complete changes in the Aged Care app. To import the project in Eclipse, follow the steps below:

1. Click on File tab in Eclipse and Select import

   ![import](../doc_src_img/chapter5/8.jpg "import")

2. Select Existing Maven Project from list and click on Next

   ![Maven](../doc_src_img/chapter5/9.jpg "Maven")

3. Set your root directory (the folder where you cloned your Git repository to in the previous section) and click on Finish

   ![Root](../doc_src_img/chapter5/10.jpg "Root")

You can see your project in the Project Explorer area in Eclipse.

## 3.6. Set the server

To run our project on the server, we need to set Server in Eclipse first.

1. Click on Server tab in Eclipse and right click

   ![Server tab](../doc_src_img/chapter5/11.jpg "Server tab")

2. Click on Add and Remove and then Finish

   ![Server set](../assets/images/define-a-new-server-wildfly21_8.png "Server set")

## 3.7 Configure and Deploy the Skyve Project

### Deploy your Skyve project

Once the Wildfly Server is configured, it's easy to deploy your Skyve project to your WildFly Server.

Firstly, do a maven install to resolve and download dependencies and addins.

1. From Eclipse, choose Run As->maven install
   ![Maven install](../assets/images/maven-install.png "Maven install")
   
Skyve applications can store images and other types of rich content. To do this, Skyve needs to have full access to a folder to store and manage content.
You need to create a dedicated folder for Skyve to do this. The content folder can be located anywhere and named whatever you like, however it is easiest to place it inside your eclipse workspace folder (but outside of your project) and name it something simple like `content`.
   
2. Create a folder named `content` inside your eclipse workspace folder

   ![Content folder](../assets/images/content-folder.png "Content")

3. Open the File window and browse to the content folder (which is in your root folder) and create new folder named `agedCare`.

   ![Content folder agedCare](../assets/images/content-aged-care.PNG "Content folder with agedCare")

Skyve provides a content management addin to manage your files and content. Place this addin somewhere on your file system - for example, within a folder called `addins` in your `content` folder.

4. Create the `addins` folder inside your `content` folder

5. In eclipse, expand the target folder and copy the `skyve-content.zip` addins file into the `addins` folder 

   ![Content addin](../assets/images/skyve-content-zip-target-folder.PNG "Content addin")

   ![Content addin in place](../assets/images/skyve-content-zip-in-place.PNG "Content addin in place")
   
6. Open the WildFly deployments folder by right-clicking on the server and clicking on Show In, then clicking on File Browser

   ![Deploy](../doc_src_img/chapter6/1.jpg "Deploy")

7. Copy the agedCare.json and agedCare-ds.xml and paste in the WildFly deployments folder that you opened in the previous step.

   ![Copy files](../doc_src_img/chapter6/2.jpg "Copy files")

8. Open the agedCare.json file in your preferred text editor.

Go to the `content` section and modify the `directory` setting to tell Skyve where the content folder is located.
Note that you must not use backslashes even if you are running on Windows - and the folder path must be terminated with a slash
e.g. `directory: "C:/eclipse/content/",`

Also update the `addins` section and for the location you created above

![json content](../assets/images/json-content.PNG "json content")

Go to the bottom of the file to change the identifier.

![json environment and bootstrap](../assets/images/json-environment-and-bootstrap.PNG "json environment and bootstrap")

If you want to change the username and password, you can change in the bootstrap section.

Lastly, save and close the file.

5. Open agedCare-ds.xml file in the text editor, 
    1. go to the connection-url and replace `/content/agedCare` with the content folder address, 
    2. and add a new file name for your database 
    3. set a username and password and 
    4. save the file.

   ![agedCare-ds](../assets/images/aged-care-ds.PNG "agedCare-ds")

### Run your Aged Care application

Part of Skyve's low-code approach is to generate Java code for you (in the background) so that you don't have to write large amounts of Java code. We call this step `Generate Domain` because Java classes will be created representing the `domain` (the `problem domain` or `area of knowledge`) of your project. The domain classes are Java classes that do the work of managing data access and storage for your application.

Generate domain validates and compiles the metadata (XML files) in your project and checks that the application domain is in a valid state. Errors for the developer to fix are written to your console, and if generation is successful, the domain will be compiled to produce Java domain files and unit tests.

To run the `Generate Domain` command, follow the steps below:
- Click the Run tab, then click Run Configurations.

![Run configurations](../doc_src_img/chapter6/6_1.jpg "Run configurations")

- Enter the text `generate` in the `type filter` search field, click the option `agedCare - Generate Domain`, then click Run.


![Run Generate domain](../doc_src_img/chapter6/6_2.jpg "Run Generate domain")

- Right click the server and click the Start button to start the server.

![start server](../doc_src_img/chapter6/9.jpg "start server")

When your Console Window shows text similar to that shown below, your agedCare app has been deployed and is running on your localhost server (your local machine).

![Console](../doc_src_img/chapter6/10.JPG "Console server")

If not, you may try to debug by yourself to find the source of the problem, or [Join Us On Slack](https://join.slack.com/t/skyveframework/shared_invite/enQtNDMwNTcyNzE0NzI2LWNjMTBlMTMzNTA4YzBlMzFhYzE0ZmRhOWIzMWViODY4ZTE1N2QzYWM1MTdlMTliNDIyYTBkOWZhZDAxOGQyYjQ) and ask any questions there. You will receive support from the [Skyve](https://skyve.org) team or a community team member.

Access the Aged Care app from your Web Browser at [http://localhost:8080/agedCare](http://localhost:8080/agedCare). Sign in using the default username "setup" and password "setup".

![Aged Care app](../doc_src_img/chapter6/11.jpg "Aged Care app")

Continue to [3.8 List Views]({{ site.url }}{{ site.baseurl }}ch3-list-views/)