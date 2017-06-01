* GetRefreshToken
```
mvn -X exec:java -Dexec.mainClass="ddp.axis.auth.GetRefreshToken" -Dhttps.proxyHost=localhost -Dhttps.proxyPort=8118
```

* cd project root
```
mvn install -Dmaven.test.skip=true
```

* cd examples/ddp_axis
```
mvn -X compile
mvn -X exec:java -Dexec.mainClass="ddp.axis.v201705.dmpuserservice.Mutate" -Dexec.args=" -n no_visit_7 -d no_visit_7" -Dhttps.proxyHost=localhost -Dhttps.proxyPort=8118
```

Google Ads API Java Client Library
==================================

This project hosts the Java client library for the various SOAP-Based Ads APIs (AdWords and DFP) at Google.

## Features

  * Distributed via Maven
  * Uses the SLF4J logging facade to log requests and SOAP messages, allowing you to plug in a concrete logging framework of your choice.
  * Automatic handling of SOAP headers
  * Easy management of credentials, authentication, and session information
  * [JavaDoc](http://googleads.github.io/googleads-java-lib)

## Requirements

  * Java 1.6+
  * Maven 3.0+ not required, but recommended

## Announcements and updates

For API and client library updates and news, please follow our [Google+ Ads Developers page](https://plus.google.com/+GoogleAdsDevelopers/posts) and our [Google Ads Developers blog](http://googleadsdeveloper.blogspot.com/)

### Support forum

If you have questions about the client library or the APIs, you can ask them on our forums:
  * [AdWords API Forum](https://groups.google.com/group/adwords-api)
  * [DoubleClick for Publishers API Forum](https://groups.google.com/forum/#!forum/google-doubleclick-for-publishers-api)
  * [DoubleClick Ad Exchange Buyer API Forum](https://groups.google.com/forum/#!forum/google-doubleclick-ad-exchange-buyer-api)

## Maven artifacts

### AdWords
```
    <dependency>
      <groupId>com.google.api-ads</groupId>
      <artifactId>ads-lib</artifactId>
      <version>RELEASE</version>
    </dependency>
    <dependency>
      <groupId>com.google.api-ads</groupId>
      <artifactId>adwords-axis</artifactId>
      <version>RELEASE</version>
    </dependency>
```

### DFP
```
    <dependency>
      <groupId>com.google.api-ads</groupId>
      <artifactId>ads-lib</artifactId>
      <version>RELEASE</version>
    </dependency>
    <dependency>
      <groupId>com.google.api-ads</groupId>
      <artifactId>dfp-axis</artifactId>
      <version>RELEASE</version>
    </dependency>
```

Note: The following explanation is for AdWords and Axis, but the general idea
applies to all products and frameworks.

The "ads-lib" artifact contains all of the library and utility classes for
accessing the Ads API, but does not support any specific SOAP framework. All
client library classes and utilities are in the package or sub-packages of
"com.google.api.ads.common.lib". To add support for the AdWords API using the
Apache Axis framework, the "adwords-axis" plugin artifact is also necessary.
This artifact also includes autogenerated classes from the AdWords API. They
are in the package "com.google.api.ads.adwords.{version}".

## Getting started

You have the option to use jars or Maven. While we suggest using Maven, we understand that not all build environments can handle this.

### Before you do anything

You will need to register an OAuth2 application to get a valid client ID and secret. See the [Using OAuth 2 wiki page](https://github.com/googleads/googleads-java-lib/wiki/Using-OAuth-2.0) for more information.

### For using jars

In the [releases section](https://github.com/googleads/googleads-java-lib/releases) download a file like ``adwords-axis-jars-and-examples-v.vv.vv.tar.gz`` and extract it.

1) Modify

You will need to modify the ``ads.properties`` file with your settings. This can be moved (not copied) to your home directory as well.
```
$ vim ads.properties
```
2) Import

Import the eclipse project by going to File > Import, then General > Existing projects into workspace and selecting the extracted folder.

3) Authenticate

Now, generate OAuth2 credentials to be used with other examples. Navigate in your project to ``src/adwords/axis/auth/GetRefreshToken.java`` and run the example.

Copy the refresh token into your ads.properties file as you just did with your general settings and client ID/secret when prompted.

4) Run example

Navigate in your project to any example (e.g., ``src/adwords/axis/<version>/basicoperations/GetCampaigns.java``) and run the example.

### For using maven with Eclipse

In the [releases section](https://github.com/googleads/googleads-java-lib/releases) download a file like ``adwords-axis-maven-and-examples-v.vv.vv.tar.gz`` and extract it.

1) Modify

You will need to modify the ``src/main/resources/ads.properties`` file with your settings. This can be moved (not copied) to your home directory as well.
```
$ vim src/main/resources/ads.properties
```
2) Import

Import the eclipse project by going to File > Import, then General > Existing projects into workspace and selecting the extracted folder.

3) Authenticate

Now, generate OAuth2 credentials to be used with other examples. Navigate in your project to ``src/main/java/adwords/axis/auth/GetRefreshToken.java`` and run the example.

Copy the refresh token into your ``src/main/resources/ads.properties`` file as you just did with your general settings and client ID/secret when prompted.

4) Run example

