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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09;
import com.tools20022.repository.choice.CorporateActionEventProcessingType3Choice;
import com.tools20022.repository.choice.CorporateActionEventType79Choice;
import com.tools20022.repository.choice.CorporateActionMandatoryVoluntary4Choice;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.entity.ClassAction;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.CorporateActionEventRegistration;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentAttributes85;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * General information about the corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132#mmCorporateActionEventIdentification
 * CorporateActionGeneralInformation132.mmCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132#mmOfficialCorporateActionEventIdentification
 * CorporateActionGeneralInformation132.
 * mmOfficialCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132#mmClassActionNumber
 * CorporateActionGeneralInformation132.mmClassActionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132#mmEventProcessingType
 * CorporateActionGeneralInformation132.mmEventProcessingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132#mmEventType
 * CorporateActionGeneralInformation132.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132#mmMandatoryVoluntaryEventType
 * CorporateActionGeneralInformation132.mmMandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132#mmUnderlyingSecurity
 * CorporateActionGeneralInformation132.mmUnderlyingSecurity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09#mmCorporateActionGeneralInformation
 * CorporateActionMovementPreliminaryAdvice002V09.
 * mmCorporateActionGeneralInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionGeneralInformation132"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "General information about the corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation132
 * ConstraintOfficialCorporateActionEventReference.
 * forCorporateActionGeneralInformation132}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionGeneralInformation132", propOrder = {"corporateActionEventIdentification", "officialCorporateActionEventIdentification", "classActionNumber", "eventProcessingType", "eventType",
		"mandatoryVoluntaryEventType", "underlyingSecurity"})
