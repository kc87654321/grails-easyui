grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {

    inherits("global")
	
    log "warn"
	
    repositories {
        grailsPlugins()
        grailsHome()
        mavenLocal()
        grailsCentral()
        mavenCentral()	
    }    

    plugins {
		compile(":resources:1.2.1", ":scaffolding:2.0.3")
			
        build(":release:3.0.1", ":rest-client-builder:1.0.3") {
            export = false
        }
    }
}
