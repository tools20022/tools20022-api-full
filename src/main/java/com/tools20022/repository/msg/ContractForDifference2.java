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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ContractForDifference2", propOrder = {"underlyingType", "notionalCurrency1", "notionalCurrency2"})
public class ContractForDifference2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected UnderlyingContractForDifferenceType3Code underlyingType;
	/**
	 * Underlying type of the contract for difference.
	 * <p>
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
	public static final MMMessageAttribute mmUnderlyingType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> ContractForDifference2.mmObject();
			isDerived = false;
			xmlTag = "UndrlygTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingType";
			definition = "Underlying type of the contract for difference.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingContractForDifferenceType3Code.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode notionalCurrency1;
	/**
	 * Currency 1 of the underlying currency pair.
	 * <p>
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
	public static final MMMessageAttribute mmNotionalCurrency1 = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContractForDifference2.mmObject();
			isDerived = false;
			xmlTag = "NtnlCcy1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalCurrency1";
			definition = "Currency 1 of the underlying currency pair.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode notionalCurrency2;
	/**
	 * Currency 2 of the underlying currency pair.
	 * <p>
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
	public static final MMMessageAttribute mmNotionalCurrency2 = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContractForDifference2.mmObject();
			isDerived = false;
			xmlTag = "NtnlCcy2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalCurrency2";
			definition = "Currency 2 of the underlying currency pair.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ContractForDifference2.mmUnderlyingType, ContractForDifference2.mmNotionalCurrency1, ContractForDifference2.mmNotionalCurrency2);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContractForDifference2";
				definition = "Transparency calculation specific details on a contract for difference, spread betting derivatives.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "UndrlygTp", required = true)
	public UnderlyingContractForDifferenceType3Code getUnderlyingType() {
		return underlyingType;
	}

	public void setUnderlyingType(UnderlyingContractForDifferenceType3Code underlyingType) {
		this.underlyingType = underlyingType;
	}

	@XmlElement(name = "NtnlCcy1")
	public ActiveOrHistoricCurrencyCode getNotionalCurrency1() {
		return notionalCurrency1;
	}

	public void setNotionalCurrency1(ActiveOrHistoricCurrencyCode notionalCurrency1) {
		this.notionalCurrency1 = notionalCurrency1;
	}

	@XmlElement(name = "NtnlCcy2")
	public ActiveOrHistoricCurrencyCode getNotionalCurrency2() {
		return notionalCurrency2;
	}

	public void setNotionalCurrency2(ActiveOrHistoricCurrencyCode notionalCurrency2) {
		this.notionalCurrency2 = notionalCurrency2;
	}
}