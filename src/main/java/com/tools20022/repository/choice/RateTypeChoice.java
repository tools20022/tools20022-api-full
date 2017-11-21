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
import com.tools20022.repository.entity.InterestCalculation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Rate is expressed as a percentage or a text.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateTypeChoice#mmPercentageRate
 * RateTypeChoice.mmPercentageRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateTypeChoice#mmTextualRate
 * RateTypeChoice.mmTextualRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InterestCalculation
 * InterestCalculation}</li>
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
 * "RateTypeChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Rate is expressed as a percentage or a text."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RateTypeChoice", propOrder = {"percentageRate", "textualRate"})
public class RateTypeChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate percentageRate;
	/**
	 * Percentage charged for the use of an amount of money, usually expressed
	 * at an annual rate. The interest rate is the ratio of the amount of
	 * interest paid during a certain period of time compared to the principal
	 * amount of the interest bearing financial instrument.
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
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRate
	 * InterestCalculation.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RateTypeChoice
	 * RateTypeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPercentageRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> RateTypeChoice.mmObject();
			isDerived = false;
			xmlTag = "PctgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageRate";
			definition = "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected Max35Text textualRate;
	/**
	 * Rate is expressed as a text.
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
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateType
	 * InterestCalculation.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RateTypeChoice
	 * RateTypeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxtlRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TextualRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate is expressed as a text."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTextualRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRateType;
			componentContext_lazy = () -> RateTypeChoice.mmObject();
			isDerived = false;
			xmlTag = "TxtlRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TextualRate";
			definition = "Rate is expressed as a text.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RateTypeChoice.mmPercentageRate, RateTypeChoice.mmTextualRate);
				trace_lazy = () -> InterestCalculation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RateTypeChoice";
				definition = "Rate is expressed as a percentage or a text.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PctgRate", required = true)
	public PercentageRate getPercentageRate() {
		return percentageRate;
	}

	public void setPercentageRate(PercentageRate percentageRate) {
		this.percentageRate = percentageRate;
	}

	@XmlElement(name = "TxtlRate", required = true)
	public Max35Text getTextualRate() {
		return textualRate;
	}

	public void setTextualRate(Max35Text textualRate) {
		this.textualRate = textualRate;
	}
}