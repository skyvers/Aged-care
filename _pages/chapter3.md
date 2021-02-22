---
title: "Low Code Extensions"
permalink: /chapter3/
excerpt: "Low code development using the Skyve metadata"
toc: true
sidebar:
  title: "Index"
  nav: docs
---

In this section, we will work on collaboration and configuration of the local environment. After that, we will do some editing in the XML files, which will change the lists, views, and layout of our application. So, this step will enable us to test and deploy our application locally on our own (or another machine).

For more detail visit our [Dev Guide](https://skyvers.github.io/skyve-dev-guide/) - which will help you learn and understand about our development. It also covers most [Skyve Framework](https://skyve.org) elements and concepts. There are many real examples for you to refer to also.

## 3.1. Collaboration

Next, we need to Collaborate our application with Github.

Why we need collaboration?

Collaboration will allow another user of your team to do editing in your application or between [Foundry](https://foundry.skyve.org/foundry/) users and developer. So, to do collaboration we need to provide our application with a remote endpoint of new Git repository.

To find more details on how to collaborate, go to the [Help button](https://Foundry.skyve.org/Foundry/loggedIn.jsp?a=e&m=Foundry&d=Help) in the top right of the Foundry page, and follow the steps for collaboration.

![Collaboration](../doc_src_img/Chapter2/1.jpg "Collaboration")

### Setup to Github

To enable the collaboration, first of all Sign up or log into [Github](https://github.com/) account.
To create a new repository follow the steps below:

- Click on the Add button on the top right side to create the new repository

  ![Create repository](../doc_src_img/Chapter2/2.jpg "Create reposistory")

- Next, enter the name of the repository, make it private, and click on create

  ![repository name](../doc_src_img/Chapter2/3.jpg "repository name")

- After creating repository, you will see the link as shown below, copy the link

  ![Link](../doc_src_img/Chapter2/4.jpg "Link")

- Next, go to [Foundry](https://foundry.skyve.org/foundry/), open the collaborate tab and paste the link in Remote Endpoint

- Click on apply
- Click on Save

  ![remote endpoint](../doc_src_img/Chapter2/5.jpg "remote endpoint")

- Then, Go to collaborate tab of your application and describe changes with comment, click on commit and push button

  (Note: "Commit will put your changes into your local repo and "Push" sends that changes to remote location)

  ![commit and push](../doc_src_img/Chapter2/6.jpg "commit and push")

- Next, check your project in Github

- Go to Github, open repository to see all the files

  ![Repository file](../doc_src_img/Chapter2/7.jpg "Repository file")

You have now successfully created your application and configured it for collaboration!

## 3.2. Configure your local environment

For this section, we have chosen to show how to use Eclipse as the development environment, however if you prefer you can use other development environment tools such as IntelliJ, NetBeans, Visual Studio Code etc. However, if you're not completely familiar with these, use Eclipse so that you can follow the steps below.

Before you can import the project into Eclipse, you need to download and install Eclipse in your system.

### Download and Install Eclipse and JDK

#### Download and Install Eclipse

  - Click here to [Download Eclipse](https://www.eclipse.org/downloads/packages/)
  - Next, Click on [Eclipse IDE for Enterprise Java Developers](https://www.eclipse.org/downloads/packages/release/2020-09/r/eclipse-ide-enterprise-java-developers)

  ![Download Eclipse](../doc_src_img/chapter3/1.jpg "Download Eclipse")

  - Click on download
  - Then, Install Eclipse in your system

#### Download and Install JDK

  - Click here to [download and install JDK 8](https://adoptopenjdk.net/installation.html)
  - Install an OpenJDK 8 version from [AdoptOpenJDK](https://adoptopenjdk.net/installation.html?variant=openjdk8&jvmVariant=hotspot#x86-32_win-jdk) (or an alternative open JDK of your choice)

## 3.3. Install and Configure Wildfly Server

We need an application server to be able to access the application through our browser, for this we will demonstrate using Red Hat's Wildfly application server plugin. Skyve apps can be deployed on recent versions of Wildfly (10-20).

### Install Wildfly Server

You can skip this step if WildFly Server is already installed on your system.

Before installing WildFly Server, make sure JBoss Tools is installed on your system.

To install JBoss Tools, click on Help, then click Eclipse Marketplace.

![Jboss tool](../doc_src_img/chapter3/2.JPG "Jboss tool")

In the searchbar, enter 'jboss' then search.

Select the JBoss Tools version that the search returns, and click Install.

![Jboss install](../doc_src_img/chapter3/3.JPG "Jboss install")

Select list as below

![Jboss install selection](../doc_src_img/chapter3/15.jpg "Jboss install selection")

To check if JBoss Tools is installed properly, click on Help, then click Eclipse Marketplace.

![Jboss tool install](../doc_src_img/chapter3/4.JPG "Jboss tool install")

Change to the `Installed` tab.

If the JBoss Tools plugin is present, you are ready to continue.

![Jboss tool plugin](../doc_src_img/chapter3/5.JPG "Jboss tool plugin")

After JBoss Tools was installed properly, follow these steps to install WildFly Server.

1. Once Eclipse is opened, right-click under the Package Explorer tab and highlight New, then from the pop-out, click on Server

   ![server](../doc_src_img/chapter3/6.JPG "server")

2. Select the WildFly version you wish to work with and click Next

   ![select server](../doc_src_img/chapter3/7.JPG "select server")

3. Click Next again

   ![select Next](../doc_src_img/chapter3/8.JPG "select Next")

4. Once more, click the Next button

   ![install runtime](../doc_src_img/chapter3/9.JPG "install runtime")

5. Click on the Download and install runtime link

   ![select runtime](../doc_src_img/chapter3/10.JPG "select runtime")

Select the latest version of WildFly, then click Next

![accept agreement](../doc_src_img/chapter3/11.JPG "accept agreement")

7.  Once you have read the terms of the licence agreement, check the box to accept the terms, and click Next

    ![select path](../doc_src_img/chapter3/12.JPG "select path")

8.  Finally, select the path for where you wish your download and install locations to be found, then click Finish to complete the installation

    ![path](../doc_src_img/chapter3/13.JPG "path")

9.  Wait for Eclipse to complete the download and installation process before moving on to the next step

    ![Downloading](../doc_src_img/chapter3/14.JPG "Downloading")

## 3.4. Add Repository in Eclipse

After downloading and installation of eclipse and server, the next step is add our repository in the eclipse.

1. Open the Eclipse in your system
2. Click on window tab and click on show View, then other

   ![Window](../doc_src_img/chapter5/1.jpg "Window")

3. Select Git Repositoies and click on open

   ![Git](../doc_src_img/chapter5/2.jpg "Git")

4. Click on Git Repositories in bottom area of eclipse, right click and select clone a Git Repostory...

   ![Git clone](../doc_src_img/chapter5/3.jpg "Git clone")

5. Get URL from Github, go to Github and click on Code button.

   ![Git URL](../doc_src_img/chapter5/4.jpg "Git URL")

6. Copy that link and paste in Clone window and click on Next

   ![Clone Window](../doc_src_img/chapter5/5.jpg "Clone Window")

7. Click on Next again

   ![Clone Next](../doc_src_img/chapter5/6.jpg "Clone Next")

8. Choose the directory where you want to put your project and Click on Finish

   ![Clone Finish](../doc_src_img/chapter5/7.jpg "Clone Finish")

In Git Repositories, we can see our repository is added now!

## 3.5. Import Project

As we already created a project in Skyve [Foundry](https://foundry.skyve.org/foundry/), now it is time to import that project in Eclipse to do changes in the Aged Care app. To import project in Eclipse follow the steps below:

1. Click on File tab in Eclipse and Select import

   ![import](../doc_src_img/chapter5/8.jpg "import")

2. Select Exiting Maven Project form list and click on Next

   ![Maven](../doc_src_img/chapter5/9.jpg "Maven")

3. Set your root directory (Folder where you cloned your git repository to in the previous section) and click on Finish

   ![Root](../doc_src_img/chapter5/10.jpg "Root")

You can see your project in Project Explorer area in Eclipse.

## 3.6. Set the server

To run our project in server we need to set Server in Eclipse first.

1. Click on Server tab in Eclipse and right click

   ![Server tab](../doc_src_img/chapter5/11.jpg "Server tab")

2. Click on Add and Remove and then Finish

   ![Server set](../doc_src_img/chapter5/12.jpg "Server set")

## 3.7 Configure and Deploy the Skyve Project

### Deploy your Skyve project

Once the Wildfly Server is configured, it's easy to deploy your Skyve project to your WildFly Server.

1. Open WildFly deployments folder Right-click on the server and click on Show In, then click on File Browser

   ![Deploy](../doc_src_img/chapter6/1.jpg "Deploy")

2. Copy the agedCare.json and agedCare-ds.xml and paste in the deployments folder to the WildFly deployments folder that you opened in the previous step.

   ![Copy file](../doc_src_img/chapter6/2.jpg "Copy file")

Skyve applications can store images and other types of rich content. To be able to do this, Skyve needs to have full access to a folder to store and manage content.
You need to create a dedicated folder for Skyve to do this. The content folder which can be located anywhere and named whatever you like, however it is easiest to place it inside your eclipse folder and name it something simple like `content`.

3. Create a folder name `content` inside your eclipse folder

4. Open the File window and browse to the content folder (which is in your root folder) and create new folder named `agedCare`.

   ![Content](../doc_src_img/chapter6/3.jpg "Content")

5. Open the agedCare.json file in your preferred text editor.

Go to the `content` section and modify the `directory` setting to tell Skyve where the content folder is located.
Note that you must not use backslashes even if you are running on Windows - and the folder path must be terminated with a slash
e.g. `directory: "C:/eclipse/content/",`

![json1](../doc_src_img/chapter6/4.jpg "json1")

Go to the bottom of the file to change the identifier.

![json2](../doc_src_img/chapter6/5.jpg "json2")

If you want to change the username and password, you can change in bootstrap, in this app it is not changed.

Lastly, save and close the file.

5. Open agedCare-ds.xml file in the text editor

   ![agedCare-ds](../doc_src_img/chapter6/7.jpg "agedCare-ds")

   Go to connection-url and replace ~ sign with content folder address and save the file.

   ![agedCare-ds](../doc_src_img/chapter6/8.jpg "agedCare-ds")

### Run your Aged Care application

Part of Skyve's low-code approach is to generate Java code for you (in the background) so that you don't have to write large amounts of Java code. We call this step `Generate Domain` because Java classes will be created representing the `domain` (the `problem domain` or `area of knowledge`) of your project. The domain classes are Java classes that do the work of managing data access and storage for your application.

Generate domain validates and compiles the metadata (XML files) in your project and checks that the application domain is in a valid state. Errors for the developer to fix are written to your console, and if generate is successful, the domain will be compiled to produce Java domain files and unit tests.

![Generate domain](../doc_src_img/chapter6/6.jpg "Generate domain")

Right click the server and use the start button to start the server.

![start server](../doc_src_img/chapter6/9.jpg "start server")

When your Console Window shows text similar to that shown below, your agedCare has been deployed and is running on your localhost server (your local machine).

![Console](../doc_src_img/chapter6/10.JPG "Console server")

If not, you may try to debug by yourself to find the source of the problem, or [Join Us On Slack](https://join.slack.com/t/skyveframework/shared_invite/enQtNDMwNTcyNzE0NzI2LWNjMTBlMTMzNTA4YzBlMzFhYzE0ZmRhOWIzMWViODY4ZTE1N2QzYWM1MTdlMTliNDIyYTBkOWZhZDAxOGQyYjQ) and ask any questions there. You will get support from the [Skyve](https://skyve.org) team or a community team member.

Access the Aged Care app from your Web Browser at http://localhost:8080/agedCare. Sign in with by default username "setup" and password "setup"..

![Aged Care app](../doc_src_img/chapter6/11.jpg "Aged Care app")

Continue to [3.8 List Views]({{ site.url }}{{ site.baseurl }}ch3-list-views/)