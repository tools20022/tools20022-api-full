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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.msg.CashEntitlement1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Rights for cash entitled to the account owner based on the terms of the
 * corporate action event and the balance of underlying securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionCashEntitlement"
 * src="doc-files/CorporateActionCashEntitlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#GrossCashAmount
 * CorporateActionCashEntitlement.GrossCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#NetCashAmount
 * CorporateActionCashEntitlement.NetCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#CashInLieuOfShare
 * CorporateActionCashEntitlement.CashInLieuOfShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#CapitalGain
 * CorporateActionCashEntitlement.CapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#EntitledCashAmount
 * CorporateActionCashEntitlement.EntitledCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#ExchangeRate
 * CorporateActionCashEntitlement.ExchangeRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForCorporateActionCashEntitlement
 * CurrencyExchange.CurrencyExchangeForCorporateActionCashEntitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Entitlement1#CashDistributionDetails
 * Entitlement1.CashDistributionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
 * CorporateActionEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashEntitlement1
 * CashEntitlement1}</li>
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
 * "CorporateActionCashEntitlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Rights for cash entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities."
 * </li>
 * </ul>
 */
public class CorporateActionCashEntitlement extends CorporateActionEntitlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of money before any deductions and allowances have been made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#GrossCashAmount
	 * CorporateActionAmounts2.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#GrossCashAmount
	 * CorporateActionAmounts5.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#GrossCashAmount
	 * CorporateActionAmounts11.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#GrossCashAmount
	 * CorporateActionAmounts12.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#GrossCashAmount
	 * CorporateActionAmounts17.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#GrossCashAmount
	 * CorporateActionAmounts20.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#GrossCashAmount
	 * CorporateActionAmounts23.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#GrossCashAmount
	 * CorporateActionAmounts24.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#GrossCashAmount
	 * CorporateActionAmounts3.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#GrossCashAmount
	 * CorporateActionAmounts6.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#GrossCashAmount
	 * CorporateActionAmounts9.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#GrossCashAmount
	 * CorporateActionAmounts13.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#GrossCashAmount
	 * CorporateActionAmounts16.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#GrossCashAmount
	 * CorporateActionAmounts19.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#GrossCashAmount
	 * CorporateActionAmounts22.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#GrossCashAmount
	 * CorporateActionAmounts25.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#GrossCashAmount
	 * CorporateActionAmounts4.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#GrossCashAmount
	 * CorporateActionAmounts7.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#GrossCashAmount
	 * CorporateActionAmounts10.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#GrossCashAmount
	 * CorporateActionAmounts14.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#GrossCashAmount
	 * CorporateActionAmounts15.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#GrossCashAmount
	 * CorporateActionAmounts18.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#GrossCashAmount
	 * CorporateActionAmounts21.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#GrossCashAmount
	 * CorporateActionAmounts26.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#GrossCashAmount
	 * CorporateActionAmounts1.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#GrossCashAmount
	 * CorporateActionAmounts29.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#GrossCashAmount
	 * CorporateActionAmounts27.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#GrossCashAmount
	 * CorporateActionAmounts28.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#GrossCashAmount
	 * CorporateActionAmounts33.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#GrossCashAmount
	 * CorporateActionAmounts32.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#GrossCashAmount
	 * CorporateActionAmounts35.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#GrossCashAmount
	 * CorporateActionAmounts37.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#GrossCashAmount
	 * CorporateActionAmounts36.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#GrossCashAmount
	 * CorporateActionAmounts38.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#GrossCashAmount
	 * CorporateActionAmounts39.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#GrossCashAmount
	 * CorporateActionAmounts41.GrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#GrossCashAmount
	 * CorporateActionAmounts40.GrossCashAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
	 * CorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossCashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money before any deductions and allowances have been made."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GrossCashAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts5.GrossCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts12.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts17.GrossCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts20.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts23.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts24.GrossCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts3.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts6.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts9.GrossCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts13.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts16.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts19.GrossCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts22.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts25.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts4.GrossCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts7.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts10.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts14.GrossCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts15.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts18.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts21.GrossCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts26.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts1.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts29.GrossCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts27.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts28.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts33.GrossCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts32.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts35.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts37.GrossCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts36.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts38.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts39.GrossCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts41.GrossCashAmount, com.tools20022.repository.msg.CorporateActionAmounts40.GrossCashAmount);
			elementContext_lazy = () -> CorporateActionCashEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossCashAmount";
			definition = "Amount of money before any deductions and allowances have been made.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money after deductions and allowances have been made, if any,
	 * ie, the total amount +/- charges/fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#NetCashAmount
	 * CorporateActionAmounts2.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#NetCashAmount
	 * CorporateActionAmounts5.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#NetCashAmount
	 * CorporateActionAmounts11.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#NetCashAmount
	 * CorporateActionAmounts12.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#NetCashAmount
	 * CorporateActionAmounts17.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#NetCashAmount
	 * CorporateActionAmounts20.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#NetCashAmount
	 * CorporateActionAmounts23.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#NetCashAmount
	 * CorporateActionAmounts24.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#NetCashAmount
	 * CorporateActionAmounts3.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#NetCashAmount
	 * CorporateActionAmounts6.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#NetCashAmount
	 * CorporateActionAmounts9.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#NetCashAmount
	 * CorporateActionAmounts13.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#NetCashAmount
	 * CorporateActionAmounts16.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#NetCashAmount
	 * CorporateActionAmounts19.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#NetCashAmount
	 * CorporateActionAmounts22.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#NetCashAmount
	 * CorporateActionAmounts25.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#NetCashAmount
	 * CorporateActionAmounts4.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#NetCashAmount
	 * CorporateActionAmounts7.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#NetCashAmount
	 * CorporateActionAmounts10.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#NetCashAmount
	 * CorporateActionAmounts14.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#NetCashAmount
	 * CorporateActionAmounts15.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#NetCashAmount
	 * CorporateActionAmounts18.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#NetCashAmount
	 * CorporateActionAmounts21.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#NetCashAmount
	 * CorporateActionAmounts26.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#NetCashAmount
	 * CorporateActionAmounts1.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#NetCashAmount
	 * CorporateActionAmounts29.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#NetCashAmount
	 * CorporateActionAmounts27.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#NetCashAmount
	 * CorporateActionAmounts28.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#NetCashAmount
	 * CorporateActionAmounts33.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#NetCashAmount
	 * CorporateActionAmounts32.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#NetCashAmount
	 * CorporateActionAmounts35.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#NetCashAmount
	 * CorporateActionAmounts37.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#NetCashAmount
	 * CorporateActionAmounts36.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#NetCashAmount
	 * CorporateActionAmounts38.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#NetCashAmount
	 * CorporateActionAmounts39.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#NetCashAmount
	 * CorporateActionAmounts41.NetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#NetCashAmount
	 * CorporateActionAmounts40.NetCashAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
	 * CorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetCashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money after deductions and allowances have been made, if any, ie, the total amount +/- charges/fees."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NetCashAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts5.NetCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts12.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts17.NetCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts20.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts23.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts24.NetCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts3.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts6.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts9.NetCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts13.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts16.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts19.NetCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts22.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts25.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts4.NetCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts7.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts10.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts14.NetCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts15.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts18.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts21.NetCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts26.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts1.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts29.NetCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts27.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts28.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts33.NetCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts32.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts35.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts37.NetCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts36.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts38.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts39.NetCashAmount,
					com.tools20022.repository.msg.CorporateActionAmounts41.NetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts40.NetCashAmount);
			elementContext_lazy = () -> CorporateActionCashEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetCashAmount";
			definition = "Amount of money after deductions and allowances have been made, if any, ie, the total amount +/- charges/fees.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash disbursement in lieu of a fractional quantity of, eg, equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#CashInLieuOfShare
	 * CorporateActionAmounts2.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#CashInLieuOfShare
	 * CorporateActionAmounts5.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#CashInLieuOfShare
	 * CorporateActionAmounts11.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#CashInLieuOfShare
	 * CorporateActionAmounts12.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#CashInLieuOfShare
	 * CorporateActionAmounts17.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#CashInLieuOfShare
	 * CorporateActionAmounts20.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#CashInLieuOfShare
	 * CorporateActionAmounts23.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#CashInLieuOfShare
	 * CorporateActionAmounts24.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#CashInLieuOfShare
	 * CorporateActionAmounts3.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#CashInLieuOfShare
	 * CorporateActionAmounts6.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#CashInLieuOfShare
	 * CorporateActionAmounts9.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#CashInLieuOfShare
	 * CorporateActionAmounts13.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#CashInLieuOfShare
	 * CorporateActionAmounts16.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#CashInLieuOfShare
	 * CorporateActionAmounts19.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#CashInLieuOfShare
	 * CorporateActionAmounts22.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#CashInLieuOfShare
	 * CorporateActionAmounts25.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#CashInLieuOfShare
	 * CorporateActionAmounts4.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#CashInLieuOfShare
	 * CorporateActionAmounts7.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#CashInLieuOfShare
	 * CorporateActionAmounts10.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#CashInLieuOfShare
	 * CorporateActionAmounts14.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#CashInLieuOfShare
	 * CorporateActionAmounts15.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#CashInLieuOfShare
	 * CorporateActionAmounts18.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#CashInLieuOfShare
	 * CorporateActionAmounts21.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#CashInLieuOfShare
	 * CorporateActionAmounts26.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#CashInLieuOfShare
	 * CorporateActionAmounts1.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#CashInLieuOfShare
	 * CorporateActionAmounts29.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#CashInLieuOfShare
	 * CorporateActionAmounts27.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#CashInLieuOfShare
	 * CorporateActionAmounts28.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#CashInLieuOfShare
	 * CorporateActionAmounts33.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#CashInLieuOfShare
	 * CorporateActionAmounts32.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#CashInLieuOfShare
	 * CorporateActionAmounts35.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#CashInLieuOfShare
	 * CorporateActionAmounts37.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#CashInLieuOfShare
	 * CorporateActionAmounts36.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#CashInLieuOfShare
	 * CorporateActionAmounts38.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#CashInLieuOfShare
	 * CorporateActionAmounts39.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#CashInLieuOfShare
	 * CorporateActionAmounts41.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#CashInLieuOfShare
	 * CorporateActionAmounts40.CashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#CashInLieuOfShare
	 * OptionTransactionDetailsSD2.CashInLieuOfShare}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
	 * CorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of a fractional quantity of, eg, equity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashInLieuOfShare = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts5.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts11.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts12.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts17.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts20.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts23.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts24.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts3.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts6.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts9.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts13.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts16.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts19.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts22.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts25.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts4.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts7.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts10.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts14.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts15.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts18.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts21.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts26.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts1.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts29.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts27.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts28.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts33.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts32.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts35.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts37.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts36.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts38.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts39.CashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts41.CashInLieuOfShare,
					com.tools20022.repository.msg.CorporateActionAmounts40.CashInLieuOfShare, com.tools20022.repository.msg.OptionTransactionDetailsSD2.CashInLieuOfShare);
			elementContext_lazy = () -> CorporateActionCashEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfShare";
			definition = "Cash disbursement in lieu of a fractional quantity of, eg, equity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money distributed as the result of a capital gain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#CapitalGain
	 * CorporateActionAmounts2.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#CapitalGain
	 * CorporateActionAmounts5.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#CapitalGain
	 * CorporateActionAmounts11.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#CapitalGain
	 * CorporateActionAmounts12.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#CapitalGain
	 * CorporateActionAmounts17.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#CapitalGain
	 * CorporateActionAmounts20.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#CapitalGain
	 * CorporateActionAmounts23.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#CapitalGain
	 * CorporateActionAmounts24.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#CapitalGain
	 * CorporateActionAmounts3.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#CapitalGain
	 * CorporateActionAmounts6.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#CapitalGain
	 * CorporateActionAmounts9.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#CapitalGain
	 * CorporateActionAmounts13.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#CapitalGain
	 * CorporateActionAmounts16.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#CapitalGain
	 * CorporateActionAmounts19.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#CapitalGain
	 * CorporateActionAmounts22.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#CapitalGain
	 * CorporateActionAmounts25.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#CapitalGain
	 * CorporateActionAmounts4.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#CapitalGain
	 * CorporateActionAmounts7.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#CapitalGain
	 * CorporateActionAmounts10.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#CapitalGain
	 * CorporateActionAmounts14.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#CapitalGain
	 * CorporateActionAmounts15.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#CapitalGain
	 * CorporateActionAmounts18.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#CapitalGain
	 * CorporateActionAmounts21.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#CapitalGain
	 * CorporateActionAmounts26.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#CapitalGain
	 * CorporateActionAmounts1.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#CapitalGain
	 * CorporateActionAmounts29.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#CapitalGain
	 * CorporateActionAmounts27.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#CapitalGain
	 * CorporateActionAmounts28.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#CapitalGain
	 * CorporateActionAmounts33.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#CapitalGain
	 * CorporateActionAmounts32.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#CapitalGain
	 * CorporateActionAmounts35.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#CapitalGain
	 * CorporateActionAmounts37.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#CapitalGain
	 * CorporateActionAmounts36.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#CapitalGain
	 * CorporateActionAmounts38.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#CapitalGain
	 * CorporateActionAmounts39.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#CapitalGain
	 * CorporateActionAmounts41.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#CapitalGain
	 * CorporateActionAmounts40.CapitalGain}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
	 * CorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money distributed as the result of a capital gain."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CapitalGain = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts5.CapitalGain,
					com.tools20022.repository.msg.CorporateActionAmounts11.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts12.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts17.CapitalGain,
					com.tools20022.repository.msg.CorporateActionAmounts20.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts23.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts24.CapitalGain,
					com.tools20022.repository.msg.CorporateActionAmounts3.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts6.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts9.CapitalGain,
					com.tools20022.repository.msg.CorporateActionAmounts13.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts16.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts19.CapitalGain,
					com.tools20022.repository.msg.CorporateActionAmounts22.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts25.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts4.CapitalGain,
					com.tools20022.repository.msg.CorporateActionAmounts7.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts10.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts14.CapitalGain,
					com.tools20022.repository.msg.CorporateActionAmounts15.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts18.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts21.CapitalGain,
					com.tools20022.repository.msg.CorporateActionAmounts26.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts1.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts29.CapitalGain,
					com.tools20022.repository.msg.CorporateActionAmounts27.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts28.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts33.CapitalGain,
					com.tools20022.repository.msg.CorporateActionAmounts32.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts35.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts37.CapitalGain,
					com.tools20022.repository.msg.CorporateActionAmounts36.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts38.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts39.CapitalGain,
					com.tools20022.repository.msg.CorporateActionAmounts41.CapitalGain, com.tools20022.repository.msg.CorporateActionAmounts40.CapitalGain);
			elementContext_lazy = () -> CorporateActionCashEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapitalGain";
			definition = "Amount of money distributed as the result of a capital gain.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash amount based on terms of corporate action event and balance of
	 * underlying securities, entitled to/from account owner (which may be
	 * positive or negative).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#EntitledAmount
	 * CorporateActionAmounts3.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#EntitledAmount
	 * CorporateActionAmounts6.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#EntitledAmount
	 * CorporateActionAmounts9.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#EntitledAmount
	 * CorporateActionAmounts13.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#EntitledAmount
	 * CorporateActionAmounts16.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#EntitledAmount
	 * CorporateActionAmounts19.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#EntitledAmount
	 * CorporateActionAmounts22.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#EntitledAmount
	 * CorporateActionAmounts25.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#EntitledAmount
	 * CorporateActionAmounts4.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#EntitledAmount
	 * CorporateActionAmounts7.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#EntitledAmount
	 * CorporateActionAmounts10.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#EntitledAmount
	 * CorporateActionAmounts14.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#EntitledAmount
	 * CorporateActionAmounts15.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#EntitledAmount
	 * CorporateActionAmounts18.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#EntitledAmount
	 * CorporateActionAmounts21.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#EntitledAmount
	 * CorporateActionAmounts26.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#EntitledAmount
	 * CorporateActionAmounts1.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashEntitlement1#CashAmount
	 * CashEntitlement1.CashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#EntitledAmount
	 * CorporateActionAmounts27.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#EntitledAmount
	 * CorporateActionAmounts28.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#EntitledAmount
	 * CorporateActionAmounts33.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#EntitledAmount
	 * CorporateActionAmounts32.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#EntitledAmount
	 * CorporateActionAmounts36.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#EntitledAmount
	 * CorporateActionAmounts38.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#EntitledAmount
	 * CorporateActionAmounts41.EntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#EntitledAmount
	 * CorporateActionAmounts40.EntitledAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
	 * CorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitledCashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount based on terms of corporate action event and balance of underlying securities, entitled to/from account owner (which may be positive or negative)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EntitledCashAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts3.EntitledAmount, com.tools20022.repository.msg.CorporateActionAmounts6.EntitledAmount,
					com.tools20022.repository.msg.CorporateActionAmounts9.EntitledAmount, com.tools20022.repository.msg.CorporateActionAmounts13.EntitledAmount, com.tools20022.repository.msg.CorporateActionAmounts16.EntitledAmount,
					com.tools20022.repository.msg.CorporateActionAmounts19.EntitledAmount, com.tools20022.repository.msg.CorporateActionAmounts22.EntitledAmount, com.tools20022.repository.msg.CorporateActionAmounts25.EntitledAmount,
					com.tools20022.repository.msg.CorporateActionAmounts4.EntitledAmount, com.tools20022.repository.msg.CorporateActionAmounts7.EntitledAmount, com.tools20022.repository.msg.CorporateActionAmounts10.EntitledAmount,
					com.tools20022.repository.msg.CorporateActionAmounts14.EntitledAmount, com.tools20022.repository.msg.CorporateActionAmounts15.EntitledAmount, com.tools20022.repository.msg.CorporateActionAmounts18.EntitledAmount,
					com.tools20022.repository.msg.CorporateActionAmounts21.EntitledAmount, com.tools20022.repository.msg.CorporateActionAmounts26.EntitledAmount, com.tools20022.repository.msg.CorporateActionAmounts1.EntitledAmount,
					com.tools20022.repository.msg.CashEntitlement1.CashAmount, com.tools20022.repository.msg.CorporateActionAmounts27.EntitledAmount, com.tools20022.repository.msg.CorporateActionAmounts28.EntitledAmount,
					com.tools20022.repository.msg.CorporateActionAmounts33.EntitledAmount, com.tools20022.repository.msg.CorporateActionAmounts32.EntitledAmount, com.tools20022.repository.msg.CorporateActionAmounts36.EntitledAmount,
					com.tools20022.repository.msg.CorporateActionAmounts38.EntitledAmount, com.tools20022.repository.msg.CorporateActionAmounts41.EntitledAmount, com.tools20022.repository.msg.CorporateActionAmounts40.EntitledAmount);
			elementContext_lazy = () -> CorporateActionCashEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntitledCashAmount";
			definition = "Cash amount based on terms of corporate action event and balance of underlying securities, entitled to/from account owner (which may be positive or negative).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the exchange rate used to convert the cash entitlement value in
	 * another currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForCorporateActionCashEntitlement
	 * CurrencyExchange.CurrencyExchangeForCorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
	 * CorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the exchange rate used to convert the cash entitlement value in another currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExchangeRate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionCashEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Specifies the exchange rate used to convert the cash entitlement value in another currency.";
			minOccurs = 0;
			type_lazy = () -> CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCorporateActionCashEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionCashEntitlement";
				definition = "Rights for cash entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCorporateActionCashEntitlement);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Entitlement1.CashDistributionDetails);
				superType_lazy = () -> CorporateActionEntitlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionCashEntitlement.GrossCashAmount, com.tools20022.repository.entity.CorporateActionCashEntitlement.NetCashAmount,
						com.tools20022.repository.entity.CorporateActionCashEntitlement.CashInLieuOfShare, com.tools20022.repository.entity.CorporateActionCashEntitlement.CapitalGain,
						com.tools20022.repository.entity.CorporateActionCashEntitlement.EntitledCashAmount, com.tools20022.repository.entity.CorporateActionCashEntitlement.ExchangeRate);
				derivationComponent_lazy = () -> Arrays.asList(CashEntitlement1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}