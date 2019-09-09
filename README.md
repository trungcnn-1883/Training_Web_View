# Training_Web_View

## I. Các khái niệm

### 1. Webview

### a. Khái niệm

Nếu muốn đưa 1 ứng dụng web hoặc 1 trang web như một phần của ứng dụng Android, ta có thể sử dụng WebView

<img src="https://4.bp.blogspot.com/-SBtkDgLFNxc/W9nwVou83FI/AAAAAAAAAOc/jv0zwnvMPDgQAtf-0o8oyIplkgkCa1fuwCEwYBhgL/s1600/webview-app-ss.jpg">

Nó không có đầy đủ chức năng như 1 trình duyệt web. Ở mặc định, nó chỉ hiển thị trang web

### b. Trường hợp sử dụng

- Những mục cần lấy dữ liệu qua Internet, ví dụ như email, tin tức, ...

- Cung cấp thông tin trong app, ví dụ như hướng dẫn người dùng, điều khoản sử dụng

=> Việc implement sẽ đơn giản hơn rất nhiều

### c. Custom WebView

Có thể custom WebView theo các cách sau:

- Bật hỗ trợ fullscreen qua **WebChromeClient**. Lớp này cũng được gọi khi WebView cần quyền để sửa UI của app

- Xử lý sự kiện ảnh hưởng tới tạo nội dung, như lúc bắt đầu, kết thúc load page, lỗi trên form để gửi đi hoặc chuyển trang với **WebViewClient**

- Bật JavaScript qua **WebSettings**

- Sử dụng JavaScript để truy cập vào đối tượng hệ thống Android mà đã được inject vào WebView

### d. Các đối tượng dùng với WebView

- **WebViewClient**: nhấn vào link trong WebView sẽ không mở trình duyệt lên như mặc định mà sẽ mở luôn trong WebView

Có nhiều phương thức xử lý đi kèm như: 

- shouldOverrideUrlLoading

- onPageStarted

- onPageFinished

- onLoadResource ...

- **WebChromeClient**: interface chịu trách nhiệm cho phản ứng lại sự kiện thay đổi thành phần của chrome quanh trình duyệt. Ví dụ như cảnh báo JavaScripts, favicon, load tiêu đề trang hiện tại, phần trăm load trang web




