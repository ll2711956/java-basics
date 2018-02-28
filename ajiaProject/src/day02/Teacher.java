package day02;

public class Teacher extends Person {
	public int teacherNum;
	public String title;

	public int getTeacherNum() {
		return teacherNum;
	}

	public void setTeacherNum(int teacherNum) {
		this.teacherNum = teacherNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String info(){
		return "姓名:"+name+",年龄:"+age+",职工号:"+teacherNum+",职称:"+title;
	}
}
