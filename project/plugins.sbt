resolvers += Resolver.url(
    "sbt-plugin-releases on bintray",
    new URL("https://dl.bintray.com/sbt/sbt-plugin-releases/")
  )(Resolver.ivyStylePatterns)


addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.9")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2-1")

addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.4")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "0.8.0")
