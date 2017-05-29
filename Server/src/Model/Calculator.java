package Model;

/**
 * Class to calculate data and save answer in itself.
 * Created by User on 29.05.2017.
 */
public class Calculator {
  private float answer;

  public Calculator(){
    answer = 0;
  }

  public void summary(Float element){
    answer+=element;
  }

  public void difference(Float element){
    answer-=element;
  }

  public float getAnswer(){
    return answer;
  }
}