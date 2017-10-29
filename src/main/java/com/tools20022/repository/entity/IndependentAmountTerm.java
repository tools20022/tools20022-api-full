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
import com.tools20022.repository.codeset.IndependentAmountConventionTypeCode;
import com.tools20022.repository.entity.ExposureTerm;
import com.tools20022.repository.msg.SegregatedIndependentAmountMargin1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the specific terms used to calculate an independent amount.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="IndependentAmountTerm"
 * src="doc-files/IndependentAmountTerm.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IndependentAmountTerm#Convention
 * IndependentAmountTerm.Convention}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Margin1#SegregatedIndependentAmountMargin
 * Margin1.SegregatedIndependentAmountMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginTerms1Choice#SegregatedIndependentAmountMargin
 * MarginTerms1Choice.SegregatedIndependentAmountMargin}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ExposureTerm
 * ExposureTerm}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1
 * SegregatedIndependentAmountMargin1}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IndependentAmountTerm"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the specific terms used to calculate an independent amount."</li>
 * </ul>
 */
public class IndependentAmountTerm extends ExposureTerm {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Determines how the independent amount was applied in the calculation. <br>
	 * It is either: <br>
	 * - Before threshold, effectively acting as an add on to exposure, <br>
	 * - After threshold where the amount is an add on to the credit support
	 * amount and forms part of the variation margin requirement, <br>
	 * - Segregated where it is treated independently of variation margin for
	 * segregation purposes.Defines the specific terms used to calculate an
	 * independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IndependentAmountConventionTypeCode
	 * IndependentAmountConventionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndependentAmount1#Convention
	 * IndependentAmount1.Convention}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndependentAmount2#Convention
	 * IndependentAmount2.Convention}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IndependentAmountTerm
	 * IndependentAmountTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Convention"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Determines how the independent amount was applied in the calculation. \r\r\nIt is either:\r\r\n- Before threshold, effectively acting as an add on to exposure, \r\r\n- After threshold where the amount is an add on to the credit support amount and forms part of the variation margin requirement,\r\r\n- Segregated where it is treated independently of variation margin for segregation purposes.Defines the specific terms used to calculate an independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Convention = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndependentAmount1.Convention, com.tools20022.repository.msg.IndependentAmount2.Convention);
			elementContext_lazy = () -> IndependentAmountTerm.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Convention";
			definition = "Determines how the independent amount was applied in the calculation. \r\r\nIt is either:\r\r\n- Before threshold, effectively acting as an add on to exposure, \r\r\n- After threshold where the amount is an add on to the credit support amount and forms part of the variation margin requirement,\r\r\n- Segregated where it is treated independently of variation margin for segregation purposes.Defines the specific terms used to calculate an independent amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> IndependentAmountConventionTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IndependentAmountTerm";
				definition = "Defines the specific terms used to calculate an independent amount.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Margin1.SegregatedIndependentAmountMargin, com.tools20022.repository.choice.MarginTerms1Choice.SegregatedIndependentAmountMargin);
				superType_lazy = () -> ExposureTerm.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IndependentAmountTerm.Convention);
				derivationComponent_lazy = () -> Arrays.asList(SegregatedIndependentAmountMargin1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}