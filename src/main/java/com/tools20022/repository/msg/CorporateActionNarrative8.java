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
import com.tools20022.repository.datatype.Max350Text;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative8#mmInformationToComplyWith
 * CorporateActionNarrative8.mmInformationToComplyWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative8#mmDeliveryDetails
 * CorporateActionNarrative8.mmDeliveryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative8#mmForeignExchangeInstructionsAdditionalInformation
 * CorporateActionNarrative8.mmForeignExchangeInstructionsAdditionalInformation}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative8#mmDisclaimer
 * CorporateActionNarrative8.mmDisclaimer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative8#mmInstructionAdditionalInformation
 * CorporateActionNarrative8.mmInstructionAdditionalInformation}</li>
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
 * "CorporateActionNarrative8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the information to comply with."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNarrative32
 * CorporateActionNarrative32}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CorporateActionNarrative8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Max350Text> informationToComplyWith;
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
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmInformationToComplyWith
	 * BiddingConditions.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative8
	 * CorporateActionNarrative8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative32#mmInformationToComplyWith
	 * CorporateActionNarrative32.mmInformationToComplyWith}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInformationToComplyWith = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmInformationToComplyWith;
			componentContext_lazy = () -> CorporateActionNarrative8.mmObject();
			isDerived = false;
			xmlTag = "InfToCmplyWth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationToComplyWith";
			definition = "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or Sophisticated Investor Letter (SIL) to be provided.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNarrative32.mmInformationToComplyWith);
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected List<Max350Text> deliveryDetails;
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
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmCorporateActionProceedsDeliveryInstruction
	 * CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative8
	 * CorporateActionNarrative8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative32#mmDeliveryDetails
	 * CorporateActionNarrative32.mmDeliveryDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveryDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction;
			componentContext_lazy = () -> CorporateActionNarrative8.mmObject();
			isDerived = false;
			xmlTag = "DlvryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryDetails";
			definition = "Provides additional information on the delivery details of the outturned (derived) securities. This narrative is only to be used in case the securities are not eligible at the agent/custodian, and may not be used for settlement instructions.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNarrative32.mmDeliveryDetails);
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected List<Max350Text> foreignExchangeInstructionsAdditionalInformation;
	/**
	 * Provides additional details pertaining to foreign exchange instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmExchangeRate
	 * CorporateActionEvent.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative8
	 * CorporateActionNarrative8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative32#mmForeignExchangeInstructionsAdditionalInformation
	 * CorporateActionNarrative32.
	 * mmForeignExchangeInstructionsAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForeignExchangeInstructionsAdditionalInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmExchangeRate;
			componentContext_lazy = () -> CorporateActionNarrative8.mmObject();
			isDerived = false;
			xmlTag = "FXInstrsAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeInstructionsAdditionalInformation";
			definition = "Provides additional details pertaining to foreign exchange instructions.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNarrative32.mmForeignExchangeInstructionsAdditionalInformation);
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected List<Max350Text> disclaimer;
	/**
	 * Disclaimer relative to the information provided in the message. It may be
	 * ignored for automated processing. No information about the instruction
	 * itself is allowed here.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative8
	 * CorporateActionNarrative8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dsclmr"</li>
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
	public static final MMMessageAttribute mmDisclaimer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNarrative8.mmObject();
			isDerived = false;
			xmlTag = "Dsclmr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclaimer";
			definition = "Disclaimer relative to the information provided in the message. It may be ignored for automated processing. No information about the instruction itself is allowed here.";
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected List<Max350Text> instructionAdditionalInformation;
	/**
	 * Provides additional details pertaining to the corporate action
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative8
	 * CorporateActionNarrative8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative32#mmInstructionAdditionalInformation
	 * CorporateActionNarrative32.mmInstructionAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNarrative8.mmObject();
			isDerived = false;
			xmlTag = "InstrAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionAdditionalInformation";
			definition = "Provides additional details pertaining to the corporate action instruction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNarrative32.mmInstructionAdditionalInformation);
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionNarrative8.mmInformationToComplyWith, CorporateActionNarrative8.mmDeliveryDetails, CorporateActionNarrative8.mmForeignExchangeInstructionsAdditionalInformation,
						CorporateActionNarrative8.mmDisclaimer, CorporateActionNarrative8.mmInstructionAdditionalInformation);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrative8";
				definition = "Provides additional information such as the information to comply with.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionNarrative32.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max350Text> getInformationToComplyWith() {
		return informationToComplyWith;
	}

	public void setInformationToComplyWith(List<Max350Text> informationToComplyWith) {
		this.informationToComplyWith = informationToComplyWith;
	}

	public List<Max350Text> getDeliveryDetails() {
		return deliveryDetails;
	}

	public void setDeliveryDetails(List<Max350Text> deliveryDetails) {
		this.deliveryDetails = deliveryDetails;
	}

	public List<Max350Text> getForeignExchangeInstructionsAdditionalInformation() {
		return foreignExchangeInstructionsAdditionalInformation;
	}

	public void setForeignExchangeInstructionsAdditionalInformation(List<Max350Text> foreignExchangeInstructionsAdditionalInformation) {
		this.foreignExchangeInstructionsAdditionalInformation = foreignExchangeInstructionsAdditionalInformation;
	}

	public List<Max350Text> getDisclaimer() {
		return disclaimer;
	}

	public void setDisclaimer(List<Max350Text> disclaimer) {
		this.disclaimer = disclaimer;
	}

	public List<Max350Text> getInstructionAdditionalInformation() {
		return instructionAdditionalInformation;
	}

	public void setInstructionAdditionalInformation(List<Max350Text> instructionAdditionalInformation) {
		this.instructionAdditionalInformation = instructionAdditionalInformation;
	}
}