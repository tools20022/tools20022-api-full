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
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.entity.LiquidityManagementLimit;
import com.tools20022.repository.entity.RiskManagementLimit;
import com.tools20022.repository.msg.LiquidityManagementLimitIdentificationDetails;
import com.tools20022.repository.msg.RiskManagementLimitIdentificationDetails;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specification of a risk management type current limit or a liquidity
 * management type current limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CurrentLimitChoice#mmRiskManagementCurrentLimitIdentification
 * CurrentLimitChoice.mmRiskManagementCurrentLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CurrentLimitChoice#mmLiquidityManagementCurrentLimitIdentification
 * CurrentLimitChoice.mmLiquidityManagementCurrentLimitIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrentLimitChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specification of a risk management type current limit or a liquidity management type current limit. "
 * </li>
 * </ul>
 */
public class CurrentLimitChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected RiskManagementLimitIdentificationDetails riskManagementCurrentLimitIdentification;
	/**
	 * Cash management feature limiting the maximum risk a party accepts to take
	 * with respect to a counterparty or a set of counterparties. A risk
	 * management limit is either bilateral, ie, for a counterparty, or
	 * multilateral, ie, for a set of counterparties or all other members in a
	 * system.The limit may also apply to sponsored members, ie, indirect
	 * members. In principle, a risk management limit is calculated on the net
	 * position between two members and is expressed as a credit or debit limit,
	 * from the point of view of the party setting the limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RiskManagementLimitIdentificationDetails
	 * RiskManagementLimitIdentificationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CurrentLimitChoice
	 * CurrentLimitChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RskMgmtCurLmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskManagementCurrentLimitIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash management feature limiting the maximum risk a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, ie, for a counterparty, or multilateral, ie, for a set of counterparties or all other members in a system.The limit may also apply to sponsored members, ie, indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRiskManagementCurrentLimitIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			componentContext_lazy = () -> CurrentLimitChoice.mmObject();
			isDerived = false;
			xmlTag = "RskMgmtCurLmtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskManagementCurrentLimitIdentification";
			definition = "Cash management feature limiting the maximum risk a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, ie, for a counterparty, or multilateral, ie, for a set of counterparties or all other members in a system.The limit may also apply to sponsored members, ie, indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RiskManagementLimitIdentificationDetails.mmObject();
		}
	};
	protected LiquidityManagementLimitIdentificationDetails liquidityManagementCurrentLimitIdentification;
	/**
	 * Cash management feature limiting the amount of liquidity needed to
	 * perform clearing and settlement operations. At any point in time during
	 * the process, the limit imposes the maximum amount of liquidity available
	 * for operations concerning the system or other managed elements, eg,
	 * transaction amount or counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityManagementLimitIdentificationDetails
	 * LiquidityManagementLimitIdentificationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit
	 * LiquidityManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CurrentLimitChoice
	 * CurrentLimitChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LqdtyMgmtCurLmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityManagementCurrentLimitIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash management feature limiting the amount of liquidity needed to perform clearing and settlement operations. At any point in time during the process, the limit imposes the maximum amount of liquidity available for operations concerning the system or other managed elements, eg, transaction amount or counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLiquidityManagementCurrentLimitIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> LiquidityManagementLimit.mmObject();
			componentContext_lazy = () -> CurrentLimitChoice.mmObject();
			isDerived = false;
			xmlTag = "LqdtyMgmtCurLmtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityManagementCurrentLimitIdentification";
			definition = "Cash management feature limiting the amount of liquidity needed to perform clearing and settlement operations. At any point in time during the process, the limit imposes the maximum amount of liquidity available for operations concerning the system or other managed elements, eg, transaction amount or counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LiquidityManagementLimitIdentificationDetails.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CurrentLimitChoice.mmRiskManagementCurrentLimitIdentification,
						com.tools20022.repository.choice.CurrentLimitChoice.mmLiquidityManagementCurrentLimitIdentification);
				trace_lazy = () -> Limit.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CurrentLimitChoice";
				definition = "Specification of a risk management type current limit or a liquidity management type current limit. ";
			}
		});
		return mmObject_lazy.get();
	}

	public RiskManagementLimitIdentificationDetails getRiskManagementCurrentLimitIdentification() {
		return riskManagementCurrentLimitIdentification;
	}

	public void setRiskManagementCurrentLimitIdentification(RiskManagementLimitIdentificationDetails riskManagementCurrentLimitIdentification) {
		this.riskManagementCurrentLimitIdentification = riskManagementCurrentLimitIdentification;
	}

	public LiquidityManagementLimitIdentificationDetails getLiquidityManagementCurrentLimitIdentification() {
		return liquidityManagementCurrentLimitIdentification;
	}

	public void setLiquidityManagementCurrentLimitIdentification(LiquidityManagementLimitIdentificationDetails liquidityManagementCurrentLimitIdentification) {
		this.liquidityManagementCurrentLimitIdentification = liquidityManagementCurrentLimitIdentification;
	}
}