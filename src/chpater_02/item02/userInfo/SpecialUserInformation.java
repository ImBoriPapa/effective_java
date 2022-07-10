package chpater_02.item02.userInfo;

public class SpecialUserInformation extends UserInformationManagement {
    private final boolean benefits;

    public static class Builder extends UserInformationManagement.Builder<Builder> {
        private boolean benefits = false;

        public Builder benefits() {
            benefits = true;
            return this;
        }

        @Override
        public SpecialUserInformation build() {
            return new SpecialUserInformation(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private SpecialUserInformation(Builder builder) {
        super(builder);
        benefits = builder.benefits;
    }

}
