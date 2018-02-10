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
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.entity.AccountIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountIdentification10;
import com.tools20022.repository.msg.AccountIdentification15;
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
 * selected accounts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification13Choice#mmForAllAccounts
 * AccountIdentification13Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification13Choice#mmAccountsList
 * AccountIdentification13Choice.mmAccountsList}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#mmAccountsDetails
 * CorporateActionCancellationAdviceV02.mmAccountsDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#mmAccountsDetails
 * CorporateActionCancellationAdviceV03.mmAccountsDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#mmAccountsDetails
 * CorporateActionCancellationAdviceV04.mmAccountsDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#mmAccountDetails
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.
 * mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#mmAccountDetails
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.
 * mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmAccountDetails
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmAccountDetails
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
 * mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#mmAccountsDetails
 * CorporateActionCancellationAdviceV05.mmAccountsDetails}</li>
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
 * "AccountIdentification13Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between all accounts (GENR - General in ISO 15022) or one or more selected accounts."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification29Choice
 * AccountIdentification29Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountIdentification13Choice", propOrder = {"forAllAccounts", "accountsList"})
public class AccountIdentification13Choice {

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
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification13Choice
	 * AccountIdentification13Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification29Choice#mmForAllAccounts
	 * AccountIdentification29Choice.mmForAllAccounts}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForAllAccounts = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentification13Choice.mmObject();
			isDerived = false;
			xmlTag = "ForAllAccts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97C::SAFE//GENR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForAllAccounts";
			definition = "All safekeeping accounts that own underlying financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(AccountIdentification29Choice.mmForAllAccounts);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AccountIdentification10.mmObject();
		}
	};
	@XmlElement(name = "AcctsList", required = true)
	protected List<AccountIdentification15> accountsList;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification15
	 * AccountIdentification15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification13Choice
	 * AccountIdentification13Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctsList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R::ACCTINFO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountsList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Selected safekeeping accounts list to which the corporate action event applies."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification29Choice#mmAccountsList
	 * AccountIdentification29Choice.mmAccountsList}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountsList = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentification13Choice.mmObject();
			isDerived = false;
			xmlTag = "AcctsList";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R::ACCTINFO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountsList";
			definition = "Selected safekeeping accounts list to which the corporate action event applies.";
			nextVersions_lazy = () -> Arrays.asList(AccountIdentification29Choice.mmAccountsList);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AccountIdentification15.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentification13Choice.mmForAllAccounts, com.tools20022.repository.choice.AccountIdentification13Choice.mmAccountsList);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionCancellationAdviceV02.mmAccountsDetails, CorporateActionCancellationAdviceV03.mmAccountsDetails, CorporateActionCancellationAdviceV04.mmAccountsDetails,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmAccountDetails, CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmAccountDetails,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmAccountDetails, CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmAccountDetails, CorporateActionCancellationAdviceV05.mmAccountsDetails);
				trace_lazy = () -> AccountIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountIdentification13Choice";
				definition = "Choice between all accounts (GENR - General in ISO 15022) or one or more selected accounts.";
				nextVersions_lazy = () -> Arrays.asList(AccountIdentification29Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentification10 getForAllAccounts() {
		return forAllAccounts;
	}

	public AccountIdentification13Choice setForAllAccounts(AccountIdentification10 forAllAccounts) {
		this.forAllAccounts = Objects.requireNonNull(forAllAccounts);
		return this;
	}

	public List<AccountIdentification15> getAccountsList() {
		return accountsList == null ? accountsList = new ArrayList<>() : accountsList;
	}

	public AccountIdentification13Choice setAccountsList(List<AccountIdentification15> accountsList) {
		this.accountsList = Objects.requireNonNull(accountsList);
		return this;
	}
}