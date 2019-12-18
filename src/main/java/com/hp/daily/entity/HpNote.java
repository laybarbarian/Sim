package com.hp.daily.entity;

import java.util.Date;
import java.util.List;

public class HpNote {

    public HpNote(String note) {
        this.note = note;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hp_note.id
     *
     * @mbggenerated Wed Oct 30 14:42:04 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hp_note.date
     *
     * @mbggenerated Wed Oct 30 14:42:04 CST 2019
     */
    private Date date;

    public HpNote() {
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hp_note.time
     *
     * @mbggenerated Wed Oct 30 14:42:04 CST 2019
     */
    private Date time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hp_note.note
     *
     * @mbggenerated Wed Oct 30 14:42:04 CST 2019
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hp_note.id
     *
     * @return the value of hp_note.id
     *
     * @mbggenerated Wed Oct 30 14:42:04 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hp_note.id
     *
     * @param id the value for hp_note.id
     *
     * @mbggenerated Wed Oct 30 14:42:04 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hp_note.date
     *
     * @return the value of hp_note.date
     *
     * @mbggenerated Wed Oct 30 14:42:04 CST 2019
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hp_note.date
     *
     * @param date the value for hp_note.date
     *
     * @mbggenerated Wed Oct 30 14:42:04 CST 2019
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hp_note.time
     *
     * @return the value of hp_note.time
     *
     * @mbggenerated Wed Oct 30 14:42:04 CST 2019
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hp_note.time
     *
     * @param time the value for hp_note.time
     *
     * @mbggenerated Wed Oct 30 14:42:04 CST 2019
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hp_note.note
     *
     * @return the value of hp_note.note
     *
     * @mbggenerated Wed Oct 30 14:42:04 CST 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hp_note.note
     *
     * @param note the value for hp_note.note
     *
     * @mbggenerated Wed Oct 30 14:42:04 CST 2019
     */
    public void setNote(String note) {
        this.note = note;
    }
}