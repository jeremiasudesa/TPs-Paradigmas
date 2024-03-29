package MarsRover;

public class Right extends Command {

    @Override
    public boolean canHandle(Character c) {
        return c == 'r';
    }

    @Override
    public void run(MarsRoverState state) {
        state.setDirection(state.direction().rightDirection());
    }

}
