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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05;
import com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV06;
import com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV07;
import com.tools20022.repository.choice.CorporateActionEventType32Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ClassAction;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.CorporateActionEventRegistration;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91#mmCorporateActionEventIdentification
 * CorporateActionGeneralInformation91.mmCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91#mmOfficialCorporateActionEventIdentification
 * CorporateActionGeneralInformation91.
 * mmOfficialCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91#mmClassActionNumber
 * CorporateActionGeneralInformation91.mmClassActionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91#mmEventType
 * CorporateActionGeneralInformation91.mmEventType}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV06#mmCorporateActionGeneralInformation
 * CorporateActionInstructionCancellationRequestStatusAdviceV06.
 * mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05#mmCorporateActionGeneralInformation
 * CorporateActionEventProcessingStatusAdviceV05.
 * mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV07#mmCorporateActionGeneralInformation
 * CorporateActionInstructionStatusAdviceV07.mmCorporateActionGeneralInformation
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation91
 * ConstraintEventTypeRule.forCorporateActionGeneralInformation91}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation91
 * ConstraintOfficialCorporateActionEventReference.
 * forCorporateActionGeneralInformation91}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionGeneralInformation91"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "General information about the corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109
 * CorporateActionGeneralInformation109}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation52
 * CorporateActionGeneralInformation52}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionGeneralInformation91", propOrder = {"corporateActionEventIdentification", "officialCorporateActionEventIdentification", "classActionNumber", "eventType"})
public class CorporateActionGeneralInformation91 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CorpActnEvtId", required = true)
	protected Max35Text corporateActionEventIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEventIdentification
	 * CorporateActionEventRegistration.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91
	 * CorporateActionGeneralInformation91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::CORP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned by the account servicer to unambiguously identify a corporate action event."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation109.mmCorporateActionEventIdentification
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation52#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation52.mmCorporateActionEventIdentification}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCorporateActionEventIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmCorporateActionEventIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation91.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::CORP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventIdentification";
			definition = "Reference assigned by the account servicer to unambiguously identify a corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformation109.mmCorporateActionEventIdentification);
			previousVersion_lazy = () -> CorporateActionGeneralInformation52.mmCorporateActionEventIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OffclCorpActnEvtId")
	protected Max35Text officialCorporateActionEventIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmOfficialCorporateActionEventIdentification
	 * CorporateActionEventRegistration.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91
	 * CorporateActionGeneralInformation91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffclCorpActnEvtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::COAF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Official and unique reference assigned by the official central body/entity within each market at the beginning of a corporate action event."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation109.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation52#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation52.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOfficialCorporateActionEventIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmOfficialCorporateActionEventIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation91.mmObject();
			isDerived = false;
			xmlTag = "OffclCorpActnEvtId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::COAF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialCorporateActionEventIdentification";
			definition = "Official and unique reference assigned by the official central body/entity within each market at the beginning of a corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformation109.mmOfficialCorporateActionEventIdentification);
			previousVersion_lazy = () -> CorporateActionGeneralInformation52.mmOfficialCorporateActionEventIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ClssActnNb")
	protected Max35Text classActionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmClassActionNumber
	 * ClassAction.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91
	 * CorporateActionGeneralInformation91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssActnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::CACN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassActionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference assigned by a court to a class action."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109#mmClassActionNumber
	 * CorporateActionGeneralInformation109.mmClassActionNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation52#mmClassActionNumber
	 * CorporateActionGeneralInformation52.mmClassActionNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClassActionNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmClassActionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation91.mmObject();
			isDerived = false;
			xmlTag = "ClssActnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::CACN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassActionNumber";
			definition = "Reference assigned by a court to a class action.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformation109.mmClassActionNumber);
			previousVersion_lazy = () -> CorporateActionGeneralInformation52.mmClassActionNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "EvtTp", required = true)
	protected CorporateActionEventType32Choice eventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType32Choice
	 * CorporateActionEventType32Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmType
	 * CorporateActionEvent.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91
	 * CorporateActionGeneralInformation91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of corporate action event."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109#mmEventType
	 * CorporateActionGeneralInformation109.mmEventType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation52#mmEventType
	 * CorporateActionGeneralInformation52.mmEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation91.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "Type of corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformation109.mmEventType);
			previousVersion_lazy = () -> CorporateActionGeneralInformation52.mmEventType;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionEventType32Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionGeneralInformation91.mmCorporateActionEventIdentification,
						com.tools20022.repository.msg.CorporateActionGeneralInformation91.mmOfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation91.mmClassActionNumber,
						com.tools20022.repository.msg.CorporateActionGeneralInformation91.mmEventType);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionInstructionCancellationRequestStatusAdviceV06.mmCorporateActionGeneralInformation,
						CorporateActionEventProcessingStatusAdviceV05.mmCorporateActionGeneralInformation, CorporateActionInstructionStatusAdviceV07.mmCorporateActionGeneralInformation);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation91,
						com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation91);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionGeneralInformation91";
				definition = "General information about the corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformation109.mmObject());
				previousVersion_lazy = () -> CorporateActionGeneralInformation52.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCorporateActionEventIdentification() {
		return corporateActionEventIdentification;
	}

	public CorporateActionGeneralInformation91 setCorporateActionEventIdentification(Max35Text corporateActionEventIdentification) {
		this.corporateActionEventIdentification = Objects.requireNonNull(corporateActionEventIdentification);
		return this;
	}

	public Optional<Max35Text> getOfficialCorporateActionEventIdentification() {
		return officialCorporateActionEventIdentification == null ? Optional.empty() : Optional.of(officialCorporateActionEventIdentification);
	}

	public CorporateActionGeneralInformation91 setOfficialCorporateActionEventIdentification(Max35Text officialCorporateActionEventIdentification) {
		this.officialCorporateActionEventIdentification = officialCorporateActionEventIdentification;
		return this;
	}

	public Optional<Max35Text> getClassActionNumber() {
		return classActionNumber == null ? Optional.empty() : Optional.of(classActionNumber);
	}

	public CorporateActionGeneralInformation91 setClassActionNumber(Max35Text classActionNumber) {
		this.classActionNumber = classActionNumber;
		return this;
	}

	public CorporateActionEventType32Choice getEventType() {
		return eventType;
	}

	public CorporateActionGeneralInformation91 setEventType(CorporateActionEventType32Choice eventType) {
		this.eventType = Objects.requireNonNull(eventType);
		return this;
	}
}