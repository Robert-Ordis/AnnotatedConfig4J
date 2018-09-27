package info.ro.gadget.configurator.core.instance.setter;

import java.lang.reflect.Member;

import info.ro.gadget.configurator.core.AnnotatedConfig;
import info.ro.gadget.configurator.core.annotation.Constraint;

public interface MemberSetter {
	public void setConstraint(Constraint c);
	public void putValueInside(AnnotatedConfig conf, Member member, String name, Object value, String comment) throws Exception;
	public void putValue(AnnotatedConfig conf, String name, String value, String comment) throws Exception;
	public String getName();
	public boolean isSplitNeeded();
	public Member getMember();
}