# security-webauthn-demo Project

Based on https://quarkus.io/guides/security-webauthn

## Requirements

- Java 17
- Maven 3.8+
- yubico key

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

Type on your browser: http://localhost:8080 and then you can register / login a user with your yubico Key.
