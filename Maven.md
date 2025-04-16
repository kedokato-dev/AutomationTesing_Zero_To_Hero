# Maven Overview

## Cách Maven quản lý dependencies
Maven là một công cụ quản lý dự án và tự động hóa xây dựng phổ biến trong Java. Maven quản lý dependencies thông qua tệp cấu hình chính của dự án gọi là `pom.xml` (Project Object Model). Dưới đây là các khía cạnh chính:

### 1. Khai báo dependencies
Các dependencies của dự án được khai báo trong phần `<dependencies>` trong `pom.xml`. Mỗi dependency được định nghĩa bằng các thông tin:
- `groupId`: Tổ chức hoặc nhóm cung cấp thư viện.
- `artifactId`: Tên của thư viện.
- `version`: Phiên bản của thư viện.

Ví dụ:
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>5.3.25</version>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope> <!-- Chỉ dùng cho kiểm thử -->
    </dependency>
</dependencies>
```

### 2. Repository
Maven tìm kiếm dependencies từ các kho lưu trữ (repositories). Mặc định, Maven sử dụng kho trung tâm Maven Central (`https://repo.maven.apache.org/maven2/`). Bạn có thể cấu hình thêm các kho khác trong `<repositories>`.

### 3. Scopes
Maven sử dụng các phạm vi (scopes) để xác định cách dependencies được sử dụng:
- `compile`: Mặc định, cần thiết cho biên dịch và runtime.
- `provided`: Cung cấp bởi môi trường (ví dụ: servlet API).
- `runtime`: Không cần cho biên dịch, chỉ cần trong runtime.
- `test`: Chỉ dùng cho kiểm thử.

### 4. Transitive Dependencies
Maven tự động tải các dependencies phụ thuộc (transitive dependencies). Ví dụ, nếu thư viện A phụ thuộc vào thư viện B, Maven sẽ tự động tải B.

---

## Cấu trúc thư mục Maven
Maven sử dụng một cấu trúc thư mục chuẩn để tổ chức mã nguồn, tài nguyên và tệp kiểm thử. Cấu trúc này giúp các nhà phát triển dễ dàng hiểu và làm việc với các dự án Maven.

### Thư mục chính:
- **`src/main/java`**: Chứa mã nguồn chính của ứng dụng.
- **`src/main/resources`**: Chứa các tài nguyên không phải mã nguồn (ví dụ: tệp cấu hình, tệp XML, tệp properties).
- **`src/test/java`**: Chứa mã kiểm thử (unit test).
- **`src/test/resources`**: Chứa tài nguyên cho kiểm thử (ví dụ: dữ liệu kiểm thử).
- **`target/`**: Thư mục đầu ra nơi lưu trữ các tệp đã biên dịch, tệp JAR/WAR và các kết quả kiểm thử.

### Ví dụ cấu trúc:
```
my-maven-project/
├── pom.xml                 # Tệp cấu hình Maven
├── src/
│   ├── main/
│   │   ├── java/           # Mã nguồn chính (Java)
│   │   └── resources/      # Tài nguyên của ứng dụng
│   ├── test/
│   │   ├── java/           # Mã kiểm thử (JUnit, TestNG, v.v.)
│   │   └── resources/      # Tài nguyên cho kiểm thử
├── target/                 # Kết quả build: JAR, WAR, class files
```

---

## Tổng kết
- Maven quản lý dependencies qua `pom.xml`, sử dụng các kho lưu trữ và cơ chế tự động tải dependencies phụ thuộc.
- Cấu trúc thư mục chuẩn của Maven giúp tổ chức dự án một cách rõ ràng, dễ hiểu và tương thích với các công cụ xây dựng phổ biến khác.
