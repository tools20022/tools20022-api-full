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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.StatusReportContent4#mmPOICapabilities
 * StatusReportContent4.mmPOICapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReportContent4#mmPOIComponent
 * StatusReportContent4.mmPOIComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReportContent4#mmAttendanceContext
 * StatusReportContent4.mmAttendanceContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReportContent4#mmPOIDateTime
 * StatusReportContent4.mmPOIDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReportContent4#mmDataSetRequired
 * StatusReportContent4.mmDataSetRequired}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReportContent4#mmEvent
 * StatusReportContent4.mmEvent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReportContent4#mmErrors
 * StatusReportContent4.mmErrors}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusReportContent4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Content of the status report."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReportContent5
 * StatusReportContent5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.StatusReportContent3
 * StatusReportContent3}</li>
 * </ul>
 */
public class StatusReportContent4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PointOfInteractionCapabilities3 pOICapabilities;
	/**
	 * Capabilities of the POI (Point Of Interaction) performing the status
	 * report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3
	 * PointOfInteractionCapabilities3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent4
	 * StatusReportContent4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent5#mmPOICapabilities
	 * StatusReportContent5.mmPOICapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent3#mmPOICapabilities
	 * StatusReportContent3.mmPOICapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPOICapabilities = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PointOfInteraction.mmObject();
			componentContext_lazy = () -> StatusReportContent4.mmObject();
			isDerived = false;
			xmlTag = "POICpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POICapabilities";
			definition = "Capabilities of the POI (Point Of Interaction) performing the status report.";
			nextVersions_lazy = () -> Arrays.asList(StatusReportContent5.mmPOICapabilities);
			previousVersion_lazy = () -> StatusReportContent3.mmPOICapabilities;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PointOfInteractionComponent5> pOIComponent;
	/**
	 * Data related to a component of the POI (Point Of Interaction) performing
	 * the status report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5
	 * PointOfInteractionComponent5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmComponent
	 * PointOfInteraction.mmComponent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent4
	 * StatusReportContent4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent5#mmPOIComponent
	 * StatusReportContent5.mmPOIComponent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent3#mmPOIComponent
	 * StatusReportContent3.mmPOIComponent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPOIComponent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmComponent;
			componentContext_lazy = () -> StatusReportContent4.mmObject();
			isDerived = false;
			xmlTag = "POICmpnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIComponent";
			definition = "Data related to a component of the POI (Point Of Interaction) performing the status report.";
			nextVersions_lazy = () -> Arrays.asList(StatusReportContent5.mmPOIComponent);
			previousVersion_lazy = () -> StatusReportContent3.mmPOIComponent;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponent5.mmObject();
		}
	};
	protected AttendanceContext1Code attendanceContext;
	/**
	 * Human attendance at the POI (Point Of Interaction) location during
	 * transactions.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent4
	 * StatusReportContent4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent5#mmAttendanceContext
	 * StatusReportContent5.mmAttendanceContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent3#mmAttendanceContext
	 * StatusReportContent3.mmAttendanceContext}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAttendanceContext = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmAttendanceContext;
			componentContext_lazy = () -> StatusReportContent4.mmObject();
			isDerived = false;
			xmlTag = "AttndncCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceContext";
			definition = "Human attendance at the POI (Point Of Interaction) location during transactions.";
			nextVersions_lazy = () -> Arrays.asList(StatusReportContent5.mmAttendanceContext);
			previousVersion_lazy = () -> StatusReportContent3.mmAttendanceContext;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AttendanceContext1Code.mmObject();
		}
	};
	protected ISODateTime pOIDateTime;
	/**
	 * System date time of the point of interaction (POI) sending the status
	 * report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent4
	 * StatusReportContent4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent5#mmPOIDateTime
	 * StatusReportContent5.mmPOIDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent3#mmPOIDateTime
	 * StatusReportContent3.mmPOIDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPOIDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatusReportContent4.mmObject();
			isDerived = false;
			xmlTag = "POIDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIDateTime";
			definition = "System date time of the point of interaction (POI) sending the status report.";
			nextVersions_lazy = () -> Arrays.asList(StatusReportContent5.mmPOIDateTime);
			previousVersion_lazy = () -> StatusReportContent3.mmPOIDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected TerminalManagementDataSet12 dataSetRequired;
	/**
	 * Request the terminal management system to answer with the identified data
	 * set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet12
	 * TerminalManagementDataSet12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent4
	 * StatusReportContent4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent5#mmDataSetRequired
	 * StatusReportContent5.mmDataSetRequired}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent3#mmDataSetRequired
	 * StatusReportContent3.mmDataSetRequired}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSetRequired = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StatusReportContent4.mmObject();
			isDerived = false;
			xmlTag = "DataSetReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetRequired";
			definition = "Request the terminal management system to answer with the identified data set.";
			nextVersions_lazy = () -> Arrays.asList(StatusReportContent5.mmDataSetRequired);
			previousVersion_lazy = () -> StatusReportContent3.mmDataSetRequired;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet12.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TMSEvent3> event;
	/**
	 * Result of an individual terminal management action by the point of
	 * interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TMSEvent3 TMSEvent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent4
	 * StatusReportContent4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent5#mmEvent
	 * StatusReportContent5.mmEvent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent3#mmEvent
	 * StatusReportContent3.mmEvent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEvent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StatusReportContent4.mmObject();
			isDerived = false;
			xmlTag = "Evt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Event";
			definition = "Result of an individual terminal management action by the point of interaction.";
			nextVersions_lazy = () -> Arrays.asList(StatusReportContent5.mmEvent);
			previousVersion_lazy = () -> StatusReportContent3.mmEvent;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TMSEvent3.mmObject();
		}
	};
	protected List<Max140Text> errors;
	/**
	 * Error log of the point of interaction since the last status report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent4
	 * StatusReportContent4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent5#mmErrors
	 * StatusReportContent5.mmErrors}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent3#mmErrors
	 * StatusReportContent3.mmErrors}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmErrors = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatusReportContent4.mmObject();
			isDerived = false;
			xmlTag = "Errs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Errors";
			definition = "Error log of the point of interaction since the last status report.";
			nextVersions_lazy = () -> Arrays.asList(StatusReportContent5.mmErrors);
			previousVersion_lazy = () -> StatusReportContent3.mmErrors;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(StatusReportContent4.mmPOICapabilities, StatusReportContent4.mmPOIComponent, StatusReportContent4.mmAttendanceContext, StatusReportContent4.mmPOIDateTime,
						StatusReportContent4.mmDataSetRequired, StatusReportContent4.mmEvent, StatusReportContent4.mmErrors);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusReportContent4";
				definition = "Content of the status report.";
				nextVersions_lazy = () -> Arrays.asList(StatusReportContent5.mmObject());
				previousVersion_lazy = () -> StatusReportContent3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PointOfInteractionCapabilities3 getPOICapabilities() {
		return pOICapabilities;
	}

	public void setPOICapabilities(com.tools20022.repository.msg.PointOfInteractionCapabilities3 pOICapabilities) {
		this.pOICapabilities = pOICapabilities;
	}

	public List<PointOfInteractionComponent5> getPOIComponent() {
		return pOIComponent;
	}

	public void setPOIComponent(List<com.tools20022.repository.msg.PointOfInteractionComponent5> pOIComponent) {
		this.pOIComponent = pOIComponent;
	}

	public AttendanceContext1Code getAttendanceContext() {
		return attendanceContext;
	}

	public void setAttendanceContext(AttendanceContext1Code attendanceContext) {
		this.attendanceContext = attendanceContext;
	}

	public ISODateTime getPOIDateTime() {
		return pOIDateTime;
	}

	public void setPOIDateTime(ISODateTime pOIDateTime) {
		this.pOIDateTime = pOIDateTime;
	}

	public TerminalManagementDataSet12 getDataSetRequired() {
		return dataSetRequired;
	}

	public void setDataSetRequired(com.tools20022.repository.msg.TerminalManagementDataSet12 dataSetRequired) {
		this.dataSetRequired = dataSetRequired;
	}

	public List<TMSEvent3> getEvent() {
		return event;
	}

	public void setEvent(List<com.tools20022.repository.msg.TMSEvent3> event) {
		this.event = event;
	}

	public List<Max140Text> getErrors() {
		return errors;
	}

	public void setErrors(List<Max140Text> errors) {
		this.errors = errors;
	}
}