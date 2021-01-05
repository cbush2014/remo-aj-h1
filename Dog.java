
public class Dog{

    private String name;
    private int numCookies;
    private int numCookiesMax;
    private boolean isGoodDoggie;
    private String rewardType;
    
    public Dog() {}
    
    public Dog ( String name, int age, String location, String type) {
            this.name = name;
            this.numCookies = numCookies;
            this.numCookies = numCookiesMax;
            this.rewardType = rewardType;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public int getNumCookies() {
            return numCookies;
        }
    
        public void setNumCookies(int numCookies) {
            this.numCookies = numCookies;
        }

        public int getNumCookiesMax() {
            return numCookiesMax;
        }
    
        public void setNumCookiesMax(int numCookiesMax) {
            this.numCookiesMax = numCookiesMax;
        }
        
        public String getRewardType() {
            return rewardType;        
        }

        public boolean getIsGoodDoggie() {
            return isGoodDoggie;
        }

        public void setIsGoodDoggie(boolean isGoodDoggie) {
            this.isGoodDoggie = isGoodDoggie;
        }
    
        public void setRewardType(String rewardType) {
            this.rewardType = rewardType;
        }
    
    }    
    
    
    
    