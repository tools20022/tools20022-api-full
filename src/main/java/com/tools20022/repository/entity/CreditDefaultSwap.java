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
import com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISOYearMonth;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Swaps;
import com.tools20022.repository.msg.CreditDefaultSwapDerivative4;
import com.tools20022.repository.msg.CreditDefaultSwapIndex2;
import com.tools20022.repository.msg.CreditDefaultSwapSingleName2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Credit default swap is a particular type of swap designed to transfer the
 * credit exposure of fixed income products between two or more parties.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CreditDefaultSwap" src="doc-files/CreditDefaultSwap.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CreditDefaultSwap#RollDate
 * CreditDefaultSwap.RollDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CreditDefaultSwap#RollMonth
 * CreditDefaultSwap.RollMonth}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CreditDefaultSwap#Series
 * CreditDefaultSwap.Series}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4#SingleName
 * CreditDefaultSwapDerivative4.SingleName}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Derivative2Choice#Credit
 * Derivative2Choice.Credit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice#SingleNameCreditDefaultSwap
 * CreditDefaultSwapsDerivative3Choice.SingleNameCreditDefaultSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice#CreditDefaultSwapIndex
 * CreditDefaultSwapsDerivative3Choice.CreditDefaultSwapIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice#SingleNameCreditDefaultSwapDerivative
 * CreditDefaultSwapsDerivative3Choice.SingleNameCreditDefaultSwapDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice#CreditDefaultSwapIndexDerivative
 * CreditDefaultSwapsDerivative3Choice.CreditDefaultSwapIndexDerivative}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Swaps Swaps}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2
 * CreditDefaultSwapSingleName2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2
 * CreditDefaultSwapIndex2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4
 * CreditDefaultSwapDerivative4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice
 * CreditDefaultSwapsDerivative3Choice}</li>
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
 * "CreditDefaultSwap"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Credit default swap is a particular type of swap designed to transfer the credit exposure of fixed income products between two or more parties. "
 * </li>
 * </ul>
 */
public class CreditDefaultSwap extends Swaps {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Roll date of the underlying asset as established by the asset issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2#NextRollDate
	 * CreditDefaultSwapIndex2.NextRollDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
	 * CreditDefaultSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RollDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Roll date of the underlying asset as established by the asset issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RollDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditDefaultSwapIndex2.NextRollDate);
			elementContext_lazy = () -> CreditDefaultSwap.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RollDate";
			definition = "Roll date of the underlying asset as established by the asset issuer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Roll month of the underlying asset as established by the asset issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
	 * CreditDefaultSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RollMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Roll month of the underlying asset as established by the asset issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RollMonth = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CreditDefaultSwap.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RollMonth";
			definition = "Roll month of the underlying asset as established by the asset issuer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	/**
	 * Series number of the composition of the derivative if applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2#Series
	 * CreditDefaultSwapIndex2.Series}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
	 * CreditDefaultSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Series"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Series number of the composition of the derivative if applicable."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Series = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditDefaultSwapIndex2.Series);
			elementContext_lazy = () -> CreditDefaultSwap.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Series";
			definition = "Series number of the composition of the derivative if applicable.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CreditDefaultSwap";
				definition = "Credit default swap is a particular type of swap designed to transfer the credit exposure of fixed income products between two or more parties. ";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditDefaultSwapDerivative4.SingleName, com.tools20022.repository.choice.Derivative2Choice.Credit,
						com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice.SingleNameCreditDefaultSwap, com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice.CreditDefaultSwapIndex,
						com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice.SingleNameCreditDefaultSwapDerivative, com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice.CreditDefaultSwapIndexDerivative);
				superType_lazy = () -> Swaps.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CreditDefaultSwap.RollDate, com.tools20022.repository.entity.CreditDefaultSwap.RollMonth, com.tools20022.repository.entity.CreditDefaultSwap.Series);
				derivationComponent_lazy = () -> Arrays.asList(CreditDefaultSwapSingleName2.mmObject(), CreditDefaultSwapIndex2.mmObject(), CreditDefaultSwapDerivative4.mmObject(), CreditDefaultSwapsDerivative3Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}