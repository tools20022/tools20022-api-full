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
import com.tools20022.repository.msg.PointOfInteractionCapabilities6;
import com.tools20022.repository.msg.PointOfInteractionComponent8;
import com.tools20022.repository.msg.TerminalManagementDataSet25;
import com.tools20022.repository.msg.TMSEvent6;
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
 * {@linkplain com.tools20022.repository.msg.StatusReportContent7#mmPOICapabilities
 * StatusReportContent7.mmPOICapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReportContent7#mmPOIComponent
 * StatusReportContent7.mmPOIComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReportContent7#mmAttendanceContext
 * StatusReportContent7.mmAttendanceContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReportContent7#mmPOIDateTime
 * StatusReportContent7.mmPOIDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReportContent7#mmDataSetRequired
 * StatusReportContent7.mmDataSetRequired}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReportContent7#mmEvent
 * StatusReportContent7.mmEvent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReportContent7#mmErrors
 * StatusReportContent7.mmErrors}</li>
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
 * "StatusReportContent7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Content of the status report."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.StatusReportContent6
 * StatusReportContent6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatusReportContent7", propOrder = {"pOICapabilities", "pOIComponent", "attendanceContext", "pOIDateTime", "dataSetRequired", "event", "errors"})
public class StatusReportContent7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "POICpblties")
	protected PointOfInteractionCapabilities6 pOICapabilities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6
	 * PointOfInteractionCapabilities6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent7
	 * StatusReportContent7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent6#mmPOICapabilities
	 * StatusReportContent6.mmPOICapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusReportContent7, Optional<PointOfInteractionCapabilities6>> mmPOICapabilities = new MMMessageAssociationEnd<StatusReportContent7, Optional<PointOfInteractionCapabilities6>>() {
		{
			businessComponentTrace_lazy = () -> PointOfInteraction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportContent7.mmObject();
			isDerived = false;
			xmlTag = "POICpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POICapabilities";
			definition = "Capabilities of the POI (Point Of Interaction) performing the status report.";
			previousVersion_lazy = () -> StatusReportContent6.mmPOICapabilities;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PointOfInteractionCapabilities6.mmObject();
		}

		@Override
		public Optional<PointOfInteractionCapabilities6> getValue(StatusReportContent7 obj) {
			return obj.getPOICapabilities();
		}

		@Override
		public void setValue(StatusReportContent7 obj, Optional<PointOfInteractionCapabilities6> value) {
			obj.setPOICapabilities(value.orElse(null));
		}
	};
	@XmlElement(name = "POICmpnt")
	protected List<PointOfInteractionComponent8> pOIComponent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent8
	 * PointOfInteractionComponent8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmComponent
	 * PointOfInteraction.mmComponent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent7
	 * StatusReportContent7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent6#mmPOIComponent
	 * StatusReportContent6.mmPOIComponent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusReportContent7, List<PointOfInteractionComponent8>> mmPOIComponent = new MMMessageAssociationEnd<StatusReportContent7, List<PointOfInteractionComponent8>>() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmComponent;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportContent7.mmObject();
			isDerived = false;
			xmlTag = "POICmpnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIComponent";
			definition = "Data related to a component of the POI (Point Of Interaction) performing the status report.";
			previousVersion_lazy = () -> StatusReportContent6.mmPOIComponent;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PointOfInteractionComponent8.mmObject();
		}

		@Override
		public List<PointOfInteractionComponent8> getValue(StatusReportContent7 obj) {
			return obj.getPOIComponent();
		}

		@Override
		public void setValue(StatusReportContent7 obj, List<PointOfInteractionComponent8> value) {
			obj.setPOIComponent(value);
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
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent7
	 * StatusReportContent7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent6#mmAttendanceContext
	 * StatusReportContent6.mmAttendanceContext}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatusReportContent7, Optional<AttendanceContext1Code>> mmAttendanceContext = new MMMessageAttribute<StatusReportContent7, Optional<AttendanceContext1Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmAttendanceContext;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportContent7.mmObject();
			isDerived = false;
			xmlTag = "AttndncCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceContext";
			definition = "Human attendance at the POI (Point Of Interaction) location during transactions.";
			previousVersion_lazy = () -> StatusReportContent6.mmAttendanceContext;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AttendanceContext1Code.mmObject();
		}

		@Override
		public Optional<AttendanceContext1Code> getValue(StatusReportContent7 obj) {
			return obj.getAttendanceContext();
		}

		@Override
		public void setValue(StatusReportContent7 obj, Optional<AttendanceContext1Code> value) {
			obj.setAttendanceContext(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent7
	 * StatusReportContent7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent6#mmPOIDateTime
	 * StatusReportContent6.mmPOIDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatusReportContent7, ISODateTime> mmPOIDateTime = new MMMessageAttribute<StatusReportContent7, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportContent7.mmObject();
			isDerived = false;
			xmlTag = "POIDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIDateTime";
			definition = "System date time of the point of interaction (POI) sending the status report.";
			previousVersion_lazy = () -> StatusReportContent6.mmPOIDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(StatusReportContent7 obj) {
			return obj.getPOIDateTime();
		}

		@Override
		public void setValue(StatusReportContent7 obj, ISODateTime value) {
			obj.setPOIDateTime(value);
		}
	};
	@XmlElement(name = "DataSetReqrd")
	protected List<TerminalManagementDataSet25> dataSetRequired;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet25
	 * TerminalManagementDataSet25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent7
	 * StatusReportContent7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent6#mmDataSetRequired
	 * StatusReportContent6.mmDataSetRequired}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusReportContent7, List<TerminalManagementDataSet25>> mmDataSetRequired = new MMMessageAssociationEnd<StatusReportContent7, List<TerminalManagementDataSet25>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportContent7.mmObject();
			isDerived = false;
			xmlTag = "DataSetReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetRequired";
			definition = "Request the terminal management system to answer with the identified data set.";
			previousVersion_lazy = () -> StatusReportContent6.mmDataSetRequired;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TerminalManagementDataSet25.mmObject();
		}

		@Override
		public List<TerminalManagementDataSet25> getValue(StatusReportContent7 obj) {
			return obj.getDataSetRequired();
		}

		@Override
		public void setValue(StatusReportContent7 obj, List<TerminalManagementDataSet25> value) {
			obj.setDataSetRequired(value);
		}
	};
	@XmlElement(name = "Evt")
	protected List<TMSEvent6> event;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TMSEvent6 TMSEvent6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent7
	 * StatusReportContent7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent6#mmEvent
	 * StatusReportContent6.mmEvent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusReportContent7, List<TMSEvent6>> mmEvent = new MMMessageAssociationEnd<StatusReportContent7, List<TMSEvent6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportContent7.mmObject();
			isDerived = false;
			xmlTag = "Evt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Event";
			definition = "Result of an individual terminal management action by the point of interaction.";
			previousVersion_lazy = () -> StatusReportContent6.mmEvent;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TMSEvent6.mmObject();
		}

		@Override
		public List<TMSEvent6> getValue(StatusReportContent7 obj) {
			return obj.getEvent();
		}

		@Override
		public void setValue(StatusReportContent7 obj, List<TMSEvent6> value) {
			obj.setEvent(value);
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
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent7
	 * StatusReportContent7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent6#mmErrors
	 * StatusReportContent6.mmErrors}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatusReportContent7, List<Max140Text>> mmErrors = new MMMessageAttribute<StatusReportContent7, List<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportContent7.mmObject();
			isDerived = false;
			xmlTag = "Errs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Errors";
			definition = "Error log of the point of interaction since the last status report.";
			previousVersion_lazy = () -> StatusReportContent6.mmErrors;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public List<Max140Text> getValue(StatusReportContent7 obj) {
			return obj.getErrors();
		}

		@Override
		public void setValue(StatusReportContent7 obj, List<Max140Text> value) {
			obj.setErrors(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusReportContent7.mmPOICapabilities, com.tools20022.repository.msg.StatusReportContent7.mmPOIComponent,
						com.tools20022.repository.msg.StatusReportContent7.mmAttendanceContext, com.tools20022.repository.msg.StatusReportContent7.mmPOIDateTime, com.tools20022.repository.msg.StatusReportContent7.mmDataSetRequired,
						com.tools20022.repository.msg.StatusReportContent7.mmEvent, com.tools20022.repository.msg.StatusReportContent7.mmErrors);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusReportContent7";
				definition = "Content of the status report.";
				previousVersion_lazy = () -> StatusReportContent6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PointOfInteractionCapabilities6> getPOICapabilities() {
		return pOICapabilities == null ? Optional.empty() : Optional.of(pOICapabilities);
	}

	public StatusReportContent7 setPOICapabilities(PointOfInteractionCapabilities6 pOICapabilities) {
		this.pOICapabilities = pOICapabilities;
		return this;
	}

	public List<PointOfInteractionComponent8> getPOIComponent() {
		return pOIComponent == null ? pOIComponent = new ArrayList<>() : pOIComponent;
	}

	public StatusReportContent7 setPOIComponent(List<PointOfInteractionComponent8> pOIComponent) {
		this.pOIComponent = Objects.requireNonNull(pOIComponent);
		return this;
	}

	public Optional<AttendanceContext1Code> getAttendanceContext() {
		return attendanceContext == null ? Optional.empty() : Optional.of(attendanceContext);
	}

	public StatusReportContent7 setAttendanceContext(AttendanceContext1Code attendanceContext) {
		this.attendanceContext = attendanceContext;
		return this;
	}

	public ISODateTime getPOIDateTime() {
		return pOIDateTime;
	}

	public StatusReportContent7 setPOIDateTime(ISODateTime pOIDateTime) {
		this.pOIDateTime = Objects.requireNonNull(pOIDateTime);
		return this;
	}

	public List<TerminalManagementDataSet25> getDataSetRequired() {
		return dataSetRequired == null ? dataSetRequired = new ArrayList<>() : dataSetRequired;
	}

	public StatusReportContent7 setDataSetRequired(List<TerminalManagementDataSet25> dataSetRequired) {
		this.dataSetRequired = Objects.requireNonNull(dataSetRequired);
		return this;
	}

	public List<TMSEvent6> getEvent() {
		return event == null ? event = new ArrayList<>() : event;
	}

	public StatusReportContent7 setEvent(List<TMSEvent6> event) {
		this.event = Objects.requireNonNull(event);
		return this;
	}

	public List<Max140Text> getErrors() {
		return errors == null ? errors = new ArrayList<>() : errors;
	}

	public StatusReportContent7 setErrors(List<Max140Text> errors) {
		this.errors = Objects.requireNonNull(errors);
		return this;
	}
}