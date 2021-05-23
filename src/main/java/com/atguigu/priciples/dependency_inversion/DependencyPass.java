package com.atguigu.priciples.dependency_inversion;

/**
 * 依赖关系传递的三种方式
 */
public class DependencyPass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		方式1
		ChanghongTV changhongTV = new ChanghongTV();
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.open(changhongTV); //因为长虹实现了ITV接口，OpenAndClose 实现了IOpenAndClose 把ITV传给OpenAndClose了
		// 方式2
//		OpenAndClose openAndClose = new OpenAndClose(changhongTV); // 这里直接通过依赖接口，后面用的时候构造器把细节传进去就好了
//		openAndClose.open(); // 上面是实现接口，通过open方法传入具体的细节，这里在构造器中就把细节传进去了
		// 方式3
		OpenAndClose openAndClose = new OpenAndClose();
		openAndClose.setTv(changhongTV); // set方法先设置电视机，如果没有这一步直接open ，你没有电视机打开
		openAndClose.open();


	}

}
class ChanghongTV implements ITV {
	@Override
	public void play() {
		System.out.println("打开长虹电视机");
	}
}

//// 方式1：通过接口传递实现依赖
// 开关的接口


// interface IOpenAndClose {
//	 // 你在这里传一个接口，通过接口传递依赖。
//	 public void open(ITV tv); //抽象方法，接收接口
// }
//
// // 这里是接口，你看ITV有长虹，有三星……。具体方式你自己去写就好了。
// interface ITV { //ITV接口
//	 public void play();
// }
//// 实现接口
// class OpenAndClose implements IOpenAndClose{
//	 public void open(ITV tv){ // 这里就是 通过接口，实现接口就要实现方法，接口里面的方法定义了依赖，实现接口就要实现依赖。
//	 	tv.play();
//	 }
// }

// 方式2：通过构造方法依赖传递
// interface IOpenAndClose {
//	 public void open(); // 抽象方法
// }
// interface ITV { //ITV接口
//	 public void play();
// }
// class OpenAndClose implements IOpenAndClose{
//	 public ITV tv;// 成员，
//	 public OpenAndClose(ITV tv){// 通过构造器接收依赖。
//		 this.tv = tv;
//	 }
//	 public void open(){
//		 this.tv.play();
//	 }
// }

// 方式3 通过setter方法传递
interface IOpenAndClose {
	public void open(); // 抽象方法

	public void setTv(ITV tv);
}

interface ITV { // ITV接口
	public void play();
}

class OpenAndClose implements IOpenAndClose {
	private ITV tv;

	public void setTv(ITV tv) { // 通过set方法把依赖传给需要的地方
		this.tv = tv;
	}

	public void open() {
		this.tv.play();
	}
}