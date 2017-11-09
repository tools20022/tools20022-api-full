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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.LineItemMonetarySummation1;
import com.tools20022.repository.msg.SettlementAllowanceCharge1;
import com.tools20022.repository.msg.SettlementMonetarySummation1;
import com.tools20022.repository.msg.TradeSettlement1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money deducted from a price or an amount due.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Allowance" src="doc-files/Allowance.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementAllowanceCharge1
 * SettlementAllowanceCharge1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmAllowanceCharge
 * TradeSettlement1.mmAllowanceCharge}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Adjustment
 * Adjustment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Allowance#mmTotalAllowance
 * Allowance.mmTotalAllowance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allowance#mmNetPriceAllowance
 * Allowance.mmNetPriceAllowance}</li>
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
 * "Allowance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amount of money deducted from a price or an amount due."</li>
 * </ul>
 */
public class Allowance extends Adjustment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount totalAllowance;
	/**
	 * Algebraical sum of allowances related to the invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Allowance
	 * Allowance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmAllowanceTotalAmount
	 * SettlementMonetarySummation1.mmAllowanceTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1#mmAllowanceTotalAmount
	 * LineItemMonetarySummation1.mmAllowanceTotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAllowance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Algebraical sum of allowances related to the invoice."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalAllowance = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementMonetarySummation1.mmAllowanceTotalAmount, LineItemMonetarySummation1.mmAllowanceTotalAmount);
			elementContext_lazy = () -> Allowance.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalAllowance";
			definition = "Algebraical sum of allowances related to the invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount netPriceAllowance;
	/**
	 * Allowance applied to the net price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Allowance
	 * Allowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPriceAllowance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allowance applied to the net price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNetPriceAllowance = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Allowance.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetPriceAllowance";
			definition = "Allowance applied to the net price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Allowance";
				definition = "Amount of money deducted from a price or an amount due.";
				derivationElement_lazy = () -> Arrays.asList(TradeSettlement1.mmAllowanceCharge);
				superType_lazy = () -> Adjustment.mmObject();
				element_lazy = () -> Arrays.asList(Allowance.mmTotalAllowance, Allowance.mmNetPriceAllowance);
				derivationComponent_lazy = () -> Arrays.asList(SettlementAllowanceCharge1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getTotalAllowance() {
		return totalAllowance;
	}

	public void setTotalAllowance(CurrencyAndAmount totalAllowance) {
		this.totalAllowance = totalAllowance;
	}

	public CurrencyAndAmount getNetPriceAllowance() {
		return netPriceAllowance;
	}

	public void setNetPriceAllowance(CurrencyAndAmount netPriceAllowance) {
		this.netPriceAllowance = netPriceAllowance;
	}
}