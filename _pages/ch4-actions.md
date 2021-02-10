---
title: "Actions"
permalink: /ch4-actions/
excerpt: "Adding business logic to your application using Actions"
toc: false
sidebar:
  title: "Index"
  nav: docs
---

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

- to create a Skyve application using Skyve Foundry
- to deploy your application
- to configure your application for collaboration
- to configure your local developer environment and build and deploy
- to modify the XML metadata that defines the data, menus and roles within your application
- to add custom Java code to control visibility, set values and perform action behaviours within the application.

From here it is time for you to explore Skyve some more and try your own applications and changes. Remember you can ask questions on the Skyve slack channel, or purchase direct assistance from Skyve specialist developers through Skyve Foundry. Check the skyve.org homepage for self-help training videos and don't forget the [Developer Guide](https://skyvers.github.io/skyve-dev-guide/).

We hope that you have enjoyed this tutorial!
