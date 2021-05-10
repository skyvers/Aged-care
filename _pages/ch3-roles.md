---
title: "3.10. Roles"
permalink: /ch3-roles/
excerpt: "Defining privileges within your Skyve applications"
toc: false
# sidebar:
#  title: "Index"
#  nav: docs
---

A role specifies the privilege levels and associated actions for documents that will be accessed by the role. The role name is the name displayed when assigning roles to user security groups in the admin module.

For each document, a privilege level is specified in terms of C (Create), R (Read), U (Update), and D (Delete). The underscore character (`_`) means no permission is granted.
For example, if a role has `CRU_` privileges, this means a user with this role could Create, Read and Update documents but not Delete them.

Skyve also introduces a new concept called Scope. The document scope access level can either be G (Global), C (Customer), D (Data Group) or U (User).

For example, if a role has a `CRUDU` privilege, this would mean that a user with this role could Create, Read, Update and Delete documents, but only within the User scope. This means that they can only change their own documents - documents they have created - and not documents created by any other user.

If the role specified the privilege `CRUDC` this would mean that a user with this role could Create, Read, Update and Delete documents for all records within the Customer scope. If you were to offer the Aged Care application as Software as a Service to many different customers, users with this role could only change data for their own Customer tenancy.

For more information about Document scopes, see [the Developer Guide section on Scoping](https://skyvers.github.io/skyve-dev-guide/concepts/#document-scoping).

In our Aged Care app, we will define the following roles:

1. Nurse: A Nurse has all permissions in the Resident and Assessment documents. But in the facility document, nurses can only have update and scope permission.

2. Carer: A Carer has \_RU_C permissions in the Resident document, \_R_ \_C permissions in the Facility document, and CRU_C permissions in the Assessment document.

3. Manager: A Manager has all permissions in all three documents.

Note: Before creating a new role, be careful about the roles which have been already created by [Foundry](https://foundry.skyve.org/foundry/): Viewer and Maintainer. If you want to delete any of these roles, please ensure that these roles have not already been assigned to any user. Otherwise, the app will not work. For this tutorial, we are not doing anything with the Viewer and Maintainer roles.

Open `agedCare.xml` to create new roles under the last entry in the `<roles>` tag and change the menu in the`<menu>` tag.

```xml
<?xml version="1.0" encoding="UTF-8"?>
  <module xmlns="http://www.skyve.org/xml/module"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" title="Aged Care"
  prototype="true" name="agedCare"
  xsi:schemaLocation="http://www.skyve.org/xml/module ../../schemas/module.xsd">
  <homeRef>list</homeRef>
  <homeDocument>Resident</homeDocument>
  <documents>
    <document ref="Resident" defaultQueryName="qResident" />
    <document ref="Facility" defaultQueryName="qFacility" />
    <document ref="Assessment" defaultQueryName="qAssessment" />
    <document ref="Contact" moduleRef="admin" />
    <document ref="DataGroup" moduleRef="admin" />
    <document ref="User" moduleRef="admin" />
  </documents>
  <roles>
    <role name="Viewer">
      <description><![CDATA[Enough privileges to view Aged Care documents.]]></description>
      <privileges>
        <document name="Resident" permission="_R__C" />
        <document name="Facility" permission="_R__C" />
        <document name="Assessment" permission="_R__C" />
      </privileges>
    </role>
    <role name="Maintainer">
      <description><![CDATA[Enough privileges to create and edit Aged Care documents.]]></description>
      <privileges>
        <document name="Resident" permission="CRUDC" />
        <document name="Facility" permission="CRUDC" />
        <document name="Assessment" permission="CRUDC" />
      </privileges>
    </role>
    <role name="Nurse">
      <description>Permission to see all Assessments</description>
      <privileges>
        <document name="Resident" permission="CRUDC" />
        <document name="Facility" permission="_R__C" />
        <document name="Assessment" permission="CRUDC" />
      </privileges>
    </role>
    <role name="Carer">
      <description>Permission to see only Carer Assessments</description>
      <privileges>
        <document name="Resident" permission="_RU_C"></document>
        <document name="Facility" permission="_R__C" />
        <document name="Assessment" permission="CRU_C" />
      </privileges>
    </role>
    <role name="Manager">
      <description>Permission to manage Facility, Staff, and Assessments</description>
      <privileges>
        <document name="Resident" permission="CRUDC" />
        <document name="Facility" permission="CRUDC" />
        <document name="Assessment" permission="CRUDC" />
      </privileges>
    </role>
  </roles>
  <menu>
    <list document="Resident" name="Residents">
      <role name="Nurse" />
      <role name="Manager" />
      <role name="Carer" />
    </list>
    <list document="Facility" name="Facilities">
      <role name="Manager" />
    </list>
    <list document="Assessment" name="Assessments">
      <role name="Nurse" />
      <role name="Carer" />
      <role name="Manager" />
    </list>
  </menu>
<module>
```

In the next section, we will use these permissions by applying conditions to our documents.

Continue to [Java Extensions]({{ site.url }}{{ site.baseurl }}chapter4/)