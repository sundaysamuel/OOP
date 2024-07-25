public class User {
  String name;
  String login() {
    return "LoggedIn";
  }
  String register() {
    if (password.equals("") || username.equals("")) {
      return "Can't be empty";
    } else {
      return "Login successful";
    }
  }
    String logout() {
      return "Logged out successfully";
  }
  
}
public class Admin extends User {
  String StaffNo;
  String UploadResult(String course, float score) {
    return "result Uploaded";
  }
}
public class Student extends User {
  String MatricNo;
  String AdmissionNo;
  String RegisterCourses() {
    return "Course has been registered";
  }
  String CheckResult() {
    return "Result is ready";  
  }
}
