package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.HatcheryProduction;

public class HatchSuccessRate {

        private String batchId;
        private float totalEgg;
        private float hatchedEgg;
        private float successRate;

        public String getBatchId() {
            return batchId;
        }

        public void setBatchId(String batchId) {
            this.batchId = batchId;
        }

        public float getTotalEgg() {
            return totalEgg;
        }

        public void setTotalEgg(float totalEgg) {
            this.totalEgg = totalEgg;
        }

        public float getHatchedEgg() {
            return hatchedEgg;
        }

        public void setHatchedEgg(float hatchedEgg) {
            this.hatchedEgg = hatchedEgg;
        }

        public double getSuccessRate() {
            return successRate;
        }

        public void setSuccessRate(float successRate) {
            this.successRate = successRate;
        }

        @Override
        public String toString() {
            return "HatchingBatch{" +
                    "batchId='" + batchId + '\'' +
                    ", totalEgg=" + totalEgg +
                    ", hatchedEgg=" + hatchedEgg +
                    ", successRate=" + successRate +
                    '}';
        }

    public HatchSuccessRate(String batchId, float totalEgg, float hatchedEgg, float successRate) {
        this.batchId = batchId;
        this.totalEgg = totalEgg;
        this.hatchedEgg = hatchedEgg;
        this.successRate = successRate;
    }
}
