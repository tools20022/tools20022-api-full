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

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06;
import com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07;
import com.tools20022.repository.entity.AccountIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountIdentification10;
import com.tools20022.repository.msg.AccountIdentification31;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.choice.AccountIdentification29Choice#mmForAllAccounts
 * AccountIdentification29Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification29Choice#mmAccountsList
 * AccountIdentification29Choice.mmAccountsList}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmAccountDetails
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
 * mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#mmAccountsDetails
 * CorporateActionCancellationAdviceV06.mmAccountsDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#mmAccountsDetails
 * CorporateActionCancellationAdviceV07.mmAccountsDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmAccountDetails
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.
 * mmAccountDetails}</li>
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
 * "AccountIdentification29Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between all accounts (GENR - General in ISO 15022) or one or more selected accounts."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.AccountIdentification13Choice
 * AccountIdentification13Choice}</li>
 * </ul>
 */
public class AccountIdentification29Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected AccountIdentification10 forAllAccounts;
	/**
	 * All safekeeping accounts that own underlying financial instrument.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification29Choice
	 * AccountIdentification29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ForAllAccts"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification13Choice#mmForAllAccounts
	 * AccountIdentification13Choice.mmForAllAccounts}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForAllAccounts = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> AccountIdentification29Choice.mmObject();
			isDerived = false;
			xmlTag = "ForAllAccts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForAllAccounts";
			definition = "All safekeeping accounts that own underlying financial instrument.";
			previousVersion_lazy = () -> AccountIdentification13Choice.mmForAllAccounts;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AccountIdentification10.mmObject();
		}
	};
	protected List<AccountIdentification31> accountsList;
	/**
	 * Selected safekeeping accounts list to which the corporate action event
	 * applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification31
	 * AccountIdentification31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification29Choice
	 * AccountIdentification29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctsList"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification13Choice#mmAccountsList
	 * AccountIdentification13Choice.mmAccountsList}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountsList = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> AccountIdentification29Choice.mmObject();
			isDerived = false;
			xmlTag = "AcctsList";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountsList";
			definition = "Selected safekeeping accounts list to which the corporate action event applies.";
			previousVersion_lazy = () -> AccountIdentification13Choice.mmAccountsList;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AccountIdentification31.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AccountIdentification29Choice.mmForAllAccounts, AccountIdentification29Choice.mmAccountsList);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmAccountDetails, CorporateActionCancellationAdviceV06.mmAccountsDetails,
						CorporateActionCancellationAdviceV07.mmAccountsDetails, CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmAccountDetails);
				trace_lazy = () -> AccountIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountIdentification29Choice";
				definition = "Choice between all accounts (GENR - General in ISO 15022) or one or more selected accounts.";
				previousVersion_lazy = () -> AccountIdentification13Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentification10 getForAllAccounts() {
		return forAllAccounts;
	}

	public void setForAllAccounts(AccountIdentification10 forAllAccounts) {
		this.forAllAccounts = forAllAccounts;
	}

	public List<AccountIdentification31> getAccountsList() {
		return accountsList;
	}

	public void setAccountsList(List<AccountIdentification31> accountsList) {
		this.accountsList = accountsList;
	}
}