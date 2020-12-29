# Contents

- [1. Tutorial Overview ](../readme.md/#1-tutorial-overview)
- [2. No-code Development](../tutorial/chapter2.md/#2-no-code-development)
- [3. Low Code Extensions](../tutorial/chapter3.md#3-low-code-extension)
- [4. Java Extensions](#4-java-extension)
  - [Conditions](#conditions)
  - [Bizlets](#bizlets)
  - [Actions](#actions)

# 4. Java Extensions

It's now time to create Groups and Users in the application.

In most applications, there are usually groups of users who have similar permissions, e.g. Staff, or Client and this approach allows you to assign access on the basis of the kinds of roles users might perform in the application. The `admin` module that Skyve provides includes a security group concept as well as a user administration function. For more detail click on link for adding Users and Groups: https://skyvers.github.io/skyve-user-guide/users/

For our application, we will create groups for Carer, Nurse and Manager.

A Carer is someone who can see all the Residents information and do few assessments for them.

A Nurse is qualified to distribute and do an Assessment review.

A Manager has access to all information and can also manage user access.

Go to the application and create group for carer, nurse, manager as below:

Open Admin>Security Admin>Groups

1. Create group for the Carer as below:

   ![Carer Groups](../doc_src_img/chapter8/1.jpg "Carer Groups")

2. Create group for the Manager as below:

   ![Manager Groups](../doc_src_img/chapter8/2.jpg "Manager Groups")

3. Create group for the Nurse as below:

   ![Nurse Groups](../doc_src_img/chapter8/3.jpg "Nurse Groups")

Next, create Users for Carer, Manager, and Nurse.
Go to the application, Open Admin>Security Admin>Users

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

**[⬆ back to top](#contents)**

- #### Conditions

In the Assessment document, Carers should not have access to see Pain or Behaviour assessments and so these should not be available to users in the Carer security group.

This can be achieved in Skyve by declaring a condition. In particular, we can have a condition to determine the visibility of some specified attributes on the screen. To begin with, we define the condition in the `Assessment.xml`. We will define this condition as follows:

```xml
<conditions>
	<condition name="roleCarer">
		<expression><![CDATA[isUserInRole("agedCare", "Carers")]]></expression>
	</condition>
</conditions>
```

Once the condition is defined, we can control the visibility of the assessments in the view as below:

Open the `assessmentDetail.xml` and change the visibility of `Pain assessment` and `Behaviour assessment`

![Carer visibity](../doc_src_img/chapter8/9.jpg "Carer visibility")

To test the changes, generate domain and re-deploy the server.

Login as a Carer

![Carer Signin](../doc_src_img/chapter8/7.jpg "Carer Signin")

Open an Assessment, and check that Pain and Behaviour assessments are not available when signed in as a Carer.

![Carer assessments](../doc_src_img/chapter8/10.jpg "Carer assessments")

**[⬆ back to top](#contents)**

- #### Bizlets

Adding business logic to the record lifecycle using a Bizlet class.

In Skyve you can add business logic using a special class called a Bizlet class. For each document you can create a Bizlet class to extend lifecycle stages like `newInstance` (when a record is created) `preSave` (just before a record is saved) etc.

Each document package can include declarations of actions, reports, views and the associated Bizlet file. The Bizlet file contains document-specific behaviours including overrides of default action behaviours and document bean lifecycle events.

You can read more about Bizlet and Extension classes here - https://skyvers.github.io/skyve-dev-guide/bizlets/#bizlets

##### Bizlet ResidentID

First of all, let's show you how to create `ResidentBizlet` to customize the document as we want.

Right-click to the `Resident` package and select `New`, then select `Class` in the sub-menu.

The new Class window will appear as shown below:

![Class defination](../doc_src_img/chapter9/1.jpg "Class defination")

To complete the creation of the ResidentBizlet class, use "Eclipse Quick Fix suggestions" as shown below:

![Quickfix resident](../doc_src_img/chapter9/2.jpg "Quickfix resident")

![Quickfix ResidentBizlet](../doc_src_img/chapter9/3.jpg "Quickfix ResidentBizlet")

Now it is time to override the `newInstance` method to set the `Resident ID` number when a new instance of a Resident record is created.

By overriding, we mean that we want our application to do all the usual things Skyve needs to do to create a record as well as some things we want specifically - in this case assign a new ID number. Skyve provides a way to generate unique ID numbers, either numeric only, or alpha-numeric - so we can use this to generate numbers like:
R001
R002
...
etc

To override the newInstance method:

![override](../doc_src_img/chapter9/4.jpg "override")

Select newInstance from the list.

![newInstance](../doc_src_img/chapter9/5.jpg "newInstance")

The override method is generated in the file

![code](../doc_src_img/chapter9/6.jpg "code")

Add the below code in the method

```java

{
String residentId;

residentId=ModulesUtil.getNextDocumentNumber("R", Resident.MODULE_NAME, Resident.DOCUMENT_NAME, Resident.residentIDPropertyName, 4);
bean.setResidentID(residentId);

return super.newInstance(bean);

}
```

The method `ModulesUtil.getNextDocumentNumber("R", Resident.MODULE_NAME, Resident.DOCUMENT_NAME, Resident.residentIDPropertyName, 4)`; will create a new unique number with a prefix of "R" , for Resident type records, for the Resident ID attribute, with a length of 4 characters.

Because this code is called in the newInstance() method, the ResidentID number will be assigned as soon as a new record is created.

To test, redeploy the application and click on a new record in the Resident document. We will see the `ResidentID` is already generated.

#### preSave() method of the Bizlet

In next few steps, we will see how we can use the `preSave()` Bizlet method.

In previous step we created a `newInstance` method. Now,
I want you to change the Bizlet and use the preSave() method instead of newInstance() as follows:

- When we Save the resident record, check if the residentId is null - if it is null, assign a new DocumentNumber using `modulesUtil.getNextDocumentNumber` (similar to what you did for new instance)
- Add a condition to the Resident.xml called `hasID` which checks if `bean.getResidentId()!=null`
- Only show the `residentID` field in the Resident view, if the `hasID` condition is true

1. Modify the `ResidentBizlet.java` file and override the `preSave()` (edit the ResidentBizlet.java file, go to source > override and implement method and select preSave() from list and click on Ok).

   ![preSave](../doc_src_img/chapter9/7.jpg "preSave")

2. Add following code in the `preSave()` method in `ResidentBizlet.java`

```java
package modules.agedCare.Resident;

import org.skyve.metadata.model.document.Bizlet;

import modules.admin.ModulesUtil;
import modules.agedCare.domain.Resident;

public class ResidentBizlet extends Bizlet<Resident> {

	/**
	 *
	 */
	private static final long serialVersionUID = 1455780144763235289L;

	public Resident newInstance(Resident bean) throws Exception {
		return super.newInstance(bean);
	}
	@Override
	public void preSave(Resident bean) throws Exception {
	    if (bean.getResidentID() == null) {
			String residentId = ModulesUtil.getNextDocumentNumber("P", Resident.MODULE_NAME, Resident.DOCUMENT_NAME, Resident.residentIDPropertyName, 4);

			bean.setResidentID(residentId);
			return;
		}
		return;
	}
}
```

![code presave](../doc_src_img/chapter9/8.jpg "code presave")

3. Next, add a condition to the `Resident.xml` called `hasID` which checks if bean.getResident()!=null
4. Open `Resident.xml`, and add condition after `attributes` as below

```xml

<conditions>
	<condition name="hasID">
		<expression><![CDATA[getResidentID()!=null]]></expression>
	</condition>
</conditions>
```

5. To show the `residentID` field in the Resident view, if the `hasID` condition is true, open `_residentInfo.xml`

6. Then, change ResidentID field as below:

```xml
<row>
	<item>
		<textField disabled="true" visible="hasID" binding="residentID" />
	</item>
</row>

```

To see the changes, generate domain and deploy the application. Sign in as a manager, and add a new resident. The resident id will generate when you save all other details.

![resident document](../doc_src_img/chapter9/9.jpg "resident document")

After completing the details for the Resident record, press the save button and check that the Resident ID number is generated.

![resident document Id](../doc_src_img/chapter9/10.jpg "resident document Id")

**[⬆ back to top](#contents)**

#### Enhancement in Aged care application

In this section, we will add more functionality to the Assessment document, to automatically record the date and time that the Assessment record is created.
To do this we will:

- Add a new `dateTime` attribute to the Assessment doucument called `assesmentCreatedTime`
- Add a `Bizlet` for `Assessment` to set the `assesmentCreatedTime` when a new assessment is created and record the user who created the assessment
- In the `Facility` view, show a `listGrid` of `Residents` at that facility
- Add a `status` enumeration for Resident with appropriate values (current, discharged, deceased), where the default value is current

1. Add a new `dateTime` attribute to the Assessment document called `assesmentCreatedTime` - to do this, in the `Assessment.xml` file and add a new attribute as below:

```xml
<dateTime name="assessmentCreatedTime">
	<displayName>Assessment Created Time</displayName>
</dateTime>
```

Next, modify the `_reviewInfo` view component - open the `_reviewInfo.xml` file to add that attribute in new row.

```xml
<row>
	<item>
		<default binding="assessmentCreatedTime" />
	</item>
</row>

```

Generate domain, and deploy your app to check that you can see the new field in the Assessment records.

![Assessment created date](../doc_src_img/chapter10/1.jpg "Assessment created date")

2. Add a Bizlet for the Assessment document to automatically set the `assesmentCreatedTime` when a new assessment is created - and to record the user who created the assessment. First create the `AssessmentBizlet.java` file as we did above:

- Right-click to the `Assessment` package and select New, then select Class in the sub-menu.
- Follow the Quick Fix suggestions to resolve errors in `AssessmentBizlet.java` file and import all the packages.
- Override the `newInstance` method. (Click on source > override and implement method. Choose newInstance form the list - Eclipse will generate newInstance method and override notation for us.)
  Then update the method as shown below:

```java
package modules.agedCare.Assessment;

import org.skyve.domain.types.DateTime;
import org.skyve.metadata.model.document.Bizlet;

import modules.admin.ModulesUtil;
import modules.agedCare1.domain.Assessment;

public class AssessmentBizlet extends Bizlet<Assessment> {

	/**
	 *
	 */
	private static final long serialVersionUID = 3621162734311172527L;

	@Override
	public Assessment newInstance(Assessment bean) throws Exception {
		bean.setAssessmentCreatedTime(new DateTime());
		bean.setAssessmentCreatedBy(ModulesUtil.currentAdminUser());
		return super.newInstance(bean);
	}

}
```

Generate domain and deploy the application to see the changes.

So, now we have the `Assessment Created Time` and `Assessment Created By` in the Assessment document as shown:

![Set assessment created by](../doc_src_img/chapter10/2.jpg "Assessment created by")

3. Next we want to change the Facility view to show a list of all the Residents associated with the Facility.

In Skyve, we can use a listGrid as follows: (you can read more about the listGrid widget here - https://skyvers.github.io/skyve-dev-guide/views/#listgrid-example)

Go to the `Facility` package and open the `edit.xml` to add listGrid as below

```xml
<listGrid continueConversation="true" query="qResident">
		<filterParameter filterBinding="facility" operator="equal"valueBinding="bizId" />
</listGrid>
```

![listGrid](../doc_src_img/chapter10/3.jpg "listGrid")

Generate domain to check result.

![listGrid of resident](../doc_src_img/chapter10/4.jpg "listGrid of resident")

4. Next we will modify our application to record a status for each Resident.

To do this, we will add a enumeration called `residentStatus` to the Resident document, with values (current, discharged, deceased), where the default value is current.

Open the `Resident.xml` and add this code in `<attributes>`

```xml
<enum name="residentStatus">
	<displayName>Resident Status</displayName>
	<defaultValue>current</defaultValue>
	<values>
		<value code="Current" />
		<value code="Discharged" />
		<value code="Deceased" />
	</values>
</enum>
```

Next, open `_residentInfo.xml` and add row

```xml
<row>
	<item>
		<default binding="residentStatus" />
	</item>
</row>
```

Generate domain, deploy app again. You can see the new field in Assessment `Resident Status`.

![Status](../doc_src_img/chapter10/5.jpg "Status")

**[⬆ back to top](#contents)**

- #### Actions
  Actions represent behaviours that impact our application data. Actions can be in the form of button, hyperlinks or API calls. For more detail visit the link https://skyvers.github.io/skyve-dev-guide/actions/.

Next, we will add an action that only a nurse can click, that sets the status on the assessment to `reviewed=true` and sets the `assessmentReviewDate`.

1. First, create an action class in the actions package (within the document package) that implements `org.skyve.metadata.controller.ServerSideAction` - that is, an action that will be run at the Server (rather than in the user's browser).

2. To create an action, go to Assessment package and create a new package called `actions`.

3. Then, under actions package create a action class Reviewed.java. On the class creation form, use the Add button to choose `org.skyve.metadata.controller.ServerSideAction`

   ![Reviewed class](../doc_src_img/chapter11/1.jpg "reviewed class")

4. Adjust the imports at the top of the file for the Assessment document to `import modules.agedCare.domain.Assessment;`

   ![import assessment](../doc_src_img/chapter11/2.jpg "import assessment")

5. Click on Add unimplemented methods

   ![unimplemented](../doc_src_img/chapter11/3.jpg "unimplemented")

6. Add the code as shown below

```java
package modules.agedCare.Assessment.actions;

import org.skyve.domain.types.DateTime;
import org.skyve.metadata.controller.ServerSideAction;
import org.skyve.metadata.controller.ServerSideActionResult;
import org.skyve.web.WebContext;

import modules.admin.ModulesUtil;
import modules.agedCare1.domain.Assessment;

public class Reviewed implements ServerSideAction<Assessment> {

	/**
	 *
	 */
	private static final long serialVersionUID = -7544189610898309931L;

	@Override
	public ServerSideActionResult<Assessment> execute(Assessment bean, WebContext webContext) throws Exception {
		bean.setAssessmentReviewTime(new DateTime());
		bean.setAssessmentCreatedBy(ModulesUtil.currentAdminUser());
		return new ServerSideActionResult<>(bean);
	}

}
```

![Action class](../doc_src_img/chapter11/4.jpg "Action class")

7. For the action to be available in the view, we need to declare the action in the view, as follows:

open `edit.xml` in the `Assessment` package to add action as below

```xml
<actions>
		<defaults />
		<action className="Reviewed" displayName="Reviewed" inActionPanel="true">
		</action>
</actions>
```

![add action in edit](../doc_src_img/chapter11/5.jpg "Add action")

8. Next we need to assign privileges so that only Nurses can use the action

To do this, modify the role definitions in the module (the agedCare.xml file).

In our document only nurse can review the assessments, So we can add the `action` in nurse role under `privileges` as below

![Action in nurse role](../doc_src_img/chapter11/6.jpg "Add action in nurse role")

To check your changes, generate domain and redeploy your application, and sign in as a Nurse user.

![Nurse Signin](../doc_src_img/chapter11/7.jpg "Nurse Signin")

Congratulations, we are almost finished.

The last step is to ensure that the Assessment Reviewed Time can only be changed using the action (which is restricted to Nurse users).

To do this, modify the Resident view in `_reviewDetail.xml`, and change the `Assessment Reviewed Time` attribute to be `enabled="false"`, like this:

```xml
<row>
   <item>
     <textField binding="assessmentReviewedTime" enabled="false" />
   </item>
</row>
```

Save the changes to the view, return to your browser and refresh the screen to see the change. The Assessment Reviewed Time can now only be modified by a Nurse using the action.

You can see the Reviewed button on the top.

When you click on the Reviewed button it set the Assessment Review field with current date and time.

![Reviewed](../doc_src_img/chapter11/8.jpg "Reviewed")

Congratulations you have completed the Aged Care tutorial.

In this tutorial, you learned how:

- To create a Skyve application using Skyve Foundry
- to deploy your application
- To configure your application for collaboration
- To configure your local developer environment and build and deploy
- To modify the XML metadata that defines the data, menus and roles within your application
- To add custom Java code to control visibility, set values and perform action behaviours within the application.

From here it is time for you to explore Skyve some more and try your own applications and changes. Remember you can ask questions on the Skyve slack channel, or purchase direct assistance from Skyve specialist developers through Skyve Foundry. Check the skyve.org homepage for self-help training videos and don't forget the Developer Guide (https://skyvers.github.io/skyve-dev-guide/).

We hope that you have enjoyed this tutorial!

**[⬆ back to top](#contents)**

**[:arrow_left: go back to 1: Tutorial Overview](../readme.md/#1-tutorial-overview)**
