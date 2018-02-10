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
import com.tools20022.repository.choice.CorporateActionEventType41Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat17Choice;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.entity.*;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#mmCorporateActionEventIdentification
 * CorporateActionGeneralInformation98.mmCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#mmOfficialCorporateActionEventIdentification
 * CorporateActionGeneralInformation98.
 * mmOfficialCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#mmClassActionNumber
 * CorporateActionGeneralInformation98.mmClassActionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#mmEventType
 * CorporateActionGeneralInformation98.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#mmFinancialInstrumentIdentification
 * CorporateActionGeneralInformation98.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#mmIntermediateSecuritiesDistributionType
 * CorporateActionGeneralInformation98.mmIntermediateSecuritiesDistributionType}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#mmFractionalQuantity
 * CorporateActionGeneralInformation98.mmFractionalQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation98
 * ConstraintEventTypeRule.forCorporateActionGeneralInformation98}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference#forCorporateActionGeneralInformation98
 * ConstraintOfficialCorporateActionEventReference.
 * forCorporateActionGeneralInformation98}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionGeneralInformation98"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "General information about the corporate action event."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionGeneralInformation98", propOrder = {"corporateActionEventIdentification", "officialCorporateActionEventIdentification", "classActionNumber", "eventType", "financialInstrumentIdentification",
		"intermediateSecuritiesDistributionType", "fractionalQuantity"})
public class CorporateActionGeneralInformation98 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98
	 * CorporateActionGeneralInformation98}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCorporateActionEventIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmCorporateActionEventIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation98.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98
	 * CorporateActionGeneralInformation98}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmOfficialCorporateActionEventIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmOfficialCorporateActionEventIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation98.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98
	 * CorporateActionGeneralInformation98}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmClassActionNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmClassActionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation98.mmObject();
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
	};
	@XmlElement(name = "EvtTp", required = true)
	protected CorporateActionEventType41Choice eventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType41Choice
	 * CorporateActionEventType41Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmType
	 * CorporateActionEvent.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98
	 * CorporateActionGeneralInformation98}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEventType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation98.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "Type of corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionEventType41Choice.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification20 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20
	 * SecurityIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98
	 * CorporateActionGeneralInformation98}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :35B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the security concerned by the corporate action."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation98.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of the security concerned by the corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification20.mmObject();
		}
	};
	@XmlElement(name = "IntrmdtSctiesDstrbtnTp")
	protected IntermediateSecuritiesDistributionTypeFormat17Choice intermediateSecuritiesDistributionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat17Choice
	 * IntermediateSecuritiesDistributionTypeFormat17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmIntermediateSecuritiesDistributionType
	 * SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98
	 * CorporateActionGeneralInformation98}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmdtSctiesDstrbtnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistributionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of intermediates securities distribution."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntermediateSecuritiesDistributionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation98.mmObject();
			isDerived = false;
			xmlTag = "IntrmdtSctiesDstrbtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistributionType";
			definition = "Type of intermediates securities distribution.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IntermediateSecuritiesDistributionTypeFormat17Choice.mmObject();
		}
	};
	@XmlElement(name = "FrctnlQty")
	protected FinancialInstrumentQuantity15Choice fractionalQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmFractionalQuantity
	 * CorporateActionEvent.mmFractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98
	 * CorporateActionGeneralInformation98}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrctnlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fractional quantity resulting from an event which will be paid with cash in lieu. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFractionalQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmFractionalQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformation98.mmObject();
			isDerived = false;
			xmlTag = "FrctnlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionalQuantity";
			definition = "Fractional quantity resulting from an event which will be paid with cash in lieu. ";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionGeneralInformation98.mmCorporateActionEventIdentification,
						com.tools20022.repository.msg.CorporateActionGeneralInformation98.mmOfficialCorporateActionEventIdentification, com.tools20022.repository.msg.CorporateActionGeneralInformation98.mmClassActionNumber,
						com.tools20022.repository.msg.CorporateActionGeneralInformation98.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation98.mmFinancialInstrumentIdentification,
						com.tools20022.repository.msg.CorporateActionGeneralInformation98.mmIntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateActionGeneralInformation98.mmFractionalQuantity);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation98,
						com.tools20022.repository.constraints.ConstraintOfficialCorporateActionEventReference.forCorporateActionGeneralInformation98);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionGeneralInformation98";
				definition = "General information about the corporate action event.";
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedFINXMax16Text getCorporateActionEventIdentification() {
		return corporateActionEventIdentification;
	}

	public CorporateActionGeneralInformation98 setCorporateActionEventIdentification(RestrictedFINXMax16Text corporateActionEventIdentification) {
		this.corporateActionEventIdentification = Objects.requireNonNull(corporateActionEventIdentification);
		return this;
	}

	public Optional<RestrictedFINXMax16Text> getOfficialCorporateActionEventIdentification() {
		return officialCorporateActionEventIdentification == null ? Optional.empty() : Optional.of(officialCorporateActionEventIdentification);
	}

	public CorporateActionGeneralInformation98 setOfficialCorporateActionEventIdentification(RestrictedFINXMax16Text officialCorporateActionEventIdentification) {
		this.officialCorporateActionEventIdentification = officialCorporateActionEventIdentification;
		return this;
	}

	public Optional<RestrictedFINXMax16Text> getClassActionNumber() {
		return classActionNumber == null ? Optional.empty() : Optional.of(classActionNumber);
	}

	public CorporateActionGeneralInformation98 setClassActionNumber(RestrictedFINXMax16Text classActionNumber) {
		this.classActionNumber = classActionNumber;
		return this;
	}

	public CorporateActionEventType41Choice getEventType() {
		return eventType;
	}

	public CorporateActionGeneralInformation98 setEventType(CorporateActionEventType41Choice eventType) {
		this.eventType = Objects.requireNonNull(eventType);
		return this;
	}

	public SecurityIdentification20 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public CorporateActionGeneralInformation98 setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification20 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<IntermediateSecuritiesDistributionTypeFormat17Choice> getIntermediateSecuritiesDistributionType() {
		return intermediateSecuritiesDistributionType == null ? Optional.empty() : Optional.of(intermediateSecuritiesDistributionType);
	}

	public CorporateActionGeneralInformation98 setIntermediateSecuritiesDistributionType(IntermediateSecuritiesDistributionTypeFormat17Choice intermediateSecuritiesDistributionType) {
		this.intermediateSecuritiesDistributionType = intermediateSecuritiesDistributionType;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getFractionalQuantity() {
		return fractionalQuantity == null ? Optional.empty() : Optional.of(fractionalQuantity);
	}

	public CorporateActionGeneralInformation98 setFractionalQuantity(FinancialInstrumentQuantity15Choice fractionalQuantity) {
		this.fractionalQuantity = fractionalQuantity;
		return this;
	}
}