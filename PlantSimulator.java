import java.util.Scanner;

public class PlantSimulator {
  //method to call and print text relating to stuff
  public static void printPlantInfo(String selectedPlant){
    
    
    System.out.println("");
    
    //go through all indoor plant types
    if(selectedPlant.equals("indoor herb")){
     System.out.println("Light level: At least 6 hours of sunlight");
     System.out.println("Water: 4-5 days");
     System.out.println("Temperature: 65-75F");
     System.out.println("Soil: Well-drained \n" + "   Content: Potting soil, perlite, and pumice \n" + "   Texture: Medium");
    }
    else if(selectedPlant.equals("indoor creeper")){
     System.out.println("Light level: 8-12 hours with low to bright indirect light");
     System.out.println("Water: Water top 2-5 cm every 7-10 days");
     System.out.println("Temperature: 65-80F");
     System.out.println("Soil: Slightly moist, not soggy \n" + "   Content: Potting soil and perlite \n" + "   Texture: Loose and chunky");
    }
    else if(selectedPlant.equals("indoor fern")){
     System.out.println("Light level: Lots of indirect light");
     System.out.println("Water: Once or twice a week + high humidity");
     System.out.println("Temperature: 65-75F");
     System.out.println("Soil: Moist \n" + "   Content: Peat moss or sphagnum \n" + "   Texture: Lomay, loose");
    }
    else if(selectedPlant.equals("indoor succulent/cactus")){
     System.out.println("Light level: At least 6 hours in direct sunlight");
     System.out.println("Water: Once every 2-4 weeks, let soil dry in between growing seasons");
     System.out.println("Temperature: 70-90F");
     System.out.println("Soil: Dry \n" + "   Content: Coarse sand, perlite or pumice \n" + "   Texture: Gritty or loose");
    }
    else if(selectedPlant.equals("indoor aquatic plant")){
     System.out.println("Light level: 6-10 hours a day with low-medium light levels");
     System.out.println("Water: Fully submerged and weekly 20-30% water change");
     System.out.println("Temperature: 72-82F");
     System.out.println("Soil: Wet \n" + "   Content: Aquasoil or fine gravel \n" + "   Texture: Medium ");
    }
    else if(selectedPlant.equals("indoor carnivorous plant")){
     System.out.println("Light level: 10-14 hours of strong growing light");
     System.out.println("Water: Water without minerals every 7-10 days + constant moisture");
     System.out.println("Temperature: 68-82F");
     System.out.println("Soil: Low nutrient \n" + "   Content:  Low mineral, nutrient-poor mix \n" + "   Texture:  Loose, airy, and fine");
    }
    
    // go though all outdoor types 
    else if(selectedPlant.equals("outdoor tree")){
     System.out.println("Light level: 6-8 hours of direct sunlight");
     System.out.println("Water: 1-2 times a week");
     System.out.println("Temperature: 86-104F");
     System.out.println("Soil: Loamy or well-drained \n" + "   Content: Sand, silt, and clay \n" + "   Texture: Lloamy, gritty/solid");
    }
    else if(selectedPlant.equals("outdoor shrub")){
     System.out.println("Light level: \n" + "Full sun : 6 hours of direct sunlight \n" + "Partial Sun/Shaded: 3-6 hours of filtered sun \n" + "Shade: no sun");
     System.out.println("Water: Water once a week");
     System.out.println("Temperature: 65-85F");
     System.out.println("Soil: Well-drained \n" + "   Content: Top soil and potting mix \n" + "   Texture: Loamy");
    }
    else if(selectedPlant.equals("outdoor creeper")){
     System.out.println("Light level: 6-8 hours of direct sunlight");
     System.out.println("Water: Water deeply twice a week");
     System.out.println("Temperature: 68-80F");
     System.out.println("Soil: Well-drained \n" + "   Content: Sand, silt, and clay \n" + "   Texture: Gritty and solid");
    }
    else if(selectedPlant.equals("outdoor fern")){
     System.out.println("Light level: Shade/Indirect sunlight");
     System.out.println("Water: Water once or twice a week");
     System.out.println("Temperature: 60-72F");
     System.out.println("Soil: Well Drained/Moist \n" + "   Content: Peat moss or sphagnum \n" + "   Texture: Lomay, loose");
    }
    else if(selectedPlant.equals("outdoor succulent/cactus")){
     System.out.println("Light level: At least 6 hours in direct sunlight");
     System.out.println("Water: Once every 2-3 weeks, let soil dry in between growing seasons");
     System.out.println("Temperature: 70-90F");
     System.out.println("Soil: Dry \n" + "   Content:  Coarse sand, perlite or pumice \n" + "   Texture: Gritty or loose");
    }
    else if(selectedPlant.equals("outdoor aquatic plant")){
     System.out.println("Light level: 10-12 hours of bright light");
     System.out.println("Water: Fully submerged and weekly 10-20% water change");
     System.out.println("Temperature: Mid 70F");
     System.out.println("Soil: Wet \n" + "   Content: Soil layered and gravel \n" + "   Texture: Medium");
    }
    else if(selectedPlant.equals("outdoor carnivorous plant")){
     System.out.println("Light level: 6-12 hours of direct sunlight");
     System.out.println("Water: Water without minerals every 7-10 days + constant moisture");
     System.out.println("Temperature: 68-82F");
     System.out.println("Soil: Low nutrient \n" + "   Content: Aquasoil or fine gravel \n" + "   Texture: Medium ");
    }
    
    
  }
  
  

  
  public static void main(String [] args) throws inputException {
    //declare variables
    Scanner scnr = new Scanner(System.in);
    String [][] plantType = new String [2][8];
    String selectedPlant;
    int inputA;
    int inputB;
    int confirmationInput = -1;
    int i;
    int j;
    boolean result = true;
    
    
    //array setup, 0 is in while 1 is out
    //2 is our first indoor plant given the info from the doc
    //indoor types
    plantType [0][2] = "indoor herb";
    plantType [0][3] = "indoor creeper";
    plantType [0][4] = "indoor fern";
    plantType [0][5] = "indoor succulent/cactus";
    plantType [0][6] = "indoor aquatic plant";
    plantType [0][7] = "indoor carnivorous plant";
    
    //outdoor types
    plantType [1][0] = "outdoor tree";
    plantType [1][1] = "outdoor shrub";
    plantType [1][3] = "outdoor creeper";
    plantType [1][4] = "outdoor fern";
    plantType [1][5] = "outdoor succulent/cactus";
    plantType [1][6] = "outdoor aquatic plant";
    plantType [1][7] = "outdoor carnivorous plant";
    
    //print out instructions
    System.out.println("Welcome to planting simulator.");
    System.out.println("Please input numbers only for the type of plant you are trying to care for.");
    System.out.println("Is it an indoor (0) or outdoor (1) plant?");
    System.out.println("");
    
    inputA = scnr.nextInt();
    
    
    
    //print out list of plants, depending on inputA
    /*if(inputA==0){
      for (j=0 ; j<8 ; ++j){
        System.out.println(plantType[inputA][j]);
      }
    }
    */
    
    
    
    //Check if user selected indoor or outdoor plant and print appropriate message
    while(result){
      if ((inputA != 0) && (inputA != 1)) {
    System.out.println ("Please input 0 or 1 for indoor or outdoor plant");
    inputA = scnr.nextInt();
    }
    
    else if (inputA == 0) {
    System.out.println ("You have selected an indoor plant." + " Here is a list of Indoor plants to choose: \n" + "1. Herb(2) \n" + "2. Creeper(3) \n" + "3. Fern(4) \n" + "4. Succulent/Cactus(5) \n" + "5. Aquatic Plant(6) \n" + "6. Carnivorous Plant(7)") ;
    result = false;
      
    }
    
    else {
    System.out.println ("You have selected an outdoor plant." + " Here is a list of Outdoor plants to choose: \n" + "1. Tree(0) \n" + "2. Shrub(1) \n" + "3. Creeper(3) \n" + "4. Fern(4) \n" + "5. Succulent/Cactus(5) \n" + "6. Aquatic Plant(6) \n" + "7. Carnivorous Plant(7)");
   result = false;
    }
    
    }
    
    
    System.out.println("");
    
    //user selects a plant, updating inputB
    result = true;
    inputB = scnr.nextInt();
    
    while(result){
    try{
      
      
      if (inputA==0){
         if (inputB < 2 || inputB > 7){
           throw new inputException(inputB);
        
       }
      else{
        result = false;
        System.out.println("");
      }
        
      }
      
       else if (inputA==1){
          if (inputB < 0 || inputB > 7 || inputB == 2){
           throw new inputException(inputB);
        
       }
       
       else{
        result = false;
        System.out.println("");
      }
  
        
      }
      
      
    }
    catch(inputException e){
      System.out.println(e.getMessage());
      inputB = scnr.nextInt();
    }
    
    }
     //need code for when doesn't select a number in range 2-7 or 0-1 n 3-7, exception FIXXXXXXXXXXXXXXXXXXXXXXXX
     
     
     
     
    selectedPlant = plantType[inputA][inputB];
    
    //text asking for confirmation of plant type ,needs to be in a loop so more concise later, actually a method call might be better
    result = true;
    
    
    while(result){
    System.out.println("Is " + selectedPlant + " the correct plant?\n" + "Input 0 for yes and 1 for no.");
    
    confirmationInput = scnr.nextInt();
    
    if ((confirmationInput != 0) && (confirmationInput != 1)) {
    System.out.println ("Please input 0 or 1.");
    }
    System.out.println("");
    
     if (confirmationInput == 1) {
       if (inputA == 0) {
    System.out.println ("You have selected an indoor plant." + " Here is a list of Indoor plants to choose: \n" + "1. Herb(2) \n" + "2. Creeper(3) \n" + "3. Fern(4) \n" + "4. Succulent/Cactus(5) \n" + "5. Aquatic Plant(6) \n" + "6. Carnivorous Plant(7)") ;
         
       }
    
    else {
    System.out.println ("You have selected an outdoor plant." + " Here is a list of Outdoor plants to choose: \n" + "1. Tree(0) \n" + "2. Shrub(1) \n" + "3. Creeper(3) \n" + "4. Fern(4) \n" + "5. Succulent/Cactus(5) \n" + "6. Aquatic Plant(6) \n" + "7. Carnivorous Plant(7)");
      
    }
    System.out.println("");
    
    //user selects a plant, updating inputB
    inputB = scnr.nextInt();
    
     //need code for when doesn't select a number in range 2-7 or 0-1 n 3-7, exception
     
    selectedPlant = plantType[inputA][inputB];
    
    
     }
     
     else if (confirmationInput==0){
       break;
     }
    }
    
    //confirm plant, now provide information
    if (confirmationInput==0){
      printPlantInfo(selectedPlant);
    }
    
    
    
    
    
    
    
    
    
    }
    
    


    
    
}