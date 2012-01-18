package grails.functional.tests

/**
 * Unlike BaseSpec targets an existing application in the apps/ directory
 */
abstract class BaseApplicationSpec extends BaseSpec {
    
    abstract String getApplication()
    
    void setup() {
        project = application
        grails {
            runApp()
        }
    }
}