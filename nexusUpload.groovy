def call(repoName,artifactId,groupId){
 def pom = readMavenPom file: 'pom.xml'
               def version = pom.version
                nexusArtifactUploader artifacts: [[artifactId: artifactId, classifier: '', file: "target/${arttifactId}.war", type: 'war']], 
                credentialsId: 'nexus', 
                groupId: groupId, 
                nexusUrl: '172.31.12.118:8081', 
                nexusVersion: 'nexus3', 
                protocol: 'http', 
                repository: repoName, 
                version: version   
}