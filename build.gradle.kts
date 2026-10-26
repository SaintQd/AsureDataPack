plugins {
    id("java")
}
tasks.register<Zip>("pack-zip") {

    description = "Create ZIp archive of datapack"

    // Name of the output zip file
    archiveFileName.set("AsureDataPack.zip")

    // Output directory where the zip file will be saved
    destinationDirectory.set(layout.buildDirectory.dir("out"))

    // Directory or files you want to include in the package
    from("src")

}
java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(25))
}