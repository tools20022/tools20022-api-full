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
import com.tools20022.repository.area.acmt.AccountModificationInstructionV05;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestmentFundTransaction;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provide information about the reason for the modification and about the
 * application request which triggered this modification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification1#mmModificationReason
 * InvestmentAccountModification1.mmModificationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification1#mmAccountApplicationIdentification
 * InvestmentAccountModification1.mmAccountApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification1#mmClientReference
 * InvestmentAccountModification1.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification1#mmCounterpartyReference
 * InvestmentAccountModification1.mmCounterpartyReference}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmInstructionDetails
 * AccountModificationInstructionV05.mmInstructionDetails}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentAccountModification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provide information about the reason for the modification and about the application request which triggered this modification."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccountModification2
 * InvestmentAccountModification2}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModificationDetails
 * InvestmentAccountModificationDetails}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InvestmentAccountModification1", propOrder = {"modificationReason", "accountApplicationIdentification", "clientReference", "counterpartyReference"})
public class InvestmentAccountModification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text modificationReason;
	/**
	 * Reason for the modification brought to the investment account
	 * information.
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification1
	 * InvestmentAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for the modification brought to the investment account information."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification2#mmModificationReason
	 * InvestmentAccountModification2.mmModificationReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModificationDetails#mmModificationReason
	 * InvestmentAccountModificationDetails.mmModificationReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmModificationReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "ModRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationReason";
			definition = "Reason for the modification brought to the investment account information.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountModification2.mmModificationReason);
			previousVersion_lazy = () -> InvestmentAccountModificationDetails.mmModificationReason;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max35Text accountApplicationIdentification;
	/**
	 * Unique and unambiguous identifier of the account modification request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification1
	 * InvestmentAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctApplId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountApplicationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of the account modification request."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification2#mmAccountApplicationIdentification
	 * InvestmentAccountModification2.mmAccountApplicationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModificationDetails#mmAccountApplicationIdentification
	 * InvestmentAccountModificationDetails.mmAccountApplicationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountApplicationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "AcctApplId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountApplicationIdentification";
			definition = "Unique and unambiguous identifier of the account modification request.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountModification2.mmAccountApplicationIdentification);
			previousVersion_lazy = () -> InvestmentAccountModificationDetails.mmAccountApplicationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text clientReference;
	/**
	 * Unique and unambiguous investor's identification of a transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification1
	 * InvestmentAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of a transfer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification2#mmClientReference
	 * InvestmentAccountModification2.mmClientReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> InvestmentAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of a transfer.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountModification2.mmClientReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AdditionalReference2 counterpartyReference;
	/**
	 * Unambiguous identification of the transfer as allocated by the
	 * counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCounterpartyReference
	 * TradeIdentification.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification1
	 * InvestmentAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transfer as allocated by the counterparty."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification2#mmCounterpartyReference
	 * InvestmentAccountModification2.mmCounterpartyReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartyReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCounterpartyReference;
			componentContext_lazy = () -> InvestmentAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the transfer as allocated by the counterparty.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountModification2.mmCounterpartyReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AdditionalReference2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InvestmentAccountModification1.mmModificationReason, InvestmentAccountModification1.mmAccountApplicationIdentification, InvestmentAccountModification1.mmClientReference,
						InvestmentAccountModification1.mmCounterpartyReference);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountModificationInstructionV05.mmInstructionDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InvestmentAccountModification1";
				definition = "Provide information about the reason for the modification and about the application request which triggered this modification.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentAccountModification2.mmObject());
				previousVersion_lazy = () -> InvestmentAccountModificationDetails.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ModRsn")
	public Max350Text getModificationReason() {
		return modificationReason;
	}

	public void setModificationReason(Max350Text modificationReason) {
		this.modificationReason = modificationReason;
	}

	@XmlElement(name = "AcctApplId")
	public Max35Text getAccountApplicationIdentification() {
		return accountApplicationIdentification;
	}

	public void setAccountApplicationIdentification(Max35Text accountApplicationIdentification) {
		this.accountApplicationIdentification = accountApplicationIdentification;
	}

	@XmlElement(name = "ClntRef")
	public Max35Text getClientReference() {
		return clientReference;
	}

	public void setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
	}

	@XmlElement(name = "CtrPtyRef")
	public AdditionalReference2 getCounterpartyReference() {
		return counterpartyReference;
	}

	public void setCounterpartyReference(com.tools20022.repository.msg.AdditionalReference2 counterpartyReference) {
		this.counterpartyReference = counterpartyReference;
	}
}