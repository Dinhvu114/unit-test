# BÀI TẬP THỰC HÀNH 1
<img width="619" height="310" alt="{6143B63F-FB7D-4AFD-8E90-4CAE41377AEC}" src="https://github.com/user-attachments/assets/c4dda7e3-71b8-46bc-8240-5c691538fb98" />

# BÀI TẬP THỰC HÀNH 2: Student Score Analyzer – Unit Testing with JUnit

## 1. Giới thiệu

Đây là bài tập thực hành kiểm thử đơn vị (Unit Testing) trong Java sử dụng **JUnit 5**.
Chương trình thực hiện phân tích dữ liệu điểm số của học sinh và kiểm thử các chức năng bằng các ca kiểm thử tự động.

Mục tiêu của bài tập:

* Hiểu cách viết **Unit Test với JUnit**
* Áp dụng **kiểm thử tự động trong Java**
* Thực hành **quy trình phát triển phần mềm với GitHub Issues và Commit**

---

# 2. Mô tả bài toán

Chương trình gồm lớp `StudentAnalyzer` dùng để phân tích danh sách điểm của học sinh.

Danh sách điểm có thể chứa dữ liệu hợp lệ hoặc không hợp lệ.

Điểm hợp lệ:

```
0 ≤ score ≤ 10
```

Điểm không hợp lệ sẽ bị bỏ qua khi xử lý.

---

# 3. Các chức năng chính

## 3.1 Đếm số học sinh đạt loại Giỏi

Phương thức:

```
countExcellentStudents(List<Double> scores)
```

Chức năng:

* Đếm số học sinh có điểm **>= 8.0**
* Bỏ qua điểm **< 0 hoặc > 10**
* Nếu danh sách rỗng → trả về **0**

---

## 3.2 Tính điểm trung bình hợp lệ

Phương thức:

```
calculateValidAverage(List<Double> scores)
```

Chức năng:

* Tính trung bình của các điểm **từ 0 đến 10**
* Bỏ qua dữ liệu sai
* Nếu không có điểm hợp lệ → trả về **0**

---

# 4. Cấu trúc project

```
unit-test
│
├── src
│   ├── main
│   │   └── java/com/vu
│   │        └── StudentAnalyzer.java
│   │
│   └── test
│       └── java/com/vu
│            └── StudentAnalyzerTest.java
│
├── pom.xml
└── README.md
```

---

# 5. Công nghệ sử dụng

* Java
* Maven
* JUnit 5
* Visual Studio Code
* Git & GitHub

---

# 6. Các trường hợp kiểm thử

Các ca kiểm thử được xây dựng cho cả hai phương thức.

### Trường hợp bình thường

* Danh sách có cả điểm hợp lệ và không hợp lệ

Ví dụ:

```
[9.0, 8.5, 7.0, 11.0, -1.0]
```

---

### Trường hợp toàn bộ hợp lệ

Ví dụ:

```
[8.0, 9.0, 10.0]
```

---

### Trường hợp biên (Boundary Case)

Ví dụ:

```
[0.0, 10.0]
```

---

### Trường hợp danh sách rỗng

Ví dụ:

```
[]
```

---

# 7. Hướng dẫn chạy chương trình

Clone project:

```
git clone <repository-url>
```

Di chuyển vào thư mục project:

```
cd unit-test
```

Biên dịch project:

```
mvn clean install
```

---

# 8. Hướng dẫn chạy kiểm thử

Chạy tất cả Unit Test bằng Maven:

```
mvn test
```

Nếu thành công, Maven sẽ hiển thị:

```
BUILD SUCCESS
```

Ngoài ra có thể chạy test trực tiếp trong **VS Code** bằng cách nhấn **Run Test** trong file `StudentAnalyzerTest.java`.

---

# 9. Tác giả

Nguyễn Đình Vũ
Sinh viên ngành Công nghệ Thông tin

