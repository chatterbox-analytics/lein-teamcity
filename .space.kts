/**
* JetBrains Space Automation
* This Kotlin-script file lets you automate build activities
* For more info, see https://www.jetbrains.com/help/space/automation.html
*/

job("Build and run tests") {
   container("clojure:openjdk-11-lein") {
        shellScript {
            content = """
            lein jar
            """
        }
    }
}

