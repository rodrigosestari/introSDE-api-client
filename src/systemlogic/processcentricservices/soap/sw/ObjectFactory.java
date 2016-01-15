
package systemlogic.processcentricservices.soap.sw;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the systemlogic.processcentricservices.soap.sw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: systemlogic.processcentricservices.soap.sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MeasureHistory }
     * 
     */
    public MeasureHistory createMeasureHistory() {
        return new MeasureHistory();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Person.HealthProfile }
     * 
     */
    public Person.HealthProfile createPersonHealthProfile() {
        return new Person.HealthProfile();
    }

    /**
     * Create an instance of {@link MeasureHistory.Measure }
     * 
     */
    public MeasureHistory.Measure createMeasureHistoryMeasure() {
        return new MeasureHistory.Measure();
    }

    /**
     * Create an instance of {@link Person.HealthProfile.MeasureType }
     * 
     */
    public Person.HealthProfile.MeasureType createPersonHealthProfileMeasureType() {
        return new Person.HealthProfile.MeasureType();
    }

}
