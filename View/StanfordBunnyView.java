//View

package StanfordBunny.View;

import StanfordBunny.Controller.StanfordBunnyController;
import StanfordBunny.Modle.StanfordBunnyModel;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.swt.GLCanvas;
import com.jogamp.opengl.util.gl2.GLUT;

public class StanfordBunnyView implements GLEventListener {
	protected StanfordBunnyModel modle;
	protected StanfordBunnyController controller;
	protected GLCanvas canvas;
	protected GL2 gl;
	protected GLU glu;
	protected GLUT glut;
	protected int width;
	protected int height;
	protected float angleX;
	protected float angleY;
	protected float angleZ;

	/*コンストラクタ*/
	StanfordBunnyView(StanfordBunnyModel aModle){

	}

	/*ここからアクセサメソッド*/
	public float angleX(){
		return angleX;
	}

	public void angleX(float angle){
		this.angleX = angle;
	}

	public float angleY(){
		return angleY;
	}

	public void angleY(float angle){
		this.angleY = angle;
	}

	public float angleZ(){
		return angleZ;
	}

	public void angleZ(float angle){
		this.angleZ = angle;
	}

	public GLCanvas canvas(){
		return canvas;
	}

	public StanfordBunnyController controller(){
		return controller;
	}

	public GL2 gl(){
		return gl;
	}

	public GLU glu(){
		return glu;
	}

	public GLUT glut(){
		return glut;
	}
	/*ここまでアクセサメソッド*/


// OpenGLの後すぐdrawableオブジェクトによって、contextが初期化される
	public void init(GLAutoDrawable aDrawable){

	}
//OpenGL contextが初期化された直後に、drawableオブジェクトによって呼ばれます
	public void display(GLAutoDrawable aDrawable){

	}

//GLContext（例えばメモリバッファとGLSLプログラム）につきすべてのOpenGL資源の解放を実行するために、リスナーに通知します。
	public void dispose(GLAutoDrawable aDrawable){

	}

//構成要素が大きさを変更されたあと、最初の塗り直しの間、drawableオブジェクトによって呼ばれます
	public void reshape(GLAutoDrawable aDrawable, int x, int y, int w, int h){

	}

	public void displayAxes(GLAutoDrawable aDrawable){

	}

	public void displayChanged(GLAutoDrawable aDrawable, boolean modeChange, boolean deviceChange){

	}


	public void reset(){

	}

	public void rotateXY(int amountX, int amountY){

	}
}
