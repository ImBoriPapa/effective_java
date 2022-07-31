package chpater_02.item07.references;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;


public class UseReference {
    public static void main(String[] args) {

        StrongReference strongReference = new StrongReference();

        SoftReference softReference = new SoftReference(strongReference);

        WeakReference weakReference = new WeakReference(strongReference);

        ReferenceQueue<Object> oq = new ReferenceQueue<>();
    }
}
