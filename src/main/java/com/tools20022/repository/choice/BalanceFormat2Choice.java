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
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SignedQuantityFormat3;
import com.tools20022.repository.msg.SignedQuantityFormat4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between balance, eligible balance and not eligible balance formats.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat2Choice#mmBalance
 * BalanceFormat2Choice.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat2Choice#mmEligibleBalance
 * BalanceFormat2Choice.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat2Choice#mmNotEligibleBalance
 * BalanceFormat2Choice.mmNotEligibleBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
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
 * "BalanceFormat2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between balance, eligible balance and not eligible balance formats."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BalanceFormat2Choice", propOrder = {"balance", "eligibleBalance", "notEligibleBalance"})
public class BalanceFormat2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected SignedQuantityFormat3 balance;
	/**
	 * Provides information about balance related to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat3
	 * SignedQuantityFormat3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat2Choice
	 * BalanceFormat2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about balance related to a corporate action."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> BalanceFormat2Choice.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Provides information about balance related to a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat3.mmObject();
		}
	};
	protected SignedQuantityFormat4 eligibleBalance;
	/**
	 * Provide eligible balance information in different formats.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat2Choice
	 * BalanceFormat2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgblBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provide eligible balance information in different formats."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEligibleBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> BalanceFormat2Choice.mmObject();
			isDerived = false;
			xmlTag = "ElgblBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleBalance";
			definition = "Provide eligible balance information in different formats.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};
	protected SignedQuantityFormat4 notEligibleBalance;
	/**
	 * Provide not eligible balance information in different formats.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat2Choice
	 * BalanceFormat2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotElgblBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provide not eligible balance information in different formats."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNotEligibleBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> BalanceFormat2Choice.mmObject();
			isDerived = false;
			xmlTag = "NotElgblBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEligibleBalance";
			definition = "Provide not eligible balance information in different formats.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BalanceFormat2Choice.mmBalance, BalanceFormat2Choice.mmEligibleBalance, BalanceFormat2Choice.mmNotEligibleBalance);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceFormat2Choice";
				definition = "Choice between balance, eligible balance and not eligible balance formats.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Bal", required = true)
	public SignedQuantityFormat3 getBalance() {
		return balance;
	}

	public void setBalance(SignedQuantityFormat3 balance) {
		this.balance = balance;
	}

	@XmlElement(name = "ElgblBal", required = true)
	public SignedQuantityFormat4 getEligibleBalance() {
		return eligibleBalance;
	}

	public void setEligibleBalance(SignedQuantityFormat4 eligibleBalance) {
		this.eligibleBalance = eligibleBalance;
	}

	@XmlElement(name = "NotElgblBal", required = true)
	public SignedQuantityFormat4 getNotEligibleBalance() {
		return notEligibleBalance;
	}

	public void setNotEligibleBalance(SignedQuantityFormat4 notEligibleBalance) {
		this.notEligibleBalance = notEligibleBalance;
	}
}