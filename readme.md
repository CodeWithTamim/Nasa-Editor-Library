
# 🚀 Nasa Editor Library
[![](https://jitpack.io/v/CodeWithTamim/Nasa-Editor-Library.svg)](https://jitpack.io/#CodeWithTamim/Nasa-Editor-Library)


**Nasa Editor Library** is a lightweight library that enables developers to effortlessly create custom code editors. The library supports execution of **HTML**, **CSS**, and **JavaScript** code and is compatible with API levels 21 - 34. Whether you're building a custom code editor or integrating code execution into an app, this library simplifies the process.

## 📖 Documentation

### Step 0: Add JitPack Repository to Your Project

In your `settings.gradle` file, ensure JitPack is included:

#### Groovy:
```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // other repositories
        maven { url 'https://jitpack.io' }
    }
}
```

#### Gradle Kotlin DSL (`settings.gradle.kts`):
```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // other repositories
        maven { url = uri("https://jitpack.io") }
    }
}
```

### Step 1: Add Nasa Editor Library Dependency

In your app-level `build.gradle` file, add the dependency:

#### Groovy:
```groovy
dependencies {
    // Nasa Editor Library
    implementation 'com.github.CodeWithTamim:Nasa-Editor-Library:1.0.1'
}
```

#### Gradle Kotlin DSL (`build.gradle.kts`):
```kotlin
dependencies {
    // Nasa Editor Library
    implementation("com.github.CodeWithTamim:Nasa-Editor-Library:1.0.1")
}
```

### Step 2: Add WebView to Your Layout

Define a `WebView` in your XML layout:

```xml
<WebView
    android:id="@+id/webView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/white"
    android:scrollbars="none" />
```

### Step 3: Initialize NasaEditor

In your Activity or Fragment, initialize the editor:

#### Java Example:
```java
// Using view binding
NasaEditor editor = new NasaEditor(binding.webView);
```

```java
// Using findViewById
NasaEditor editor = new NasaEditor(findViewById(R.id.webView));
```

#### Kotlin Example:
```kotlin
// Using view binding
val editor = NasaEditor(binding.webView)
```

```kotlin
// Using findViewById
val editor = NasaEditor(findViewById(R.id.webView))
```

### Step 4: Add HTML, CSS, and JavaScript Code

Inject HTML, CSS, and JavaScript code into the editor:

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

### Step 5: Execute the Code

Run the code in the editor:

#### Java Example:
```java
editor.runCode();
```

#### Kotlin Example:
```kotlin
editor.runCode();
```

## 🎨 Additional Features

You can also retrieve default HTML, CSS, and JavaScript code or access the `WebView`:

#### Get Default Code:
##### Java Example:
```java
editor.getDefaultHtmlCode();
editor.getDefaultCssCode();
editor.getDefaultJsCode();
```

##### Kotlin Example:
```kotlin
editor.getDefaultHtmlCode();
editor.getDefaultCssCode();
editor.getDefaultJsCode();
```

#### Access the WebView:
##### Java Example:
```java
editor.getWebView();
```

##### Kotlin Example:
```kotlin
editor.getWebView();
```

## 🤝 Contributions and Support

If **Nasa Editor Library** helps you in your project, consider giving it a ⭐️ on GitHub. Contributions are encouraged! Fork the repository, make improvements, and submit a pull request.

For any questions or issues, feel free to [open an issue](https://github.com/CodeWithTamim/Nasa-Editor-Library/issues) or [email me](mailto:tamimh.dev@gmail.com).

## 📜 License

This project is licensed under the Apache License 2.0. See the [LICENSE](LICENSE) file for details.

---

Thanks for using **Nasa Editor Library**!
