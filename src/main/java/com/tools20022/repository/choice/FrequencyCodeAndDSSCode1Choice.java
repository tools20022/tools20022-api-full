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
import com.tools20022.repository.codeset.EventFrequency1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.choice.FrequencyCodeAndDSSCode1Choice#mmFrequencyAsCode
 * FrequencyCodeAndDSSCode1Choice.mmFrequencyAsCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FrequencyCodeAndDSSCode1Choice#mmFrequencyAsDSS
 * FrequencyCodeAndDSSCode1Choice.mmFrequencyAsDSS}</li>
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
 * "FrequencyCodeAndDSSCode1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between formats for the frequency."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FrequencyCodeAndDSSCode1Choice", propOrder = {"frequencyAsCode", "frequencyAsDSS"})
public class FrequencyCodeAndDSSCode1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FrqcyAsCd", required = true)
	protected EventFrequency1Code frequencyAsCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FrequencyCodeAndDSSCode1Choice
	 * FrequencyCodeAndDSSCode1Choice}</li>
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
	public static final MMMessageAttribute<FrequencyCodeAndDSSCode1Choice, EventFrequency1Code> mmFrequencyAsCode = new MMMessageAttribute<FrequencyCodeAndDSSCode1Choice, EventFrequency1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.FrequencyCodeAndDSSCode1Choice.mmObject();
			isDerived = false;
			xmlTag = "FrqcyAsCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrequencyAsCode";
			definition = "Frequency expressed as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequency1Code.mmObject();
		}

		@Override
		public EventFrequency1Code getValue(FrequencyCodeAndDSSCode1Choice obj) {
			return obj.getFrequencyAsCode();
		}

		@Override
		public void setValue(FrequencyCodeAndDSSCode1Choice obj, EventFrequency1Code value) {
			obj.setFrequencyAsCode(value);
		}
	};
	@XmlElement(name = "FrqcyAsDSS", required = true)
	protected GenericIdentification7 frequencyAsDSS;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.FrequencyCodeAndDSSCode1Choice
	 * FrequencyCodeAndDSSCode1Choice}</li>
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
	public static final MMMessageAttribute<FrequencyCodeAndDSSCode1Choice, GenericIdentification7> mmFrequencyAsDSS = new MMMessageAttribute<FrequencyCodeAndDSSCode1Choice, GenericIdentification7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.FrequencyCodeAndDSSCode1Choice.mmObject();
			isDerived = false;
			xmlTag = "FrqcyAsDSS";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrequencyAsDSS";
			definition = "Frequency expressed as a data source scheme and a code used within the data source scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification7.mmObject();
		}

		@Override
		public GenericIdentification7 getValue(FrequencyCodeAndDSSCode1Choice obj) {
			return obj.getFrequencyAsDSS();
		}

		@Override
		public void setValue(FrequencyCodeAndDSSCode1Choice obj, GenericIdentification7 value) {
			obj.setFrequencyAsDSS(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FrequencyCodeAndDSSCode1Choice.mmFrequencyAsCode, com.tools20022.repository.choice.FrequencyCodeAndDSSCode1Choice.mmFrequencyAsDSS);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FrequencyCodeAndDSSCode1Choice";
				definition = "Choice between formats for the frequency.";
			}
		});
		return mmObject_lazy.get();
	}

	public EventFrequency1Code getFrequencyAsCode() {
		return frequencyAsCode;
	}

	public FrequencyCodeAndDSSCode1Choice setFrequencyAsCode(EventFrequency1Code frequencyAsCode) {
		this.frequencyAsCode = Objects.requireNonNull(frequencyAsCode);
		return this;
	}

	public GenericIdentification7 getFrequencyAsDSS() {
		return frequencyAsDSS;
	}

	public FrequencyCodeAndDSSCode1Choice setFrequencyAsDSS(GenericIdentification7 frequencyAsDSS) {
		this.frequencyAsDSS = Objects.requireNonNull(frequencyAsDSS);
		return this;
	}
}