##Example repository for usage immutable dto with lombok and mapstruct

###Gradle usage
```
annotationProcessor "org.mapstruct:mapstruct-processor:${mapstructVersion}",
    "org.projectlombok:lombok:${lombokVersion}",
    "org.projectlombok:lombok-mapstruct-binding:${lombokMapstructBindingVersion}"
```

###Maven usage
```
<build>
        <pluginManagement>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <version>3.8.1</version>
                    <configuration>
                        <annotationProcessorPaths>
                            <path>
                                <groupId>org.mapstruct</groupId>
                                <artifactId>mapstruct-processor</artifactId>
                                <version>${org.mapstruct.version}</version>
                            </path>
                            <path>
                                <groupId>org.projectlombok</groupId>
                                <artifactId>lombok</artifactId>
                                <version>${org.projectlombok.version}</version>
                            </path>
                            <path>
                                <groupId>org.projectlombok</groupId>
                                <artifactId>lombok-mapstruct-binding</artifactId>
                                <version>${lombok-mapstruct-binding.version}</version>
                            </path>
                        </annotationProcessorPaths>
                    </configuration>
                </plugin>
            </plugins>
        </pluginManagement>
    </build>

```

####Run Test
```shell
./gradlew test
```

####Build project

```shell
./gradlew build
```