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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Rights entitled to the account owner based on the terms of the corporate
 * action event and the balance of underlying securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionEntitlement"
 * src="doc-files/CorporateActionEntitlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalance
 * CorporateActionEntitlement.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
 * CorporateActionEntitlement.mmInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmUninstructedBalance
 * CorporateActionEntitlement.mmUninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalanceIndicator
 * CorporateActionEntitlement.mmEligibleBalanceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmRelatedServicing
 * CorporateActionEntitlement.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmNotEligibleBalance
 * CorporateActionEntitlement.mmNotEligibleBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
 * CorporateActionCashEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement
 * CorporateActionSecuritiesEntitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmEligibleBalanceRelatedEntitlement
 * SecuritiesBalance.mmEligibleBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmCorporateActionEntitlement
 * SecuritiesBalance.mmCorporateActionEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmInstructedBalanceRelatedEntitlement
 * SecuritiesBalance.mmInstructedBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmUninstructedBalanceRelatedEntitlement
 * SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmNotEligibleBalanceRelatedEntitlement
 * SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionEntitlement
 * CorporateActionServicing.mmCorporateActionEntitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#mmAccountAndDistributionDetails
 * EntitlementAdvice1.mmAccountAndDistributionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3
 * CorporateActionBalanceDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5
 * CorporateActionBalanceDetails5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12
 * CorporateActionBalanceDetails12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15
 * CorporateActionBalanceDetails15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4
 * CorporateActionBalanceDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8
 * CorporateActionBalanceDetails8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9
 * CorporateActionBalanceDetails9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16
 * CorporateActionBalanceDetails16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2
 * CorporateActionBalanceDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6
 * CorporateActionBalanceDetails6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11
 * CorporateActionBalanceDetails11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14
 * CorporateActionBalanceDetails14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18
 * CorporateActionBalanceDetails18}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19
 * CorporateActionBalanceDetails19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1
 * CorporateActionBalanceDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7
 * CorporateActionBalanceDetails7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
 * CorporateActionBalanceDetails10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13
 * CorporateActionBalanceDetails13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
 * CorporateActionBalanceDetails17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20
 * CorporateActionBalanceDetails20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Entitlement1 Entitlement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntitlementAdvice1
 * EntitlementAdvice1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21
 * CorporateActionBalanceDetails21}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22
 * CorporateActionBalanceDetails22}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25
 * CorporateActionBalanceDetails25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28
 * CorporateActionBalanceDetails28}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32
 * CorporateActionBalanceDetails32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31
 * CorporateActionBalanceDetails31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
 * CorporateActionBalanceDetails30}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
 * CorporateActionBalanceDetails29}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
 * CorporateActionBalanceDetails33}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
 * CorporateActionBalanceDetails35}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34
 * CorporateActionBalanceDetails34}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
 * CorporateActionBalanceDetails36}</li>
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
 * "CorporateActionEntitlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Rights entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities."
 * </li>
 * </ul>
 */
