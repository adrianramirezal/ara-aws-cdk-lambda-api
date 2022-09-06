# Welcome to your CDK Java project!

You should explore the contents of this project. It demonstrates a CDK app with an instance of a stack (`CdkWorkshopStack`)
which contains an Amazon SQS queue that is subscribed to an Amazon SNS topic.

The `cdk.json` file tells the CDK Toolkit how to execute your app.

It is a [Maven](https://maven.apache.org/) based project, so you can open this project with any Maven compatible Java IDE to build and run tests.

## Useful commands

 * `mvn package`     compile and run tests
 * `cdk ls`          list all stacks in the app
 * `cdk synth`       emits the synthesized CloudFormation template
 * `cdk deploy`      deploy this stack to your default AWS account/region
 * `cdk diff`        compare deployed stack with current state
 * `cdk docs`        open CDK documentation

## Bootstrapping an environment
The first time you deploy an AWS CDK app into an environment (account/region), you’ll need to install a “bootstrap stack”. This stack includes resources that are needed for the toolkit’s operation. For example, the stack includes an S3 bucket that is used to store templates and assets during the deployment process.

* `cdk bootstrap --profile my-profile`

## Let’s deploy
* `mvn package`
* `cdk deploy --profile my-profile`

## To test the application, get outputs from cdk deploy

```
Outputs:
CdkWorkshopStack.EndpointAAAAAAAA = https://xxxxxxxxxx.execute-api.us-east-1.amazonaws.com/prod/
CdkWorkshopStack.ViewerHitCountViewerEndpointBBBBBBB = https://yyyyyyyyyyy.execute-api.us-east-1.amazonaws.com/prod/

```

## Populate DynamoDB table
```
    $ curl https://xxxxxxxxxx.execute-api.us-east-1.amazonaws.com/prod/hit1
    $ curl https://xxxxxxxxxx.execute-api.us-east-1.amazonaws.com/prod/hit1
    $ curl https://xxxxxxxxxx.execute-api.us-east-1.amazonaws.com/prod/hit1
    $ curl https://xxxxxxxxxx.execute-api.us-east-1.amazonaws.com/prod/hit1
    $ curl https://xxxxxxxxxx.execute-api.us-east-1.amazonaws.com/prod/hoooot
    $ curl https://xxxxxxxxxx.execute-api.us-east-1.amazonaws.com/prod/hoooot
    $ curl https://xxxxxxxxxx.execute-api.us-east-1.amazonaws.com/prod/hit1
    $ curl https://xxxxxxxxxx.execute-api.us-east-1.amazonaws.com/prod/hit1
    $ curl https://xxxxxxxxxx.execute-api.us-east-1.amazonaws.com/prod/hit1
    $ curl https://xxxxxxxxxx.execute-api.us-east-1.amazonaws.com/prod/hit1
    $ curl https://xxxxxxxxxx.execute-api.us-east-1.amazonaws.com/prod/hoooot
    $ curl https://xxxxxxxxxx.execute-api.us-east-1.amazonaws.com/prod/hoooot
    $ curl https://xxxxxxxxxx.execute-api.us-east-1.amazonaws.com/prod/hit1
```

## Viewing the hit counter table

* `https://xxxxxxxxxx.execute-api.us-east-1.amazonaws.com/prod/`