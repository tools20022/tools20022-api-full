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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06;
import com.tools20022.repository.codeset.AccountManagementType2Code;
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
 * Information about the type of request or instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation3#mmConfirmationType
 * AccountManagementConfirmation3.mmConfirmationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation3#mmAccountApplicationIdentification
 * AccountManagementConfirmation3.mmAccountApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation3#mmClientReference
 * AccountManagementConfirmation3.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation3#mmCounterpartyReference
 * AccountManagementConfirmation3.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation3#mmExistingAccountIdentification
 * AccountManagementConfirmation3.mmExistingAccountIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmConfirmationDetails
 * AccountDetailsConfirmationV06.mmConfirmationDetails}</li>
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
 * "AccountManagementConfirmation3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the type of request or instruction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountManagementConfirmation4
 * AccountManagementConfirmation4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation2
 * AccountManagementConfirmation2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AccountManagementConfirmation3", propOrder = {"confirmationType", "accountApplicationIdentification", "clientReference", "counterpartyReference", "existingAccountIdentification"})
public class AccountManagementConfirmation3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AccountManagementType2Code confirmationType;
	/**
	 * Specifies if the confirmation message applies to an account opening, an
	 * account modification request or to a get account details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementType2Code
	 * AccountManagementType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation3
	 * AccountManagementConfirmation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the confirmation message applies to an account opening,  an account modification request or to a get account details."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation4#mmConfirmationType
	 * AccountManagementConfirmation4.mmConfirmationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation2#mmConfirmationType
	 * AccountManagementConfirmation2.mmConfirmationType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfirmationType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountManagementConfirmation3.mmObject();
			isDerived = false;
			xmlTag = "ConfTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationType";
			definition = "Specifies if the confirmation message applies to an account opening,  an account modification request or to a get account details.";
			nextVersions_lazy = () -> Arrays.asList(AccountManagementConfirmation4.mmConfirmationType);
			previousVersion_lazy = () -> AccountManagementConfirmation2.mmConfirmationType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountManagementType2Code.mmObject();
		}
	};
	protected Max35Text accountApplicationIdentification;
	/**
	 * Unique and unambiguous identifier of the account opening or modification
	 * instruction at application level.
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
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation3
	 * AccountManagementConfirmation3}</li>
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
	 * "Unique and unambiguous identifier of the account opening or modification instruction at application level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation4#mmAccountApplicationIdentification
	 * AccountManagementConfirmation4.mmAccountApplicationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation2#mmAccountApplicationIdentification
	 * AccountManagementConfirmation2.mmAccountApplicationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountApplicationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountManagementConfirmation3.mmObject();
			isDerived = false;
			xmlTag = "AcctApplId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountApplicationIdentification";
			definition = "Unique and unambiguous identifier of the account opening or modification instruction at application level.";
			nextVersions_lazy = () -> Arrays.asList(AccountManagementConfirmation4.mmAccountApplicationIdentification);
			previousVersion_lazy = () -> AccountManagementConfirmation2.mmAccountApplicationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text clientReference;
	/**
	 * Unique and unambiguous identification of a transaction, for example, a
	 * transfer, as assigned by the investor or account owner.
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
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation3
	 * AccountManagementConfirmation3}</li>
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
	 * "Unique and unambiguous identification of a transaction, for example, a transfer, as assigned by the investor or account owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation4#mmClientReference
	 * AccountManagementConfirmation4.mmClientReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation2#mmClientReference
	 * AccountManagementConfirmation2.mmClientReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> AccountManagementConfirmation3.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous identification of a transaction, for example, a transfer, as assigned by the investor or account owner.";
			nextVersions_lazy = () -> Arrays.asList(AccountManagementConfirmation4.mmClientReference);
			previousVersion_lazy = () -> AccountManagementConfirmation2.mmClientReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AdditionalReference6 counterpartyReference;
	/**
	 * Unambiguous identification of the transaction, for example, a transfer,
	 * as allocated by the counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCounterpartyReference
	 * TradeIdentification.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation3
	 * AccountManagementConfirmation3}</li>
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
	 * "Unambiguous identification of the transaction, for example, a transfer, as allocated by the counterparty."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation4#mmCounterpartyReference
	 * AccountManagementConfirmation4.mmCounterpartyReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation2#mmCounterpartyReference
	 * AccountManagementConfirmation2.mmCounterpartyReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartyReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCounterpartyReference;
			componentContext_lazy = () -> AccountManagementConfirmation3.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the transaction, for example, a transfer, as allocated by the counterparty.";
			nextVersions_lazy = () -> Arrays.asList(AccountManagementConfirmation4.mmCounterpartyReference);
			previousVersion_lazy = () -> AccountManagementConfirmation2.mmCounterpartyReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AdditionalReference6.mmObject();
		}
	};
	protected Max35Text existingAccountIdentification;
	/**
	 * Account to which the account opening is related.
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
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation3
	 * AccountManagementConfirmation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExstgAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExistingAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to which the account opening is related."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation4#mmExistingAccountIdentification
	 * AccountManagementConfirmation4.mmExistingAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExistingAccountIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountManagementConfirmation3.mmObject();
			isDerived = false;
			xmlTag = "ExstgAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExistingAccountIdentification";
			definition = "Account to which the account opening is related.";
			nextVersions_lazy = () -> Arrays.asList(AccountManagementConfirmation4.mmExistingAccountIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AccountManagementConfirmation3.mmConfirmationType, AccountManagementConfirmation3.mmAccountApplicationIdentification, AccountManagementConfirmation3.mmClientReference,
						AccountManagementConfirmation3.mmCounterpartyReference, AccountManagementConfirmation3.mmExistingAccountIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmConfirmationDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountManagementConfirmation3";
				definition = "Information about the type of request or instruction.";
				nextVersions_lazy = () -> Arrays.asList(AccountManagementConfirmation4.mmObject());
				previousVersion_lazy = () -> AccountManagementConfirmation2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ConfTp", required = true)
	public AccountManagementType2Code getConfirmationType() {
		return confirmationType;
	}

	public void setConfirmationType(AccountManagementType2Code confirmationType) {
		this.confirmationType = confirmationType;
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
	public AdditionalReference6 getCounterpartyReference() {
		return counterpartyReference;
	}

	public void setCounterpartyReference(com.tools20022.repository.msg.AdditionalReference6 counterpartyReference) {
		this.counterpartyReference = counterpartyReference;
	}

	@XmlElement(name = "ExstgAcctId")
	public Max35Text getExistingAccountIdentification() {
		return existingAccountIdentification;
	}

	public void setExistingAccountIdentification(Max35Text existingAccountIdentification) {
		this.existingAccountIdentification = existingAccountIdentification;
	}
}