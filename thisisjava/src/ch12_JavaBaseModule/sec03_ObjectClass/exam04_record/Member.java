package ch12_JavaBaseModule.sec03_ObjectClass.exam04_record;

public record Member(String id, String name, int age) {

}

// // record 사용 전
// public Member(){
// //필드 = > 읽기만 가능하도록 private final로 선언
// private final String id;
// private final String name;
// private final int age;

// public Member(String id, String name, int age) {
// this.id = id;
// this.name = name;
// this.age = age;
// }

// // getter
// public String id() {
// return id;
// }

// public String nema() {
// return name;
// }

// public int age() {
// return age;
// }

// @Override
// public int hashCode() {
// }

// @Override
// public boolean equals(Object obj) {

// }

// @Override
// public String toString() {
// }
// }
