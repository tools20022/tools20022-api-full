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
import com.tools20022.repository.choice.Quantity22Choice;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Total eligible balance for the corporate action and full and part way period
 * units.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat9#mmBalance
 * TotalEligibleBalanceFormat9.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat9#mmFullPeriodUnits
 * TotalEligibleBalanceFormat9.mmFullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat9#mmPartWayPeriodUnits
 * TotalEligibleBalanceFormat9.mmPartWayPeriodUnits}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
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
 * "TotalEligibleBalanceFormat9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Total eligible balance for the corporate action and full and part way period units. "
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TotalEligibleBalanceFormat9", propOrder = {"balance", "fullPeriodUnits", "partWayPeriodUnits"})
public class TotalEligibleBalanceFormat9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Bal")
	protected Quantity22Choice balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity22Choice
	 * Quantity22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
	 * SecuritiesBalance.mmAggregateQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat9
	 * TotalEligibleBalanceFormat9}</li>
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
			businessElementTrace_lazy = () -> SecuritiesBalance.mmAggregateQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalEligibleBalanceFormat9.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Provides information about balance related to a corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Quantity22Choice.mmObject();
		}
	};
	@XmlElement(name = "FullPrdUnits")
	protected SignedQuantityFormat9 fullPeriodUnits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat9
	 * TotalEligibleBalanceFormat9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmFullPeriodUnits = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalEligibleBalanceFormat9.mmObject();
			isDerived = false;
			xmlTag = "FullPrdUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPeriodUnits";
			definition = "Number of units of a fund that were purchased in a previous distribution period and/or held at the beginning of a distribution period, for example Group I Units in the UK.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	@XmlElement(name = "PartWayPrdUnits")
	protected SignedQuantityFormat9 partWayPeriodUnits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat9
	 * TotalEligibleBalanceFormat9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartWayPeriodUnits = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalEligibleBalanceFormat9.mmObject();
			isDerived = false;
			xmlTag = "PartWayPrdUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartWayPeriodUnits";
			definition = "Number of units of a fund that were purchased part way throughout a distribution period, for example Group II Units in the U.K.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalEligibleBalanceFormat9.mmBalance, com.tools20022.repository.msg.TotalEligibleBalanceFormat9.mmFullPeriodUnits,
						com.tools20022.repository.msg.TotalEligibleBalanceFormat9.mmPartWayPeriodUnits);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TotalEligibleBalanceFormat9";
				definition = "Total eligible balance for the corporate action and full and part way period units. ";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Quantity22Choice> getBalance() {
		return balance == null ? Optional.empty() : Optional.of(balance);
	}

	public TotalEligibleBalanceFormat9 setBalance(Quantity22Choice balance) {
		this.balance = balance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getFullPeriodUnits() {
		return fullPeriodUnits == null ? Optional.empty() : Optional.of(fullPeriodUnits);
	}

	public TotalEligibleBalanceFormat9 setFullPeriodUnits(com.tools20022.repository.msg.SignedQuantityFormat9 fullPeriodUnits) {
		this.fullPeriodUnits = fullPeriodUnits;
		return this;
	}

	public Optional<SignedQuantityFormat9> getPartWayPeriodUnits() {
		return partWayPeriodUnits == null ? Optional.empty() : Optional.of(partWayPeriodUnits);
	}

	public TotalEligibleBalanceFormat9 setPartWayPeriodUnits(com.tools20022.repository.msg.SignedQuantityFormat9 partWayPeriodUnits) {
		this.partWayPeriodUnits = partWayPeriodUnits;
		return this;
	}
}