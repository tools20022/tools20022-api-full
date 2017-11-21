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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumberFraction5;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Detail the number and the volume, defined by currency amount, for use in a
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NumberAndVolume2#mmNumber
 * NumberAndVolume2.mmNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NumberAndVolume2#mmVolume
 * NumberAndVolume2.mmVolume}</li>
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
 * "NumberAndVolume2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Detail the number and the volume, defined by currency amount, for use in a transaction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NumberAndVolume2", propOrder = {"number", "volume"})
public class NumberAndVolume2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DecimalNumberFraction5 number;
	/**
	 * Total number of specific transaction types executed on the reporting day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumberFraction5
	 * DecimalNumberFraction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndVolume2
	 * NumberAndVolume2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of specific transaction types executed on the reporting day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberAndVolume2.mmObject();
			isDerived = false;
			xmlTag = "Nb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Number";
			definition = "Total number of specific transaction types executed on the reporting day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumberFraction5.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount volume;
	/**
	 * Total volume of specific transactions executed on the reporting day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndVolume2
	 * NumberAndVolume2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Volume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total volume of specific transactions executed on the reporting day."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVolume = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberAndVolume2.mmObject();
			isDerived = false;
			xmlTag = "Vol";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Volume";
			definition = "Total volume of specific transactions executed on the reporting day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NumberAndVolume2.mmNumber, NumberAndVolume2.mmVolume);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NumberAndVolume2";
				definition = "Detail the number and the volume, defined by currency amount, for use in a transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Nb", required = true)
	public DecimalNumberFraction5 getNumber() {
		return number;
	}

	public void setNumber(DecimalNumberFraction5 number) {
		this.number = number;
	}

	@XmlElement(name = "Vol", required = true)
	public ActiveOrHistoricCurrencyAndAmount getVolume() {
		return volume;
	}

	public void setVolume(ActiveOrHistoricCurrencyAndAmount volume) {
		this.volume = volume;
	}
}