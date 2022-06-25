def call(Map config = [:]) {
    LoadLinuxScript(name: 'hello-world.sh')
    sh "./hello-world.sh ${config.name} ${config.dayOfWeek}"
}
