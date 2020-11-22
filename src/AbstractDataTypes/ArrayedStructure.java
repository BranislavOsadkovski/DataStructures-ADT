package AbstractDataTypes;

import java.util.List;

import util.StructureIterator;

public interface ArrayedStructure<T> extends DataStructure {

    StructureIterator<T> toIterator();
    List<T> toJavaList();

    // next add toArray method @return array[]
}
