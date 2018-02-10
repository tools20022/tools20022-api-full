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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.acmt.AccountModificationInstructionV02;
import com.tools20022.repository.area.acmt.AccountModificationInstructionV03;
import com.tools20022.repository.area.acmt.AccountModificationInstructionV04;
import com.tools20022.repository.area.acmt.AccountModificationInstructionV05;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.InvestmentAccount;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a unique account identification and a set of account selection
 * criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection2#AccountIdentificationOrOtherAccountSelectionCriteriaRule
 * InvestmentAccountSelection2.
 * AccountIdentificationOrOtherAccountSelectionCriteriaRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection2#mmAccountIdentification
 * InvestmentAccountSelection2.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection2#mmOtherAccountSelectionData
 * InvestmentAccountSelection2.mmOtherAccountSelectionData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
 * InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmInvestmentAccountSelection
 * AccountModificationInstructionV02.mmInvestmentAccountSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmInvestmentAccountSelection
 * AccountModificationInstructionV03.mmInvestmentAccountSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmInvestmentAccountSelection
 * AccountModificationInstructionV04.mmInvestmentAccountSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmInvestmentAccountSelection
 * AccountModificationInstructionV05.mmInvestmentAccountSelection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentAccountSelection2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a unique account identification and a set of account selection criteria."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentAccountSelection2", propOrder = {"accountIdentification", "otherAccountSelectionData"})
public class InvestmentAccountSelection2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId", required = true)
	protected AccountIdentification1 accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification1
	 * AccountIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection2
	 * InvestmentAccountSelection2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountSelection2.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.AccountIdentification1.mmObject();
		}
	};
	@XmlElement(name = "OthrAcctSelctnData", required = true)
	protected InvestmentAccount29 otherAccountSelectionData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount29
	 * InvestmentAccount29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection2
	 * InvestmentAccountSelection2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAcctSelctnData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAccountSelectionData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Various investment account information used to select a specific account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherAccountSelectionData = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountSelection2.mmObject();
			isDerived = false;
			xmlTag = "OthrAcctSelctnData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAccountSelectionData";
			definition = "Various investment account information used to select a specific account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccount29.mmObject();
		}
	};
	/**
	 * Either AccountIdentification or OtherAccountSelectionCriteria must be
	 * present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection2
	 * InvestmentAccountSelection2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection2#mmAccountIdentification
	 * InvestmentAccountSelection2.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection2#mmOtherAccountSelectionData
	 * InvestmentAccountSelection2.mmOtherAccountSelectionData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationOrOtherAccountSelectionCriteriaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AccountIdentification or OtherAccountSelectionCriteria must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor AccountIdentificationOrOtherAccountSelectionCriteriaRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationOrOtherAccountSelectionCriteriaRule";
			definition = "Either AccountIdentification or OtherAccountSelectionCriteria must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.InvestmentAccountSelection2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountSelection2.mmAccountIdentification, com.tools20022.repository.msg.InvestmentAccountSelection2.mmOtherAccountSelectionData);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountSelection2.mmAccountIdentification, com.tools20022.repository.msg.InvestmentAccountSelection2.mmOtherAccountSelectionData);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountModificationInstructionV02.mmInvestmentAccountSelection, AccountModificationInstructionV03.mmInvestmentAccountSelection,
						AccountModificationInstructionV04.mmInvestmentAccountSelection, AccountModificationInstructionV05.mmInvestmentAccountSelection);
				trace_lazy = () -> InvestmentAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "InvestmentAccountSelection2";
				definition = "Choice between a unique account identification and a set of account selection criteria.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountSelection2.AccountIdentificationOrOtherAccountSelectionCriteriaRule);
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentification1 getAccountIdentification() {
		return accountIdentification;
	}

	public InvestmentAccountSelection2 setAccountIdentification(com.tools20022.repository.msg.AccountIdentification1 accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public InvestmentAccount29 getOtherAccountSelectionData() {
		return otherAccountSelectionData;
	}

	public InvestmentAccountSelection2 setOtherAccountSelectionData(com.tools20022.repository.msg.InvestmentAccount29 otherAccountSelectionData) {
		this.otherAccountSelectionData = Objects.requireNonNull(otherAccountSelectionData);
		return this;
	}
}