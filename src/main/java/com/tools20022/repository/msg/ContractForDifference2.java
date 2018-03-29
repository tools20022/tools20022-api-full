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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Transparency calculation specific details on a contract for difference,
 * spread betting derivatives.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractForDifference2#mmUnderlyingType
 * ContractForDifference2.mmUnderlyingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractForDifference2#mmNotionalCurrency1
 * ContractForDifference2.mmNotionalCurrency1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractForDifference2#mmNotionalCurrency2
 * ContractForDifference2.mmNotionalCurrency2}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
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
 * "ContractForDifference2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transparency calculation specific details on a contract for difference, spread betting derivatives."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContractForDifference2", propOrder = {"underlyingType", "notionalCurrency1", "notionalCurrency2"})
public class ContractForDifference2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UndrlygTp", required = true)
	protected UnderlyingContractForDifferenceType3Code underlyingType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code
	 * UnderlyingContractForDifferenceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
	 * Derivative.mmUnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractForDifference2
	 * ContractForDifference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying type of the contract for difference."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContractForDifference2, UnderlyingContractForDifferenceType3Code> mmUnderlyingType = new MMMessageAttribute<ContractForDifference2, UnderlyingContractForDifferenceType3Code>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractForDifference2.mmObject();
			isDerived = false;
			xmlTag = "UndrlygTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingType";
			definition = "Underlying type of the contract for difference.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingContractForDifferenceType3Code.mmObject();
		}

		@Override
		public UnderlyingContractForDifferenceType3Code getValue(ContractForDifference2 obj) {
			return obj.getUnderlyingType();
		}

		@Override
		public void setValue(ContractForDifference2 obj, UnderlyingContractForDifferenceType3Code value) {
			obj.setUnderlyingType(value);
		}
	};
	@XmlElement(name = "NtnlCcy1")
	protected ActiveOrHistoricCurrencyCode notionalCurrency1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractForDifference2
	 * ContractForDifference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlCcy1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalCurrency1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency 1 of the underlying currency pair."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContractForDifference2, Optional<ActiveOrHistoricCurrencyCode>> mmNotionalCurrency1 = new MMMessageAttribute<ContractForDifference2, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractForDifference2.mmObject();
			isDerived = false;
			xmlTag = "NtnlCcy1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalCurrency1";
			definition = "Currency 1 of the underlying currency pair.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(ContractForDifference2 obj) {
			return obj.getNotionalCurrency1();
		}

		@Override
		public void setValue(ContractForDifference2 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setNotionalCurrency1(value.orElse(null));
		}
	};
	@XmlElement(name = "NtnlCcy2")
	protected ActiveOrHistoricCurrencyCode notionalCurrency2;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractForDifference2
	 * ContractForDifference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlCcy2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalCurrency2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency 2 of the underlying currency pair."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContractForDifference2, Optional<ActiveOrHistoricCurrencyCode>> mmNotionalCurrency2 = new MMMessageAttribute<ContractForDifference2, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractForDifference2.mmObject();
			isDerived = false;
			xmlTag = "NtnlCcy2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalCurrency2";
			definition = "Currency 2 of the underlying currency pair.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(ContractForDifference2 obj) {
			return obj.getNotionalCurrency2();
		}

		@Override
		public void setValue(ContractForDifference2 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setNotionalCurrency2(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractForDifference2.mmUnderlyingType, com.tools20022.repository.msg.ContractForDifference2.mmNotionalCurrency1,
						com.tools20022.repository.msg.ContractForDifference2.mmNotionalCurrency2);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContractForDifference2";
				definition = "Transparency calculation specific details on a contract for difference, spread betting derivatives.";
			}
		});
		return mmObject_lazy.get();
	}

	public UnderlyingContractForDifferenceType3Code getUnderlyingType() {
		return underlyingType;
	}

	public ContractForDifference2 setUnderlyingType(UnderlyingContractForDifferenceType3Code underlyingType) {
		this.underlyingType = Objects.requireNonNull(underlyingType);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getNotionalCurrency1() {
		return notionalCurrency1 == null ? Optional.empty() : Optional.of(notionalCurrency1);
	}

	public ContractForDifference2 setNotionalCurrency1(ActiveOrHistoricCurrencyCode notionalCurrency1) {
		this.notionalCurrency1 = notionalCurrency1;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getNotionalCurrency2() {
		return notionalCurrency2 == null ? Optional.empty() : Optional.of(notionalCurrency2);
	}

	public ContractForDifference2 setNotionalCurrency2(ActiveOrHistoricCurrencyCode notionalCurrency2) {
		this.notionalCurrency2 = notionalCurrency2;
		return this;
	}
}