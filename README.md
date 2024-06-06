
日志
```dtd


/home/pengpeng/tools/java/17/jdk17.0.6/bin/java -javaagent:/snap/intellij-idea-community/498/lib/idea_rt.jar=45999:/snap/intellij-idea-community/498/bin -Dfile.encoding=UTF-8 -classpath /home/pengpeng/IdeaProjects/ocr/target/classes:/home/pengpeng/.m2/repository/e-iceblue/spire.ocr/1.9.3/spire.ocr-1.9.3.jar OCR
        Linux
        com.spire.ocr.OcrException: Error occurred during ocr.
        at com.spire.ocr.OcrScanner.spr︻⇇(Unknown Source)
        at com.spire.ocr.OcrScanner.scan(Unknown Source)
        at OCR.main(OCR.java:29)
        Caused by: class com.spire.ocr.packages.sprpae: DirectoryInfo was not created
        com.spire.ocr.packages.sprrik.spr≌├(Directory.java:33)
        com.spire.ocr.packages.sprfxd.spr┃︼(Unknown Source)
        com.spire.ocr.packages.sprfxd.spr▥﻿—(Unknown Source)
        com.spire.ocr.packages.sprfxd.<init>(Unknown Source)
    com.spire.ocr.packages.spryrd.spr⌨︼(Unknown Source)
    com.spire.ocr.OcrScanner.spr︻⇇(Unknown Source)
    com.spire.ocr.OcrScanner.scan(Unknown Source)
    OCR.main(OCR.java:29)
    at com.spire.ocr.packages.sprrik.spr≌├(Directory.java:33)
    at com.spire.ocr.packages.sprfxd.spr┃︼(Unknown Source)
    at com.spire.ocr.packages.sprfxd.spr▥﻿—(Unknown Source)
    at com.spire.ocr.packages.sprfxd.<init>(Unknown Source)
        at com.spire.ocr.packages.spryrd.spr⌨︼(Unknown Source)
        ... 3 more
        Exception in thread "main" com.spire.ocr.OcrException: Run Process first.
        at com.spire.ocr.OcrScanner.getText(Unknown Source)
        at OCR.main(OCR.java:32)

        Process finished with exit code 1


```

环境信息

```
pengpeng@thinkpad16:~/IdeaProjects/ocr$ java --version
openjdk 17.0.3 2022-04-19
OpenJDK Runtime Environment GraalVM 22.1.0.1 (build 17.0.3+7-jvmci-22.1-b06)
OpenJDK 64-Bit Server VM GraalVM 22.1.0.1 (build 17.0.3+7-jvmci-22.1-b06, mixed mode, sharing)


pengpeng@thinkpad16:~/IdeaProjects/ocr$ lsb_release -a
No LSB modules are available.
Distributor ID: Ubuntu
Description:    Ubuntu 22.04.1 LTS
Release:        22.04
Codename:       jammy

```