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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
 * CorporateActionEntitlement}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmGrossCashAmount
 * CorporateActionCashEntitlement.mmGrossCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmNetCashAmount
 * CorporateActionCashEntitlement.mmNetCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmCashInLieuOfShare
 * CorporateActionCashEntitlement.mmCashInLieuOfShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmCapitalGain
 * CorporateActionCashEntitlement.mmCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmEntitledCashAmount
 * CorporateActionCashEntitlement.mmEntitledCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmExchangeRate
 * CorporateActionCashEntitlement.mmExchangeRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCorporateActionCashEntitlement
 * CurrencyExchange.mmCurrencyExchangeForCorporateActionCashEntitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Entitlement1#mmCashDistributionDetails
 * Entitlement1.mmCashDistributionDetails}</li>
 * </ul>
 * </li>
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
	protected CurrencyAndAmount grossCashAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmGrossCashAmount
	 * CorporateActionAmounts2.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmGrossCashAmount
	 * CorporateActionAmounts5.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmGrossCashAmount
	 * CorporateActionAmounts11.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmGrossCashAmount
	 * CorporateActionAmounts12.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmGrossCashAmount
	 * CorporateActionAmounts17.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmGrossCashAmount
	 * CorporateActionAmounts20.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmGrossCashAmount
	 * CorporateActionAmounts23.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmGrossCashAmount
	 * CorporateActionAmounts24.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmGrossCashAmount
	 * CorporateActionAmounts3.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmGrossCashAmount
	 * CorporateActionAmounts6.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmGrossCashAmount
	 * CorporateActionAmounts9.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmGrossCashAmount
	 * CorporateActionAmounts13.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmGrossCashAmount
	 * CorporateActionAmounts16.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmGrossCashAmount
	 * CorporateActionAmounts19.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmGrossCashAmount
	 * CorporateActionAmounts22.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmGrossCashAmount
	 * CorporateActionAmounts25.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmGrossCashAmount
	 * CorporateActionAmounts4.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmGrossCashAmount
	 * CorporateActionAmounts7.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmGrossCashAmount
	 * CorporateActionAmounts10.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmGrossCashAmount
	 * CorporateActionAmounts14.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmGrossCashAmount
	 * CorporateActionAmounts15.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmGrossCashAmount
	 * CorporateActionAmounts18.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmGrossCashAmount
	 * CorporateActionAmounts21.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmGrossCashAmount
	 * CorporateActionAmounts26.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmGrossCashAmount
	 * CorporateActionAmounts1.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmGrossCashAmount
	 * CorporateActionAmounts29.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmGrossCashAmount
	 * CorporateActionAmounts27.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmGrossCashAmount
	 * CorporateActionAmounts28.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmGrossCashAmount
	 * CorporateActionAmounts33.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmGrossCashAmount
	 * CorporateActionAmounts32.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmGrossCashAmount
	 * CorporateActionAmounts35.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmGrossCashAmount
	 * CorporateActionAmounts37.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmGrossCashAmount
	 * CorporateActionAmounts36.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmGrossCashAmount
	 * CorporateActionAmounts38.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmGrossCashAmount
	 * CorporateActionAmounts39.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmGrossCashAmount
	 * CorporateActionAmounts41.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmGrossCashAmount
	 * CorporateActionAmounts40.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmGrossCashAmount
	 * CorporateActionAmounts42.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmGrossCashAmount
	 * CorporateActionAmounts43.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmGrossCashAmount
	 * CorporateActionAmounts44.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmGrossCashAmount
	 * CorporateActionAmounts45.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmGrossCashAmount
	 * CorporateActionAmounts46.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmGrossCashAmount
	 * CorporateActionAmounts47.mmGrossCashAmount}</li>
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
	public static final MMBusinessAttribute mmGrossCashAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmGrossCashAmount, CorporateActionAmounts5.mmGrossCashAmount, CorporateActionAmounts11.mmGrossCashAmount, CorporateActionAmounts12.mmGrossCashAmount,
					CorporateActionAmounts17.mmGrossCashAmount, CorporateActionAmounts20.mmGrossCashAmount, CorporateActionAmounts23.mmGrossCashAmount, CorporateActionAmounts24.mmGrossCashAmount, CorporateActionAmounts3.mmGrossCashAmount,
					CorporateActionAmounts6.mmGrossCashAmount, CorporateActionAmounts9.mmGrossCashAmount, CorporateActionAmounts13.mmGrossCashAmount, CorporateActionAmounts16.mmGrossCashAmount, CorporateActionAmounts19.mmGrossCashAmount,
					CorporateActionAmounts22.mmGrossCashAmount, CorporateActionAmounts25.mmGrossCashAmount, CorporateActionAmounts4.mmGrossCashAmount, CorporateActionAmounts7.mmGrossCashAmount, CorporateActionAmounts10.mmGrossCashAmount,
					CorporateActionAmounts14.mmGrossCashAmount, CorporateActionAmounts15.mmGrossCashAmount, CorporateActionAmounts18.mmGrossCashAmount, CorporateActionAmounts21.mmGrossCashAmount, CorporateActionAmounts26.mmGrossCashAmount,
					CorporateActionAmounts1.mmGrossCashAmount, CorporateActionAmounts29.mmGrossCashAmount, CorporateActionAmounts27.mmGrossCashAmount, CorporateActionAmounts28.mmGrossCashAmount, CorporateActionAmounts33.mmGrossCashAmount,
					CorporateActionAmounts32.mmGrossCashAmount, CorporateActionAmounts35.mmGrossCashAmount, CorporateActionAmounts37.mmGrossCashAmount, CorporateActionAmounts36.mmGrossCashAmount, CorporateActionAmounts38.mmGrossCashAmount,
					CorporateActionAmounts39.mmGrossCashAmount, CorporateActionAmounts41.mmGrossCashAmount, CorporateActionAmounts40.mmGrossCashAmount, CorporateActionAmounts42.mmGrossCashAmount, CorporateActionAmounts43.mmGrossCashAmount,
					CorporateActionAmounts44.mmGrossCashAmount, CorporateActionAmounts45.mmGrossCashAmount, CorporateActionAmounts46.mmGrossCashAmount, CorporateActionAmounts47.mmGrossCashAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionCashEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossCashAmount";
			definition = "Amount of money before any deductions and allowances have been made.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionCashEntitlement.class.getMethod("getGrossCashAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount netCashAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmNetCashAmount
	 * CorporateActionAmounts2.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmNetCashAmount
	 * CorporateActionAmounts5.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmNetCashAmount
	 * CorporateActionAmounts11.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmNetCashAmount
	 * CorporateActionAmounts12.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmNetCashAmount
	 * CorporateActionAmounts17.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmNetCashAmount
	 * CorporateActionAmounts20.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmNetCashAmount
	 * CorporateActionAmounts23.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmNetCashAmount
	 * CorporateActionAmounts24.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmNetCashAmount
	 * CorporateActionAmounts3.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmNetCashAmount
	 * CorporateActionAmounts6.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmNetCashAmount
	 * CorporateActionAmounts9.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmNetCashAmount
	 * CorporateActionAmounts13.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmNetCashAmount
	 * CorporateActionAmounts16.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmNetCashAmount
	 * CorporateActionAmounts19.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmNetCashAmount
	 * CorporateActionAmounts22.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmNetCashAmount
	 * CorporateActionAmounts25.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmNetCashAmount
	 * CorporateActionAmounts4.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmNetCashAmount
	 * CorporateActionAmounts7.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmNetCashAmount
	 * CorporateActionAmounts10.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmNetCashAmount
	 * CorporateActionAmounts14.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmNetCashAmount
	 * CorporateActionAmounts15.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmNetCashAmount
	 * CorporateActionAmounts18.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmNetCashAmount
	 * CorporateActionAmounts21.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmNetCashAmount
	 * CorporateActionAmounts26.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmNetCashAmount
	 * CorporateActionAmounts1.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmNetCashAmount
	 * CorporateActionAmounts29.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmNetCashAmount
	 * CorporateActionAmounts27.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmNetCashAmount
	 * CorporateActionAmounts28.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmNetCashAmount
	 * CorporateActionAmounts33.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmNetCashAmount
	 * CorporateActionAmounts32.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmNetCashAmount
	 * CorporateActionAmounts35.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmNetCashAmount
	 * CorporateActionAmounts37.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmNetCashAmount
	 * CorporateActionAmounts36.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmNetCashAmount
	 * CorporateActionAmounts38.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmNetCashAmount
	 * CorporateActionAmounts39.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmNetCashAmount
	 * CorporateActionAmounts41.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmNetCashAmount
	 * CorporateActionAmounts40.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmNetCashAmount
	 * CorporateActionAmounts42.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmNetCashAmount
	 * CorporateActionAmounts43.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmNetCashAmount
	 * CorporateActionAmounts44.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmNetCashAmount
	 * CorporateActionAmounts45.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmNetCashAmount
	 * CorporateActionAmounts46.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmNetCashAmount
	 * CorporateActionAmounts47.mmNetCashAmount}</li>
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
	public static final MMBusinessAttribute mmNetCashAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmNetCashAmount, CorporateActionAmounts5.mmNetCashAmount, CorporateActionAmounts11.mmNetCashAmount, CorporateActionAmounts12.mmNetCashAmount,
					CorporateActionAmounts17.mmNetCashAmount, CorporateActionAmounts20.mmNetCashAmount, CorporateActionAmounts23.mmNetCashAmount, CorporateActionAmounts24.mmNetCashAmount, CorporateActionAmounts3.mmNetCashAmount,
					CorporateActionAmounts6.mmNetCashAmount, CorporateActionAmounts9.mmNetCashAmount, CorporateActionAmounts13.mmNetCashAmount, CorporateActionAmounts16.mmNetCashAmount, CorporateActionAmounts19.mmNetCashAmount,
					CorporateActionAmounts22.mmNetCashAmount, CorporateActionAmounts25.mmNetCashAmount, CorporateActionAmounts4.mmNetCashAmount, CorporateActionAmounts7.mmNetCashAmount, CorporateActionAmounts10.mmNetCashAmount,
					CorporateActionAmounts14.mmNetCashAmount, CorporateActionAmounts15.mmNetCashAmount, CorporateActionAmounts18.mmNetCashAmount, CorporateActionAmounts21.mmNetCashAmount, CorporateActionAmounts26.mmNetCashAmount,
					CorporateActionAmounts1.mmNetCashAmount, CorporateActionAmounts29.mmNetCashAmount, CorporateActionAmounts27.mmNetCashAmount, CorporateActionAmounts28.mmNetCashAmount, CorporateActionAmounts33.mmNetCashAmount,
					CorporateActionAmounts32.mmNetCashAmount, CorporateActionAmounts35.mmNetCashAmount, CorporateActionAmounts37.mmNetCashAmount, CorporateActionAmounts36.mmNetCashAmount, CorporateActionAmounts38.mmNetCashAmount,
					CorporateActionAmounts39.mmNetCashAmount, CorporateActionAmounts41.mmNetCashAmount, CorporateActionAmounts40.mmNetCashAmount, CorporateActionAmounts42.mmNetCashAmount, CorporateActionAmounts43.mmNetCashAmount,
					CorporateActionAmounts44.mmNetCashAmount, CorporateActionAmounts45.mmNetCashAmount, CorporateActionAmounts46.mmNetCashAmount, CorporateActionAmounts47.mmNetCashAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionCashEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetCashAmount";
			definition = "Amount of money after deductions and allowances have been made, if any, ie, the total amount +/- charges/fees.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionCashEntitlement.class.getMethod("getNetCashAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount cashInLieuOfShare;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmCashInLieuOfShare
	 * CorporateActionAmounts2.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmCashInLieuOfShare
	 * CorporateActionAmounts5.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmCashInLieuOfShare
	 * CorporateActionAmounts11.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmCashInLieuOfShare
	 * CorporateActionAmounts12.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmCashInLieuOfShare
	 * CorporateActionAmounts17.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmCashInLieuOfShare
	 * CorporateActionAmounts20.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmCashInLieuOfShare
	 * CorporateActionAmounts23.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmCashInLieuOfShare
	 * CorporateActionAmounts24.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmCashInLieuOfShare
	 * CorporateActionAmounts3.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmCashInLieuOfShare
	 * CorporateActionAmounts6.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmCashInLieuOfShare
	 * CorporateActionAmounts9.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmCashInLieuOfShare
	 * CorporateActionAmounts13.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmCashInLieuOfShare
	 * CorporateActionAmounts16.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmCashInLieuOfShare
	 * CorporateActionAmounts19.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmCashInLieuOfShare
	 * CorporateActionAmounts22.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmCashInLieuOfShare
	 * CorporateActionAmounts25.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmCashInLieuOfShare
	 * CorporateActionAmounts4.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmCashInLieuOfShare
	 * CorporateActionAmounts7.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmCashInLieuOfShare
	 * CorporateActionAmounts10.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmCashInLieuOfShare
	 * CorporateActionAmounts14.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmCashInLieuOfShare
	 * CorporateActionAmounts15.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmCashInLieuOfShare
	 * CorporateActionAmounts18.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmCashInLieuOfShare
	 * CorporateActionAmounts21.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmCashInLieuOfShare
	 * CorporateActionAmounts26.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmCashInLieuOfShare
	 * CorporateActionAmounts1.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmCashInLieuOfShare
	 * CorporateActionAmounts29.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmCashInLieuOfShare
	 * CorporateActionAmounts27.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmCashInLieuOfShare
	 * CorporateActionAmounts28.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmCashInLieuOfShare
	 * CorporateActionAmounts33.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmCashInLieuOfShare
	 * CorporateActionAmounts32.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmCashInLieuOfShare
	 * CorporateActionAmounts35.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmCashInLieuOfShare
	 * CorporateActionAmounts37.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmCashInLieuOfShare
	 * CorporateActionAmounts36.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmCashInLieuOfShare
	 * CorporateActionAmounts38.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmCashInLieuOfShare
	 * CorporateActionAmounts39.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmCashInLieuOfShare
	 * CorporateActionAmounts41.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmCashInLieuOfShare
	 * CorporateActionAmounts40.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmCashInLieuOfShare
	 * OptionTransactionDetailsSD2.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmCashInLieuOfShare
	 * CorporateActionAmounts42.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmCashInLieuOfShare
	 * CorporateActionAmounts43.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmCashInLieuOfShare
	 * CorporateActionAmounts44.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmCashInLieuOfShare
	 * OptionTransactionDetailsSD4.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmCashInLieuOfShare
	 * CorporateActionAmounts45.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmCashInLieuOfShare
	 * CorporateActionAmounts46.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmCashInLieuOfShare
	 * CorporateActionAmounts47.mmCashInLieuOfShare}</li>
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
	public static final MMBusinessAttribute mmCashInLieuOfShare = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmCashInLieuOfShare, CorporateActionAmounts5.mmCashInLieuOfShare, CorporateActionAmounts11.mmCashInLieuOfShare, CorporateActionAmounts12.mmCashInLieuOfShare,
					CorporateActionAmounts17.mmCashInLieuOfShare, CorporateActionAmounts20.mmCashInLieuOfShare, CorporateActionAmounts23.mmCashInLieuOfShare, CorporateActionAmounts24.mmCashInLieuOfShare,
					CorporateActionAmounts3.mmCashInLieuOfShare, CorporateActionAmounts6.mmCashInLieuOfShare, CorporateActionAmounts9.mmCashInLieuOfShare, CorporateActionAmounts13.mmCashInLieuOfShare,
					CorporateActionAmounts16.mmCashInLieuOfShare, CorporateActionAmounts19.mmCashInLieuOfShare, CorporateActionAmounts22.mmCashInLieuOfShare, CorporateActionAmounts25.mmCashInLieuOfShare,
					CorporateActionAmounts4.mmCashInLieuOfShare, CorporateActionAmounts7.mmCashInLieuOfShare, CorporateActionAmounts10.mmCashInLieuOfShare, CorporateActionAmounts14.mmCashInLieuOfShare,
					CorporateActionAmounts15.mmCashInLieuOfShare, CorporateActionAmounts18.mmCashInLieuOfShare, CorporateActionAmounts21.mmCashInLieuOfShare, CorporateActionAmounts26.mmCashInLieuOfShare,
					CorporateActionAmounts1.mmCashInLieuOfShare, CorporateActionAmounts29.mmCashInLieuOfShare, CorporateActionAmounts27.mmCashInLieuOfShare, CorporateActionAmounts28.mmCashInLieuOfShare,
					CorporateActionAmounts33.mmCashInLieuOfShare, CorporateActionAmounts32.mmCashInLieuOfShare, CorporateActionAmounts35.mmCashInLieuOfShare, CorporateActionAmounts37.mmCashInLieuOfShare,
					CorporateActionAmounts36.mmCashInLieuOfShare, CorporateActionAmounts38.mmCashInLieuOfShare, CorporateActionAmounts39.mmCashInLieuOfShare, CorporateActionAmounts41.mmCashInLieuOfShare,
					CorporateActionAmounts40.mmCashInLieuOfShare, OptionTransactionDetailsSD2.mmCashInLieuOfShare, CorporateActionAmounts42.mmCashInLieuOfShare, CorporateActionAmounts43.mmCashInLieuOfShare,
					CorporateActionAmounts44.mmCashInLieuOfShare, OptionTransactionDetailsSD4.mmCashInLieuOfShare, CorporateActionAmounts45.mmCashInLieuOfShare, CorporateActionAmounts46.mmCashInLieuOfShare,
					CorporateActionAmounts47.mmCashInLieuOfShare);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionCashEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfShare";
			definition = "Cash disbursement in lieu of a fractional quantity of, eg, equity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionCashEntitlement.class.getMethod("getCashInLieuOfShare", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount capitalGain;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmCapitalGain
	 * CorporateActionAmounts2.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmCapitalGain
	 * CorporateActionAmounts5.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmCapitalGain
	 * CorporateActionAmounts11.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmCapitalGain
	 * CorporateActionAmounts12.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmCapitalGain
	 * CorporateActionAmounts17.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmCapitalGain
	 * CorporateActionAmounts20.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmCapitalGain
	 * CorporateActionAmounts23.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmCapitalGain
	 * CorporateActionAmounts24.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmCapitalGain
	 * CorporateActionAmounts3.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmCapitalGain
	 * CorporateActionAmounts6.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmCapitalGain
	 * CorporateActionAmounts9.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmCapitalGain
	 * CorporateActionAmounts13.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmCapitalGain
	 * CorporateActionAmounts16.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmCapitalGain
	 * CorporateActionAmounts19.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmCapitalGain
	 * CorporateActionAmounts22.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmCapitalGain
	 * CorporateActionAmounts25.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmCapitalGain
	 * CorporateActionAmounts4.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmCapitalGain
	 * CorporateActionAmounts7.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmCapitalGain
	 * CorporateActionAmounts10.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmCapitalGain
	 * CorporateActionAmounts14.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmCapitalGain
	 * CorporateActionAmounts15.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmCapitalGain
	 * CorporateActionAmounts18.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmCapitalGain
	 * CorporateActionAmounts21.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmCapitalGain
	 * CorporateActionAmounts26.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmCapitalGain
	 * CorporateActionAmounts1.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmCapitalGain
	 * CorporateActionAmounts29.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmCapitalGain
	 * CorporateActionAmounts27.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmCapitalGain
	 * CorporateActionAmounts28.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmCapitalGain
	 * CorporateActionAmounts33.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmCapitalGain
	 * CorporateActionAmounts32.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmCapitalGain
	 * CorporateActionAmounts35.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmCapitalGain
	 * CorporateActionAmounts37.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmCapitalGain
	 * CorporateActionAmounts36.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmCapitalGain
	 * CorporateActionAmounts38.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmCapitalGain
	 * CorporateActionAmounts39.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmCapitalGain
	 * CorporateActionAmounts41.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmCapitalGain
	 * CorporateActionAmounts40.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmCapitalGain
	 * CorporateActionAmounts42.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmCapitalGain
	 * CorporateActionAmounts43.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmCapitalGain
	 * CorporateActionAmounts44.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmCapitalGain
	 * CorporateActionAmounts45.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmCapitalGain
	 * CorporateActionAmounts46.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmCapitalGain
	 * CorporateActionAmounts47.mmCapitalGain}</li>
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
	public static final MMBusinessAttribute mmCapitalGain = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmCapitalGain, CorporateActionAmounts5.mmCapitalGain, CorporateActionAmounts11.mmCapitalGain, CorporateActionAmounts12.mmCapitalGain,
					CorporateActionAmounts17.mmCapitalGain, CorporateActionAmounts20.mmCapitalGain, CorporateActionAmounts23.mmCapitalGain, CorporateActionAmounts24.mmCapitalGain, CorporateActionAmounts3.mmCapitalGain,
					CorporateActionAmounts6.mmCapitalGain, CorporateActionAmounts9.mmCapitalGain, CorporateActionAmounts13.mmCapitalGain, CorporateActionAmounts16.mmCapitalGain, CorporateActionAmounts19.mmCapitalGain,
					CorporateActionAmounts22.mmCapitalGain, CorporateActionAmounts25.mmCapitalGain, CorporateActionAmounts4.mmCapitalGain, CorporateActionAmounts7.mmCapitalGain, CorporateActionAmounts10.mmCapitalGain,
					CorporateActionAmounts14.mmCapitalGain, CorporateActionAmounts15.mmCapitalGain, CorporateActionAmounts18.mmCapitalGain, CorporateActionAmounts21.mmCapitalGain, CorporateActionAmounts26.mmCapitalGain,
					CorporateActionAmounts1.mmCapitalGain, CorporateActionAmounts29.mmCapitalGain, CorporateActionAmounts27.mmCapitalGain, CorporateActionAmounts28.mmCapitalGain, CorporateActionAmounts33.mmCapitalGain,
					CorporateActionAmounts32.mmCapitalGain, CorporateActionAmounts35.mmCapitalGain, CorporateActionAmounts37.mmCapitalGain, CorporateActionAmounts36.mmCapitalGain, CorporateActionAmounts38.mmCapitalGain,
					CorporateActionAmounts39.mmCapitalGain, CorporateActionAmounts41.mmCapitalGain, CorporateActionAmounts40.mmCapitalGain, CorporateActionAmounts42.mmCapitalGain, CorporateActionAmounts43.mmCapitalGain,
					CorporateActionAmounts44.mmCapitalGain, CorporateActionAmounts45.mmCapitalGain, CorporateActionAmounts46.mmCapitalGain, CorporateActionAmounts47.mmCapitalGain);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionCashEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalGain";
			definition = "Amount of money distributed as the result of a capital gain.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionCashEntitlement.class.getMethod("getCapitalGain", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount entitledCashAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmEntitledAmount
	 * CorporateActionAmounts3.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmEntitledAmount
	 * CorporateActionAmounts6.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmEntitledAmount
	 * CorporateActionAmounts9.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmEntitledAmount
	 * CorporateActionAmounts13.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmEntitledAmount
	 * CorporateActionAmounts16.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmEntitledAmount
	 * CorporateActionAmounts19.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmEntitledAmount
	 * CorporateActionAmounts22.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmEntitledAmount
	 * CorporateActionAmounts25.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmEntitledAmount
	 * CorporateActionAmounts4.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmEntitledAmount
	 * CorporateActionAmounts7.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmEntitledAmount
	 * CorporateActionAmounts10.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmEntitledAmount
	 * CorporateActionAmounts14.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmEntitledAmount
	 * CorporateActionAmounts15.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmEntitledAmount
	 * CorporateActionAmounts18.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmEntitledAmount
	 * CorporateActionAmounts21.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmEntitledAmount
	 * CorporateActionAmounts26.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmEntitledAmount
	 * CorporateActionAmounts1.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashEntitlement1#mmCashAmount
	 * CashEntitlement1.mmCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmEntitledAmount
	 * CorporateActionAmounts27.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmEntitledAmount
	 * CorporateActionAmounts28.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmEntitledAmount
	 * CorporateActionAmounts33.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmEntitledAmount
	 * CorporateActionAmounts32.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmEntitledAmount
	 * CorporateActionAmounts36.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmEntitledAmount
	 * CorporateActionAmounts38.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmEntitledAmount
	 * CorporateActionAmounts41.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmEntitledAmount
	 * CorporateActionAmounts40.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmEntitledAmount
	 * CorporateActionAmounts42.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmEntitledAmount
	 * CorporateActionAmounts43.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmEntitledAmount
	 * CorporateActionAmounts46.mmEntitledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmEntitledAmount
	 * CorporateActionAmounts47.mmEntitledAmount}</li>
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
	public static final MMBusinessAttribute mmEntitledCashAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts3.mmEntitledAmount, CorporateActionAmounts6.mmEntitledAmount, CorporateActionAmounts9.mmEntitledAmount, CorporateActionAmounts13.mmEntitledAmount,
					CorporateActionAmounts16.mmEntitledAmount, CorporateActionAmounts19.mmEntitledAmount, CorporateActionAmounts22.mmEntitledAmount, CorporateActionAmounts25.mmEntitledAmount, CorporateActionAmounts4.mmEntitledAmount,
					CorporateActionAmounts7.mmEntitledAmount, CorporateActionAmounts10.mmEntitledAmount, CorporateActionAmounts14.mmEntitledAmount, CorporateActionAmounts15.mmEntitledAmount, CorporateActionAmounts18.mmEntitledAmount,
					CorporateActionAmounts21.mmEntitledAmount, CorporateActionAmounts26.mmEntitledAmount, CorporateActionAmounts1.mmEntitledAmount, CashEntitlement1.mmCashAmount, CorporateActionAmounts27.mmEntitledAmount,
					CorporateActionAmounts28.mmEntitledAmount, CorporateActionAmounts33.mmEntitledAmount, CorporateActionAmounts32.mmEntitledAmount, CorporateActionAmounts36.mmEntitledAmount, CorporateActionAmounts38.mmEntitledAmount,
					CorporateActionAmounts41.mmEntitledAmount, CorporateActionAmounts40.mmEntitledAmount, CorporateActionAmounts42.mmEntitledAmount, CorporateActionAmounts43.mmEntitledAmount, CorporateActionAmounts46.mmEntitledAmount,
					CorporateActionAmounts47.mmEntitledAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionCashEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EntitledCashAmount";
			definition = "Cash amount based on terms of corporate action event and balance of underlying securities, entitled to/from account owner (which may be positive or negative).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionCashEntitlement.class.getMethod("getEntitledCashAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> exchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCorporateActionCashEntitlement
	 * CurrencyExchange.mmCurrencyExchangeForCorporateActionCashEntitlement}</li>
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
	public static final MMBusinessAssociationEnd mmExchangeRate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionCashEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Specifies the exchange rate used to convert the cash entitlement value in another currency.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCorporateActionCashEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionCashEntitlement";
				definition = "Rights for cash entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCorporateActionCashEntitlement);
				derivationElement_lazy = () -> Arrays.asList(Entitlement1.mmCashDistributionDetails);
				superType_lazy = () -> CorporateActionEntitlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionCashEntitlement.mmGrossCashAmount, com.tools20022.repository.entity.CorporateActionCashEntitlement.mmNetCashAmount,
						com.tools20022.repository.entity.CorporateActionCashEntitlement.mmCashInLieuOfShare, com.tools20022.repository.entity.CorporateActionCashEntitlement.mmCapitalGain,
						com.tools20022.repository.entity.CorporateActionCashEntitlement.mmEntitledCashAmount, com.tools20022.repository.entity.CorporateActionCashEntitlement.mmExchangeRate);
				derivationComponent_lazy = () -> Arrays.asList(CashEntitlement1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionCashEntitlement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getGrossCashAmount() {
		return grossCashAmount;
	}

	public CorporateActionCashEntitlement setGrossCashAmount(CurrencyAndAmount grossCashAmount) {
		this.grossCashAmount = Objects.requireNonNull(grossCashAmount);
		return this;
	}

	public CurrencyAndAmount getNetCashAmount() {
		return netCashAmount;
	}

	public CorporateActionCashEntitlement setNetCashAmount(CurrencyAndAmount netCashAmount) {
		this.netCashAmount = Objects.requireNonNull(netCashAmount);
		return this;
	}

	public CurrencyAndAmount getCashInLieuOfShare() {
		return cashInLieuOfShare;
	}

	public CorporateActionCashEntitlement setCashInLieuOfShare(CurrencyAndAmount cashInLieuOfShare) {
		this.cashInLieuOfShare = Objects.requireNonNull(cashInLieuOfShare);
		return this;
	}

	public CurrencyAndAmount getCapitalGain() {
		return capitalGain;
	}

	public CorporateActionCashEntitlement setCapitalGain(CurrencyAndAmount capitalGain) {
		this.capitalGain = Objects.requireNonNull(capitalGain);
		return this;
	}

	public CurrencyAndAmount getEntitledCashAmount() {
		return entitledCashAmount;
	}

	public CorporateActionCashEntitlement setEntitledCashAmount(CurrencyAndAmount entitledCashAmount) {
		this.entitledCashAmount = Objects.requireNonNull(entitledCashAmount);
		return this;
	}

	public List<CurrencyExchange> getExchangeRate() {
		return exchangeRate == null ? exchangeRate = new ArrayList<>() : exchangeRate;
	}

	public CorporateActionCashEntitlement setExchangeRate(List<com.tools20022.repository.entity.CurrencyExchange> exchangeRate) {
		this.exchangeRate = Objects.requireNonNull(exchangeRate);
		return this;
	}
}