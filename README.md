# iam
 Identity Access Management for HiveFlow Platform

## Preparing Development Environment

1. Configure GitHub Account
    1. [Create SSH Keys for GitHub](https://docs.github.com/en/github/authenticating-to-github/connecting-to-github-with-ssh)
    1. [Create Personal Access Token](https://docs.github.com/pt/github/authenticating-to-github/creating-a-personal-access-token)
1. Configure Gradle with github credentials
    1. Create a file named `grails.properties` under `.grails` directory, on your home folder
    1. Add the following properties on `grails.properties` file, replacing values with your personal information:
        ```properties 
        gpr.user=[GITHUB_USERNAME]
        gpr.key=[GITHUB_ACCESS_TOKEN]
       ```
1. Clone github repository using this URL: `git@github.com:hiveflow/iam.git`
1. To build the project use the command `grails build`