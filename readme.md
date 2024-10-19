
# Nasa Editor Library

**Nasa Editor Library** is a lightweight library that allows developers to easily create their own code editor. This library supports running **HTML**, **CSS**, and **JavaScript** code and is compatible with API levels 21 - 34. Whether you're building a custom code editor or integrating code execution into an app, this library makes it simple.

## 📚 Documentation

Follow the steps below to integrate **Nasa Editor Library** into your Android project.

---

### Step 0: Add JitPack to Your Project's Gradle

#### `settings.gradle` (Groovy)
```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // other repositories
        maven { url 'https://jitpack.io' }  // add JitPack repository
    }
}
```

---

### Step 1: Add the Nasa Editor Library Dependency

#### `build.gradle` (App-level) (Groovy)
```groovy
dependencies {
    // Dependency for Nasa Editor Library
    implementation 'com.github.CodeWithTamim:Nasa-Editor-Library:1.0.1'
}
```

---

### Step 2: Add a WebView to Your Layout

You will need a WebView component in your layout for the editor.

#### XML Example:
```xml
<WebView
    android:id="@+id/webView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/white"
    android:scrollbars="none" />
```

---

### Step 3: Initialize the NasaEditor in Your Activity or Fragment

#### Java Example:
```java
// With view binding
NasaEditor editor = new NasaEditor(binding.webView);
```
```java
// With findViewById
NasaEditor editor = new NasaEditor(findViewById(R.id.webView));
```

#### Kotlin Example:
```kotlin
// With view binding
val editor = NasaEditor(binding.webView)
```
```kotlin
// With findViewById
val editor = NasaEditor(findViewById(R.id.webView))
```

---

### Step 4: Set HTML, CSS, and JavaScript Code to the Editor

#### Java Example:
```java
editor.setHtmlCode("Your html code");
editor.setCssCode("Your css code");
editor.setJsCode("Your js code");
```

#### Kotlin Example:
```kotlin
editor.htmlCode = "Your html code"
editor.cssCode = "Your css code"
editor.jsCode = "Your js code"
```

---

### Step 5: Run the Code

#### Java Example:
```java
editor.runCode(); 
```

#### Kotlin Example:
```kotlin
editor.runCode()
```

---

### Additional Methods

You can also access some default code and the WebView itself using the methods below:

#### Get Default HTML, CSS, and JavaScript Code:
##### Java Example:
```java
getDefaultHtmlCode();  // Returns default HTML code as a String
getDefaultCssCode();  // Returns default CSS code as a String
getDefaultJsCode();  // Returns default JavaScript code as a String
```

##### Kotlin Example:
```kotlin
getDefaultHtmlCode()  // Returns default HTML code as a String
getDefaultCssCode()  // Returns default CSS code as a String
getDefaultJsCode()  // Returns default JavaScript code as a String
```

#### Get the WebView:
##### Java Example:
```java
getWebView();  // Returns the WebView
```

##### Kotlin Example:
```kotlin
getWebView()  // Returns the WebView
```

---

## Contributions and Support

If **Nasa Editor Library** helped you, consider giving it a ⭐️ and sharing it with fellow developers. Contributions are welcome! Feel free to fork the project, make your changes, and submit a pull request.

## License

This project is licensed under the Apache License 2.0. See the [LICENSE](LICENSE) file for more details.

---

Thank you for using **Nasa Editor Library**! I’m **Tamim**, the creator of this library. If you have any questions or need further assistance, feel free to [open an issue](https://github.com/CodeWithTamim/Nasa-Editor-Library/issues) or [email me](mailto:tamimh.dev@gmail.com).
