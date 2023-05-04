import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class ReinigerWriter extends FilterWriter {

    public ReinigerWriter(Writer out) {
        super(out);
    }

    @Override
    public Writer append(char c) throws IOException {
        if (c == '�') {
            return super.append("oe");
        } else if (c == '�') {
            return super.append("Oe");
        } else if (c == '�') {
            return super.append("ue");
        } else if (c == '�') {
            return super.append("Ue");
        } else if (c == '�') {
            return super.append("ae");
        } else if (c == '�') {
            return super.append("Ae");
        } else if (c == '�') {
            return super.append("ss");
        }
        return super.append(c);
    }

    @Override
    public Writer append(CharSequence csq) throws IOException {
        char[] test = csq.toString().toCharArray();
        for (char c : test) {
            append(c);
        }
        return null;
    }
}