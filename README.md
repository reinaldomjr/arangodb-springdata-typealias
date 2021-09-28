# iam
 Identity Access Management for HiveFlow Platform

## Preparing Development Environment

1. Configure GitHub Account
    1. [Create SSH Keys for GitHub](https://docs.github.com/en/github/authenticating-to-github/connecting-to-github-with-ssh)
    1. [Create Personal Access Token](https://docs.github.com/pt/github/authenticating-to-github/creating-a-personal-access-token)
2. Configure Gradle with github credentials
    1. Create a file named `gradle.properties` under `.gradle` directory, on your home folder
    1. Add the following properties on `gradle.properties` file, replacing values with your personal information:
        ```properties 
        github.user=[GITHUB_USERNAME]
        github.token=[GITHUB_ACCESS_TOKEN]
       ```
3. Clone github repository using this URL: `git@github.com:hiveflow/iam.git`
4. To build the project use the command `gradle build`
5. To run the project use `gradle bootRun`