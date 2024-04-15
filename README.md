# HHH-17957-modelgen_module-info

Small project demonstrating Hibernate issue [HHH-17957](https://hibernate.atlassian.net/browse/HHH-17957).

Just execute

    `./gradlew (UNIX/Linux)`

or

    `gradlew.bat (Windows)`

Result is:

```
> Task :compileJava FAILED
Note: Hibernate compile-time tooling 6.5.0.CR2
error: Error running Hibernate processor: Cannot invoke "javax.lang.model.element.Element.getAnnotationMirrors()" because "element" is null
error: java.lang.NullPointerException: Cannot invoke "javax.lang.model.element.Element.getAnnotationMirrors()" because "element" is null
        at org.hibernate.processor.util.TypeUtils.getAnnotationMirror(TypeUtils.java:251)
        at org.hibernate.processor.util.TypeUtils.hasAnnotation(TypeUtils.java:260)
        at org.hibernate.processor.HibernateProcessor.processClasses(HibernateProcessor.java:297)
        at org.hibernate.processor.HibernateProcessor.process(HibernateProcessor.java:261)
        at org.gradle.api.internal.tasks.compile.processing.DelegatingProcessor.process(DelegatingProcessor.java:62)
        at org.gradle.api.internal.tasks.compile.processing.IsolatingProcessor.process(IsolatingProcessor.java:50)
    ...
```

