# Aged care Application Tutorial

### Contents

- [1. Tutorial Overview ](#1-tutorial-overview)
  - [1.1. Is this Tutorial right for me ?](#11-is-this-tutorial-right-for-me-)
  - [1.2. Aged Care Management](#12-aged-care-management)
  - [1.3. No-code Development](#13-no-code-development)
  - [1.4. Low-code Extension](#14-low-code-extension)
  - [1.5. Java Extensions](#15-java-extensions)
  * [1.6. Primer: Skyve & Foundry](#16-primer-skyve--foundry)
* [2. No-code Development](tutorial/chapter2.md/#-no-code-development)
- [ 3. Low Code Extensions](tutorial/chapter3.md/#3-low-code-extension)
* [4. Java Extensions](tutorial/chapter4.md/#4-java-extension)

# 1. Tutorial Overview

### 1.1. Is this Tutorial right for me ?

Before we start the tutorial, it is important to know about the answers to a few questions as below:

##### Will I benefit from it ?

If a custom app is what you need, the potential benefits of the Skyve system are significant.
You can develop your own powerful app, quickly and cheaply, with a dramatically reduced learning curve.
This tutorial will help you work out what can be achieved. You’ll also find out whether you’re personally up to the challenge (tip: you probably are).

##### Do I have enough skills ?

This tutorial has been designed to cater to people with a wide variety of skill levels.

We’ve split it into 3 sections:

- The first section is for everyone and requires no coding skills – we lead you through building a sample app using only “point and click” !

- Those with basic coding skills (or who are willing to learn some) can progress to the second section and extend their app

- Those with more advanced Java coding skills can progress from there on to the third section and extend their app even further
  So even if “point and click” is all you can manage and you’re allergic to any sort of ‘coding’, this tutorial is still for you ! It’ll help you get a ‘no-code’ Skyve app with a simple but functional interface, up and running in no time.

In this tutorial, we will show you how easy it is to build a powerful application using the Skyve Enterprise Application platform.

To familiarise you with Skyve application development, we will build a simple application together to manage aged care facilities, their residents, and care assessments.

**[⬆ back to top](#contents)**

### 1.2. Aged Care Management

A typical aged care provider might manage multiple facilities, each housing many residents. Residents are regularly assessed to ensure that they are well and safe, and that their care matches their needs.

Care providers must record the personal details of each resident and where they are located. They must also retain records care assessments for each resident both to facilitate regualar activities and to satisfy audit requirements.

Our app will meet these record storage and retrieval needs for an (imaginary!) aged care provider.

**[⬆ back to top](#contents)**

### 1.3. No-code Development

In the first main section of our tutorial, we will lead you through the no-code development of our Aged Care app.

No-code application development means developing an app using only a point-and-click interface - in this case Skyve [Foundry](https://foundry.skyve.org/foundry/).

In [Foundry](https://foundry.skyve.org/foundry/), you will use a point-and-click interface to define:

- ‘documents’ representing facilities, residents, and assessments
- data ‘attributes’ that need to be recorded for each different document type
- relationships between different types of documents (e.g. each resident belongs to one facility; each resident has many assessments)

Behind the scenes and hidden from sight, [Foundry](https://foundry.skyve.org/foundry/) takes care of all the ‘coding’ for you. It builds the app to your specifications and will even deploy it to a web-server and run it for you, so that you can immediately use it.

At the end of this section of the tutorial, you’ll have a functioning, usable Aged Care app up and running. At that point, you may decide that [Foundry](https://foundry.skyve.org/foundry/) provides everything you need to build your app, in which case you could stop here and leave the tutorial.

Or, if you have some basic coding skills or you’re willing to acquire them, we’d encourage you to move on to the ‘Low-code Extensions’ section which will show you how to enhance your app in ways that are beyond the scope of [Foundry](https://foundry.skyve.org/foundry/).

**[⬆ back to top](#contents)**

### 1.4. Low-code Extension

In the second main section of the tutorial, we will lead you through the addition of some low-code enhancements to the same Aged Care app that we just developed using [Foundry](https://foundry.skyve.org/foundry/) in the previous section.

When you create a no-code app using the [Foundry](https://foundry.skyve.org/foundry/) point-and-click interface, [Foundry](https://foundry.skyve.org/foundry/) automatically converts your app definition into a suite of Skyve low-code XML (eXtensible Markup Language) files. In [Foundry](https://foundry.skyve.org/foundry/), these are hidden away and no-code users never need to interact with them directly.

In this section of the tutorial, you will export your Aged Care app out of [Foundry](https://foundry.skyve.org/foundry/) and access it using an IDE (Integrated Development Environment – a developer’s coding toolkit) located on your own computer. This will allow you to manipulate the Skyve XML code directly, opening up an even broader range of functionality options to you.

Why do we call this ‘low-code’ ?

Web-based applications are typically written in Java or a similarly complex and powerful programming language. Indeed, Skyve itself uses Java - Skyve apps are automatically converted from Skyve XML into Java during the build process so that they can be deployed to a web server and run.

By contrast, the Skyve XML language is a dramatically simpler language – it allows you to select from a wide array of common application functions and configure them quite specifically to your needs. For Skyve users who need or want to go beyond the capabilities of [Foundry](https://foundry.skyve.org/foundry/), Skyve XML typically allows them to avoid the steep learning curve required to learn Java and the long development times required to write native Java apps.

So, using Skyve XML is still coding. But in contrast to coding in Java or a similar web-based language, it’s a great deal simpler, easier, faster and far more succinct. Hence, ‘low-code’. Furthermore, even when you do need to add code to extend a Skyve app, Skyve provides high level APIs to common Java frameworks, meaning that your code will be simpler and more succinct than usual.

In this section of the tutorial,we will focus on building in some user interface enhancements to our Aged Care app that are not possible (yet!) using the [Foundry](https://foundry.skyve.org/foundry/) point-and-click interface. We will edit and change the layouts of the Resident, Assessment, and Facility documents.

At the end of this section of the tutorial, you’ll have a significantly enhanced AgedCare app up and running, as well as a very broad palette of rapid application development capabilities at your fingertips with Skyve XML.

**[⬆ back to top](#contents)**

### 1.5. Java Extensions

While Skyve XML is already very powerful (and constantly growing) and covers a huge range of common functionality needs, there remain some bespoke requirements that cannot be met through Skyve XML alone. For those situations, Java extensions are the answer.

The Skyve platform provides an extensive system of programming hooks that enable you to develop discrete Java methods and graft them into your Skyve XML app, where they can leverage the full functionality of the Skyve system to provide you with the bespoke functionality you need.

If you don't have Java coding skills yourself, your simplest and cheapest option might be to buy support hours from one of our expert developers - you can do this within your Account in Skyve [Foundry](https://foundry.skyve.org/foundry/).

If you already have some Java skills, however, you can do this yourself ! In the third main section of the tutorial, we will lead you through the development of some Java enhancements to your AgedCare app.

Specifically, we will add some Java-code conditions and actions into our app to restrict, in a very granular and specific way, which users can access particular assessments relating to particular residents.

At the end of this section of the tutorial, you’ll have a further-enhanced AgedCare app up and running. More significantly, though, you’ll be able to combine your powerful new Skyve app development capabilities with your existing Java skills to create no-limits applications far faster than you could ever do with Java alone.

**[⬆ back to top](#contents)**

### 1.6. Primer: Skyve & Foundry

In the next section, we’ll start using the Skyve Foundry.
If you’ve already explored the Skyve website, you’ve probably already gained some insight into Skyve in general, including the Foundry.

If not, we invite you to orient yourself now by briefly exploring these webpages before you proceed with the rest of the tutorial:

- [What is Skyve?](https://skyve.org/what-is-skyve) - Skyve is a framework used to build attractive, secure, and scalable application with rich features and mobility. For more detail what [Skyve](https://skyve.org) is, and how it will be useful in your Enterprise Application Development visit our [Skyve](https://skyve.org/) page.

- [Getting Started](https://skyve.org/getting-started) - Will help give you some ideas on how to start with our [Skyve](https://skyve.org) Framework.

- [Skyve Foundry](https://Foundry.skyve.org/)-Will help you to start developing your application and also give [Demo](https://youtu.be/7oynha0tFmw) about how to use skyve [Foundry](https://foundry.skyve.org/foundry/).

Now, lets move to the next step how to create application with [Skyve Foundry](https://Foundry.skyve.org/)

**[⬆ back to top](#contents)**
