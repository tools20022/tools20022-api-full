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
import com.tools20022.repository.choice.BalanceFormat2Choice;
import com.tools20022.repository.datatype.RestrictedFINXMax35Text;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides account and balance information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance8#mmSafekeepingAccount
 * AccountAndBalance8.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance8#mmConfirmedBalance
 * AccountAndBalance8.mmConfirmedBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
 * SecuritiesAccount}</li>
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
 * "AccountAndBalance8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides account and balance information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AccountAndBalance8", propOrder = {"safekeepingAccount", "confirmedBalance"})
public class AccountAndBalance8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RestrictedFINXMax35Text safekeepingAccount;
	/**
	 * Account where financial instruments are maintained.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax35Text
	 * RestrictedFINXMax35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance8
	 * AccountAndBalance8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account where financial instruments are maintained."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSafekeepingAccount = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> AccountAndBalance8.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account where financial instruments are maintained.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax35Text.mmObject();
		}
	};
	protected BalanceFormat2Choice confirmedBalance;
	/**
	 * Balance to which the payment applies (less or equal to the total eligible
	 * balance).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat2Choice
	 * BalanceFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesBalance
	 * SecuritiesAccount.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance8
	 * AccountAndBalance8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance to which the payment applies (less or equal to the total eligible balance)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConfirmedBalance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesAccount.mmSecuritiesBalance;
			componentContext_lazy = () -> AccountAndBalance8.mmObject();
			isDerived = false;
			xmlTag = "ConfdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmedBalance";
			definition = "Balance to which the payment applies (less or equal to the total eligible balance).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BalanceFormat2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AccountAndBalance8.mmSafekeepingAccount, AccountAndBalance8.mmConfirmedBalance);
				trace_lazy = () -> SecuritiesAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountAndBalance8";
				definition = "Provides account and balance information.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SfkpgAcct", required = true)
	public RestrictedFINXMax35Text getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public void setSafekeepingAccount(RestrictedFINXMax35Text safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
	}

	@XmlElement(name = "ConfdBal", required = true)
	public BalanceFormat2Choice getConfirmedBalance() {
		return confirmedBalance;
	}

	public void setConfirmedBalance(BalanceFormat2Choice confirmedBalance) {
		this.confirmedBalance = confirmedBalance;
	}
}