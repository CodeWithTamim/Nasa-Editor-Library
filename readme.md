# Thanks For Using Nasa Editor Library
## Some developers want to develop their own code editor  so I built this library to make the work easy ! It `supports API 21 - API 34`.You can run your `Html`,`Css`&`JavaScript` code easily with this library and create your own code editor or use it in your project !
## Follow the documentation below to know how to use the library

### Step 0: Add this to your project gradle
#### `settings.gradle`
```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        ...
        ...
        //add jikpack
        maven { url 'https://jitpack.io' }
    }
}
```
#### `build.gradle` app level module
```groovy
dependencies 
{
  //dependency for Nasa Editor Library
 implementation 'com.github.CodeWithTamim:NasaEditor:1.0.0'
}
```

### Step 1: Add a webview to your layout.
#### Example : 
```xml
<WebView
  android:id="@+id/webView"
  android:layout_width="match_parent"
  android:layout_height="match_parent"
  android:background="@color/white"
  android:scrollbars="none" />
```

### Step 2: Initialize the NasaEditor in you activity or fragment.
#### Example :

#### Java
```java
//with view binding
NasaEditor editor = new NasaEditor(binding.webView);
```
```java
//with findViewById
NasaEditor editor = new NasaEditor(findViewById(R.id.webView));
```

#### Kotlin
```kotlin
//with view binding
val editor =  NasaEditor(binding.webView)
```
```kotlin
//with findViewById
val editor =  NasaEditor(findViewById(R.id.webView))
```

### Step 3: Set the `Html`,`Css` & `JavaScript` code to the editor.

#### Example :
#### Java
```java
editor.setHtmlCode("Your html code");
editor.setCssCode("Your css code");
editor.setJsCode("Your js code");
```
#### Kotlin
```kotlin
editor.htmlCode = "Your html code"
editor.cssCode = "Your css code"
editor.jsCode = "Your js code"
```

### Step 4: Run the code
#### Example : 
#### Java
```java
editor.runCode(); 
```

#### Kotlin
```kotlin
editor.runCode()
```

### Some Additional methods
* Get Default Code For `Html`,`Css` & `JavaScript`
#### Example : 
#### Java
```java
getDefaultHtmlCode();  //returns default html code as String
getDefaultCssCode();  //returns default css code as String
getDefaultJsCode();  //returns default js code as String
```

#### Kotlin
```kotlin
getDefaultHtmlCode()  //returns default html code as String
getDefaultCssCode()  //returns default css code as String
getDefaultJsCode()  //returns default js code as String
```

* Get the WebView
#### Example : 
#### Java
```java
getWebView();  //returns the webview
```

#### Kotlin
```kotlin
getWebView()  //returns the webview
``` 
  ### Thanks for reading the documentation, I'm `Tamim`, I made this library and I'm the one who was helping you throughout the documentation :)
  ### If the library helped you out then please give it a start and share with your dev friends ! The project is open for contrubution so if you have any fixes or new feature enhancement then just fork it then make your changes create a new brach and then just hit a pull request.

  ## Thank you guys for your love and support
  ## If you have any queries or need help then just open a issue or  <a href="mailto:tamimh.dev@gmail.com">mail me</a> 
## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.
