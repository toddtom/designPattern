package Iterator.service;

/**
 * 用来实现访问Collection集合的迭代接口，为了外部统一访问方式
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class CollectionIteratorImpl implements Iterator {
  //用来存放被迭代的聚合对象
  private PayManager aggregate=null;
  /*用来记录当前迭代到的位置索引
  -1表示刚开始的时候，迭代器指向聚合对象第一个对象之前
  */
  private int index=-1;

  public CollectionIteratorImpl(PayManager aggregate) {
    this.aggregate = aggregate;
  }
  public void first(){
    index=0;
  }
  public void next(){
    if(index<this.aggregate.size()){
      index+=1;
    }
  }
  public boolean isDone(){
    if(index==this.aggregate.size()){
      return true;
    }
    return false;
  }

  public Object currentItem(){
    return this.aggregate.get(index);
  }
}
