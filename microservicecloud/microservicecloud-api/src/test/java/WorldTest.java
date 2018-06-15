import org.ictclas4j.bean.Atom;
import org.ictclas4j.segment.AtomSeg;
import java.util.List;

/**
 * @描述:
 * @author: zf
 * @创建: 2018/6/14-10:46;
 * @版本: V1.0
 **/
public class WorldTest {

    public static void main(String[] args) {
        String string = "中国是个神奇的世界";
        AtomSeg sentenceSeg = new AtomSeg(string);
        List<Atom> atoms = sentenceSeg.getAtoms();
        for (Atom atom:atoms) {
            System.out.println(atom.toString());
        }

    }
}
