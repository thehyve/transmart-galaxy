class TransmartGalaxyGrailsPlugin {

    def version = "0.1"
    def grailsVersion = "2.3 > *"
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Transmart Galaxy Plugin"
    def author = "Transmart Foundation"
    def authorEmail = "admin@transmartproject.org"
    def description = '''\
        Runs galaxy jobs from tranSMART
    '''

    def documentation = "http://grails.org/plugin/transmart-galaxy"

    def developers = [
            [ name: "Ruslan Forostianov", email: "ruslan@thehyve.nl" ]
    ]

}
