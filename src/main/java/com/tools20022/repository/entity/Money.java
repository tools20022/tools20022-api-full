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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Currency (banknotes and coins) and demand deposits or 'bank money' (the
 * balance held in checking accounts and savings accounts).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Money" src="doc-files/Money.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Money#CashAmount
 * Money.CashAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProposalType1Choice#CashCollateral
 * ProposalType1Choice.CashCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral4#CashCollateral
 * Collateral4.CashCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#CashCollateral
 * CollateralSubstitution1.CashCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#CashCollateralDetails
 * CollateralValuation1.CashCollateralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#CashCollateral
 * CollateralSubstitution2.CashCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#CashCollateral
 * CollateralValuation2.CashCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral7#CashCollateral
 * Collateral7.CashCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral8#CashCollateral
 * Collateral8.CashCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution3#CashCollateral
 * CollateralSubstitution3.CashCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#CashCollateral
 * CollateralSubstitution5.CashCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution4#CashCollateral
 * CollateralSubstitution4.CashCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#CashCollateral
 * CollateralValuation5.CashCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral11#CashCollateral
 * Collateral11.CashCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral12#CashCollateral
 * Collateral12.CashCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral16#CashCollateral
 * Collateral16.CashCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral17#CashCollateral
 * Collateral17.CashCollateral}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Deposit Deposit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral1
 * CashCollateral1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral3
 * CashCollateral3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral4
 * CashCollateral4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral2
 * CashCollateral2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral5
 * CashCollateral5}</li>
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
 * "Money"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Currency (banknotes and coins) and demand deposits or 'bank money' (the balance held in checking accounts and savings accounts)."
 * </li>
 * </ul>
 */
public class Money extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Value of the asset specified as a currency and an amount.
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
	 * {@linkplain com.tools20022.repository.msg.CashCollateral1#DepositAmount
	 * CashCollateral1.DepositAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#DepositAmount
	 * CashCollateral3.DepositAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4#DepositAmount
	 * CashCollateral4.DepositAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4#BlockedAmount
	 * CashCollateral4.BlockedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#DepositAmount
	 * CashCollateral2.DepositAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#DepositAmount
	 * CashCollateral5.DepositAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Money
	 * Money}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the asset specified as a currency and an amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashCollateral1.DepositAmount, com.tools20022.repository.msg.CashCollateral3.DepositAmount, com.tools20022.repository.msg.CashCollateral4.DepositAmount,
					com.tools20022.repository.msg.CashCollateral4.BlockedAmount, com.tools20022.repository.msg.CashCollateral2.DepositAmount, com.tools20022.repository.msg.CashCollateral5.DepositAmount);
			elementContext_lazy = () -> Money.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAmount";
			definition = "Value of the asset specified as a currency and an amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Money";
				definition = "Currency (banknotes and coins) and demand deposits or 'bank money' (the balance held in checking accounts and savings accounts).";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProposalType1Choice.CashCollateral, com.tools20022.repository.msg.Collateral4.CashCollateral,
						com.tools20022.repository.msg.CollateralSubstitution1.CashCollateral, com.tools20022.repository.msg.CollateralValuation1.CashCollateralDetails, com.tools20022.repository.msg.CollateralSubstitution2.CashCollateral,
						com.tools20022.repository.msg.CollateralValuation2.CashCollateral, com.tools20022.repository.msg.Collateral7.CashCollateral, com.tools20022.repository.msg.Collateral8.CashCollateral,
						com.tools20022.repository.msg.CollateralSubstitution3.CashCollateral, com.tools20022.repository.msg.CollateralSubstitution5.CashCollateral, com.tools20022.repository.msg.CollateralSubstitution4.CashCollateral,
						com.tools20022.repository.msg.CollateralValuation5.CashCollateral, com.tools20022.repository.msg.Collateral11.CashCollateral, com.tools20022.repository.msg.Collateral12.CashCollateral,
						com.tools20022.repository.msg.Collateral16.CashCollateral, com.tools20022.repository.msg.Collateral17.CashCollateral);
				subType_lazy = () -> Arrays.asList(Deposit.mmObject());
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Money.CashAmount);
				derivationComponent_lazy = () -> Arrays.asList(CashCollateral1.mmObject(), CashCollateral3.mmObject(), CashCollateral4.mmObject(), CashCollateral2.mmObject(), CashCollateral5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}