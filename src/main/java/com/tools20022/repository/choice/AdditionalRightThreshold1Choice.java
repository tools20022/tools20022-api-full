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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.AdditionalRight;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of additional right threshold.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdditionalRightThreshold1Choice#mmAdditionalRightThreshold
 * AdditionalRightThreshold1Choice.mmAdditionalRightThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdditionalRightThreshold1Choice#mmAdditionalRightThresholdPercentage
 * AdditionalRightThreshold1Choice.mmAdditionalRightThresholdPercentage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AdditionalRight
 * AdditionalRight}</li>
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
 * "AdditionalRightThreshold1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of additional right threshold."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AdditionalRightThreshold1Choice", propOrder = {"additionalRightThreshold", "additionalRightThresholdPercentage"})
public class AdditionalRightThreshold1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text additionalRightThreshold;
	/**
	 * Additional right granted to specify the minimum stake in share capital or
	 * cash value or number of security holders required to table resolutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AdditionalRight#mmAdditionalRightThreshold
	 * AdditionalRight.mmAdditionalRightThreshold}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AdditionalRightThreshold1Choice
	 * AdditionalRightThreshold1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRghtThrshld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRightThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional right granted to specify the minimum stake in share capital or cash value or number of security holders required to table resolutions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalRightThreshold = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AdditionalRight.mmAdditionalRightThreshold;
			componentContext_lazy = () -> AdditionalRightThreshold1Choice.mmObject();
			isDerived = false;
			xmlTag = "AddtlRghtThrshld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRightThreshold";
			definition = "Additional right granted to specify the minimum stake in share capital or cash value or number of security holders required to table resolutions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PercentageRate additionalRightThresholdPercentage;
	/**
	 * Additional right granted to specify the minimum stake in share capital or
	 * cash value or number of security holders required to table resolutions.
	 * This minimum is expressed as a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AdditionalRight#mmAdditionalRightThresholdPercentage
	 * AdditionalRight.mmAdditionalRightThresholdPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AdditionalRightThreshold1Choice
	 * AdditionalRightThreshold1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRghtThrshldPctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRightThresholdPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional right granted to specify the minimum stake in share capital or cash value or number of security holders required to table resolutions. This minimum is expressed as a percentage."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalRightThresholdPercentage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AdditionalRight.mmAdditionalRightThresholdPercentage;
			componentContext_lazy = () -> AdditionalRightThreshold1Choice.mmObject();
			isDerived = false;
			xmlTag = "AddtlRghtThrshldPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRightThresholdPercentage";
			definition = "Additional right granted to specify the minimum stake in share capital or cash value or number of security holders required to table resolutions. This minimum is expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AdditionalRightThreshold1Choice.mmAdditionalRightThreshold, AdditionalRightThreshold1Choice.mmAdditionalRightThresholdPercentage);
				trace_lazy = () -> AdditionalRight.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalRightThreshold1Choice";
				definition = "Choice of additional right threshold.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AddtlRghtThrshld", required = true)
	public Max35Text getAdditionalRightThreshold() {
		return additionalRightThreshold;
	}

	public void setAdditionalRightThreshold(Max35Text additionalRightThreshold) {
		this.additionalRightThreshold = additionalRightThreshold;
	}

	@XmlElement(name = "AddtlRghtThrshldPctg", required = true)
	public PercentageRate getAdditionalRightThresholdPercentage() {
		return additionalRightThresholdPercentage;
	}

	public void setAdditionalRightThresholdPercentage(PercentageRate additionalRightThresholdPercentage) {
		this.additionalRightThresholdPercentage = additionalRightThresholdPercentage;
	}
}