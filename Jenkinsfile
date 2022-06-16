pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                maven(maven : 'Maven') {
                    sh 'mvn clean compile'
                }
            }
        }
    }
}
