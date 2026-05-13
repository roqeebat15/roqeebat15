class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (prisonerIsAwake && !archerIsAwake){
            return (prisonerIsAwake && !archerIsAwake);
        }
        else{
            return
                !(!prisonerIsAwake || archerIsAwake);
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
       if (petDogIsPresent && !archerIsAwake){
           return (petDogIsPresent && !archerIsAwake);
       }
        else if (!petDogIsPresent&& prisonerIsAwake && !knightIsAwake && !archerIsAwake){
        return (!petDogIsPresent && prisonerIsAwake && !knightIsAwake && !archerIsAwake); 
        }
        else{
           return !(knightIsAwake || archerIsAwake || (prisonerIsAwake == petDogIsPresent));
        }
    }
}
