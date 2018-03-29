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
import com.tools20022.repository.datatype.RestrictedFINXMax350Text;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionDistribution;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information such as the information to comply with.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative13#mmInformationToComplyWith
 * CorporateActionNarrative13.mmInformationToComplyWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative13#mmDeliveryDetails
 * CorporateActionNarrative13.mmDeliveryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative13#mmForeignExchangeInstructionsAdditionalInformation
 * CorporateActionNarrative13.mmForeignExchangeInstructionsAdditionalInformation
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative13#mmDisclaimer
 * CorporateActionNarrative13.mmDisclaimer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative13#mmInstructionAdditionalInformation
 * CorporateActionNarrative13.mmInstructionAdditionalInformation}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNarrative13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the information to comply with."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNarrative13", propOrder = {"informationToComplyWith", "deliveryDetails", "foreignExchangeInstructionsAdditionalInformation", "disclaimer", "instructionAdditionalInformation"})
public class CorporateActionNarrative13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InfToCmplyWth")
	protected List<RestrictedFINXMax350Text> informationToComplyWith;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmInformationToComplyWith
	 * BiddingConditions.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative13
	 * CorporateActionNarrative13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfToCmplyWth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::COMP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationToComplyWith"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or Sophisticated Investor Letter (SIL) to be provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNarrative13, List<RestrictedFINXMax350Text>> mmInformationToComplyWith = new MMMessageAttribute<CorporateActionNarrative13, List<RestrictedFINXMax350Text>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmInformationToComplyWith;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative13.mmObject();
			isDerived = false;
			xmlTag = "InfToCmplyWth";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::COMP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationToComplyWith";
			definition = "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or Sophisticated Investor Letter (SIL) to be provided.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}

		@Override
		public List<RestrictedFINXMax350Text> getValue(CorporateActionNarrative13 obj) {
			return obj.getInformationToComplyWith();
		}

		@Override
		public void setValue(CorporateActionNarrative13 obj, List<RestrictedFINXMax350Text> value) {
			obj.setInformationToComplyWith(value);
		}
	};
	@XmlElement(name = "DlvryDtls")
	protected List<RestrictedFINXMax350Text> deliveryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmCorporateActionProceedsDeliveryInstruction
	 * CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative13
	 * CorporateActionNarrative13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::DLVR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information on the delivery details of the outturned (derived) securities. This narrative is only to be used in case the securities are not eligible at the agent/custodian, and may not be used for settlement instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNarrative13, List<RestrictedFINXMax350Text>> mmDeliveryDetails = new MMMessageAttribute<CorporateActionNarrative13, List<RestrictedFINXMax350Text>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative13.mmObject();
			isDerived = false;
			xmlTag = "DlvryDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::DLVR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryDetails";
			definition = "Provides additional information on the delivery details of the outturned (derived) securities. This narrative is only to be used in case the securities are not eligible at the agent/custodian, and may not be used for settlement instructions.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}

		@Override
		public List<RestrictedFINXMax350Text> getValue(CorporateActionNarrative13 obj) {
			return obj.getDeliveryDetails();
		}

		@Override
		public void setValue(CorporateActionNarrative13 obj, List<RestrictedFINXMax350Text> value) {
			obj.setDeliveryDetails(value);
		}
	};
	@XmlElement(name = "FXInstrsAddtlInf")
	protected List<RestrictedFINXMax350Text> foreignExchangeInstructionsAdditionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmExchangeRate
	 * CorporateActionEvent.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative13
	 * CorporateActionNarrative13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXInstrsAddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::FXIN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeInstructionsAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional details pertaining to foreign exchange instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNarrative13, List<RestrictedFINXMax350Text>> mmForeignExchangeInstructionsAdditionalInformation = new MMMessageAttribute<CorporateActionNarrative13, List<RestrictedFINXMax350Text>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative13.mmObject();
			isDerived = false;
			xmlTag = "FXInstrsAddtlInf";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::FXIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeInstructionsAdditionalInformation";
			definition = "Provides additional details pertaining to foreign exchange instructions.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}

		@Override
		public List<RestrictedFINXMax350Text> getValue(CorporateActionNarrative13 obj) {
			return obj.getForeignExchangeInstructionsAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionNarrative13 obj, List<RestrictedFINXMax350Text> value) {
			obj.setForeignExchangeInstructionsAdditionalInformation(value);
		}
	};
	@XmlElement(name = "Dsclmr")
	protected List<RestrictedFINXMax350Text> disclaimer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative13
	 * CorporateActionNarrative13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dsclmr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::DISC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disclaimer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disclaimer relative to the information provided in the message. It may be ignored for automated processing. No information about the instruction itself is allowed here."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNarrative13, List<RestrictedFINXMax350Text>> mmDisclaimer = new MMMessageAttribute<CorporateActionNarrative13, List<RestrictedFINXMax350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative13.mmObject();
			isDerived = false;
			xmlTag = "Dsclmr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::DISC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclaimer";
			definition = "Disclaimer relative to the information provided in the message. It may be ignored for automated processing. No information about the instruction itself is allowed here.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}

		@Override
		public List<RestrictedFINXMax350Text> getValue(CorporateActionNarrative13 obj) {
			return obj.getDisclaimer();
		}

		@Override
		public void setValue(CorporateActionNarrative13 obj, List<RestrictedFINXMax350Text> value) {
			obj.setDisclaimer(value);
		}
	};
	@XmlElement(name = "InstrAddtlInf")
	protected List<RestrictedFINXMax350Text> instructionAdditionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative13
	 * CorporateActionNarrative13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrAddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional details pertaining to the corporate action instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNarrative13, List<RestrictedFINXMax350Text>> mmInstructionAdditionalInformation = new MMMessageAttribute<CorporateActionNarrative13, List<RestrictedFINXMax350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative13.mmObject();
			isDerived = false;
			xmlTag = "InstrAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformation";
			definition = "Provides additional details pertaining to the corporate action instruction.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}

		@Override
		public List<RestrictedFINXMax350Text> getValue(CorporateActionNarrative13 obj) {
			return obj.getInstructionAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionNarrative13 obj, List<RestrictedFINXMax350Text> value) {
			obj.setInstructionAdditionalInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative13.mmInformationToComplyWith, com.tools20022.repository.msg.CorporateActionNarrative13.mmDeliveryDetails,
						com.tools20022.repository.msg.CorporateActionNarrative13.mmForeignExchangeInstructionsAdditionalInformation, com.tools20022.repository.msg.CorporateActionNarrative13.mmDisclaimer,
						com.tools20022.repository.msg.CorporateActionNarrative13.mmInstructionAdditionalInformation);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrative13";
				definition = "Provides additional information such as the information to comply with.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<RestrictedFINXMax350Text> getInformationToComplyWith() {
		return informationToComplyWith == null ? informationToComplyWith = new ArrayList<>() : informationToComplyWith;
	}

	public CorporateActionNarrative13 setInformationToComplyWith(List<RestrictedFINXMax350Text> informationToComplyWith) {
		this.informationToComplyWith = Objects.requireNonNull(informationToComplyWith);
		return this;
	}

	public List<RestrictedFINXMax350Text> getDeliveryDetails() {
		return deliveryDetails == null ? deliveryDetails = new ArrayList<>() : deliveryDetails;
	}

	public CorporateActionNarrative13 setDeliveryDetails(List<RestrictedFINXMax350Text> deliveryDetails) {
		this.deliveryDetails = Objects.requireNonNull(deliveryDetails);
		return this;
	}

	public List<RestrictedFINXMax350Text> getForeignExchangeInstructionsAdditionalInformation() {
		return foreignExchangeInstructionsAdditionalInformation == null ? foreignExchangeInstructionsAdditionalInformation = new ArrayList<>() : foreignExchangeInstructionsAdditionalInformation;
	}

	public CorporateActionNarrative13 setForeignExchangeInstructionsAdditionalInformation(List<RestrictedFINXMax350Text> foreignExchangeInstructionsAdditionalInformation) {
		this.foreignExchangeInstructionsAdditionalInformation = Objects.requireNonNull(foreignExchangeInstructionsAdditionalInformation);
		return this;
	}

	public List<RestrictedFINXMax350Text> getDisclaimer() {
		return disclaimer == null ? disclaimer = new ArrayList<>() : disclaimer;
	}

	public CorporateActionNarrative13 setDisclaimer(List<RestrictedFINXMax350Text> disclaimer) {
		this.disclaimer = Objects.requireNonNull(disclaimer);
		return this;
	}

	public List<RestrictedFINXMax350Text> getInstructionAdditionalInformation() {
		return instructionAdditionalInformation == null ? instructionAdditionalInformation = new ArrayList<>() : instructionAdditionalInformation;
	}

	public CorporateActionNarrative13 setInstructionAdditionalInformation(List<RestrictedFINXMax350Text> instructionAdditionalInformation) {
		this.instructionAdditionalInformation = Objects.requireNonNull(instructionAdditionalInformation);
		return this;
	}
}