pipeline {
    agent any
    tools {
        maven "MAVEN3"
        jdk "JDK17"
    }
    environment {
    JAVA_HOME = tool name: 'JDK17'
}

    stages {
        stage('Fetch Code'){
            steps{
                git branch: 'main', url: 'https://github.com/bardsoftware/biz.ganttproject.app.localization.git'
            }
        }
    }

    stage('Build'){
        steps{
            sh 'mvn install -DskipTests'
        }
        post{
            success {
                echo 'Archiving artifacts now !!'
                archiveArtifacts artifact: '**/*.war'
            }
        }
    }

    stage('UNIT TEST'){
        steps{
            sh 'mvn test'
         }
    }
}
