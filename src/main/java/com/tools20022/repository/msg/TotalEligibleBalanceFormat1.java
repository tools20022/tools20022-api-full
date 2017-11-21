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
import com.tools20022.repository.choice.Quantity3Choice;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat1#mmBalance
 * TotalEligibleBalanceFormat1.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat1#mmFullPeriodUnits
 * TotalEligibleBalanceFormat1.mmFullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat1#mmPartWayPeriodUnits
 * TotalEligibleBalanceFormat1.mmPartWayPeriodUnits}</li>
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
 * "TotalEligibleBalanceFormat1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Total eligible balance for the corporate action and full and part way period units. "
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat8
 * TotalEligibleBalanceFormat8}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TotalEligibleBalanceFormat1", propOrder = {"balance", "fullPeriodUnits", "partWayPeriodUnits"})
public class TotalEligibleBalanceFormat1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Quantity3Choice balance;
	/**
	 * Provides information about balance related to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity3Choice
	 * Quantity3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
	 * SecuritiesBalance.mmAggregateQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat1
	 * TotalEligibleBalanceFormat1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat8#mmBalance
	 * TotalEligibleBalanceFormat8.mmBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmAggregateQuantity;
			componentContext_lazy = () -> TotalEligibleBalanceFormat1.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Provides information about balance related to a corporate action.";
			nextVersions_lazy = () -> Arrays.asList(TotalEligibleBalanceFormat8.mmBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Quantity3Choice.mmObject();
		}
	};
	protected SignedQuantityFormat2 fullPeriodUnits;
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
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat2
	 * SignedQuantityFormat2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat1
	 * TotalEligibleBalanceFormat1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat8#mmFullPeriodUnits
	 * TotalEligibleBalanceFormat8.mmFullPeriodUnits}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFullPeriodUnits = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> TotalEligibleBalanceFormat1.mmObject();
			isDerived = false;
			xmlTag = "FullPrdUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPeriodUnits";
			definition = "Number of units of a fund that were purchased in a previous distribution period and/or held at the beginning of a distribution period, for example Group I Units in the UK.";
			nextVersions_lazy = () -> Arrays.asList(TotalEligibleBalanceFormat8.mmFullPeriodUnits);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat2.mmObject();
		}
	};
	protected SignedQuantityFormat2 partWayPeriodUnits;
	/**
	 * Number of units of a fund that were purchased part way throughout a
	 * distribution period, for example Group II Units in the U.K.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat2
	 * SignedQuantityFormat2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat1
	 * TotalEligibleBalanceFormat1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat8#mmPartWayPeriodUnits
	 * TotalEligibleBalanceFormat8.mmPartWayPeriodUnits}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartWayPeriodUnits = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> TotalEligibleBalanceFormat1.mmObject();
			isDerived = false;
			xmlTag = "PartWayPrdUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartWayPeriodUnits";
			definition = "Number of units of a fund that were purchased part way throughout a distribution period, for example Group II Units in the U.K.";
			nextVersions_lazy = () -> Arrays.asList(TotalEligibleBalanceFormat8.mmPartWayPeriodUnits);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TotalEligibleBalanceFormat1.mmBalance, TotalEligibleBalanceFormat1.mmFullPeriodUnits, TotalEligibleBalanceFormat1.mmPartWayPeriodUnits);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TotalEligibleBalanceFormat1";
				definition = "Total eligible balance for the corporate action and full and part way period units. ";
				nextVersions_lazy = () -> Arrays.asList(TotalEligibleBalanceFormat8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Bal")
	public Quantity3Choice getBalance() {
		return balance;
	}

	public void setBalance(Quantity3Choice balance) {
		this.balance = balance;
	}

	@XmlElement(name = "FullPrdUnits")
	public SignedQuantityFormat2 getFullPeriodUnits() {
		return fullPeriodUnits;
	}

	public void setFullPeriodUnits(com.tools20022.repository.msg.SignedQuantityFormat2 fullPeriodUnits) {
		this.fullPeriodUnits = fullPeriodUnits;
	}

	@XmlElement(name = "PartWayPrdUnits")
	public SignedQuantityFormat2 getPartWayPeriodUnits() {
		return partWayPeriodUnits;
	}

	public void setPartWayPeriodUnits(com.tools20022.repository.msg.SignedQuantityFormat2 partWayPeriodUnits) {
		this.partWayPeriodUnits = partWayPeriodUnits;
	}
}