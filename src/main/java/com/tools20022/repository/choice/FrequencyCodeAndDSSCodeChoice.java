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
import com.tools20022.repository.codeset.Frequency1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice between formats for the frequency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FrequencyCodeAndDSSCodeChoice#mmFrequencyAsCode
 * FrequencyCodeAndDSSCodeChoice.mmFrequencyAsCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FrequencyCodeAndDSSCodeChoice#mmFrequencyAsDSS
 * FrequencyCodeAndDSSCodeChoice.mmFrequencyAsDSS}</li>
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
 * "FrequencyCodeAndDSSCodeChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between formats for the frequency."</li>
 * </ul>
 */
public class FrequencyCodeAndDSSCodeChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Frequency1Code frequencyAsCode;
	/**
	 * Frequency expressed as a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency1Code
	 * Frequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FrequencyCodeAndDSSCodeChoice
	 * FrequencyCodeAndDSSCodeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrqcyAsCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrequencyAsCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency expressed as a code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequencyAsCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrequencyCodeAndDSSCodeChoice.mmObject();
			isDerived = false;
			xmlTag = "FrqcyAsCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrequencyAsCode";
			definition = "Frequency expressed as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Frequency1Code.mmObject();
		}
	};
	protected GenericIdentification7 frequencyAsDSS;
	/**
	 * Frequency expressed as a data source scheme and a code used within the
	 * data source scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification7
	 * GenericIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FrequencyCodeAndDSSCodeChoice
	 * FrequencyCodeAndDSSCodeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrqcyAsDSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrequencyAsDSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency expressed as a data source scheme and a code used within the data source scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequencyAsDSS = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrequencyCodeAndDSSCodeChoice.mmObject();
			isDerived = false;
			xmlTag = "FrqcyAsDSS";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrequencyAsDSS";
			definition = "Frequency expressed as a data source scheme and a code used within the data source scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification7.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FrequencyCodeAndDSSCodeChoice.mmFrequencyAsCode, FrequencyCodeAndDSSCodeChoice.mmFrequencyAsDSS);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FrequencyCodeAndDSSCodeChoice";
				definition = "Choice between formats for the frequency.";
			}
		});
		return mmObject_lazy.get();
	}

	public Frequency1Code getFrequencyAsCode() {
		return frequencyAsCode;
	}

	public void setFrequencyAsCode(Frequency1Code frequencyAsCode) {
		this.frequencyAsCode = frequencyAsCode;
	}

	public GenericIdentification7 getFrequencyAsDSS() {
		return frequencyAsDSS;
	}

	public void setFrequencyAsDSS(GenericIdentification7 frequencyAsDSS) {
		this.frequencyAsDSS = frequencyAsDSS;
	}
}