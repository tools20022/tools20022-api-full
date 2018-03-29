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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PrePaymentSpeedCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PrePaymentSpeed1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Specifies the type and rate of prepayment speed of the fixed income
 * instrument.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PrePaymentSpeed" src="doc-files/PrePaymentSpeed.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PrePaymentSpeed#mmType
 * PrePaymentSpeed.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PrePaymentSpeed#mmRate
 * PrePaymentSpeed.mmRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PrePaymentSpeed1
 * PrePaymentSpeed1}</li>
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
 * "PrePaymentSpeed"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type and rate of prepayment speed of the fixed income instrument."
 * </li>
 * </ul>
 */
public class PrePaymentSpeed {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PrePaymentSpeedCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode
	 * PrePaymentSpeedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PrePaymentSpeed1#mmType
	 * PrePaymentSpeed1.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PrePaymentSpeed
	 * PrePaymentSpeed}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 233 and 234</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of prepayment speed of the fixed income instrument in coded form."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PrePaymentSpeed, PrePaymentSpeedCode> mmType = new MMBusinessAttribute<PrePaymentSpeed, PrePaymentSpeedCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PrePaymentSpeed1.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PrePaymentSpeed.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "233 and 234"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of prepayment speed of the fixed income instrument in coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PrePaymentSpeedCode.mmObject();
		}

		@Override
		public PrePaymentSpeedCode getValue(PrePaymentSpeed obj) {
			return obj.getType();
		}

		@Override
		public void setValue(PrePaymentSpeed obj, PrePaymentSpeedCode value) {
			obj.setType(value);
		}
	};
	protected PercentageRate rate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PrePaymentSpeed1#mmRate
	 * PrePaymentSpeed1.mmRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PrePaymentSpeed
	 * PrePaymentSpeed}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of prepayment speed of the fixed income instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PrePaymentSpeed, PercentageRate> mmRate = new MMBusinessAttribute<PrePaymentSpeed, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(PrePaymentSpeed1.mmRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PrePaymentSpeed.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Rate of prepayment speed of the fixed income instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(PrePaymentSpeed obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(PrePaymentSpeed obj, PercentageRate value) {
			obj.setRate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PrePaymentSpeed";
				definition = "Specifies the type and rate of prepayment speed of the fixed income instrument.";
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PrePaymentSpeed.mmType, com.tools20022.repository.entity.PrePaymentSpeed.mmRate);
				derivationComponent_lazy = () -> Arrays.asList(PrePaymentSpeed1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PrePaymentSpeed.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PrePaymentSpeedCode getType() {
		return type;
	}

	public PrePaymentSpeed setType(PrePaymentSpeedCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public PrePaymentSpeed setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}
}