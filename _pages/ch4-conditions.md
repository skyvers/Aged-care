---
title: "Conditions"
permalink: /ch4-conditions/
excerpt: "Adding Conditions to your Skyve application"
toc: true
sidebar:
  title: "Index"
  nav: docs
---

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

Continue to [Bizlets]({{ site.url }}{{ site.baseurl }}/ch4-bizlets/)