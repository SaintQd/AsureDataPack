plugins {
    id("java")
}
tasks.register<Zip>("pack-zip") {

    // Name of the output zip file
    archiveFileName.set("VineriumDataPack.zip")

    // Output directory where the zip file will be saved
    destinationDirectory.set(layout.buildDirectory.dir("out"))

    // Directory or files you want to include in the package
    from("src")

}
java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(25))
}