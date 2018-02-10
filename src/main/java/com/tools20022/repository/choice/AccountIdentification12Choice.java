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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02;
import com.tools20022.repository.area.seev.CorporateActionNotificationV02;
import com.tools20022.repository.entity.AccountIdentification;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountAndBalance9;
import com.tools20022.repository.msg.AccountIdentification10;
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
 * Choice between all accounts (GENR - General in ISO 15022) or one or more
 * selected accounts and balance information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification12Choice#mmForAllAccounts
 * AccountIdentification12Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification12Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification12Choice.mmAccountsListAndBalanceDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AccountIdentification
 * AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmAccountDetails
 * CorporateActionMovementPreliminaryAdviceV02.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmAccountDetails
 * CorporateActionNotificationV02.mmAccountDetails}</li>
 * </ul>
 * </li>
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
 * "AccountIdentification12Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between all accounts (GENR - General in ISO 15022) or one or more selected accounts and balance information."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification18Choice
 * AccountIdentification18Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountIdentification12Choice", propOrder = {"forAllAccounts", "accountsListAndBalanceDetails"})
public class AccountIdentification12Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ForAllAccts", required = true)
	protected AccountIdentification10 forAllAccounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification10
	 * AccountIdentification10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification12Choice
	 * AccountIdentification12Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ForAllAccts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97C::SAFE//GENR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForAllAccounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All safekeeping accounts that own underlying financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForAllAccounts = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentification12Choice.mmObject();
			isDerived = false;
			xmlTag = "ForAllAccts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97C::SAFE//GENR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForAllAccounts";
			definition = "All safekeeping accounts that own underlying financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AccountIdentification10.mmObject();
		}
	};
	@XmlElement(name = "AcctsListAndBalDtls", required = true)
	protected List<AccountAndBalance9> accountsListAndBalanceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountAndBalance9
	 * AccountAndBalance9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification12Choice
	 * AccountIdentification12Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctsListAndBalDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountsListAndBalanceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Selected safekeeping accounts list (and optionally balance information) to which the corporate action event applies."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountsListAndBalanceDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentification12Choice.mmObject();
			isDerived = false;
			xmlTag = "AcctsListAndBalDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountsListAndBalanceDetails";
			definition = "Selected safekeeping accounts list (and optionally balance information) to which the corporate action event applies.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AccountAndBalance9.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentification12Choice.mmForAllAccounts, com.tools20022.repository.choice.AccountIdentification12Choice.mmAccountsListAndBalanceDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV02.mmAccountDetails, CorporateActionNotificationV02.mmAccountDetails);
				trace_lazy = () -> AccountIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountIdentification12Choice";
				definition = "Choice between all accounts (GENR - General in ISO 15022) or one or more selected accounts and balance information.";
				nextVersions_lazy = () -> Arrays.asList(AccountIdentification18Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentification10 getForAllAccounts() {
		return forAllAccounts;
	}

	public AccountIdentification12Choice setForAllAccounts(AccountIdentification10 forAllAccounts) {
		this.forAllAccounts = Objects.requireNonNull(forAllAccounts);
		return this;
	}

	public List<AccountAndBalance9> getAccountsListAndBalanceDetails() {
		return accountsListAndBalanceDetails == null ? accountsListAndBalanceDetails = new ArrayList<>() : accountsListAndBalanceDetails;
	}

	public AccountIdentification12Choice setAccountsListAndBalanceDetails(List<AccountAndBalance9> accountsListAndBalanceDetails) {
		this.accountsListAndBalanceDetails = Objects.requireNonNull(accountsListAndBalanceDetails);
		return this;
	}
}