Navigate in your project to any example (e.g., ``src/adwords/axis/<version>/basicoperations/GetCampaigns.java``) and run the example.

### For using maven from the command line

In the [releases section](https://github.com/googleads/googleads-java-lib/releases) download a file like ``adwords-axis-maven-and-examples-v.vv.vv.tar.gz`` and extract it.

1) Modify

You will need to modify the ``src/main/resources/ads.properties`` file with your settings. This can be moved (not copied) to your home directory as well.
```
$ vim src/main/resources/ads.properties
```

2) Authenticate

Now, generate OAuth2 credentials to be used with other examples.
```
$ cd path/to/extracted/distribution
$ mvn -X compile
$ mvn -X exec:java -Dexec.mainClass="adwords.axis.auth.GetRefreshToken"
```
Copy the refresh token into your ``src/main/resources/ads.properties`` file as you just did with your general settings and client ID/secret when prompted.

You must have Maven recompile every time you modify the source code or resources in order for your changes to take effect.
```
$ mvn -X compile
```

3) Run example

This command runs the ``GetCampaigns`` example, but you can update the ``-Dexec.mainClass`` argument with the example of your choice.
```
$ mvn -X exec:java -Dexec.mainClass="adwords.axis.v201603.basicoperations.GetCampaigns"
```

## Basic usage

The following example is for AdWords and Axis, but the general code applies
to all products and frameworks.

```java
// Contains the data classes and service classes.
import com.google.api.ads.adwords.axis.v201603.*;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.axis.factory.AdWordsServices;

public static void main(String[] args) throws Exception {
  /**
   * Create an AdWordsSession instance, loading credentials from the
   * properties file:
   */

  // Get an OAuth2 credential.
  Credential credential = new OfflineCredentials.Builder()
      .forApi(OfflineCredentials.Api.AdWords)
      .fromFile()
      .build()
      .generateCredential();

  // Construct an AdWordsSession.
  AdWordsSession session = new AdWordsSession.Builder()
      .fromFile()
      .withOAuth2Credential(credential)
      .build();

  /**
   * Alternatively, you can specify your credentials in the constructor:
   */

  // Get an OAuth2 credential.
  credential = new OfflineCredentials.Builder()
      .forApi(OfflineCredentials.Api.AdWords)
      .withClientSecrets(clientId, clientSecret)
      .withRefreshToken(refreshToken)
      .build()
      .generateCredential();

  // Construct an AdWordsSession.
  session = new AdWordsSession.Builder()
      .withDeveloperToken(developerToken)
      // ...
      .withOAuth2Credential(credential)
      .build();

  /**
   * Instantiate the desired service class using the AdWordsServices utility and a
   * Class object representing your service.
   */

  // Get the CampaignService.
  CampaignServiceInterface campaignService =
      new AdWordsServices().get(session, CampaignServiceInterface.class);

  /**
   * Create data objects and invoke methods on the service class instance. The
   * data objects and methods map directly to the data objects and requests for
   * the corresponding web service.
   */

  // Create selector.
  Selector selector = new Selector();
  selector.setFields(new String[] {"Id", "Name"});

  // Get all campaigns.
  CampaignPage page = campaignService.get(selector);
}
```

## How do I enable logging?

The client library uses SLF4J for all logging. Check out our
[logging guide on github](https://github.com/googleads/googleads-java-lib/wiki/Logging)
for more details.

## How do I enable compression?

First, add an entry to your `ads.properties` file for each API you plan to use.

    # AdWords
    api.adwords.useCompression=true
    # DFP
    api.dfp.useCompression=true

If using JaxWs, then no further steps are required.

If using Axis, then no further steps are required unless you are setting the
`axis.ClientConfigFile` system property. If you are setting
`axis.ClientConfigFile` to your own custom WSDD file and you want to use
compression, please ensure that the `http` transport defined in your WSDD
supports compression.

## Using a proxy

It is recommended that the user set JVM arguments to configure this application
for their proxy.

    https.proxyHost      Hostname of proxy server                      web-proxy
    https.proxyPort      Port on server of proxy                       8080
    https.proxyUser      Optional username for proxy authentication    someone
    https.proxyPassword  Optional proxy server password                secret

These properties can be set with java args in your eclipse run configuration:

    -Dhttps.proxyHost=web-proxy -Dhttps.proxyPort=8080 -Dhttps.proxyUser=someone
    -Dhttps.proxyPassword=secret ...

If necessary, set this up in code by doing the following:

    System.setProperty("https.proxyHost", "web-proxy");
    System.setProperty("https.proxyPort", "8080");
    System.setProperty("https.proxyUser", "someone");
    System.setProperty("https.proxyPassword", "secret");


## Where do I submit bug reports, feature requests and patches?

All of these items can be submitted at (https://github.com/googleads/googleads-java-lib/issues)
