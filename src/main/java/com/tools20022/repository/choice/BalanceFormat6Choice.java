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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SignedQuantityFormat6;
import com.tools20022.repository.msg.SignedQuantityFormat7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmBalance
 * BalanceFormat6Choice.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmEligibleBalance
 * BalanceFormat6Choice.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmNotEligibleBalance
 * BalanceFormat6Choice.mmNotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmFullPeriodUnits
 * BalanceFormat6Choice.mmFullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmPartWayPeriodUnits
 * BalanceFormat6Choice.mmPartWayPeriodUnits}</li>
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
 * "BalanceFormat6Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between balance, eligible balance and not eligible balance formats."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice
 * BalanceFormat3Choice}</li>
 * </ul>
 */
public class BalanceFormat6Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected SignedQuantityFormat7 balance;
	/**
	 * Provides information about balance related to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat7
	 * SignedQuantityFormat7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice
	 * BalanceFormat6Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#mmBalance
	 * BalanceFormat3Choice.mmBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> BalanceFormat6Choice.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Provides information about balance related to a corporate action.";
			previousVersion_lazy = () -> BalanceFormat3Choice.mmBalance;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat7.mmObject();
		}
	};
	protected SignedQuantityFormat6 eligibleBalance;
	/**
	 * Provide eligible balance information in different formats.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice
	 * BalanceFormat6Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#mmEligibleBalance
	 * BalanceFormat3Choice.mmEligibleBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEligibleBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> BalanceFormat6Choice.mmObject();
			isDerived = false;
			xmlTag = "ElgblBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleBalance";
			definition = "Provide eligible balance information in different formats.";
			previousVersion_lazy = () -> BalanceFormat3Choice.mmEligibleBalance;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat6.mmObject();
		}
	};
	protected SignedQuantityFormat6 notEligibleBalance;
	/**
	 * Provide not eligible balance information in different formats.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice
	 * BalanceFormat6Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#mmNotEligibleBalance
	 * BalanceFormat3Choice.mmNotEligibleBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNotEligibleBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> BalanceFormat6Choice.mmObject();
			isDerived = false;
			xmlTag = "NotElgblBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEligibleBalance";
			definition = "Provide not eligible balance information in different formats.";
			previousVersion_lazy = () -> BalanceFormat3Choice.mmNotEligibleBalance;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat6.mmObject();
		}
	};
	protected SignedQuantityFormat6 fullPeriodUnits;
	/**
	 * Number of units of a fund that were purchased in a previous distribution
	 * period and/or held at the beginning of a distribution period, for example
	 * Group I Units in the UK.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice
	 * BalanceFormat6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullPrdUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullPeriodUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of units of a fund that were purchased in a previous distribution period and/or held at the beginning of a distribution period, for example Group I Units in the UK."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#mmFullPeriodUnits
	 * BalanceFormat3Choice.mmFullPeriodUnits}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFullPeriodUnits = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> BalanceFormat6Choice.mmObject();
			isDerived = false;
			xmlTag = "FullPrdUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPeriodUnits";
			definition = "Number of units of a fund that were purchased in a previous distribution period and/or held at the beginning of a distribution period, for example Group I Units in the UK.";
			previousVersion_lazy = () -> BalanceFormat3Choice.mmFullPeriodUnits;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}
	};
	protected SignedQuantityFormat6 partWayPeriodUnits;
	/**
	 * Number of units of a fund that were purchased part way throughout a
	 * distribution period, for example Group II Units in the U.K.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice
	 * BalanceFormat6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PartWayPrdUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartWayPeriodUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of units of a fund that were purchased part way throughout a distribution period, for example Group II Units in the U.K."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#mmPartWayPeriodUnits
	 * BalanceFormat3Choice.mmPartWayPeriodUnits}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartWayPeriodUnits = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> BalanceFormat6Choice.mmObject();
			isDerived = false;
			xmlTag = "PartWayPrdUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartWayPeriodUnits";
			definition = "Number of units of a fund that were purchased part way throughout a distribution period, for example Group II Units in the U.K.";
			previousVersion_lazy = () -> BalanceFormat3Choice.mmPartWayPeriodUnits;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BalanceFormat6Choice.mmBalance, BalanceFormat6Choice.mmEligibleBalance, BalanceFormat6Choice.mmNotEligibleBalance, BalanceFormat6Choice.mmFullPeriodUnits,
						BalanceFormat6Choice.mmPartWayPeriodUnits);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceFormat6Choice";
				definition = "Choice between balance, eligible balance and not eligible balance formats.";
				previousVersion_lazy = () -> BalanceFormat3Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SignedQuantityFormat7 getBalance() {
		return balance;
	}

	public void setBalance(SignedQuantityFormat7 balance) {
		this.balance = balance;
	}

	public SignedQuantityFormat6 getEligibleBalance() {
		return eligibleBalance;
	}

	public void setEligibleBalance(SignedQuantityFormat6 eligibleBalance) {
		this.eligibleBalance = eligibleBalance;
	}

	public SignedQuantityFormat6 getNotEligibleBalance() {
		return notEligibleBalance;
	}

	public void setNotEligibleBalance(SignedQuantityFormat6 notEligibleBalance) {
		this.notEligibleBalance = notEligibleBalance;
	}

	public SignedQuantityFormat6 getFullPeriodUnits() {
		return fullPeriodUnits;
	}

	public void setFullPeriodUnits(SignedQuantityFormat6 fullPeriodUnits) {
		this.fullPeriodUnits = fullPeriodUnits;
	}

	public SignedQuantityFormat6 getPartWayPeriodUnits() {
		return partWayPeriodUnits;
	}

	public void setPartWayPeriodUnits(SignedQuantityFormat6 partWayPeriodUnits) {
		this.partWayPeriodUnits = partWayPeriodUnits;
	}
}