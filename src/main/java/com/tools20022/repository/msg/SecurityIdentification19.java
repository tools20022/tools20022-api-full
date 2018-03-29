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
import com.tools20022.repository.area.seev.CorporateActionNarrativeV04;
import com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV05;
import com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV06;
import com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV07;
import com.tools20022.repository.area.semt.IntraPositionMovementInstructionV04;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.datatype.ISINOct2015Identifier;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OtherIdentification1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmISIN
 * SecurityIdentification19.mmISIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmOtherIdentification
 * SecurityIdentification19.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmDescription
 * SecurityIdentification19.mmDescription}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
 * SecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionInstructionV06.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV04#mmFinancialInstrumentIdentification
 * IntraPositionMovementInstructionV04.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionConfirmationV06.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06#mmFinancialInstrumentIdentification
 * SecuritiesFinancingInstructionV06.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionGenerationNotificationV06.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionReversalAdviceV05.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmFinancialInstrumentIdentification
 * SecuritiesFinancingConfirmationV06.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmFinancialInstrumentIdentification
 * SecuritiesFinancingModificationInstructionV05.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV05#mmFinancialInstrumentIdentification
 * IntraPositionMovementConfirmationV05.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV05#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV05.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV04#mmUnderlyingSecurity
 * CorporateActionNarrativeV04.mmUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07#mmFinancialInstrumentIdentification
 * SecuritiesFinancingInstructionV07.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV06#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV06.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV07#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionGenerationNotificationV07.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionConfirmationV07.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV06#mmFinancialInstrumentIdentification
 * IntraPositionMovementConfirmationV06.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV06#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionReversalAdviceV06.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06#mmFinancialInstrumentIdentification
 * SecuritiesFinancingModificationInstructionV06.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV07#mmFinancialInstrumentIdentification
 * SecuritiesFinancingConfirmationV07.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionInstructionV07.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV07#mmFinancialInstrumentIdentification
 * IntraPositionMovementConfirmationV07.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV08#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionGenerationNotificationV08.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV07.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV08#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionConfirmationV08.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV08#mmFinancialInstrumentIdentification
 * SecuritiesFinancingInstructionV08.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV08#mmFinancialInstrumentIdentification
 * SecuritiesFinancingConfirmationV08.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV07#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionReversalAdviceV07.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionInstructionV08.
 * mmFinancialInstrumentIdentification}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintDescriptionPresenceRule#forSecurityIdentification19
 * ConstraintDescriptionPresenceRule.forSecurityIdentification19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherIdentificationPresenceRule#forSecurityIdentification19
 * ConstraintOtherIdentificationPresenceRule.forSecurityIdentification19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintISINPresenceRule#forSecurityIdentification19
 * ConstraintISINPresenceRule.forSecurityIdentification19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDescriptionUsageRule#forSecurityIdentification19
 * ConstraintDescriptionUsageRule.forSecurityIdentification19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintISINGuideline#forSecurityIdentification19
 * ConstraintISINGuideline.forSecurityIdentification19}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityIdentification19"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a security."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
 * SecurityIdentification14}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityIdentification19", propOrder = {"iSIN", "otherIdentification", "description"})
