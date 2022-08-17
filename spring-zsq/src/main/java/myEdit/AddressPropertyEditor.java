package myEdit;

import java.beans.PropertyEditorSupport;

    /**
     *  继承 PropretyEditorSuppor,编写自己的自定义编辑器
     *      1:覆写 setAsText方法：编辑属性
     *      2:调用setValue方法，设置属性
     */
public class AddressPropertyEditor  extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] split = text.split("-");
        Address address = new Address();
        address.setProvince(split[0]);
        address.setCity(split[1]);
        address.setTown(split[2]);
        this.setValue(address);
    }
}
