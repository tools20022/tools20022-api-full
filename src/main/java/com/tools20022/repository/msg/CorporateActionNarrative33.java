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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.RestrictedFINXMax350Text;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionDistribution;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative33#mmInformationToComplyWith
 * CorporateActionNarrative33.mmInformationToComplyWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative33#mmDeliveryDetails
 * CorporateActionNarrative33.mmDeliveryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative33#mmForeignExchangeInstructionsAdditionalInformation
 * CorporateActionNarrative33.mmForeignExchangeInstructionsAdditionalInformation
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative33#mmInstructionAdditionalInformation
 * CorporateActionNarrative33.mmInstructionAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
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
 * "CorporateActionNarrative33"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the information to comply with."</li>
 * </ul>
 */
public class CorporateActionNarrative33 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<RestrictedFINXMax350Text> informationToComplyWith;
	/**
	 * Provides information conditions to the account owner that are to be
	 * complied with, for example, not open to US/Canadian residents, Qualified
	 * Institutional Buyers (QIB) or Sophisticated Investor Letter (SIL) to be
	 * provided.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative33
	 * CorporateActionNarrative33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfToCmplyWth"</li>
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
	public static final MMMessageAttribute mmInformationToComplyWith = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmInformationToComplyWith;
			componentContext_lazy = () -> CorporateActionNarrative33.mmObject();
			isDerived = false;
			xmlTag = "InfToCmplyWth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationToComplyWith";
			definition = "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or Sophisticated Investor Letter (SIL) to be provided.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};
	protected List<RestrictedFINXMax350Text> deliveryDetails;
	/**
	 * Provides additional information on the delivery details of the outturned
	 * (derived) securities. This narrative is only to be used in case the
	 * securities are not eligible at the agent/custodian, and may not be used
	 * for settlement instructions.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative33
	 * CorporateActionNarrative33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryDtls"</li>
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
	public static final MMMessageAttribute mmDeliveryDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction;
			componentContext_lazy = () -> CorporateActionNarrative33.mmObject();
			isDerived = false;
			xmlTag = "DlvryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryDetails";
			definition = "Provides additional information on the delivery details of the outturned (derived) securities. This narrative is only to be used in case the securities are not eligible at the agent/custodian, and may not be used for settlement instructions.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};
	protected List<RestrictedFINXMax350Text> foreignExchangeInstructionsAdditionalInformation;
	/**
	 * Provides additional details pertaining to foreign exchange instructions.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative33
	 * CorporateActionNarrative33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXInstrsAddtlInf"</li>
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
	public static final MMMessageAttribute mmForeignExchangeInstructionsAdditionalInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmExchangeRate;
			componentContext_lazy = () -> CorporateActionNarrative33.mmObject();
			isDerived = false;
			xmlTag = "FXInstrsAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeInstructionsAdditionalInformation";
			definition = "Provides additional details pertaining to foreign exchange instructions.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};
	protected List<RestrictedFINXMax350Text> instructionAdditionalInformation;
	/**
	 * Provides additional details pertaining to the corporate action
	 * instruction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative33
	 * CorporateActionNarrative33}</li>
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
	public static final MMMessageAttribute mmInstructionAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNarrative33.mmObject();
			isDerived = false;
			xmlTag = "InstrAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformation";
			definition = "Provides additional details pertaining to the corporate action instruction.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionNarrative33.mmInformationToComplyWith, CorporateActionNarrative33.mmDeliveryDetails, CorporateActionNarrative33.mmForeignExchangeInstructionsAdditionalInformation,
						CorporateActionNarrative33.mmInstructionAdditionalInformation);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrative33";
				definition = "Provides additional information such as the information to comply with.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<RestrictedFINXMax350Text> getInformationToComplyWith() {
		return informationToComplyWith;
	}

	public void setInformationToComplyWith(List<RestrictedFINXMax350Text> informationToComplyWith) {
		this.informationToComplyWith = informationToComplyWith;
	}

	public List<RestrictedFINXMax350Text> getDeliveryDetails() {
		return deliveryDetails;
	}

	public void setDeliveryDetails(List<RestrictedFINXMax350Text> deliveryDetails) {
		this.deliveryDetails = deliveryDetails;
	}

	public List<RestrictedFINXMax350Text> getForeignExchangeInstructionsAdditionalInformation() {
		return foreignExchangeInstructionsAdditionalInformation;
	}

	public void setForeignExchangeInstructionsAdditionalInformation(List<RestrictedFINXMax350Text> foreignExchangeInstructionsAdditionalInformation) {
		this.foreignExchangeInstructionsAdditionalInformation = foreignExchangeInstructionsAdditionalInformation;
	}

	public List<RestrictedFINXMax350Text> getInstructionAdditionalInformation() {
		return instructionAdditionalInformation;
	}

	public void setInstructionAdditionalInformation(List<RestrictedFINXMax350Text> instructionAdditionalInformation) {
		this.instructionAdditionalInformation = instructionAdditionalInformation;
	}
}