public class SecurityIdentification19 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ISIN")
	protected ISINOct2015Identifier iSIN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Securities Identification Number (ISIN). A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#mmISIN
	 * SecurityIdentification14.mmISIN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityIdentification19, Optional<ISINOct2015Identifier>> mmISIN = new MMMessageAttribute<SecurityIdentification19, Optional<ISINOct2015Identifier>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityIdentification19.mmObject();
			isDerived = false;
			xmlTag = "ISIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISIN";
			definition = "International Securities Identification Number (ISIN). A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country.";
			previousVersion_lazy = () -> SecurityIdentification14.mmISIN;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}

		@Override
		public Optional<ISINOct2015Identifier> getValue(SecurityIdentification19 obj) {
			return obj.getISIN();
		}

		@Override
		public void setValue(SecurityIdentification19 obj, Optional<ISINOct2015Identifier> value) {
			obj.setISIN(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrId")
	protected List<OtherIdentification1> otherIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherIdentification1
	 * OtherIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a security by proprietary or domestic identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#mmOtherIdentification
	 * SecurityIdentification14.mmOtherIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityIdentification19, List<OtherIdentification1>> mmOtherIdentification = new MMMessageAssociationEnd<SecurityIdentification19, List<OtherIdentification1>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityIdentification19.mmObject();
			isDerived = false;
			xmlTag = "OthrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIdentification";
			definition = "Identification of a security by proprietary or domestic identification scheme.";
			previousVersion_lazy = () -> SecurityIdentification14.mmOtherIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherIdentification1.mmObject();
		}

		@Override
		public List<OtherIdentification1> getValue(SecurityIdentification19 obj) {
			return obj.getOtherIdentification();
		}

		@Override
		public void setValue(SecurityIdentification19 obj, List<OtherIdentification1> value) {
			obj.setOtherIdentification(value);
		}
	};
	@XmlElement(name = "Desc")
	protected Max140Text description;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Textual description of a security instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#mmDescription
	 * SecurityIdentification14.mmDescription}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityIdentification19, Optional<Max140Text>> mmDescription = new MMMessageAttribute<SecurityIdentification19, Optional<Max140Text>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityIdentification19.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Textual description of a security instrument.";
			previousVersion_lazy = () -> SecurityIdentification14.mmDescription;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(SecurityIdentification19 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(SecurityIdentification19 obj, Optional<Max140Text> value) {
			obj.setDescription(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityIdentification19.mmISIN, com.tools20022.repository.msg.SecurityIdentification19.mmOtherIdentification,
						com.tools20022.repository.msg.SecurityIdentification19.mmDescription);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV06.mmFinancialInstrumentIdentification, IntraPositionMovementInstructionV04.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionConfirmationV06.mmFinancialInstrumentIdentification, SecuritiesFinancingInstructionV06.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionGenerationNotificationV06.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionReversalAdviceV05.mmFinancialInstrumentIdentification,
						SecuritiesFinancingConfirmationV06.mmFinancialInstrumentIdentification, SecuritiesFinancingModificationInstructionV05.mmFinancialInstrumentIdentification,
						IntraPositionMovementConfirmationV05.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionAllegementNotificationV05.mmFinancialInstrumentIdentification,
						CorporateActionNarrativeV04.mmUnderlyingSecurity, SecuritiesFinancingInstructionV07.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionAllegementNotificationV06.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionGenerationNotificationV07.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionConfirmationV07.mmFinancialInstrumentIdentification,
						IntraPositionMovementConfirmationV06.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionReversalAdviceV06.mmFinancialInstrumentIdentification,
						SecuritiesFinancingModificationInstructionV06.mmFinancialInstrumentIdentification, SecuritiesFinancingConfirmationV07.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionInstructionV07.mmFinancialInstrumentIdentification, IntraPositionMovementConfirmationV07.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionGenerationNotificationV08.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionAllegementNotificationV07.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionConfirmationV08.mmFinancialInstrumentIdentification, SecuritiesFinancingInstructionV08.mmFinancialInstrumentIdentification,
						SecuritiesFinancingConfirmationV08.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionReversalAdviceV07.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionInstructionV08.mmFinancialInstrumentIdentification);
				trace_lazy = () -> SecuritiesIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDescriptionPresenceRule.forSecurityIdentification19,
						com.tools20022.repository.constraints.ConstraintOtherIdentificationPresenceRule.forSecurityIdentification19, com.tools20022.repository.constraints.ConstraintISINPresenceRule.forSecurityIdentification19,
						com.tools20022.repository.constraints.ConstraintDescriptionUsageRule.forSecurityIdentification19, com.tools20022.repository.constraints.ConstraintISINGuideline.forSecurityIdentification19);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityIdentification19";
				definition = "Identification of a security.";
				previousVersion_lazy = () -> SecurityIdentification14.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISINOct2015Identifier> getISIN() {
		return iSIN == null ? Optional.empty() : Optional.of(iSIN);
	}

	public SecurityIdentification19 setISIN(ISINOct2015Identifier iSIN) {
		this.iSIN = iSIN;
		return this;
	}

	public List<OtherIdentification1> getOtherIdentification() {
		return otherIdentification == null ? otherIdentification = new ArrayList<>() : otherIdentification;
	}

	public SecurityIdentification19 setOtherIdentification(List<OtherIdentification1> otherIdentification) {
		this.otherIdentification = Objects.requireNonNull(otherIdentification);
		return this;
	}

	public Optional<Max140Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public SecurityIdentification19 setDescription(Max140Text description) {
		this.description = description;
		return this;
	}
}