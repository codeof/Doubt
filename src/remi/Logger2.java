package remi;

public interface Logger2 {
    public void log(Level level, String message);
    default Logger Level(Level level)
    {
        return message->log(level,message);
    }
}