public class CorporateActionGeneralInformation132 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CorpActnEvtId", required = true)
	protected RestrictedFINXMax16Text corporateActionEventIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEventIdentification
	 * CorporateActionEventRegistration.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132
	 * CorporateActionGeneralInformation132}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned by the account servicer to unambiguously identify a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::CORP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionGeneralInformation132, RestrictedFINXMax16Text> mmCorporateActionEventIdentification = new MMMessageAttribute<CorporateActionGeneralInformation132, RestrictedFINXMax16Text>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmCorporateActionEventIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation132.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::CORP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventIdentification";
			definition = "Reference assigned by the account servicer to unambiguously identify a corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public RestrictedFINXMax16Text getValue(CorporateActionGeneralInformation132 obj) {
			return obj.getCorporateActionEventIdentification();
		}

		@Override
		public void setValue(CorporateActionGeneralInformation132 obj, RestrictedFINXMax16Text value) {
			obj.setCorporateActionEventIdentification(value);
		}
	};
	@XmlElement(name = "OffclCorpActnEvtId")
	protected RestrictedFINXMax16Text officialCorporateActionEventIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmOfficialCorporateActionEventIdentification
	 * CorporateActionEventRegistration.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132
	 * CorporateActionGeneralInformation132}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffclCorpActnEvtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Official and unique reference assigned by the official central body/entity within each market at the beginning of a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::COAF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionGeneralInformation132, Optional<RestrictedFINXMax16Text>> mmOfficialCorporateActionEventIdentification = new MMMessageAttribute<CorporateActionGeneralInformation132, Optional<RestrictedFINXMax16Text>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmOfficialCorporateActionEventIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation132.mmObject();
			isDerived = false;
			xmlTag = "OffclCorpActnEvtId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::COAF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventIdentification";
			definition = "Official and unique reference assigned by the official central body/entity within each market at the beginning of a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax16Text> getValue(CorporateActionGeneralInformation132 obj) {
			return obj.getOfficialCorporateActionEventIdentification();
		}

		@Override
		public void setValue(CorporateActionGeneralInformation132 obj, Optional<RestrictedFINXMax16Text> value) {
			obj.setOfficialCorporateActionEventIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClssActnNb")
	protected RestrictedFINXMax16Text classActionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmClassActionNumber
	 * ClassAction.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132
	 * CorporateActionGeneralInformation132}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssActnNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassActionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference assigned by a court to a class action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::CACN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionGeneralInformation132, Optional<RestrictedFINXMax16Text>> mmClassActionNumber = new MMMessageAttribute<CorporateActionGeneralInformation132, Optional<RestrictedFINXMax16Text>>() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmClassActionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation132.mmObject();
			isDerived = false;
			xmlTag = "ClssActnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::CACN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassActionNumber";
			definition = "Reference assigned by a court to a class action.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax16Text> getValue(CorporateActionGeneralInformation132 obj) {
			return obj.getClassActionNumber();
		}

		@Override
		public void setValue(CorporateActionGeneralInformation132 obj, Optional<RestrictedFINXMax16Text> value) {
			obj.setClassActionNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "EvtPrcgTp")
	protected CorporateActionEventProcessingType3Choice eventProcessingType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType3Choice
	 * CorporateActionEventProcessingType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventProcessingType
	 * CorporateActionEvent.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132
	 * CorporateActionGeneralInformation132}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtPrcgTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventProcessingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of processing involved by a corporate action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionGeneralInformation132, Optional<CorporateActionEventProcessingType3Choice>> mmEventProcessingType = new MMMessageAssociationEnd<CorporateActionGeneralInformation132, Optional<CorporateActionEventProcessingType3Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEventProcessingType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation132.mmObject();
			isDerived = false;
			xmlTag = "EvtPrcgTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventProcessingType";
			definition = "Type of processing involved by a corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionEventProcessingType3Choice.mmObject();
		}

		@Override
		public Optional<CorporateActionEventProcessingType3Choice> getValue(CorporateActionGeneralInformation132 obj) {
			return obj.getEventProcessingType();
		}

		@Override
		public void setValue(CorporateActionGeneralInformation132 obj, Optional<CorporateActionEventProcessingType3Choice> value) {
			obj.setEventProcessingType(value.orElse(null));
		}
	};
	@XmlElement(name = "EvtTp", required = true)
	protected CorporateActionEventType79Choice eventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType79Choice
	 * CorporateActionEventType79Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmType
	 * CorporateActionEvent.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132
	 * CorporateActionGeneralInformation132}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionGeneralInformation132, CorporateActionEventType79Choice> mmEventType = new MMMessageAssociationEnd<CorporateActionGeneralInformation132, CorporateActionEventType79Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation132.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "Type of corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionEventType79Choice.mmObject();
		}

		@Override
		public CorporateActionEventType79Choice getValue(CorporateActionGeneralInformation132 obj) {
			return obj.getEventType();
		}

		@Override
		public void setValue(CorporateActionGeneralInformation132 obj, CorporateActionEventType79Choice value) {
			obj.setEventType(value);
		}
	};
	@XmlElement(name = "MndtryVlntryEvtTp", required = true)
	protected CorporateActionMandatoryVoluntary4Choice mandatoryVoluntaryEventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary4Choice
	 * CorporateActionMandatoryVoluntary4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMandatoryVoluntaryEventType
	 * CorporateActionEvent.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132
	 * CorporateActionGeneralInformation132}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtryVlntryEvtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryVoluntaryEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the event is mandatory, mandatory with options or voluntary."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAMV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionGeneralInformation132, CorporateActionMandatoryVoluntary4Choice> mmMandatoryVoluntaryEventType = new MMMessageAssociationEnd<CorporateActionGeneralInformation132, CorporateActionMandatoryVoluntary4Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmMandatoryVoluntaryEventType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation132.mmObject();
			isDerived = false;
			xmlTag = "MndtryVlntryEvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAMV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryVoluntaryEventType";
			definition = "Specifies whether the event is mandatory, mandatory with options or voluntary.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionMandatoryVoluntary4Choice.mmObject();
		}

		@Override
		public CorporateActionMandatoryVoluntary4Choice getValue(CorporateActionGeneralInformation132 obj) {
			return obj.getMandatoryVoluntaryEventType();
		}

		@Override
		public void setValue(CorporateActionGeneralInformation132 obj, CorporateActionMandatoryVoluntary4Choice value) {
			obj.setMandatoryVoluntaryEventType(value);
		}
	};
	@XmlElement(name = "UndrlygScty", required = true)
	protected FinancialInstrumentAttributes85 underlyingSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85
	 * FinancialInstrumentAttributes85}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
	 * CorporateActionEvent.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132
	 * CorporateActionGeneralInformation132}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygScty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security concerned by the corporate action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R::USECU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionGeneralInformation132, FinancialInstrumentAttributes85> mmUnderlyingSecurity = new MMMessageAssociationEnd<CorporateActionGeneralInformation132, FinancialInstrumentAttributes85>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmUnderlyingSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation132.mmObject();
			isDerived = false;
			xmlTag = "UndrlygScty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R::USECU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSecurity";
			definition = "Security concerned by the corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes85.mmObject();
		}

		@Override
		public FinancialInstrumentAttributes85 getValue(CorporateActionGeneralInformation132 obj) {
			return obj.getUnderlyingSecurity();
		}

		@Override
		public void setValue(CorporateActionGeneralInformation132 obj, FinancialInstrumentAttributes85 value) {
			obj.setUnderlyingSecurity(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionGeneralInformation132.mmCorporateActionEventIdentification,
						com.tools20022.repository.msg.CorporateActionGeneralInformation132.mmOfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation132.mmClassActionNumber,
						com.tools20022.repository.msg.CorporateActionGeneralInformation132.mmEventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation132.mmEventType,
						com.tools20022.repository.msg.CorporateActionGeneralInformation132.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation132.mmUnderlyingSecurity);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdvice002V09.mmCorporateActionGeneralInformation);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation132);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionGeneralInformation132";
				definition = "General information about the corporate action event.";
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedFINXMax16Text getCorporateActionEventIdentification() {
		return corporateActionEventIdentification;
	}

	public CorporateActionGeneralInformation132 setCorporateActionEventIdentification(RestrictedFINXMax16Text corporateActionEventIdentification) {
		this.corporateActionEventIdentification = Objects.requireNonNull(corporateActionEventIdentification);
		return this;
	}

	public Optional<RestrictedFINXMax16Text> getOfficialCorporateActionEventIdentification() {
		return officialCorporateActionEventIdentification == null ? Optional.empty() : Optional.of(officialCorporateActionEventIdentification);
	}

	public CorporateActionGeneralInformation132 setOfficialCorporateActionEventIdentification(RestrictedFINXMax16Text officialCorporateActionEventIdentification) {
		this.officialCorporateActionEventIdentification = officialCorporateActionEventIdentification;
		return this;
	}

	public Optional<RestrictedFINXMax16Text> getClassActionNumber() {
		return classActionNumber == null ? Optional.empty() : Optional.of(classActionNumber);
	}

	public CorporateActionGeneralInformation132 setClassActionNumber(RestrictedFINXMax16Text classActionNumber) {
		this.classActionNumber = classActionNumber;
		return this;
	}

	public Optional<CorporateActionEventProcessingType3Choice> getEventProcessingType() {
		return eventProcessingType == null ? Optional.empty() : Optional.of(eventProcessingType);
	}

	public CorporateActionGeneralInformation132 setEventProcessingType(CorporateActionEventProcessingType3Choice eventProcessingType) {
		this.eventProcessingType = eventProcessingType;
		return this;
	}

	public CorporateActionEventType79Choice getEventType() {
		return eventType;
	}

	public CorporateActionGeneralInformation132 setEventType(CorporateActionEventType79Choice eventType) {
		this.eventType = Objects.requireNonNull(eventType);
		return this;
	}

	public CorporateActionMandatoryVoluntary4Choice getMandatoryVoluntaryEventType() {
		return mandatoryVoluntaryEventType;
	}

	public CorporateActionGeneralInformation132 setMandatoryVoluntaryEventType(CorporateActionMandatoryVoluntary4Choice mandatoryVoluntaryEventType) {
		this.mandatoryVoluntaryEventType = Objects.requireNonNull(mandatoryVoluntaryEventType);
		return this;
	}

	public FinancialInstrumentAttributes85 getUnderlyingSecurity() {
		return underlyingSecurity;
	}

	public CorporateActionGeneralInformation132 setUnderlyingSecurity(FinancialInstrumentAttributes85 underlyingSecurity) {
		this.underlyingSecurity = Objects.requireNonNull(underlyingSecurity);
		return this;
	}
}