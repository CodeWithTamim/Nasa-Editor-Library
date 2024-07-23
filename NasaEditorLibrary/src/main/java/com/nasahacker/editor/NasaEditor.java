package com.nasahacker.editor;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * CodeWithTamim
 *
 * @developer Tamim Hossain
 * @mail tamimh.dev@gmail.com
 */
public class NasaEditor
{
    private String htmlCode = "";
    private String cssCode = "";
    private String jsCode = "";
    private final WebView webView;

    /**
     * Constructor for initializing Nasa Editor.
     *
     * @param webView The WebView where the result will be displayed. Must be initialized properly.
     * @throws NullPointerException if webView is null.
     */
    public NasaEditor(WebView webView)
    {
        if (webView == null)
        {
            throw new NullPointerException("Initialize web view properly");
        }
        this.webView = webView;
        initializeWebView();
    }

    /**
     * Initializes the WebView with JavaScript enabled and default clients.
     */
    private void initializeWebView()
    {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
    }

    /**
     * Returns the default HTML code template.
     *
     * @return Default HTML code as a String.
     */
    public String getDefaultHtmlCode()
    {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>NASA Editor</title>\n" +
                "    <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"card\">\n" +
                "        <h1>Welcome to NASA Editor</h1>\n" +
                "        <p>Developed by Tamim Hossain.</p>\n" +
                "    </div>\n" +
                "    <script src=\"script.js\"></script>\n" +
                "</body>\n" +
                "</html>";
    }

    /**
     * Returns the default CSS code.
     *
     * @return Default CSS code as a String.
     */
    public String getDefaultCssCode()
    {
        return "body {\n" +
                "    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n" +
                "    background-color: #e0f7fa;\n" +
                "    display: flex;\n" +
                "    justify-content: center;\n" +
                "    align-items: center;\n" +
                "    height: 100vh;\n" +
                "    margin: 0;\n" +
                "}\n" +
                ".card {\n" +
                "    background-color: #ffffff;\n" +
                "    border-radius: 15px;\n" +
                "    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n" +
                "    padding: 30px;\n" +
                "    max-width: 400px;\n" +
                "    text-align: center;\n" +
                "    border: 2px solid #0288d1;\n" +
                "    color: #0277bd;\n" +
                "}\n" +
                ".card h1 {\n" +
                "    margin-bottom: 10px;\n" +
                "}\n" +
                ".card p {\n" +
                "    margin-top: 0;\n" +
                "}";
    }

    /**
     * Returns the default JavaScript code.
     *
     * @return Default JavaScript code as a String.
     */
    public String getDefaultJsCode()
    {
        return "console.log('Welcome to NASA Editor!');";
    }

    /**
     * Retrieves the current CSS code.
     *
     * @return Current CSS code as a String.
     */
    public String getCssCode()
    {
        return cssCode;
    }

    /**
     * Retrieves the current HTML code.
     *
     * @return Current HTML code as a String.
     */
    public String getHtmlCode()
    {
        return htmlCode;
    }

    /**
     * Retrieves the current JavaScript code.
     *
     * @return Current JavaScript code as a String.
     */
    public String getJsCode()
    {
        return jsCode;
    }

    /**
     * Combines the current HTML, CSS, and JavaScript code and loads it into the WebView.
     */
    public void runCode()
    {
        String fullCode = htmlCode + "<style>" + cssCode + "</style>" + "<script>" + jsCode + "</script>";
        webView.loadDataWithBaseURL(null, fullCode, "text/html", "utf-8", null);
    }

    /**
     * Sets the CSS code to be used in the IDE.
     *
     * @param cssCode The CSS code to set.
     */
    public void setCssCode(String cssCode)
    {
        this.cssCode = cssCode;
    }

    /**
     * Sets the HTML code to be used in the IDE.
     *
     * @param htmlCode The HTML code to set.
     */
    public void setHtmlCode(String htmlCode)
    {
        this.htmlCode = htmlCode;
    }

    /**
     * Sets the JavaScript code to be used in the IDE.
     *
     * @param jsCode The JavaScript code to set.
     */
    public void setJsCode(String jsCode)
    {
        this.jsCode = jsCode;
    }

    /**
     * Retrieves the WebView instance used in your project.
     *
     * @return The WebView instance.
     */
    public WebView getWebView()
    {
        return webView;
    }
}
