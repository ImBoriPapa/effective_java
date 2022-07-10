package chpater_02.item01;

public interface Dog {

     String name();

     static Dog of(DogSize dogSize){
          if (dogSize.equals(DogSize.SMALL)) {
               return new SmallDog();
          } else if (dogSize.equals(DogSize.MEDIUM)) {
               return new MediumDog();
          }else if (dogSize.equals(DogSize.LARGE)) {
               return new LargeDog();
          }
          return null;
     }

}
