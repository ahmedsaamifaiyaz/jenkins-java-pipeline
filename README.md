# Automated Jenkins Build Pipeline for Java

## Project Overview
This project sets up a Continuous Integration (CI) server to automate the software delivery lifecycle of a Java application. By using a pipeline-as-code approach (`Jenkinsfile`), the system automates code validation, dependency mapping, compilation, unit testing, and packaging. 

Integrating Git webhooks removes manual build triggers—ensuring that every code commit made by developers instantly fires an isolated build workflow to ensure codebase stability.

## Tech Stack
* **CI/CD Automation Engine:** Jenkins
* **Build Automation Tool:** Apache Maven
* **Language Runtime:** Java 17 (JDK)
* **Version Control Integration:** Git & Webhooks

## Step-by-Step Execution Guide

### Step 1: Install and Launch Jenkins
Run Jenkins locally inside a Docker container or directly on a Linux VM:
```bash
docker run -d -p 8080:8080 -p 50000:50000 --name jenkins-ci jenkins/jenkins:lts
```
Navigate to http://localhost:8080 in your browser and complete the initial setup wizard.

## Step 2: Configure Global Tools in Jenkins
* Go to Manage Jenkins > Tools.
* Scroll to JDK installations and add Java 17.
* Scroll to Maven installations, name it Maven_3.9, and check the "Install automatically" box. Save the configurations.

## Step 3: Create the Pipeline Job
* Click New Item, name it java-build-pipeline, select Pipeline, and click OK.
* Under the Build Triggers section, check the box for GitHub hook trigger for GITScm polling.
* Scroll to the Pipeline section, change the Definition to Pipeline script from SCM, choose Git, and provide your repository URL. Save the job.
