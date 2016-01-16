
package systemlogic.processcentricservices.api.sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the systemlogic.processcentricservices.api.sw package. 
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

    private final static QName _ReadMeasureTypes_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "readMeasureTypes");
    private final static QName _CreatePerson_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "createPerson");
    private final static QName _GetGoalValitation_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "getGoalValitation");
    private final static QName _ReadMeasureTypesResponse_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "readMeasureTypesResponse");
    private final static QName _SavePersonMeasure_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "savePersonMeasure");
    private final static QName _SavePersonMeasureResponse_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "savePersonMeasureResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "deletePerson");
    private final static QName _SaveGoal_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "saveGoal");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "createPersonResponse");
    private final static QName _GetGoalValitationResponse_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "getGoalValitationResponse");
    private final static QName _GetGoalsResponse_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "getGoalsResponse");
    private final static QName _SaveGoalResponse_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "saveGoalResponse");
    private final static QName _ImportMeasure_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "importMeasure");
    private final static QName _ReadPerson_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "readPerson");
    private final static QName _GetGoals_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "getGoals");
    private final static QName _ReadPersonList_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "readPersonList");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "deletePersonResponse");
    private final static QName _ReadPersonHistory_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "readPersonHistory");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "readPersonResponse");
    private final static QName _ReadPersonHistoryResponse_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "readPersonHistoryResponse");
    private final static QName _ReadPersonListResponse_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "readPersonListResponse");
    private final static QName _ImportMeasureResponse_QNAME = new QName("http://sw.api.processcentricservices.systemlogic/", "importMeasureResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: systemlogic.processcentricservices.api.sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link systemlogic.processcentricservices.api.sw.Goalview }
     * 
     */
    public systemlogic.processcentricservices.api.sw.Goalview createGoalview() {
        return new systemlogic.processcentricservices.api.sw.Goalview();
    }

    /**
     * Create an instance of {@link systemlogic.processcentricservices.api.sw.Goals }
     * 
     */
    public systemlogic.processcentricservices.api.sw.Goals createGoals() {
        return new systemlogic.processcentricservices.api.sw.Goals();
    }

    /**
     * Create an instance of {@link systemlogic.processcentricservices.api.sw.Goals.Goal }
     * 
     */
    public systemlogic.processcentricservices.api.sw.Goals.Goal createGoalsGoal() {
        return new systemlogic.processcentricservices.api.sw.Goals.Goal();
    }

    /**
     * Create an instance of {@link GetGoalValitationResponse }
     * 
     */
    public GetGoalValitationResponse createGetGoalValitationResponse() {
        return new GetGoalValitationResponse();
    }

    /**
     * Create an instance of {@link GetGoalValitationResponse.Goalview }
     * 
     */
    public GetGoalValitationResponse.Goalview createGetGoalValitationResponseGoalview() {
        return new GetGoalValitationResponse.Goalview();
    }

    /**
     * Create an instance of {@link GetGoalValitationResponse.Goalview.Goaltype }
     * 
     */
    public GetGoalValitationResponse.Goalview.Goaltype createGetGoalValitationResponseGoalviewGoaltype() {
        return new GetGoalValitationResponse.Goalview.Goaltype();
    }

    /**
     * Create an instance of {@link GetGoalsResponse }
     * 
     */
    public GetGoalsResponse createGetGoalsResponse() {
        return new GetGoalsResponse();
    }

    /**
     * Create an instance of {@link GetGoalsResponse.Goals }
     * 
     */
    public GetGoalsResponse.Goals createGetGoalsResponseGoals() {
        return new GetGoalsResponse.Goals();
    }

    /**
     * Create an instance of {@link GetGoalsResponse.Goals.Goal }
     * 
     */
    public GetGoalsResponse.Goals.Goal createGetGoalsResponseGoalsGoal() {
        return new GetGoalsResponse.Goals.Goal();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonResponse.PersonDto }
     * 
     */
    public ReadPersonResponse.PersonDto createReadPersonResponsePersonDto() {
        return new ReadPersonResponse.PersonDto();
    }

    /**
     * Create an instance of {@link ReadPersonResponse.PersonDto.HealthProfile }
     * 
     */
    public ReadPersonResponse.PersonDto.HealthProfile createReadPersonResponsePersonDtoHealthProfile() {
        return new ReadPersonResponse.PersonDto.HealthProfile();
    }

    /**
     * Create an instance of {@link ReadPersonHistoryResponse }
     * 
     */
    public ReadPersonHistoryResponse createReadPersonHistoryResponse() {
        return new ReadPersonHistoryResponse();
    }

    /**
     * Create an instance of {@link ReadPersonHistoryResponse.MeasureHistoryView }
     * 
     */
    public ReadPersonHistoryResponse.MeasureHistoryView createReadPersonHistoryResponseMeasureHistoryView() {
        return new ReadPersonHistoryResponse.MeasureHistoryView();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link CreatePerson.PersonDto }
     * 
     */
    public CreatePerson.PersonDto createCreatePersonPersonDto() {
        return new CreatePerson.PersonDto();
    }

    /**
     * Create an instance of {@link CreatePerson.PersonDto.HealthProfile }
     * 
     */
    public CreatePerson.PersonDto.HealthProfile createCreatePersonPersonDtoHealthProfile() {
        return new CreatePerson.PersonDto.HealthProfile();
    }

    /**
     * Create an instance of {@link systemlogic.processcentricservices.api.sw.Goalview.Goaltype }
     * 
     */
    public systemlogic.processcentricservices.api.sw.Goalview.Goaltype createGoalviewGoaltype() {
        return new systemlogic.processcentricservices.api.sw.Goalview.Goaltype();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link SaveGoal }
     * 
     */
    public SaveGoal createSaveGoal() {
        return new SaveGoal();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link systemlogic.processcentricservices.api.sw.Goalview.Goals }
     * 
     */
    public systemlogic.processcentricservices.api.sw.Goalview.Goals createGoalviewGoals() {
        return new systemlogic.processcentricservices.api.sw.Goalview.Goals();
    }

    /**
     * Create an instance of {@link ReadMeasureTypesResponse }
     * 
     */
    public ReadMeasureTypesResponse createReadMeasureTypesResponse() {
        return new ReadMeasureTypesResponse();
    }

    /**
     * Create an instance of {@link SavePersonMeasure }
     * 
     */
    public SavePersonMeasure createSavePersonMeasure() {
        return new SavePersonMeasure();
    }

    /**
     * Create an instance of {@link SavePersonMeasureResponse }
     * 
     */
    public SavePersonMeasureResponse createSavePersonMeasureResponse() {
        return new SavePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link GetGoalValitation }
     * 
     */
    public GetGoalValitation createGetGoalValitation() {
        return new GetGoalValitation();
    }

    /**
     * Create an instance of {@link ReadMeasureTypes }
     * 
     */
    public ReadMeasureTypes createReadMeasureTypes() {
        return new ReadMeasureTypes();
    }

    /**
     * Create an instance of {@link ReadPersonListResponse }
     * 
     */
    public ReadPersonListResponse createReadPersonListResponse() {
        return new ReadPersonListResponse();
    }

    /**
     * Create an instance of {@link ImportMeasureResponse }
     * 
     */
    public ImportMeasureResponse createImportMeasureResponse() {
        return new ImportMeasureResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonHistory }
     * 
     */
    public ReadPersonHistory createReadPersonHistory() {
        return new ReadPersonHistory();
    }

    /**
     * Create an instance of {@link ReadPersonList }
     * 
     */
    public ReadPersonList createReadPersonList() {
        return new ReadPersonList();
    }

    /**
     * Create an instance of {@link ImportMeasure }
     * 
     */
    public ImportMeasure createImportMeasure() {
        return new ImportMeasure();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link GetGoals }
     * 
     */
    public GetGoals createGetGoals() {
        return new GetGoals();
    }

    /**
     * Create an instance of {@link SaveGoalResponse }
     * 
     */
    public SaveGoalResponse createSaveGoalResponse() {
        return new SaveGoalResponse();
    }

    /**
     * Create an instance of {@link systemlogic.processcentricservices.api.sw.Goals.Goal.MeasureDefinition }
     * 
     */
    public systemlogic.processcentricservices.api.sw.Goals.Goal.MeasureDefinition createGoalsGoalMeasureDefinition() {
        return new systemlogic.processcentricservices.api.sw.Goals.Goal.MeasureDefinition();
    }

    /**
     * Create an instance of {@link systemlogic.processcentricservices.api.sw.Goals.Goal.Person }
     * 
     */
    public systemlogic.processcentricservices.api.sw.Goals.Goal.Person createGoalsGoalPerson() {
        return new systemlogic.processcentricservices.api.sw.Goals.Goal.Person();
    }

    /**
     * Create an instance of {@link GetGoalValitationResponse.Goalview.Goals }
     * 
     */
    public GetGoalValitationResponse.Goalview.Goals createGetGoalValitationResponseGoalviewGoals() {
        return new GetGoalValitationResponse.Goalview.Goals();
    }

    /**
     * Create an instance of {@link GetGoalValitationResponse.Goalview.Goaltype.MeasureDefinition }
     * 
     */
    public GetGoalValitationResponse.Goalview.Goaltype.MeasureDefinition createGetGoalValitationResponseGoalviewGoaltypeMeasureDefinition() {
        return new GetGoalValitationResponse.Goalview.Goaltype.MeasureDefinition();
    }

    /**
     * Create an instance of {@link GetGoalValitationResponse.Goalview.Goaltype.Person }
     * 
     */
    public GetGoalValitationResponse.Goalview.Goaltype.Person createGetGoalValitationResponseGoalviewGoaltypePerson() {
        return new GetGoalValitationResponse.Goalview.Goaltype.Person();
    }

    /**
     * Create an instance of {@link GetGoalsResponse.Goals.Goal.MeasureDefinition }
     * 
     */
    public GetGoalsResponse.Goals.Goal.MeasureDefinition createGetGoalsResponseGoalsGoalMeasureDefinition() {
        return new GetGoalsResponse.Goals.Goal.MeasureDefinition();
    }

    /**
     * Create an instance of {@link GetGoalsResponse.Goals.Goal.Person }
     * 
     */
    public GetGoalsResponse.Goals.Goal.Person createGetGoalsResponseGoalsGoalPerson() {
        return new GetGoalsResponse.Goals.Goal.Person();
    }

    /**
     * Create an instance of {@link ReadPersonResponse.PersonDto.HealthProfile.MeasureType }
     * 
     */
    public ReadPersonResponse.PersonDto.HealthProfile.MeasureType createReadPersonResponsePersonDtoHealthProfileMeasureType() {
        return new ReadPersonResponse.PersonDto.HealthProfile.MeasureType();
    }

    /**
     * Create an instance of {@link ReadPersonHistoryResponse.MeasureHistoryView.Measure }
     * 
     */
    public ReadPersonHistoryResponse.MeasureHistoryView.Measure createReadPersonHistoryResponseMeasureHistoryViewMeasure() {
        return new ReadPersonHistoryResponse.MeasureHistoryView.Measure();
    }

    /**
     * Create an instance of {@link CreatePerson.PersonDto.HealthProfile.MeasureType }
     * 
     */
    public CreatePerson.PersonDto.HealthProfile.MeasureType createCreatePersonPersonDtoHealthProfileMeasureType() {
        return new CreatePerson.PersonDto.HealthProfile.MeasureType();
    }

    /**
     * Create an instance of {@link systemlogic.processcentricservices.api.sw.Goalview.Goaltype.MeasureDefinition }
     * 
     */
    public systemlogic.processcentricservices.api.sw.Goalview.Goaltype.MeasureDefinition createGoalviewGoaltypeMeasureDefinition() {
        return new systemlogic.processcentricservices.api.sw.Goalview.Goaltype.MeasureDefinition();
    }

    /**
     * Create an instance of {@link systemlogic.processcentricservices.api.sw.Goalview.Goaltype.Person }
     * 
     */
    public systemlogic.processcentricservices.api.sw.Goalview.Goaltype.Person createGoalviewGoaltypePerson() {
        return new systemlogic.processcentricservices.api.sw.Goalview.Goaltype.Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "readMeasureTypes")
    public JAXBElement<ReadMeasureTypes> createReadMeasureTypes(ReadMeasureTypes value) {
        return new JAXBElement<ReadMeasureTypes>(_ReadMeasureTypes_QNAME, ReadMeasureTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalValitation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "getGoalValitation")
    public JAXBElement<GetGoalValitation> createGetGoalValitation(GetGoalValitation value) {
        return new JAXBElement<GetGoalValitation>(_GetGoalValitation_QNAME, GetGoalValitation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "readMeasureTypesResponse")
    public JAXBElement<ReadMeasureTypesResponse> createReadMeasureTypesResponse(ReadMeasureTypesResponse value) {
        return new JAXBElement<ReadMeasureTypesResponse>(_ReadMeasureTypesResponse_QNAME, ReadMeasureTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "savePersonMeasure")
    public JAXBElement<SavePersonMeasure> createSavePersonMeasure(SavePersonMeasure value) {
        return new JAXBElement<SavePersonMeasure>(_SavePersonMeasure_QNAME, SavePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "savePersonMeasureResponse")
    public JAXBElement<SavePersonMeasureResponse> createSavePersonMeasureResponse(SavePersonMeasureResponse value) {
        return new JAXBElement<SavePersonMeasureResponse>(_SavePersonMeasureResponse_QNAME, SavePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "saveGoal")
    public JAXBElement<SaveGoal> createSaveGoal(SaveGoal value) {
        return new JAXBElement<SaveGoal>(_SaveGoal_QNAME, SaveGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalValitationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "getGoalValitationResponse")
    public JAXBElement<GetGoalValitationResponse> createGetGoalValitationResponse(GetGoalValitationResponse value) {
        return new JAXBElement<GetGoalValitationResponse>(_GetGoalValitationResponse_QNAME, GetGoalValitationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "getGoalsResponse")
    public JAXBElement<GetGoalsResponse> createGetGoalsResponse(GetGoalsResponse value) {
        return new JAXBElement<GetGoalsResponse>(_GetGoalsResponse_QNAME, GetGoalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "saveGoalResponse")
    public JAXBElement<SaveGoalResponse> createSaveGoalResponse(SaveGoalResponse value) {
        return new JAXBElement<SaveGoalResponse>(_SaveGoalResponse_QNAME, SaveGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "importMeasure")
    public JAXBElement<ImportMeasure> createImportMeasure(ImportMeasure value) {
        return new JAXBElement<ImportMeasure>(_ImportMeasure_QNAME, ImportMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "getGoals")
    public JAXBElement<GetGoals> createGetGoals(GetGoals value) {
        return new JAXBElement<GetGoals>(_GetGoals_QNAME, GetGoals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "readPersonList")
    public JAXBElement<ReadPersonList> createReadPersonList(ReadPersonList value) {
        return new JAXBElement<ReadPersonList>(_ReadPersonList_QNAME, ReadPersonList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "readPersonHistory")
    public JAXBElement<ReadPersonHistory> createReadPersonHistory(ReadPersonHistory value) {
        return new JAXBElement<ReadPersonHistory>(_ReadPersonHistory_QNAME, ReadPersonHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "readPersonHistoryResponse")
    public JAXBElement<ReadPersonHistoryResponse> createReadPersonHistoryResponse(ReadPersonHistoryResponse value) {
        return new JAXBElement<ReadPersonHistoryResponse>(_ReadPersonHistoryResponse_QNAME, ReadPersonHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "readPersonListResponse")
    public JAXBElement<ReadPersonListResponse> createReadPersonListResponse(ReadPersonListResponse value) {
        return new JAXBElement<ReadPersonListResponse>(_ReadPersonListResponse_QNAME, ReadPersonListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.api.processcentricservices.systemlogic/", name = "importMeasureResponse")
    public JAXBElement<ImportMeasureResponse> createImportMeasureResponse(ImportMeasureResponse value) {
        return new JAXBElement<ImportMeasureResponse>(_ImportMeasureResponse_QNAME, ImportMeasureResponse.class, null, value);
    }

}
