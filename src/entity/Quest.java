package entity;

public class Quest {
    int questID;
    String questName;
    String questDescription;
    int rewardEXP;
    int rewardGold;

    public Quest() {
    }
    
    public Quest(int questID, String questName, String questDescription, int rewardEXP, int rewardGold) {
        this.questID = questID;
        this.questName = questName;
        this.questDescription = questDescription;
        this.rewardEXP = rewardEXP;
        this.rewardGold = rewardGold;
    }

    public int getQuestID() {
        return questID;
    }

    public void setQuestID(int questID) {
        this.questID = questID;
    }

    public String getQuestName() {
        return questName;
    }

    public void setQuestName(String questName) {
        this.questName = questName;
    }

    public String getQuestDescription() {
        return questDescription;
    }

    public void setQuestDescription(String questDescription) {
        this.questDescription = questDescription;
    }

    public int getRewardEXP() {
        return rewardEXP;
    }

    public void setRewardEXP(int rewardEXP) {
        this.rewardEXP = rewardEXP;
    }

    public int getRewardGold() {
        return rewardGold;
    }

    public void setRewardGold(int rewardGold) {
        this.rewardGold = rewardGold;
    }

    @Override
    public String toString() {
        return "\nQuest Name\t:" + getQuestName() + "\nDescription\t:" + getQuestDescription() + "\nReward\t\t:" 
                + getRewardEXP() + " EXP & " + getRewardGold() + " Gold";
    }
    
    
}

