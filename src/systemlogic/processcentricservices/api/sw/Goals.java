
package systemlogic.processcentricservices.api.sw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="goal" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idGoal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="signal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="measureDefinition">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="idMeasureDef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="measureName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="person">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="idPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "goal"
})
@XmlRootElement(name = "goals")
public class Goals {

    @XmlElement(nillable = true)
    protected List<Goals.Goal> goal;

    /**
     * Gets the value of the goal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Goals.Goal }
     * 
     * 
     */
    public List<Goals.Goal> getGoal() {
        if (goal == null) {
            goal = new ArrayList<Goals.Goal>();
        }
        return this.goal;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="idGoal" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="signal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="measureDefinition">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="idMeasureDef" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="measureName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="person">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="idPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "idGoal",
        "start",
        "end",
        "type",
        "signal",
        "value",
        "measureDefinition",
        "person"
    })
    public static class Goal {

        protected int idGoal;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar start;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar end;
        @XmlElement(required = true)
        protected String type;
        @XmlElement(required = true)
        protected String signal;
        protected float value;
        @XmlElement(required = true)
        protected Goals.Goal.MeasureDefinition measureDefinition;
        @XmlElement(required = true)
        protected Goals.Goal.Person person;

        /**
         * Gets the value of the idGoal property.
         * 
         */
        public int getIdGoal() {
            return idGoal;
        }

        /**
         * Sets the value of the idGoal property.
         * 
         */
        public void setIdGoal(int value) {
            this.idGoal = value;
        }

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStart(XMLGregorianCalendar value) {
            this.start = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEnd(XMLGregorianCalendar value) {
            this.end = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the signal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSignal() {
            return signal;
        }

        /**
         * Sets the value of the signal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSignal(String value) {
            this.signal = value;
        }

        /**
         * Gets the value of the value property.
         * 
         */
        public float getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(float value) {
            this.value = value;
        }

        /**
         * Gets the value of the measureDefinition property.
         * 
         * @return
         *     possible object is
         *     {@link Goals.Goal.MeasureDefinition }
         *     
         */
        public Goals.Goal.MeasureDefinition getMeasureDefinition() {
            return measureDefinition;
        }

        /**
         * Sets the value of the measureDefinition property.
         * 
         * @param value
         *     allowed object is
         *     {@link Goals.Goal.MeasureDefinition }
         *     
         */
        public void setMeasureDefinition(Goals.Goal.MeasureDefinition value) {
            this.measureDefinition = value;
        }

        /**
         * Gets the value of the person property.
         * 
         * @return
         *     possible object is
         *     {@link Goals.Goal.Person }
         *     
         */
        public Goals.Goal.Person getPerson() {
            return person;
        }

        /**
         * Sets the value of the person property.
         * 
         * @param value
         *     allowed object is
         *     {@link Goals.Goal.Person }
         *     
         */
        public void setPerson(Goals.Goal.Person value) {
            this.person = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="idMeasureDef" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="measureName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "idMeasureDef",
            "measureName"
        })
        public static class MeasureDefinition {

            protected int idMeasureDef;
            @XmlElement(required = true)
            protected String measureName;

            /**
             * Gets the value of the idMeasureDef property.
             * 
             */
            public int getIdMeasureDef() {
                return idMeasureDef;
            }

            /**
             * Sets the value of the idMeasureDef property.
             * 
             */
            public void setIdMeasureDef(int value) {
                this.idMeasureDef = value;
            }

            /**
             * Gets the value of the measureName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMeasureName() {
                return measureName;
            }

            /**
             * Sets the value of the measureName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMeasureName(String value) {
                this.measureName = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="idPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "idPerson",
            "firstname",
            "lastname"
        })
        public static class Person {

            protected int idPerson;
            @XmlElement(required = true)
            protected String firstname;
            @XmlElement(required = true)
            protected String lastname;

            /**
             * Gets the value of the idPerson property.
             * 
             */
            public int getIdPerson() {
                return idPerson;
            }

            /**
             * Sets the value of the idPerson property.
             * 
             */
            public void setIdPerson(int value) {
                this.idPerson = value;
            }

            /**
             * Gets the value of the firstname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstname() {
                return firstname;
            }

            /**
             * Sets the value of the firstname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstname(String value) {
                this.firstname = value;
            }

            /**
             * Gets the value of the lastname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastname() {
                return lastname;
            }

            /**
             * Sets the value of the lastname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastname(String value) {
                this.lastname = value;
            }

        }

    }

}
