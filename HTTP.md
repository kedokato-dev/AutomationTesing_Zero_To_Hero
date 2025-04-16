# HTTP, REST, JSON, XML, Các phương thức HTTP và Mã trạng thái HTTP

## HTTP (Hypertext Transfer Protocol)
HTTP là giao thức được sử dụng để truyền tải dữ liệu giữa client (trình duyệt hoặc ứng dụng) và server (máy chủ). Đây là nền tảng của World Wide Web.

- **Đặc điểm chính:**
  - Sử dụng mô hình client-server.
  - Stateless (không lưu trạng thái giữa các yêu cầu).
  - Giao tiếp qua TCP/IP.

---

## REST (Representational State Transfer)
REST là một phong cách kiến trúc được sử dụng để xây dựng các dịch vụ web. REST hoạt động dựa trên các nguyên tắc của HTTP.

- **Đặc điểm chính:**
  - **Resource-Based**: Tài nguyên (resources) được nhận diện bằng URI (Uniform Resource Identifier).
  - **Stateless**: Server không lưu trạng thái của client.
  - **HTTP Methods**: Sử dụng các phương thức HTTP để thực hiện các thao tác CRUD (Create, Read, Update, Delete).
  - **Representation**: Tài nguyên được biểu diễn qua JSON, XML, HTML, hoặc plain text.

---

## JSON (JavaScript Object Notation)
JSON là định dạng dữ liệu nhẹ, dễ đọc và viết, thường được sử dụng để trao đổi dữ liệu giữa client và server.

- **Ưu điểm:**
  - Cấu trúc đơn giản, tương tự đối tượng trong JavaScript.
  - Hỗ trợ nhiều ngôn ngữ lập trình.
  - Hiệu quả hơn XML về mặt kích thước dữ liệu.

- **Ví dụ JSON:**
```json
{
  "name": "AnhQuan",
  "age": 21,
  "isStudent": true
}
```

---

## XML (eXtensible Markup Language)
XML là ngôn ngữ đánh dấu được sử dụng để biểu diễn dữ liệu trong một cấu trúc cây.

- **Ưu điểm:**
  - Tính linh hoạt cao.
  - Có thể tự định nghĩa các thẻ (tags).
  - Hỗ trợ xác thực dữ liệu qua DTD/XSD.

- **Ví dụ XML:**
```xml
<person>
  <name>AnhQuan</name>
  <age>21</age>
  <isStudent>true</isStudent>
</person>
```

---

## Các phương thức HTTP
HTTP hỗ trợ nhiều phương thức, nhưng các phương thức phổ biến nhất là:

1. **GET**:
   - Dùng để lấy dữ liệu từ server.
   - Không ảnh hưởng đến trạng thái server.
   - Ví dụ: Lấy danh sách người dùng.

2. **POST**:
   - Dùng để gửi dữ liệu mới lên server (tạo mới tài nguyên).
   - Ví dụ: Thêm một người dùng mới.

3. **PUT**:
   - Dùng để cập nhật dữ liệu (toàn bộ tài nguyên).
   - Ví dụ: Cập nhật thông tin của một người dùng.

4. **DELETE**:
   - Dùng để xóa dữ liệu trên server.
   - Ví dụ: Xóa một người dùng.

---

## Mã trạng thái HTTP (HTTP Status Codes)
Mã trạng thái HTTP được gửi từ server đến client để biểu thị kết quả của một yêu cầu HTTP.

- **Phân loại chính:**
  1. **1xx (Thông tin):** Yêu cầu đang được xử lý.
     - 100 Continue
  2. **2xx (Thành công):** Yêu cầu thành công.
     - 200 OK: Thành công.
     - 201 Created: Tạo mới thành công.
  3. **3xx (Chuyển hướng):** Cần thực hiện thêm hành động.
     - 301 Moved Permanently: Tài nguyên đã được chuyển vĩnh viễn.
     - 302 Found: Tài nguyên tạm thời chuyển hướng.
  4. **4xx (Lỗi client):** Lỗi từ phía client.
     - 400 Bad Request: Yêu cầu không hợp lệ.
     - 401 Unauthorized: Chưa được xác thực.
     - 403 Forbidden: Bị từ chối truy cập.
     - 404 Not Found: Không tìm thấy tài nguyên.
  5. **5xx (Lỗi server):** Lỗi từ phía server.
     - 500 Internal Server Error: Lỗi không xác định trên server.
     - 503 Service Unavailable: Dịch vụ không khả dụng.

---