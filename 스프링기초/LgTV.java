package com.company.couplingtest;

public class LgTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("===> LgTV������ �Ҵ�");
		
	}

	@Override
	public void powerOff() {
		System.out.println("===> LgTV������ ����");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("===> LgTV�ҷ��� �ø���");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("===> LgTV�ҷ��� ������");		
	}

}
