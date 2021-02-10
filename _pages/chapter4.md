---
title: "4. Java Extensions"
permalink: /chapter4/
excerpt: "Extending your tutorial application with business logic"
toc: true
sidebar:
  title: "Index"
  nav: docs
---

It's now time to create Groups and Users in the application.

In most applications, there are usually groups of users who have similar permissions, e.g. Staff, or Client and this approach allows you to assign access on the basis of the kinds of roles users might perform in the application. The `admin` module that Skyve provides includes a security group concept as well as a user administration function. For more detail, see the [User Guide](https://skyvers.github.io/skyve-user-guide/users/) section on adding Users and Groups.

For our application, we will create groups for Carer, Nurse and Manager:

* A Carer is someone who can see all the Residents information and do few assessments for them.
* A Nurse is qualified to distribute and do an Assessment review.
* A Manager has access to all information and can also manage user access.

Go to the application and create groups for carer, nurse, manager as below:

Open `Admin`>`Security Admin`>`Groups`

1. Create group for the Carer as below:

   ![Carer Groups](../doc_src_img/chapter8/1.jpg "Carer Groups")

2. Create group for the Manager as below:

   ![Manager Groups](../doc_src_img/chapter8/2.jpg "Manager Groups")

3. Create group for the Nurse as below:

   ![Nurse Groups](../doc_src_img/chapter8/3.jpg "Nurse Groups")

Next, create a User for the Carer, Manager and Nurse groups.

Go to the application, Open `Admin`>`Security Admin`>`Users`

1. Create Users for Carer by adding Full name and Email

2. Click on New contact

   ![Carer User](../doc_src_img/chapter8/4.jpg "Carer User")

3. Set user name and password

   ![Set Username](../doc_src_img/chapter8/5.jpg "Set username")

4. Click on Existing group, select carer and add in Assigned Group

   ![Assigned group](../doc_src_img/chapter8/6.jpg "Assigned group")

5. Click on save

Next create Users for Manager and Nurse same in the same way as we created for Carers in the previous steps.

Once you have created users for each role, it is time to test that they can do what they need within the application. For each user type, make sure you are signed out of the application, then sign in as that user.

First, let's test Carer.

![Carer Signin](../doc_src_img/chapter8/7.jpg "Carer Signin")

You can see, the Carer can access resident and assessment data in the Aged care module. This is because in the agedCare.xml file, the menu items for Resident and Assessment were assigned permissions for Carer and Nurse (however access to the Facility menu item is only assigned to the Manager role).

The Carer sign in page is shown below:

![Carer Signin page](../doc_src_img/chapter8/8.jpg "Carer Signin page")

You should also check Nurse and Manager can access what they need correctly by signing in as those users.

Continue to [Conditions]({{ site.url }}{{ site.baseurl }}/ch4-conditions/)