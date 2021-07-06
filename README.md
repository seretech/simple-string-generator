# simple-string-generator
A simple Java Library To Generate random Strings

# Implementation
Add the following to your project build gradle
```
repositories {
        maven { url 'https://jitpack.io' }
    }
```
Add the following dependency in your app's build.gradle
```
dependencies {
      implementation 'com.github.seretech:simple-string-generator:1.1.0'
}
```
# Usage
```
Generator generator = new Generator();
Generate random strings from a-z
String aa = generator.generateLettersLowercase(numberofStringToGenerate);
```

# Other Usage Methods
Generate random strings from A-Z
```
generator.generateLettersLowercase()
```

Generate random strings from 0-9
```
generator.generateLettersNumbers()
```

Generate random strings from A-Z and 0-9
```
generator.generateLettersUppercaseNumbers()
```

Generate random strings from a-z and 0-9
```
generator.generateLettersLowercaseNumbers()
```

Generate random strings from a-z, A-Z and 0-9
```
generator.generateLettersNumbers()
```

Generate random strings from a-z, A-Z and special characters such as "!@#$%^&*_-+"
```
generator.generateLettersSpecials()
```

Generate random strings from a-z, A-Z,0-9 and special characters such as "!@#$%^&*_-+"
```
generator.generateAll()
```

Generate custom Strings specify the strings to generate from can include letters, numbers and special charaters
```
generator.generateCustomString(numberofStringToGenerate,"a,b,c,d,e,f,g,h,i,j")
```
