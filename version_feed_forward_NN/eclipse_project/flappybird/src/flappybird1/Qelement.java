package flappybird1;

public class Qelement {

	public float jump_score;
	public float no_jump_score;

	Qelement(float j,float n){
		jump_score = j;
		no_jump_score = n;
	}

	float max_future_score(){
		if(jump_score > no_jump_score) return jump_score;
		else return no_jump_score;
	}

}