public class CorporateActionEntitlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SecuritiesBalance> eligibleBalance;
	/**
	 * Total balance of securities eligible for this corporate action event. The
	 * entitlement calculation is based on this balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmEligibleBalanceRelatedEntitlement
	 * SecuritiesBalance.mmEligibleBalanceRelatedEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails3.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails5.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails12.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails15.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#mmTotalEligibleBalance
	 * CorporateActionOption9.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#mmTotalEligibleBalance
	 * CorporateActionOption18.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#mmTotalEligibleBalance
	 * CorporateActionOption22.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmTotalEligibleBalance
	 * CorporateActionOption27.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#mmTotalEligibleBalance
	 * CorporateActionOption26.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#mmTotalEligibleBalance
	 * CorporateActionOption41.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#mmTotalEligibleBalance
	 * CorporateActionOption50.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails4.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails8.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails9.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails16.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#mmTotalEligibleBalance
	 * CorporateActionOption29.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails2.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails6.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails11.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails14.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails18.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails19.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails1.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails7.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails10.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails13.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails17.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails20.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption8#mmTotalEligibleBalance
	 * CorporateActionOption8.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails21.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails22.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails25.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails28.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmTotalEligibleBalance
	 * CorporateActionOption116.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails32.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails31.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails30.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails29.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#mmTotalEligibleBalance
	 * CorporateActionOption121.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails33.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails35.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails34.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails36.mmTotalEligibleBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEligibleBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails3.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails5.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails12.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails15.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionOption9.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionOption18.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionOption22.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionOption27.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionOption26.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionOption41.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionOption50.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionOption29.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionOption8.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionOption116.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails32.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionOption121.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmTotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmTotalEligibleBalance);
			elementContext_lazy = () -> CorporateActionEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligibleBalance";
			definition = "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmEligibleBalanceRelatedEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesBalance> securitiesBalance;
	/**
	 * Specifies any type of balance related to a corporate action entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmCorporateActionEntitlement
	 * SecuritiesBalance.mmCorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#mmBlockedBalance
	 * CorporateActionBalanceDetails3.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#mmBorrowedBalance
	 * CorporateActionBalanceDetails3.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#mmCollateralInBalance
	 * CorporateActionBalanceDetails3.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#mmCollateralOutBalance
	 * CorporateActionBalanceDetails3.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#mmOnLoanBalance
	 * CorporateActionBalanceDetails3.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails3.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails3.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails3.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails3.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#mmStreetPositionBalance
	 * CorporateActionBalanceDetails3.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails3.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails3.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#mmRegisteredBalance
	 * CorporateActionBalanceDetails3.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#mmBlockedBalance
	 * CorporateActionBalanceDetails5.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#mmBorrowedBalance
	 * CorporateActionBalanceDetails5.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#mmCollateralInBalance
	 * CorporateActionBalanceDetails5.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#mmCollateralOutBalance
	 * CorporateActionBalanceDetails5.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#mmOnLoanBalance
	 * CorporateActionBalanceDetails5.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails5.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails5.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails5.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails5.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#mmStreetPositionBalance
	 * CorporateActionBalanceDetails5.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails5.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails5.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#mmRegisteredBalance
	 * CorporateActionBalanceDetails5.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#mmBlockedBalance
	 * CorporateActionBalanceDetails12.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#mmBorrowedBalance
	 * CorporateActionBalanceDetails12.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#mmCollateralInBalance
	 * CorporateActionBalanceDetails12.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#mmCollateralOutBalance
	 * CorporateActionBalanceDetails12.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#mmOnLoanBalance
	 * CorporateActionBalanceDetails12.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails12.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails12.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails12.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails12.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#mmStreetPositionBalance
	 * CorporateActionBalanceDetails12.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails12.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails12.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#mmRegisteredBalance
	 * CorporateActionBalanceDetails12.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#mmBlockedBalance
	 * CorporateActionBalanceDetails15.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#mmBorrowedBalance
	 * CorporateActionBalanceDetails15.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#mmCollateralInBalance
	 * CorporateActionBalanceDetails15.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#mmCollateralOutBalance
	 * CorporateActionBalanceDetails15.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#mmOnLoanBalance
	 * CorporateActionBalanceDetails15.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails15.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails15.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails15.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails15.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#mmStreetPositionBalance
	 * CorporateActionBalanceDetails15.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails15.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails15.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#mmRegisteredBalance
	 * CorporateActionBalanceDetails15.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmBlockedBalance
	 * CorporateActionBalanceDetails4.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmBorrowedBalance
	 * CorporateActionBalanceDetails4.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmCollateralInBalance
	 * CorporateActionBalanceDetails4.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmCollateralOutBalance
	 * CorporateActionBalanceDetails4.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmOnLoanBalance
	 * CorporateActionBalanceDetails4.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails4.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails4.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmStreetPositionBalance
	 * CorporateActionBalanceDetails4.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails4.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails4.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmRegisteredBalance
	 * CorporateActionBalanceDetails4.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmObligatedBalance
	 * CorporateActionBalanceDetails4.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails4.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails4.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmBlockedBalance
	 * CorporateActionBalanceDetails8.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmBorrowedBalance
	 * CorporateActionBalanceDetails8.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmCollateralInBalance
	 * CorporateActionBalanceDetails8.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmCollateralOutBalance
	 * CorporateActionBalanceDetails8.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmOnLoanBalance
	 * CorporateActionBalanceDetails8.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails8.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails8.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmStreetPositionBalance
	 * CorporateActionBalanceDetails8.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails8.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails8.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmRegisteredBalance
	 * CorporateActionBalanceDetails8.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmObligatedBalance
	 * CorporateActionBalanceDetails8.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails8.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails8.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmBlockedBalance
	 * CorporateActionBalanceDetails9.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmBorrowedBalance
	 * CorporateActionBalanceDetails9.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmCollateralInBalance
	 * CorporateActionBalanceDetails9.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmCollateralOutBalance
	 * CorporateActionBalanceDetails9.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmOnLoanBalance
	 * CorporateActionBalanceDetails9.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails9.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails9.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmStreetPositionBalance
	 * CorporateActionBalanceDetails9.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails9.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails9.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmRegisteredBalance
	 * CorporateActionBalanceDetails9.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmObligatedBalance
	 * CorporateActionBalanceDetails9.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails9.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails9.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmBlockedBalance
	 * CorporateActionBalanceDetails16.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmBorrowedBalance
	 * CorporateActionBalanceDetails16.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmCollateralInBalance
	 * CorporateActionBalanceDetails16.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmCollateralOutBalance
	 * CorporateActionBalanceDetails16.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmOnLoanBalance
	 * CorporateActionBalanceDetails16.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails16.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails16.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmStreetPositionBalance
	 * CorporateActionBalanceDetails16.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails16.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails16.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmRegisteredBalance
	 * CorporateActionBalanceDetails16.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmObligatedBalance
	 * CorporateActionBalanceDetails16.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails16.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails16.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmConfirmedBalance
	 * CorporateActionBalanceDetails2.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmBlockedBalance
	 * CorporateActionBalanceDetails2.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmBorrowedBalance
	 * CorporateActionBalanceDetails2.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmCollateralInBalance
	 * CorporateActionBalanceDetails2.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmCollateralOutBalance
	 * CorporateActionBalanceDetails2.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmOnLoanBalance
	 * CorporateActionBalanceDetails2.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails2.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails2.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails2.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails2.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmStreetPositionBalance
	 * CorporateActionBalanceDetails2.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails2.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails2.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmRegisteredBalance
	 * CorporateActionBalanceDetails2.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmAffectedBalance
	 * CorporateActionBalanceDetails2.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmUnaffectedBalance
	 * CorporateActionBalanceDetails2.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmConfirmedBalance
	 * CorporateActionBalanceDetails6.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmBlockedBalance
	 * CorporateActionBalanceDetails6.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmBorrowedBalance
	 * CorporateActionBalanceDetails6.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmCollateralInBalance
	 * CorporateActionBalanceDetails6.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmCollateralOutBalance
	 * CorporateActionBalanceDetails6.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmOnLoanBalance
	 * CorporateActionBalanceDetails6.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails6.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails6.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails6.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails6.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmStreetPositionBalance
	 * CorporateActionBalanceDetails6.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails6.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails6.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmRegisteredBalance
	 * CorporateActionBalanceDetails6.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmAffectedBalance
	 * CorporateActionBalanceDetails6.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmUnaffectedBalance
	 * CorporateActionBalanceDetails6.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmConfirmedBalance
	 * CorporateActionBalanceDetails11.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmBlockedBalance
	 * CorporateActionBalanceDetails11.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmBorrowedBalance
	 * CorporateActionBalanceDetails11.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmCollateralInBalance
	 * CorporateActionBalanceDetails11.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmCollateralOutBalance
	 * CorporateActionBalanceDetails11.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmOnLoanBalance
	 * CorporateActionBalanceDetails11.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails11.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails11.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails11.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails11.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmStreetPositionBalance
	 * CorporateActionBalanceDetails11.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails11.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails11.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmRegisteredBalance
	 * CorporateActionBalanceDetails11.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmAffectedBalance
	 * CorporateActionBalanceDetails11.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmUnaffectedBalance
	 * CorporateActionBalanceDetails11.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmConfirmedBalance
	 * CorporateActionBalanceDetails14.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmBlockedBalance
	 * CorporateActionBalanceDetails14.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmBorrowedBalance
	 * CorporateActionBalanceDetails14.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmCollateralInBalance
	 * CorporateActionBalanceDetails14.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmCollateralOutBalance
	 * CorporateActionBalanceDetails14.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmOnLoanBalance
	 * CorporateActionBalanceDetails14.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails14.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails14.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails14.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails14.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmStreetPositionBalance
	 * CorporateActionBalanceDetails14.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails14.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails14.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmRegisteredBalance
	 * CorporateActionBalanceDetails14.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmAffectedBalance
	 * CorporateActionBalanceDetails14.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmUnaffectedBalance
	 * CorporateActionBalanceDetails14.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmConfirmedBalance
	 * CorporateActionBalanceDetails18.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmBlockedBalance
	 * CorporateActionBalanceDetails18.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmBorrowedBalance
	 * CorporateActionBalanceDetails18.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmCollateralInBalance
	 * CorporateActionBalanceDetails18.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmCollateralOutBalance
	 * CorporateActionBalanceDetails18.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmOnLoanBalance
	 * CorporateActionBalanceDetails18.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails18.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails18.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails18.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails18.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmStreetPositionBalance
	 * CorporateActionBalanceDetails18.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails18.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails18.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmRegisteredBalance
	 * CorporateActionBalanceDetails18.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmAffectedBalance
	 * CorporateActionBalanceDetails18.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmUnaffectedBalance
	 * CorporateActionBalanceDetails18.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmConfirmedBalance
	 * CorporateActionBalanceDetails19.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmBlockedBalance
	 * CorporateActionBalanceDetails19.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmBorrowedBalance
	 * CorporateActionBalanceDetails19.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmCollateralInBalance
	 * CorporateActionBalanceDetails19.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmCollateralOutBalance
	 * CorporateActionBalanceDetails19.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmOnLoanBalance
	 * CorporateActionBalanceDetails19.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails19.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails19.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails19.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails19.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmStreetPositionBalance
	 * CorporateActionBalanceDetails19.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails19.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails19.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmRegisteredBalance
	 * CorporateActionBalanceDetails19.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmAffectedBalance
	 * CorporateActionBalanceDetails19.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmUnaffectedBalance
	 * CorporateActionBalanceDetails19.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmBlockedBalance
	 * CorporateActionBalanceDetails1.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmBorrowedBalance
	 * CorporateActionBalanceDetails1.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmCollateralInBalance
	 * CorporateActionBalanceDetails1.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmCollateralOutBalance
	 * CorporateActionBalanceDetails1.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmOnLoanBalance
	 * CorporateActionBalanceDetails1.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails1.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails1.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails1.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails1.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmStreetPositionBalance
	 * CorporateActionBalanceDetails1.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails1.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails1.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmRegisteredBalance
	 * CorporateActionBalanceDetails1.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmObligatedBalance
	 * CorporateActionBalanceDetails1.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmAffectedBalance
	 * CorporateActionBalanceDetails1.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmUnaffectedBalance
	 * CorporateActionBalanceDetails1.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmBlockedBalance
	 * CorporateActionBalanceDetails7.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmBorrowedBalance
	 * CorporateActionBalanceDetails7.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmCollateralInBalance
	 * CorporateActionBalanceDetails7.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmCollateralOutBalance
	 * CorporateActionBalanceDetails7.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmOnLoanBalance
	 * CorporateActionBalanceDetails7.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails7.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails7.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails7.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails7.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmStreetPositionBalance
	 * CorporateActionBalanceDetails7.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails7.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails7.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmRegisteredBalance
	 * CorporateActionBalanceDetails7.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmObligatedBalance
	 * CorporateActionBalanceDetails7.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmAffectedBalance
	 * CorporateActionBalanceDetails7.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmUnaffectedBalance
	 * CorporateActionBalanceDetails7.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmBlockedBalance
	 * CorporateActionBalanceDetails10.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmBorrowedBalance
	 * CorporateActionBalanceDetails10.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmCollateralInBalance
	 * CorporateActionBalanceDetails10.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmCollateralOutBalance
	 * CorporateActionBalanceDetails10.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmOnLoanBalance
	 * CorporateActionBalanceDetails10.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails10.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails10.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails10.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails10.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmStreetPositionBalance
	 * CorporateActionBalanceDetails10.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails10.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails10.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmRegisteredBalance
	 * CorporateActionBalanceDetails10.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmObligatedBalance
	 * CorporateActionBalanceDetails10.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmAffectedBalance
	 * CorporateActionBalanceDetails10.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmUnaffectedBalance
	 * CorporateActionBalanceDetails10.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmBlockedBalance
	 * CorporateActionBalanceDetails13.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmBorrowedBalance
	 * CorporateActionBalanceDetails13.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmCollateralInBalance
	 * CorporateActionBalanceDetails13.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmCollateralOutBalance
	 * CorporateActionBalanceDetails13.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmOnLoanBalance
	 * CorporateActionBalanceDetails13.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails13.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails13.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails13.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails13.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmStreetPositionBalance
	 * CorporateActionBalanceDetails13.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails13.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails13.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmRegisteredBalance
	 * CorporateActionBalanceDetails13.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmObligatedBalance
	 * CorporateActionBalanceDetails13.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmAffectedBalance
	 * CorporateActionBalanceDetails13.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmUnaffectedBalance
	 * CorporateActionBalanceDetails13.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmBlockedBalance
	 * CorporateActionBalanceDetails17.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmBorrowedBalance
	 * CorporateActionBalanceDetails17.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmCollateralInBalance
	 * CorporateActionBalanceDetails17.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmCollateralOutBalance
	 * CorporateActionBalanceDetails17.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmOnLoanBalance
	 * CorporateActionBalanceDetails17.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails17.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails17.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails17.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails17.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmStreetPositionBalance
	 * CorporateActionBalanceDetails17.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails17.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails17.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmRegisteredBalance
	 * CorporateActionBalanceDetails17.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmObligatedBalance
	 * CorporateActionBalanceDetails17.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmAffectedBalance
	 * CorporateActionBalanceDetails17.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmUnaffectedBalance
	 * CorporateActionBalanceDetails17.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmBlockedBalance
	 * CorporateActionBalanceDetails20.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmBorrowedBalance
	 * CorporateActionBalanceDetails20.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmCollateralInBalance
	 * CorporateActionBalanceDetails20.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmCollateralOutBalance
	 * CorporateActionBalanceDetails20.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmOnLoanBalance
	 * CorporateActionBalanceDetails20.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails20.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails20.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails20.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails20.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmStreetPositionBalance
	 * CorporateActionBalanceDetails20.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails20.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails20.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmRegisteredBalance
	 * CorporateActionBalanceDetails20.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmObligatedBalance
	 * CorporateActionBalanceDetails20.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmAffectedBalance
	 * CorporateActionBalanceDetails20.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmUnaffectedBalance
	 * CorporateActionBalanceDetails20.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmBlockedBalance
	 * CorporateActionBalanceDetails21.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmBorrowedBalance
	 * CorporateActionBalanceDetails21.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmCollateralInBalance
	 * CorporateActionBalanceDetails21.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmCollateralOutBalance
	 * CorporateActionBalanceDetails21.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmOnLoanBalance
	 * CorporateActionBalanceDetails21.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails21.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails21.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails21.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails21.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmStreetPositionBalance
	 * CorporateActionBalanceDetails21.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails21.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails21.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmRegisteredBalance
	 * CorporateActionBalanceDetails21.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmObligatedBalance
	 * CorporateActionBalanceDetails21.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmAffectedBalance
	 * CorporateActionBalanceDetails21.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmUnaffectedBalance
	 * CorporateActionBalanceDetails21.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmConfirmedBalance
	 * CorporateActionBalanceDetails22.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmBlockedBalance
	 * CorporateActionBalanceDetails22.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmBorrowedBalance
	 * CorporateActionBalanceDetails22.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmCollateralInBalance
	 * CorporateActionBalanceDetails22.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmCollateralOutBalance
	 * CorporateActionBalanceDetails22.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmOnLoanBalance
	 * CorporateActionBalanceDetails22.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails22.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails22.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails22.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails22.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmStreetPositionBalance
	 * CorporateActionBalanceDetails22.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails22.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails22.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmRegisteredBalance
	 * CorporateActionBalanceDetails22.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmAffectedBalance
	 * CorporateActionBalanceDetails22.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmUnaffectedBalance
	 * CorporateActionBalanceDetails22.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmBlockedBalance
	 * CorporateActionBalanceDetails25.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmBorrowedBalance
	 * CorporateActionBalanceDetails25.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmCollateralInBalance
	 * CorporateActionBalanceDetails25.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmCollateralOutBalance
	 * CorporateActionBalanceDetails25.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmOnLoanBalance
	 * CorporateActionBalanceDetails25.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails25.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails25.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails25.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails25.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmStreetPositionBalance
	 * CorporateActionBalanceDetails25.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails25.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails25.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmRegisteredBalance
	 * CorporateActionBalanceDetails25.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmObligatedBalance
	 * CorporateActionBalanceDetails25.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmAffectedBalance
	 * CorporateActionBalanceDetails25.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmUnaffectedBalance
	 * CorporateActionBalanceDetails25.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmConfirmedBalance
	 * CorporateActionBalanceDetails28.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmBlockedBalance
	 * CorporateActionBalanceDetails28.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmBorrowedBalance
	 * CorporateActionBalanceDetails28.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmCollateralInBalance
	 * CorporateActionBalanceDetails28.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmCollateralOutBalance
	 * CorporateActionBalanceDetails28.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmOnLoanBalance
	 * CorporateActionBalanceDetails28.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails28.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails28.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails28.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails28.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmStreetPositionBalance
	 * CorporateActionBalanceDetails28.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails28.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails28.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmRegisteredBalance
	 * CorporateActionBalanceDetails28.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmAffectedBalance
	 * CorporateActionBalanceDetails28.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmUnaffectedBalance
	 * CorporateActionBalanceDetails28.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmBlockedBalance
	 * CorporateActionBalanceDetails32.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmBorrowedBalance
	 * CorporateActionBalanceDetails32.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmCollateralInBalance
	 * CorporateActionBalanceDetails32.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmCollateralOutBalance
	 * CorporateActionBalanceDetails32.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmOnLoanBalance
	 * CorporateActionBalanceDetails32.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails32.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails32.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails32.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails32.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmStreetPositionBalance
	 * CorporateActionBalanceDetails32.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails32.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails32.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmRegisteredBalance
	 * CorporateActionBalanceDetails32.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmConfirmedBalance
	 * CorporateActionBalanceDetails31.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmBlockedBalance
	 * CorporateActionBalanceDetails31.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmBorrowedBalance
	 * CorporateActionBalanceDetails31.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmCollateralInBalance
	 * CorporateActionBalanceDetails31.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmCollateralOutBalance
	 * CorporateActionBalanceDetails31.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmOnLoanBalance
	 * CorporateActionBalanceDetails31.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails31.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails31.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails31.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails31.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmStreetPositionBalance
	 * CorporateActionBalanceDetails31.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails31.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails31.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmRegisteredBalance
	 * CorporateActionBalanceDetails31.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmAffectedBalance
	 * CorporateActionBalanceDetails31.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmUnaffectedBalance
	 * CorporateActionBalanceDetails31.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmBlockedBalance
	 * CorporateActionBalanceDetails30.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmBorrowedBalance
	 * CorporateActionBalanceDetails30.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmCollateralInBalance
	 * CorporateActionBalanceDetails30.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmCollateralOutBalance
	 * CorporateActionBalanceDetails30.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmOnLoanBalance
	 * CorporateActionBalanceDetails30.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails30.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails30.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmStreetPositionBalance
	 * CorporateActionBalanceDetails30.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails30.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails30.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmRegisteredBalance
	 * CorporateActionBalanceDetails30.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmObligatedBalance
	 * CorporateActionBalanceDetails30.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails30.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails30.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmBlockedBalance
	 * CorporateActionBalanceDetails29.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmBorrowedBalance
	 * CorporateActionBalanceDetails29.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmCollateralInBalance
	 * CorporateActionBalanceDetails29.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmCollateralOutBalance
	 * CorporateActionBalanceDetails29.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmOnLoanBalance
	 * CorporateActionBalanceDetails29.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails29.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails29.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails29.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails29.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmStreetPositionBalance
	 * CorporateActionBalanceDetails29.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails29.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails29.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmRegisteredBalance
	 * CorporateActionBalanceDetails29.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmObligatedBalance
	 * CorporateActionBalanceDetails29.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmAffectedBalance
	 * CorporateActionBalanceDetails29.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmUnaffectedBalance
	 * CorporateActionBalanceDetails29.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmBlockedBalance
	 * CorporateActionBalanceDetails33.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmBorrowedBalance
	 * CorporateActionBalanceDetails33.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmCollateralInBalance
	 * CorporateActionBalanceDetails33.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmCollateralOutBalance
	 * CorporateActionBalanceDetails33.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmOnLoanBalance
	 * CorporateActionBalanceDetails33.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails33.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails33.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmStreetPositionBalance
	 * CorporateActionBalanceDetails33.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails33.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails33.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmRegisteredBalance
	 * CorporateActionBalanceDetails33.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmObligatedBalance
	 * CorporateActionBalanceDetails33.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails33.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails33.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmConfirmedBalance
	 * CorporateActionBalanceDetails35.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmBlockedBalance
	 * CorporateActionBalanceDetails35.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmBorrowedBalance
	 * CorporateActionBalanceDetails35.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmCollateralInBalance
	 * CorporateActionBalanceDetails35.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmCollateralOutBalance
	 * CorporateActionBalanceDetails35.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmOnLoanBalance
	 * CorporateActionBalanceDetails35.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails35.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails35.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails35.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails35.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmStreetPositionBalance
	 * CorporateActionBalanceDetails35.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails35.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails35.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmRegisteredBalance
	 * CorporateActionBalanceDetails35.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmAffectedBalance
	 * CorporateActionBalanceDetails35.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmUnaffectedBalance
	 * CorporateActionBalanceDetails35.mmUnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmBlockedBalance
	 * CorporateActionBalanceDetails34.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmBorrowedBalance
	 * CorporateActionBalanceDetails34.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmCollateralInBalance
	 * CorporateActionBalanceDetails34.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmCollateralOutBalance
	 * CorporateActionBalanceDetails34.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmOnLoanBalance
	 * CorporateActionBalanceDetails34.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails34.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails34.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails34.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails34.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmStreetPositionBalance
	 * CorporateActionBalanceDetails34.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails34.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails34.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmRegisteredBalance
	 * CorporateActionBalanceDetails34.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmBlockedBalance
	 * CorporateActionBalanceDetails36.mmBlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmBorrowedBalance
	 * CorporateActionBalanceDetails36.mmBorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmCollateralInBalance
	 * CorporateActionBalanceDetails36.mmCollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmCollateralOutBalance
	 * CorporateActionBalanceDetails36.mmCollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmOnLoanBalance
	 * CorporateActionBalanceDetails36.mmOnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails36.mmPendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails36.mmPendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails36.mmOutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails36.mmSettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmStreetPositionBalance
	 * CorporateActionBalanceDetails36.mmStreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails36.mmTradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails36.mmInTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmRegisteredBalance
	 * CorporateActionBalanceDetails36.mmRegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmObligatedBalance
	 * CorporateActionBalanceDetails36.mmObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmAffectedBalance
	 * CorporateActionBalanceDetails36.mmAffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmUnaffectedBalance
	 * CorporateActionBalanceDetails36.mmUnaffectedBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies any type of balance related to a corporate action entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails3.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails3.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails3.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails3.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails3.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails3.mmPendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails3.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails3.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails3.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails3.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails3.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails3.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails3.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails5.mmBlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails5.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails5.mmCollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails5.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails5.mmOnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails5.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails5.mmPendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails5.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails5.mmSettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails5.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails5.mmTradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails5.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails5.mmRegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails12.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails12.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails12.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails12.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails12.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails12.mmPendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails12.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails12.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails12.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails12.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails12.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails12.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails12.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails15.mmBlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails15.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails15.mmCollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails15.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails15.mmOnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails15.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails15.mmPendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails15.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails15.mmSettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails15.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails15.mmTradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails15.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails15.mmRegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmPendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmPendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmPendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmPendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmBlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmCollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmOnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmPendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmSettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmTradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmRegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails2.mmUnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmBlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmCollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmOnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmPendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmSettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmTradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmRegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.mmUnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmBlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmCollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmOnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmPendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmSettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmTradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmRegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails11.mmUnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmBlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmCollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmOnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmPendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmSettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmTradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmRegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.mmUnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmBlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmCollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmOnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmPendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmSettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmTradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmRegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails18.mmUnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmBlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmCollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmOnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmPendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmSettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmTradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmRegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.mmUnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmPendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmUnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmPendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmUnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmPendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmUnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmPendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmUnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmPendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmUnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmPendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmUnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmPendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmUnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmBlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmCollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmOnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmPendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmSettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmTradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmRegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails22.mmUnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmPendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmUnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmBlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmCollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmOnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmPendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmSettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmTradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmRegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails28.mmUnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails32.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails32.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails32.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails32.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails32.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails32.mmPendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails32.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails32.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails32.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails32.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails32.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails32.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails32.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmConfirmedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmPendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmAffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails31.mmUnaffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmBlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmCollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmOnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmSettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmTradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmRegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObligatedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmPendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmBlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmCollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmOnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmPendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmSettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmTradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmRegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmObligatedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmAffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmUnaffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmBlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmCollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmOnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmSettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmTradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmRegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObligatedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmPendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmConfirmedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmPendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmAffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmUnaffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmBlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmCollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmOnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmPendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmSettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmTradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmRegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmBorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmCollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmPendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmOutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmStreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmInTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmAffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmUnaffectedBalance);
			elementContext_lazy = () -> CorporateActionEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Specifies any type of balance related to a corporate action entitlement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmCorporateActionEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesBalance> instructedBalance;
	/**
	 * Balance of instructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmInstructedBalanceRelatedEntitlement
	 * SecuritiesBalance.mmInstructedBalanceRelatedEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive1Choice#mmInstructedQuantity
	 * InstructedOrQuantityToReceive1Choice.mmInstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice#mmInstructedQuantity
	 * InstructedOrQuantityToReceive2Choice.mmInstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption6#mmInstructedOrQuantityToReceive
	 * CorporateActionOption6.mmInstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption21#mmInstructedOrQuantityToReceive
	 * CorporateActionOption21.mmInstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption42#mmInstructedOrQuantityToReceive
	 * CorporateActionOption42.mmInstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption28#mmInstructedOrQuantityToReceive
	 * CorporateActionOption28.mmInstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption43#mmInstructedOrQuantityToReceive
	 * CorporateActionOption43.mmInstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#mmInstructedBalance
	 * CorporateActionOption9.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#mmInstructedBalance
	 * CorporateActionOption18.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#mmInstructedBalance
	 * CorporateActionOption22.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmInstructedBalance
	 * CorporateActionOption27.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#mmInstructedBalance
	 * CorporateActionOption26.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#mmInstructedBalance
	 * CorporateActionOption41.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#mmInstructedBalance
	 * CorporateActionOption50.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption1#mmInstructedBalance
	 * InstructedCorporateActionOption1.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails1#mmTotalInstructedBalance
	 * InstructedBalanceDetails1.mmTotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails4.mmTotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption2#mmInstructedBalance
	 * InstructedCorporateActionOption2.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails2#mmTotalInstructedBalance
	 * InstructedBalanceDetails2.mmTotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails8.mmTotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#mmInstructedBalance
	 * InstructedCorporateActionOption4.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails3#mmTotalInstructedBalance
	 * InstructedBalanceDetails3.mmTotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails9.mmTotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#mmInstructedBalance
	 * InstructedCorporateActionOption5.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails4#mmTotalInstructedBalance
	 * InstructedBalanceDetails4.mmTotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails16.mmTotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#mmInstructedBalance
	 * CorporateActionOption29.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmInstructedBalance
	 * CorporateActionBalanceDetails1.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmInstructedBalance
	 * CorporateActionBalanceDetails7.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmInstructedBalance
	 * CorporateActionBalanceDetails10.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmInstructedBalance
	 * CorporateActionBalanceDetails13.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmInstructedBalance
	 * CorporateActionBalanceDetails17.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmInstructedBalance
	 * CorporateActionBalanceDetails20.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#mmInstructedBalance
	 * FinancialInstrumentAttributes3.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#mmInstructedBalance
	 * FinancialInstrumentAttributes12.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#mmInstructedBalance
	 * FinancialInstrumentAttributes17.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#mmInstructedBalance
	 * FinancialInstrumentAttributes25.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#mmInstructedBalance
	 * FinancialInstrumentAttributes46.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#mmInstructedBalance
	 * FinancialInstrumentAttributes47.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption7#mmInstructedOrQuantityToReceive
	 * CorporateActionOption7.mmInstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption8#mmInstructedBalance
	 * CorporateActionOption8.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmInstructedBalance
	 * CorporateActionBalanceDetails21.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmInstructedBalance
	 * CorporateActionBalanceDetails25.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmInstructedBalance
	 * CorporateActionOption116.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmInstructedBalance
	 * FinancialInstrumentAttributes68.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120#mmInstructedQuantity
	 * CorporateActionOption120.mmInstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmInstructedBalance
	 * InstructedCorporateActionOption6.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption52#mmInstructedQuantity
	 * SecuritiesOption52.mmInstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails30.mmTotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmInstructedBalance
	 * CorporateActionBalanceDetails29.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails5#mmTotalInstructedBalance
	 * InstructedBalanceDetails5.mmTotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#mmInstructedBalance
	 * CorporateActionOption121.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#mmInstructedBalance
	 * FinancialInstrumentAttributes73.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption7#mmInstructedBalance
	 * InstructedCorporateActionOption7.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails33.mmTotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails6#mmTotalInstructedBalance
	 * InstructedBalanceDetails6.mmTotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption54#mmInstructedQuantity
	 * SecuritiesOption54.mmInstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmInstructedBalance
	 * CorporateActionBalanceDetails36.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption128#mmInstructedQuantity
	 * CorporateActionOption128.mmInstructedQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of  instructed position."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInstructedBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstructedOrQuantityToReceive1Choice.mmInstructedQuantity, com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice.mmInstructedQuantity,
					com.tools20022.repository.msg.CorporateActionOption6.mmInstructedOrQuantityToReceive, com.tools20022.repository.msg.CorporateActionOption21.mmInstructedOrQuantityToReceive,
					com.tools20022.repository.msg.CorporateActionOption42.mmInstructedOrQuantityToReceive, com.tools20022.repository.msg.CorporateActionOption28.mmInstructedOrQuantityToReceive,
					com.tools20022.repository.msg.CorporateActionOption43.mmInstructedOrQuantityToReceive, com.tools20022.repository.msg.CorporateActionOption9.mmInstructedBalance,
					com.tools20022.repository.msg.CorporateActionOption18.mmInstructedBalance, com.tools20022.repository.msg.CorporateActionOption22.mmInstructedBalance,
					com.tools20022.repository.msg.CorporateActionOption27.mmInstructedBalance, com.tools20022.repository.msg.CorporateActionOption26.mmInstructedBalance,
					com.tools20022.repository.msg.CorporateActionOption41.mmInstructedBalance, com.tools20022.repository.msg.CorporateActionOption50.mmInstructedBalance,
					com.tools20022.repository.msg.InstructedCorporateActionOption1.mmInstructedBalance, com.tools20022.repository.msg.InstructedBalanceDetails1.mmTotalInstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmTotalInstructedBalanceDetails, com.tools20022.repository.msg.InstructedCorporateActionOption2.mmInstructedBalance,
					com.tools20022.repository.msg.InstructedBalanceDetails2.mmTotalInstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmTotalInstructedBalanceDetails,
					com.tools20022.repository.msg.InstructedCorporateActionOption4.mmInstructedBalance, com.tools20022.repository.msg.InstructedBalanceDetails3.mmTotalInstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmTotalInstructedBalanceDetails, com.tools20022.repository.msg.InstructedCorporateActionOption5.mmInstructedBalance,
					com.tools20022.repository.msg.InstructedBalanceDetails4.mmTotalInstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmTotalInstructedBalanceDetails,
					com.tools20022.repository.msg.CorporateActionOption29.mmInstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmInstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmInstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmInstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmInstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmInstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmInstructedBalance, com.tools20022.repository.msg.FinancialInstrumentAttributes3.mmInstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes12.mmInstructedBalance, com.tools20022.repository.msg.FinancialInstrumentAttributes17.mmInstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes25.mmInstructedBalance, com.tools20022.repository.msg.FinancialInstrumentAttributes46.mmInstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes47.mmInstructedBalance, com.tools20022.repository.msg.CorporateActionOption7.mmInstructedOrQuantityToReceive,
					com.tools20022.repository.msg.CorporateActionOption8.mmInstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmInstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmInstructedBalance, com.tools20022.repository.msg.CorporateActionOption116.mmInstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes68.mmInstructedBalance, com.tools20022.repository.msg.CorporateActionOption120.mmInstructedQuantity,
					com.tools20022.repository.msg.InstructedCorporateActionOption6.mmInstructedBalance, com.tools20022.repository.msg.SecuritiesOption52.mmInstructedQuantity,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmTotalInstructedBalanceDetails, com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmInstructedBalance,
					com.tools20022.repository.msg.InstructedBalanceDetails5.mmTotalInstructedBalance, com.tools20022.repository.msg.CorporateActionOption121.mmInstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes73.mmInstructedBalance, com.tools20022.repository.msg.InstructedCorporateActionOption7.mmInstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmTotalInstructedBalanceDetails, com.tools20022.repository.msg.InstructedBalanceDetails6.mmTotalInstructedBalance,
					com.tools20022.repository.msg.SecuritiesOption54.mmInstructedQuantity, com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmInstructedBalance,
					com.tools20022.repository.msg.CorporateActionOption128.mmInstructedQuantity);
			elementContext_lazy = () -> CorporateActionEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructedBalance";
			definition = "Balance of  instructed position.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmInstructedBalanceRelatedEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesBalance> uninstructedBalance;
	/**
	 * Balance of uninstructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmUninstructedBalanceRelatedEntitlement
	 * SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#mmUninstructedBalance
	 * CorporateActionOption9.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#mmUninstructedBalance
	 * CorporateActionOption18.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#mmUninstructedBalance
	 * CorporateActionOption22.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmUninstructedBalance
	 * CorporateActionOption27.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#mmUninstructedBalance
	 * CorporateActionOption26.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#mmUninstructedBalance
	 * CorporateActionOption41.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#mmUninstructedBalance
	 * CorporateActionOption50.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmUninstructedBalance
	 * CorporateActionBalanceDetails4.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmUninstructedBalance
	 * CorporateActionBalanceDetails8.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmUninstructedBalance
	 * CorporateActionBalanceDetails9.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmUninstructedBalance
	 * CorporateActionBalanceDetails16.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#mmUninstructedBalance
	 * CorporateActionOption29.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmUninstructedBalance
	 * CorporateActionBalanceDetails1.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmUninstructedBalance
	 * CorporateActionBalanceDetails7.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmUninstructedBalance
	 * CorporateActionBalanceDetails10.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmUninstructedBalance
	 * CorporateActionBalanceDetails13.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmUninstructedBalance
	 * CorporateActionBalanceDetails17.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmUninstructedBalance
	 * CorporateActionBalanceDetails20.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#mmUninstructedBalance
	 * FinancialInstrumentAttributes3.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#mmUninstructedBalance
	 * FinancialInstrumentAttributes12.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#mmUninstructedBalance
	 * FinancialInstrumentAttributes17.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#mmUninstructedBalance
	 * FinancialInstrumentAttributes25.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#mmUninstructedBalance
	 * FinancialInstrumentAttributes46.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#mmUninstructedBalance
	 * FinancialInstrumentAttributes47.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption8#mmUninstructedBalance
	 * CorporateActionOption8.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmUninstructedBalance
	 * CorporateActionBalanceDetails21.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmUninstructedBalance
	 * CorporateActionBalanceDetails25.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmUninstructedBalance
	 * CorporateActionOption116.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmUninstructedBalance
	 * FinancialInstrumentAttributes68.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmUninstructedBalance
	 * CorporateActionBalanceDetails30.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmUninstructedBalance
	 * CorporateActionBalanceDetails29.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#mmUninstructedBalance
	 * CorporateActionOption121.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#mmUninstructedBalance
	 * FinancialInstrumentAttributes73.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmUninstructedBalance
	 * CorporateActionBalanceDetails33.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmUninstructedBalance
	 * CorporateActionBalanceDetails36.mmUninstructedBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of uninstructed position."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUninstructedBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption9.mmUninstructedBalance, com.tools20022.repository.msg.CorporateActionOption18.mmUninstructedBalance,
					com.tools20022.repository.msg.CorporateActionOption22.mmUninstructedBalance, com.tools20022.repository.msg.CorporateActionOption27.mmUninstructedBalance,
					com.tools20022.repository.msg.CorporateActionOption26.mmUninstructedBalance, com.tools20022.repository.msg.CorporateActionOption41.mmUninstructedBalance,
					com.tools20022.repository.msg.CorporateActionOption50.mmUninstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.mmUninstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.mmUninstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.mmUninstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.mmUninstructedBalance, com.tools20022.repository.msg.CorporateActionOption29.mmUninstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.mmUninstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.mmUninstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmUninstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.mmUninstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmUninstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.mmUninstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes3.mmUninstructedBalance, com.tools20022.repository.msg.FinancialInstrumentAttributes12.mmUninstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes17.mmUninstructedBalance, com.tools20022.repository.msg.FinancialInstrumentAttributes25.mmUninstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes46.mmUninstructedBalance, com.tools20022.repository.msg.FinancialInstrumentAttributes47.mmUninstructedBalance,
					com.tools20022.repository.msg.CorporateActionOption8.mmUninstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmUninstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.mmUninstructedBalance, com.tools20022.repository.msg.CorporateActionOption116.mmUninstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes68.mmUninstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmUninstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.mmUninstructedBalance, com.tools20022.repository.msg.CorporateActionOption121.mmUninstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes73.mmUninstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmUninstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.mmUninstructedBalance);
			elementContext_lazy = () -> CorporateActionEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UninstructedBalance";
			definition = "Balance of uninstructed position.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected YesNoIndicator eligibleBalanceIndicator;
	/**
	 * Indicates whether the eligible balance is final except for a voluntary
	 * corporate action event where it can represent the current eligible
	 * balance when communicated before expiration date of that event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification2#mmEligibleBalanceIndicator
	 * CorporateActionNotification2.mmEligibleBalanceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification3#mmEligibleBalanceIndicator
	 * CorporateActionNotification3.mmEligibleBalanceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4#mmEligibleBalanceIndicator
	 * CorporateActionNotification4.mmEligibleBalanceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5#mmEligibleBalanceIndicator
	 * CorporateActionNotification5.mmEligibleBalanceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification6#mmEligibleBalanceIndicator
	 * CorporateActionNotification6.mmEligibleBalanceIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleBalanceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the eligible balance is final except for a voluntary corporate action event where it can represent the current eligible balance when communicated before expiration date of that event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEligibleBalanceIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNotification2.mmEligibleBalanceIndicator, com.tools20022.repository.msg.CorporateActionNotification3.mmEligibleBalanceIndicator,
					com.tools20022.repository.msg.CorporateActionNotification4.mmEligibleBalanceIndicator, com.tools20022.repository.msg.CorporateActionNotification5.mmEligibleBalanceIndicator,
					com.tools20022.repository.msg.CorporateActionNotification6.mmEligibleBalanceIndicator);
			elementContext_lazy = () -> CorporateActionEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligibleBalanceIndicator";
			definition = "Indicates whether the eligible balance is final except for a voluntary corporate action event where it can represent the current eligible balance when communicated before expiration date of that event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected CorporateActionServicing relatedServicing;
	/**
	 * Process which groups the activities related to corporate action
	 * servicing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionEntitlement
	 * CorporateActionServicing.mmCorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to corporate action servicing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Process which groups the activities related to corporate action servicing.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesBalance> notEligibleBalance;
	/**
	 * Total balance of securities which are not eligible for this corporate
	 * action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmNotEligibleBalanceRelatedEntitlement
	 * SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total balance of securities which are not eligible for this corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNotEligibleBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotEligibleBalance";
			definition = "Total balance of securities which are not eligible for this corporate action event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEntitlement";
				definition = "Rights entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesBalance.mmEligibleBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.mmCorporateActionEntitlement,
						com.tools20022.repository.entity.SecuritiesBalance.mmInstructedBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement,
						com.tools20022.repository.entity.SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement, com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionEntitlement);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntitlementAdvice1.mmAccountAndDistributionDetails);
				subType_lazy = () -> Arrays.asList(CorporateActionCashEntitlement.mmObject(), CorporateActionSecuritiesEntitlement.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEntitlement.mmEligibleBalance, com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmInstructedBalance, com.tools20022.repository.entity.CorporateActionEntitlement.mmUninstructedBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmEligibleBalanceIndicator, com.tools20022.repository.entity.CorporateActionEntitlement.mmRelatedServicing,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmNotEligibleBalance);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionBalanceDetails3.mmObject(), CorporateActionBalanceDetails5.mmObject(), CorporateActionBalanceDetails12.mmObject(), CorporateActionBalanceDetails15.mmObject(),
						CorporateActionBalanceDetails4.mmObject(), CorporateActionBalanceDetails8.mmObject(), CorporateActionBalanceDetails9.mmObject(), CorporateActionBalanceDetails16.mmObject(), CorporateActionBalanceDetails2.mmObject(),
						CorporateActionBalanceDetails6.mmObject(), CorporateActionBalanceDetails11.mmObject(), CorporateActionBalanceDetails14.mmObject(), CorporateActionBalanceDetails18.mmObject(),
						CorporateActionBalanceDetails19.mmObject(), CorporateActionBalanceDetails1.mmObject(), CorporateActionBalanceDetails7.mmObject(), CorporateActionBalanceDetails10.mmObject(),
						CorporateActionBalanceDetails13.mmObject(), CorporateActionBalanceDetails17.mmObject(), CorporateActionBalanceDetails20.mmObject(), Entitlement1.mmObject(), EntitlementAdvice1.mmObject(),
						CorporateActionBalanceDetails21.mmObject(), CorporateActionBalanceDetails22.mmObject(), CorporateActionBalanceDetails25.mmObject(), CorporateActionBalanceDetails28.mmObject(),
						CorporateActionBalanceDetails32.mmObject(), CorporateActionBalanceDetails31.mmObject(), CorporateActionBalanceDetails30.mmObject(), CorporateActionBalanceDetails29.mmObject(),
						CorporateActionBalanceDetails33.mmObject(), CorporateActionBalanceDetails35.mmObject(), CorporateActionBalanceDetails34.mmObject(), CorporateActionBalanceDetails36.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesBalance> getEligibleBalance() {
		return eligibleBalance;
	}

	public void setEligibleBalance(List<com.tools20022.repository.entity.SecuritiesBalance> eligibleBalance) {
		this.eligibleBalance = eligibleBalance;
	}

	public List<SecuritiesBalance> getSecuritiesBalance() {
		return securitiesBalance;
	}

	public void setSecuritiesBalance(List<com.tools20022.repository.entity.SecuritiesBalance> securitiesBalance) {
		this.securitiesBalance = securitiesBalance;
	}

	public List<SecuritiesBalance> getInstructedBalance() {
		return instructedBalance;
	}

	public void setInstructedBalance(List<com.tools20022.repository.entity.SecuritiesBalance> instructedBalance) {
		this.instructedBalance = instructedBalance;
	}

	public List<SecuritiesBalance> getUninstructedBalance() {
		return uninstructedBalance;
	}

	public void setUninstructedBalance(List<com.tools20022.repository.entity.SecuritiesBalance> uninstructedBalance) {
		this.uninstructedBalance = uninstructedBalance;
	}

	public YesNoIndicator getEligibleBalanceIndicator() {
		return eligibleBalanceIndicator;
	}

	public void setEligibleBalanceIndicator(YesNoIndicator eligibleBalanceIndicator) {
		this.eligibleBalanceIndicator = eligibleBalanceIndicator;
	}

	public CorporateActionServicing getRelatedServicing() {
		return relatedServicing;
	}

	public void setRelatedServicing(com.tools20022.repository.entity.CorporateActionServicing relatedServicing) {
		this.relatedServicing = relatedServicing;
	}

	public List<SecuritiesBalance> getNotEligibleBalance() {
		return notEligibleBalance;
	}

	public void setNotEligibleBalance(List<com.tools20022.repository.entity.SecuritiesBalance> notEligibleBalance) {
		this.notEligibleBalance = notEligibleBalance;
	}
}