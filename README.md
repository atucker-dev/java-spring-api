# Example Java Spring API with Common Config

Quick start shell Java Spring API with common dependencies

## Endpoints

Browser:

- <https://localhost:8443/swagger-ui/index.html#>

curl:

- `curl -v https://localhost:8443/v3/api-docs`
- `curl -v https://localhost:8443/config`
- `curl -v https://localhost:8443/actuator/health`

## Summary

- Java 25
- Spring Boot 4.x
- Spring Actuator
- Spring OpenAPI Docs
- Spring Security
- Spring Web

### Notes

Add keystore.p12 file to `/src/main/resources` for local self-signed TLS certificate tests

Example certificate generation command:

```bash
keytool -genkeypair -alias local -keyalg RSA -keysize 2048 \
  -storetype PKCS12 -keystore src/main/resources/keystore.p12 \
  -validity 365 -storepass changeit \
  -dname "CN=localhost, OU=dev, O=local, L=local, S=local, C=US"
```
