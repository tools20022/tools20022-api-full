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
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.TimeFrame;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * TimeFrame elements that define a period as number of days after an activity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TimeFrame4Choice#mmTradePlus
 * TimeFrame4Choice.mmTradePlus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TimeFrame4Choice#mmRenunciationPlus
 * TimeFrame4Choice.mmRenunciationPlus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TimeFrame TimeFrame}</li>
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
 * "TimeFrame4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "TimeFrame elements that define a period as number of days after an activity."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TimeFrame4Choice", propOrder = {"tradePlus", "renunciationPlus"})
public class TimeFrame4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Number tradePlus;
	/**
	 * An agreed number of days after the Trade date (T) used to define standard
	 * timeframes e.g T+3 settlement period.
	 * 
	 * Where = T is the date that the price is applied to a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmTradePlus
	 * TimeFrame.mmTradePlus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TimeFrame4Choice
	 * TimeFrame4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TPlus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePlus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period. \n\nWhere = T is the date that the price is applied to a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradePlus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TimeFrame.mmTradePlus;
			componentContext_lazy = () -> TimeFrame4Choice.mmObject();
			isDerived = false;
			xmlTag = "TPlus";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradePlus";
			definition = "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period. \n\nWhere = T is the date that the price is applied to a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number renunciationPlus;
	/**
	 * An agreed number of days after the renunciation of title documents are
	 * received used to define standard timeframes in Redemption e.g R+3
	 * Redemption settlement cycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmRenunciationPlus
	 * TimeFrame.mmRenunciationPlus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TimeFrame4Choice
	 * TimeFrame4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RPlus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenunciationPlus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days after the renunciation of title documents are received used to define standard timeframes in Redemption e.g R+3 Redemption settlement cycle."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRenunciationPlus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TimeFrame.mmRenunciationPlus;
			componentContext_lazy = () -> TimeFrame4Choice.mmObject();
			isDerived = false;
			xmlTag = "RPlus";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenunciationPlus";
			definition = "An agreed number of days after the renunciation of title documents are received used to define standard timeframes in Redemption e.g R+3 Redemption settlement cycle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TimeFrame4Choice.mmTradePlus, TimeFrame4Choice.mmRenunciationPlus);
				trace_lazy = () -> TimeFrame.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TimeFrame4Choice";
				definition = "TimeFrame elements that define a period as number of days after an activity.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TPlus", required = true)
	public Number getTradePlus() {
		return tradePlus;
	}

	public void setTradePlus(Number tradePlus) {
		this.tradePlus = tradePlus;
	}

	@XmlElement(name = "RPlus", required = true)
	public Number getRenunciationPlus() {
		return renunciationPlus;
	}

	public void setRenunciationPlus(Number renunciationPlus) {
		this.renunciationPlus = renunciationPlus;
	}
}