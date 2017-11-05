package cqjsdk.msg;

final public class ServerHelloMsg extends Msg{
    protected final String client_timeout;
    protected final String prefix_size;
    protected final String payload_szie;
    protected final String frame_size;
    public ServerHelloMsg(byte[] bytes, Integer len){
        String[] frag = new String(bytes,0,len).split(" ");
        this.prefix = frag[0];
        this.client_timeout = frag[1];
        this.prefix_size = frag[2];
        this.payload_szie = frag[3];
        this.frame_size = frag[4];
    }

    public String getClient_timeout() {
        return client_timeout;
    }

    public String getPrefix_size() {
        return prefix_size;
    }

    public String getPayload_szie() {
        return payload_szie;
    }

    public String getFrame_size() {
        return frame_size;
    }

    @Override
    public String toString() {
        return this.prefix + " " + this.client_timeout + " " + this.prefix_size + " " + this.payload_szie + " " + this.frame_size;
    }
}