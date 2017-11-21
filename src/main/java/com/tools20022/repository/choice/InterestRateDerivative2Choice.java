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
import com.tools20022.repository.codeset.SwapType1Code;
import com.tools20022.repository.codeset.UnderlyingInterestRateType3Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice element specifying the underlying types of an interest rate
 * derivative.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateDerivative2Choice#mmSwapRelated
 * InterestRateDerivative2Choice.mmSwapRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateDerivative2Choice#mmOther
 * InterestRateDerivative2Choice.mmOther}</li>
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
 * "InterestRateDerivative2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice element specifying the underlying types of an interest rate derivative. "
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InterestRateDerivative2Choice", propOrder = {"swapRelated", "other"})
public class InterestRateDerivative2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected SwapType1Code swapRelated;
	/**
	 * Underlying interest rate type is a swap, swaption, a future on a swap or
	 * a forward on a swap with regard to the underlying swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SwapType1Code
	 * SwapType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateDerivative2Choice
	 * InterestRateDerivative2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwpRltd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwapRelated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying interest rate type is a swap, swaption, a future on a swap or a forward on a swap with regard to the underlying swap."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSwapRelated = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InterestRateDerivative2Choice.mmObject();
			isDerived = false;
			xmlTag = "SwpRltd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwapRelated";
			definition = "Underlying interest rate type is a swap, swaption, a future on a swap or a forward on a swap with regard to the underlying swap.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SwapType1Code.mmObject();
		}
	};
	protected UnderlyingInterestRateType3Code other;
	/**
	 * Where contract type is different from swaps, swaptions, futures on swaps
	 * and forwards on a swap, this field is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingInterestRateType3Code
	 * UnderlyingInterestRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateDerivative2Choice
	 * InterestRateDerivative2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Where contract type is different from swaps, swaptions, futures on swaps and forwards on a swap, this field is used."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOther = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InterestRateDerivative2Choice.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Where contract type is different from swaps, swaptions, futures on swaps and forwards on a swap, this field is used.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingInterestRateType3Code.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InterestRateDerivative2Choice.mmSwapRelated, InterestRateDerivative2Choice.mmOther);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestRateDerivative2Choice";
				definition = "Choice element specifying the underlying types of an interest rate derivative. ";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SwpRltd", required = true)
	public SwapType1Code getSwapRelated() {
		return swapRelated;
	}

	public void setSwapRelated(SwapType1Code swapRelated) {
		this.swapRelated = swapRelated;
	}

	@XmlElement(name = "Othr", required = true)
	public UnderlyingInterestRateType3Code getOther() {
		return other;
	}

	public void setOther(UnderlyingInterestRateType3Code other) {
		this.other = other;
	}
}