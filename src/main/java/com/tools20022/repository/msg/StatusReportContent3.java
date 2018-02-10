/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AttendanceContext1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.PointOfInteraction;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Content of the status report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReportContent3#mmPOICapabilities
 * StatusReportContent3.mmPOICapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReportContent3#mmPOIComponent
 * StatusReportContent3.mmPOIComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReportContent3#mmAttendanceContext
 * StatusReportContent3.mmAttendanceContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReportContent3#mmPOIDateTime
 * StatusReportContent3.mmPOIDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReportContent3#mmDataSetRequired
 * StatusReportContent3.mmDataSetRequired}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReportContent3#mmEvent
 * StatusReportContent3.mmEvent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReportContent3#mmErrors
 * StatusReportContent3.mmErrors}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusReportContent3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Content of the status report."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReportContent4
 * StatusReportContent4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.StatusReportContent2
 * StatusReportContent2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatusReportContent3", propOrder = {"pOICapabilities", "pOIComponent", "attendanceContext", "pOIDateTime", "dataSetRequired", "event", "errors"})
public class StatusReportContent3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "POICpblties")
	protected PointOfInteractionCapabilities2 pOICapabilities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2
	 * PointOfInteractionCapabilities2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent3
	 * StatusReportContent3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POICpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POICapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Capabilities of the POI (Point Of Interaction) performing the status report."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent4#mmPOICapabilities
	 * StatusReportContent4.mmPOICapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent2#mmPOICapabilities
	 * StatusReportContent2.mmPOICapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPOICapabilities = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PointOfInteraction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportContent3.mmObject();
			isDerived = false;
			xmlTag = "POICpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POICapabilities";
			definition = "Capabilities of the POI (Point Of Interaction) performing the status report.";
			nextVersions_lazy = () -> Arrays.asList(StatusReportContent4.mmPOICapabilities);
			previousVersion_lazy = () -> StatusReportContent2.mmPOICapabilities;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities2.mmObject();
		}
	};
	@XmlElement(name = "POICmpnt")
	protected List<com.tools20022.repository.msg.PointOfInteractionComponent4> pOIComponent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent4
	 * PointOfInteractionComponent4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmComponent
	 * PointOfInteraction.mmComponent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent3
	 * StatusReportContent3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POICmpnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to a component of the POI (Point Of Interaction) performing the status report."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent4#mmPOIComponent
	 * StatusReportContent4.mmPOIComponent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent2#mmPOIComponent
	 * StatusReportContent2.mmPOIComponent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPOIComponent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmComponent;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportContent3.mmObject();
			isDerived = false;
			xmlTag = "POICmpnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIComponent";
			definition = "Data related to a component of the POI (Point Of Interaction) performing the status report.";
			nextVersions_lazy = () -> Arrays.asList(StatusReportContent4.mmPOIComponent);
			previousVersion_lazy = () -> StatusReportContent2.mmPOIComponent;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponent4.mmObject();
		}
	};
	@XmlElement(name = "AttndncCntxt")
	protected AttendanceContext1Code attendanceContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContext1Code
	 * AttendanceContext1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmAttendanceContext
	 * CardPaymentAcquiring.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent3
	 * StatusReportContent3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Human attendance at the POI (Point Of Interaction) location during transactions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent4#mmAttendanceContext
	 * StatusReportContent4.mmAttendanceContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent2#mmAttendanceContext
	 * StatusReportContent2.mmAttendanceContext}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAttendanceContext = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmAttendanceContext;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportContent3.mmObject();
			isDerived = false;
			xmlTag = "AttndncCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceContext";
			definition = "Human attendance at the POI (Point Of Interaction) location during transactions.";
			nextVersions_lazy = () -> Arrays.asList(StatusReportContent4.mmAttendanceContext);
			previousVersion_lazy = () -> StatusReportContent2.mmAttendanceContext;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AttendanceContext1Code.mmObject();
		}
	};
	@XmlElement(name = "POIDtTm", required = true)
	protected ISODateTime pOIDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent3
	 * StatusReportContent3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System date time of the point of interaction (POI) sending the status report."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent4#mmPOIDateTime
	 * StatusReportContent4.mmPOIDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent2#mmPOIDateTime
	 * StatusReportContent2.mmPOIDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPOIDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportContent3.mmObject();
			isDerived = false;
			xmlTag = "POIDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIDateTime";
			definition = "System date time of the point of interaction (POI) sending the status report.";
			nextVersions_lazy = () -> Arrays.asList(StatusReportContent4.mmPOIDateTime);
			previousVersion_lazy = () -> StatusReportContent2.mmPOIDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "DataSetReqrd")
	protected TerminalManagementDataSet8 dataSetRequired;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet8
	 * TerminalManagementDataSet8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent3
	 * StatusReportContent3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetReqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request the terminal management system to answer with the identified data set."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent4#mmDataSetRequired
	 * StatusReportContent4.mmDataSetRequired}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent2#mmDataSetRequired
	 * StatusReportContent2.mmDataSetRequired}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSetRequired = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportContent3.mmObject();
			isDerived = false;
			xmlTag = "DataSetReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetRequired";
			definition = "Request the terminal management system to answer with the identified data set.";
			nextVersions_lazy = () -> Arrays.asList(StatusReportContent4.mmDataSetRequired);
			previousVersion_lazy = () -> StatusReportContent2.mmDataSetRequired;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet8.mmObject();
		}
	};
	@XmlElement(name = "Evt")
	protected List<com.tools20022.repository.msg.TMSEvent2> event;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TMSEvent2 TMSEvent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent3
	 * StatusReportContent3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Evt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Event"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of an individual terminal management action by the point of interaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent4#mmEvent
	 * StatusReportContent4.mmEvent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent2#mmEvent
	 * StatusReportContent2.mmEvent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEvent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportContent3.mmObject();
			isDerived = false;
			xmlTag = "Evt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Event";
			definition = "Result of an individual terminal management action by the point of interaction.";
			nextVersions_lazy = () -> Arrays.asList(StatusReportContent4.mmEvent);
			previousVersion_lazy = () -> StatusReportContent2.mmEvent;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TMSEvent2.mmObject();
		}
	};
	@XmlElement(name = "Errs")
	protected List<Max140Text> errors;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent3
	 * StatusReportContent3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Errs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Errors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Error log of the point of interaction since the last status report."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent4#mmErrors
	 * StatusReportContent4.mmErrors}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent2#mmErrors
	 * StatusReportContent2.mmErrors}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmErrors = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportContent3.mmObject();
			isDerived = false;
			xmlTag = "Errs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Errors";
			definition = "Error log of the point of interaction since the last status report.";
			nextVersions_lazy = () -> Arrays.asList(StatusReportContent4.mmErrors);
			previousVersion_lazy = () -> StatusReportContent2.mmErrors;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusReportContent3.mmPOICapabilities, com.tools20022.repository.msg.StatusReportContent3.mmPOIComponent,
						com.tools20022.repository.msg.StatusReportContent3.mmAttendanceContext, com.tools20022.repository.msg.StatusReportContent3.mmPOIDateTime, com.tools20022.repository.msg.StatusReportContent3.mmDataSetRequired,
						com.tools20022.repository.msg.StatusReportContent3.mmEvent, com.tools20022.repository.msg.StatusReportContent3.mmErrors);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusReportContent3";
				definition = "Content of the status report.";
				nextVersions_lazy = () -> Arrays.asList(StatusReportContent4.mmObject());
				previousVersion_lazy = () -> StatusReportContent2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PointOfInteractionCapabilities2> getPOICapabilities() {
		return pOICapabilities == null ? Optional.empty() : Optional.of(pOICapabilities);
	}

	public StatusReportContent3 setPOICapabilities(com.tools20022.repository.msg.PointOfInteractionCapabilities2 pOICapabilities) {
		this.pOICapabilities = pOICapabilities;
		return this;
	}

	public List<PointOfInteractionComponent4> getPOIComponent() {
		return pOIComponent == null ? pOIComponent = new ArrayList<>() : pOIComponent;
	}

	public StatusReportContent3 setPOIComponent(List<com.tools20022.repository.msg.PointOfInteractionComponent4> pOIComponent) {
		this.pOIComponent = Objects.requireNonNull(pOIComponent);
		return this;
	}

	public Optional<AttendanceContext1Code> getAttendanceContext() {
		return attendanceContext == null ? Optional.empty() : Optional.of(attendanceContext);
	}

	public StatusReportContent3 setAttendanceContext(AttendanceContext1Code attendanceContext) {
		this.attendanceContext = attendanceContext;
		return this;
	}

	public ISODateTime getPOIDateTime() {
		return pOIDateTime;
	}

	public StatusReportContent3 setPOIDateTime(ISODateTime pOIDateTime) {
		this.pOIDateTime = Objects.requireNonNull(pOIDateTime);
		return this;
	}

	public Optional<TerminalManagementDataSet8> getDataSetRequired() {
		return dataSetRequired == null ? Optional.empty() : Optional.of(dataSetRequired);
	}

	public StatusReportContent3 setDataSetRequired(com.tools20022.repository.msg.TerminalManagementDataSet8 dataSetRequired) {
		this.dataSetRequired = dataSetRequired;
		return this;
	}

	public List<TMSEvent2> getEvent() {
		return event == null ? event = new ArrayList<>() : event;
	}

	public StatusReportContent3 setEvent(List<com.tools20022.repository.msg.TMSEvent2> event) {
		this.event = Objects.requireNonNull(event);
		return this;
	}

	public List<Max140Text> getErrors() {
		return errors == null ? errors = new ArrayList<>() : errors;
	}

	public StatusReportContent3 setErrors(List<Max140Text> errors) {
		this.errors = Objects.requireNonNull(errors);
		return this;
	}
}