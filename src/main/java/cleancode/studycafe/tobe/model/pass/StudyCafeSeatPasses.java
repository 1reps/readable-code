package cleancode.studycafe.tobe.model.pass;

import java.util.List;

public class StudyCafeSeatPasses implements StudyCafePass {

    private final List<StudyCafeSeatPass> passes;

    public StudyCafeSeatPasses(List<StudyCafeSeatPass> passes) {
        this.passes = passes;
    }

    public static StudyCafeSeatPasses of(List<StudyCafeSeatPass> passes) {
        return new StudyCafeSeatPasses(passes);
    }

    public List<StudyCafeSeatPass> findPassBy(StudyCafePassType studyCafePassType) {
        return passes.stream()
            .filter(studyCafePass -> studyCafePass.isSamePassType(studyCafePassType))
            .toList();
    }

    @Override
    public StudyCafePassType getPassType() {
        return null;
    }

    @Override
    public int getDuration() {
        return 0;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
