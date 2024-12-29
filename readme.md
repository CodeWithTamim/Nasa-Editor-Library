# Nasa Editor Library
[![](https://jitpack.io/v/CodeWithTamim/Nasa-Editor-Library.svg)](https://jitpack.io/#CodeWithTamim/Nasa-Editor-Library)
![License](https://img.shields.io/github/license/CodeWithTamim/Nasa-Editor-Library)


Nasa Editor Library is a powerful library for running or previewing HTML, CSS, and JavaScript code on Android devices.

## Installation

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
Add Nasa Editor Library Dependency

In your app-level `build.gradle` file, add the dependency:

#### Groovy:
```groovy
dependencies {
    // Nasa Editor Library
    implementation 'com.github.CodeWithTamim:Nasa-Editor-Library:1.0.2'
}
```

#### Gradle Kotlin DSL (`build.gradle.kts`):
```kotlin
dependencies {
    // Nasa Editor Library
    implementation("com.github.CodeWithTamim:Nasa-Editor-Library:1.0.2")
}
```


## Permissions

Make sure to add the following permission to your `AndroidManifest.xml`:

```xml
<uses-permission android:name="android.permission.INTERNET" />
```

## Usage

### XML Layout

Add the `NasaEditorView` to your XML layout:

```xml
<com.nasahacker.editorlibrary.widget.NasaEditorView
    android:id="@+id/editor_view"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
/>
```

### Java Implementation

```java
import com.nasahacker.editorlibrary.widget.NasaEditorView;

public class MainActivity extends AppCompatActivity {
    private NasaEditorView editorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editorView = findViewById(R.id.editor_view);
        editorView.setHtmlCode("<h1>Hello World</h1>");
        editorView.setCssCode("h1 { color: red; }");
        editorView.setJsCode("console.log('Hello World');");
        editorView.runCode();
    }
}
```

### Kotlin Implementation

```kotlin
import com.nasahacker.editorlibrary.widget.NasaEditorView

class MainActivity : AppCompatActivity() {
    private lateinit var editorView: NasaEditorView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editorView = findViewById(R.id.editor_view)
        editorView.setHtmlCode("<h1>Hello World</h1>")
        editorView.setCssCode("h1 { color: red; }")
        editorView.setJsCode("console.log('Hello World');")
        editorView.runCode()
    }
}
```

## API

### NasaEditorView

- `getDefaultHtml()`: Provides the default HTML template.
- `getDefaultCss()`: Provides the default CSS template.
- `getDefaultJs()`: Provides the default JavaScript template.
- `getCssCode()`: Retrieves the current CSS code.
- `getJsCode()`: Retrieves the current JavaScript code.
- `getHtmlCode()`: Retrieves the current HTML code.
- `runCode()`: Combines the HTML, CSS, and JavaScript code and previews it in the WebView.
- `setHtmlCode(html: String)`: Updates the current HTML code.
- `setCssCode(css: String)`: Updates the current CSS code.
- `setJsCode(js: String)`: Updates the current JavaScript code.
- `getInstance()`: Provides an instance of NasaEditorView.

## License

This project is licensed under the Apache 2.0 License - see the [LICENSE](LICENSE) file for details.

---

Made with ❤️ by Tamim Hossain