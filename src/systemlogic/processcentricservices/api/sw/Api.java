
package systemlogic.processcentricservices.api.sw;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Api", targetNamespace = "http://sw.api.processcentricservices.systemlogic/")
@XmlSeeAlso({
    systemlogic.processcentricservices.soap.sw.ObjectFactory.class,
    systemlogic.processcentricservices.api.sw.ObjectFactory.class
})
public interface Api {


    /**
     * 
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.DeletePersonResponse")
    @Action(input = "http://sw.api.processcentricservices.systemlogic/Api/deletePersonRequest", output = "http://sw.api.processcentricservices.systemlogic/Api/deletePersonResponse")
    public int deletePerson(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId);

    /**
     * 
     * @param personId
     * @param type
     * @return
     *     returns systemlogic.processcentricservices.api.sw.ReadPersonHistoryResponse.MeasureHistoryView
     */
    @WebMethod
    @WebResult(name = "MeasureHistoryView", targetNamespace = "")
    @RequestWrapper(localName = "readPersonHistory", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.ReadPersonHistory")
    @ResponseWrapper(localName = "readPersonHistoryResponse", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.ReadPersonHistoryResponse")
    @Action(input = "http://sw.api.processcentricservices.systemlogic/Api/readPersonHistoryRequest", output = "http://sw.api.processcentricservices.systemlogic/Api/readPersonHistoryResponse")
    public systemlogic.processcentricservices.api.sw.ReadPersonHistoryResponse.MeasureHistoryView readPersonHistory(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "type", targetNamespace = "")
        String type);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "measure", targetNamespace = "")
    @RequestWrapper(localName = "readMeasureTypes", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.ReadMeasureTypes")
    @ResponseWrapper(localName = "readMeasureTypesResponse", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.ReadMeasureTypesResponse")
    @Action(input = "http://sw.api.processcentricservices.systemlogic/Api/readMeasureTypesRequest", output = "http://sw.api.processcentricservices.systemlogic/Api/readMeasureTypesResponse")
    public List<String> readMeasureTypes();

    /**
     * 
     * @param measure
     * @param data
     * @param personId
     * @param value
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "measureHistory", targetNamespace = "")
    @RequestWrapper(localName = "savePersonMeasure", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.SavePersonMeasure")
    @ResponseWrapper(localName = "savePersonMeasureResponse", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.SavePersonMeasureResponse")
    @Action(input = "http://sw.api.processcentricservices.systemlogic/Api/savePersonMeasureRequest", output = "http://sw.api.processcentricservices.systemlogic/Api/savePersonMeasureResponse")
    public boolean savePersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "measure", targetNamespace = "")
        String measure,
        @WebParam(name = "value", targetNamespace = "")
        Float value,
        @WebParam(name = "data", targetNamespace = "")
        String data);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPersonList", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.ReadPersonList")
    @ResponseWrapper(localName = "readPersonListResponse", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.ReadPersonListResponse")
    @Action(input = "http://sw.api.processcentricservices.systemlogic/Api/readPersonListRequest", output = "http://sw.api.processcentricservices.systemlogic/Api/readPersonListResponse")
    public List<Integer> readPersonList();

    /**
     * 
     * @param personDto
     * @return
     *     returns java.lang.Long
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.CreatePersonResponse")
    @Action(input = "http://sw.api.processcentricservices.systemlogic/Api/createPersonRequest", output = "http://sw.api.processcentricservices.systemlogic/Api/createPersonResponse")
    public Long createPerson(
        @WebParam(name = "PersonDto", targetNamespace = "")
        systemlogic.processcentricservices.api.sw.CreatePerson.PersonDto personDto);

    /**
     * 
     * @param personId
     * @return
     *     returns systemlogic.processcentricservices.api.sw.ReadPersonResponse.PersonDto
     */
    @WebMethod
    @WebResult(name = "PersonDto", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.ReadPersonResponse")
    @Action(input = "http://sw.api.processcentricservices.systemlogic/Api/readPersonRequest", output = "http://sw.api.processcentricservices.systemlogic/Api/readPersonResponse")
    public systemlogic.processcentricservices.api.sw.ReadPersonResponse.PersonDto readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId);

    /**
     * 
     * @param personId
     * @param type
     * @param token
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "importMeasure", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.ImportMeasure")
    @ResponseWrapper(localName = "importMeasureResponse", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.ImportMeasureResponse")
    @Action(input = "http://sw.api.processcentricservices.systemlogic/Api/importMeasureRequest", output = "http://sw.api.processcentricservices.systemlogic/Api/importMeasureResponse")
    public boolean importMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "type", targetNamespace = "")
        String type);

    /**
     * 
     * @param personId
     * @return
     *     returns systemlogic.processcentricservices.api.sw.GetGoalsResponse.Goals
     */
    @WebMethod
    @WebResult(name = "Goals", targetNamespace = "")
    @RequestWrapper(localName = "getGoals", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.GetGoals")
    @ResponseWrapper(localName = "getGoalsResponse", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.GetGoalsResponse")
    @Action(input = "http://sw.api.processcentricservices.systemlogic/Api/getGoalsRequest", output = "http://sw.api.processcentricservices.systemlogic/Api/getGoalsResponse")
    public systemlogic.processcentricservices.api.sw.GetGoalsResponse.Goals getGoals(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId);

    /**
     * 
     * @param goalID
     * @return
     *     returns systemlogic.processcentricservices.api.sw.GetGoalValitationResponse.Goalview
     */
    @WebMethod
    @WebResult(name = "Goalview", targetNamespace = "")
    @RequestWrapper(localName = "getGoalValitation", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.GetGoalValitation")
    @ResponseWrapper(localName = "getGoalValitationResponse", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.GetGoalValitationResponse")
    @Action(input = "http://sw.api.processcentricservices.systemlogic/Api/getGoalValitationRequest", output = "http://sw.api.processcentricservices.systemlogic/Api/getGoalValitationResponse")
    public systemlogic.processcentricservices.api.sw.GetGoalValitationResponse.Goalview getGoalValitation(
        @WebParam(name = "goalID", targetNamespace = "")
        Long goalID);

    /**
     * 
     * @param measure
     * @param dataend
     * @param datastart
     * @param personID
     * @param type
     * @param signal
     * @param value
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "Goalview", targetNamespace = "")
    @RequestWrapper(localName = "saveGoal", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.SaveGoal")
    @ResponseWrapper(localName = "saveGoalResponse", targetNamespace = "http://sw.api.processcentricservices.systemlogic/", className = "systemlogic.processcentricservices.api.sw.SaveGoalResponse")
    @Action(input = "http://sw.api.processcentricservices.systemlogic/Api/saveGoalRequest", output = "http://sw.api.processcentricservices.systemlogic/Api/saveGoalResponse")
    public boolean saveGoal(
        @WebParam(name = "personID", targetNamespace = "")
        Long personID,
        @WebParam(name = "measure", targetNamespace = "")
        String measure,
        @WebParam(name = "datastart", targetNamespace = "")
        String datastart,
        @WebParam(name = "dataend", targetNamespace = "")
        String dataend,
        @WebParam(name = "type", targetNamespace = "")
        String type,
        @WebParam(name = "signal", targetNamespace = "")
        String signal,
        @WebParam(name = "value", targetNamespace = "")
        String value);

}
