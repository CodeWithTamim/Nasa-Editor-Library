package com.nasahacker.editorlibrary.widget

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

/**
 * NasaEditorView is a custom WebView designed for creating and previewing HTML, CSS, and JavaScript code.
 * It provides default templates and allows users to dynamically set and preview their code.
 *
 * @param context The Context in which the view is running.
 * @param attributeSet The attributes of the XML tag that is inflating the view.
 */
@SuppressLint("SetJavaScriptEnabled")
class NasaEditorView(context: Context, attributeSet: AttributeSet) :
    WebView(context, attributeSet) {

    private var htmlCode: String = ""
    private var cssCode: String = ""
    private var jsCode: String = ""

    init {
        // Enable JavaScript support
        settings.javaScriptEnabled = true
        webViewClient = WebViewClient()
        webChromeClient = WebChromeClient()
    }

    /**
     * Provides the default HTML template.
     *
     * @return A string containing the default HTML code.
     */
    fun getDefaultHtml(): String {
        return """
            <!DOCTYPE html>
            <html lang=\"en\">
            <head>
                <meta charset=\"UTF-8\">
                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
                <title>NASA Editor Library</title>
                <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">
            </head>
            <body>
                <div class=\"container\">
                    <div class=\"card\">
                        <h1>NASA Editor Library</h1>
                        <p>Developed by <a href=\"https://github.com/codewithtamim\" target=\"_blank\">Tamim Hossain</a></p>
                    </div>
                </div>
                <script src=\"script.js\"></script>
            </body>
            </html>
        """.trimIndent()
    }

    /**
     * Provides the default CSS template.
     *
     * @return A string containing the default CSS code.
     */
    fun getDefaultCss(): String {
        return """
            body {
                margin: 0;
                padding: 0;
                font-family: 'Arial', sans-serif;
                background: linear-gradient(135deg, #0288d1, #26c6da);
                color: #ffffff;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
            }
            .container {
                text-align: center;
            }
            .card {
                background-color: #ffffff;
                color: #0288d1;
                border-radius: 10px;
                padding: 20px 40px;
                box-shadow: 0px 4px 15px rgba(0, 0, 0, 0.2);
                max-width: 400px;
                width: 100%;
            }
            .card h1 {
                margin: 0;
                font-size: 24px;
                font-weight: bold;
            }
            .card p {
                margin: 10px 0 0;
                font-size: 16px;
            }
            .card a {
                color: #0288d1;
                text-decoration: none;
                font-weight: bold;
            }
            .card a:hover {
                text-decoration: underline;
            }
        """.trimIndent()
    }

    /**
     * Provides the default JavaScript template.
     *
     * @return A string containing the default JavaScript code.
     */
    fun getDefaultJs(): String {
        return """
            console.log('Welcome to the NASA Editor Library!');
            console.log('Developed by Tamim Hossain: https://github.com/codewithtamim');
        """.trimIndent()
    }

    /**
     * Retrieves the current CSS code.
     *
     * @return A string containing the CSS code.
     */
    fun getCssCode(): String = cssCode

    /**
     * Retrieves the current JavaScript code.
     *
     * @return A string containing the JavaScript code.
     */
    fun getJsCode(): String = jsCode

    /**
     * Retrieves the current HTML code.
     *
     * @return A string containing the HTML code.
     */
    fun getHtmlCode(): String = htmlCode

    /**
     * Combines the HTML, CSS, and JavaScript code and previews it in the WebView.
     */
    fun runCode() {
        val fullCode = """
            $htmlCode
            <style>$cssCode</style>
            <script>$jsCode</script>
        """.trimIndent()
        loadDataWithBaseURL(null, fullCode, "text/html", Charsets.UTF_8.name(), null)
    }

    /**
     * Updates the current HTML code.
     *
     * @param html The new HTML code to set.
     */
    fun setHtmlCode(html: String) {
        this.htmlCode = html
    }

    /**
     * Updates the current CSS code.
     *
     * @param css The new CSS code to set.
     */
    fun setCssCode(css: String) {
        this.cssCode = css
    }

    /**
     * Updates the current JavaScript code.
     *
     * @param js The new JavaScript code to set.
     */
    fun setJsCode(js: String) {
        this.jsCode = js
    }

    /**
     * Provides an instance of NasaEditorView.
     *
     * @return The current instance of NasaEditorView.
     */
    fun getInstance(): NasaEditorView = this
}
