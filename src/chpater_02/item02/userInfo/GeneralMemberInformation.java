package chpater_02.item02.userInfo;

import java.util.Objects;

public class GeneralMemberInformation extends UserInformationManagement{
    public enum PeriodOfUse{ONE_MONTH,TREE_MONTH,SIX_MONTH,ONE_YEAR}
    private final PeriodOfUse periodOfUse;

    public static class Builder extends UserInformationManagement.Builder<Builder>{
        private final PeriodOfUse periodOfUse;

        public Builder(PeriodOfUse periodOfUse) {
            this.periodOfUse = Objects.requireNonNull(periodOfUse);
        }

        @Override public GeneralMemberInformation build() {
            return new GeneralMemberInformation(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }


    private GeneralMemberInformation(Builder builder) {
        super(builder);
        periodOfUse = builder.periodOfUse;
    }
}
