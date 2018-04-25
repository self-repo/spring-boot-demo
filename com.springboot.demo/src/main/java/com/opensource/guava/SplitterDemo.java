package com.opensource.guava;

import com.google.common.base.Splitter;

public class SplitterDemo {

	public static void main(String[] args) {

		/*
        on():ָ���ָ������ָ��ַ���
        limit():���ָ�����ַ����ﵽ��limit��ʱ��ֹͣ�ָ�
        fixedLength():���ݳ���������ַ���
        trimResults():ȥ���Ӵ��еĿո�
        omitEmptyStrings():ȥ���յ��Ӵ�
        withKeyValueSeparator():Ҫ�ָ���ַ�����key��value��ķָ���,�ָ����Ӵ���key��value��ķָ���Ĭ����=
       */
      System.out.println(Splitter.on(",").limit(3).trimResults().split(" a,  b,  c,  d"));//[ a, b, c,d]
      System.out.println(Splitter.fixedLength(3).split("1 2 3"));//[1 2,  3]
      System.out.println(Splitter.on(" ").omitEmptyStrings().splitToList("1  2 3"));
      System.out.println(Splitter.on(",").omitEmptyStrings().split("1,,,,2,,,3"));//[1, 2, 3]
      System.out.println(Splitter.on(" ").trimResults().split("1 2 3")); //[1, 2, 3],Ĭ�ϵ����ӷ���,
      System.out.println(Splitter.on(";").withKeyValueSeparator(":").split("a:1;b:2;c:3"));//{a=1, b=2, c=3}
	}

}
